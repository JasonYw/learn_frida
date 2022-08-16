package com.bytedance.android.live.liveinteract.interact.audience;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.OpenPanelType;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.bid.BidLinkMicWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.a$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.interact.audience.paid.InteractPaidLinkWidget;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8856et;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9523ai;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.avframework.mixer.VideoMixer;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3BL;
import p003X.C409882Kg;
import p003X.C466894d9;
import p003X.C77347GeT;
import p003X.C78245Gsx;
import p003X.C78301Gtr;
import p003X.C78320GuA;
import p003X.C78531GxZ;
import p003X.C78536Gxe;
import p003X.C78538Gxg;
import p003X.C78828H5q;
import p003X.C78883H7t;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79220HKs;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.H5N;
import p003X.HBQ;
import p003X.HBX;
import p003X.HCE;
import p003X.HDS;
import p003X.HEV;
import p003X.HH8;
import p003X.HHA;
import p003X.HKJ;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class InteractAudienceAnchorWidget extends BaseAnchorLinkWidget<LinkPlayerInfo> implements Observer<KVData>, a$a, AbstractC4772f, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZIZ;
    public Client.StreamMixer LIZLLL;

    /* renamed from: LJ */
    public int f26316LJ;
    public final AbstractC6070q LJFF;
    public C4806x LJIIL;
    public HEV LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIIZILJ;
    public H5N LJIJ;
    public boolean LJIJI;
    public IMessageManager LJIJJ;
    public long LJIJJLI;
    public InteractPaidLinkWidget LJJ;
    public BidLinkMicWidget LJJI;
    public Config.VideoQuality LIZJ = Config.VideoQuality.ANCHOR_NORMAL;
    public final CompositeDisposable LJIILL = new CompositeDisposable();
    public HDS LJIILLIIL = new HDS(this);
    public final Lazy LJIL = C77347GeT.LIZ(new InteractAudienceAnchorWidget$mLinkBidViewModel$2(this));

    static {
        Covode.recordClassIndex(26981);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 4;
    }

    public final C4378a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        return (C4378a) (proxy.isSupported ? proxy.result : this.LJIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget
    /* renamed from: LJ */
    public final int mo15674LJ() {
        return 1;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700421;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 49).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget
    public final AbstractC6070q LJII() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final HEV LJIIJ() {
        return this.LJIILIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 20).isSupported) {
            return;
        }
        super.LIZ(str, textureView, i, i2);
        C4806x c4806x = this.LJIIL;
        this.LJIIZILJ = c4806x != null ? c4806x.LIZJ(str) : 0L;
        HEV hev = this.LJIILIIL;
        if (hev == null) {
            return;
        }
        hev.LIZ(str, textureView, i, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 21).isSupported) {
            return;
        }
        super.LIZ(str, surfaceView, i, i2);
        C4806x c4806x = this.LJIIL;
        this.LJIIZILJ = c4806x != null ? c4806x.LIZJ(str) : 0L;
        HEV hev = this.LJIILIIL;
        if (hev == null) {
            return;
        }
        hev.LIZ(str, surfaceView, i, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 22).isSupported) {
            return;
        }
        super.LIZ(str, iLayer, i, i2);
        C4806x c4806x = this.LJIIL;
        this.LJIIZILJ = c4806x != null ? c4806x.LIZJ(str) : 0L;
        C4806x c4806x2 = this.LJIIL;
        int LIZLLL = c4806x2 != null ? c4806x2.LIZLLL(this.LJIIZILJ) : -1;
        Client.StreamMixer streamMixer = this.LIZLLL;
        C466894d9 c466894d9 = null;
        if (!(streamMixer instanceof HKJ)) {
            streamMixer = null;
        }
        HKJ hkj = (HKJ) streamMixer;
        if (hkj != null) {
            c466894d9 = hkj.LIZ(LIZLLL - 1);
        }
        HEV hev = this.LJIILIIL;
        if (hev == null) {
            return;
        }
        hev.LIZ(str, iLayer, LIZLLL, c466894d9);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZIZ, false, 26).isSupported) {
            return;
        }
        super.LIZ(str, j);
        if (str != null) {
            C4806x c4806x = this.LJIIL;
            if (c4806x != null) {
                c4806x.LIZ(str);
            }
            HEV hev = this.LJIILIIL;
            if (hev != null) {
                hev.LIZIZ(0L, str);
            }
        }
        LJIILL();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZ(c8854es);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.a$a
    public final boolean LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 29);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4806x c4806x = this.LJIIL;
        if (c4806x == null) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, c4806x, C4806x.LIZ, false, 58);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        LinkPlayerInfo LIZ = c4806x.LIZ(0L, str);
        return LIZ == null || !LIZ.LJJJ;
    }

    @Override // p003X.HHU
    public final void LIZ(InteractConfig interactConfig) {
        if (PatchProxy.proxy(new Object[]{interactConfig}, this, LIZIZ, false, 35).isSupported) {
            return;
        }
        if (interactConfig != null) {
            interactConfig.setStreamMixer(this.LIZLLL);
            interactConfig.setBackgroundColor("#1F212C");
            StreamUrl streamUrl = LJIJI().getStreamUrl();
            interactConfig.setMixStreamRtmpUrl(streamUrl != null ? streamUrl.LIZ() : null);
            interactConfig.setContext(this.context);
            Config videoQuality = interactConfig.setVideoQuality(this.LIZJ);
            if (videoQuality != null) {
                videoQuality.setInteractMode(Config.InteractMode.NORMAL);
                videoQuality.setCharacter(Config.Character.ANCHOR);
                videoQuality.setSeiVersion(1);
                videoQuality.setViewType(Config.ViewType.TEXTURE_VIEW);
                videoQuality.setVolumeCallbackInterval(1000);
                videoQuality.setType(Config.Type.VIDEO);
                videoQuality.setVolumeCallbackInterval(1000);
                videoQuality.setUpdateTalkSeiAB(true);
                videoQuality.setUpdateTalkSeiInterval(1000);
            }
        }
        Client.StreamMixer streamMixer = this.LIZLLL;
        if (!(streamMixer instanceof HKJ)) {
            streamMixer = null;
        }
        HKJ hkj = (HKJ) streamMixer;
        if (hkj == null) {
            return;
        }
        hkj.LIZIZ = interactConfig;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        if (LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            C88440Kt0.LIZ(2131584120);
        } else {
            super.LIZ(user);
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 48).isSupported) {
            return;
        }
        this.LJIILJJIL = z;
        HEV hev = this.LJIILIIL;
        if (hev != null) {
            hev.m23777LJ(z);
        }
        InteractPaidLinkWidget interactPaidLinkWidget = this.LJJ;
        if (interactPaidLinkWidget == null) {
            return;
        }
        interactPaidLinkWidget.LIZIZ(z);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final HBX LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 34);
        if (proxy.isSupported) {
            return (HBX) proxy.result;
        }
        return LJIJJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final boolean LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 40);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LJIL().LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 46).isSupported) {
            return;
        }
        this.LJIJI = true;
        LJIL().LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        C79220HKs m23760LJ = C79220HKs.LIZ(this.dataCenter, this).m23760LJ();
        m23760LJ.LIZJ = C78245Gsx.LIZ(m23760LJ, this.dataCenter);
        if (this.context instanceof FragmentActivity) {
            Context context = this.context;
            if (context != null) {
                m23760LJ.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final AbstractC78986HBs<LinkPlayerInfo> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 33);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (this.LJIIL == null) {
            Room LJIJI = LJIJI();
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJIIL = new C4806x(LJIJI, dataCenter, 4);
        }
        C4806x c4806x = this.LJIIL;
        if (c4806x != null) {
            return c4806x;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.core.LinkUserInfoCenterV2");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final int LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 44);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C4806x c4806x = this.LJIIL;
        if (c4806x == null) {
            return 0;
        }
        return c4806x.LJIIJJI();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public final void mo15659W_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 23).isSupported) {
            return;
        }
        if (this.LJIJI) {
            this.LJIJI = false;
            H5N h5n = this.LJIJ;
            if (h5n != null) {
                h5n.LIZ();
                return;
            }
            return;
        }
        super.mo15659W_();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        if (LJIL().LJI) {
            LJIL().LIZJ();
            LJFF().LJIIIZ();
        }
        super.onPause();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        super.onResume();
        if (LJIL().LJI) {
            LJIL().LIZIZ();
            LJFF().LJIIJ();
        }
    }

    private final void LJIILJJIL() {
        DataCenter dataCenter;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 13).isSupported && (dataCenter = this.dataCenter) != null) {
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

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    public final void mo15660V_() {
        Boolean bool;
        String str;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 18).isSupported) {
            return;
        }
        super.mo15660V_();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            LJIL();
            Config.Vendor LJIIIZ = HHA.LJIIIZ();
            if (LJIIIZ != null) {
                str = LJIIIZ.name();
            } else {
                str = null;
            }
            dataCenter.put("data_interact_debug_info", new HCE(true, str));
        }
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null && (bool = (Boolean) dataCenter2.get("data_is_anchor", (String) Boolean.FALSE)) != null) {
            z = bool.booleanValue();
        }
        LinkControlWidget.LIZIZ("normal", z);
    }

    private final void LJIILL() {
        HHA LJIL;
        Map<String, Object> map;
        HEV hev;
        float f;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 27).isSupported && (LJIL = LJIL()) != null && (map = LJIL.LJIILLIIL) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                entry.getKey();
                Object value = entry.getValue();
                if ((value instanceof ILayerControl.ILayer) && (hev = this.LJIILIIL) != null) {
                    ILayerControl.ILayer iLayer = (ILayerControl.ILayer) value;
                    if (!PatchProxy.proxy(new Object[]{iLayer}, hev, HEV.LIZ, false, 29).isSupported && hev.LJIILJJIL != null) {
                        VideoMixer.VideoMixerDescription layerDescription = iLayer.getLayerDescription();
                        boolean booleanValue = ((Boolean) ((Pair) hev.LJIILJJIL.get("data_broadcast_stream_size_adjusted", (String) Pair.create(Boolean.FALSE, Boolean.FALSE))).second).booleanValue();
                        float LIZIZ2 = LK5.LIZIZ() * 1.0f;
                        float LIZ = (LIZIZ2 - (LK5.LIZ(8.0f) * 2)) - LK5.LIZ(36.0f);
                        if (booleanValue) {
                            f = 1.0f;
                        } else {
                            f = (LIZ * 1.0f) / LIZIZ2;
                        }
                        layerDescription.setTop(f - ((hev.LJIIIIZZ * 1.0f) / LIZIZ2));
                        layerDescription.setBottom(f);
                        iLayer.updateDescription(layerDescription);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LJIIJJI() {
        C2WC<Integer> LLLILZJ;
        String str;
        C2WC<Integer> LLLILZJ2;
        C2WC<String> LLLIZZ;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 45).isSupported) {
            return;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null) {
            ALogger.m15801d("open_panel_for_schema", "params : openPanelType = " + LJJJI.LLLILZJ().LIZ().intValue() + ", platformActivityId = " + LJJJI.LLLIZZ().LIZ());
            HH8.LIZIZ(LJJJI.LLLILZJ().LIZ().intValue(), LJJJI.LLLIZZ().LIZ());
        }
        if (C78538Gxg.m23797LJ()) {
            if (C4284f.LJIIIIZZ.LIZ()) {
                IService service = ServiceManager.getService(IInteractService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                C3BL interactAudienceService = ((IInteractService) service).getInteractAudienceService();
                Context context = this.context;
                C5923dp LJJJI2 = LJJJI();
                if (LJJJI2 != null && (LLLIZZ = LJJJI2.LLLIZZ()) != null) {
                    str = LLLIZZ.LIZ();
                } else {
                    str = null;
                }
                interactAudienceService.LIZ(context, str);
                C5923dp LJJJI3 = LJJJI();
                if (LJJJI3 != null && (LLLILZJ2 = LJJJI3.LLLILZJ()) != null) {
                    LLLILZJ2.LIZ(Integer.valueOf(OpenPanelType.NONE.value));
                    return;
                }
                return;
            }
            C79220HKs LIZIZ2 = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
            Context context2 = this.context;
            if (context2 != null) {
                LIZIZ2.show(((FragmentActivity) context2).getSupportFragmentManager(), "LinkDialog");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        C5923dp LJJJI4 = LJJJI();
        if (LJJJI4 != null && (LLLILZJ = LJJJI4.LLLILZJ()) != null) {
            LLLILZJ.LIZ(Integer.valueOf(OpenPanelType.NONE.value));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        C4378a LIZJ;
        NextLiveData<Integer> nextLiveData;
        Integer value;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12);
        String str = "on";
        if (proxy.isSupported) {
            str = (String) proxy.result;
        } else {
            BidLinkMicWidget bidLinkMicWidget = this.LJJI;
            if ((bidLinkMicWidget == null || !bidLinkMicWidget.LIZJ) && (C78531GxZ.LIZJ() || (LIZJ = LIZJ()) == null || (nextLiveData = LIZJ.LJIILJJIL) == null || (value = nextLiveData.getValue()) == null || value.intValue() != 1)) {
                str = "off";
            }
        }
        if (!PatchProxy.proxy(new Object[0], C78301Gtr.LIZIZ, C78301Gtr.LIZ, false, 13).isSupported) {
            C78828H5q.LIZ((String) null, (String) null, "layout_type_close", 3, (Object) null);
        }
        C78301Gtr.LIZIZ.LIZ(this.LJIJJLI, this.f26316LJ, LJIJI().circleInfo, str);
        if (C78320GuA.LIZ()) {
            C78536Gxe.LIZJ.LIZIZ();
        }
        IMessageManager iMessageManager = this.LJIJJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        super.onDestroy();
        this.LJIILL.dispose();
        HEV hev = this.LJIILIIL;
        if (hev != null) {
            hev.LIZ();
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.removeObserver(this);
        }
        LJIILJJIL();
        C87010KQi.LIZ().LIZ(new C5984am(15));
        C79046HEa.LIZ().LIZ((Integer) 0);
        if (!C78531GxZ.LIZJ() && LIZJ().LIZJ()) {
            LIZJ().LJIILJJIL.setValue(2);
        }
        ALogger.m15795w("ttlive_link_audience", "onDestroy");
        C79007HCn.LJII().LJJII = null;
        this.LIZLLL = null;
        C5923dp LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ != null && (LJJJJZ = LIZ.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ.LIZIZ()) != null) {
            LIZIZ2.LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r8 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LJIILIIL() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceAnchorWidget.LJIILIIL():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f9, code lost:
        r0 = com.p1594ss.avframework.livestreamv2.core.interact.model.Config.VideoQuality.ANCHOR_NORMAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f5, code lost:
        if (r0.anchorInteractProfile > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (((java.lang.Boolean) r4.result).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        r0 = com.p1594ss.avframework.livestreamv2.core.interact.model.Config.VideoQuality.ANCHOR_HIGH;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceAnchorWidget.onCreate():void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 14).isSupported) {
            return;
        }
        super.LIZ(j);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.a$a
    public final long LIZJ(String str) {
        User LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 31);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C4806x c4806x = this.LJIIL;
        if (c4806x != null && (LIZIZ2 = c4806x.LIZIZ(str)) != null) {
            return LIZIZ2.getId();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    /* renamed from: LJ */
    public final void mo15718LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 39).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.dataCenter.put("data_interact_number_dot_show", "");
        LIZ(this.LJIIJ, str);
        LJIILJJIL();
    }

    private final boolean LJFF(String str) {
        List<AnchorLinkUser> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C9523ai c9523ai = C79007HCn.LJII().LJJII;
        if (c9523ai != null && (list = c9523ai.LIZLLL) != null) {
            for (AnchorLinkUser anchorLinkUser : list) {
                Intrinsics.checkNotNullExpressionValue(anchorLinkUser, "");
                if (TextUtils.equals(anchorLinkUser.LIZIZ(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.a$a
    public final int LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 30);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C4806x c4806x = this.LJIIL;
        if (c4806x == null) {
            return 0;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, c4806x, C4806x.LIZ, false, 59);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        LinkPlayerInfo LIZ = c4806x.LIZ(0L, str);
        if (LIZ == null) {
            return 1;
        }
        return LIZ.m15703LJ();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.a$a
    public final boolean LIZLLL(String str) {
        LinkPlayerInfo LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4806x c4806x = this.LJIIL;
        if (c4806x == null || (LIZ = c4806x.LIZ(0L, str)) == null) {
            return false;
        }
        return LIZ.LJIIZILJ;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZIZ, false, 36).isSupported && kVData2 != null) {
            String key = kVData2.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -95319361) {
                if (hashCode == 1715701863 && key.equals("cmd_force_close_linkin_before_videotalk")) {
                    LIZ(this.LJIIJ, "stop_intimate_before_big_party");
                }
            } else if (!key.equals("cmd_force_close_linkin")) {
            } else {
                LIZ(this.LJIIJ, "forbidden_notice");
            }
        }
    }

    public final void onEvent(C5984am c5984am) {
        if (!PatchProxy.proxy(new Object[]{c5984am}, this, LIZIZ, false, 6).isSupported && c5984am != null && c5984am.LIZ == 17 && C78883H7t.LIZIZ.LIZ(LJIJI())) {
            this.dataCenter.put("data_interact_number_dot_show", "");
            if (!C78531GxZ.LIZJ()) {
                LIZJ().LJIILJJIL.setValue(2);
            }
            LJJ();
            LJIILJJIL();
            aj_();
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZIZ, false, 47).isSupported || iMessage == null) {
            return;
        }
        if (iMessage instanceof C8856et) {
            C8856et c8856et = (C8856et) iMessage;
            C88440Kt0.LIZ(c8856et.LIZIZ);
            LIZ(c8856et.LIZ, "", "msequence_msg");
            HEV hev = this.LJIILIIL;
            if (hev != null) {
                long j = c8856et.LIZ;
                if (!PatchProxy.proxy(new Object[]{new Long(j)}, hev, HEV.LIZ, false, 46).isSupported) {
                    hev.LJIJ.add(Long.valueOf(j));
                }
            }
        } else if (iMessage instanceof C8874fl) {
            C8874fl c8874fl = (C8874fl) iMessage;
            if (c8874fl.LIZIZ == 23) {
                HEV hev2 = this.LJIILIIL;
                if (hev2 != null) {
                    hev2.LIZ(c8874fl);
                }
            } else if (c8874fl.LIZIZ == 46) {
                C79007HCn.LJII().LJJII = c8874fl.LJJJJIZL;
                C79007HCn LJII = C79007HCn.LJII();
                C9523ai c9523ai = c8874fl.LJJJJIZL;
                String str2 = null;
                if (c9523ai != null) {
                    str = c9523ai.LIZIZ;
                } else {
                    str = null;
                }
                LJII.LJII = str;
                C79007HCn LJII2 = C79007HCn.LJII();
                C9523ai c9523ai2 = c8874fl.LJJJJIZL;
                if (c9523ai2 != null) {
                    str2 = c9523ai2.LIZJ;
                }
                LJII2.LJIIIIZZ = str2;
                LJIILIIL();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 42).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZIZ(c8854es);
        User user = new User();
        user.setId(c8854es.LJJI);
        user.setSecUid(c8854es.LJJIFFI);
        LIZ(user);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LIZ(H5N h5n) {
        if (PatchProxy.proxy(new Object[]{h5n}, this, LIZIZ, false, 43).isSupported) {
            return;
        }
        C106862S5w.LIZ(h5n);
        this.LJIJ = h5n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractAudienceAnchorWidget(AbstractC6070q abstractC6070q, AbstractC4254a abstractC4254a) {
        super(abstractC4254a);
        C106862S5w.LIZ(abstractC6070q, abstractC4254a);
        this.LJFF = abstractC6070q;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(long j, C6068x c6068x) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6068x}, this, LIZIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6068x);
        super.LIZ(j, c6068x);
        C88440Kt0.LIZ(2131584497);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 24).isSupported) {
            return;
        }
        if (this.LJIJI) {
            this.LJIJI = false;
            H5N h5n = this.LJIJ;
            if (h5n != null) {
                h5n.LIZ(2);
                return;
            }
            return;
        }
        super.LIZIZ(j, exc);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 25).isSupported) {
            return;
        }
        super.LIZJ(j, exc);
        C88440Kt0.LIZ(2131585643);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        super.LIZ(j, exc);
        C88440Kt0.LIZ(getContext(), 2131585534);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        super.LIZIZ(j, th);
        if (th instanceof ApiServerException) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        super.LIZ(j, th);
        if (th instanceof ApiServerException) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LIZ(long j, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, LIZIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2);
        if (str2.length() == 0) {
            str2 = "anchor_stop_normal";
        }
        LJIJJ().LIZ(j, str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LIZ(long j, long j2, String str, int i, long j3) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, 1, new Long(j3)}, this, LIZIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HBQ.LIZ(LJIJJ(), j, j2, str, 1, -1, 0, j3, 32, null);
    }
}
