package com.bytedance.android.live.browser;

import android.view.ViewParent;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class AnnieInitHelper$createWebConfig$2$1 extends Lambda implements Function1<ViewParent, Boolean> {
    public static final AnnieInitHelper$createWebConfig$2$1 INSTANCE = new AnnieInitHelper$createWebConfig$2$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21862);
    }

    public AnnieInitHelper$createWebConfig$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(ViewParent viewParent) {
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewParent}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(viewParent);
            z = viewParent instanceof LiveVerticalViewPager;
        }
        return Boolean.valueOf(z);
    }
}
