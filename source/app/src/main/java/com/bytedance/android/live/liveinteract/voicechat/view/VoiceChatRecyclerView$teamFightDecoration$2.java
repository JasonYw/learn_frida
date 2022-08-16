package com.bytedance.android.live.liveinteract.voicechat.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class VoiceChatRecyclerView$teamFightDecoration$2 extends Lambda implements Function0<C5138b> {
    public static final VoiceChatRecyclerView$teamFightDecoration$2 INSTANCE = new VoiceChatRecyclerView$teamFightDecoration$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31850);
    }

    public VoiceChatRecyclerView$teamFightDecoration$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.voicechat.view.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5138b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C5138b();
    }
}
