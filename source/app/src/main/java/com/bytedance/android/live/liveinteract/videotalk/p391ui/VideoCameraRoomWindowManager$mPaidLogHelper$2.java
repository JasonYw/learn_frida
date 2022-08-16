package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.android.live.liveinteract.videotalk.utils.C4967h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C78538Gxg;
import p003X.C80643HqX;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoCameraRoomWindowManager$mPaidLogHelper$2 */
/* loaded from: classes3.dex */
public final class VideoCameraRoomWindowManager$mPaidLogHelper$2 extends Lambda implements Function0<C4967h> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80643HqX this$0;

    static {
        Covode.recordClassIndex(30453);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCameraRoomWindowManager$mPaidLogHelper$2(C80643HqX c80643HqX) {
        super(0);
        this.this$0 = c80643HqX;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.liveinteract.videotalk.utils.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4967h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4967h(this.this$0.LJIILL, C78538Gxg.LIZ(this.this$0.LJIILL));
    }
}
