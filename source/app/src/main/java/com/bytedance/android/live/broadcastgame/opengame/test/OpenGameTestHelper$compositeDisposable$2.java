package com.bytedance.android.live.broadcastgame.opengame.test;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenGameTestHelper$compositeDisposable$2 extends Lambda implements Function0<CompositeDisposable> {
    public static final OpenGameTestHelper$compositeDisposable$2 INSTANCE = new OpenGameTestHelper$compositeDisposable$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21128);
    }

    public OpenGameTestHelper$compositeDisposable$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.disposables.CompositeDisposable, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ CompositeDisposable mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new CompositeDisposable();
    }
}
