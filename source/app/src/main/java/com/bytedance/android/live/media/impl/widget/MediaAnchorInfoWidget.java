package com.bytedance.android.live.media.impl.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AuthenticationInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.media.impl.widget.MediaAnchorInfoWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5988as;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p518ui.C6337ge;
import com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget;
import com.bytedance.android.livesdk.common.MarqueeTextView;
import com.bytedance.android.livesdk.common.MinMaxWidthLinearLayout;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8653e;
import com.bytedance.android.livesdk.log.model.C8658k;
import com.bytedance.android.livesdk.log.model.C8665r;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.model.C8669w;
import com.bytedance.android.livesdk.user.C9282d;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdkapi.depend.model.live.LiveHotSpotInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p772b.C9478a;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC418842hq;
import p003X.AbstractC418862hs;
import p003X.AbstractC441033cX;
import p003X.AbstractC449173pf;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.C146239ezh;
import p003X.C18R;
import p003X.C2VQ;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C35F;
import p003X.C3Q0;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C412982We;
import p003X.C423702pg;
import p003X.C426942uu;
import p003X.C427352vZ;
import p003X.C427362va;
import p003X.C427392vd;
import p003X.C427432vh;
import p003X.C427442vi;
import p003X.C4574547f;
import p003X.C81280I1y;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C91014LtQ;
import p003X.KDS;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;
import p003X.QFD;

/* loaded from: classes12.dex */
public final class MediaAnchorInfoWidget extends RoomRecyclableWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public MarqueeTextView LIZIZ;
    public ProgressBar LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f26519LJ;
    public AbstractC441033cX LJFF;
    public HSImageView LJIIIZ;
    public TextView LJIIJ;
    public HSImageView LJIIJJI;
    public MinMaxWidthLinearLayout LJIIL;
    public View LJIILIIL;
    public TextView LJIILJJIL;
    public ImageView LJIILL;
    public FragmentActivity LJIJJ;
    public Room LJIJJLI;
    public String LJIL;
    public Boolean LJJ;
    public boolean LJJI;
    public static final C427432vh LJIIIIZZ = new C427432vh((byte) 0);
    public static final String LJII = "res://com.ss.android.ies.live.sdk/";
    public final Lazy LJIILLIIL = LazyKt__LazyJVMKt.lazy(new MediaAnchorInfoWidget$mMediaFollowAnimator$2(this));
    public final Lazy LJIIZILJ = LazyKt__LazyJVMKt.lazy(new MediaAnchorInfoWidget$normalBg$2(this));
    public final Lazy LJIJ = LazyKt__LazyJVMKt.lazy(new MediaAnchorInfoWidget$successBg$2(this));
    public final Lazy LJIJI = LazyKt__LazyJVMKt.lazy(new MediaAnchorInfoWidget$successLabel$2(this));
    public final Lazy LJJIFFI = LazyKt__LazyJVMKt.lazy(MediaAnchorInfoWidget$mFollowAniPath$2.INSTANCE);
    public final C427442vi LJI = new C427442vi(this);
    public final CompositeDisposable LJJII = new CompositeDisposable();

    /* renamed from: LJ */
    private final ImageView m15630LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (ImageView) (proxy.isSupported ? proxy.result : this.LJIIZILJ.mo27335getValue());
    }

    private final ImageView LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (ImageView) (proxy.isSupported ? proxy.result : this.LJIJ.mo27335getValue());
    }

    private final FitTextView LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (FitTextView) (proxy.isSupported ? proxy.result : this.LJIJI.mo27335getValue());
    }

    private final String LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (String) (proxy.isSupported ? proxy.result : this.LJJIFFI.mo27335getValue());
    }

    public final HSImageView LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (HSImageView) (proxy.isSupported ? proxy.result : this.LJIILLIIL.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699996;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 29).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        Covode.recordClassIndex(32447);
    }

    private final boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return isScreenPortrait();
    }

    public final void LIZIZ() {
        User user;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        Room room = this.LJIJJLI;
        Long l = null;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        if (user != null) {
            l = Long.valueOf(user.getId());
        }
        Intrinsics.checkNotNull(l);
        UserProfileEvent userProfileEvent = new UserProfileEvent(l.longValue());
        userProfileEvent.setClickUserPosition("live_open_top_left_anchor");
        C87010KQi.LIZ().LIZ(userProfileEvent);
    }

    private final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        try {
            SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_FOLLOW_BUTTON_UI_STYLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Integer value = settingKey.getValue();
            if (value != null && (value.intValue() == 2 || value.intValue() == 3 || value.intValue() == 4)) {
                View view = this.LJIILIIL;
                if (view != null) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    view.setBackgroundDrawable(context.getResources().getDrawable(2130854802));
                    return;
                }
                return;
            }
            View view2 = this.LJIILIIL;
            if (view2 != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                view2.setBackgroundDrawable(context2.getResources().getDrawable(2130854801));
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        if (LJIIIZ()) {
            Boolean bool = this.LJJ;
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                ProgressBar progressBar = this.LIZJ;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                TextView textView = this.LJIILJJIL;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.LJIILL;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                LJIIJJI();
                return;
            }
        }
        ProgressBar progressBar2 = this.LIZJ;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        View view = this.LJIILIIL;
        if (view != null) {
            view.setVisibility(8);
        }
        if (C412982We.LIZIZ.LIZ()) {
            UIUtils.setViewVisibility(findViewById(2131184075), 0);
        } else {
            UIUtils.setViewVisibility(findViewById(2131170895), 0);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        AbstractC413392Xt<C6337ge> LLLJ;
        C6337ge LIZIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJJII.clear();
        MarqueeTextView marqueeTextView = this.LIZIZ;
        if (marqueeTextView != null) {
            marqueeTextView.cancelAnimation();
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, this.dataCenter, 0L, 2, null);
        if (LIZ2 != null && (LLLJ = LIZ2.LLLJ()) != null && (LIZIZ = LLLJ.LIZIZ()) != null) {
            LIZIZ.LIZIZ(this.LJI);
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    private final void LJIIJ() {
        User owner;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        if (isScreenPortrait() && LJIIIZ()) {
            ImageView m15630LJ = m15630LJ();
            Intrinsics.checkNotNullExpressionValue(m15630LJ, "");
            m15630LJ.setVisibility(0);
            ImageView LJFF = LJFF();
            Intrinsics.checkNotNullExpressionValue(LJFF, "");
            LJFF.setVisibility(0);
            Room room = (Room) this.dataCenter.get("data_room");
            if (room != null && (owner = room.getOwner()) != null) {
                if (owner.isFollowing()) {
                    TextView textView = this.LJIILJJIL;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    ImageView m15630LJ2 = m15630LJ();
                    Intrinsics.checkNotNullExpressionValue(m15630LJ2, "");
                    m15630LJ2.setAlpha(0.0f);
                    ImageView LJFF2 = LJFF();
                    Intrinsics.checkNotNullExpressionValue(LJFF2, "");
                    LJFF2.setAlpha(1.0f);
                    FitTextView LJI = LJI();
                    Intrinsics.checkNotNullExpressionValue(LJI, "");
                    LJI.setVisibility(0);
                    FitTextView LJI2 = LJI();
                    Intrinsics.checkNotNullExpressionValue(LJI2, "");
                    LJI2.setAlpha(1.0f);
                    return;
                }
                TextView textView2 = this.LJIILJJIL;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                ImageView m15630LJ3 = m15630LJ();
                Intrinsics.checkNotNullExpressionValue(m15630LJ3, "");
                m15630LJ3.setAlpha(1.0f);
                ImageView LJFF3 = LJFF();
                Intrinsics.checkNotNullExpressionValue(LJFF3, "");
                LJFF3.setAlpha(0.0f);
                FitTextView LJI3 = LJI();
                Intrinsics.checkNotNullExpressionValue(LJI3, "");
                LJI3.setVisibility(8);
                return;
            }
            return;
        }
        ImageView m15630LJ4 = m15630LJ();
        Intrinsics.checkNotNullExpressionValue(m15630LJ4, "");
        m15630LJ4.setVisibility(8);
        ImageView LJFF4 = LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF4, "");
        LJFF4.setVisibility(8);
        FitTextView LJI4 = LJI();
        Intrinsics.checkNotNullExpressionValue(LJI4, "");
        LJI4.setVisibility(8);
    }

    private final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        C427352vZ c427352vZ = new C427352vZ(this);
        PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        newDraweeControllerBuilder.mo27963setUri(LJII());
        newDraweeControllerBuilder.setControllerListener(c427352vZ);
        newDraweeControllerBuilder.setAutoPlayAnimations(true);
        AbstractDraweeController mo27965build = newDraweeControllerBuilder.mo27965build();
        HSImageView LIZ2 = LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        GenericDraweeHierarchy hierarchy = LIZ2.getHierarchy();
        Intrinsics.checkNotNullExpressionValue(hierarchy, "");
        hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
        HSImageView LIZ3 = LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        LIZ3.setController(mo27965build);
        HSImageView LIZ4 = LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ4, "");
        LIZ4.setVisibility(0);
        View findViewById = findViewById(2131182831);
        View findViewById2 = findViewById(2131182810);
        TextView textView = (TextView) findViewById(2131175559);
        textView.setAlpha(0.0f);
        textView.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(150L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(150L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        ofFloat3.setDuration(150L);
        ofFloat3.setStartDelay(1000L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
    }

    public final void LIZJ() {
        User user;
        Long l;
        String str;
        Long l2;
        String str2;
        LiveMode liveMode;
        String str3;
        C3383p c3383p;
        Long l3;
        String str4;
        C2WC<Boolean> LLFII;
        C2WD<C3383p> LIZ2;
        String str5 = "1";
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported || !isViewValid()) {
            return;
        }
        if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            this.LIZLLL = true;
            C3VF user2 = ((IUserService) ServiceManager.getService(IUserService.class)).user();
            Context context = this.context;
            QFD LIZ3 = C9284h.LIZ();
            LIZ3.LIZ(C91014LtQ.LIZ());
            LIZ3.LIZIZ(C91014LtQ.LIZIZ());
            LIZ3.LIZLLL("live_detail");
            LIZ3.m22926LJ("follow");
            LIZ3.LIZJ("live");
            LIZ3.LIZ(1);
            user2.LIZ(context, LIZ3.LIZ()).subscribe(new C81280I1y());
            return;
        }
        Room room = this.LJIJJLI;
        Long l4 = null;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        C9282d.C9283c c9283c = new C9282d.C9283c();
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        Intrinsics.checkNotNull(l);
        AbstractC418862hs LIZ4 = c9283c.LIZ(l.longValue());
        Room room2 = this.LJIJJLI;
        if (room2 != null) {
            str = room2.getRequestId();
        } else {
            str = null;
        }
        AbstractC418862hs LIZLLL = LIZ4.LIZIZ(str).LIZJ(this.LJIL).LIZLLL("live");
        Room room3 = this.LJIJJLI;
        if (room3 != null) {
            l2 = Long.valueOf(room3.getId());
        } else {
            l2 = null;
        }
        Intrinsics.checkNotNull(l2);
        AbstractC418862hs LIZIZ = LIZLLL.LIZIZ(l2.longValue());
        Room room4 = this.LJIJJLI;
        if (room4 != null) {
            str2 = room4.getLabels();
        } else {
            str2 = null;
        }
        ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ(((AbstractC418842hq) ((AbstractC418842hq) ((AbstractC418842hq) ((AbstractC418842hq) LIZIZ.m24974LJ(str2)).LIZ(this.LJIJJ)).LJFF("live_detail")).LJI("follow")).LIZJ()).observeOn(AndroidSchedulers.mainThread()).compose(getAutoUnbindTransformer()).subscribe(new io.reactivex.Observer<C9478a>() { // from class: X.2vX
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32461);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(disposable);
            }

            @Override // io.reactivex.Observer
            public final /* synthetic */ void onNext(C9478a c9478a) {
                C9478a c9478a2 = c9478a;
                if (!PatchProxy.proxy(new Object[]{c9478a2}, this, LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(c9478a2);
                    MediaAnchorInfoWidget.this.LIZ(c9478a2);
                }
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 3).isSupported) {
                    return;
                }
                C106862S5w.LIZ(th);
                if (!MediaAnchorInfoWidget.this.isViewValid()) {
                    return;
                }
                MediaAnchorInfoWidget.this.LIZ(0);
                ProgressBar progressBar = MediaAnchorInfoWidget.this.LIZJ;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                C88469KtT.LIZ(MediaAnchorInfoWidget.this.context, th);
            }
        });
        LIZ(4);
        ProgressBar progressBar = this.LIZJ;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (!PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 17).isSupported) {
            if (LJIIIZ()) {
                Boolean bool = this.LJJ;
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue() && !this.f26519LJ) {
                    return;
                }
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", str5);
                Room room5 = this.LJIJJLI;
                if (room5 != null) {
                    liveMode = room5.getStreamType();
                } else {
                    liveMode = null;
                }
                hashMap.put("live_type", C2VQ.LIZ(liveMode));
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLJILJIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ5 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                if (!LIZ5.booleanValue()) {
                    str3 = "0";
                } else {
                    str3 = str5;
                }
                hashMap.put("is_screen_clear", str3);
                hashMap.putAll(C2VQ.LIZIZ.LIZ(this.LJIJJLI));
                C35F LIZ6 = C35F.LIZJ.LIZ();
                if (LIZ6 != null && (LIZ2 = LIZ6.LIZ()) != null) {
                    c3383p = LIZ2.LIZ();
                } else {
                    c3383p = null;
                }
                if (c3383p != null) {
                    l3 = Long.valueOf(c3383p.LIZLLL);
                } else {
                    l3 = null;
                }
                hashMap.put("game_id", String.valueOf(l3));
                if (c3383p != null) {
                    str4 = c3383p.f26026LJ;
                } else {
                    str4 = null;
                }
                hashMap.put("game_name", String.valueOf(str4));
                C5923dp LIZ7 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ7 == null || (LLFII = LIZ7.LLFII()) == null || !LLFII.LIZ().booleanValue()) {
                    str5 = "0";
                }
                hashMap.put("if_clear_mode", str5);
                C4574547f LIZ8 = C4574547f.LIZ();
                Object[] objArr = new Object[6];
                objArr[0] = C8665r.class;
                if (user != null) {
                    l4 = Long.valueOf(user.getId());
                }
                Intrinsics.checkNotNull(l4);
                objArr[1] = new C8653e("live", l4.longValue(), 1);
                C8668v c8668v = new C8668v();
                c8668v.LIZIZ("live_interact");
                c8668v.LIZ("live_detail");
                objArr[2] = c8668v;
                objArr[3] = Room.class;
                objArr[4] = C8669w.class;
                objArr[5] = C8658k.LIZ();
                LIZ8.LIZ("livesdk_follow", hashMap, objArr);
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        UIUtils.setViewVisibility(this.LJIILJJIL, i);
        if (this.LJJI) {
            UIUtils.setViewVisibility(this.LJIILL, i);
        }
    }

    public final void LIZ(User user) {
        View view;
        int i;
        if (PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 12).isSupported) {
            return;
        }
        View view2 = this.LJIILIIL;
        if (view2 != null) {
            if (user.isFollowing()) {
                i = 8;
            } else {
                i = 0;
            }
            view2.setVisibility(i);
        }
        Boolean bool = this.LJJ;
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue() && (view = this.LJIILIIL) != null) {
            view.setVisibility(0);
        }
        if (user.isFollowing()) {
            if (C412982We.LIZIZ.LIZ()) {
                UIUtils.setViewVisibility(findViewById(2131184075), 0);
            } else {
                UIUtils.setViewVisibility(findViewById(2131170895), 0);
            }
        }
        LJIIJ();
    }

    public final void LIZ(C9478a c9478a) {
        User owner;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{c9478a}, this, LIZ, false, 25).isSupported || !isViewValid()) {
            return;
        }
        Room room = (Room) this.dataCenter.get("data_room");
        if (room != null && (owner = room.getOwner()) != null) {
            Intrinsics.checkNotNull(c9478a);
            owner.setFollowStatus(c9478a.LIZ());
        }
        DataCenter dataCenter = this.dataCenter;
        if (c9478a != null && c9478a.LIZ() == 0) {
            z = false;
        }
        dataCenter.put("data_is_followed", Boolean.valueOf(z));
        if (c9478a != null && c9478a.LIZ() == 0) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
                if (LJIIIZ()) {
                    Boolean bool = this.LJJ;
                    Intrinsics.checkNotNull(bool);
                    if (bool.booleanValue()) {
                        View findViewById = findViewById(2131182831);
                        Intrinsics.checkNotNullExpressionValue(findViewById, "");
                        ((ImageView) findViewById).setAlpha(1.0f);
                        View findViewById2 = findViewById(2131182810);
                        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                        ((ImageView) findViewById2).setAlpha(0.0f);
                        View findViewById3 = findViewById(2131175559);
                        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
                        ((TextView) findViewById3).setVisibility(8);
                        TextView textView = this.LJIILJJIL;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                }
                View view = this.LJIILIIL;
                if (view != null) {
                    view.setVisibility(0);
                }
                LIZ(0);
                ProgressBar progressBar = this.LIZJ;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        LIZLLL();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        Long l;
        User owner;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 14).isSupported && isViewValid() && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey())) {
            String key = kVData2.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 256598095) {
                if (hashCode == 506917167 && key.equals("data_login_event")) {
                    C5988as c5988as = (C5988as) kVData2.getData();
                    Intrinsics.checkNotNull(c5988as);
                    if (c5988as.LIZ) {
                        C3VF user = ((IUserService) ServiceManager.getService(IUserService.class)).user();
                        Room room = this.LJIJJLI;
                        if (room != null && (owner = room.getOwner()) != null) {
                            l = Long.valueOf(owner.getId());
                        } else {
                            l = null;
                        }
                        Intrinsics.checkNotNull(l);
                        ((KDS) user.LIZIZ(l.longValue()).observeOn(AndroidSchedulers.mainThread()).map(C427362va.LIZIZ).m149as(autoDispose())).LIZ(new Consumer<User>() { // from class: X.2vW
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(32450);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(User user2) {
                                User owner2;
                                User user3 = user2;
                                if (!PatchProxy.proxy(new Object[]{user3}, this, LIZ, false, 1).isSupported && MediaAnchorInfoWidget.this.isViewValid()) {
                                    User from = User.from(user3);
                                    Room room2 = (Room) MediaAnchorInfoWidget.this.dataCenter.get("data_room");
                                    if (room2 != null && (owner2 = room2.getOwner()) != null) {
                                        Intrinsics.checkNotNullExpressionValue(from, "");
                                        owner2.setFollowInfo(from.getFollowInfo());
                                    }
                                    DataCenter dataCenter = MediaAnchorInfoWidget.this.dataCenter;
                                    Intrinsics.checkNotNullExpressionValue(from, "");
                                    dataCenter.put("data_is_followed", Boolean.valueOf(from.isFollowing()));
                                    if (from.isFollowing()) {
                                        MediaAnchorInfoWidget.this.LIZLLL();
                                    } else if (MediaAnchorInfoWidget.this.LIZLLL) {
                                        MediaAnchorInfoWidget.this.LIZJ();
                                    }
                                }
                            }
                        }, C427392vd.LIZ);
                    }
                }
            } else if (key.equals("cmd_update_live_hotspot_show") && !C412982We.LIZIZ.LIZ()) {
                if (Intrinsics.areEqual(kVData2.getData(), Boolean.TRUE)) {
                    TextView textView = this.LJIIJ;
                    if (textView != null) {
                        textView.setMaxWidth((int) UIUtils.dip2Px(this.LJIJJ, 60.0f));
                        return;
                    }
                    return;
                }
                TextView textView2 = this.LJIIJ;
                if (textView2 != null) {
                    textView2.setMaxWidth((int) UIUtils.dip2Px(this.LJIJJ, 90.0f));
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJIIIZ = (HSImageView) findViewById(2131182784);
        if (C412982We.LIZIZ.LIZ()) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
                    View findViewById = findViewById(2131182787);
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    View findViewById2 = findViewById(2131182788);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                }
                MinMaxWidthLinearLayout minMaxWidthLinearLayout = (MinMaxWidthLinearLayout) findViewById(2131183950);
                if (minMaxWidthLinearLayout != null) {
                    minMaxWidthLinearLayout.setVisibility(0);
                } else {
                    minMaxWidthLinearLayout = null;
                }
                this.LJIIL = minMaxWidthLinearLayout;
                this.LIZIZ = (MarqueeTextView) findViewById(2131183949);
                this.LJIIJJI = (HSImageView) findViewById(2131183951);
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
                    C146239ezh c146239ezh = new C146239ezh();
                    ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(2131170683);
                    c146239ezh.LIZ(constraintLayout);
                    c146239ezh.LIZ(2131175543, 1, 2131183950, 2);
                    c146239ezh.LIZIZ(constraintLayout);
                }
                MinMaxWidthLinearLayout minMaxWidthLinearLayout2 = this.LJIIL;
                if (minMaxWidthLinearLayout2 != null) {
                    minMaxWidthLinearLayout2.setMinWidth(LK1.LIZLLL(48));
                }
                MarqueeTextView marqueeTextView = this.LIZIZ;
                if (marqueeTextView != null) {
                    marqueeTextView.setMaxWidth(LK1.LIZLLL(72));
                }
            }
        } else {
            this.LJIIJ = (TextView) findViewById(2131182787);
            this.LJIIJJI = (HSImageView) findViewById(2131182788);
        }
        this.LJIILIIL = findViewById(2131175543);
        this.LJIILJJIL = (TextView) findViewById(2131175497);
        this.LIZJ = (ProgressBar) findViewById(2131175552);
        TextView textView = this.LJIILJJIL;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: X.2vf
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(32452);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    MediaAnchorInfoWidget mediaAnchorInfoWidget = MediaAnchorInfoWidget.this;
                    mediaAnchorInfoWidget.f26519LJ = true;
                    mediaAnchorInfoWidget.LIZJ();
                }
            });
        }
        this.LJIILL = (ImageView) findViewById(2131182808);
        ImageView imageView = this.LJIILL;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: X.2vg
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(32453);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    MediaAnchorInfoWidget mediaAnchorInfoWidget = MediaAnchorInfoWidget.this;
                    mediaAnchorInfoWidget.f26519LJ = true;
                    mediaAnchorInfoWidget.LIZJ();
                }
            });
        }
        this.contentView.setOnClickListener(new View.OnClickListener() { // from class: X.2ve
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32454);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                AbstractC441033cX abstractC441033cX = MediaAnchorInfoWidget.this.LJFF;
                if (abstractC441033cX != null) {
                    abstractC441033cX.LIZIZ();
                }
                MediaAnchorInfoWidget.this.LIZIZ();
            }
        });
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        User user;
        ImageModel imageModel;
        String str;
        String str2;
        int LIZIZ;
        LiveHotSpotInfo liveHotSpotInfo;
        C5923dp c5923dp;
        C2WD<Room> LJJLIIIJ;
        Observable<AbstractC449173pf<Room>> LIZIZ2;
        AbstractC81278I1w abstractC81278I1w;
        TextView textView;
        C2WD<Room> LJJLIIIJ2;
        ImageModel imageModel2;
        String str3;
        C5923dp LIZ2;
        AbstractC413392Xt<C6337ge> LLLJ;
        C2WC<Boolean> LLLJL;
        Boolean LIZ3;
        String str4;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 11).isSupported) {
            return;
        }
        Context context = this.context;
        if (context != null) {
            this.LJIJJ = (FragmentActivity) context;
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJIJJLI = C423702pg.LIZ(dataCenter).LIZIZ;
            DataCenter dataCenter2 = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
            this.LJJ = Boolean.valueOf(C423702pg.LIZ(dataCenter2).LIZJ);
            TextView textView2 = this.LJIILJJIL;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
                if (LJIIIZ() && isScreenPortrait()) {
                    try {
                        View view = this.LJIILIIL;
                        if (view != null) {
                            view.setBackgroundResource(0);
                        }
                        View findViewById = findViewById(2131182831);
                        Intrinsics.checkNotNullExpressionValue(findViewById, "");
                        ((ImageView) findViewById).setAlpha(1.0f);
                        View findViewById2 = findViewById(2131182810);
                        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                        ((ImageView) findViewById2).setAlpha(0.0f);
                        ((ImageView) findViewById(2131182831)).setImageDrawable(LK5.LIZJ(2130854802));
                        TextView textView3 = this.LJIILJJIL;
                        if (textView3 != null) {
                            textView3.setTextColor(LK5.LIZIZ(2131626090));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        View view2 = this.LJIILIIL;
                        if (view2 != null) {
                            view2.setBackgroundDrawable(LK5.LIZJ(2130855854));
                        }
                        TextView textView4 = this.LJIILJJIL;
                        if (textView4 != null) {
                            textView4.setTextColor(LK5.LIZIZ(2131629099));
                        }
                        ImageView m15630LJ = m15630LJ();
                        Intrinsics.checkNotNullExpressionValue(m15630LJ, "");
                        m15630LJ.setVisibility(8);
                        FitTextView LJI = LJI();
                        Intrinsics.checkNotNullExpressionValue(LJI, "");
                        LJI.setVisibility(8);
                        ImageView LJFF = LJFF();
                        Intrinsics.checkNotNullExpressionValue(LJFF, "");
                        LJFF.setVisibility(8);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Room room = this.LJIJJLI;
            if (room != null) {
                user = room.getOwner();
            } else {
                user = null;
            }
            HSImageView hSImageView = this.LJIIIZ;
            if (hSImageView != null) {
                hSImageView.setVisibility(0);
            }
            this.contentView.setBackgroundResource(2130857507);
            HSImageView hSImageView2 = this.LJIIIZ;
            if (user != null) {
                imageModel = user.getAvatarThumb();
            } else {
                imageModel = null;
            }
            M0Q.LIZIZ(hSImageView2, imageModel, 2130856201);
            if (C412982We.LIZIZ.LIZ()) {
                C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, this.dataCenter, 0L, 2, null);
                if (LIZ4 != null && (LLLJL = LIZ4.LLLJL()) != null && (LIZ3 = LLLJL.LIZ()) != null && LIZ3.booleanValue()) {
                    MarqueeTextView marqueeTextView = this.LIZIZ;
                    if (marqueeTextView != null) {
                        if (user != null) {
                            str4 = user.getRemarkNameOrNickname();
                        } else {
                            str4 = null;
                        }
                        marqueeTextView.setTextWithEllipsis(str4);
                    }
                } else {
                    MarqueeTextView marqueeTextView2 = this.LIZIZ;
                    if (marqueeTextView2 != null) {
                        if (user != null) {
                            str3 = user.getRemarkNameOrNickname();
                        } else {
                            str3 = null;
                        }
                        marqueeTextView2.setTextWithFading(str3);
                    }
                }
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, this.dataCenter, 0L, 2, null)) != null && (LLLJ = LIZ2.LLLJ()) != null) {
                    if (!LLLJ.LIZJ()) {
                        LLLJ.LIZ(new MediaAnchorInfoWidget$startAnimationListener$1(111L, 1000L));
                    }
                    LLLJ.LIZ(new MediaAnchorInfoWidget$startAnimationListener$2(this));
                }
                MarqueeTextView marqueeTextView3 = this.LIZIZ;
                if (marqueeTextView3 != null) {
                    marqueeTextView3.setOnClickListener(new MediaAnchorInfoWidget$onLoad$1(this));
                }
            } else {
                TextView textView5 = this.LJIIJ;
                if (textView5 != null) {
                    Room room2 = this.LJIJJLI;
                    if (room2 != null && (liveHotSpotInfo = room2.getLiveHotSpotInfo()) != null) {
                        str2 = liveHotSpotInfo.LIZIZ;
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2) && Intrinsics.areEqual(this.LJJ, Boolean.TRUE)) {
                        LIZIZ = LK1.LIZIZ(60.0f);
                    } else {
                        LIZIZ = LK1.LIZIZ(90.0f);
                    }
                    textView5.setMaxWidth(LIZIZ);
                }
                if (!isScreenPortrait()) {
                    TextView textView6 = this.LJIIJ;
                    if (textView6 != null) {
                        textView6.setAlpha(0.8f);
                    }
                    TextView textView7 = this.LJIIJ;
                    if (textView7 != null) {
                        textView7.setTypeface(null, 0);
                    }
                } else {
                    TextView textView8 = this.LJIIJ;
                    if (textView8 != null) {
                        textView8.setAlpha(1.0f);
                    }
                    TextView textView9 = this.LJIIJ;
                    if (textView9 != null) {
                        textView9.setTypeface(null, 1);
                    }
                }
                TextView textView10 = this.LJIIJ;
                if (textView10 != null) {
                    if (user != null) {
                        str = user.getRemarkNameOrNickname();
                    } else {
                        str = null;
                    }
                    textView10.setText(str);
                }
            }
            this.LIZLLL = false;
            this.LJIL = (String) this.dataCenter.get("log_enter_live_source", "");
            if (user != null) {
                LIZ(user);
                if (user.isEnterpriseVerify()) {
                    HSImageView hSImageView3 = this.LJIIJJI;
                    AuthenticationInfo authenticationInfo = user.mAuthenticationInfo;
                    if (authenticationInfo != null) {
                        imageModel2 = authenticationInfo.authenticationBadge;
                    } else {
                        imageModel2 = null;
                    }
                    M0Q.LIZ(hSImageView3, imageModel2);
                    UIUtils.setViewVisibility(this.LJIIJJI, 0);
                }
                this.LJJII.add(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZJ(user.getId()).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<C9478a>() { // from class: X.2vc
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(32455);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(C9478a c9478a) {
                        C9478a c9478a2 = c9478a;
                        if (!PatchProxy.proxy(new Object[]{c9478a2}, this, LIZ, false, 1).isSupported) {
                            MediaAnchorInfoWidget.this.LIZ(c9478a2);
                        }
                    }
                }, C18R.LIZ));
            }
            C5923dp c5923dp2 = this.dataContext;
            if ((c5923dp2 == null || (LJJLIIIJ2 = c5923dp2.LJJLIIIJ()) == null || LJJLIIIJ2.LIZ() == null) && (c5923dp = this.dataContext) != null && (LJJLIIIJ = c5923dp.LJJLIIIJ()) != null && (LIZIZ2 = LJJLIIIJ.LIZIZ()) != null && (abstractC81278I1w = (AbstractC81278I1w) LIZIZ2.m151as(autoDispose())) != null) {
                abstractC81278I1w.LIZ(new Consumer<AbstractC449173pf<? extends Room>>() { // from class: X.2vY
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(32457);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(AbstractC449173pf<? extends Room> abstractC449173pf) {
                        User owner;
                        AbstractC449173pf<? extends Room> abstractC449173pf2 = abstractC449173pf;
                        if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                            Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                            Room room3 = (Room) C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2);
                            if (room3 != null && (owner = room3.getOwner()) != null) {
                                MediaAnchorInfoWidget.this.LIZ(owner);
                            }
                        }
                    }
                });
            }
            this.dataCenter.observeForever("data_login_event", this).observe("cmd_update_live_hotspot_show", this);
            if (!isScreenPortrait()) {
                if (C426942uu.LIZ(false)) {
                    this.contentView.setBackgroundResource(2130857509);
                } else {
                    this.contentView.setBackgroundResource(2130857508);
                }
                this.contentView.setPadding(0, 0, LK1.LIZLLL(6), 0);
                UIUtils.setLayoutParams(this.LJIIIZ, LK1.LIZLLL(26), LK1.LIZLLL(26));
            } else {
                this.contentView.setBackgroundResource(2130857507);
                this.contentView.setPadding(0, 0, LK1.LIZLLL(2), 0);
                UIUtils.setLayoutParams(this.LJIIIZ, LK1.LIZLLL(18), LK1.LIZLLL(18));
            }
            this.LJJI = false;
            LJIIJ();
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
                if (isScreenPortrait() && (textView = this.LJIILJJIL) != null) {
                    textView.setCompoundDrawables(null, null, null, null);
                }
                if (!LJIIIZ()) {
                    LJIIIIZZ();
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
                        TextView textView11 = this.LJIILJJIL;
                        if (textView11 != null) {
                            textView11.setTextColor(LK5.LIZIZ(2131629099));
                        }
                        HSImageView LIZ5 = LIZ();
                        if (LIZ5 != null) {
                            C3Q0.LIZ(LIZ5, LK5.LIZLLL(2131429300));
                        }
                        View view3 = this.LJIILIIL;
                        if (view3 != null) {
                            C3Q0.LIZIZ(view3, LK5.LIZLLL(2131429299));
                        }
                        View view4 = this.LJIILIIL;
                        if (view4 != null) {
                            C3Q0.LIZ(view4, -2);
                        }
                        int LIZLLL = LK5.LIZLLL(2131429303);
                        int LIZLLL2 = LK5.LIZLLL(2131429301);
                        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_FOLLOW_BUTTON_UI_STYLE;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        Integer value = settingKey.getValue();
                        if (value == null) {
                            return;
                        }
                        if (value.intValue() == 1) {
                            Drawable LIZJ = LK5.LIZJ(2130855846);
                            if (LIZJ != null) {
                                LIZJ.setBounds(0, 0, LIZLLL, LIZLLL);
                            }
                            TextView textView12 = this.LJIILJJIL;
                            if (textView12 != null) {
                                textView12.setCompoundDrawables(LIZJ, null, null, null);
                            }
                            TextView textView13 = this.LJIILJJIL;
                            if (textView13 != null) {
                                textView13.setCompoundDrawablePadding(LK5.LIZLLL(2131429302));
                            }
                            TextView textView14 = this.LJIILJJIL;
                            if (textView14 != null) {
                                textView14.setPadding(LIZLLL2, 0, LIZLLL2, 0);
                                return;
                            }
                            return;
                        } else if (value.intValue() == 2) {
                            TextView textView15 = this.LJIILJJIL;
                            if (textView15 != null) {
                                textView15.setTextColor(LK5.LIZIZ(2131626090));
                                return;
                            }
                            return;
                        } else if (value.intValue() == 3) {
                            TextView textView16 = this.LJIILJJIL;
                            if (textView16 != null) {
                                textView16.setText("");
                            }
                            ImageView imageView = this.LJIILL;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                            }
                            this.LJJI = true;
                            HSImageView LIZ6 = LIZ();
                            if (LIZ6 != null) {
                                C3Q0.LIZ(LIZ6, LIZLLL);
                            }
                            View view5 = this.LJIILIIL;
                            if (view5 != null) {
                                C3Q0.LIZ(view5, LK5.LIZLLL(2131429299));
                            }
                            View view6 = this.LJIILIIL;
                            if (view6 != null) {
                                C3Q0.LIZIZ(view6, LK5.LIZLLL(2131429299));
                                return;
                            }
                            return;
                        } else if (value.intValue() == 4) {
                            Drawable LIZJ2 = LK5.LIZJ(2130855848);
                            if (LIZJ2 != null) {
                                LIZJ2.setBounds(0, 0, LIZLLL, LIZLLL);
                            }
                            TextView textView17 = this.LJIILJJIL;
                            if (textView17 != null) {
                                textView17.setCompoundDrawables(LIZJ2, null, null, null);
                            }
                            TextView textView18 = this.LJIILJJIL;
                            if (textView18 != null) {
                                textView18.setTextColor(LK5.LIZIZ(2131626090));
                            }
                            TextView textView19 = this.LJIILJJIL;
                            if (textView19 != null) {
                                textView19.setCompoundDrawablePadding(LK5.LIZLLL(2131429302));
                            }
                            TextView textView20 = this.LJIILJJIL;
                            if (textView20 != null) {
                                textView20.setPadding(LIZLLL2, 0, LIZLLL2, 0);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
