package com.bytedance.android.live.broadcast.videocast;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VideoPlayControlWidget$videoCastContainer$2 extends Lambda implements Function0<ViewGroup> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VideoPlayControlWidget this$0;

    static {
        Covode.recordClassIndex(18070);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayControlWidget$videoCastContainer$2(VideoPlayControlWidget videoPlayControlWidget) {
        super(0);
        this.this$0 = videoPlayControlWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ViewGroup mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        View view = this.this$0.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view.getRootView().findViewById(2131191093);
    }
}
