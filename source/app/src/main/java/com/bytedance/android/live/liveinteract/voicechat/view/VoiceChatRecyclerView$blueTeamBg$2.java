package com.bytedance.android.live.liveinteract.voicechat.view;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class VoiceChatRecyclerView$blueTeamBg$2 extends Lambda implements Function0<Drawable> {
    public static final VoiceChatRecyclerView$blueTeamBg$2 INSTANCE = new VoiceChatRecyclerView$blueTeamBg$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31846);
    }

    public VoiceChatRecyclerView$blueTeamBg$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, android.graphics.drawable.Drawable] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Drawable mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return LK5.LIZJ(2130855299);
    }
}
