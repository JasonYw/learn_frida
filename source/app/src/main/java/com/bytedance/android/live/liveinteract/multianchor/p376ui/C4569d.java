package com.bytedance.android.live.liveinteract.multianchor.p376ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.live.liveinteract.widget.widget.PKLastBattleResultLayout;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.common.AnchorPauseTipsView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8653e;
import com.bytedance.android.livesdk.log.model.C8658k;
import com.bytedance.android.livesdk.log.model.C8661n;
import com.bytedance.android.livesdk.log.model.C8665r;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.model.C8669w;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.C9627at;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2S8;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C418792hl;
import p003X.C4574547f;
import p003X.C47A;
import p003X.C79359HQb;
import p003X.C79506HVs;
import p003X.C81280I1y;
import p003X.HRS;
import p003X.HV6;
import p003X.HVA;
import p003X.HVC;
import p003X.HVD;
import p003X.HVE;
import p003X.HVF;
import p003X.HVH;
import p003X.HVI;
import p003X.HVM;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;
import p003X.QFD;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.ui.d */
/* loaded from: classes3.dex */
public final class C4569d extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public static final int LJIILLIIL = 2130857643;
    public static final int LJIIZILJ = 2130857642;
    public static final int LJIJ = 1;
    public static final int LJIJI = 2;
    public static final int LJJIZ = 0;
    public String LIZIZ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public View f26369LJ;
    public View LJFF;
    public ImageView LJI;
    public View LJII;
    public HSImageView LJIIIIZZ;
    public ConstraintLayout LJIIIZ;
    public boolean LJIIJ;
    public PKLastBattleResultLayout LJIIL;
    public boolean LJIILIIL;
    public HV6 LJIILL;
    public SurfaceView LJIJJ;
    public AnchorLinkUser LJIJJLI;
    public Disposable LJIL;
    public boolean LJJ;
    public HSImageView LJJI;
    public TextView LJJIFFI;
    public HSImageView LJJII;
    public DataCenter LJJIII;
    public AnchorPauseTipsView LJJIIJ;
    public View LJJIIJZLJL;
    public HSImageView LJJIIZ;
    public View LJJIIZI;
    public C9627at LJJIJIIJI;
    public Integer LJJIJIIJIL;
    public Room LJJIJIL;
    public AbstractC4570a LJJIJL;
    public View LJJIJLIJ;
    public int LJJIL;
    public CompositeDisposable LIZJ = new CompositeDisposable();
    public boolean LJJIJ = true;
    public int LJIIJJI = LJJIZ;
    public int LJIILJJIL = C79506HVs.LIZ();

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.ui.d$a */
    /* loaded from: classes3.dex */
    public interface AbstractC4570a {
        static {
            Covode.recordClassIndex(28362);
        }

        void LIZ(String str, boolean z, long j);

        void LJI();
    }

    public final AnchorLinkUser getAnchorLinkUser() {
        return this.LJIJJLI;
    }

    public final CompositeDisposable getCompositeDisposable() {
        return this.LIZJ;
    }

    public final String getInteractId() {
        return this.LIZIZ;
    }

    public final AbstractC4570a getListener() {
        return this.LJJIJL;
    }

    public final Disposable getMDisposable() {
        return this.LJIL;
    }

    public final boolean getMIsAnchor() {
        return this.LJJ;
    }

    public final Integer getMPosition() {
        return this.LJJIJIIJIL;
    }

    public final C9627at getMSeiRegion() {
        return this.LJJIJIIJI;
    }

    public final Room getRoom() {
        return this.LJJIJIL;
    }

    public final SurfaceView getSurfaceView() {
        return this.LJIJJ;
    }

    public final void LIZ(boolean z, int i) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        LIZJ(i);
        LIZIZ(i);
        if (z) {
            AnchorPauseTipsView anchorPauseTipsView = this.LJJIIJ;
            if (anchorPauseTipsView == null) {
                return;
            }
            anchorPauseTipsView.setVisibility(4);
            return;
        }
        if (this.LJJ) {
            String str = this.LIZIZ;
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            if (Intrinsics.areEqual(str, LJII.LIZIZ())) {
                return;
            }
        }
        AnchorPauseTipsView anchorPauseTipsView2 = this.LJJIIJ;
        if (anchorPauseTipsView2 == null) {
            return;
        }
        anchorPauseTipsView2.setVisibility(0);
    }

    public final void LIZ(boolean z, int i, int i2) {
        int LIZ2;
        int LIZ3;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 26).isSupported) {
            return;
        }
        this.LJJIJ = z;
        ConstraintLayout constraintLayout = this.LJIIIZ;
        if (constraintLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (this.LJJIJ) {
            LIZ2 = getAnchorInfoMarginBottom();
        } else {
            if (i2 > 2) {
                if (i2 == 3) {
                    if (i != 1) {
                        LIZ3 = LK5.LIZ(64.0f);
                    } else {
                        LIZ3 = getAnchorInfoMarginBottom();
                    }
                    layoutParams2.bottomMargin = LIZ3;
                } else if (i2 == 4) {
                    if (i <= 1) {
                        LIZ2 = getAnchorInfoMarginBottom();
                    }
                }
                this.LJIIIZ.setLayoutParams(layoutParams2);
            }
            LIZ2 = LK5.LIZ(64.0f);
        }
        layoutParams2.bottomMargin = LIZ2;
        this.LJIIIZ.setLayoutParams(layoutParams2);
    }

    static {
        Covode.recordClassIndex(28358);
    }

    private final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_ENABLE_MULTI_PK_AUDIENCE_ENHANCEMENT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue() && !this.LJJ) {
            return false;
        }
        return true;
    }

    private final void LIZJ() {
        View view;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (view = this.LJJIJLIJ) != null && !LIZ() && LIZIZ() && view.getVisibility() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new HVD(this, view));
        }
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C47A.LIZIZ() || this.LJJ) {
            return false;
        }
        return true;
    }

    public final int getAnchorInfoMarginBottom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LIZ()) {
            return LK5.LIZ(16.0f);
        }
        return LK5.LIZ(8.0f);
    }

    public final Long getUid() {
        User LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        AnchorLinkUser anchorLinkUser = this.LJIJJLI;
        if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
            return Long.valueOf(LIZ2.getId());
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        Disposable disposable = this.LJIL;
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
        this.LIZJ.clear();
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f26369LJ.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.leftToLeft = 0;
            layoutParams2.rightToRight = -1;
            this.f26369LJ.setLayoutParams(layoutParams2);
            this.f26369LJ.setPadding(LK5.LIZ(2.0f), 0, LK5.LIZ(8.0f), 0);
            View view = this.LJJIJLIJ;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 != null) {
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    if (this.f26369LJ.getVisibility() != 0) {
                        layoutParams4.leftToLeft = 0;
                        layoutParams4.leftToRight = -1;
                    } else {
                        layoutParams4.leftToRight = 2131181656;
                        layoutParams4.leftToLeft = -1;
                        layoutParams4.leftMargin = LK5.LIZ(10.0f);
                    }
                    view.setLayoutParams(layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void setAnchorLinkUser(AnchorLinkUser anchorLinkUser) {
        this.LJIJJLI = anchorLinkUser;
    }

    public final void setListener(AbstractC4570a abstractC4570a) {
        this.LJJIJL = abstractC4570a;
    }

    public final void setMDisposable(Disposable disposable) {
        this.LJIL = disposable;
    }

    public final void setMIsAnchor(boolean z) {
        this.LJJ = z;
    }

    public final void setMPosition(Integer num) {
        this.LJJIJIIJIL = num;
    }

    public final void setMSeiRegion(C9627at c9627at) {
        this.LJJIJIIJI = c9627at;
    }

    public final void setRoom(Room room) {
        this.LJJIJIL = room;
    }

    public final void setCompositeDisposable(CompositeDisposable compositeDisposable) {
        if (PatchProxy.proxy(new Object[]{compositeDisposable}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(compositeDisposable);
        this.LIZJ = compositeDisposable;
    }

    public final void setCoverVisible(int i) {
        View view;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18).isSupported && (view = this.LJJIIJZLJL) != null) {
            view.setVisibility(i);
        }
    }

    public final void LIZLLL(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJIIIZ.getViewTreeObserver().addOnGlobalLayoutListener(new HVE(this, i));
    }

    public final void setLastBattleVisible(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 32).isSupported) {
            return;
        }
        PKLastBattleResultLayout pKLastBattleResultLayout = this.LJIIL;
        if (pKLastBattleResultLayout != null) {
            LK1.LIZ(pKLastBattleResultLayout, z);
        }
        this.LJIILIIL = z;
        if (z && !C79359HQb.LIZIZ.LIZ()) {
            PKLastBattleResultLayout pKLastBattleResultLayout2 = this.LJIIL;
            if (pKLastBattleResultLayout2 != null) {
                pKLastBattleResultLayout2.LIZ();
            }
            this.LJIILIIL = false;
        }
    }

    public final void LIZ(int i) {
        Long l;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJIILJJIL = i;
        if (i != C79506HVs.LIZIZ() && i != C79506HVs.LIZJ()) {
            this.LJJIII.put("cmd_multi_room_pk_state_change", Boolean.FALSE);
        } else {
            this.LJJIII.put("cmd_multi_room_pk_state_change", Boolean.TRUE);
        }
        if (LIZ()) {
            LIZLLL();
        }
        if (LIZIZ()) {
            View view = this.f26369LJ;
            AnchorLinkUser anchorLinkUser = this.LJIJJLI;
            Long l2 = null;
            if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
                l = Long.valueOf(LIZ2.getId());
            } else {
                l = null;
            }
            Room room = this.LJJIJIL;
            if (room != null) {
                l2 = Long.valueOf(room.ownerUserId);
            }
            LK1.LIZ(view, true ^ Intrinsics.areEqual(l, l2));
        }
    }

    public final void LIZIZ(int i) {
        Long l;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
        if (i == 2 || LIZ()) {
            AnchorLinkUser anchorLinkUser = this.LJIJJLI;
            Long l2 = null;
            if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
                l = Long.valueOf(LIZ2.getId());
            } else {
                l = null;
            }
            if (currentRoom != null) {
                l2 = Long.valueOf(currentRoom.ownerUserId);
            }
            if (!Intrinsics.areEqual(l, l2)) {
                this.LJJI.setVisibility(0);
                return;
            }
        }
        this.LJJI.setVisibility(8);
    }

    public final void setLeftBottomView(View view) {
        ViewParent parent;
        MethodCollector.m14708i(1948);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 28).isSupported) {
            MethodCollector.m14707o(1948);
            return;
        }
        View view2 = this.LJJIJLIJ;
        if (!PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 29).isSupported && view2 != null && (parent = view2.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view2);
        }
        this.LJJIJLIJ = null;
        if (view == null) {
            MethodCollector.m14707o(1948);
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.leftToLeft = 0;
        layoutParams.bottomToBottom = 0;
        this.LJIIIZ.addView(view, layoutParams);
        this.LJJIJLIJ = view;
        MethodCollector.m14707o(1948);
    }

    public final void LIZ(SurfaceView surfaceView) {
        MethodCollector.m14708i(1947);
        if (PatchProxy.proxy(new Object[]{surfaceView}, this, LIZ, false, 16).isSupported) {
            MethodCollector.m14707o(1947);
        } else if (surfaceView == null) {
            MethodCollector.m14707o(1947);
        } else {
            removeView(this.LJIJJ);
            ViewParent parent = surfaceView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(surfaceView);
            }
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.LJIJJ = surfaceView;
            addView(this.LJIJJ, 0);
            MethodCollector.m14707o(1947);
        }
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (z) {
            this.LJI.setVisibility(8);
            this.LJII.setVisibility(8);
        } else {
            this.LJI.setVisibility(0);
            this.LJII.setVisibility(0);
        }
        if (LIZIZ()) {
            LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r3) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ(int r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r3[r2] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p376ui.C4569d.LIZ
            r0 = 15
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.Class<com.bytedance.android.live.room.IRoomService> r0 = com.bytedance.android.live.room.IRoomService.class
            com.bytedance.android.live.base.IService r1 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            com.bytedance.android.livesdkapi.depend.live.ILiveRoomService r1 = (com.bytedance.android.livesdkapi.depend.live.ILiveRoomService) r1
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r1.getCurrentRoom()
            r0 = 2
            r5 = 16
            if (r7 == r0) goto L51
            r0 = 4
            if (r7 >= r0) goto L6d
            com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser r0 = r6.LJIJJLI
            r3 = 0
            if (r0 == 0) goto L6b
            com.bytedance.android.live.base.model.user.User r0 = r0.LIZ()
            if (r0 == 0) goto L6b
            long r0 = r0.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L43:
            if (r4 == 0) goto L4b
            long r0 = r4.ownerUserId
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L4b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r0 == 0) goto L6d
        L51:
            com.bytedance.android.livesdk.common.AnchorPauseTipsView r4 = r6.LJJIIJ
            int r3 = p003X.LK1.LIZLLL(r5)
            r0 = 56
            int r2 = p003X.LK1.LIZLLL(r0)
            int r1 = p003X.LK1.LIZLLL(r5)
            r0 = 72
            int r0 = p003X.LK1.LIZLLL(r0)
            r4.setPadding(r3, r2, r1, r0)
            return
        L6b:
            r2 = r3
            goto L43
        L6d:
            com.bytedance.android.livesdk.common.AnchorPauseTipsView r4 = r6.LJJIIJ
            int r3 = p003X.LK1.LIZLLL(r5)
            r0 = 13
            int r2 = p003X.LK1.LIZLLL(r0)
            int r1 = p003X.LK1.LIZLLL(r5)
            r0 = 32
            int r0 = p003X.LK1.LIZLLL(r0)
            r4.setPadding(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p376ui.C4569d.LIZJ(int):void");
    }

    public final void LIZ(boolean z) {
        Long l;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
        AnchorLinkUser anchorLinkUser = this.LJIJJLI;
        Long l2 = null;
        if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
            l = Long.valueOf(LIZ2.getId());
        } else {
            l = null;
        }
        if (currentRoom != null) {
            l2 = Long.valueOf(currentRoom.ownerUserId);
        }
        if (!Intrinsics.areEqual(l, l2) && z) {
            if (!LIZ()) {
                this.LJIIIIZZ.setImageResource(LJIIZILJ);
                this.LJJIIZI.setVisibility(0);
                return;
            }
            this.LJJIIZ.setImageResource(LJIIZILJ);
            this.LJJIIZ.setVisibility(0);
            return;
        }
        this.LJJIIZI.setVisibility(8);
        this.LJJIIZ.setVisibility(8);
    }

    public final void LIZ(User user, boolean z) {
        String str;
        String str2;
        C2WC<Boolean> LLFII;
        if (PatchProxy.proxy(new Object[]{user, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", String.valueOf(user.getId()));
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        String linkConnectionType = ((IInteractService) service).getLinkConnectionType();
        Intrinsics.checkNotNullExpressionValue(linkConnectionType, "");
        hashMap.put("connection_type", linkConnectionType);
        IService service2 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        String linkAnchorCount = ((IInteractService) service2).getLinkAnchorCount();
        Intrinsics.checkNotNullExpressionValue(linkAnchorCount, "");
        hashMap.put("anchor_cnt", linkAnchorCount);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LLFII = LIZ2.LLFII()) != null && LLFII.LIZ().booleanValue()) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("if_clear_mode", str);
        C4574547f.LIZ().LIZ("livesdk_follow", hashMap, Room.class, new C8653e(1), C8668v.class, C8665r.class, C8669w.class, C8658k.LIZ(), C8661n.class);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("follow_anchor_id", String.valueOf(user.getId()));
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "audience";
        }
        hashMap2.put("follow_identity", str2);
        hashMap2.put("pk_time", String.valueOf(LinkCrossRoomDataHolder.LJII().LJIIJJI));
        hashMap2.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.LJII().f26249LJ));
        C4574547f LIZ3 = C4574547f.LIZ();
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LIZ3.LIZ("livesdk_connection_counterpart_follow", hashMap2, LJII.LJIIIIZZ(), Room.class, C8668v.class);
        if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
            C3VF user2 = ((IUserService) ServiceManager.getService(IUserService.class)).user();
            Context context = getContext();
            QFD LIZ4 = C9284h.LIZ();
            LIZ4.LIZ(LK5.LIZ(2131582720));
            LIZ4.LIZ(-1);
            LIZ4.LIZLLL(PushConstants.URI_PACKAGE_NAME);
            LIZ4.LIZJ("guest");
            user2.LIZ(context, LIZ4.LIZ()).subscribe(new C81280I1y());
            return;
        }
        this.LIZJ.add(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ(C418792hl.LIZ().LIZ(user.getId()).LIZJ()).subscribe(HVM.LIZ, new HVF(this)));
    }

    public final void LIZ(AnchorLinkUser anchorLinkUser, int i) {
        Long l;
        Long l2;
        User LIZ2;
        Boolean bool;
        ImageModel imageModel;
        User LIZ3;
        String str;
        User LIZ4;
        User LIZ5;
        String str2;
        User LIZ6;
        Boolean bool2;
        C2WD<Boolean> LJFF;
        User LIZ7;
        Long l3;
        Long l4;
        User LIZ8;
        boolean z = false;
        int i2 = 0;
        if (PatchProxy.proxy(new Object[]{anchorLinkUser, Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIJJLI = anchorLinkUser;
        ImageModel imageModel2 = null;
        if (this.LJJ) {
            if (anchorLinkUser != null && (LIZ8 = anchorLinkUser.LIZ()) != null) {
                l3 = Long.valueOf(LIZ8.getId());
            } else {
                l3 = null;
            }
            Room room = this.LJJIJIL;
            if (room != null) {
                l4 = Long.valueOf(room.ownerUserId);
            } else {
                l4 = null;
            }
            if (!Intrinsics.areEqual(l3, l4)) {
                this.LJJIIZI.setVisibility(0);
            } else {
                this.LJJIIZI.setVisibility(8);
            }
        }
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
        if (anchorLinkUser != null && (LIZ7 = anchorLinkUser.LIZ()) != null) {
            l = Long.valueOf(LIZ7.getId());
        } else {
            l = null;
        }
        if (currentRoom != null) {
            l2 = Long.valueOf(currentRoom.ownerUserId);
        } else {
            l2 = null;
        }
        if (Intrinsics.areEqual(l, l2)) {
            setClickable(false);
            UIUtils.setViewVisibility(this.f26369LJ, 4);
            UIUtils.setViewVisibility(this.LJFF, 4);
            UIUtils.setViewVisibility(this.f26369LJ, 8);
            UIUtils.setViewVisibility(this.LIZLLL, 4);
            UIUtils.setViewVisibility(this.LJJI, 4);
            UIUtils.setViewVisibility(this.LJI, 8);
            UIUtils.setViewVisibility(this.LJII, 8);
            ConstraintLayout constraintLayout = this.LJIIIZ;
            if (C79359HQb.LIZIZ.LIZ()) {
                i2 = 4;
            }
            constraintLayout.setVisibility(i2);
            PKLastBattleResultLayout pKLastBattleResultLayout = this.LJIIL;
            if (pKLastBattleResultLayout != null) {
                C4536j m23737LJ = C4536j.LJJIJIIJI.m23737LJ();
                if (m23737LJ != null && (LJFF = m23737LJ.LJFF()) != null) {
                    bool2 = LJFF.LIZ();
                } else {
                    bool2 = null;
                }
                LK1.LIZ(pKLastBattleResultLayout, Intrinsics.areEqual(bool2, Boolean.TRUE));
            }
        } else {
            setClickable(true);
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
                if (!proxy.isSupported ? !((bool = (Boolean) this.LJJIII.get("DATA_IS_HIDE_INTERACTION", (String) Boolean.FALSE)) == null || !bool.booleanValue() || !C2S8.LIZIZ(Boolean.valueOf(this.LJJ))) : ((Boolean) proxy.result).booleanValue()) {
                    this.f26369LJ.setVisibility(4);
                    this.LJFF.setVisibility(0);
                } else {
                    this.f26369LJ.setVisibility(0);
                    this.LJFF.setVisibility(4);
                }
                if (C79359HQb.LIZIZ.LIZ()) {
                    this.LJIIIZ.setVisibility(4);
                    this.LJFF.setVisibility(4);
                } else {
                    this.LJIIIZ.setVisibility(0);
                }
            }
            UIUtils.setViewVisibility(this.LIZLLL, 0);
            UIUtils.setViewVisibility(this.LJJI, 0);
            PKLastBattleResultLayout pKLastBattleResultLayout2 = this.LJIIL;
            if (pKLastBattleResultLayout2 != null) {
                LK1.LIZ((View) pKLastBattleResultLayout2, false);
            }
            if (i >= 3 && !LIZ()) {
                UIUtils.setViewVisibility(this.LJJI, 8);
                UIUtils.setViewVisibility(this.LJJII, 8);
            }
            if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
                long id = LIZ2.getId();
                int i3 = this.LJIIJJI;
                if (i3 == LJJIZ) {
                    if (!PatchProxy.proxy(new Object[]{anchorLinkUser, new Long(id)}, this, LIZ, false, 8).isSupported) {
                        this.LIZJ.add(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(id).map(HVH.LIZIZ).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new HVC(this, anchorLinkUser), HVI.LIZ));
                    }
                } else {
                    if (i3 == LJIJI) {
                        z = true;
                    }
                    LIZIZ(z);
                }
            }
        }
        TextView textView = this.LIZLLL;
        if (textView != null) {
            if (anchorLinkUser != null && (LIZ6 = anchorLinkUser.LIZ()) != null) {
                str2 = LIZ6.getRealNickName();
            } else {
                str2 = null;
            }
            textView.setText(str2);
        }
        HSImageView hSImageView = this.LJJI;
        if (anchorLinkUser != null && (LIZ5 = anchorLinkUser.LIZ()) != null) {
            imageModel = LIZ5.getAvatarThumb();
        } else {
            imageModel = null;
        }
        M0Q.LIZIZ((ImageView) hSImageView, imageModel, 2130856201);
        TextView textView2 = this.LJJIFFI;
        if (textView2 != null) {
            if (anchorLinkUser != null && (LIZ4 = anchorLinkUser.LIZ()) != null) {
                str = LIZ4.getRealNickName();
            } else {
                str = null;
            }
            textView2.setText(str);
        }
        HSImageView hSImageView2 = this.LJJII;
        if (anchorLinkUser != null && (LIZ3 = anchorLinkUser.LIZ()) != null) {
            imageModel2 = LIZ3.getAvatarThumb();
        }
        M0Q.LIZIZ((ImageView) hSImageView2, imageModel2, 2130856201);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4569d(Context context, DataCenter dataCenter, String str, AnchorLinkUser anchorLinkUser) {
        super(context);
        PKLastBattleResultLayout pKLastBattleResultLayout;
        boolean z;
        Long l;
        Room room;
        User LIZ2;
        C106862S5w.LIZ(context, dataCenter);
        MethodCollector.m14708i(1949);
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        this.LJJIJIL = ((ILiveRoomService) service).getCurrentRoom();
        View inflate = LayoutInflater.from(context).inflate(2131699383, this);
        View findViewById = inflate.findViewById(2131181656);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.f26369LJ = findViewById;
        View findViewById2 = inflate.findViewById(2131165259);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZLLL = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(2131176590);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJJI = (HSImageView) findViewById3;
        View findViewById4 = inflate.findViewById(2131184934);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJJIIJ = (AnchorPauseTipsView) findViewById4;
        View findViewById5 = inflate.findViewById(2131171764);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJJIIJZLJL = findViewById5;
        View findViewById6 = inflate.findViewById(2131178995);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = (ImageView) findViewById6;
        View findViewById7 = inflate.findViewById(2131196951);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJII = findViewById7;
        View findViewById8 = inflate.findViewById(2131179251);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIIIIZZ = (HSImageView) findViewById8;
        View findViewById9 = inflate.findViewById(2131184783);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJJIIZ = (HSImageView) findViewById9;
        View findViewById10 = inflate.findViewById(2131181497);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIIZ = (ConstraintLayout) findViewById10;
        ViewGroup.LayoutParams layoutParams = this.LJIIIZ.getLayoutParams();
        Long l2 = null;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) (!(layoutParams instanceof FrameLayout.LayoutParams) ? null : layoutParams);
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = getAnchorInfoMarginBottom();
        }
        ConstraintLayout constraintLayout = this.LJIIIZ;
        if (constraintLayout != null) {
            pKLastBattleResultLayout = (PKLastBattleResultLayout) constraintLayout.findViewById(2131192957);
        } else {
            pKLastBattleResultLayout = null;
        }
        this.LJIIL = pKLastBattleResultLayout;
        PKLastBattleResultLayout pKLastBattleResultLayout2 = this.LJIIL;
        if (pKLastBattleResultLayout2 != null) {
            pKLastBattleResultLayout2.setBackgroundAlpha(77);
        }
        View findViewById11 = inflate.findViewById(2131170284);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.LJJIIZI = findViewById11;
        View findViewById12 = inflate.findViewById(2131181657);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.LJFF = findViewById12;
        View findViewById13 = inflate.findViewById(2131183710);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        this.LJJIFFI = (TextView) findViewById13;
        View findViewById14 = inflate.findViewById(2131176598);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.LJJII = (HSImageView) findViewById14;
        this.LIZIZ = str;
        AnchorPauseTipsView anchorPauseTipsView = this.LJJIIJ;
        int dip2Px = (int) UIUtils.dip2Px(context, 4.0f);
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(dip2Px)}, anchorPauseTipsView, AnchorPauseTipsView.LIZ, false, 5).isSupported) {
            UIUtils.updateLayoutMargin(anchorPauseTipsView.LIZ(2131165293), -3, -3, -3, dip2Px);
        }
        this.LJJIIJ.LIZ(15.0f, 11.0f);
        Boolean bool = (Boolean) dataCenter.get("data_is_anchor");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJJ = z;
        this.LJJIII = dataCenter;
        if (this.LJJ) {
            if (anchorLinkUser != null && (LIZ2 = anchorLinkUser.LIZ()) != null) {
                l = Long.valueOf(LIZ2.getId());
            } else {
                l = null;
            }
            if (!Intrinsics.areEqual(l, this.LJJIJIL != null ? Long.valueOf(room.ownerUserId) : l2)) {
                this.LJIIIIZZ.setImageResource(LJIILLIIL);
                this.LJJIIZI.setVisibility(0);
                if (LinkCrossRoomDataHolder.LJII().LJJIJ.contains(str)) {
                    this.LJIIJ = true;
                    this.LJIIIIZZ.setImageResource(LJIIZILJ);
                }
                this.LJJIIZI.setOnClickListener(new HVA(this, context));
                setOnClickListener(new HRS(this, dataCenter));
                MethodCollector.m14707o(1949);
            }
        }
        this.LJJIIZI.setVisibility(8);
        this.LJJIIZI.setOnClickListener(new HVA(this, context));
        setOnClickListener(new HRS(this, dataCenter));
        MethodCollector.m14707o(1949);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m14708i(1946);
        int i5 = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 6).isSupported) {
            MethodCollector.m14707o(1946);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View view = this.LJJIJLIJ;
        if (view != null) {
            i5 = view.getWidth();
        }
        if (i5 != this.LJJIL) {
            LIZJ();
            this.LJJIL = i5;
        }
        MethodCollector.m14707o(1946);
    }
}
