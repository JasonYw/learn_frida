package com.baichuan.nb_trade.p186c;

import android.text.TextUtils;
import com.alibaba.p052a.p053a.C0855a;
import com.baichuan.nb_trade.utils.C2458b;
import com.bytedance.covode.number.Covode;
import com.p3039ut.mini.UTAnalytics;
import com.p3039ut.mini.UTHitBuilders;
import com.p3039ut.mini.UTTracker;
import com.p3039ut.mini.core.sign.UTSecuritySDKRequestAuthentication;
import com.p3039ut.mini.internal.UTTeamWork;
import java.util.Map;
import p003X.V4I;
import p003X.V4K;

/* renamed from: com.baichuan.nb_trade.c.b */
/* loaded from: classes13.dex */
public final class C2450b extends AbstractC2449a {
    public static C2450b LIZIZ;
    public boolean LIZ;

    /* renamed from: com.baichuan.nb_trade.c.b$a */
    /* loaded from: classes13.dex */
    public class C2451a {
        public int LIZ;

        static {
            Covode.recordClassIndex(9459);
        }

        public C2451a(C2450b c2450b, int i) {
            this.LIZ = i;
        }
    }

    static {
        Covode.recordClassIndex(9458);
    }

    public static synchronized C2450b LIZ() {
        C2450b c2450b;
        synchronized (C2450b.class) {
            if (LIZIZ == null) {
                LIZIZ = new C2450b();
            }
            c2450b = LIZIZ;
        }
        return c2450b;
    }

    public final synchronized C2451a LIZIZ() {
        if (this.LIZ) {
            return new C2451a(this, 2);
        } else if (V4K.f13706LJ == null) {
            return new C2451a(this, 1);
        } else if (!LIZJ()) {
            return new C2451a(this, 3);
        } else {
            this.LIZ = true;
            return new C2451a(this, 0);
        }
    }

    private boolean LIZJ() {
        try {
            UTAnalytics.getInstance().setContext(V4K.f13706LJ);
            UTAnalytics.getInstance().setAppApplicationInstance(V4K.f13706LJ);
            UTAnalytics.getInstance().setRequestAuthentication(new UTSecuritySDKRequestAuthentication(V4K.LIZ(), ""));
            if (V4K.LIZIZ()) {
                UTAnalytics.getInstance().turnOnDebug();
                C0855a.m20532a(true);
            }
            UTAnalytics.getInstance().turnOffAutoPageTrack();
            UTTracker tracker = UTAnalytics.getInstance().getTracker("aliTradeLiteSdk");
            if (tracker != null) {
                tracker.setGlobalProperty("sdk_version", V4K.LJFF);
            }
            return true;
        } catch (Throwable unused) {
            C0855a.m20532a(false);
            UTTeamWork.getInstance().turnOffRealTimeDebug();
            return false;
        }
    }

    @Override // com.baichuan.nb_trade.p186c.AbstractC2449a
    public final void LIZ(String str, String str2, Map<String, String> map) {
        if (V4I.LIZ().LIZIZ() == null) {
            C2458b.LIZ();
            C2458b.LIZ("lite_baichuan_config");
        }
        if (V4K.LIZIZ()) {
            StringBuilder sb = new StringBuilder("业务埋点信息为: trackId = ");
            sb.append("aliTradeLiteSdk");
            sb.append("\n label = ");
            sb.append(str);
            sb.append("\n page = ");
            sb.append(str2);
            sb.append("\n time = 60");
            sb.append("\n prop = ");
            sb.append(map);
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
        uTCustomHitBuilder.setDurationOnEvent(60L);
        uTCustomHitBuilder.setEventPage(str2);
        uTCustomHitBuilder.setProperties(map);
        Map<String, String> build = uTCustomHitBuilder.build();
        TextUtils.isEmpty("aliTradeLiteSdk");
        UTTracker tracker = UTAnalytics.getInstance().getTracker("aliTradeLiteSdk");
        if (tracker != null) {
            tracker.send(build);
        }
    }
}
