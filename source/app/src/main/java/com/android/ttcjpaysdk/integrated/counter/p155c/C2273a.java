package com.android.ttcjpaysdk.integrated.counter.p155c;

import android.content.Context;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC137108cbw;
import p003X.C106862S5w;
import p003X.C137134ccM;
import p003X.C137228cds;
import p003X.CountDownTimerC137100cbo;
import p003X.DialogC137460chc;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.c.a */
/* loaded from: classes17.dex */
public final class C2273a {
    public static ChangeQuickRedirect LIZ;
    public CountDownTimerC137100cbo LIZIZ;
    public DialogC137460chc LIZJ;
    public AbstractC137108cbw LIZLLL;

    /* renamed from: LJ */
    public final Context f25500LJ;

    static {
        Covode.recordClassIndex(7552);
    }

    public static boolean LIZ() {
        C137134ccM c137134ccM;
        C137228cds c137228cds;
        C2278i c2278i = C2272a.LIZIZ;
        if (c2278i != null && (c137134ccM = c2278i.data) != null && (c137228cds = c137134ccM.cashdesk_show_conf) != null) {
            return c137228cds.whether_show_left_time;
        }
        return false;
    }

    public C2273a(Context context) {
        C106862S5w.LIZ(context);
        this.f25500LJ = context;
    }

    public final String LIZ(Context context, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, new Long(j)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        String string = context.getResources().getString(2131561914, simpleDateFormat.format(Long.valueOf(j)));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
