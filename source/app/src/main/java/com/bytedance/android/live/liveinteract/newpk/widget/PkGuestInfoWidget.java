package com.bytedance.android.live.liveinteract.newpk.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4702i;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2S8;
import p003X.C2WC;
import p003X.C3VI;
import p003X.C4574547f;
import p003X.C458614Br;
import p003X.C79046HEa;
import p003X.C79359HQb;
import p003X.C79503HVp;
import p003X.HTW;
import p003X.HUB;
import p003X.HUC;
import p003X.HUD;
import p003X.HUE;
import p003X.HUF;
import p003X.HUG;
import p003X.HUH;
import p003X.HUI;
import p003X.HUL;
import p003X.HUM;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkGuestInfoWidget extends RoomWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C3VI LIZIZ;
    public C3VI LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public final PkDataContext LJII;
    public final C458614Br LJIIIIZZ;
    public final HTW LJIIL;

    /* renamed from: LJ */
    public final LinkCrossRoomDataHolder f26390LJ = LinkCrossRoomDataHolder.LJII();
    public final CompositeDisposable LJIIIZ = new CompositeDisposable();
    public final Observer<AbstractC4256d> LJIIJ = new HUD(this);
    public final Observer<AbstractC4702i> LJIIJJI = new HUF(this);

    static {
        Covode.recordClassIndex(28793);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C3VI LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C3VI) proxy.result;
        }
        C3VI c3vi = this.LIZIZ;
        if (c3vi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c3vi;
    }

    public final C3VI LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C3VI) proxy.result;
        }
        C3VI c3vi = this.LIZJ;
        if (c3vi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c3vi;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJII.LJIIIZ.removeObserver(this.LJIIJ);
        this.LJIIL.LJFF.removeObserver(this.LJIIJJI);
        this.dataCenter.removeObserver(this);
        this.LJIIIZ.clear();
    }

    private final void LIZLLL() {
        float f;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported || !this.LJIIIIZZ.LIZIZ()) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToEnd = -1;
            layoutParams2.rightToRight = -1;
            layoutParams2.startToStart = 2131190210;
            layoutParams2.leftToLeft = 2131190210;
            if (this.LJIIIIZZ.LIZLLL()) {
                f = 16.0f;
            } else {
                f = 64.0f;
            }
            layoutParams2.bottomMargin = LK5.LIZ(f);
            ViewGroup viewGroup2 = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
            viewGroup2.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void LIZJ() {
        String str;
        String str2;
        String str3;
        String str4;
        C2WC<Room> LIZ2;
        Room LIZ3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.LJII.LJJLL);
        C79503HVp c79503HVp = this.LJII.LJJIIZI;
        if (c79503HVp != null && c79503HVp.LIZJ == 0) {
            str = "linked_anchor";
        } else {
            str = "pk_linked_anchor";
        }
        userProfileEvent.setClickUserPosition(str);
        userProfileEvent.interactLogLabel = "right_anchor";
        C79503HVp c79503HVp2 = this.LJII.LJJIIZI;
        if (c79503HVp2 != null && c79503HVp2.LIZJ == 0) {
            str2 = "anchor_linkmic";
        } else {
            str2 = PushConstants.URI_PACKAGE_NAME;
        }
        userProfileEvent.setReportSource(str2);
        C79503HVp c79503HVp3 = this.LJII.LJJIIZI;
        if (c79503HVp3 != null && c79503HVp3.LIZJ == 0) {
            str3 = "data_card_linked_anchor";
        } else {
            str3 = "data_card_pk_anchor";
        }
        userProfileEvent.setReportType(str3);
        this.dataCenter.put("cmd_show_user_profile", userProfileEvent);
        HashMap hashMap = new HashMap();
        C5923dp LJJJI = LJJJI();
        if (LJJJI == null || (LIZ2 = LJJJI.LIZ()) == null || (LIZ3 = LIZ2.LIZ()) == null || (str4 = String.valueOf(LIZ3.ownerUserId)) == null) {
            str4 = "";
        }
        hashMap.put("user_id", str4);
        C79503HVp c79503HVp4 = this.LJII.LJJIIZI;
        if (c79503HVp4 != null && c79503HVp4.LIZJ == 0) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
        }
        hashMap.put("click_anchor_id", String.valueOf(this.LJII.LJJLL));
        C4574547f LIZ4 = C4574547f.LIZ();
        C8668v c8668v = new C8668v();
        c8668v.LIZIZ("live");
        c8668v.LJFF("click");
        c8668v.LIZ("live_detail");
        c8668v.m15308LJ("live_detail");
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LIZ4.LIZ("right_anchor_click", hashMap, c8668v, LJII.LJIIIZ(), Room.class, C8668v.class);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Object obj;
        DataCenter observeForever;
        DataCenter observeForever2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1972);
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(1972);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        }
        this.LIZLLL = z;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new C3VI(context);
        ViewGroup viewGroup = this.containerView;
        C3VI c3vi = this.LIZIZ;
        if (c3vi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(c3vi);
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.LIZJ = new C3VI(context2);
        ViewGroup viewGroup2 = this.containerView;
        C3VI c3vi2 = this.LIZJ;
        if (c3vi2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup2.addView(c3vi2);
        this.LJII.LJIIIZ.observeForever(this.LJIIJ);
        this.LJIIL.LJFF.observeForever(this.LJIIJJI);
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null && (observeForever = dataCenter.observeForever("cmd_pk_start_animation_showing", this)) != null && (observeForever2 = observeForever.observeForever("cmd_what_audience_join_guest_link", this)) != null) {
            observeForever2.observeForever("DATA_IS_HIDE_INTERACTION", this);
        }
        if (this.LJII.LJJLL != 0) {
            QB4.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(this.LJII.LJJLL).subscribe(new HUC(this), new HUB(this)), this.LJIIIZ);
        }
        C3VI c3vi3 = this.LIZIZ;
        if (c3vi3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c3vi3.setOnClickListener(new HUL(this));
        C3VI c3vi4 = this.LIZJ;
        if (c3vi4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c3vi4.setOnClickListener(new HUM(this));
        LIZLLL();
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            obj = dataCenter2.get("cmd_what_audience_join_guest_link", (String) Boolean.FALSE);
        } else {
            obj = null;
        }
        if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
            LIZIZ(true);
        }
        MethodCollector.m14707o(1972);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        LIZLLL();
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJI = z;
        int i = 4;
        if (!this.LJFF) {
            ViewGroup viewGroup = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            LK1.LIZIZ(viewGroup, false);
            C3VI c3vi = this.LIZIZ;
            if (c3vi == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c3vi.setVisibility(4);
            C3VI c3vi2 = this.LIZJ;
            if (c3vi2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c3vi2.setVisibility(4);
        } else if (z) {
            C3VI c3vi3 = this.LIZIZ;
            if (c3vi3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c3vi3.setVisibility(4);
            C3VI c3vi4 = this.LIZJ;
            if (c3vi4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!C79359HQb.LIZIZ.LIZ()) {
                i = 0;
            }
            c3vi4.setVisibility(i);
        } else {
            C3VI c3vi5 = this.LIZIZ;
            if (c3vi5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c3vi5.setVisibility(0);
            C3VI c3vi6 = this.LIZJ;
            if (c3vi6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c3vi6.setVisibility(4);
        }
    }

    private final void LIZIZ(boolean z) {
        int LIZJ;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams.width != -1 && layoutParams.width != -2) {
            LIZJ = layoutParams.width;
        } else {
            LIZJ = LK5.LIZJ();
        }
        C3VI c3vi = this.LIZIZ;
        if (c3vi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ViewGroup.LayoutParams layoutParams2 = c3vi.getLayoutParams();
        if (layoutParams2 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            if (z) {
                layoutParams3.bottomMargin = LK5.LIZ(8.0f) + (LIZJ / 4);
            } else {
                layoutParams3.bottomMargin -= LIZJ / 4;
            }
            C3VI c3vi2 = this.LIZIZ;
            if (c3vi2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c3vi2.setLayoutParams(layoutParams3);
            if (this.LIZJ == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return;
            }
            C3VI c3vi3 = this.LIZJ;
            if (c3vi3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ViewGroup.LayoutParams layoutParams4 = c3vi3.getLayoutParams();
            if (layoutParams4 != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                if (z) {
                    layoutParams5.bottomMargin = LK5.LIZ(8.0f) + (LIZJ / 4);
                } else {
                    layoutParams5.bottomMargin -= LIZJ / 4;
                }
                C3VI c3vi4 = this.LIZJ;
                if (c3vi4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c3vi4.setLayoutParams(layoutParams5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        Boolean bool;
        Boolean bool2;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 12).isSupported && kVData2 != null) {
            String key = kVData2.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -2068819755) {
                if (hashCode != 923724622) {
                    if (hashCode == 1080946897 && key.equals("cmd_what_audience_join_guest_link")) {
                        Boolean bool3 = (Boolean) kVData2.getData(Boolean.FALSE);
                        if (bool3 == null) {
                            bool3 = Boolean.FALSE;
                        }
                        Intrinsics.checkNotNullExpressionValue(bool3, "");
                        LIZIZ(bool3.booleanValue());
                    }
                } else if (key.equals("cmd_pk_start_animation_showing") && (bool2 = (Boolean) kVData2.getData()) != null) {
                    ViewGroup viewGroup = this.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                    LK1.LIZIZ(viewGroup, !bool2.booleanValue());
                }
            } else if (!key.equals("DATA_IS_HIDE_INTERACTION") || !C2S8.LIZIZ(Boolean.valueOf(this.LIZLLL)) || C79046HEa.LIZ().LIZJ() || (bool = (Boolean) kVData2.getData()) == null) {
            } else {
                boolean booleanValue = bool.booleanValue();
                if (PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
                    return;
                }
                C3VI c3vi = this.LIZIZ;
                if (c3vi == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c3vi, "alpha", 0.0f, 1.0f);
                C3VI c3vi2 = this.LIZJ;
                if (c3vi2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c3vi2, "alpha", 0.0f, 1.0f);
                C3VI c3vi3 = this.LIZIZ;
                if (c3vi3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c3vi3, "alpha", 1.0f, 0.0f);
                C3VI c3vi4 = this.LIZJ;
                if (c3vi4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c3vi4, "alpha", 1.0f, 0.0f);
                if (booleanValue) {
                    Intrinsics.checkNotNullExpressionValue(ofFloat3, "");
                    ofFloat3.setDuration(360L);
                    ofFloat3.start();
                    QB4.LIZ(Observable.timer(40L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new HUE(this, ofFloat2)), this.LJIIIZ);
                } else {
                    Intrinsics.checkNotNullExpressionValue(ofFloat4, "");
                    ofFloat4.setDuration(360L);
                    ofFloat4.start();
                    QB4.LIZ(Observable.timer(40L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new HUG(this, ofFloat)), this.LJIIIZ);
                }
                ofFloat3.addListener(new HUH(this, booleanValue));
                ofFloat4.addListener(new HUI(this, booleanValue));
            }
        }
    }

    public PkGuestInfoWidget(PkDataContext pkDataContext, C458614Br c458614Br, HTW htw) {
        C106862S5w.LIZ(pkDataContext, c458614Br, htw);
        this.LJII = pkDataContext;
        this.LJIIIIZZ = c458614Br;
        this.LJIIL = htw;
    }
}
