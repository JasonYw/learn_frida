package com.bytedance.android.live.profit;

import android.content.Context;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.h */
/* loaded from: classes5.dex */
public final class C5278h implements Disposable {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public static final long f26563LJ = 1;
    public final Context LIZIZ;
    public final C5923dp LIZJ;
    public final CompositeDisposable LIZLLL;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZLLL.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : this.LIZLLL.isDisposed();
    }

    static {
        Covode.recordClassIndex(33382);
    }

    public C5278h(Context context, C5923dp c5923dp, CompositeDisposable compositeDisposable) {
        C106862S5w.LIZ(context, c5923dp, compositeDisposable);
        this.LIZIZ = context;
        this.LIZJ = c5923dp;
        this.LIZLLL = compositeDisposable;
    }

    public /* synthetic */ C5278h(Context context, C5923dp c5923dp, CompositeDisposable compositeDisposable, int i) {
        this(context, c5923dp, new CompositeDisposable());
    }
}
