package com.bytedance.android.live.lynx.components;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class LiveLynxFragment$handleNestedScrollWithVp$vp$1 extends Lambda implements Function1<View, Boolean> {
    public static final LiveLynxFragment$handleNestedScrollWithVp$vp$1 INSTANCE = new LiveLynxFragment$handleNestedScrollWithVp$vp$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32182);
    }

    public LiveLynxFragment$handleNestedScrollWithVp$vp$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(View view) {
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(view);
            z = view instanceof ViewPager;
        }
        return Boolean.valueOf(z);
    }
}
