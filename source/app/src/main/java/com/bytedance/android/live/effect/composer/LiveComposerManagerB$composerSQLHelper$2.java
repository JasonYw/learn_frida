package com.bytedance.android.live.effect.composer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C86726KFk;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class LiveComposerManagerB$composerSQLHelper$2 extends Lambda implements Function0<C4194g> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86726KFk this$0;

    static {
        Covode.recordClassIndex(24458);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveComposerManagerB$composerSQLHelper$2(C86726KFk c86726KFk) {
        super(0);
        this.this$0 = c86726KFk;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.live.effect.composer.g] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4194g mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context LJIIJ = LK5.LJIIJ();
        Intrinsics.checkNotNullExpressionValue(LJIIJ, "");
        return new C4194g(LJIIJ, this.this$0.LIZJ.dbName);
    }
}
