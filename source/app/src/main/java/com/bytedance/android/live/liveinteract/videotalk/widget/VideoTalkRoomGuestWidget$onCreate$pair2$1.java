package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.android.live.liveinteract.videotalk.C4923e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTalkRoomGuestWidget$onCreate$pair2$1 extends FunctionReferenceImpl implements Function0<C4923e> {
    public static final VideoTalkRoomGuestWidget$onCreate$pair2$1 INSTANCE = new VideoTalkRoomGuestWidget$onCreate$pair2$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30707);
    }

    public VideoTalkRoomGuestWidget$onCreate$pair2$1() {
        super(0, C4923e.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.videotalk.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4923e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4923e();
    }
}
