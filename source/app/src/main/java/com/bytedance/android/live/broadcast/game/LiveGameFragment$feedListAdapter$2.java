package com.bytedance.android.live.broadcast.game;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C100639PkH;

/* loaded from: classes8.dex */
public final class LiveGameFragment$feedListAdapter$2 extends Lambda implements Function0<C3027d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C100639PkH this$0;

    static {
        Covode.recordClassIndex(15970);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameFragment$feedListAdapter$2(C100639PkH c100639PkH) {
        super(0);
        this.this$0 = c100639PkH;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.broadcast.game.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3027d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3027d(this.this$0.f10768LJ, this.this$0.LJI, this.this$0.LJFF);
    }
}
