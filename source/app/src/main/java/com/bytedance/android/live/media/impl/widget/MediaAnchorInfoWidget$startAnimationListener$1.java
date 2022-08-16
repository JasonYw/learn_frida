package com.bytedance.android.live.media.impl.widget;

import com.bytedance.android.livesdk.chatroom.p518ui.C6337ge;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class MediaAnchorInfoWidget$startAnimationListener$1 extends Lambda implements Function0<C6337ge> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $takeTimes = 111;
    public final /* synthetic */ long $period = 1000;

    static {
        Covode.recordClassIndex(32466);
    }

    public MediaAnchorInfoWidget$startAnimationListener$1(long j, long j2) {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdk.chatroom.ui.ge, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C6337ge mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C6337ge(this.$takeTimes, this.$period);
    }
}
