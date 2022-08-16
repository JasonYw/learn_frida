package com.bytedance.android.live.broadcast.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.C2VQ;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C88442Kt2;
import p003X.KLO;
import p003X.KLP;
import p003X.KNN;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;

/* loaded from: classes5.dex */
public final class PreviewPaidLiveInfoWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public TextView LIZJ;
    public HSImageView LIZLLL;

    /* renamed from: LJ */
    public final FrameLayout f25993LJ;
    public final FrameLayout LJFF;
    public final FrameLayout LJI;
    public final Lazy LJIIL = LIZ(C3199v.class);
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(new PreviewPaidLiveInfoWidget$titleTextView$2(this));
    public final Lazy LJIILJJIL = LazyKt__LazyJVMKt.lazy(new PreviewPaidLiveInfoWidget$coverView$2(this));
    public final Lazy LJIILL = LazyKt__LazyJVMKt.lazy(new PreviewPaidLiveInfoWidget$timeInfoTextView$2(this));

    static {
        Covode.recordClassIndex(18621);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewPaidLiveInfoWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIL, this, LIZIZ[0]));
    }

    public final TextView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    public final FrameLayout LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (FrameLayout) (proxy.isSupported ? proxy.result : this.LJIILJJIL.mo27335getValue());
    }

    /* renamed from: LJ */
    public final TextView m15865LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJIILL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onCreate();
        LJIIJJI().LIZ(new PreviewPaidLiveInfoWidget$onCreate$1(this));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        MethodCollector.m14708i(1377);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            MethodCollector.m14707o(1377);
            return;
        }
        super.onDestroy();
        FrameLayout frameLayout = this.LJFF;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.LJI;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            MethodCollector.m14707o(1377);
            return;
        }
        MethodCollector.m14707o(1377);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "PreviewPaidLiveInfoWidget[" + hashCode() + LoggerUtil.M_RIGHT_TAG;
    }

    private final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        PreviewStatusInfo LIZ2 = LJIIJJI().m15893LJ().LIZ();
        LIZ2.hasPaidLiveTicket = z;
        LJIIJJI().m15893LJ().LIZ(LIZ2);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        if (liveMode != null && KLP.LIZ[liveMode.ordinal()] == 1) {
            if (LIZIZ().LJJJJL().LIZ().intValue() == 0) {
                z = false;
            }
            FrameLayout frameLayout = this.f25993LJ;
            if (frameLayout != null) {
                LK1.LIZ(frameLayout, z);
            }
            FrameLayout frameLayout2 = this.LJI;
            if (frameLayout2 != null) {
                LK1.LIZ(frameLayout2, z);
            }
            FrameLayout frameLayout3 = this.LJFF;
            if (frameLayout3 != null) {
                LK1.LIZ(frameLayout3, z);
                return;
            }
            return;
        }
        FrameLayout frameLayout4 = this.f25993LJ;
        if (frameLayout4 != null) {
            LK1.LIZ((View) frameLayout4);
        }
        FrameLayout frameLayout5 = this.LJI;
        if (frameLayout5 != null) {
            LK1.LIZ((View) frameLayout5);
        }
        FrameLayout frameLayout6 = this.LJFF;
        if (frameLayout6 != null) {
            LK1.LIZ((View) frameLayout6);
        }
    }

    public final void LIZ(KLO klo) {
        if (PatchProxy.proxy(new Object[]{klo}, this, LIZ, false, 12).isSupported) {
            return;
        }
        if (klo.LIZ == 1) {
            FrameLayout frameLayout = this.f25993LJ;
            if (frameLayout != null) {
                LK1.LIZJ(frameLayout);
            }
            FrameLayout frameLayout2 = this.LJI;
            if (frameLayout2 != null) {
                LK1.LIZJ(frameLayout2);
            }
            FrameLayout frameLayout3 = this.LJFF;
            if (frameLayout3 != null) {
                LK1.LIZJ(frameLayout3);
            }
            LIZ(klo, false);
            C3199v LIZIZ2 = LIZIZ();
            LIZIZ2.LJJJJL().LIZ(1);
            LIZIZ2.LJJJJLL().LIZ(Long.valueOf(klo.LJFF));
            LIZIZ2.LJJJLIIL().LIZ(Boolean.valueOf(klo.LJI));
            if (!TextUtils.isEmpty(klo.LJII)) {
                C88442Kt2.LIZ(C88442Kt2.LIZIZ, this.context, klo.LJII, 0, true, 4, (Object) null);
            } else {
                C88442Kt2.LIZ(C88442Kt2.LIZIZ, this.context, "已设定本场直播为付费直播", 0, true, 4, (Object) null);
            }
            C4574547f.LIZ().LIZ("livesdk_paidlive_activity_related_toast_show", MapsKt__MapsKt.mapOf(TuplesKt.m137to("enter_from_merge", "direct_shoot"), TuplesKt.m137to("live_type", C2VQ.LIZ(LJIIJJI().LIZ().LIZ())), TuplesKt.m137to("ticket_id", String.valueOf(klo.LJFF)), TuplesKt.m137to("ticket_name", klo.LIZLLL)), new Object[0]);
            return;
        }
        FrameLayout frameLayout4 = this.f25993LJ;
        if (frameLayout4 != null) {
            LK1.LIZ((View) frameLayout4);
        }
        FrameLayout frameLayout5 = this.LJI;
        if (frameLayout5 != null) {
            LK1.LIZ((View) frameLayout5);
        }
        FrameLayout frameLayout6 = this.LJFF;
        if (frameLayout6 != null) {
            LK1.LIZ((View) frameLayout6);
        }
        C3199v LIZIZ3 = LIZIZ();
        LIZIZ3.LJJJJL().LIZ(0);
        LIZIZ3.LJJJLL().LIZ(null);
        LIZIZ3.LJJJLZIJ().LIZ("");
        if (klo.LIZ == 2) {
            LIZIZ3.LJJJJLL().LIZ(Long.valueOf(klo.LJFF));
            LIZ(true);
            C88442Kt2.LIZ(C88442Kt2.LIZIZ, this.context, 2131582802, 0, true, 4, (Object) null);
        } else if (klo.LIZ == 3) {
            LIZIZ3.LJJJJLL().LIZ(0L);
            LIZIZ3.LJJJJZI().LIZ(-1L);
            LIZ(false);
        } else {
            LIZIZ3.LJJJJLL().LIZ(0L);
        }
        LIZIZ3.LJJJLIIL().LIZ(null);
    }

    public final void LIZ(KLO klo, boolean z) {
        IUser iUser;
        C3VF user;
        if (PatchProxy.proxy(new Object[]{klo, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (z && klo.LJFF != LIZIZ().LJJJJLL().LIZ().longValue()) {
            return;
        }
        String str = klo.LIZLLL;
        ImageModel genBy = ImageModel.genBy(klo.LIZIZ);
        if (klo.LIZ == 1) {
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null) {
                iUser = user.LIZ();
            } else {
                iUser = null;
            }
            if (klo.LJIIIIZZ == 4 && iUser != null) {
                str = LK5.LIZ(2131586752, iUser.getNickName());
                Intrinsics.checkNotNullExpressionValue(str, "");
                genBy = iUser.getAvatarThumb();
            } else {
                Intrinsics.checkNotNullExpressionValue(genBy, "");
                genBy.setUri(klo.LIZJ);
            }
            if (klo.LJIIIIZZ == 3) {
                TextView textView = this.LIZJ;
                if (textView != null) {
                    LK1.LIZJ(textView);
                }
            } else {
                TextView textView2 = this.LIZJ;
                if (textView2 != null) {
                    LK1.LIZ(textView2);
                }
            }
            LIZJ().setText(str);
            HSImageView hSImageView = this.LIZLLL;
            if (hSImageView != null) {
                M0Q.LIZ((ImageView) hSImageView, genBy, hSImageView.getMeasuredWidth(), hSImageView.getMeasuredHeight());
            }
            m15865LJ().setText(klo.f8433LJ);
            if (z && klo.LJIIIIZZ != LIZIZ().LJJJJLI().LIZ().intValue() && !TextUtils.isEmpty(klo.LJII)) {
                C88442Kt2.LIZ(C88442Kt2.LIZIZ, this.context, klo.LJII, 0, true, 4, (Object) null);
            }
            C3199v LIZIZ2 = LIZIZ();
            LIZIZ2.LJJJJL().LIZ(1);
            LIZIZ2.LJJJJLI().LIZ(Integer.valueOf(klo.LJIIIIZZ));
            LIZIZ2.LJJJLL().LIZ(KNN.LIZ(genBy));
            LIZIZ2.LJJJLZIJ().LIZ(str);
        }
    }

    public PreviewPaidLiveInfoWidget(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.f25993LJ = frameLayout;
        this.LJFF = frameLayout2;
        this.LJI = frameLayout3;
    }
}
