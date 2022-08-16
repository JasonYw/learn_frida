package com.bytedance.android.live.broadcast.videocast;

import com.bytedance.android.livesdk.chatroom.C5929dx;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VideoPlayControlWidget$onLoad$1 extends Lambda implements Function0<C5929dx> {
    public static final VideoPlayControlWidget$onLoad$1 INSTANCE = new VideoPlayControlWidget$onLoad$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18068);
    }

    public VideoPlayControlWidget$onLoad$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdk.chatroom.dx, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5929dx mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C5929dx();
    }
}
