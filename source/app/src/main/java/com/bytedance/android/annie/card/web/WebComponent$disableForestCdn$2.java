package com.bytedance.android.annie.card.web;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC90724Lok;
import p003X.C90746Lp6;
import p003X.POY;

/* loaded from: classes7.dex */
public final class WebComponent$disableForestCdn$2 extends Lambda implements Function0<Boolean> {
    public static final WebComponent$disableForestCdn$2 INSTANCE = new WebComponent$disableForestCdn$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10688);
    }

    public WebComponent$disableForestCdn$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], POY.LIZIZ, POY.LIZ, false, 7);
            if (proxy2.isSupported) {
                z = ((Boolean) proxy2.result).booleanValue();
            } else {
                C90746Lp6<Integer> c90746Lp6 = AbstractC90724Lok.LJJJJZ;
                Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
                if (c90746Lp6.LIZ().intValue() % 2 != 0) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
