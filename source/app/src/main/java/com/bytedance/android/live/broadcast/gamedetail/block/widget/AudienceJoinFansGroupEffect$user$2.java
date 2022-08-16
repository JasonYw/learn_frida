package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.IQV;

/* loaded from: classes12.dex */
public final class AudienceJoinFansGroupEffect$user$2 extends Lambda implements Function0<User> {
    public static final AudienceJoinFansGroupEffect$user$2 INSTANCE = new AudienceJoinFansGroupEffect$user$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16351);
    }

    public AudienceJoinFansGroupEffect$user$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.base.model.user.User, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ User mo30099invoke() {
        C2WC<User> LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C13491f LIZ = IQV.LIZ(C5923dp.class);
        if (!(LIZ instanceof C5923dp)) {
            LIZ = null;
        }
        C5923dp c5923dp = (C5923dp) LIZ;
        if (c5923dp == null || (LIZIZ = c5923dp.LIZIZ()) == null) {
            return null;
        }
        return LIZIZ.LIZ();
    }
}
