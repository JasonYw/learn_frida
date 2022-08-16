package com.amap.api.interfaces;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.maps2d.AMapOptions;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IMapFragmentDelegate {
    static {
        Covode.recordClassIndex(4975);
    }

    IAMap getMap();

    boolean isReady();

    void onCreate(Bundle bundle);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onInflate(Activity activity, AMapOptions aMapOptions, Bundle bundle);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void setContext(Context context);

    void setOptions(AMapOptions aMapOptions);
}
