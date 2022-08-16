package com.amap.api.interfaces;

import android.location.Location;
import android.os.Handler;
import android.view.View;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.LocationSource;
import com.amap.api.maps2d.Projection;
import com.amap.api.maps2d.UiSettings;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.Circle;
import com.amap.api.maps2d.model.CircleOptions;
import com.amap.api.maps2d.model.GroundOverlay;
import com.amap.api.maps2d.model.GroundOverlayOptions;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.MyLocationStyle;
import com.amap.api.maps2d.model.Polygon;
import com.amap.api.maps2d.model.PolygonOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.maps2d.model.Text;
import com.amap.api.maps2d.model.TextOptions;
import com.amap.api.maps2d.model.TileOverlay;
import com.amap.api.maps2d.model.TileOverlayOptions;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public interface IAMap {
    static {
        Covode.recordClassIndex(4972);
    }

    void AMapInvalidate();

    Circle addCircle(CircleOptions circleOptions);

    GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    Marker addMarker(MarkerOptions markerOptions);

    Polygon addPolygon(PolygonOptions polygonOptions);

    Polyline addPolyline(PolylineOptions polylineOptions);

    Text addText(TextOptions textOptions);

    TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(CameraUpdate cameraUpdate);

    void animateCameraWithCallback(CameraUpdate cameraUpdate, AMap.CancelableCallback cancelableCallback);

    void animateCameraWithDurationAndCallback(CameraUpdate cameraUpdate, long j, AMap.CancelableCallback cancelableCallback);

    void clear();

    void destroy();

    Projection getAMapProjection();

    UiSettings getAMapUiSettings();

    CameraPosition getCameraPosition();

    int getLogoPosition();

    Handler getMainHandler();

    LatLngBounds getMapBounds();

    int getMapHeight();

    List<Marker> getMapScreenMarkers();

    void getMapScreenShot(AMap.OnMapScreenShotListener onMapScreenShotListener);

    int getMapType();

    int getMapWidth();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    Location getMyLocation();

    AMap.OnCameraChangeListener getOnCameraChangeListener();

    float getScalePerPixel();

    View getView();

    float getZoomLevel();

    boolean isMyLocationEnabled();

    boolean isTrafficEnabled();

    void moveCamera(CameraUpdate cameraUpdate);

    void onPause();

    void onResume();

    void redrawInfoWindow();

    boolean removeGLOverlay(String str);

    boolean removeMarker(String str);

    void removecache();

    void removecache(AMap.OnCacheRemoveListener onCacheRemoveListener);

    void setInfoWindowAdapter(AMap.InfoWindowAdapter infoWindowAdapter);

    void setLocationSource(LocationSource locationSource);

    void setLogoPosition(int i);

    void setMapLanguage(String str);

    void setMapType(int i);

    void setMyLocationEnabled(boolean z);

    void setMyLocationRotateAngle(float f);

    void setMyLocationStyle(MyLocationStyle myLocationStyle);

    void setMyLocationType(int i);

    void setOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener);

    void setOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void setOnMapClickListener(AMap.OnMapClickListener onMapClickListener);

    void setOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener);

    void setOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener);

    void setOnMaploadedListener(AMap.OnMapLoadedListener onMapLoadedListener);

    void setOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener);

    void setOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener);

    void setOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener);

    void setTrafficEnabled(boolean z);

    void setZOrderOnTop(boolean z);

    void setZoomPosition(int i);

    void showCompassEnabled(boolean z);

    void showMyLocationButtonEnabled(boolean z);

    void showMyLocationOverlay(Location location);

    void showScaleEnabled(boolean z);

    void showZoomControlsEnabled(boolean z);

    void stopAnimation();
}
