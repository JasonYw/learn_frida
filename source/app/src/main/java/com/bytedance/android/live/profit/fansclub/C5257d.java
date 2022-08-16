package com.bytedance.android.live.profit.fansclub;

import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.profit.fansclub.AbstractC5258g;
import com.bytedance.android.live.profit.fansclub.C5257d;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3VF;
import p003X.C4BC;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.profit.fansclub.d */
/* loaded from: classes12.dex */
public final class C5257d extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final Observable<AbstractC5258g> LIZIZ;
    public final Observable<AbstractC5258g> LIZJ;
    public final C5923dp LIZLLL;

    /* renamed from: LJ */
    public final AbstractC5272q f26559LJ;
    public final CompositeDisposable LJFF = new CompositeDisposable();

    static {
        Covode.recordClassIndex(33274);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJFF.dispose();
    }

    public C5257d(C5923dp c5923dp, AbstractC5272q abstractC5272q) {
        C3VF user;
        C106862S5w.LIZ(c5923dp, abstractC5272q);
        this.LIZLLL = c5923dp;
        this.f26559LJ = abstractC5272q;
        this.f26559LJ.LJFF();
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if ((iUserService == null || (user = iUserService.user()) == null || !user.LIZLLL()) && !PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            QB4.LIZ(QB4.LIZIZ(this.LIZLLL.LIZIZ().LIZIZ()).subscribe(new Consumer<User>() { // from class: X.4Am
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33275);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(User user2) {
                    String str;
                    FansClubData data;
                    User user3 = user2;
                    if (!PatchProxy.proxy(new Object[]{user3}, this, LIZ, false, 1).isSupported) {
                        Intrinsics.checkNotNullExpressionValue(user3, "");
                        FansClubMember fansClub = user3.getFansClub();
                        if (fansClub != null && (data = fansClub.getData()) != null) {
                            str = data.clubName;
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C5257d.this.f26559LJ.LIZ(user3);
                        }
                    }
                }
            }), this.LJFF);
        }
        this.LIZIZ = ((C4BC) QB4.LIZ(new C4BC(this.LIZLLL), this.LJFF)).LIZLLL;
        Observable<AbstractC5258g> observable = this.LIZIZ;
        final FansClubDataService$1 fansClubDataService$1 = new FansClubDataService$1(this);
        Observable<AbstractC5258g> filter = observable.filter(new Predicate() { // from class: X.4BJ
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33277);
            }

            @Override // io.reactivex.functions.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                Object invoke;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    invoke = proxy.result;
                } else {
                    invoke = Function1.this.invoke(obj);
                    Intrinsics.checkNotNullExpressionValue(invoke, "");
                }
                return ((Boolean) invoke).booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "");
        this.LIZJ = filter;
        Observable<U> ofType = this.LIZJ.ofType(AbstractC5258g.C5259a.class);
        final FansClubDataService$2 fansClubDataService$2 = new FansClubDataService$2(this);
        QB4.LIZ(ofType.subscribe(new Consumer() { // from class: X.4BI
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33276);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
            }
        }), this.LJFF);
        Observable<U> ofType2 = this.LIZJ.ofType(AbstractC5258g.C5261i.class);
        final FansClubDataService$3 fansClubDataService$3 = new FansClubDataService$3(this);
        QB4.LIZ(ofType2.subscribe(new Consumer() { // from class: X.4BI
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33276);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
            }
        }), this.LJFF);
        Observable<U> ofType3 = this.LIZJ.ofType(AbstractC5258g.C5260h.class);
        final FansClubDataService$4 fansClubDataService$4 = new FansClubDataService$4(this);
        QB4.LIZ(ofType3.subscribe(new Consumer() { // from class: X.4BI
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33276);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
            }
        }), this.LJFF);
        Observable<U> ofType4 = this.LIZJ.ofType(AbstractC5258g.C5262j.class);
        final FansClubDataService$5 fansClubDataService$5 = new FansClubDataService$5(this);
        QB4.LIZ(ofType4.subscribe(new Consumer() { // from class: X.4BI
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33276);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
            }
        }), this.LJFF);
    }
}
