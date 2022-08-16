package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.utility.SharedPrefHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88929L2d;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteDetailDialog$prefHelper$2 extends Lambda implements Function0<SharedPrefHelper> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88929L2d this$0;

    static {
        Covode.recordClassIndex(16031);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGamePromoteDetailDialog$prefHelper$2(C88929L2d c88929L2d) {
        super(0);
        this.this$0 = c88929L2d;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.ies.utility.SharedPrefHelper] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SharedPrefHelper mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return SharedPrefHelper.LIZ(this.this$0.getContext(), "ttlive_anchor_game_promote_detail");
    }
}
