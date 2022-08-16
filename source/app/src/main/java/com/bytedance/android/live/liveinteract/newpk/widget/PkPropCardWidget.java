package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4675a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C80347Hll;
import p003X.C80350Hlo;
import p003X.C80351Hlp;
import p003X.C80353Hlr;
import p003X.C80354Hls;
import p003X.C86676KDm;
import p003X.KIZ;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkPropCardWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C80350Hlo LIZIZ;
    public boolean LIZJ;
    public Sticker LIZLLL;

    /* renamed from: LJ */
    public Sticker f26396LJ;
    public ImageModel LJFF;
    public final PkDataContext LJII;
    public final C80354Hls LJIIIIZZ;
    public final CompositeDisposable LJI = new CompositeDisposable();
    public final Observer<AbstractC4675a> LJIIIZ = new C80347Hll(this);
    public final Observer<String> LJIIJ = new C80353Hlr(this);

    static {
        Covode.recordClassIndex(28835);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJIIIIZZ.LIZJ.removeObserver(this.LJIIIZ);
        this.LJIIIIZZ.LJIIZILJ.removeObserver(this.LJIIJ);
        this.LJI.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1979);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1979);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LIZJ = z;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new C80350Hlo(context);
        ViewGroup viewGroup = this.containerView;
        C80350Hlo c80350Hlo = this.LIZIZ;
        if (c80350Hlo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(c80350Hlo, new ViewGroup.LayoutParams(-1, -1));
        C80350Hlo c80350Hlo2 = this.LIZIZ;
        if (c80350Hlo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(this.LIZJ ? (byte) 1 : (byte) 0)}, c80350Hlo2, C80350Hlo.LIZ, false, 1).isSupported) {
            C116971W2r.LIZ(LayoutInflater.from(c80350Hlo2.getContext()), 2131700486, (ViewGroup) c80350Hlo2, true);
        }
        this.LJIIIIZZ.LIZJ.observeForever(this.LJIIIZ);
        this.LJIIIIZZ.LJIIZILJ.observeForever(this.LJIIJ);
        MethodCollector.m14707o(1979);
    }

    public static final /* synthetic */ C80350Hlo LIZ(PkPropCardWidget pkPropCardWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkPropCardWidget}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return (C80350Hlo) proxy.result;
        }
        C80350Hlo c80350Hlo = pkPropCardWidget.LIZIZ;
        if (c80350Hlo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c80350Hlo;
    }

    public PkPropCardWidget(PkDataContext pkDataContext, C80354Hls c80354Hls) {
        C106862S5w.LIZ(pkDataContext, c80354Hls);
        this.LJII = pkDataContext;
        this.LJIIIIZZ = c80354Hls;
    }

    public final void LIZ(Sticker sticker, long j) {
        if (PatchProxy.proxy(new Object[]{sticker, new Long(j)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        List<Sticker> LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(C86676KDm.LIZLLL);
        if (!LIZIZ.isEmpty()) {
            this.f26396LJ = LIZIZ.get(0);
        }
        Sticker sticker2 = this.f26396LJ;
        if (sticker2 != null) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(C86676KDm.LIZLLL, sticker2);
        }
        this.LIZLLL = sticker;
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(C86676KDm.LIZLLL, sticker);
        QB4.LIZ(((AbstractC81278I1w) Observable.timer(j, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new C80351Hlp(this)), this.LJI);
    }

    public final void LIZ(String str, long j, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        try {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ().LIZ(str, new KIZ(this, str, z, j));
        } catch (Exception e) {
            ALogger.m15801d("ttlive_pk_widget_teamtask", "PkPropCardWidget handleSticker Exception = " + e);
        }
    }
}
