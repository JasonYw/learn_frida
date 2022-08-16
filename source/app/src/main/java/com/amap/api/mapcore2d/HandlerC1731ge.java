package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ge */
/* loaded from: classes19.dex */
public final class HandlerC1731ge extends Handler {

    /* renamed from: a */
    public C1729gd f23681a;

    static {
        Covode.recordClassIndex(5279);
    }

    public HandlerC1731ge() {
    }

    public HandlerC1731ge(Looper looper, C1729gd c1729gd) {
        super(looper);
        this.f23681a = c1729gd;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        switch (message.what) {
            case 1001:
                try {
                    this.f23681a.m17473a((Inner_3dMap_locationOption) message.obj);
                    return;
                } catch (Throwable th) {
                    th = th;
                    str = "ACTION_SET_OPTION";
                    break;
                }
            case 1002:
                try {
                    this.f23681a.m17474a((Inner_3dMap_locationListener) message.obj);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    str = "ACTION_SET_LISTENER";
                    break;
                }
            case 1003:
                try {
                    this.f23681a.m17471b((Inner_3dMap_locationListener) message.obj);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    str = "ACTION_REMOVE_LISTENER";
                    break;
                }
            case 1004:
                try {
                    this.f23681a.m17479a();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    str = "ACTION_START_LOCATION";
                    break;
                }
            case 1005:
                try {
                    this.f23681a.m17472b();
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    str = "ACTION_GET_LOCATION";
                    break;
                }
            case 1006:
                try {
                    this.f23681a.m17470c();
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    str = "ACTION_STOP_LOCATION";
                    break;
                }
            case 1007:
                try {
                    this.f23681a.m17469d();
                    return;
                } catch (Throwable th7) {
                    C1752gu.m17302a(th7, "ClientActionHandler", "ACTION_DESTROY");
                    return;
                }
            default:
                return;
        }
        C1752gu.m17302a(th, "ClientActionHandler", str);
    }
}
