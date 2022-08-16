package com.bytedance.android.live.profit;

import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80293Hkt;
import p003X.C87308Kak;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.profit.d */
/* loaded from: classes12.dex */
public final class C5250d extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();

    static {
        Covode.recordClassIndex(33229);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZIZ.clear();
    }

    public C5250d() {
        IUser LIZ2;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7211ea;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            final Map<String, String> LIZ3 = c87308Kak.LIZ();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                LIZ2 = (IUser) proxy.result;
            } else {
                LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            }
            final String valueOf = String.valueOf(LIZ2.getId());
            if (LIZ3 != null && (str = LIZ3.get(valueOf)) != null && str.length() > 0) {
                CompositeDisposable compositeDisposable = this.LIZIZ;
                Observable<Long> timer = Observable.timer(1000L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(timer, "");
                compositeDisposable.add(QB4.LIZIZ(timer).subscribe(new Consumer<Long>() { // from class: X.2JT
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(33230);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(Long l) {
                        if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
                            C88440Kt0.LIZ((String) LIZ3.get(valueOf));
                            LIZ3.put(valueOf, "");
                            C87308Kak<Map<String, String>> c87308Kak2 = AbstractC80293Hkt.f7211ea;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                            c87308Kak2.LIZ(LIZ3);
                        }
                    }
                }));
            }
        }
    }
}
