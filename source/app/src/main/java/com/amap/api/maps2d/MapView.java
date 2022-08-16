package com.amap.api.maps2d;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amap.api.interfaces.IAMap;
import com.amap.api.interfaces.IMapFragmentDelegate;
import com.amap.api.mapcore2d.C1484ar;
import com.amap.api.mapcore2d.C1569cm;
import com.amap.api.mapcore2d.C1645ef;
import com.amap.api.maps2d.model.RuntimeRemoteException;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class MapView extends FrameLayout {

    /* renamed from: a */
    public IMapFragmentDelegate f24094a;

    /* renamed from: b */
    public AMap f24095b;

    static {
        Covode.recordClassIndex(5360);
    }

    public final void onDestroy() {
        try {
            getMapFragmentDelegate().onDestroy();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapView", "onDestroy");
        }
    }

    public final void onLowMemory() {
        try {
            getMapFragmentDelegate().onLowMemory();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapView", "onLowMemory");
        }
    }

    public final void onPause() {
        try {
            getMapFragmentDelegate().onPause();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapView", "onPause");
        }
    }

    public final void onResume() {
        try {
            getMapFragmentDelegate().onResume();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapView", "onResume");
        }
    }

    public AMap getMap() {
        IMapFragmentDelegate mapFragmentDelegate = getMapFragmentDelegate();
        if (mapFragmentDelegate == null) {
            return null;
        }
        try {
            IAMap map = mapFragmentDelegate.getMap();
            if (map == null) {
                return null;
            }
            if (this.f24095b == null) {
                this.f24095b = new AMap(map);
            }
            return this.f24095b;
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapView", "getMap");
            throw new RuntimeRemoteException(e);
        }
    }

    public IMapFragmentDelegate getMapFragmentDelegate() {
        try {
            if (this.f24094a == null) {
                this.f24094a = (IMapFragmentDelegate) C1645ef.m17719a(getContext(), C1569cm.m18161a(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", C1484ar.class, null, null);
            }
        } catch (Throwable unused) {
        }
        if (this.f24094a == null) {
            this.f24094a = new C1484ar();
        }
        return this.f24094a;
    }

    public MapView(Context context) {
        super(context);
        getMapFragmentDelegate().setContext(context);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        try {
            getMapFragmentDelegate().onSaveInstanceState(bundle);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapView", "onSaveInstanceState");
        }
    }

    public final void onCreate(Bundle bundle) {
        try {
            addView(getMapFragmentDelegate().onCreateView(null, null, bundle), new ViewGroup.LayoutParams(-1, -1));
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapView", "onCreate");
        } catch (Throwable th) {
            C1569cm.m18147a(th, "MapView", "onCreate");
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMapFragmentDelegate().setContext(context);
    }

    public MapView(Context context, AMapOptions aMapOptions) {
        super(context);
        getMapFragmentDelegate().setContext(context);
        getMapFragmentDelegate().setOptions(aMapOptions);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMapFragmentDelegate().setContext(context);
    }
}
