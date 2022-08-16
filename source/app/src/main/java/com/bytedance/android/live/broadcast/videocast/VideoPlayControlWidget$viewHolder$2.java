package com.bytedance.android.live.broadcast.videocast;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VideoPlayControlWidget$viewHolder$2 extends Lambda implements Function0<C3251d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VideoPlayControlWidget this$0;

    static {
        Covode.recordClassIndex(18071);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayControlWidget$viewHolder$2(VideoPlayControlWidget videoPlayControlWidget) {
        super(0);
        this.this$0 = videoPlayControlWidget;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.videocast.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3251d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3251d(this.this$0);
    }
}
