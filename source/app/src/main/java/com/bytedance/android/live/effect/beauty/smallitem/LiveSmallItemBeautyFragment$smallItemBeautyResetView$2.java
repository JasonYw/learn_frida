package com.bytedance.android.live.effect.beauty.smallitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C86713KEx;

/* loaded from: classes22.dex */
public final class LiveSmallItemBeautyFragment$smallItemBeautyResetView$2 extends Lambda implements Function0<View> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86713KEx this$0;

    static {
        Covode.recordClassIndex(24417);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSmallItemBeautyFragment$smallItemBeautyResetView$2(C86713KEx c86713KEx) {
        super(0);
        this.this$0 = c86713KEx;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View mo30099invoke() {
        MethodCollector.m14708i(1651);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            ?? r0 = proxy.result;
            MethodCollector.m14707o(1651);
            return r0;
        } else if (this.this$0.LIZJ != null) {
            View view = this.this$0.LIZJ;
            Intrinsics.checkNotNull(view);
            MethodCollector.m14707o(1651);
            return view;
        } else {
            View inflate = LayoutInflater.from(this.this$0.getContext()).inflate(2131699109, (ViewGroup) null);
            MethodCollector.m14707o(1651);
            return inflate;
        }
    }
}
