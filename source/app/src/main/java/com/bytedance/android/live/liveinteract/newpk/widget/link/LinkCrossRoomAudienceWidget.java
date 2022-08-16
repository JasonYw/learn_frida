package com.bytedance.android.live.liveinteract.newpk.widget.link;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.PkLayoutData;
import com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.LinkInRoomMuteView;
import com.bytedance.android.live.liveinteract.newpk.widget.PkAudienceWidget;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.common.AnchorPauseTipsView;
import com.bytedance.android.livesdk.log.model.C8657j;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.model.C9627at;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C4580049i;
import p003X.C79046HEa;
import p003X.C79229HLb;
import p003X.C79399HRp;
import p003X.C79400HRq;
import p003X.C79403HRt;
import p003X.C79404HRu;
import p003X.C88440Kt0;
import p003X.HKK;
import p003X.HS5;
import p003X.HS6;
import p003X.HSB;
import p003X.HSP;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class LinkCrossRoomAudienceWidget extends LinkCrossRoomNewWidget implements a$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public PkAudienceWidget LIZJ;
    public C79399HRp LIZLLL;

    /* renamed from: LJ */
    public C79400HRq f26402LJ;
    public C9627at LJFF;
    public boolean LJI = true;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public HSP LJIIIZ;
    public String LJJIIJ;

    static {
        Covode.recordClassIndex(28873);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 18).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final PkLayoutData LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11);
        if (proxy.isSupported) {
            return (PkLayoutData) proxy.result;
        }
        PkLayoutData LIZ = super.LIZ();
        LIZ.setRegion(this.LJFF);
        return LIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        super.LJIIIIZZ();
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL(4);
        }
    }

    private final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        View view = this.contentView;
        if (view != null) {
            LK1.LIZJ(view);
        }
        Guideline LJIILLIIL = LJIILLIIL();
        if (LJIILLIIL != null) {
            LJIILLIIL.setGuidelineBegin(this.LJIILLIIL);
        }
        LJIIZILJ().getLayoutParams().height = this.LJIIZILJ;
        PkAudienceWidget pkAudienceWidget = this.LIZJ;
        if (pkAudienceWidget != null) {
            pkAudienceWidget.LIZ(this.LJIILLIIL, this.LJIIZILJ);
        }
        HSB hsb = new HSB(0);
        if (LJIILJJIL().LIZIZ()) {
            hsb.LIZIZ = Integer.valueOf(this.LJIIZILJ + this.LJIILLIIL);
        } else {
            hsb.LIZIZ = Integer.valueOf(this.LJIIZILJ + this.LJIILLIIL + LK1.LIZLLL(48));
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_pk_state_change", hsb);
        }
        HSP hsp = this.LJIIIZ;
        if (hsp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hsp.LIZ();
        LIZ("adjustUiToVideoPosition", "marginTop: " + this.LJIILLIIL + ", streamHeight: " + this.LJIIZILJ);
    }

    private C79400HRq LIZLLL() {
        int i;
        int i2;
        StreamUrlExtra streamUrlExtraSafely;
        StreamUrlExtra streamUrlExtraSafely2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 13);
        if (proxy.isSupported) {
            return (C79400HRq) proxy.result;
        }
        C79400HRq c79400HRq = new C79400HRq();
        c79400HRq.LIZJ = 2;
        ArrayList arrayList = new ArrayList();
        C9627at c9627at = new C9627at();
        c9627at.LIZ(1);
        c9627at.LIZJ(0.5d);
        c9627at.LIZLLL(HKK.LIZIZ);
        c9627at.LIZ(0.5d);
        c9627at.LIZIZ(0.40625d);
        c9627at.LJIILIIL = LinkCrossRoomDataHolder.LJII().LJJJJLL ? 1 : 0;
        if (this.dataCenter != null) {
            Object obj = this.dataCenter.get("data_pk_anchor_leave_status_change", (String) Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            c9627at.LIZIZ(1 ^ ((Boolean) obj).booleanValue());
        }
        c9627at.LIZ(LinkCrossRoomDataHolder.LJII().LJIIIIZZ);
        arrayList.add(c9627at);
        c79400HRq.LJI = arrayList;
        HS5 hs5 = new HS5();
        Room room = this.LJIIJJI;
        if (room != null && (streamUrlExtraSafely2 = room.getStreamUrlExtraSafely()) != null) {
            i = streamUrlExtraSafely2.LIZIZ();
        } else {
            i = 720;
        }
        hs5.LIZJ = i;
        Room room2 = this.LJIIJJI;
        if (room2 != null && (streamUrlExtraSafely = room2.getStreamUrlExtraSafely()) != null) {
            i2 = streamUrlExtraSafely.LIZ();
        } else {
            i2 = 1280;
        }
        hs5.LIZIZ = i2;
        hs5.LIZ = "#1F212C";
        c79400HRq.LJIIIIZZ = hs5;
        return c79400HRq;
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_adjust_widget_to_pk_mode", Boolean.TRUE);
        }
        HSB hsb = new HSB(1);
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.put("cmd_pk_state_change", hsb);
        }
        DataCenter dataCenter3 = this.dataCenter;
        if (dataCenter3 != null) {
            dataCenter3.put("data_first_frame_sei", "");
        }
        if (!PatchProxy.proxy(new Object[0], null, HS6.LIZ, true, 2).isSupported && HS6.LIZIZ != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - HS6.LIZIZ) / 1000));
            C8657j c8657j = new C8657j();
            if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 0) {
                c8657j.LIZ(LinkCrossRoomDataHolder.LJII().LJII);
            }
            hashMap.put("connection_type", ((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkConnectionType());
            hashMap.put("anchor_cnt", ((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkAnchorCount());
            C4574547f.LIZ().LIZ("livesdk_connection_watch_duration", hashMap, Room.class, new C8668v(), LinkCrossRoomDataHolder.LJII().LJIIIZ(), c8657j);
            HS6.LIZIZ = 0L;
        }
        this.LJIILIIL.LJI();
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJJIFFI.dispose();
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        DataCenter observeForever;
        DataCenter observeForever2;
        DataCenter observeForever3;
        DataCenter observeForever4;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], null, C79404HRu.LIZ, true, 4).isSupported) {
            C79404HRu.f6813LJ = System.currentTimeMillis();
        }
        super.onCreate();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            obj = dataCenter.get("data_is_portrait", (String) Boolean.TRUE);
        } else {
            obj = null;
        }
        this.LJI = Intrinsics.areEqual(obj, Boolean.TRUE);
        this.LIZLLL = new C79399HRp(this);
        this.LJIIIZ = new HSP(this.LJIIJJI, false, this.LJIILIIL);
        LJIJJ().setAnchorAndInit(false);
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
            if (C4580049i.LIZIZ && C4580049i.LIZJ && C4580049i.LIZIZ()) {
                LJIIZILJ().setPadding(-3, -C4580049i.LIZ(getContext()), -3, -3);
            }
            LinkInRoomMuteView LJIJJ = LJIJJ();
            if (LJIJJ != null) {
                LJIJJ.setMuteStateChangeListener(new C79403HRt(this));
            }
            View view = this.contentView;
            if (view != null) {
                view.setVisibility(4);
            }
            AnchorPauseTipsView LJIJI = LJIJI();
            if (LJIJI != null) {
                LJIJI.setVisibility(4);
            }
            HSImageView LJIJJLI = LJIJJLI();
            if (LJIJJLI != null) {
                LJIJJLI.setVisibility(8);
            }
        }
        if (this.LJIILIIL.LJIIJJI <= 0) {
            HS6.LIZ();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported && this.LIZJ == null) {
            enableSubWidgetManager();
            this.LIZJ = new PkAudienceWidget(this.LJJII, this.LJJIII, LJIILJJIL());
            this.subWidgetManager.load(2131185178, (Widget) this.LIZJ, false);
        }
        String str = this.LJJIIJ;
        if (str != null && str.length() != 0) {
            LIZIZ(this.LJJIIJ);
        }
        this.dataCenter.put("data_adjust_widget_to_pk_mode", Boolean.FALSE);
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (LIZ.LIZJ()) {
            C88440Kt0.LIZ(2131584157);
            LIZ(LIZLLL());
            this.dataCenter.put("cmd_what_adjust_guest_window_by_sei", "");
        }
        QB4.LIZ(LJIILL().LIZIZ().LIZIZ().subscribe(new C79229HLb(this)), this.LJJIFFI);
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null && (observeForever = dataCenter2.observeForever("data_pk_anchor_silence_status_change", this)) != null && (observeForever2 = observeForever.observeForever("cmd_what_audience_self_join", this)) != null && (observeForever3 = observeForever2.observeForever("cmd_what_audience_join_self_link", this)) != null && (observeForever4 = observeForever3.observeForever("cmd_what_audience_join_guest_link", this)) != null) {
            observeForever4.observeForever("data_pk_anchor_leave_status_change", this);
        }
        if (!PatchProxy.proxy(new Object[0], null, C79404HRu.LIZ, true, 5).isSupported) {
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if ((LIZ2 == null || (LJIILJJIL = LIZ2.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) && C79404HRu.LIZLLL > 0 && C79404HRu.f6813LJ > 0) {
                C79404HRu.LJFF = System.currentTimeMillis();
                ALogger.m15797i("PkEnterRoomTracer", "beforeLink=" + (C79404HRu.LIZJ - C79404HRu.LIZIZ) + "ms linkLoad=" + (C79404HRu.LIZLLL - C79404HRu.LIZJ) + "ms, gapTime=" + (C79404HRu.f6813LJ - C79404HRu.LIZLLL) + "ms, pkLoad=" + (C79404HRu.LJFF - C79404HRu.f6813LJ) + "ms total=" + (C79404HRu.LJFF - C79404HRu.LIZJ) + "ms");
            } else {
                C79404HRu.LIZJ();
            }
        }
        DataCenter dataCenter3 = this.dataCenter;
        if (dataCenter3 != null) {
            obj2 = dataCenter3.get("cmd_what_audience_join_guest_link", (String) Boolean.FALSE);
        } else {
            obj2 = null;
        }
        if (Intrinsics.areEqual(obj2, Boolean.TRUE)) {
            LIZIZ(true);
        }
        DataCenter dataCenter4 = this.dataCenter;
        if (dataCenter4 != null) {
            obj3 = dataCenter4.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE);
        } else {
            obj3 = null;
        }
        if (Intrinsics.areEqual(obj3, Boolean.TRUE)) {
            LIZ(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        onChanged((KVData) obj);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        LIZ(this.f26402LJ);
    }

    private final void LIZ(boolean z) {
        int i;
        int i2 = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 16).isSupported) {
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == -1) {
            i = LK5.LIZJ();
        } else {
            i = layoutParams.width;
        }
        ViewGroup.LayoutParams layoutParams2 = LJIJ().getLayoutParams();
        if (layoutParams2 != null) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (z) {
                i2 = i / 4;
            }
            layoutParams3.bottomMargin = i2;
            LJIJ().setLayoutParams(layoutParams3);
            if (z) {
                LJIJ().LIZ(12.0f, 8.0f);
                return;
            } else {
                LJIJ().LIZ(15.0f, 11.0f);
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void LIZIZ(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 6).isSupported || this.LIZLLL == null) {
            return;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        LIZ("sei_update", str2);
        this.LJJIIJ = str;
        if (str != null && ((StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "TTLiveSDK_Android", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "TTLiveSDK_IOS", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "TTLiveSDK_Windows", false, 2, (Object) null)) && this.LJII)) {
            LJIIIIZZ();
            return;
        }
        C79399HRp c79399HRp = this.LIZLLL;
        if (c79399HRp != null) {
            c79399HRp.LIZ(str);
        }
    }

    private final void LIZIZ(boolean z) {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == -1) {
            i = LK5.LIZJ();
        } else {
            i = layoutParams.width;
        }
        ViewGroup.LayoutParams layoutParams2 = LJIJI().getLayoutParams();
        if (layoutParams2 != null) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (z) {
                i2 = i / 4;
            } else {
                i2 = 0;
            }
            layoutParams3.bottomMargin = i2;
            LJIJI().setLayoutParams(layoutParams3);
            if (z) {
                LJIJI().LIZ(12.0f, 8.0f);
            } else {
                LJIJI().LIZ(15.0f, 11.0f);
            }
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById = view2.findViewById(2131196958);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            ViewGroup.LayoutParams layoutParams4 = findViewById.getLayoutParams();
            if (layoutParams4 != null) {
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                if (z) {
                    i3 = i / 4;
                }
                layoutParams5.bottomMargin = i3;
                findViewById.setLayoutParams(layoutParams5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    @Override // com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a
    public final boolean LIZ(int i) {
        LiveMode liveMode;
        C2WC<Room> LIZ;
        Room LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i != 2) {
            if (i == 6) {
                C5923dp LJJJI = LJJJI();
                if (LJJJI != null && (LIZ = LJJJI.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
                    liveMode = LIZ2.getStreamType();
                } else {
                    liveMode = null;
                }
                if (liveMode == LiveMode.THIRD_PARTY) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    @Override // com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(p003X.C79400HRq r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAudienceWidget.LIZ(X.HRq):void");
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget
    public final void LIZ(KVData kVData) {
        String key;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        LinkInRoomMuteView LJIJJ;
        Boolean bool4;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{kVData}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        super.onChanged(kVData);
        Object obj = null;
        if (kVData != null && (key = kVData.getKey()) != null) {
            switch (key.hashCode()) {
                case 161145722:
                    if (!key.equals("data_pk_anchor_leave_status_change")) {
                        return;
                    }
                    if (kVData == null || (bool4 = (Boolean) kVData.getData(Boolean.FALSE)) == null) {
                        bool4 = Boolean.FALSE;
                    }
                    Intrinsics.checkNotNullExpressionValue(bool4, "");
                    boolean booleanValue = bool4.booleanValue();
                    if (PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 15).isSupported) {
                        return;
                    }
                    AnchorPauseTipsView LJIJI = LJIJI();
                    if (booleanValue) {
                        i = 4;
                    }
                    LJIJI.setVisibility(i);
                    return;
                case 810097432:
                    if (!key.equals("cmd_what_audience_self_join")) {
                        return;
                    }
                    if (kVData != null) {
                        obj = kVData.getData(Boolean.FALSE);
                    }
                    if (!Intrinsics.areEqual(obj, Boolean.TRUE)) {
                        return;
                    }
                    LIZ(LIZLLL());
                    return;
                case 862446244:
                    if (!key.equals("data_pk_anchor_silence_status_change")) {
                        return;
                    }
                    if (kVData == null || (bool3 = (Boolean) kVData.getData(Boolean.FALSE)) == null) {
                        bool3 = Boolean.FALSE;
                    }
                    Intrinsics.checkNotNullExpressionValue(bool3, "");
                    boolean booleanValue2 = bool3.booleanValue();
                    if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue2 ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 14).isSupported && (LJIJJ = LJIJJ()) != null) {
                        LJIJJ.setMute(booleanValue2);
                        return;
                    }
                    return;
                case 1080946897:
                    if (!key.equals("cmd_what_audience_join_guest_link")) {
                        return;
                    }
                    if (kVData == null || (bool2 = (Boolean) kVData.getData(Boolean.FALSE)) == null) {
                        bool2 = Boolean.FALSE;
                    }
                    Intrinsics.checkNotNullExpressionValue(bool2, "");
                    LIZIZ(bool2.booleanValue());
                    return;
                case 2140954685:
                    if (!key.equals("cmd_what_audience_join_self_link")) {
                        return;
                    }
                    if (kVData == null || (bool = (Boolean) kVData.getData(Boolean.FALSE)) == null) {
                        bool = Boolean.FALSE;
                    }
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    LIZ(bool.booleanValue());
                    return;
                default:
                    return;
            }
        }
    }

    public LinkCrossRoomAudienceWidget(String str, long j, long j2) {
        super(j, j2);
        this.LJJIIJ = str;
    }
}
