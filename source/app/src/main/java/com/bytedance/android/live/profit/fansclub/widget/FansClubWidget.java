package com.bytedance.android.live.profit.fansclub.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.profit.fansclub.AbstractC5258g;
import com.bytedance.android.live.profit.fansclub.AbstractC5266n;
import com.bytedance.android.live.profit.fansclub.AbstractC5267o;
import com.bytedance.android.live.profit.fansclub.C5256c;
import com.bytedance.android.live.profit.fansclub.C5265k;
import com.bytedance.android.live.profit.fansclub.FansClubUserStatus;
import com.bytedance.android.live.profit.fansclub.transfer.C5275e;
import com.bytedance.android.live.profit.fansclub.widget.FansClubWidget;
import com.bytedance.android.live.profit.privilege.AbstractC5365a;
import com.bytedance.android.live.profit.privilege.model.C5372g;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C420672kn;
import p003X.C427782wG;
import p003X.C438183Vc;
import p003X.C439993ar;
import p003X.C4574547f;
import p003X.C458424Ay;
import p003X.C458444Ba;
import p003X.C4BA;
import p003X.C4BF;
import p003X.C4BK;
import p003X.C4BL;
import p003X.C4BM;
import p003X.C4BQ;
import p003X.C87308Kak;
import p003X.LK5;
import p003X.LLY;
import p003X.M0Q;
import p003X.QB4;
import p003X.QVQ;

/* loaded from: classes12.dex */
public abstract class FansClubWidget extends RoomRecyclableWidget implements C4BQ, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public RelativeLayout LIZIZ;
    public HSImageView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public RelativeLayout f26561LJ;
    public TextView LJFF;
    public TextView LJI;
    public C5923dp LJII;
    public AbstractC5267o LJIIIIZZ;
    public AbstractC5365a LJIIIZ;
    public final CompositeDisposable LJIIJ = new CompositeDisposable();
    public Disposable LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public Disposable LJIILL;

    static {
        Covode.recordClassIndex(33343);
    }

    public abstract void LIZ(boolean z);

    public abstract void LJIIIZ();

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 38).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C5923dp LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C5923dp) proxy.result;
        }
        C5923dp c5923dp = this.LJII;
        if (c5923dp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c5923dp;
    }

    public final AbstractC5267o LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC5267o) proxy.result;
        }
        AbstractC5267o abstractC5267o = this.LJIIIIZZ;
        if (abstractC5267o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC5267o;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
            return;
        }
        this.LJIIJ.clear();
        this.LJIILL.dispose();
    }

    private final boolean LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5923dp c5923dp = this.LJII;
        if (c5923dp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        User owner = c5923dp.LIZ().LIZ().getOwner();
        if (owner == null) {
            return false;
        }
        return owner.isFollowing();
    }

    private final void LJIJJ() {
        GenericDraweeHierarchy hierarchy;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        UIUtils.setViewVisibility(this.LIZIZ, 0);
        UIUtils.setViewVisibility(this.LIZLLL, 8);
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null && (hierarchy = hSImageView.getHierarchy()) != null) {
            hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_INSIDE);
        }
        M0Q.LIZ(this.LIZJ, LJIIJJI());
        LIZJ(1);
        LJII();
    }

    public final C5256c LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (C5256c) proxy.result;
        }
        AbstractC5267o abstractC5267o = this.LJIIIIZZ;
        if (abstractC5267o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC5267o.LIZ().LIZ().LIZIZ;
    }

    public final int LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5267o abstractC5267o = this.LJIIIIZZ;
        if (abstractC5267o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC5267o.LJIIL().LIZ().LIZIZ;
    }

    /* renamed from: LJ */
    public final boolean m15617LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC5365a abstractC5365a = this.LJIIIZ;
        if (abstractC5365a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC5365a.LJIIIIZZ().LIZ().LJFF;
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            return;
        }
        C4574547f.LIZ().LIZ("livesdk_fanclub_guide_info_show", LJIJJLI(), Room.class, C8668v.class);
    }

    private final void LJIJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        C5923dp c5923dp = this.LJII;
        if (c5923dp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        User owner = c5923dp.LIZ().LIZ().getOwner();
        if (owner != null && !owner.isFollowing()) {
            return;
        }
        UIUtils.setViewVisibility(this.LIZIZ, 0);
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null) {
            GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
            Intrinsics.checkNotNullExpressionValue(hierarchy, "");
            hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_INSIDE);
            M0Q.LIZ(hSImageView, LJIIJJI());
        }
        LIZJ(1);
    }

    public final void LJFF() {
        Animatable animatable;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && m15617LJ()) {
            RelativeLayout relativeLayout = this.LIZIZ;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            TextView textView = this.LIZLLL;
            if (textView != null) {
                textView.setVisibility(8);
            }
            HSImageView hSImageView = this.LIZJ;
            if (hSImageView != null) {
                DraweeController controller = hSImageView.getController();
                if (controller != null && (animatable = controller.getAnimatable()) != null) {
                    animatable.stop();
                }
                hSImageView.setController(null);
                GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
                Intrinsics.checkNotNullExpressionValue(hierarchy, "");
                hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
                M0Q.LIZ(hSImageView, LJIIJ());
            }
            LIZJ(2);
        }
    }

    public void LJI() {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported || !this.isViewValid) {
            return;
        }
        UIUtils.setViewVisibility(this.LIZIZ, 0);
        AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(LJIILJJIL()).setControllerListener(new C458424Ay(this)).setAutoPlayAnimations(true).mo27965build();
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null) {
            GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
            Intrinsics.checkNotNullExpressionValue(hierarchy, "");
            hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
            hSImageView.setController(mo27965build);
            hSImageView.setVisibility(0);
        }
        if (this.LJIILJJIL && (this instanceof UserInfoFansClubWidget)) {
            HSImageView hSImageView2 = this.LIZJ;
            if (hSImageView2 != null) {
                layoutParams = hSImageView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = LK5.LIZ(24.0f);
                    layoutParams.width = LK5.LIZ(24.0f);
                }
            } else {
                layoutParams = null;
            }
            HSImageView hSImageView3 = this.LIZJ;
            if (hSImageView3 != null) {
                hSImageView3.setLayoutParams(layoutParams);
            }
        }
    }

    public final void LJII() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            return;
        }
        if ((this instanceof OvalFollowFansClubWidget) && !this.LJIILJJIL) {
            C4574547f.LIZ().LIZ("livesdk_fans_club_bottom_icon_show", LJIJJLI(), Room.class, C8668v.class);
            return;
        }
        HashMap<String, String> LJIJJLI = LJIJJLI();
        if (this instanceof UserInfoFansClubWidget) {
            if (LIZIZ("livesdk_fans_club_icon_show")) {
                str = "1";
            } else {
                str = "0";
            }
            LJIJJLI.put("if_animation", str);
        }
        C4574547f.LIZ().LIZ("livesdk_fans_club_icon_show", LJIJJLI, Room.class, C8668v.class);
    }

    private final HashMap<String, String> LJIJJLI() {
        String str;
        String str2;
        String str3;
        FansClubUserStatus fansClubUserStatus;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 35);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this instanceof OvalFollowFansClubWidget) {
            str = "bottom_right";
        } else {
            str = "top_left";
        }
        String str4 = "1";
        if (!this.LJIIL) {
            str2 = "0";
        } else {
            str2 = str4;
        }
        hashMap.put("is_anchor", str2);
        C5923dp c5923dp = this.LJII;
        if (c5923dp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hashMap.put("anchor_id", String.valueOf(c5923dp.LIZ().LIZ().ownerUserId));
        C5923dp c5923dp2 = this.LJII;
        if (c5923dp2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hashMap.put("room_id", String.valueOf(c5923dp2.LIZ().LIZ().getId()));
        if (this.LJIIL) {
            str3 = PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
        } else {
            C5256c LIZJ = LIZJ();
            if (LIZJ == null || (fansClubUserStatus = LIZJ.LIZLLL) == null || (str3 = String.valueOf(fansClubUserStatus.value)) == null) {
                str3 = "0";
            }
        }
        hashMap.put("fans_status", str3);
        if (this.LJIILJJIL) {
            hashMap.put("vs_fanclub_position", str);
            if (this.LJIIL) {
                str4 = "0";
            }
            hashMap.put("vs_is_audience", str4);
            return hashMap;
        }
        hashMap.put("fanclub_position", str);
        return hashMap;
    }

    public FansClubWidget(boolean z) {
        this.LJIILJJIL = z;
        Disposable LIZIZ = QVQ.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        this.LJIIJJI = LIZIZ;
        Disposable LIZIZ2 = QVQ.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ2, "");
        this.LJIILL = LIZIZ2;
        this.LJIILIIL = this.LJIILJJIL;
    }

    private boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7196eL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Map<String, String> LIZ2 = c87308Kak.LIZ();
        C5923dp c5923dp = this.LJII;
        if (c5923dp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        String valueOf = String.valueOf(c5923dp.LIZ().LIZ().getId());
        if (!LIZ2.containsKey(str) || !Intrinsics.areEqual(LIZ2.get(str), valueOf)) {
            return false;
        }
        LIZ2.put(str, "0");
        C87308Kak<Map<String, String>> c87308Kak2 = AbstractC80293Hkt.f7196eL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        c87308Kak2.LIZ(LIZ2);
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LIZIZ = (RelativeLayout) this.contentView.findViewById(2131174566);
        this.f26561LJ = (RelativeLayout) this.contentView.findViewById(2131179782);
        RelativeLayout relativeLayout = this.LIZIZ;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: X.4B7
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33344);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    FansClubWidget.this.LJIIIZ();
                    C4574547f.LIZ().LIZ("livesdk_fans_club_audience_open");
                }
            });
        }
        this.LIZJ = (HSImageView) this.contentView.findViewById(2131174563);
        this.LIZLLL = (TextView) this.contentView.findViewById(2131174569);
        this.LJFF = (TextView) this.contentView.findViewById(2131179783);
        this.LJI = (TextView) this.contentView.findViewById(2131179781);
    }

    private final void LIZIZ(boolean z) {
        int i;
        FansClubUserStatus fansClubUserStatus;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 14).isSupported || !this.isViewValid) {
            return;
        }
        if (m15617LJ() && (LJIJ() || this.LJIIL)) {
            LJFF();
        } else if (this.LJIIL) {
            LIZ(0);
        } else {
            if (LIZJ() != null) {
                C5256c LIZJ = LIZJ();
                if (LIZJ != null) {
                    i = LIZJ.LIZJ;
                } else {
                    i = 0;
                }
                C5256c LIZJ2 = LIZJ();
                if (LIZJ2 != null && (fansClubUserStatus = LIZJ2.LIZLLL) != null) {
                    int i2 = C438183Vc.LIZ[fansClubUserStatus.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                LJIJJ();
                            }
                        } else if (this.LJIILJJIL && this.LJIILIIL) {
                            LJIJJ();
                        } else {
                            LIZIZ(i);
                        }
                    } else {
                        LIZ(i);
                    }
                }
                LIZ(0);
            } else if (z) {
                LJIJI();
            } else {
                C5923dp c5923dp = this.LJII;
                if (c5923dp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                User owner = c5923dp.LIZ().LIZ().getOwner();
                if (owner != null && !owner.isFollowing()) {
                    return;
                }
                LJIJJ();
                LIZIZ(this, false, 1, null);
            }
            LLY.LIZ(this.LIZIZ);
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        UIUtils.setViewVisibility(this.LIZIZ, 0);
        if (i > 0) {
            UIUtils.setViewVisibility(this.LIZLLL, 0);
            TextView textView = this.LIZLLL;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
        }
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null) {
            GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
            Intrinsics.checkNotNullExpressionValue(hierarchy, "");
            hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_INSIDE);
            M0Q.LIZ(hSImageView, LJIIL());
        }
        LIZJ(1);
        LJII();
    }

    public final void LIZ(AbstractC5258g abstractC5258g) {
        if (PatchProxy.proxy(new Object[]{abstractC5258g}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C2IN LIZIZ = C2IN.LIZIZ();
        LIZIZ.LIZIZ("FansClubWidget", "onFansClubMessage event=" + abstractC5258g);
        if (!this.LJIIL && ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL() && !(abstractC5258g instanceof C4BA)) {
            if (abstractC5258g instanceof C4BF) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
                    AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(LJIIZILJ()).setAutoPlayAnimations(true).setControllerListener(new BaseControllerListener<ImageInfo>() { // from class: X.4B3
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(33350);
                        }

                        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
                        public final void onFailure(String str, Throwable th) {
                        }

                        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
                        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                            if (!PatchProxy.proxy(new Object[]{str, obj, animatable}, this, LIZ, false, 1).isSupported && animatable != null && !animatable.isRunning()) {
                                FansClubWidget.this.LIZJ(1);
                            }
                        }
                    }).mo27965build();
                    HSImageView hSImageView = this.LIZJ;
                    if (hSImageView != null) {
                        GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
                        Intrinsics.checkNotNullExpressionValue(hierarchy, "");
                        hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
                        hSImageView.setController(mo27965build);
                    }
                }
            } else if (abstractC5258g instanceof AbstractC5258g.C5260h) {
                LIZ(1, ((AbstractC5258g.C5260h) abstractC5258g).LIZ, "");
            } else if (abstractC5258g instanceof C4BK) {
                LIZ(2, "", ((C4BK) abstractC5258g).LIZ);
            } else if (!(abstractC5258g instanceof AbstractC5258g.C5262j)) {
            } else {
                LJFF();
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZJ, "scaleX", 1.0f, 0.65f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(ofFloat, "");
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LIZJ, "scaleY", 1.0f, 0.65f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(ofFloat2, "");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(400L);
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setInterpolator(PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f));
                animatorSet.start();
            }
        }
    }

    public void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 24).isSupported) {
            return;
        }
        UIUtils.setViewVisibility(this.LIZIZ, 0);
        UIUtils.setViewVisibility(this.LIZLLL, 0);
        TextView textView = this.LIZLLL;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        HSImageView hSImageView = this.LIZJ;
        if (hSImageView != null) {
            GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
            Intrinsics.checkNotNullExpressionValue(hierarchy, "");
            hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_INSIDE);
        }
        M0Q.LIZ(this.LIZJ, LJIILIIL());
        LIZJ(0);
        LJII();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        C5923dp roomContext;
        boolean z;
        int i;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 13).isSupported || (roomContext = getRoomContext()) == null) {
            return;
        }
        this.LJII = roomContext;
        AbstractC5267o LIZJ = C458444Ba.LIZJ();
        if (LIZJ == null) {
            return;
        }
        this.LJIIIIZZ = LIZJ;
        AbstractC5365a m24858LJ = C458444Ba.m24858LJ();
        if (m24858LJ == null) {
            return;
        }
        this.LJIIIZ = m24858LJ;
        LIZJ(-1);
        C5923dp c5923dp = this.LJII;
        if (c5923dp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJIIL = c5923dp.LJIILJJIL().LIZIZ().booleanValue();
        AbstractC5267o abstractC5267o = this.LJIIIIZZ;
        if (abstractC5267o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC5267o.LIZLLL().LIZ().intValue() == C5275e.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILIIL = z;
        LIZIZ(true);
        RelativeLayout relativeLayout = this.LIZIZ;
        if (this.LJIIL) {
            i = 2131585295;
        } else {
            i = 2131585286;
        }
        LLY.LIZ(relativeLayout, LK5.LIZ(i));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            AbstractC5267o abstractC5267o2 = this.LJIIIIZZ;
            if (abstractC5267o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            QB4.LIZ(abstractC5267o2.LJII().LIZIZ().subscribe(new Consumer<AbstractC5266n>() { // from class: X.4B5
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33351);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC5266n abstractC5266n) {
                    AbstractC5266n abstractC5266n2 = abstractC5266n;
                    if (!PatchProxy.proxy(new Object[]{abstractC5266n2}, this, LIZ, false, 1).isSupported) {
                        FansClubWidget.this.LIZ(abstractC5266n2);
                    }
                }
            }), this.LJIIJ);
            QB4.LIZ(abstractC5267o2.LJI().subscribe(new Consumer<AbstractC5258g>() { // from class: X.4B6
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33352);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC5258g abstractC5258g) {
                    AbstractC5258g abstractC5258g2 = abstractC5258g;
                    if (!PatchProxy.proxy(new Object[]{abstractC5258g2}, this, LIZ, false, 1).isSupported) {
                        FansClubWidget.this.LIZ(abstractC5258g2);
                    }
                }
            }), this.LJIIJ);
            QB4.LIZ(abstractC5267o2.LIZ().LIZIZ().subscribe(new Consumer<C5265k>() { // from class: X.4B8
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33353);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5265k c5265k) {
                    if (!PatchProxy.proxy(new Object[]{c5265k}, this, LIZ, false, 1).isSupported) {
                        FansClubWidget.LIZ(FansClubWidget.this, false, 1, null);
                    }
                }
            }), this.LJIIJ);
            QB4.LIZ(abstractC5267o2.LJIIJJI().LIZIZ().subscribe(new Consumer<Unit>() { // from class: X.4Ax
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33354);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Unit unit) {
                    User owner;
                    if (!PatchProxy.proxy(new Object[]{unit}, this, LIZ, false, 1).isSupported && (owner = FansClubWidget.this.LIZ().LIZ().LIZ().getOwner()) != null && owner.isFollowing()) {
                        RelativeLayout relativeLayout2 = FansClubWidget.this.LIZIZ;
                        if (relativeLayout2 == null || relativeLayout2.getVisibility() != 0) {
                            FansClubWidget.LIZ(FansClubWidget.this, false, 1, null);
                        }
                    }
                }
            }), this.LJIIJ);
            QB4.LIZ(abstractC5267o2.LIZLLL().LIZIZ().subscribe(new Consumer<Integer>() { // from class: X.4B4
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33355);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Integer num) {
                    Integer num2 = num;
                    boolean z2 = true;
                    if (!PatchProxy.proxy(new Object[]{num2}, this, LIZ, false, 1).isSupported) {
                        FansClubWidget fansClubWidget = FansClubWidget.this;
                        int i2 = C5275e.LIZIZ;
                        if (num2 == null || num2.intValue() != i2) {
                            z2 = false;
                        }
                        fansClubWidget.LJIILIIL = z2;
                    }
                }
            }), this.LJIIJ);
            AbstractC5365a abstractC5365a = this.LJIIIZ;
            if (abstractC5365a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            QB4.LIZ(abstractC5365a.LJIIIIZZ().LIZIZ().subscribe(new Consumer<C5372g>() { // from class: X.4B9
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33356);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5372g c5372g) {
                    if (!PatchProxy.proxy(new Object[]{c5372g}, this, LIZ, false, 1).isSupported) {
                        FansClubWidget.this.LJFF();
                    }
                }
            }), this.LJIIJ);
        }
    }

    public final void LIZ(AbstractC5266n abstractC5266n) {
        if (PatchProxy.proxy(new Object[]{abstractC5266n}, this, LIZ, false, 17).isSupported || m15617LJ()) {
            return;
        }
        if (abstractC5266n instanceof C4BL) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
                AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27963setUri(LJIILL()).setControllerListener(new BaseControllerListener<ImageInfo>() { // from class: X.4B2
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(33349);
                    }

                    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
                    public final void onFailure(String str, Throwable th) {
                    }

                    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
                    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        if (!PatchProxy.proxy(new Object[]{str, obj, animatable}, this, LIZ, false, 1).isSupported && animatable != null && !animatable.isRunning()) {
                            animatable.start();
                            FansClubWidget.this.LJIIIIZZ();
                        }
                    }
                }).mo27965build();
                HSImageView hSImageView = this.LIZJ;
                if (hSImageView != null) {
                    hSImageView.setController(mo27965build);
                    GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
                    Intrinsics.checkNotNullExpressionValue(hierarchy, "");
                    hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
                    hSImageView.setVisibility(0);
                }
            }
        } else if (!(abstractC5266n instanceof C4BM) || PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
        } else {
            AbstractDraweeController mo27965build2 = Fresco.newDraweeControllerBuilder().mo27963setUri(LJIILLIIL()).setControllerListener(new BaseControllerListener<ImageInfo>() { // from class: X.4B1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33346);
                }

                @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
                public final void onFailure(String str, Throwable th) {
                    if (PatchProxy.proxy(new Object[]{str, th}, this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    ALogger.m15794w("FansClubWidget", str, th);
                }

                @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                    if (!PatchProxy.proxy(new Object[]{str, obj, animatable}, this, LIZ, false, 1).isSupported && animatable != null && !animatable.isRunning()) {
                        animatable.start();
                    }
                }
            }).mo27965build();
            HSImageView hSImageView2 = this.LIZJ;
            if (hSImageView2 == null) {
                return;
            }
            GenericDraweeHierarchy hierarchy2 = hSImageView2.getHierarchy();
            Intrinsics.checkNotNullExpressionValue(hierarchy2, "");
            hierarchy2.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
            hSImageView2.setController(mo27965build2);
            hSImageView2.setVisibility(0);
        }
    }

    public final void LIZ(String str) {
        String str2;
        String valueOf;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HashMap hashMap = new HashMap();
        AbstractC5267o abstractC5267o = this.LJIIIIZZ;
        if (abstractC5267o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C5265k LIZ2 = abstractC5267o.LIZ().LIZ();
        String str3 = "1";
        if (!LIZ2.LIZ()) {
            str2 = "0";
        } else {
            str2 = str3;
        }
        hashMap.put("is_fans", str2);
        if (this.LJIIL) {
            valueOf = PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
        } else {
            valueOf = String.valueOf(LIZ2.LIZIZ());
        }
        hashMap.put("fans_status", valueOf);
        if (Intrinsics.areEqual(str, "livesdk_fans_club_entrance_click")) {
            if (!LIZIZ(str)) {
                str3 = "0";
            }
            hashMap.put("if_animation", str3);
        }
        C4574547f.LIZ().LIZ(str, hashMap, Room.class, C8668v.class);
    }

    private final void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 19).isSupported) {
            return;
        }
        this.LJIILL.dispose();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        C5923dp c5923dp = this.LJII;
        if (c5923dp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C9078n LIZ2 = C427782wG.LIZ(context, c5923dp.LIZJ().LIZ().booleanValue(), i, str, str2);
        try {
            C9078n.LJJIJLIJ.LIZ(C439993ar.LIZIZ(this.context), LIZ2);
            this.LJIILL = C420672kn.LIZ(LIZ2);
        } catch (Throwable th) {
            C2IN.LIZIZ().LIZ(6, "ttlive_lottery", th);
        }
    }

    public static /* synthetic */ void LIZ(FansClubWidget fansClubWidget, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{fansClubWidget, (byte) 0, 1, null}, null, LIZ, true, 15).isSupported) {
            return;
        }
        fansClubWidget.LIZIZ(false);
    }

    public static /* synthetic */ void LIZIZ(FansClubWidget fansClubWidget, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{fansClubWidget, (byte) 0, 1, null}, null, LIZ, true, 28).isSupported) {
            return;
        }
        fansClubWidget.LIZ(true);
    }
}
