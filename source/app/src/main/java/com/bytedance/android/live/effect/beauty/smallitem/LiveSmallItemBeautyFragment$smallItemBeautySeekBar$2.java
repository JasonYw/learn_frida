package com.bytedance.android.live.effect.beauty.smallitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.base.AdjustPercentBar;
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
public final class LiveSmallItemBeautyFragment$smallItemBeautySeekBar$2 extends Lambda implements Function0<AdjustPercentBar> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86713KEx this$0;

    static {
        Covode.recordClassIndex(24418);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSmallItemBeautyFragment$smallItemBeautySeekBar$2(C86713KEx c86713KEx) {
        super(0);
        this.this$0 = c86713KEx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AdjustPercentBar mo30099invoke() {
        AdjustPercentBar adjustPercentBar;
        MethodCollector.m14708i(1652);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            adjustPercentBar = proxy.result;
        } else if (this.this$0.LIZLLL != null) {
            AdjustPercentBar adjustPercentBar2 = this.this$0.LIZLLL;
            Intrinsics.checkNotNull(adjustPercentBar2);
            MethodCollector.m14707o(1652);
            return adjustPercentBar2;
        } else {
            View inflate = LayoutInflater.from(this.this$0.getContext()).inflate(2131699110, (ViewGroup) null);
            adjustPercentBar = inflate;
            if (inflate == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.effect.base.AdjustPercentBar");
                MethodCollector.m14707o(1652);
                throw nullPointerException;
            }
        }
        MethodCollector.m14707o(1652);
        return adjustPercentBar;
    }
}
