package com.amap.api.maps2d;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.interfaces.IAMap;
import com.amap.api.mapcore2d.C1569cm;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.Circle;
import com.amap.api.maps2d.model.CircleOptions;
import com.amap.api.maps2d.model.GroundOverlay;
import com.amap.api.maps2d.model.GroundOverlayOptions;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.MyLocationStyle;
import com.amap.api.maps2d.model.Polygon;
import com.amap.api.maps2d.model.PolygonOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.maps2d.model.RuntimeRemoteException;
import com.amap.api.maps2d.model.Text;
import com.amap.api.maps2d.model.TextOptions;
import com.amap.api.maps2d.model.TileOverlay;
import com.amap.api.maps2d.model.TileOverlayOptions;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public final class AMap {

    /* renamed from: a */
    public final IAMap f24072a;

    /* renamed from: b */
    public UiSettings f24073b;

    /* renamed from: c */
    public Projection f24074c;

    /* loaded from: classes19.dex */
    public interface CancelableCallback {
        static {
            Covode.recordClassIndex(5334);
        }

        void onCancel();

        void onFinish();
    }

    /* loaded from: classes19.dex */
    public interface InfoWindowAdapter {
        static {
            Covode.recordClassIndex(5335);
        }

        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    /* loaded from: classes19.dex */
    public interface OnCacheRemoveListener {
        static {
            Covode.recordClassIndex(5336);
        }

        void onRemoveCacheFinish(boolean z);
    }

    /* loaded from: classes19.dex */
    public interface OnCameraChangeListener {
        static {
            Covode.recordClassIndex(5337);
        }

        void onCameraChange(CameraPosition cameraPosition);

        void onCameraChangeFinish(CameraPosition cameraPosition);
    }

    /* loaded from: classes19.dex */
    public interface OnInfoWindowClickListener {
        static {
            Covode.recordClassIndex(5338);
        }

        void onInfoWindowClick(Marker marker);
    }

    /* loaded from: classes19.dex */
    public interface OnMapClickListener {
        static {
            Covode.recordClassIndex(5339);
        }

        void onMapClick(LatLng latLng);
    }

    /* loaded from: classes19.dex */
    public interface OnMapLoadedListener {
        static {
            Covode.recordClassIndex(5340);
        }

        void onMapLoaded();
    }

    /* loaded from: classes19.dex */
    public interface OnMapLongClickListener {
        static {
            Covode.recordClassIndex(5341);
        }

        void onMapLongClick(LatLng latLng);
    }

    /* loaded from: classes19.dex */
    public interface OnMapScreenShotListener {
        static {
            Covode.recordClassIndex(5342);
        }

        void onMapScreenShot(Bitmap bitmap);
    }

    /* loaded from: classes19.dex */
    public interface OnMapTouchListener {
        static {
            Covode.recordClassIndex(5343);
        }

        void onTouch(MotionEvent motionEvent);
    }

    /* loaded from: classes19.dex */
    public interface OnMarkerClickListener {
        static {
            Covode.recordClassIndex(5344);
        }

        boolean onMarkerClick(Marker marker);
    }

    /* loaded from: classes19.dex */
    public interface OnMarkerDragListener {
        static {
            Covode.recordClassIndex(5345);
        }

        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    /* loaded from: classes19.dex */
    public interface OnMyLocationChangeListener {
        static {
            Covode.recordClassIndex(5346);
        }

        void onMyLocationChange(Location location);
    }

    static {
        Covode.recordClassIndex(5333);
    }

    public static String getVersion() {
        return "6.0.0";
    }

    /* renamed from: a */
    private IAMap m17141a() {
        return this.f24072a;
    }

    public final void invalidate() {
        postInvalidate();
    }

    public final void postInvalidate() {
        m17141a().AMapInvalidate();
    }

    public final float getMaxZoomLevel() {
        return m17141a().getMaxZoomLevel();
    }

    public final float getMinZoomLevel() {
        return m17141a().getMinZoomLevel();
    }

    public final float getScalePerPixel() {
        return m17141a().getScalePerPixel();
    }

    public final void removecache() {
        try {
            this.f24072a.removecache();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "removecache");
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return m17141a().getCameraPosition();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMap", "getCameraPosition");
            throw new RuntimeRemoteException(e);
        }
    }

    public final List<Marker> getMapScreenMarkers() {
        try {
            return this.f24072a.getMapScreenMarkers();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "getMapScreenaMarkers");
            return null;
        }
    }

    public final int getMapType() {
        try {
            return m17141a().getMapType();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMap", "getMapType");
            throw new RuntimeRemoteException(e);
        }
    }

    public final Location getMyLocation() {
        try {
            return m17141a().getMyLocation();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "getMyLocation");
            return null;
        }
    }

    public final Projection getProjection() {
        try {
            if (this.f24074c == null) {
                this.f24074c = m17141a().getAMapProjection();
            }
            return this.f24074c;
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "getProjection");
            return null;
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.f24073b == null) {
                this.f24073b = m17141a().getAMapUiSettings();
            }
            return this.f24073b;
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "getUiSettings");
            return null;
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return m17141a().isMyLocationEnabled();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "isMyLocationEnabled");
            return false;
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return m17141a().isTrafficEnabled();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMap", "isTrafficEnable");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            m17141a().stopAnimation();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "stopAnimation");
        }
    }

    public final void clear() {
        try {
            if (m17141a() != null) {
                m17141a().clear();
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMap", "clear");
            throw new RuntimeRemoteException(e);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "clear");
        }
    }

    public AMap(IAMap iAMap) {
        this.f24072a = iAMap;
    }

    public final void setMyLocationType(int i) {
        try {
            m17141a().setMyLocationType(i);
        } catch (Throwable unused) {
        }
    }

    public final void getMapScreenShot(OnMapScreenShotListener onMapScreenShotListener) {
        m17141a().getMapScreenShot(onMapScreenShotListener);
        invalidate();
    }

    public final void setMapLanguage(String str) {
        try {
            this.f24072a.setMapLanguage(str);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setMapLanguage");
        }
    }

    public final void setOnMapTouchListener(OnMapTouchListener onMapTouchListener) {
        try {
            this.f24072a.setOnMapTouchListener(onMapTouchListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnMapTouchListener");
        }
    }

    public final Circle addCircle(CircleOptions circleOptions) {
        try {
            return m17141a().addCircle(circleOptions);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "addCircle");
            return null;
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        try {
            return m17141a().addGroundOverlay(groundOverlayOptions);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "addGroundOverlay");
            return null;
        }
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        try {
            return m17141a().addMarker(markerOptions);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "addMarker");
            return null;
        }
    }

    public final Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
            return m17141a().addPolygon(polygonOptions);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "addPolygon");
            return null;
        }
    }

    public final Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
            return m17141a().addPolyline(polylineOptions);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "addPolyline");
            return null;
        }
    }

    public final Text addText(TextOptions textOptions) {
        try {
            return this.f24072a.addText(textOptions);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "addText");
            return null;
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        try {
            return m17141a().addTileOverlay(tileOverlayOptions);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMap", "addtileOverlay");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        try {
            m17141a().animateCamera(cameraUpdate);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "animateCamera");
        }
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        try {
            m17141a().moveCamera(cameraUpdate);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "moveCamera");
        }
    }

    public final void removecache(OnCacheRemoveListener onCacheRemoveListener) {
        try {
            this.f24072a.removecache(onCacheRemoveListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "removecache");
        }
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        try {
            m17141a().setInfoWindowAdapter(infoWindowAdapter);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setInfoWindowAdapter");
        }
    }

    public final void setLocationSource(LocationSource locationSource) {
        try {
            m17141a().setLocationSource(locationSource);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setLocationSource");
        }
    }

    public final void setMapType(int i) {
        try {
            m17141a().setMapType(i);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMap", "setMapType");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            m17141a().setMyLocationEnabled(z);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setMyLocationEnabled");
        }
    }

    public final void setMyLocationRotateAngle(float f) {
        try {
            this.f24072a.setMyLocationRotateAngle(f);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMap", "setMyLocationRoteteAngle");
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        try {
            m17141a().setMyLocationStyle(myLocationStyle);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setMyLocationStyle");
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        try {
            m17141a().setOnCameraChangeListener(onCameraChangeListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnCameraChangeListener");
        }
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        try {
            m17141a().setOnInfoWindowClickListener(onInfoWindowClickListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnInfoWindowClickListener");
        }
    }

    public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        try {
            m17141a().setOnMapClickListener(onMapClickListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnMapClickListener");
        }
    }

    public final void setOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        try {
            m17141a().setOnMaploadedListener(onMapLoadedListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnMapLoadedListener");
        }
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        try {
            m17141a().setOnMapLongClickListener(onMapLongClickListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnMapLongClickListener");
        }
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        try {
            m17141a().setOnMarkerClickListener(onMarkerClickListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnMarkerClickListener");
        }
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        try {
            m17141a().setOnMarkerDragListener(onMarkerDragListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnMarkerDragListener");
        }
    }

    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onMyLocationChangeListener) {
        try {
            m17141a().setOnMyLocationChangeListener(onMyLocationChangeListener);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setOnMyLocaitonChangeListener");
        }
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            m17141a().setTrafficEnabled(z);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "setTradficEnabled");
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        try {
            m17141a().animateCameraWithCallback(cameraUpdate, cancelableCallback);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "animateCamera");
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, long j, CancelableCallback cancelableCallback) {
        try {
            m17141a().animateCameraWithDurationAndCallback(cameraUpdate, j, cancelableCallback);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMap", "animateCamera");
        }
    }
}
