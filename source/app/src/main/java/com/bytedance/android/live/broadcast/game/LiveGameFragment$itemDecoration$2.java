package com.bytedance.android.live.broadcast.game;

import com.bytedance.android.live.broadcast.p280ui.C3244a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C100639PkH;
import p003X.C81918IQm;

/* loaded from: classes12.dex */
public final class LiveGameFragment$itemDecoration$2 extends Lambda implements Function0<C3244a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C100639PkH this$0;

    static {
        Covode.recordClassIndex(15975);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameFragment$itemDecoration$2(C100639PkH c100639PkH) {
        super(0);
        this.this$0 = c100639PkH;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.live.broadcast.ui.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3244a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3244a((int) C81918IQm.LIZ(this.this$0.getContext(), 3.0f), (int) C81918IQm.LIZ(this.this$0.getContext(), 1.5f));
    }
}
