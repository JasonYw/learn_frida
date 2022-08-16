package com.bytedance.android.live.browser.jsbridge.state.observable;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C101031Pqb;

/* loaded from: classes8.dex */
public final class CurrentUserState$disposable$2 extends Lambda implements Function0<Disposable> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101031Pqb this$0;

    static {
        Covode.recordClassIndex(23033);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentUserState$disposable$2(C101031Pqb c101031Pqb) {
        super(0);
        this.this$0 = c101031Pqb;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [io.reactivex.disposables.Disposable, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Disposable mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ((IUserService) ServiceManager.getService(IUserService.class)).user().LJIIJJI().observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<IUser>() { // from class: com.bytedance.android.live.browser.jsbridge.state.observable.CurrentUserState$disposable$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(23034);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(IUser iUser) {
                IUser iUser2 = iUser;
                if (!PatchProxy.proxy(new Object[]{iUser2}, this, LIZ, false, 1).isSupported) {
                    C101031Pqb c101031Pqb = CurrentUserState$disposable$2.this.this$0;
                    if (!(iUser2 instanceof User)) {
                        iUser2 = null;
                    }
                    c101031Pqb.LIZ((C101031Pqb) iUser2);
                }
            }
        });
    }
}
