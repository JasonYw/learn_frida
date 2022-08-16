package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;
import p003X.KVO;

/* loaded from: classes5.dex */
public interface IInteractGameMonitorService extends IService {
    public static final KVO Companion = KVO.LIZ;

    static {
        Covode.recordClassIndex(19099);
    }

    String getCurrentGameIdentifier();

    void logAnchorAudienceGameAudienceReceiveGameEndMsg(C3383p c3383p, long j);

    void logAnchorAudienceGameAudienceReceiveGameStartMsg(C3383p c3383p, long j);

    void logAnchorAudienceGameEnterRoomFetchMsg(boolean z, long j, Throwable th, boolean z2, String str);

    void logAnchorAudienceGameInteractPanelShow(C3383p c3383p, boolean z, boolean z2, int i);

    void logAnchorAudienceGameLynxFirstScreen(C3383p c3383p, boolean z, long j);

    void logAnchorAudienceGameLynxFirstScreenFromStart(C3383p c3383p, boolean z, long j, int i);

    void logAnchorAudienceGameLynxInitAll(boolean z, C3383p c3383p, boolean z2);

    void logAnchorAudienceGameLynxReceiveError(C3383p c3383p, boolean z, String str);

    void logAnchorAudienceGameLynxUseOfflineRes(C3383p c3383p, boolean z, boolean z2);

    void logAnchorAudienceGameMessageChannelInitAll(boolean z, boolean z2);

    void logAnchorAudienceGameOpenEntranceApiRequest(boolean z, C3384q c3384q, String str, Throwable th);

    void logAnchorAudienceGamePanelLoadResult(boolean z, C3383p c3383p, boolean z2, boolean z3, long j, String str);

    void logAnchorAudienceGamePanelLoadStart(C3383p c3383p, boolean z, boolean z2);

    void logAnchorAudienceGamePanelReloadResource(boolean z, C3383p c3383p, boolean z2, boolean z3, int i, String str);

    void logAnchorAudienceGamePanelResDownload(boolean z, C3383p c3383p, int i, boolean z2, long j, String str);

    void logAnchorAudienceGamePanelStartDownload(C3383p c3383p, boolean z, int i, boolean z2);

    void logAnchorAudienceGameResDownloadHitCache(boolean z, C3383p c3383p, int i, boolean z2);

    void logAnchorAudienceGameSend2AnchorMsg(boolean z, String str, C3383p c3383p, String str2, Throwable th);

    void logAnchorAudienceGameSend2AudienceMsg(boolean z, String str, C3383p c3383p, long j, String str2, Throwable th);

    void logAnchorAudienceHeartSei(C3383p c3383p, boolean z, String str);

    void logAnchorAudienceSeiRecvByGop(C3383p c3383p, long j, long j2);

    void logEffectBatchLoadEnd(int i, List<C3384q> list, long j, int i2, String str);

    void logEffectBatchLoadStart(List<C3384q> list);

    void logEffectGameEnd(int i, C3384q c3384q);

    void logEffectGameGuideVideoClick(int i, C3384q c3384q);

    void logEffectGameGuideVideoShow(int i, C3384q c3384q);

    void logEffectGameMusicShow(int i, C3384q c3384q);

    void logEffectGameResourceLoad(int i, C3384q c3384q, int i2, long j, int i3, String str);

    void logEffectGameSelectMusic(int i, C3384q c3384q);

    void logEffectGameStart(C3384q c3384q);

    void logFetchInteractItemList(int i, long j, Throwable th);

    void logGameCountDown(int i, C3384q c3384q);

    void logGameIntroClick(int i, C3384q c3384q);

    void logGameIntroShow(int i, C3384q c3384q);

    void logGameInviteResult(int i, C3384q c3384q, String str);

    void logGameStartupResult(int i, C3384q c3384q, JSONObject jSONObject);

    void logGameStatusStart(int i, C3384q c3384q, long j, Throwable th, String str);

    void logGameStatusStop(int i, C3384q c3384q, long j, Throwable th, String str);

    void logGameStop(int i, C3384q c3384q, boolean z);

    void logInteractGameItemClick(int i, C3384q c3384q, JSONObject jSONObject);

    void logInteractGamePreCheck(int i, C3384q c3384q, String str, String str2, String str3);

    void logOpenFuncGameData(JSONObject jSONObject, boolean z);

    void logOpenFuncServerRequest(int i, String str, Throwable th, boolean z);

    void logSendGameInvite(int i, C3384q c3384q, String str, String str2, Throwable th, String str3);

    void recordGameIdentifier(String str);
}
