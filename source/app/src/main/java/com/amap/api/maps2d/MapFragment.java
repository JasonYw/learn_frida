package com.amap.api.maps2d;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.interfaces.IAMap;
import com.amap.api.interfaces.IMapFragmentDelegate;
import com.amap.api.mapcore2d.C1484ar;
import com.amap.api.mapcore2d.C1569cm;
import com.amap.api.maps2d.model.RuntimeRemoteException;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class MapFragment extends Fragment {

    /* renamed from: a */
    public AMap f24092a;

    /* renamed from: b */
    public IMapFragmentDelegate f24093b;

    static {
        Covode.recordClassIndex(5359);
    }

    public static MapFragment newInstance() {
        return newInstance(new AMapOptions());
    }

    public IMapFragmentDelegate getMapFragmentDelegate() {
        if (this.f24093b == null) {
            this.f24093b = new C1484ar();
        }
        if (getActivity() != null) {
            this.f24093b.setContext(getActivity());
        }
        return this.f24093b;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        try {
            getMapFragmentDelegate().onDestroy();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onDestroy");
        }
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        try {
            getMapFragmentDelegate().onDestroyView();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onDestroyView");
        }
        super.onDestroyView();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        try {
            getMapFragmentDelegate().onLowMemory();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onLowMemory");
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        try {
            getMapFragmentDelegate().onPause();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onPause");
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        try {
            getMapFragmentDelegate().onResume();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onResume");
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
            if (this.f24092a == null) {
                this.f24092a = new AMap(map);
            }
            return this.f24092a;
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "getMap");
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static MapFragment newInstance(AMapOptions aMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        try {
            Parcel obtain = Parcel.obtain();
            aMapOptions.writeToParcel(obtain, 0);
            bundle.putByteArray("MapOptions", obtain.marshall());
        } catch (Throwable unused) {
        }
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getMapFragmentDelegate().onCreate(bundle);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onCreate");
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        try {
            getMapFragmentDelegate().onSaveInstanceState(bundle);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onSaveInstanceState");
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = getArguments();
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "MapFragment", "onCreateView");
                return null;
            }
        }
        return getMapFragmentDelegate().onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        try {
            getMapFragmentDelegate().onInflate(activity, new AMapOptions(), bundle);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "MapFragment", "onInflate");
        }
    }
}
