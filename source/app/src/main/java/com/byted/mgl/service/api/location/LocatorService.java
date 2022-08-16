package com.byted.mgl.service.api.location;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.service.IBdpService;

/* loaded from: classes19.dex */
public interface LocatorService extends IBdpService {
    static {
        Covode.recordClassIndex(9792);
    }

    Locator getLocationImpl(Context context);
}
