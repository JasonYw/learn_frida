package com.bytedance.android.live.liveinteract.newpk.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4255c;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4675a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.p726a.C8726j;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2S8;
import p003X.C2WC;
import p003X.C458614Br;
import p003X.C79046HEa;
import p003X.C79563HXx;
import p003X.C79564HXy;
import p003X.C79565HXz;
import p003X.C80354Hls;
import p003X.HU7;
import p003X.HU8;
import p003X.HU9;
import p003X.HX0;
import p003X.HY0;
import p003X.HY1;
import p003X.HY2;
import p003X.HY3;
import p003X.HY4;
import p003X.LK5;
import p003X.M0Q;
import p003X.View$OnClickListenerC79562HXw;

/* loaded from: classes3.dex */
public final class PkContributorWidget extends RoomWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HY0 LIZIZ;
    public boolean LIZJ;
    public final PkDataContext LJI;
    public Room LJIIIIZZ;
    public final C80354Hls LJIILIIL;
    public final C458614Br LJIILJJIL;
    public final LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
    public boolean LIZLLL = true;

    /* renamed from: LJ */
    public final List<C4721a> f26388LJ = new ArrayList();
    public final List<C4721a> LJFF = new ArrayList();
    public final Observer<AbstractC4256d> LJIIIZ = new HX0(this);
    public final Observer<AbstractC4675a> LJIIJ = new HY2(this);
    public final Observer<List<C8726j.C8727a>> LJIIJJI = new C79563HXx(this);
    public final Observer<List<C8726j.C8727a>> LJIIL = new C79564HXy(this);

    static {
        Covode.recordClassIndex(28782);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final HY0 LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (HY0) proxy.result;
        }
        HY0 hy0 = this.LIZIZ;
        if (hy0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hy0;
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        SettingKey<String> settingKey = LiveConfigSettingKeys.PK_MVP_CLICK_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String value = settingKey.getValue();
        if (!TextUtils.isEmpty(value)) {
            Intrinsics.checkNotNullExpressionValue(value, "");
            return value;
        }
        return "https://webcast.amemv.com/falcon/webcast_douyin/page/pk_mvp_rank/index.html";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.removeObserver(this);
        }
        this.LJI.LJIIIZ.removeObserver(this.LJIIIZ);
        this.LJI.LJIIZILJ.removeObserver(this.LJIIJJI);
        this.LJI.LJIJI.removeObserver(this.LJIIL);
        this.LJIILIIL.LIZJ.removeObserver(this.LJIIJ);
    }

    private final void LIZLLL() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported || !this.LJIILJJIL.LIZIZ()) {
            return;
        }
        boolean LIZLLL = this.LJIILJJIL.LIZLLL();
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = 2131185207;
            layoutParams2.bottomToBottom = -1;
            layoutParams2.topMargin = LK5.LIZ(6.0f);
            ViewGroup viewGroup2 = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
            viewGroup2.setLayoutParams(layoutParams2);
            int LIZ2 = LK5.LIZ(250.0f);
            HY0 hy0 = this.LIZIZ;
            if (hy0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LinearLayout leftContributor = hy0.getLeftContributor();
            if (leftContributor != null) {
                ViewGroup.LayoutParams layoutParams3 = leftContributor.getLayoutParams();
                if (layoutParams3 != null) {
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    layoutParams4.bottomToBottom = -1;
                    layoutParams4.leftToLeft = 0;
                    layoutParams4.topMargin = LK5.LIZ(6.0f);
                    if (LIZLLL) {
                        i = LK5.LIZ(20.0f);
                    } else {
                        i = LIZ2;
                    }
                    layoutParams4.leftMargin = i;
                    leftContributor.setLayoutParams(layoutParams4);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
            }
            HY0 hy02 = this.LIZIZ;
            if (hy02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LinearLayout rightContributor = hy02.getRightContributor();
            if (rightContributor != null) {
                ViewGroup.LayoutParams layoutParams5 = rightContributor.getLayoutParams();
                if (layoutParams5 != null) {
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    layoutParams6.rightToRight = 0;
                    layoutParams6.bottomToBottom = -1;
                    layoutParams6.topMargin = LK5.LIZ(6.0f);
                    if (LIZLLL) {
                        LIZ2 = LK5.LIZ(20.0f);
                    }
                    layoutParams6.rightMargin = LIZ2;
                    rightContributor.setLayoutParams(layoutParams6);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        HY0 hy0 = this.LIZIZ;
        if (hy0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hy0.getLeftContributor().setVisibility(4);
        HY0 hy02 = this.LIZIZ;
        if (hy02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hy02.getRightContributor().setVisibility(4);
        AnimatorSet animatorSet = new AnimatorSet();
        HY0 hy03 = this.LIZIZ;
        if (hy03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hy03.getLeftContributor(), "alpha", 0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "");
        HY0 hy04 = this.LIZIZ;
        if (hy04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hy04.getRightContributor(), "alpha", 0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat2, "");
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setStartDelay(1500L);
        animatorSet.setDuration(150L);
        animatorSet.start();
        animatorSet.addListener(new HY1(this));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        Room room;
        C2WC<Room> LIZ2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1969);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1969);
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
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LIZ2 = LJJJI2.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.LJIIIIZZ = room;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new HY0(context);
        ViewGroup viewGroup = this.containerView;
        HY0 hy0 = this.LIZIZ;
        if (hy0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(hy0, new ViewGroup.LayoutParams(-1, -1));
        HY0 hy02 = this.LIZIZ;
        if (hy02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(this.LIZJ ? (byte) 1 : (byte) 0)}, hy02, HY0.LIZ, false, 1).isSupported) {
            C116971W2r.LIZ(LayoutInflater.from(hy02.getContext()), 2131700477, (ViewGroup) hy02, true);
        }
        this.LJI.LJIIIZ.observeForever(this.LJIIIZ);
        this.LJI.LJIIZILJ.observeForever(this.LJIIJJI);
        this.LJI.LJIJI.observeForever(this.LJIIL);
        this.LJIILIIL.LIZJ.observeForever(this.LJIIJ);
        HY0 hy03 = this.LIZIZ;
        if (hy03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hy03.getLeftContributor().setOnClickListener(new HY3(this));
        HY0 hy04 = this.LIZIZ;
        if (hy04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hy04.getRightContributor().setOnClickListener(new HY4(this));
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.observeForever("DATA_IS_HIDE_INTERACTION", this);
        }
        LIZLLL();
        MethodCollector.m14707o(1969);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        LIZLLL();
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (z) {
            HY0 hy0 = this.LIZIZ;
            if (hy0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hy0.getLeftContributor().setVisibility(4);
            HY0 hy02 = this.LIZIZ;
            if (hy02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hy02.getRightContributor().setVisibility(4);
            return;
        }
        HY0 hy03 = this.LIZIZ;
        if (hy03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hy03.getLeftContributor().setVisibility(0);
        HY0 hy04 = this.LIZIZ;
        if (hy04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hy04.getRightContributor().setVisibility(0);
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        Boolean bool;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 6).isSupported && kVData2 != null) {
            String key = kVData2.getKey();
            if (key.hashCode() == -2068819755 && key.equals("DATA_IS_HIDE_INTERACTION") && C2S8.LIZIZ(Boolean.valueOf(this.LIZJ)) && !C79046HEa.LIZ().LIZJ() && (bool = (Boolean) kVData2.getData()) != null) {
                boolean booleanValue = bool.booleanValue();
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    HY0 hy0 = this.LIZIZ;
                    if (hy0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hy0.getLeftContributor(), "alpha", 0.0f, 1.0f);
                    HY0 hy02 = this.LIZIZ;
                    if (hy02 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hy02.getRightContributor(), "alpha", 0.0f, 1.0f);
                    HY0 hy03 = this.LIZIZ;
                    if (hy03 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hy03.getLeftContributor(), "alpha", 1.0f, 0.0f);
                    HY0 hy04 = this.LIZIZ;
                    if (hy04 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hy04.getRightContributor(), "alpha", 1.0f, 0.0f);
                    animatorSet.setDuration(360L);
                    if (booleanValue) {
                        HY0 hy05 = this.LIZIZ;
                        if (hy05 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy05.getLeftContributor().setVisibility(0);
                        HY0 hy06 = this.LIZIZ;
                        if (hy06 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy06.getRightContributor().setVisibility(0);
                        HY0 hy07 = this.LIZIZ;
                        if (hy07 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy07.getLeftContributor().setAlpha(1.0f);
                        HY0 hy08 = this.LIZIZ;
                        if (hy08 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy08.getRightContributor().setAlpha(1.0f);
                        animatorSet.playTogether(ofFloat3, ofFloat4);
                    } else {
                        HY0 hy09 = this.LIZIZ;
                        if (hy09 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy09.getLeftContributor().setVisibility(0);
                        HY0 hy010 = this.LIZIZ;
                        if (hy010 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy010.getRightContributor().setVisibility(0);
                        HY0 hy011 = this.LIZIZ;
                        if (hy011 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy011.getLeftContributor().setAlpha(0.0f);
                        HY0 hy012 = this.LIZIZ;
                        if (hy012 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hy012.getRightContributor().setAlpha(0.0f);
                        animatorSet.playTogether(ofFloat, ofFloat2);
                    }
                    animatorSet.start();
                    animatorSet.addListener(new C79565HXz(this, booleanValue));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x030d, code lost:
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02f3, code lost:
        r0 = ((com.bytedance.android.live.user.IUserService) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.live.user.IUserService.class)).user().LIZ();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0 = r0.getUserAttr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x030a, code lost:
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x030c, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0312, code lost:
        if (r0.LIZJ == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0314, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0317, code lost:
        r7 = null;
        r1 = (com.bytedance.android.live.base.model.user.User) r20.dataCenter.get("data_user_in_room", (java.lang.String) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0322, code lost:
        if (r1 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0328, code lost:
        if (r1.getUserAttr() == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x032a, code lost:
        r0 = r1.getUserAttr();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0333, code lost:
        if (r0.LIZJ == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0337, code lost:
        r5 = ((com.bytedance.android.live.user.IUserService) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.live.user.IUserService.class)).user().LIZIZ();
        r0 = r20.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0349, code lost:
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034f, code lost:
        if (r5 != r0.ownerUserId) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0353, code lost:
        r6 = r20.LJII.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c0, code lost:
        if (r21 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x036b, code lost:
        r0 = r20.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x036d, code lost:
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x036f, code lost:
        r6 = r0.ownerUserId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0371, code lost:
        r0 = r20.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0373, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0375, code lost:
        r0 = r0.getOwner();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0379, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x037b, code lost:
        r14 = r0.getSecUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x037f, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0367, code lost:
        if (r12 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (r12 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (r1 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        r6 = r1.getId();
        r14 = r1.getSecUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_DOUBLE_PK_CONTRIBUTION_LIST_LYNX_ENABLE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0 = r0.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r9 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
        if (r0.booleanValue() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
        r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_DOUBLE_PK_CONTRIBUTION_LIST_LYNX_URL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r7 = r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
        r6 = new java.util.HashMap();
        r6.put("channel_id", java.lang.String.valueOf(r20.LJII.LIZLLL));
        r6.put("anchor_id", java.lang.String.valueOf(r4));
        r6.put("sec_anchor_id", r12);
        r0 = r20.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011e, code lost:
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
        r0 = java.lang.Long.valueOf(r0.ownerUserId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
        r6.put("owner_user_id", java.lang.String.valueOf(r0));
        r6.put("user_id", java.lang.String.valueOf(((com.bytedance.android.live.user.IUserService) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.live.user.IUserService.class)).user().LIZIZ()));
        ((com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler.class)).handle(r20.context, p003X.C414642b4.LIZIZ(r7, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0203, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
        r5 = 0;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0165, code lost:
        if (com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[r5], r20, com.bytedance.android.live.liveinteract.newpk.widget.PkContributorWidget.LIZ, r5, 10).isSupported != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
        r5 = r20.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0169, code lost:
        if (r5 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
        r4 = new java.util.HashMap();
        r4.put("anchor_id", java.lang.String.valueOf(r5.ownerUserId));
        r4.put("room_id", java.lang.String.valueOf(r5.getId()));
        r4.put("channel_id", java.lang.String.valueOf(r20.LJII.LIZLLL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0193, code lost:
        if (r20.LIZJ == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0195, code lost:
        r9 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0197, code lost:
        r4.put("is_anchor", r9);
        r4.put("click_user_id", java.lang.String.valueOf(((com.bytedance.android.live.user.IUserService) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.live.user.IUserService.class)).user().LIZIZ()));
        r1 = p003X.AbstractC78050Gpo.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b9, code lost:
        if (r1 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c1, code lost:
        if (r1.mo15716LJ(64) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c8, code lost:
        if (r1.mo15716LJ(4) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ca, code lost:
        r1 = r20.LJII.LJIJJLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ce, code lost:
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d1, code lost:
        if (r1 != 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d3, code lost:
        r19 = "random_pk";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
        r19 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f2, code lost:
        r19 = "manual_pk";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fb, code lost:
        if (r1.mo15716LJ(16) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fd, code lost:
        r19 = "non_connection_screen";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d9, code lost:
        if (android.text.TextUtils.isEmpty(r19) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01db, code lost:
        r4.put("connection_type", r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e2, code lost:
        p003X.C4574547f.LIZ().LIZ("livesdk_pk_list_click", r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0206, code lost:
        r12 = android.net.Uri.parse(LIZIZ()).buildUpon().appendQueryParameter("channel_id", java.lang.String.valueOf(r20.LJII.LIZLLL)).appendQueryParameter("anchor_id", java.lang.String.valueOf(r4)).appendQueryParameter("sec_anchor_id", r12).appendQueryParameter("opposite_anchor_id", java.lang.String.valueOf(r6)).appendQueryParameter("opposite_sec_anchor_id", r14).appendQueryParameter("enable_show_contribute_list_optimize", r9);
        r1 = com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[0], r20, com.bytedance.android.live.liveinteract.newpk.widget.PkContributorWidget.LIZ, false, 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024d, code lost:
        if (r1.isSupported == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x024f, code lost:
        r0 = ((java.lang.Boolean) r1.result).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0257, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0258, code lost:
        if (r0 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x025a, code lost:
        r1 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025c, code lost:
        r4 = r12.appendQueryParameter("is_admin", r1);
        r0 = r20.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0264, code lost:
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0266, code lost:
        r0 = java.lang.Long.valueOf(r0.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026e, code lost:
        r6 = r4.appendQueryParameter("room_id", java.lang.String.valueOf(r0)).appendQueryParameter("user_id", java.lang.String.valueOf(((com.bytedance.android.live.user.IUserService) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.live.user.IUserService.class)).user().LIZIZ()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0290, code lost:
        if (r18 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x029a, code lost:
        if (r18.longValue() == (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a5, code lost:
        r10 = (int) p003X.LK5.LJFF(p003X.LK5.LIZJ());
        r0 = r6.build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r5 = ((com.bytedance.android.live.browser.IBrowserService) com.bytedance.android.live.utility.ServiceManager.getService(com.bytedance.android.live.browser.IBrowserService.class)).buildWebDialog(r0);
        r5.LIZJ(r10);
        r5.LIZLLL((r10 / 16) * 15);
        r5.LIZ(8, 8, 0, 0);
        r5.LJI(80);
        r5.LJIIIIZZ(true);
        r1 = r5.LIZ();
        r0 = r20.context;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e6, code lost:
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02e8, code lost:
        p003X.C3FN.LIZ(r1, (androidx.fragment.app.FragmentActivity) r0);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03bc, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x029c, code lost:
        r6.appendQueryParameter("mvp_id", java.lang.String.valueOf(r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02f0, code lost:
        r0 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(boolean r21) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.newpk.widget.PkContributorWidget.LIZ(boolean):void");
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.widget.PkContributorWidget$a */
    /* loaded from: classes3.dex */
    public final class C4721a {
        public static ChangeQuickRedirect LIZ;
        public final View LIZIZ;
        public final VHeadView LIZJ;
        public final TextView LIZLLL;

        /* renamed from: LJ */
        public final View f26389LJ;
        public final View LJFF;
        public final /* synthetic */ PkContributorWidget LJI;

        static {
            Covode.recordClassIndex(28783);
        }

        public C4721a(PkContributorWidget pkContributorWidget, View view) {
            C106862S5w.LIZ(view);
            this.LJI = pkContributorWidget;
            this.LJFF = view;
            View findViewById = this.LJFF.findViewById(2131179488);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZIZ = findViewById;
            View findViewById2 = this.LJFF.findViewById(2131165351);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LIZJ = (VHeadView) findViewById2;
            View findViewById3 = this.LJFF.findViewById(2131195102);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.LIZLLL = (TextView) findViewById3;
            View findViewById4 = this.LJFF.findViewById(2131179254);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.f26389LJ = findViewById4;
        }
    }

    private void LIZ(boolean z, boolean z2) {
        MethodCollector.m14708i(1971);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported) {
            MethodCollector.m14707o(1971);
            return;
        }
        if (z) {
            HY0 hy0 = this.LIZIZ;
            if (hy0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hy0.getLeftContributor().removeAllViews();
            this.f26388LJ.clear();
            LayoutInflater from = LayoutInflater.from(this.context);
            HY0 hy02 = this.LIZIZ;
            if (hy02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            View LIZ2 = C116971W2r.LIZ(from, 2131700481, (ViewGroup) hy02.getLeftContributor(), true);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            C4721a c4721a = new C4721a(this, LIZ2);
            c4721a.LIZIZ.setBackgroundResource(2130854927);
            c4721a.LIZJ.setImageResource(2130856617);
            this.f26388LJ.add(c4721a);
        }
        if (z2) {
            HY0 hy03 = this.LIZIZ;
            if (hy03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hy03.getRightContributor().removeAllViews();
            this.LJFF.clear();
            LayoutInflater from2 = LayoutInflater.from(this.context);
            HY0 hy04 = this.LIZIZ;
            if (hy04 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            View LIZ3 = C116971W2r.LIZ(from2, 2131700481, (ViewGroup) hy04.getRightContributor(), true);
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            C4721a c4721a2 = new C4721a(this, LIZ3);
            c4721a2.LIZIZ.setBackgroundResource(2130854927);
            c4721a2.LIZJ.setImageResource(2130856618);
            this.LJFF.add(c4721a2);
        }
        MethodCollector.m14707o(1971);
    }

    public PkContributorWidget(PkDataContext pkDataContext, C80354Hls c80354Hls, C458614Br c458614Br) {
        C106862S5w.LIZ(pkDataContext, c80354Hls, c458614Br);
        this.LJI = pkDataContext;
        this.LJIILIIL = c80354Hls;
        this.LJIILJJIL = c458614Br;
        new CompositeDisposable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(List<? extends C8726j.C8727a> list, List<C4721a> list2, LinearLayout linearLayout, boolean z) {
        int i = 1970;
        MethodCollector.m14708i(1970);
        int i2 = 4;
        char c = 2;
        if (PatchProxy.proxy(new Object[]{list, list2, linearLayout, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(1970);
        } else if (Lists.isEmpty(list)) {
            if (z != 0) {
                LIZ(true, false);
                MethodCollector.m14707o(1970);
                return;
            }
            LIZ(false, true);
            MethodCollector.m14707o(1970);
        } else {
            if (list2.size() > list.size()) {
                if (z != 0) {
                    LIZ(true, false);
                } else {
                    LIZ(false, true);
                }
            }
            while (linearLayout.getChildCount() < list.size()) {
                View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.context), 2131700481, (ViewGroup) linearLayout, false);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (z != 0) {
                    linearLayout.addView(LIZ2, 0);
                } else {
                    linearLayout.addView(LIZ2);
                }
                list2.add(new C4721a(this, LIZ2));
            }
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                C8726j.C8727a c8727a = list.get(i3);
                C4721a c4721a = list2.get(i3);
                AbstractC4255c value = this.LJI.LJIJJLI.getValue();
                if (value == null) {
                    value = HU9.LIZIZ;
                }
                Intrinsics.checkNotNullExpressionValue(value, "");
                Object[] objArr = new Object[i2];
                objArr[0] = c8727a;
                objArr[1] = Byte.valueOf((byte) z);
                objArr[c] = Integer.valueOf(i3);
                objArr[3] = value;
                if (!PatchProxy.proxy(objArr, c4721a, C4721a.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(c8727a, value);
                    c4721a.LIZLLL.setText(String.valueOf(i3 + 1));
                    try {
                        Context context = c4721a.LJI.context;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        c4721a.LIZLLL.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/pk_random.ttf"));
                    } catch (Exception e) {
                        ALogger.m15801d("PkContributorWidget", "MvpViewHolder bind Exception = " + e);
                    }
                    M0Q.LIZIZ(c4721a.LIZJ, c8727a.LIZLLL);
                    if (i3 != 0) {
                        if (i3 != 1) {
                            c4721a.LIZIZ.setBackgroundResource(2130854927);
                            c4721a.LIZLLL.setTextColor(CastProtectorUtils.parseColor("#FFCFB5"));
                        } else {
                            c4721a.LIZIZ.setBackgroundResource(2130854926);
                            c4721a.LIZLLL.setTextColor(CastProtectorUtils.parseColor("#DAECFD"));
                        }
                    } else {
                        c4721a.LIZIZ.setBackgroundResource(2130854925);
                        c4721a.LIZLLL.setTextColor(CastProtectorUtils.parseColor("#FFF1B1"));
                    }
                    c4721a.LIZLLL.setVisibility(0);
                    c4721a.LIZIZ.setVisibility(0);
                    AbstractC4256d value2 = c4721a.LJI.LJI.LJIIIZ.getValue();
                    if (i3 != 0 || (z == 0 ? !Intrinsics.areEqual(value, HU8.LIZIZ) : !Intrinsics.areEqual(value, HU7.LIZIZ)) || (!Intrinsics.areEqual(value2, AbstractC4256d.C4260d.LIZIZ) && !Intrinsics.areEqual(value2, AbstractC4256d.C4259c.LIZIZ))) {
                        c4721a.f26389LJ.setVisibility(8);
                    } else {
                        c4721a.f26389LJ.setVisibility(0);
                        c4721a.LIZLLL.setVisibility(8);
                    }
                    c4721a.LIZJ.setOnClickListener(new View$OnClickListenerC79562HXw(c4721a, z, c8727a));
                }
                i3++;
                i = 1970;
                i2 = 4;
                c = 2;
            }
            MethodCollector.m14707o(i);
        }
    }
}
