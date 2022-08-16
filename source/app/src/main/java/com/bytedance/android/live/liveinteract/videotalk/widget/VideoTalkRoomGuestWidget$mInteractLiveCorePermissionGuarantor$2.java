package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VideoTalkRoomGuestWidget$mInteractLiveCorePermissionGuarantor$2 extends Lambda implements Function0<C5001e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VideoTalkRoomGuestWidget this$0;

    static {
        Covode.recordClassIndex(30700);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkRoomGuestWidget$mInteractLiveCorePermissionGuarantor$2(VideoTalkRoomGuestWidget videoTalkRoomGuestWidget) {
        super(0);
        this.this$0 = videoTalkRoomGuestWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.liveinteract.voicechat.b.e] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5001e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C5001e c5001e = new C5001e();
        c5001e.LIZ(this.this$0.LJJIL);
        return c5001e;
    }
}
