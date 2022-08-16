package com.bytedance.android.live.broadcast.preview.p277ui.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C3VF;
import p003X.C475704rM;
import p003X.C77153GbL;
import p003X.C77308Gdq;
import p003X.C77309Gdr;
import p003X.C77310Gds;
import p003X.C77350GeW;
import p003X.KDS;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.widget.StartLiveVisibilityServiceWidget */
/* loaded from: classes3.dex */
public final class StartLiveVisibilityServiceWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public View f25921LJ;
    public View LJFF;
    public TextView LJI;
    public final Lazy LJIIL = LIZ(C3199v.class);
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(new StartLiveVisibilityServiceWidget$startLiveVisibilityContext$2(this));

    static {
        Covode.recordClassIndex(17437);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StartLiveVisibilityServiceWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIL, this, LIZIZ[0]));
    }

    public final C3207d LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C3207d) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "StartLiveVisibilityServiceWidget[" + hashCode() + LoggerUtil.M_RIGHT_TAG;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onCreate();
        ALogger.m15801d(LIZ(), "start OnCreate");
        LIZJ();
        this.LIZLLL = false;
        this.f25921LJ = C116971W2r.LIZ(LayoutInflater.from(this.context), 2131699910, (ViewGroup) null, false);
        View view = this.f25921LJ;
        if (view != null) {
            this.LJFF = view.findViewById(2131197149);
            this.LJI = (TextView) view.findViewById(2131195660);
        }
        LJIIJJI().LIZ(new StartLiveVisibilityServiceWidget$onCreate$2(this));
        Disposable subscribe = LIZIZ().LJJIZ().LIZIZ().subscribe(new C77310Gds(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        C3207d LIZJ = LIZJ();
        Disposable subscribe2 = LIZJ.LIZJ().LIZIZ().startWith((Observable<List<User>>) LIZJ.LIZJ().LIZ()).subscribe(new C77308Gdq(this));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "");
        LIZ(subscribe2);
        Disposable subscribe3 = LIZJ.m15890LJ().LIZIZ().startWith((Observable<List<User>>) LIZJ.LIZJ().LIZ()).subscribe(new C77309Gdr(this));
        Intrinsics.checkNotNullExpressionValue(subscribe3, "");
        LIZ(subscribe3);
    }

    public final void LIZ(TextView textView) {
        if (!PatchProxy.proxy(new Object[]{textView}, this, LIZ, false, 6).isSupported && textView != null) {
            Pair<String, String> LIZ2 = C475704rM.LIZ(LIZIZ().LJJIZ().LIZ().intValue(), this.LIZJ, "", "");
            new StringBuilder();
            textView.setText(C0002O.m25086C(LIZ2.getFirst(), LIZ2.getSecond()));
        }
    }

    public final void LIZ(Function0<Unit> function0) {
        IUser iUser;
        C3VF user;
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 8).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            iUser = user.LIZ();
        } else {
            iUser = null;
        }
        if (iUser instanceof User) {
            ((KDS) ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(((User) iUser).getId()).observeOn(AndroidSchedulers.mainThread()).m149as(C148062fT6.LIZ(this))).LIZ(new C77350GeW(this, function0, currentTimeMillis), new C77153GbL(this, currentTimeMillis));
        }
    }
}
