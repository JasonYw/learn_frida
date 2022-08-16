package com.bytedance.android.live.effect.composer;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86726KFk;

/* loaded from: classes5.dex */
public final class LiveComposerManagerB$composerDataProcess$2 extends Lambda implements Function0<C4192b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86726KFk this$0;

    static {
        Covode.recordClassIndex(24457);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveComposerManagerB$composerDataProcess$2(C86726KFk c86726KFk) {
        super(0);
        this.this$0 = c86726KFk;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.effect.composer.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4192b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4192b(this.this$0.LIZJ.dbName);
    }
}
