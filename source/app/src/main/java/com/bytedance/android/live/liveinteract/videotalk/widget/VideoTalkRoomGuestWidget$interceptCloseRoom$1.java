package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VideoTalkRoomGuestWidget$interceptCloseRoom$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Runnable $runnable;
    public final /* synthetic */ VideoTalkRoomGuestWidget this$0;

    static {
        Covode.recordClassIndex(30694);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkRoomGuestWidget$interceptCloseRoom$1(VideoTalkRoomGuestWidget videoTalkRoomGuestWidget, Runnable runnable) {
        super(0);
        this.this$0 = videoTalkRoomGuestWidget;
        this.$runnable = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJIIJ = true;
            Runnable runnable = this.$runnable;
            if (runnable != null) {
                runnable.run();
            }
        }
        return Unit.INSTANCE;
    }
}
