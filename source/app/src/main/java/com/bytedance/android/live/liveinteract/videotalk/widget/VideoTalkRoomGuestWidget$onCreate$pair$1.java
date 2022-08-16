package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.android.live.liveinteract.videotalk.C4934g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTalkRoomGuestWidget$onCreate$pair$1 extends FunctionReferenceImpl implements Function0<C4934g> {
    public static final VideoTalkRoomGuestWidget$onCreate$pair$1 INSTANCE = new VideoTalkRoomGuestWidget$onCreate$pair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30706);
    }

    public VideoTalkRoomGuestWidget$onCreate$pair$1() {
        super(0, C4934g.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.videotalk.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4934g mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4934g();
    }
}
