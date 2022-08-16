package com.amap.api.maps2d;

import android.location.Location;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface LocationSource {

    /* loaded from: classes19.dex */
    public interface OnLocationChangedListener {
        static {
            Covode.recordClassIndex(5358);
        }

        void onLocationChanged(Location location);
    }

    static {
        Covode.recordClassIndex(5357);
    }

    void activate(OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
