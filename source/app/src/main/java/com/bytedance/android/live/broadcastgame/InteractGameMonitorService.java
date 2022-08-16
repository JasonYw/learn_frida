package com.bytedance.android.live.broadcastgame;

import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C440943cO;
import p003X.C441833dp;
import p003X.C87654KgK;

/* loaded from: classes5.dex */
public class InteractGameMonitorService implements IInteractGameMonitorService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mCurrentGameIdentifier = "";
    public long mStartGameTime;

    static {
        if (ReDexClinitStringAb.abTest >= 4) {
            Covode.recordClassIndex(18995);
        } else {
            Covode.recordClassIndex(18995);
        }
    }

    private final void monitor(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public String getCurrentGameIdentifier() {
        return this.mCurrentGameIdentifier;
    }

    public InteractGameMonitorService() {
        ServiceManager.registerService(IInteractGameMonitorService.class, this);
    }

    private final String generateCurrentGameIdentifier() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "game_" + System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectGameStart(C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{c3384q}, this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        logService$default(this, "ttlive_effect_game_start_all", 0, c3384q, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void recordGameIdentifier(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (str.length() == 0) {
            this.mCurrentGameIdentifier = generateCurrentGameIdentifier();
        } else {
            this.mCurrentGameIdentifier = str;
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectBatchLoadStart(List<C3384q> list) {
        long j;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (C3384q c3384q : list) {
            C3383p LJFF = c3384q.LJFF();
            if (LJFF != null) {
                j = LJFF.LIZLLL;
            } else {
                j = 0;
            }
            arrayList.add(Long.valueOf(j));
        }
        ArrayList arrayList2 = arrayList;
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "game_id_arr", arrayList2.toString());
        C440943cO.LIZ(jSONObject, "download_count", arrayList2.size());
        monitorStatus("ttlive_effect_game_resource_preload_start_all", 0, jSONObject);
    }

    @Deprecated(message = "这只是一种成本比较低的迁移方案")
    private final void adapterDataFormat(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.toString();
            String obj = jSONObject.get(next).toString();
            if (C87654KgK.LIZ.contains(next)) {
                C440943cO.LIZ(jSONObject2, next, obj);
            }
        }
    }

    private final void addParams(JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, jSONObject2}, this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.toString();
                C440943cO.LIZ(jSONObject, next, jSONObject2.get(next).toString());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameAudienceReceiveGameEndMsg(C3383p c3383p, long j) {
        if (PatchProxy.proxy(new Object[]{c3383p, new Long(j)}, this, changeQuickRedirect, false, 32).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_type", j);
        this.mCurrentGameIdentifier = "";
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_audience_receive_game_end_msg_all", 0, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameAudienceReceiveGameStartMsg(C3383p c3383p, long j) {
        if (PatchProxy.proxy(new Object[]{c3383p, new Long(j)}, this, changeQuickRedirect, false, 31).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_type", j);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_audience_receive_game_start_msg_all", 0, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameMessageChannelInitAll(boolean z, boolean z2) {
        long j;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            j = 0;
        } else {
            j = 1;
        }
        C440943cO.LIZ(jSONObject, "is_anchor", j);
        monitorStatus("ttlive_interactive_game_communication_service_initialize_all", !z ? 1 : 0, jSONObject);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectGameEnd(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        logService$default(this, "ttlive_effect_game_end_all", i, c3384q, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectGameGuideVideoClick(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        logService$default(this, "ttlive_effect_game_guide_video_click_all", i, c3384q, null, 0L, null, 56, null);
        if (i == 1) {
            this.mCurrentGameIdentifier = "";
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectGameGuideVideoShow(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        logService$default(this, "ttlive_effect_game_guide_video_show_all", i, c3384q, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectGameMusicShow(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        logService$default(this, "ttlive_effect_game_music_show_all", i, c3384q, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectGameSelectMusic(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        logService$default(this, "ttlive_effect_game_select_music_all", i, c3384q, null, 0L, null, 56, null);
        if (i == 1) {
            this.mCurrentGameIdentifier = "";
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameCountDown(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        logService$default(this, "ttlive_interactive_game_count_down_all", i, c3384q, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameIntroClick(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        logService$default(this, "ttlive_interactive_game_intro_click_all", i, c3384q, null, 0L, null, 56, null);
        if (i == 1) {
            this.mCurrentGameIdentifier = "";
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameIntroShow(int i, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        logService$default(this, "ttlive_interactive_game_intro_show_all", i, c3384q, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logOpenFuncGameData(JSONObject jSONObject, boolean z) {
        String substring;
        Integer num;
        Long l;
        String obj;
        String obj2;
        if (PatchProxy.proxy(new Object[]{jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("params"));
            String optString = jSONObject.optString("eventKey");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Intrinsics.checkNotNullExpressionValue(optString.substring(0, 7), "");
            if (!Intrinsics.areEqual(substring, "ttlive_")) {
                optString = "ttlive_" + optString;
            }
            Object remove = jSONObject2.remove("err_code");
            Object remove2 = jSONObject2.remove("err_msg");
            Object remove3 = jSONObject2.remove("status");
            if (remove3 != null && (obj2 = remove3.toString()) != null) {
                num = StringsKt__StringNumberConversionsKt.toIntOrNull(obj2);
            } else {
                num = null;
            }
            Object remove4 = jSONObject2.remove("duration");
            if (remove4 != null && (obj = remove4.toString()) != null) {
                l = StringsKt__StringNumberConversionsKt.toLongOrNull(obj);
            } else {
                l = null;
            }
            JSONObject jSONObject3 = new JSONObject();
            addParams(jSONObject3, jSONObject2);
            C441833dp.LIZIZ.LIZ(jSONObject3, z);
            if (remove == null && remove2 == null) {
                Intrinsics.checkNotNullExpressionValue(optString, "");
                if (!StringsKt__StringsKt.contains$default((CharSequence) optString, (CharSequence) "_all", false, 2, (Object) null)) {
                    optString = optString + "_all";
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(optString, "");
                if (!StringsKt__StringsKt.contains$default((CharSequence) optString, (CharSequence) "error", false, 2, (Object) null)) {
                    optString = optString + "_error";
                }
                C440943cO.LIZ(jSONObject3, "error_code", remove.toString());
                C440943cO.LIZ(jSONObject3, "error_msg", remove2.toString());
            }
            ALogger.m15801d("IInteractGameMonitorService", optString + " + " + jSONObject3);
            if (num != null) {
                if (l != null) {
                    Intrinsics.checkNotNullExpressionValue(optString, "");
                    monitorStatusAndDuration(optString, num.intValue(), l.longValue(), jSONObject3);
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                monitorStatus(optString, num.intValue(), jSONObject3);
            }
        } catch (Throwable th) {
            ALogger.m15798e("IInteractGameMonitorService", th);
        }
    }

    @Deprecated(message = "后续不要使用这个上报了")
    private final void monitorStatus(String str, int i, JSONObject jSONObject) {
        monitor$default(this, str, i, jSONObject, 0L, 8, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logFetchInteractItemList(int i, long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), th}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        monitorStatusAndDuration("ttlive_fetch_interactive_game_list_all", i, j, jSONObject);
        if (i == 1) {
            C441833dp.LIZIZ.LIZ(jSONObject, th);
            monitorStatusAndDuration("ttlive_fetch_interactive_game_list_error", 1, j, jSONObject);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameInviteResult(int i, C3384q c3384q, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, str}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        if (str.length() > 0) {
            jSONObject.put("status_code", str);
        }
        logService$default(this, "ttlive_interactive_game_invite_result_all", i, c3384q, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameStartupResult(int i, C3384q c3384q, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, jSONObject}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        this.mStartGameTime = System.currentTimeMillis();
        logService$default(this, "ttlive_interactive_game_start_all", i, c3384q, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logInteractGameItemClick(int i, C3384q c3384q, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, jSONObject}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.mCurrentGameIdentifier = generateCurrentGameIdentifier();
        logService$default(this, "ttlive_interactive_game_icon_click_all", i, c3384q, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameLynxFirstScreen(C3383p c3383p, boolean z, long j) {
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, changeQuickRedirect, false, 40).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("panel_type", 1);
        jSONObject.put("is_anchor", !z ? 1 : 0);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_first_screen", 0, c3383p, jSONObject, j, null, 32, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameLynxInitAll(boolean z, C3383p c3383p, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3383p, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("panel_type", 1);
        jSONObject.put("is_anchor", !z2 ? 1 : 0);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_initial_all", !z ? 1 : 0, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameLynxReceiveError(C3383p c3383p, boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("panel_type", 1);
        jSONObject.put("is_anchor", !z ? 1 : 0);
        C440943cO.LIZ(jSONObject, "error_code", -1L);
        C440943cO.LIZ(jSONObject, "error_msg", str);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_error", 1, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameLynxUseOfflineRes(C3383p c3383p, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("panel_type", 1);
        jSONObject.put("is_anchor", !z ? 1 : 0);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_offline", !z2 ? 1 : 0, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGamePanelLoadStart(C3383p c3383p, boolean z, boolean z2) {
        int i = 2;
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 1;
        }
        jSONObject.put("panel_type", i);
        jSONObject.put("is_anchor", !z2 ? 1 : 0);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_page_start", 0, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceHeartSei(C3383p c3383p, boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 47).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_anchor", 1);
        jSONObject.put("error_msg", str);
        if (!z) {
            logServiceWithGameExtra$default(this, "ttlive_interactive_game_SEI_error", 1, c3383p, jSONObject, 0L, null, 48, null);
        }
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_SEI_all", !z ? 1 : 0, c3383p, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceSeiRecvByGop(C3383p c3383p, long j, long j2) {
        if (PatchProxy.proxy(new Object[]{c3383p, new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 46).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_anchor", 1);
        jSONObject.put("heart_beat", j);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_SEI", 1, c3383p, null, 0L, null, 56, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameStop(int i, C3384q c3384q, boolean z) {
        long currentTimeMillis;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "current_game_identifer", this.mCurrentGameIdentifier);
        if (z) {
            C440943cO.LIZ(jSONObject, "is_cut_short", 1);
        } else {
            C440943cO.LIZ(jSONObject, "is_cut_short", 0);
        }
        if (this.mStartGameTime == 0) {
            currentTimeMillis = 0;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.mStartGameTime;
        }
        logService$default(this, "ttlive_interactive_game_exit_all", i, c3384q, jSONObject, currentTimeMillis, null, 32, null);
        this.mCurrentGameIdentifier = "";
        this.mStartGameTime = 0L;
    }

    @Deprecated(message = "后续不要使用这个上报了")
    private final void monitorStatusAndDuration(String str, int i, long j, JSONObject jSONObject) {
        monitor(str, i, jSONObject, j);
    }

    @Deprecated(message = "后续不要使用这个上报了")
    private final void monitor(String str, int i, JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = new JSONObject();
        adapterDataFormat(jSONObject, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        if (j != -1) {
            C440943cO.LIZ(jSONObject3, "duration", j);
        }
        C441833dp.LIZIZ.LIZ(jSONObject, jSONObject2);
        C440943cO.LIZ(jSONObject2, "status", i);
        LiveTracingMonitor.LIZ(str, LiveTracingMonitor.EventModule.OPEN_PLATFORM, LiveTracingMonitor.EventType.BUSSINESS_API_CALL, jSONObject2, jSONObject3, jSONObject);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameInteractPanelShow(C3383p c3383p, boolean z, boolean z2, int i) {
        int i2 = 2;
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, changeQuickRedirect, false, 34).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            i2 = 1;
        }
        jSONObject.put("panel_type", i2);
        jSONObject.put("is_anchor", !z ? 1 : 0);
        jSONObject.put("panel_state", i);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_show_all", 0, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameLynxFirstScreenFromStart(C3383p c3383p, boolean z, long j, int i) {
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 39).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("panel_type", 1);
        jSONObject.put("is_anchor", !z ? 1 : 0);
        jSONObject.put("from", i);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_first_screen_from_recv_start", 0, c3383p, jSONObject, j, null, 32, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameOpenEntranceApiRequest(boolean z, C3384q c3384q, String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3384q, str, th}, this, changeQuickRedirect, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3384q, str);
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "log_id", str);
        logService$default(this, "ttlive_interactive_game_communication_anchor_to_audience_preload_all", !z ? 1 : 0, c3384q, jSONObject, 0L, null, 48, null);
        if (!z) {
            logService$default(this, "ttlive_interactive_game_communication_anchor_to_audience_preload_error", 1, c3384q, jSONObject, 0L, th, 16, null);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGamePanelStartDownload(C3383p c3383p, boolean z, int i, boolean z2) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_anchor", !z ? 1 : 0);
        jSONObject.put("resource_type", i);
        jSONObject.put("is_reload", !z2 ? 1 : 0);
        if (i == 1) {
            if (c3383p == null || (str = c3383p.LJJLI) == null) {
                str = "";
            }
            jSONObject.put("source", str);
            if (c3383p == null || (str2 = c3383p.LJJLIIIJJIZ) == null) {
                str2 = "";
            }
            jSONObject.put("business_version", str2);
        } else if (z) {
            String str3 = "";
            jSONObject.put("source", str3);
        } else {
            String str32 = "";
            jSONObject.put("source", str32);
        }
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_resource_download_start", 0, c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameResDownloadHitCache(boolean z, C3383p c3383p, int i, boolean z2) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3383p, Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resource_type", i);
        jSONObject.put("is_anchor", !z2 ? 1 : 0);
        if (i == 1) {
            if (c3383p == null || (str = c3383p.LJJLI) == null) {
                str = "";
            }
            jSONObject.put("source", str);
            if (c3383p == null || (str2 = c3383p.LJJLIIIJJIZ) == null) {
                str2 = "";
            }
            jSONObject.put("business_version", str2);
        } else if (z2) {
            String str3 = "";
            jSONObject.put("source", str3);
        } else {
            String str32 = "";
            jSONObject.put("source", str32);
        }
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_resource_cache_hit_all", 1 ^ (z ? 1 : 0), c3383p, jSONObject, 0L, null, 48, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logOpenFuncServerRequest(int i, String str, Throwable th, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, th, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        C441833dp.LIZIZ.LIZ(jSONObject, z);
        C440943cO.LIZ(jSONObject, PushConstants.WEB_URL, str);
        monitorStatus("ttlive_open_service_request_all", i, jSONObject);
        if (i == 1) {
            C441833dp.LIZIZ.LIZ(jSONObject, th);
            monitorStatus("ttlive_open_service_request_error", i, jSONObject);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameEnterRoomFetchMsg(boolean z, long j, Throwable th, boolean z2, String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), th, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("game_id", j);
        if (z2) {
            str2 = "heartBeat";
        } else {
            str2 = "enterRoom";
        }
        jSONObject.put("source", str2);
        C440943cO.LIZ(jSONObject, "log_id", str);
        monitorStatus("ttlive_interactive_game_audience_enter_room_receive_interactive_msg_all", !z ? 1 : 0, jSONObject);
        if (!z) {
            C441833dp.LIZIZ.LIZ(jSONObject, th);
            monitorStatus("ttlive_interactive_game_audience_enter_room_receive_interactive_msg_error", 1, jSONObject);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameSend2AnchorMsg(boolean z, String str, C3383p c3383p, String str2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, c3383p, str2, th}, this, changeQuickRedirect, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_name", str);
        jSONObject.put("log_id", str2);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_audience_to_anchor_interactive_all", !z ? 1 : 0, c3383p, jSONObject, 0L, null, 48, null);
        if (!z) {
            logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_audience_to_anchor_interactive_error", 1, c3383p, jSONObject, 0L, th, 16, null);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameStatusStart(int i, C3384q c3384q, long j, Throwable th, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, new Long(j), th, str}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "log_id", str);
        C440943cO.LIZ(jSONObject, "play_id", String.valueOf(j));
        logService$default(this, "ttlive_interactive_game_status_start_all", i, c3384q, jSONObject, 0L, null, 48, null);
        if (i == 1) {
            logService$default(this, "ttlive_interactive_game_status_start_error", i, c3384q, jSONObject, 0L, th, 16, null);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logGameStatusStop(int i, C3384q c3384q, long j, Throwable th, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, new Long(j), th, str}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "play_id", String.valueOf(j));
        C440943cO.LIZ(jSONObject, "log_id", str);
        logService$default(this, "ttlive_interactive_game_status_stop_all", i, c3384q, jSONObject, 0L, null, 48, null);
        if (i == 1) {
            logService$default(this, "ttlive_interactive_game_status_stop_error", i, c3384q, jSONObject, 0L, th, 16, null);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectBatchLoadEnd(int i, List<C3384q> list, long j, int i2, String str) {
        long j2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), list, new Long(j), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, str);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (C3384q c3384q : list) {
            C3383p LJFF = c3384q.LJFF();
            if (LJFF != null) {
                j2 = LJFF.LIZLLL;
            } else {
                j2 = 0;
            }
            arrayList.add(Long.valueOf(j2));
        }
        ArrayList arrayList2 = arrayList;
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis() - j;
        C440943cO.LIZ(jSONObject, "game_id_arr", arrayList2.toString());
        C440943cO.LIZ(jSONObject, "downloaded_count", arrayList2.size());
        if (i == 0) {
            monitorStatusAndDuration("ttlive_effect_game_resource_preload_all", 0, currentTimeMillis, jSONObject);
            return;
        }
        C440943cO.LIZ(jSONObject, "error_code", i2);
        C440943cO.LIZ(jSONObject, "error_msg", str);
        monitorStatusAndDuration("ttlive_effect_game_resource_preload_all", 1, currentTimeMillis, jSONObject);
        monitorStatusAndDuration("ttlive_effect_game_resource_preload_error", 1, currentTimeMillis, jSONObject);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logInteractGamePreCheck(int i, C3384q c3384q, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, str, str2, str3}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        if (Intrinsics.areEqual(this.mCurrentGameIdentifier, "")) {
            this.mCurrentGameIdentifier = generateCurrentGameIdentifier();
        }
        if (i == 0) {
            logService$default(this, "ttlive_interactive_game_check_all", 0, c3384q, null, 0L, null, 56, null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status_code", str);
        if (str2.length() > 0 && str3.length() > 0) {
            jSONObject.put("switch_game_id", str2);
            jSONObject.put("switch_game_name", str3);
        }
        logService$default(this, "ttlive_interactive_game_check_all", i, c3384q, jSONObject, 0L, null, 48, null);
    }

    @Deprecated(message = "后续不要使用这个上报了")
    private final void logService(String str, int i, C3384q c3384q, JSONObject jSONObject, long j, Throwable th) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        C441833dp.LIZIZ.LIZ(jSONObject2, c3384q);
        C441833dp.LIZIZ.LIZ(jSONObject2, th);
        C440943cO.LIZ(jSONObject2, "current_game_identifer", this.mCurrentGameIdentifier);
        if (j != -1) {
            monitorStatusAndDuration(str, i, j, jSONObject2);
        } else {
            monitorStatus(str, i, jSONObject2);
        }
    }

    @Deprecated(message = "后续不要使用这个上报了")
    private final void logServiceWithGameExtra(String str, int i, C3383p c3383p, JSONObject jSONObject, long j, Throwable th) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        C441833dp.LIZ(C441833dp.LIZIZ, jSONObject2, c3383p, false, 4, null);
        C441833dp.LIZIZ.LIZ(jSONObject2, th);
        C440943cO.LIZ(jSONObject2, "current_game_identifer", this.mCurrentGameIdentifier);
        if (j != -1) {
            monitorStatusAndDuration(str, i, j, jSONObject2);
        } else {
            monitorStatus(str, i, jSONObject2);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGamePanelLoadResult(boolean z, C3383p c3383p, boolean z2, boolean z3, long j, String str) {
        int i = 2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3383p, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), new Long(j), str}, this, changeQuickRedirect, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            i = 1;
        }
        jSONObject.put("panel_type", i);
        jSONObject.put("is_anchor", !z3 ? 1 : 0);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_page_load_all", !z ? 1 : 0, c3383p, jSONObject, j, null, 32, null);
        if (!z) {
            C440943cO.LIZ(jSONObject, "error_code", -1L);
            C440943cO.LIZ(jSONObject, "error_msg", str);
            logServiceWithGameExtra$default(this, "ttlive_interactive_game_panel_page_load_error", 1, c3383p, jSONObject, 0L, null, 48, null);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logSendGameInvite(int i, C3384q c3384q, String str, String str2, Throwable th, String str3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, str, str2, th, str3}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entrence", str);
        jSONObject.put("log_id", str3);
        if (i == 1) {
            jSONObject.put("status_code", str2);
            logService$default(this, "ttlive_interactive_game_invite_request_error", i, c3384q, jSONObject, 0L, th, 16, null);
        }
        logService$default(this, "ttlive_interactive_game_invite_request_all", i, c3384q, jSONObject, 0L, null, 48, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        r4 = r0;
     */
    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void logAnchorAudienceGamePanelReloadResource(boolean r15, com.bytedance.android.live.broadcastgame.api.model.C3383p r16, boolean r17, boolean r18, int r19, java.lang.String r20) {
        /*
            r14 = this;
            r0 = 6
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r15)
            r5 = 0
            r6[r5] = r0
            r4 = 1
            r7 = r16
            r6[r4] = r7
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r0 = 2
            r6[r0] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r18)
            r0 = 3
            r6[r0] = r1
            r2 = r19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 4
            r6[r0] = r1
            r0 = 5
            r1 = r20
            r6[r0] = r1
            com.bytedance.hotfix.base.ChangeQuickRedirect r3 = com.bytedance.android.live.broadcastgame.InteractGameMonitorService.changeQuickRedirect
            r0 = 43
            r8 = r14
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r6, r14, r3, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L39
            return
        L39:
            p003X.C106862S5w.LIZ(r1)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r18 != 0) goto L44
            r4 = 2
        L44:
            java.lang.String r0 = "panel_type"
            r8.put(r0, r4)
            r3 = r17 ^ 1
            java.lang.String r0 = "is_anchor"
            r8.put(r0, r3)
            java.lang.String r3 = "source"
            java.lang.String r4 = ""
            if (r18 == 0) goto L95
            if (r7 == 0) goto L5c
            java.lang.String r0 = r7.LJJLI
            if (r0 != 0) goto L5d
        L5c:
            r0 = r4
        L5d:
            r8.put(r3, r0)
            if (r7 == 0) goto L66
            java.lang.String r3 = r7.LJJLIIIJJIZ
            if (r3 != 0) goto L67
        L66:
            r3 = r4
        L67:
            java.lang.String r0 = "business_version"
            r8.put(r0, r3)
        L6c:
            r6 = r15 ^ 1
            r9 = 0
            r11 = 0
            r12 = 48
            r13 = 0
            java.lang.String r5 = "ttlive_interactive_game_panel_reload_resource_all"
            r4 = r14
            logServiceWithGameExtra$default(r4, r5, r6, r7, r8, r9, r11, r12, r13)
            if (r15 != 0) goto L94
            long r2 = (long) r2
            java.lang.String r0 = "error_code"
            p003X.C440943cO.LIZ(r8, r0, r2)
            java.lang.String r0 = "error_msg"
            p003X.C440943cO.LIZ(r8, r0, r1)
            r6 = 1
            r9 = 0
            r11 = 0
            r12 = 48
            r13 = 0
            java.lang.String r5 = "ttlive_interactive_game_panel_reload_resource_error"
            r4 = r14
            logServiceWithGameExtra$default(r4, r5, r6, r7, r8, r9, r11, r12, r13)
        L94:
            return
        L95:
            if (r17 == 0) goto La1
            if (r7 == 0) goto L9d
            java.lang.String r0 = r7.LJJLIIIJ
            if (r0 != 0) goto La8
        L9d:
            r8.put(r3, r4)
            goto L6c
        La1:
            if (r7 == 0) goto L9d
            java.lang.String r0 = r7.LJJLIIIJILLIZJL
            if (r0 != 0) goto La8
            goto L9d
        La8:
            r4 = r0
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.InteractGameMonitorService.logAnchorAudienceGamePanelReloadResource(boolean, com.bytedance.android.live.broadcastgame.api.model.p, boolean, boolean, int, java.lang.String):void");
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGamePanelResDownload(boolean z, C3383p c3383p, int i, boolean z2, long j, String str) {
        String str2;
        String str3;
        String str4 = str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3383p, Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j), str4}, this, changeQuickRedirect, false, 44).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resource_type", i);
        jSONObject.put("is_anchor", !z2 ? 1 : 0);
        if (i == 1) {
            if (c3383p == null || (str2 = c3383p.LJJLI) == null) {
                str2 = "";
            }
            jSONObject.put("source", str2);
            if (c3383p == null || (str3 = c3383p.LJJLIIIJJIZ) == null) {
                str3 = "";
            }
            jSONObject.put("business_version", str3);
        } else if (z2) {
            String str5 = "";
            jSONObject.put("source", str5);
        } else {
            String str52 = "";
            jSONObject.put("source", str52);
        }
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_resource_download_all", !z ? 1 : 0, c3383p, jSONObject, j, null, 32, null);
        if (!z) {
            C440943cO.LIZ(jSONObject, "error_code", -1L);
            if (str4 == null) {
                str4 = "unknown error";
            }
            C440943cO.LIZ(jSONObject, "error_msg", str4);
            logServiceWithGameExtra$default(this, "ttlive_interactive_game_resource_download_error", 1, c3383p, jSONObject, j, null, 32, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logAnchorAudienceGameSend2AudienceMsg(boolean z, String str, C3383p c3383p, long j, String str2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, c3383p, new Long(j), str2, th}, this, changeQuickRedirect, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_name", str);
        jSONObject.put("channel_type", j);
        jSONObject.put("log_id", str2);
        logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_anchor_to_audience_interactive_all", !z ? 1 : 0, c3383p, jSONObject, 0L, null, 48, null);
        if (Intrinsics.areEqual(str, "INNER_GAME_START")) {
            logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_anchor_to_audience_interactive_start_all", !z, c3383p, jSONObject, 0L, null, 48, null);
        }
        if (z == 0) {
            logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_anchor_to_audience_interactive_error", 1, c3383p, jSONObject, 0L, th, 16, null);
            if (Intrinsics.areEqual(str, "INNER_GAME_START")) {
                logServiceWithGameExtra$default(this, "ttlive_interactive_game_communication_anchor_to_audience_interactive_start_error", 1, c3383p, jSONObject, 0L, th, 16, null);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService
    public void logEffectGameResourceLoad(int i, C3384q c3384q, int i2, long j, int i3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c3384q, Integer.valueOf(i2), new Long(j), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "try_count", i2);
        if (i == 1) {
            C440943cO.LIZ(jSONObject, "error_code", i3);
            C440943cO.LIZ(jSONObject, "error_msg", str);
            logService$default(this, "ttlive_effect_game_resource_load_error", i, c3384q, jSONObject, System.currentTimeMillis() - j, null, 32, null);
        }
        logService$default(this, "ttlive_effect_game_resource_load_all", i, c3384q, jSONObject, System.currentTimeMillis() - j, null, 32, null);
    }

    public static /* synthetic */ void monitor$default(InteractGameMonitorService interactGameMonitorService, String str, int i, JSONObject jSONObject, long j, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                j = -1;
            }
            interactGameMonitorService.monitor(str, i, jSONObject, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monitor");
    }

    public static /* synthetic */ void logService$default(InteractGameMonitorService interactGameMonitorService, String str, int i, C3384q c3384q, JSONObject jSONObject, long j, Throwable th, int i2, Object obj) {
        JSONObject jSONObject2 = jSONObject;
        long j2 = j;
        if (obj == null) {
            Throwable th2 = null;
            if ((i2 & 8) != 0) {
                jSONObject2 = null;
            }
            if ((i2 & 16) != 0) {
                j2 = -1;
            }
            if ((i2 & 32) == 0) {
                th2 = th;
            }
            interactGameMonitorService.logService(str, i, c3384q, jSONObject2, j2, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logService");
    }

    public static /* synthetic */ void logServiceWithGameExtra$default(InteractGameMonitorService interactGameMonitorService, String str, int i, C3383p c3383p, JSONObject jSONObject, long j, Throwable th, int i2, Object obj) {
        JSONObject jSONObject2 = jSONObject;
        long j2 = j;
        if (obj == null) {
            Throwable th2 = null;
            if ((i2 & 8) != 0) {
                jSONObject2 = null;
            }
            if ((i2 & 16) != 0) {
                j2 = -1;
            }
            if ((i2 & 32) == 0) {
                th2 = th;
            }
            interactGameMonitorService.logServiceWithGameExtra(str, i, c3383p, jSONObject2, j2, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logServiceWithGameExtra");
    }
}
