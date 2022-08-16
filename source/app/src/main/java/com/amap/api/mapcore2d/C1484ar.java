package com.amap.api.mapcore2d;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.interfaces.IAMap;
import com.amap.api.interfaces.IMapFragmentDelegate;
import com.amap.api.maps2d.AMapOptions;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.UiSettings;
import com.amap.api.maps2d.model.CameraPosition;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ar */
/* loaded from: classes19.dex */
public class C1484ar implements IMapFragmentDelegate {

    /* renamed from: a */
    public static volatile Context f22704a;

    /* renamed from: b */
    public IAMap f22705b;

    /* renamed from: c */
    public AMapOptions f22706c;

    static {
        Covode.recordClassIndex(5032);
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public boolean isReady() {
        return false;
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onDestroyView() {
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onLowMemory() {
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onPause() {
        IAMap iAMap = this.f22705b;
        if (iAMap != null) {
            iAMap.onPause();
        }
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onResume() {
        IAMap iAMap = this.f22705b;
        if (iAMap != null) {
            iAMap.onResume();
        }
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public IAMap getMap() {
        if (this.f22705b == null) {
            if (f22704a != null) {
                m18558a();
                this.f22705b = new GestureDetector$OnDoubleTapListenerC1507b(f22704a);
            } else {
                throw new NullPointerException("Context 为 null 请在地图调用之前 使用 MapsInitializer.initialize(Context paramContext) 来设置Context");
            }
        }
        return this.f22705b;
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onDestroy() {
        if (getMap() != null) {
            getMap().clear();
            getMap().destroy();
        }
        setContext(null);
    }

    /* renamed from: a */
    public void m18558a() {
        int i = f22704a.getResources().getDisplayMetrics().densityDpi;
        C1771q.f24023l = i;
        if (i > 320) {
            if (i <= 480) {
                C1771q.f24021j = 384;
            } else {
                C1771q.f24021j = 512;
            }
        } else {
            C1771q.f24021j = 256;
        }
        if (i <= 120) {
            C1771q.f24012a = 0.5f;
        } else if (i <= 160) {
            C1771q.f24012a = 0.6f;
            C1771q.m17201a(18);
        } else if (i <= 240) {
            C1771q.f24012a = 0.87f;
        } else if (i <= 320) {
            C1771q.f24012a = 1.0f;
        } else if (i <= 480) {
            C1771q.f24012a = 1.5f;
        } else {
            C1771q.f24012a = 1.8f;
        }
        if (C1771q.f24012a <= 0.6f) {
            C1771q.f24014c = 18;
        }
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void setContext(Context context) {
        m18557a(context);
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void setOptions(AMapOptions aMapOptions) {
        this.f22706c = aMapOptions;
    }

    /* renamed from: a */
    private void m18557a(Context context) {
        if (context != null) {
            f22704a = context.getApplicationContext();
        }
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onCreate(Bundle bundle) {
        C1567ck.m18164a("MapFragmentDelegateImp", "onCreate", 113);
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f22705b != null) {
            if (this.f22706c == null) {
                this.f22706c = new AMapOptions();
            }
            AMapOptions aMapOptions = this.f22706c;
            aMapOptions.camera(getMap().getCameraPosition());
            this.f22706c = aMapOptions;
            if (bundle != null) {
                try {
                    Parcel obtain = Parcel.obtain();
                    this.f22706c.writeToParcel(obtain, 0);
                    bundle.putByteArray("MapOptions", obtain.marshall());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m18556a(AMapOptions aMapOptions) {
        if (aMapOptions != null && this.f22705b != null) {
            CameraPosition camera = aMapOptions.getCamera();
            if (camera != null) {
                this.f22705b.moveCamera(new CameraUpdate(C1764m.m17220a(camera.target, camera.zoom, camera.bearing, camera.tilt)));
            }
            UiSettings aMapUiSettings = this.f22705b.getAMapUiSettings();
            aMapUiSettings.setScrollGesturesEnabled(aMapOptions.getScrollGesturesEnabled().booleanValue());
            aMapUiSettings.setZoomControlsEnabled(aMapOptions.getZoomControlsEnabled().booleanValue());
            aMapUiSettings.setZoomGesturesEnabled(aMapOptions.getZoomGesturesEnabled().booleanValue());
            aMapUiSettings.setCompassEnabled(aMapOptions.getCompassEnabled().booleanValue());
            aMapUiSettings.setScaleControlsEnabled(aMapOptions.getScaleControlsEnabled().booleanValue());
            aMapUiSettings.setLogoPosition(aMapOptions.getLogoPosition());
            this.f22705b.setMapType(aMapOptions.getMapType());
            this.f22705b.setZOrderOnTop(aMapOptions.getZOrderOnTop().booleanValue());
        }
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public void onInflate(Activity activity, AMapOptions aMapOptions, Bundle bundle) {
        setContext(activity);
        this.f22706c = aMapOptions;
    }

    @Override // com.amap.api.interfaces.IMapFragmentDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        byte[] byteArray;
        if (this.f22705b == null) {
            if (f22704a == null && layoutInflater != null) {
                setContext(layoutInflater.getContext().getApplicationContext());
            }
            if (f22704a != null) {
                m18558a();
                this.f22705b = new GestureDetector$OnDoubleTapListenerC1507b(f22704a);
            } else {
                throw new NullPointerException("Context 为 null 请在地图调用之前 使用 MapsInitializer.initialize(Context paramContext) 来设置Context");
            }
        }
        try {
            if (this.f22706c == null && bundle != null && (byteArray = bundle.getByteArray("MapOptions")) != null) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                this.f22706c = AMapOptions.CREATOR.mo25274createFromParcel(obtain);
            }
            m18556a(this.f22706c);
            C1567ck.m18164a("MapFragmentDelegateImp", "onCreateView", 113);
        } catch (Throwable unused) {
        }
        return this.f22705b.getView();
    }
}
