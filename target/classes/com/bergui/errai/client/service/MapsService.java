package com.bergui.errai.client.service;

import com.google.gwt.ajaxloader.client.AjaxLoader;
import com.google.gwt.ajaxloader.client.AjaxLoader.AjaxLoaderOptions;
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.user.client.Window;
import com.google.maps.gwt.client.ControlPosition;
import com.google.maps.gwt.client.GoogleMap;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.MapOptions;
import com.google.maps.gwt.client.MapTypeId;
import com.google.maps.gwt.client.OverviewMapControlOptions;
import com.google.maps.gwt.client.ZoomControlOptions;
import com.google.maps.gwt.client.ZoomControlStyle;
import com.google.maps.gwt.client.places.Autocomplete;
import com.google.maps.gwt.client.places.Autocomplete.PlaceChangedHandler;
import com.google.maps.gwt.client.places.AutocompleteOptions;
import com.google.maps.gwt.client.places.PlaceResult;
import com.google.maps.gwt.client.places.PlacesService;


public class MapsService {

	private static GoogleMap map = null;// Map en cours d'utilisation

	private static final String API_VERSION = "3.14";

	private static final String API_NAME = "maps";

	private static final int ZOOM_DEFAULT = 2;

	private static final double LATITUDE_DEFAULT = 46.5;

	private static final double LONGITUDE_DEFAULT = 2;

	private static PlacesService placesService = null;

	public void initialize(Runnable callback) {
		AjaxLoaderOptions options = AjaxLoaderOptions.newInstance();
		options.setOtherParms("sensor=false&key=AIzaSyCUIwS-1YrR8SbK2bydzxpOEQKkQTOSvOA&libraries=places");
		options.setLanguage("fr");

		AjaxLoader.loadApi(API_NAME, API_VERSION, callback, options);
	}

	public void initialize() {
		MapOptions myOptions = MapOptions.create();

		myOptions.setZoom(ZOOM_DEFAULT);
		myOptions.setStreetViewControl(false);

		OverviewMapControlOptions overviewMapControlOptions = OverviewMapControlOptions
				.create();
		overviewMapControlOptions.setOpened(true);

		myOptions.setMapTypeControl(true);
		myOptions.setMapTypeId(MapTypeId.ROADMAP);
		// myOptions.setPanControl(false);
		// myOptions.setZoomControl(false);
		myOptions.setOverviewMapControl(true);
		myOptions.setOverviewMapControlOptions(overviewMapControlOptions);

		ZoomControlOptions zoomControlOptions = ZoomControlOptions.create();
		zoomControlOptions.setPosition(ControlPosition.RIGHT_CENTER);
		zoomControlOptions.setStyle(ZoomControlStyle.SMALL);

		myOptions.setZoomControlOptions(zoomControlOptions);

		Element mapDiv = Document.get().getElementById("map_canvas");

		map = GoogleMap.create(mapDiv, myOptions);

		placesService = PlacesService.create(map);
		
		initAutocomplete("textBox_autocomplete");

		init();
	}

	public void init() {
		LatLng latLng = LatLng.create(LATITUDE_DEFAULT, LONGITUDE_DEFAULT);
		map.setZoom(ZOOM_DEFAULT);
		map.setCenter(latLng);
	}

	private void initAutocomplete(final String fieldId) {

		try {
			AutocompleteOptions autocompleteOptions = AutocompleteOptions
					.create();

			JsArrayString jsArrayString = (JsArrayString) JsArrayString
					.createArray();

			
				jsArrayString.push("(regions)");
				autocompleteOptions.setTypes(jsArrayString);
			

			// autocompleteOptions.setBounds(map.getBounds());

			final Element textBox_searchDestination = Document.get()
					.getElementById(fieldId);
			final InputElement inputElement = InputElement
					.as(textBox_searchDestination);

			final Autocomplete autocomplete = Autocomplete.create(inputElement,
					autocompleteOptions);
			autocomplete.bindTo("bounds", map);

			autocomplete.addPlaceChangedListener(new PlaceChangedHandler() {

				@Override
				public void handle() {
					System.out
							.println("Maps.initAutocomplete - autocomplete.addPlaceChangedListener");

					PlaceResult placeResult = autocomplete.getPlace();

					if (placeResult.getId() != null) {

						// KO pour 3.exp
						try {
							map.fitBounds(placeResult.getGeometry()
									.getViewport());
						} catch (Exception e) {
							map.setZoom(17);
						}

						map.setCenter(placeResult.getGeometry().getLocation());

						if (fieldId.equals("textbox_autocomplete")) {
							// boundsInit = placeResult.getGeometry().getViewport();
							// zoomInit = Double.valueOf(map.getZoom()).intValue() -
							// 2;
						}
					}
				}
			});
		} catch (JavaScriptException e) {
			Window.alert("initAutocomplete - KO : " + e.getMessage());
		}
	}
}