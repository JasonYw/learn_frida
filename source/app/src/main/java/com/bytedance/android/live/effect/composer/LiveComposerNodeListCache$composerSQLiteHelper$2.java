package com.bytedance.android.live.effect.composer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class LiveComposerNodeListCache$composerSQLiteHelper$2 extends Lambda implements Function0<C4195h> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $dbName;

    static {
        Covode.recordClassIndex(24460);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveComposerNodeListCache$composerSQLiteHelper$2(String str) {
        super(0);
        this.$dbName = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.effect.composer.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4195h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context LJIIJ = LK5.LJIIJ();
        Intrinsics.checkNotNullExpressionValue(LJIIJ, "");
        return new C4195h(LJIIJ, this.$dbName);
    }
}
