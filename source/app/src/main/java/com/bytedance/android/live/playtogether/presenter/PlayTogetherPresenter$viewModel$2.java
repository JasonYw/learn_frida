package com.bytedance.android.live.playtogether.presenter;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.playtogether.viewmodel.C5245d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LU8;

/* loaded from: classes5.dex */
public final class PlayTogetherPresenter$viewModel$2 extends Lambda implements Function0<C5245d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LU8 this$0;

    static {
        Covode.recordClassIndex(33065);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayTogetherPresenter$viewModel$2(LU8 lu8) {
        super(0);
        this.this$0 = lu8;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, com.bytedance.android.live.playtogether.viewmodel.d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.bytedance.android.live.playtogether.viewmodel.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5245d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.f8917LJ.context;
        if (context != null) {
            return ViewModelProviders.m21142of((FragmentActivity) context).get(C5245d.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
