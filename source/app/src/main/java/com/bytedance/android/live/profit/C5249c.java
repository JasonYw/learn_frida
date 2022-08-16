package com.bytedance.android.live.profit;

import androidx.lifecycle.ViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.c */
/* loaded from: classes5.dex */
public final class C5249c extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final C5277g LIZIZ;
    public final CompositeDisposable LIZJ = new CompositeDisposable();

    static {
        Covode.recordClassIndex(33228);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZJ.dispose();
    }

    public C5249c(C5277g c5277g) {
        C106862S5w.LIZ(c5277g);
        this.LIZIZ = c5277g;
        this.LIZIZ.LIZ("enter");
    }
}
