package com.bytedance.android.live.impl.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class TimeUtils$calendar$2 extends Lambda implements Function0<Calendar> {
    public static final TimeUtils$calendar$2 INSTANCE = new TimeUtils$calendar$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25046);
    }

    public TimeUtils$calendar$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Calendar, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Calendar mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return Calendar.getInstance();
    }
}
