package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.gf */
/* loaded from: classes19.dex */
public final class HandlerC1732gf extends Handler {

    /* renamed from: a */
    public C1729gd f23682a;

    static {
        Covode.recordClassIndex(5280);
    }

    public HandlerC1732gf(Looper looper, C1729gd c1729gd) {
        super(looper);
        this.f23682a = c1729gd;
    }

    public HandlerC1732gf(C1729gd c1729gd) {
        this.f23682a = c1729gd;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            try {
                if (this.f23682a == null) {
                    return;
                }
                this.f23682a.m17475a((Inner_3dMap_location) message.obj);
            } catch (Throwable th) {
                C1752gu.m17302a(th, "ClientResultHandler", "RESULT_LOCATION_FINISH");
            }
        }
    }
}
