package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PreviewCustomBgWidget$startLiveViewModel$2 extends Lambda implements Function0<C3199v> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCustomBgWidget this$0;

    static {
        Covode.recordClassIndex(18494);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCustomBgWidget$startLiveViewModel$2(PreviewCustomBgWidget previewCustomBgWidget) {
        super(0);
        this.this$0 = previewCustomBgWidget;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.ViewModel, com.bytedance.android.live.broadcast.preview.v] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.live.broadcast.preview.v] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3199v mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        if (context != null) {
            return ViewModelProviders.m21142of((FragmentActivity) context).get(C3199v.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
