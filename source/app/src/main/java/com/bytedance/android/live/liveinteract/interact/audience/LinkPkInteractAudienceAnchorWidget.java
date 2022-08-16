package com.bytedance.android.live.liveinteract.interact.audience;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.interact.audience.context.C4430f;
import com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4788a;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4789b;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o;
import com.bytedance.android.live.liveinteract.plantform.utils.PkLinkRole;
import com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.circleinfo.CircleInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.mixer.VideoMixer;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3BL;
import p003X.C78301Gtr;
import p003X.C78828H5q;
import p003X.C78941H9z;
import p003X.C79008HCo;
import p003X.C79046HEa;
import p003X.C79199HJx;
import p003X.C79241HLn;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.HAU;
import p003X.HBR;
import p003X.HBW;
import p003X.HDY;
import p003X.HH8;
import p003X.HJK;
import p003X.HKK;
import p003X.HTD;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;
import p003X.View$OnClickListenerC78406GvY;

/* loaded from: classes3.dex */
public final class LinkPkInteractAudienceAnchorWidget extends BasePkInteractAnchorWidget<LinkPlayerInfo> implements Observer<KVData>, c$a, AbstractC4777o, AbstractC4789b, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZIZ;
    public int LIZJ;
    public final AbstractC6070q LIZLLL;
    public C79241HLn LJIIL;
    public HJK LJIILIIL;
    public C79008HCo LJIILL;
    public IMessageManager LJIIZILJ;
    public HAU LJIJ;
    public long LJIJI;
    public boolean LJIJJ;
    public final String LJIIJ = "LinkPkInteractAudienceAnchorWidget";
    public final String LJIIJJI = "show_bubble_tag_anchor";
    public final CompositeDisposable LJIILJJIL = new CompositeDisposable();
    public HDY LJIILLIIL = new HDY(this);

    static {
        Covode.recordClassIndex(27027);
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZ(int i) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, TextureView textureView, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4789b
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC4788a abstractC4788a) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 1;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4789b
    public final boolean LJFF() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700421;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 43).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        super.LIZ(j, th);
        if (!(th instanceof ApiServerException)) {
            return;
        }
        C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 16).isSupported) {
            return;
        }
        super.LIZIZ(str, textureView, i, i2);
        LJIIIZ();
        LIZJ(str);
        HJK hjk = this.LJIILIIL;
        if (hjk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (str == null) {
            str = "";
        }
        hjk.LIZ(str, textureView);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        Boolean bool;
        Boolean bool2;
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        super.LIZ(str, iLayer, i, i2);
        LJIIIZ();
        HJK hjk = this.LJIILIIL;
        if (hjk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hjk.LIZ(str == null ? "" : str, (View) null);
        PkLinkRole pkLinkRole = PkLinkRole.ANCHOR;
        String str2 = str == null ? "" : str;
        if (!PatchProxy.proxy(new Object[]{pkLinkRole, str2, "onFirstRemoteVideoFrameRender"}, null, HH8.LIZ, true, 229).isSupported) {
            C106862S5w.LIZ(pkLinkRole, str2, "onFirstRemoteVideoFrameRender");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("role", pkLinkRole);
            linkedHashMap.put("link_id", str2);
            linkedHashMap.put("request_source", "onFirstRemoteVideoFrameRender");
            HH8.LIZIZ.LIZJ(linkedHashMap);
            HH8.LIZ(linkedHashMap);
            HH8.LIZ("link_pk_with_audience_check_linkmic_id", (Map) linkedHashMap, false, 4, (Object) null);
        }
        DataCenter dataCenter = this.dataCenter;
        boolean booleanValue = (dataCenter == null || (bool2 = (Boolean) dataCenter.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE)) == null) ? false : bool2.booleanValue();
        DataCenter dataCenter2 = this.dataCenter;
        boolean booleanValue2 = (dataCenter2 == null || (bool = (Boolean) dataCenter2.get("cmd_what_audience_join_guest_link", (String) Boolean.FALSE)) == null) ? false : bool.booleanValue();
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C3BL interactAudienceService = ((IInteractService) service).getInteractAudienceService();
        Intrinsics.checkNotNullExpressionValue(interactAudienceService, "");
        boolean LIZIZ2 = interactAudienceService.LIZIZ();
        if (TextUtils.equals(str, LinkCrossRoomDataHolder.LJII().LJIILL) || TextUtils.equals(str, LinkCrossRoomDataHolder.LJII().LJIIIIZZ)) {
            if (TextUtils.equals(str, LinkCrossRoomDataHolder.LJII().LJIILL)) {
                LIZ(this, true, booleanValue || LIZIZ2, false, 4, null);
                return;
            } else {
                LIZ(this, false, booleanValue2, false, 4, null);
                return;
            }
        }
        LIZJ(str);
        C79241HLn c79241HLn = this.LJIIL;
        if (c79241HLn == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.core.LinkPkUserInfoCenter");
        }
        boolean LIZJ = c79241HLn.LIZJ(str);
        C79241HLn c79241HLn2 = this.LJIIL;
        if (c79241HLn2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.core.LinkPkUserInfoCenter");
        }
        long LJFF = c79241HLn2.LJFF(str);
        C79241HLn c79241HLn3 = this.LJIIL;
        if (c79241HLn3 != null) {
            int LIZLLL = c79241HLn3.LIZLLL(LJFF);
            int i3 = LIZJ ? LIZLLL + 1 : LIZLLL - 1;
            String str3 = this.LJIIJ;
            ALogger.m15801d(str3, "onFirstRemoteVideoFrameRender ILayerControl linkId = " + str + ", isLinkWithAudience = " + LIZIZ2 + ", isNotSelfGuest = " + LIZJ + ", realGuestUid = " + LJFF + ", guestPos = " + LIZLLL + ", realPos = " + i3);
            if (iLayer == null) {
                return;
            }
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            videoMixerDescription.setLeft(i3 * 0.25f);
            videoMixerDescription.setTop(1.0f - ((float) (HKK.LIZLLL / HKK.LIZJ)));
            videoMixerDescription.setRight((i3 + 1) * 0.25f);
            videoMixerDescription.setBottom(1.0f);
            videoMixerDescription.setzOrder(0);
            videoMixerDescription.setVisibility(true);
            videoMixerDescription.setMode(2);
            iLayer.updateDescription(videoMixerDescription);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.core.LinkPkUserInfoCenter");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        super.LIZ(str, j);
        if (str == null) {
            return;
        }
        C79241HLn c79241HLn = this.LJIIL;
        if (c79241HLn != null) {
            c79241HLn.LIZ(str);
        }
        HJK hjk = this.LJIILIIL;
        if (hjk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hjk.LIZIZ(0L, str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZ(c8854es);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.dataCenter.put("data_interact_number_dot_show", "");
        LIZ(this.LJIIIIZZ, str);
        LJIIIIZZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZ(long j, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, LIZIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2);
        if (str2.length() == 0) {
            str2 = "anchor_stop_normal";
        }
        LJII().LIZ(j, str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZ(long j, boolean z) {
        C79008HCo c79008HCo;
        if (!PatchProxy.proxy(new Object[]{new Long(j), (byte) 0}, this, LIZIZ, false, 34).isSupported && (c79008HCo = this.LJIILL) != null) {
            c79008HCo.LIZIZ(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZ(boolean z, List<AnchorLinkUser> list, long j) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), list, new Long(j)}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        C79199HJx c79199HJx = this.LJII;
        if (c79199HJx != null) {
            c79199HJx.LIZIZ(!z ? 1 : 0);
        }
        LIZJ().LIZ(list, j, z ? "silence" : "unSilence");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZ(boolean z) {
        this.LJIJJ = true;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final HBW LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22);
        if (proxy.isSupported) {
            return (HBW) proxy.result;
        }
        return LJII();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
            return;
        }
        super.onResume();
        LIZJ().LJIIJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final AbstractC78986HBs<LinkPlayerInfo> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 21);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (this.LJIIL == null) {
            Room LJI = LJI();
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJIIL = new C79241HLn(LJI, dataCenter, 1);
        }
        C79241HLn c79241HLn = this.LJIIL;
        if (c79241HLn != null) {
            return c79241HLn;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.core.LinkPkUserInfoCenter");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    /* renamed from: LJ */
    public final int mo15713LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 33);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C79241HLn c79241HLn = this.LJIIL;
        if (c79241HLn == null) {
            return 0;
        }
        return c79241HLn.LJIIJJI();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    /* renamed from: Z_ */
    public final void mo15698Z_() {
        Boolean bool;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported) {
            return;
        }
        super.mo15698Z_();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null && (bool = (Boolean) dataCenter.get("data_is_anchor", (String) Boolean.FALSE)) != null) {
            z = bool.booleanValue();
        }
        LinkControlWidget.LIZIZ("normal", z);
    }

    private final void LJIIIIZZ() {
        DataCenter dataCenter;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported && (dataCenter = this.dataCenter) != null) {
            Object obj = dataCenter.get("data_talk_room_admin_allowed_flag", (String) Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            if (((Boolean) obj).booleanValue()) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6958M;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                C78828H5q.LIZ("interact_chat", LIZ.booleanValue());
                dataCenter.put("data_talk_room_admin_allowed_flag", Boolean.FALSE);
            }
        }
    }

    private final void LJIIIZ() {
        PkDataContext LIZ;
        C2WC<Boolean> LJIIIZ;
        C2WC<Boolean> LJI;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        if (Intrinsics.areEqual(HTD.LIZIZ.LIZIZ(), AbstractC4256d.C4260d.LIZIZ)) {
            PkDataContext LIZ2 = HTD.LIZIZ.LIZ();
            if (LIZ2 != null && (LJI = LIZ2.LJI()) != null) {
                LJI.LIZ(Boolean.TRUE);
            }
        } else if (Intrinsics.areEqual(HTD.LIZIZ.LIZIZ(), AbstractC4256d.C4259c.LIZIZ) && (LIZ = HTD.LIZIZ.LIZ()) != null && (LJIIIZ = LIZ.LJIIIZ()) != null) {
            LJIIIZ.LIZ(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r0.booleanValue() == false) goto L13;
     */
    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() {
        /*
            r5 = this;
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceAnchorWidget.LIZIZ
            r4 = 4
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r3, r4)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            X.HJx r0 = r5.LJII
            if (r0 == 0) goto L61
            boolean r0 = r0.LJIIIIZZ
            if (r0 == 0) goto L61
            boolean r0 = r5.LJIJJ
            java.lang.String r1 = ""
            if (r0 == 0) goto L31
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_PK_SWITCH_TO_MULTI_SKIP_ONPAUSE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L61
        L31:
            com.bytedance.android.live.liveinteract.plantform.a.i r0 = p003X.AbstractC78050Gpo.LIZ()
            if (r0 == 0) goto L65
            int r2 = r0.LJJIFFI()
        L3b:
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            X.3BK r0 = r0.getPkService()
            int r1 = r0.LJIIIZ()
            r0 = 1
            if (r1 != r0) goto L52
            r3 = 1
        L52:
            boolean r0 = p003X.C79169HIt.LIZIZ(r2, r4)
            if (r0 == 0) goto L67
            if (r3 == 0) goto L67
            X.HBs r0 = r5.LIZJ()
            r0.LJIIIZ()
        L61:
            super.onPause()
            return
        L65:
            r2 = 0
            goto L3b
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceAnchorWidget.onPause():void");
    }

    private final void LJIIJ() {
        Map<String, Object> emptyMap;
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported) {
            return;
        }
        C79241HLn c79241HLn = this.LJIIL;
        if (c79241HLn != null) {
            c79241HLn.LIZ(LinkCrossRoomDataHolder.LJII().LJLJL);
        }
        C79199HJx c79199HJx = this.LJII;
        if (c79199HJx == null || (emptyMap = c79199HJx.LIZJ()) == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        String str = this.LJIIJ;
        ALogger.m15801d(str, "updateFirstvideoFrame linkerContentMap = " + LinkCrossRoomDataHolder.LJII().LJLJL + ", remoteView = " + emptyMap.size() + ", linkmicId = " + LinkCrossRoomDataHolder.LJII().LJIILL);
        for (Map.Entry<String, Object> entry : emptyMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.equals(key, LinkCrossRoomDataHolder.LJII().LJIILL)) {
                if (value instanceof SurfaceView) {
                    LIZIZ(key, (SurfaceView) value, 0, 0);
                } else if (value instanceof ILayerControl.ILayer) {
                    LIZ(key, (ILayerControl.ILayer) value, 0, 0);
                    DataCenter dataCenter = this.dataCenter;
                    if (dataCenter != null && (bool2 = (Boolean) dataCenter.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE)) != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = false;
                    }
                    LIZ(true, z, true);
                    DataCenter dataCenter2 = this.dataCenter;
                    if (dataCenter2 != null && (bool = (Boolean) dataCenter2.get("cmd_what_audience_join_guest_link", (String) Boolean.FALSE)) != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = false;
                    }
                    LIZ(false, z2, true);
                } else if (value instanceof TextureView) {
                    LIZIZ(key, (TextureView) value, 0, 0);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported) {
            return;
        }
        C78301Gtr c78301Gtr = C78301Gtr.LIZIZ;
        long j = this.LJIJI;
        int i = this.LIZJ;
        CircleInfo circleInfo = LJI().circleInfo;
        if (!PatchProxy.proxy(new Object[]{c78301Gtr, new Long(j), Integer.valueOf(i), circleInfo, null, 8, null}, null, C78301Gtr.LIZ, true, 11).isSupported) {
            c78301Gtr.LIZ(j, i, circleInfo, "off");
        }
        IMessageManager iMessageManager = this.LJIIZILJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        super.onDestroy();
        this.LJIILJJIL.dispose();
        HJK hjk = this.LJIILIIL;
        if (hjk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hjk.LIZ();
        HAU hau = this.LJIJ;
        if (hau != null) {
            hau.LIZLLL();
        }
        C79199HJx c79199HJx = this.LJII;
        if (c79199HJx != null) {
            c79199HJx.LIZIZ(this);
        }
        this.LJIJJ = false;
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_pk_anchor_silence_status_change", Boolean.FALSE);
        }
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.removeObserver(this);
        }
        LJIIIIZZ();
        C79046HEa.LIZ().LIZ((Integer) 0);
        C79008HCo c79008HCo = this.LJIILL;
        if (c79008HCo != null) {
            c79008HCo.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Long l;
        C78941H9z c78941H9z;
        User owner;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.LJIIIZ.LIZJ(1);
        Pair LIZ = IQV.LIZ((Function0) LinkPkInteractAudienceAnchorWidget$onCreate$1.INSTANCE);
        C4430f c4430f = (C4430f) LIZ.component1();
        IQX.LIZ(c4430f, "linkpk_interact_anchor_service");
        c4430f.LIZ().LIZIZ(this);
        this.LJIILJJIL.add((Disposable) LIZ.component2());
        this.dataCenter.observe("cmd_force_close_linkin", this);
        this.dataCenter.observe("cmd_force_close_linkin_before_videotalk", this);
        this.dataCenter.observe("cmd_what_audience_join_self_link", this);
        this.dataCenter.observe("cmd_what_audience_join_guest_link", this);
        LIZJ().LIZ(this.LJIILLIIL);
        Room LJI = LJI();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            C79241HLn c79241HLn = this.LJIIL;
            Context context = this.context;
            if (context != null) {
                View findViewById = this.contentView.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                this.LJIILIIL = new HJK(LJI, true, frameLayout, c79241HLn, (FragmentActivity) context, this, findViewById);
                HJK hjk = this.LJIILIIL;
                if (hjk == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hjk.LIZ(this.dataCenter);
                HJK hjk2 = this.LJIILIIL;
                if (hjk2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hjk2.LJFF = new View$OnClickListenerC78406GvY(this);
                HJK hjk3 = this.LJIILIIL;
                if (hjk3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hjk3.LJIIJ = this.LIZLLL.getLiveCore();
                HJK hjk4 = this.LJIILIIL;
                if (hjk4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hjk4.LIZ(false);
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                this.LJIJ = new HAU(context2, dataCenter, LIZJ(), this);
                HAU hau = this.LJIJ;
                if (hau != null) {
                    hau.LIZJ();
                }
                this.LJIIZILJ = (IMessageManager) this.dataCenter.get("data_message_manager");
                IMessageManager iMessageManager = this.LJIIZILJ;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(MessageType.LINK_OFFICIAL_KICK_OUT.LIZ(), this);
                }
                IMessageManager iMessageManager2 = this.LJIIZILJ;
                if (iMessageManager2 != null) {
                    iMessageManager2.addMessageListener(MessageType.LINKER.LIZ(), this);
                }
                IMessageManager iMessageManager3 = this.LJIIZILJ;
                if (iMessageManager3 != null) {
                    iMessageManager3.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
                }
                IMessageManager iMessageManager4 = this.LJIIZILJ;
                if (iMessageManager4 != null) {
                    iMessageManager4.addMessageListener(MessageType.LINK_MIC_DYNAMIC_EMOJI_MESSAGE.LIZ(), this);
                }
                this.LJIILL = new C79008HCo(LJI(), true, this.dataCenter);
                C79008HCo c79008HCo = this.LJIILL;
                if (c79008HCo != null) {
                    c79008HCo.LIZ((c$a) this);
                }
                this.LJIJI = System.currentTimeMillis();
                C79199HJx c79199HJx = this.LJII;
                if (c79199HJx != null) {
                    c79199HJx.LIZ(this);
                }
                HJK hjk5 = this.LJIILIIL;
                if (hjk5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    hjk5.LJIIL = this.LJII;
                }
                IService service = ServiceManager.getService(IRoomService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                Room currentRoomFromRoomContext = ((ILiveRoomService) service).getCurrentRoomFromRoomContext();
                if (currentRoomFromRoomContext != null && (owner = currentRoomFromRoomContext.getOwner()) != null) {
                    l = Long.valueOf(owner.getId());
                } else {
                    l = null;
                }
                String str = this.LJIIJJI + l;
                C87308Kak<Map<String, Boolean>> c87308Kak = AbstractC80293Hkt.LJIILLIIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean bool = c87308Kak.LIZ().get(str);
                if (bool == null || !bool.booleanValue()) {
                    this.dataCenter.put("data_link_pk_interact_show_red_dot", Boolean.FALSE);
                    C87308Kak<Map<String, Boolean>> c87308Kak2 = AbstractC80293Hkt.LJIILLIIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    Map<String, Boolean> LIZ2 = c87308Kak2.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    LIZ2.put(str, Boolean.TRUE);
                }
                if (LinkCrossRoomDataHolder.LJII().LJLJL == null) {
                    this.dataCenter.observe("cmd_what_receive_apply", this);
                } else {
                    LJIIJ();
                }
                C79046HEa.LIZ().LIZ((Integer) 2);
                if (this.dataCenter != null && (c78941H9z = (C78941H9z) this.dataCenter.get("data_gift_message_board_linkmic_event", (String) new C78941H9z(0L, null, false, false, false, null, 63))) != null && c78941H9z.LIZ != 0) {
                    C87010KQi.LIZ().LIZ(c78941H9z);
                    this.dataCenter.put("data_gift_message_board_linkmic_event", null);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZIZ, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        super.LIZ(user);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 7).isSupported) {
            return;
        }
        super.LIZ(j);
        C79199HJx c79199HJx = this.LJII;
        if (c79199HJx != null) {
            c79199HJx.LIZ(this);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZJ(long j) {
        C79241HLn c79241HLn;
        User LIZ;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 42).isSupported && (c79241HLn = this.LJIIL) != null && (LIZ = c79241HLn.LIZ(j)) != null) {
            if (!TextUtils.isEmpty(LIZ.getNickName()) && LIZ.getNickName().length() > 10) {
                new StringBuilder();
                C88440Kt0.LIZ(LK5.LIZ(2131588255, C0002O.m25086C(LIZ.getNickName().subSequence(0, 10).toString(), "...")));
                return;
            }
            C88440Kt0.LIZ(LK5.LIZ(2131588255, LIZ.getNickName()));
        }
    }

    private final void LIZJ(String str) {
        C79199HJx c79199HJx;
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        Boolean bool = (Boolean) this.dataCenter.get("data_pk_anchor_silence_status_change", (String) Boolean.FALSE);
        AbstractC78986HBs<LinkPlayerInfo> LIZJ = LIZJ();
        Boolean bool2 = null;
        if (!(LIZJ instanceof C79241HLn)) {
            LIZJ = null;
        }
        C79241HLn c79241HLn = (C79241HLn) LIZJ;
        if (c79241HLn != null && c79241HLn.LIZJ(str) && (c79199HJx = this.LJII) != null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            Intrinsics.checkNotNullExpressionValue(bool, "");
            c79199HJx.LIZ(str2, bool.booleanValue());
        }
        String str3 = this.LJIIJ;
        StringBuilder sb = new StringBuilder("muteAudio isMute = ");
        sb.append(bool);
        sb.append(", linkId = ");
        sb.append(str);
        sb.append(", isNotSelfGuest = ");
        AbstractC78986HBs<LinkPlayerInfo> LIZJ2 = LIZJ();
        if (!(LIZJ2 instanceof C79241HLn)) {
            LIZJ2 = null;
        }
        C79241HLn c79241HLn2 = (C79241HLn) LIZJ2;
        if (c79241HLn2 != null) {
            bool2 = Boolean.valueOf(c79241HLn2.LIZJ(str));
        }
        sb.append(bool2);
        ALogger.m15801d(str3, sb.toString());
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZIZ(long j) {
        C79241HLn c79241HLn;
        User LIZ;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 40).isSupported && ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() != j && (c79241HLn = this.LJIIL) != null && (LIZ = c79241HLn.LIZ(j)) != null) {
            if (!TextUtils.isEmpty(LIZ.getNickName()) && LIZ.getNickName().length() > 10) {
                new StringBuilder();
                C88440Kt0.LIZ(LK5.LIZ(2131588248, C0002O.m25086C(LIZ.getNickName().subSequence(0, 10).toString(), "...")));
                return;
            }
            C88440Kt0.LIZ(LK5.LIZ(2131588248, LIZ.getNickName()));
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZIZ, false, 23).isSupported && kVData2 != null) {
            String key = kVData2.getKey();
            switch (key.hashCode()) {
                case -1018269700:
                    if (!key.equals("cmd_what_receive_apply")) {
                        return;
                    }
                    LJIIJ();
                    return;
                case -95319361:
                    if (!key.equals("cmd_force_close_linkin")) {
                        return;
                    }
                    LIZ(this.LJIIIIZZ, "forbidden_notice");
                    return;
                case 1080946897:
                    if (!key.equals("cmd_what_audience_join_guest_link")) {
                        return;
                    }
                    Boolean bool = (Boolean) kVData2.getData();
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    LIZ(this, false, bool.booleanValue(), false, 4, null);
                    return;
                case 1715701863:
                    if (!key.equals("cmd_force_close_linkin_before_videotalk")) {
                        return;
                    }
                    LIZ(this.LJIIIIZZ, "stop_intimate_before_big_party");
                    return;
                case 2140954685:
                    if (!key.equals("cmd_what_audience_join_self_link")) {
                        return;
                    }
                    Boolean bool2 = (Boolean) kVData2.getData();
                    if (bool2 == null) {
                        bool2 = Boolean.FALSE;
                    }
                    Intrinsics.checkNotNullExpressionValue(bool2, "");
                    LIZ(this, true, bool2.booleanValue(), false, 4, null);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZIZ(c8854es);
        User user = new User();
        user.setId(c8854es.LJJI);
        user.setSecUid(c8854es.LJJIFFI);
        LIZ(user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (((java.lang.Boolean) r4.result).booleanValue() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        r9 = r10.LJIL.LIZ;
        r7 = r10.LJIL.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r9 == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r15 = r3.LIZJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if (r15.hasNext() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
        r4 = r15.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if (r4 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r2 = r4.getUser();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        r13 = r2.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (r13 != r7.getId()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r9 != 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
        r15.remove();
        r3.LIZIZ.removeView(r4);
        r3.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03bf, code lost:
        if (r9 == 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03c3, code lost:
        if (r3.LJII == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03c5, code lost:
        r2 = r3.LJIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03c7, code lost:
        if (r2 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03c9, code lost:
        r2 = r2.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03cd, code lost:
        if (r2 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03cf, code lost:
        r11 = r2.keySet().iterator();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03dc, code lost:
        if (r11.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x03de, code lost:
        r9 = r11.next();
        r4 = r3.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x03e8, code lost:
        if ((r4 instanceof p003X.C79241HLn) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03ea, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03eb, code lost:
        r4 = (p003X.C79241HLn) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03ed, code lost:
        if (r4 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03f3, code lost:
        if (r4.m23752LJ(r9) != true) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03f5, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03fa, code lost:
        if (r7 >= 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0402, code lost:
        if (p003X.C78403GvV.LIZIZ.LIZIZ() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0404, code lost:
        r4 = r10.LJIL.LIZIZ;
        r0 = r3.LIZIZ.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r2 = new com.bytedance.android.live.liveinteract.interact.audience.p362ui.C4442a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x041c, code lost:
        if (r3.LIZJ.size() <= 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0425, code lost:
        if (r3.LIZJ.size() != (2 - r7)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0427, code lost:
        r1 = r3.LIZJ.remove(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x042f, code lost:
        if (r1 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0431, code lost:
        r6 = r1.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0437, code lost:
        if (r6 != r3.LIZIZ) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0439, code lost:
        r3.LIZIZ.removeView(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x043e, code lost:
        r2.setAcceptClickListener(new p003X.View$OnClickListenerC79052HEg(r3, r2));
        r2.LIZ(r4);
        r2.setCloseListener(new p003X.HEM(r3, r2, r4));
        r3.LIZIZ.addView(r2);
        r3.LIZJ.add(r2);
        r3.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03f8, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x009b, code lost:
        if (((com.bytedance.android.live.liveinteract.api.IInteractService) r2).getPkService().LJIIIZ() == 1) goto L30;
     */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r30) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceAnchorWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPkInteractAudienceAnchorWidget(AbstractC6070q abstractC6070q, AbstractC4254a abstractC4254a) {
        super(abstractC4254a);
        C106862S5w.LIZ(abstractC6070q, abstractC4254a);
        this.LIZLLL = abstractC6070q;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 18).isSupported) {
            return;
        }
        super.LIZIZ(j, exc);
        C88440Kt0.LIZ(2131585643);
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZLLL(long j, Throwable th) {
        if (!PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 41).isSupported && (th instanceof ApiServerException)) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 10).isSupported) {
            return;
        }
        super.LIZIZ(j, th);
        if (th instanceof ApiServerException) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZIZ(long j, boolean z) {
        C79008HCo c79008HCo;
        if (!PatchProxy.proxy(new Object[]{new Long(j), (byte) 0}, this, LIZIZ, false, 35).isSupported && (c79008HCo = this.LJIILL) != null) {
            c79008HCo.LIZ(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZJ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 39).isSupported) {
            return;
        }
        C88469KtT.LIZ(this.context, th, 2131585535);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(long j, C6068x c6068x) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6068x}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6068x);
        super.LIZ(j, c6068x);
        C88440Kt0.LIZ(2131584497);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        super.LIZ(j, exc);
        C88440Kt0.LIZ(getContext(), 2131585534);
    }

    private final void LIZ(boolean z, boolean z2, boolean z3) {
        Map<String, Object> emptyMap;
        LiveCore liveCore;
        ILayerControl layerControl;
        ILayerControl.ILayer localOriginLayer;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 25).isSupported) {
            return;
        }
        C79199HJx c79199HJx = this.LJII;
        if (c79199HJx == null || (emptyMap = c79199HJx.LIZJ()) == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        Object obj = emptyMap.get(LinkCrossRoomDataHolder.LJII().LJIIIIZZ);
        float f = 1.0f - ((float) (HKK.LIZLLL / HKK.LIZJ));
        String str = this.LJIIJ;
        ALogger.m15801d(str, "adjustPkSingleView myLayer = " + obj + ", bottom = " + f + ", skipCheck = " + z3 + ", adjust = " + z2 + ", guestLinkMicId = " + LinkCrossRoomDataHolder.LJII().LJIIIIZZ);
        boolean z4 = obj instanceof ILayerControl.ILayer;
        if (!z4 && !z3) {
            return;
        }
        if (z) {
            C79199HJx c79199HJx2 = this.LJII;
            if (c79199HJx2 != null && (liveCore = c79199HJx2.LIZJ) != null && (layerControl = liveCore.getLayerControl()) != null && (localOriginLayer = layerControl.getLocalOriginLayer()) != null) {
                VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
                videoMixerDescription.setLeft(0.0f);
                videoMixerDescription.setTop(0.0f);
                videoMixerDescription.setRight(0.5f);
                if (!z2) {
                    f = 1.0f;
                }
                videoMixerDescription.setBottom(f);
                videoMixerDescription.setzOrder(0);
                videoMixerDescription.setVisibility(true);
                videoMixerDescription.setMode(2);
                localOriginLayer.updateDescription(videoMixerDescription);
            }
        } else if (z4) {
            ILayerControl.ILayer iLayer = (ILayerControl.ILayer) obj;
            VideoMixer.VideoMixerDescription videoMixerDescription2 = new VideoMixer.VideoMixerDescription();
            videoMixerDescription2.setLeft(0.5f);
            videoMixerDescription2.setTop(0.0f);
            videoMixerDescription2.setRight(1.0f);
            if (!z2) {
                f = 1.0f;
            }
            videoMixerDescription2.setBottom(f);
            videoMixerDescription2.setzOrder(0);
            videoMixerDescription2.setVisibility(true);
            videoMixerDescription2.setMode(2);
            iLayer.updateDescription(videoMixerDescription2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAnchorWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, SurfaceView surfaceView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        super.LIZIZ(str, surfaceView, i, i2);
        LJIIIZ();
        LIZJ(str);
        HJK hjk = this.LJIILIIL;
        if (hjk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (str == null) {
            str = "";
        }
        hjk.LIZ(str, surfaceView);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o
    public final void LIZ(long j, long j2, String str, int i, long j3) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, 1, new Long(j3)}, this, LIZIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HBR.LIZ(LJII(), j, j2, str, 1, -1, 0, j3, 32, null);
    }

    public static /* synthetic */ void LIZ(LinkPkInteractAudienceAnchorWidget linkPkInteractAudienceAnchorWidget, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{linkPkInteractAudienceAnchorWidget, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), (byte) 0, 4, null}, null, LIZIZ, true, 26).isSupported) {
            return;
        }
        linkPkInteractAudienceAnchorWidget.LIZ(z, z2, false);
    }
}
