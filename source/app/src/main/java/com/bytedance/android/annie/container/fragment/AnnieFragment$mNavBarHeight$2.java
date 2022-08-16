package com.bytedance.android.annie.container.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89748LXq;

/* loaded from: classes5.dex */
public final class AnnieFragment$mNavBarHeight$2 extends Lambda implements Function0<Integer> {
    public static final AnnieFragment$mNavBarHeight$2 INSTANCE = new AnnieFragment$mNavBarHeight$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10751);
    }

    public AnnieFragment$mNavBarHeight$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Integer) proxy.result).intValue();
        } else {
            LIZ = C89748LXq.LIZIZ.LIZ(44.0f);
        }
        return Integer.valueOf(LIZ);
    }
}
