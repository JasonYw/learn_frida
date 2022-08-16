package com.bytedance.android.live.profit.lottery;

import androidx.lifecycle.ViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.functions.Function2;
import p003X.AbstractC414772bH;
import p003X.C106862S5w;
import p003X.C448893pD;
import p003X.C449083pW;
import p003X.C89718LWm;

/* renamed from: com.bytedance.android.live.profit.lottery.ad */
/* loaded from: classes12.dex */
public final class C5322ad extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public final C89718LWm<AbstractC5323a> LIZJ = new C89718LWm<>(C449083pW.LIZ, (Function2) null, 2);
    public final AbstractC414772bH<AbstractC5323a> LIZLLL;

    static {
        Covode.recordClassIndex(33467);
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.ad$a */
    /* loaded from: classes12.dex */
    public static abstract class AbstractC5323a {
        static {
            Covode.recordClassIndex(33468);
        }

        public AbstractC5323a() {
        }

        public /* synthetic */ AbstractC5323a(byte b) {
            this();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ.dispose();
    }

    public C5322ad(C448893pD c448893pD) {
        C106862S5w.LIZ(c448893pD);
        C89718LWm<AbstractC5323a> c89718LWm = this.LIZJ;
        c89718LWm.LIZIZ();
        this.LIZLLL = c89718LWm;
        c448893pD.LJI().LIZ(new LotteryViewModel$1(this, c448893pD));
    }
}
