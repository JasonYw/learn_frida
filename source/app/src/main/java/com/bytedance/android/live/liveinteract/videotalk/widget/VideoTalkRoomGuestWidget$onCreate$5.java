package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.android.live.liveinteract.voicechat.dialog.C5012e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VideoTalkRoomGuestWidget$onCreate$5 extends Lambda implements Function0<C5012e> {
    public static final VideoTalkRoomGuestWidget$onCreate$5 INSTANCE = new VideoTalkRoomGuestWidget$onCreate$5();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30704);
    }

    public VideoTalkRoomGuestWidget$onCreate$5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.voicechat.dialog.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5012e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C5012e();
    }
}
