package com.bytedance.android.annie.monitor.web;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC90724Lok;
import p003X.C90746Lp6;

/* loaded from: classes7.dex */
public final class AnnieWebMonitorCallback$Companion$annieMonitorAbConfig$2 extends Lambda implements Function0<Map<String, String>> {
    public static final AnnieWebMonitorCallback$Companion$annieMonitorAbConfig$2 INSTANCE = new AnnieWebMonitorCallback$Companion$annieMonitorAbConfig$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10876);
    }

    public AnnieWebMonitorCallback$Companion$annieMonitorAbConfig$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<String, String> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C90746Lp6<Map<String, String>> c90746Lp6 = AbstractC90724Lok.LJJJI;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        return c90746Lp6.LIZ();
    }
}
