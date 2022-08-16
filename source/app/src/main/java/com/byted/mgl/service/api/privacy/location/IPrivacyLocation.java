package com.byted.mgl.service.api.privacy.location;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public interface IPrivacyLocation {
    static {
        Covode.recordClassIndex(9803);
    }

    void requestLocationUpdates(LocationManager locationManager, String str, long j, float f, LocationListener locationListener, Looper looper, String str2);
}
