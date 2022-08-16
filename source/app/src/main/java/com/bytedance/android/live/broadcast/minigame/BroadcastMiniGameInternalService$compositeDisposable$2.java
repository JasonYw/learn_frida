package com.bytedance.android.live.broadcast.minigame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes27.dex */
public final class BroadcastMiniGameInternalService$compositeDisposable$2 extends Lambda implements Function0<CompositeDisposable> {
    public static final BroadcastMiniGameInternalService$compositeDisposable$2 INSTANCE;
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(16928);
        INSTANCE = new BroadcastMiniGameInternalService$compositeDisposable$2();
    }

    public BroadcastMiniGameInternalService$compositeDisposable$2() {
        super(0);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(16928);
        INSTANCE = new BroadcastMiniGameInternalService$compositeDisposable$2();
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
