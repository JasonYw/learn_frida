package com.bytedance.android.live.broadcastgame;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.android.live.broadcastgame.api.IAudienceGameWidget;
import com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e;
import com.bytedance.android.live.broadcastgame.api.channel.C3336f;
import com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.openplatform.AbstractC3398b;
import com.bytedance.android.live.broadcastgame.api.util.OpenPlatformTimeTracer;
import com.bytedance.android.live.broadcastgame.widget.InteractGameSEIWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8784ca;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WD;
import p003X.C35F;
import p003X.C423702pg;
import p003X.C443233g5;
import p003X.C4574547f;
import p003X.C87710KhE;
import p003X.C87767Ki9;
import p003X.KM9;
import p003X.KWA;
import p003X.KWC;
import p003X.KXQ;

/* loaded from: classes5.dex */
public final class AudienceGameWidget extends IAudienceGameWidget implements AbstractC3335e, AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public InteractGameSEIWidget LIZIZ;
    public AbstractC3398b LIZJ;
    public AbstractC3475n LIZLLL;
    public C3383p LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public AbstractC3398b LJIILLIIL;
    public KWA LJIIZILJ;
    public static final KWC LJIIJJI = new KWC((byte) 0);

    /* renamed from: LJ */
    public static final String f26010LJ = "INNER_GAME_START";
    public static final String LJFF = "INNER_GAME_STOP";
    public static final String LJI = "GAME_FLOAT_BALL_ENTRANCE_INFO";
    public static final String LJII = "INNER_SHOW_CONTAINER";
    public static final String LJIIIIZZ = "INNER_HIDE_CONTAINER";
    public static final String LJIIIZ = "INNER_UPDATE_SLOT_TAG_IMAGE";
    public static final String LJIIJ = "INNER_UPDATE_ANCHOR_BUBBLE";

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e
    public final String LIZIZ() {
        return "AudienceGameEntrance";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698329;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.IAudienceGameWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public AudienceGameWidget() {
        KXQ.LIZ().LIZJ().LIZ(this);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onPause();
        ((AbstractC3332b) ServiceManager.getService(IAnchorAudienceMsgService.class)).onPause();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onResume();
        ((AbstractC3332b) ServiceManager.getService(IAnchorAudienceMsgService.class)).onResume();
    }

    static {
        Covode.recordClassIndex(18993);
    }

    private final void LIZ() {
        WidgetManager widgetManager;
        List<Widget> list;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (widgetManager = this.subWidgetManager) != null && (list = widgetManager.widgets) != null) {
            for (Widget widget : list) {
                widgetManager.unload(widget);
            }
        }
    }

    @Deprecated(message = "可删除")
    private final void LIZLLL() {
        C2WD<C3383p> LIZ2;
        if (this.LJIILIIL != null) {
            DataCenter dataCenter = this.dataCenter;
            if (dataCenter != null) {
                dataCenter.put("data_audience_interact_game", null);
            }
            C35F LIZ3 = C35F.LIZJ.LIZ();
            if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
                LIZ2.LIZ(null);
            }
            this.LJIILL = false;
            this.LJIILJJIL = false;
        }
    }

    @Deprecated(message = "可删除")
    private final void LIZJ() {
        String str;
        C2WD<C3383p> LIZ2;
        StringBuilder sb = new StringBuilder("showFloatBall: ");
        sb.append(this.LJIILL);
        sb.append(LoggerUtil.BLANK_TAG);
        C3383p c3383p = this.LJIILIIL;
        if (c3383p != null) {
            str = c3383p.f26026LJ;
        } else {
            str = null;
        }
        sb.append(str);
        ALogger.m15797i("AAM.AudienceGameWidget", sb.toString());
        C3383p c3383p2 = this.LJIILIIL;
        if (c3383p2 != null) {
            DataCenter dataCenter = this.dataCenter;
            if (dataCenter != null) {
                dataCenter.put("data_audience_interact_game", c3383p2);
            }
            if (!this.LJIILL) {
                C35F LIZ3 = C35F.LIZJ.LIZ();
                if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
                    LIZ2.LIZ(this.LJIILIIL);
                }
                this.LJIILL = true;
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        KWA kwa = this.LJIIZILJ;
        if (kwa != null) {
            kwa.LIZ();
            if (!PatchProxy.proxy(new Object[0], kwa, KWA.LIZ, false, 4).isSupported) {
                kwa.LIZIZ.clear();
                Object obj = kwa.LIZLLL.get("data_message_manager");
                if (obj != null) {
                    IMessageManager iMessageManager = (IMessageManager) obj;
                    if (iMessageManager != null) {
                        iMessageManager.removeMessageListener(MessageType.GAME_ZHUFEN_MESSAGE.LIZ(), kwa);
                    }
                    ((AbstractC3332b) ServiceManager.getService(IAnchorAudienceMsgService.class)).unregisterMessage(kwa);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.ugc.live.sdk.message.interfaces.IMessageManager");
                }
            }
        }
        ((AbstractC3332b) ServiceManager.getService(IAnchorAudienceMsgService.class)).unregisterMessage(this);
        LIZ();
        this.LJIILL = false;
        AbstractC3398b abstractC3398b = this.LIZJ;
        if (abstractC3398b != null) {
            abstractC3398b.LIZ();
        }
        AbstractC3398b abstractC3398b2 = this.LJIILLIIL;
        if (abstractC3398b2 != null) {
            abstractC3398b2.LIZ();
        }
    }

    @Deprecated(message = "可删除")
    private final void LIZ(String str) {
        C3383p c3383p;
        C3383p c3383p2 = this.LJIILIIL;
        try {
            c3383p = (C3383p) KM9.LIZ().fromJson(str, (Class<Object>) C3383p.class);
        } catch (Exception unused) {
            c3383p = null;
        }
        this.LJIILIIL = c3383p;
        if (c3383p2 != null) {
            LIZLLL();
        }
        LIZ("livesdk_live_game_audience_recv_cmd_entrance", MapsKt__MapsKt.emptyMap());
        ALogger.m15797i("AAM.AudienceGameWidget", "isStart:" + this.LJIILJJIL + ", isFloatBallShow:" + this.LJIILL + ", " + this.LJIILIIL);
        C3383p c3383p3 = this.LJIILIIL;
        if (c3383p3 != null) {
            DataCenter dataCenter = this.dataCenter;
            if (dataCenter != null) {
                dataCenter.put("cmd_interact_game_audience_preload_float_res", c3383p3);
            }
            ((AbstractC3332b) ServiceManager.getService(IAnchorAudienceMsgService.class)).setGameExtra(c3383p3);
            if (this.LJIILJJIL && !this.LJIILL) {
                LIZJ();
            }
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(iMessage);
        if (iMessage.getIntType() == MessageType.GAME_CHANNEL_MESSAGE.LIZ()) {
            C8784ca c8784ca = (C8784ca) iMessage;
            if (!PatchProxy.proxy(new Object[]{c8784ca}, this, LIZ, false, 9).isSupported && c8784ca.LIZIZ == 2) {
                String str = c8784ca.LIZJ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                if (str.length() > 0) {
                    String str2 = c8784ca.LIZJ;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    LIZ(str2);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        AbstractC3398b abstractC3398b;
        C2WD<C3383p> LIZ2;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        AbstractC3398b abstractC3398b2 = null;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            enableSubWidgetManager();
            this.LIZIZ = new InteractGameSEIWidget(null);
            this.subWidgetManager.load(this.LIZIZ);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_audience_interact_game", null);
        }
        C35F LIZ3 = C35F.LIZJ.LIZ();
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            LIZ2.LIZ(null);
        }
        ((AbstractC3332b) ServiceManager.getService(IAnchorAudienceMsgService.class)).registerMessage(this);
        this.LJIILL = false;
        C87767Ki9.LIZ().LIZ(OpenPlatformTimeTracer.EventName.miniapp_widget_load);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && C87710KhE.LIZIZ()) {
            DataCenter dataCenter2 = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
            if (C423702pg.LIZ(dataCenter2, false, 1, null)) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ENABLE_AUDIENCE_GAME_MANAGER;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (room = (Room) this.dataCenter.get("data_room")) != null) {
                    AbstractC3475n abstractC3475n = this.LIZLLL;
                    if (abstractC3475n != null) {
                        Context context = this.context;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        DataCenter dataCenter3 = this.dataCenter;
                        Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
                        long roomId = room.getRoomId();
                        ViewGroup viewGroup = this.containerView;
                        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                        abstractC3398b = abstractC3475n.LIZ(context, dataCenter3, roomId, viewGroup);
                    } else {
                        abstractC3398b = null;
                    }
                    this.LIZJ = abstractC3398b;
                    AbstractC3475n abstractC3475n2 = this.LIZLLL;
                    if (abstractC3475n2 != null) {
                        Context context2 = this.context;
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        DataCenter dataCenter4 = this.dataCenter;
                        Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
                        long roomId2 = room.getRoomId();
                        ViewGroup viewGroup2 = this.containerView;
                        Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                        abstractC3398b2 = abstractC3475n2.LIZIZ(context2, dataCenter4, roomId2, viewGroup2);
                    }
                    this.LJIILLIIL = abstractC3398b2;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e
    public final void LIZ(C3336f c3336f) {
        if (PatchProxy.proxy(new Object[]{c3336f}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3336f);
        if (!Intrinsics.areEqual(c3336f.LIZLLL, "onHeartBeatArrived")) {
            ALogger.m15801d("AAM.AudienceGameWidget", "onMessage: " + c3336f.LIZIZ());
        }
        if (C443233g5.LIZIZ.LIZJ(this.dataCenter)) {
            return;
        }
        String str = c3336f.LIZLLL;
        if (Intrinsics.areEqual(str, LJI)) {
            LIZ(c3336f.LJFF);
        } else if (Intrinsics.areEqual(str, f26010LJ)) {
            this.LJIILJJIL = true;
            try {
                new JSONObject(c3336f.LJFF).optString("lynx_resource_business_version");
            } catch (Throwable unused) {
            }
            LIZ("livesdk_live_game_audience_recv_cmd_start", MapsKt__MapsKt.emptyMap());
            LIZJ();
            ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logAnchorAudienceGameAudienceReceiveGameStartMsg(this.LJIILIIL, c3336f.f26013LJ);
        } else if (Intrinsics.areEqual(str, LJFF)) {
            ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logAnchorAudienceGameAudienceReceiveGameEndMsg(this.LJIILIIL, c3336f.f26013LJ);
            LIZLLL();
            this.LJIILJJIL = false;
            this.LJIILIIL = null;
        } else if (Intrinsics.areEqual(str, LJII)) {
            ((ILiveGameDebugService) ServiceManager.getService(ILiveGameDebugService.class)).dispatchLiveGameDebugMsg(new C3324a("[" + c3336f.LIZJ + "] 打开面板", false, 2));
            if (!c3336f.LJII) {
            }
        } else if (Intrinsics.areEqual(str, LJIIIIZZ)) {
            ((ILiveGameDebugService) ServiceManager.getService(ILiveGameDebugService.class)).dispatchLiveGameDebugMsg(new C3324a("[" + c3336f.LIZJ + "] 关闭面板", false, 2));
        }
    }

    private final void LIZ(String str, Map<String, String> map) {
        Long l;
        String str2;
        Room room;
        if (PatchProxy.proxy(new Object[]{str, map}, this, LIZ, false, 13).isSupported) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3383p c3383p = this.LJIILIIL;
        if (c3383p != null) {
            l = Long.valueOf(c3383p.LIZLLL);
        } else {
            l = null;
        }
        linkedHashMap.put("game_id", String.valueOf(l));
        C3383p c3383p2 = this.LJIILIIL;
        if (c3383p2 != null) {
            str2 = c3383p2.f26026LJ;
        } else {
            str2 = null;
        }
        linkedHashMap.put("game_name", String.valueOf(str2));
        if (this.dataCenter != null && (room = (Room) this.dataCenter.get("data_room", (String) null)) != null) {
            linkedHashMap.put("room_id", String.valueOf(room.getId()));
            linkedHashMap.put("anchor_id", String.valueOf(room.ownerUserId));
        }
        linkedHashMap.putAll(map);
        C4574547f.LIZ().LIZ(str, linkedHashMap, Room.class);
    }
}
