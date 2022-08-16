package com.bytedance.android.live.broadcastgame.api.interactgame;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget;
import com.bytedance.android.live.broadcastgame.api.IAudienceGameWidget;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3381l;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.C3385r;
import com.bytedance.android.live.broadcastgame.api.model.C3387w;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.p283b.a$b;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.browser.jsbridge.AbstractC3941d;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.avframework.livestreamv2.core.IGameEngine;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import p003X.AbstractC87801Kih;
import p003X.AbstractC88219KpR;
import p003X.C4315035k;
import p003X.C441673dZ;
import p003X.KUC;

/* loaded from: classes12.dex */
public interface IInteractGameService extends IService {
    public static final C441673dZ Companion = C441673dZ.LIZ;

    static {
        Covode.recordClassIndex(19103);
    }

    void addJsEventSender(AbstractC3941d abstractC3941d);

    void clearAutoMountMiniAppData();

    void confirmGameException(Context context, DataCenter dataCenter, C3384q c3384q, boolean z, Throwable th);

    void confirmGameStartFailed(Context context, DataCenter dataCenter, C3384q c3384q, int i, Throwable th, Function0<Unit> function0);

    AbstractC6524y.AbstractView$OnClickListenerC6525b createOpenGameBehaivor();

    JsFuncInjector createOpenJsFuncInject(AbstractC3940c abstractC3940c, DataCenter dataCenter, Context context);

    Object createOpenToolbarEntBehavior();

    String decryptUserInfo(String str);

    void dispatchJsEventMessage(String str, JSONObject jSONObject);

    void downloadEffectResource(String str, Function1<? super Sticker, Unit> function1);

    void executeEnterRoomTask(boolean z, Room room);

    Observable<Object> gameBeInviteStateChange();

    Observable<GameInviteState> gameInviteStateChange();

    IAnchorGameWidget getAnchorGameWidget(AbstractC5436a abstractC5436a, Room room, Fragment fragment, FragmentManager fragmentManager);

    IAudienceGameWidget getAudienceGameWidget();

    C3384q getCurrentPlayingGame();

    Observable<C5176i<C3381l>> getGameEntrance(long j, String str, String str2);

    KUC getGameExitConformDialog(Context context, String str);

    C4315035k getGameGuideHelper();

    AbstractC88219KpR<C3384q, a$b> getLiveOpenFeatureSceneFilter(DataCenter dataCenter);

    AbstractC6524y.AbstractView$OnClickListenerC6525b getOldOpenPlatformBehavior(Context context, DataCenter dataCenter, AbstractC3360k abstractC3360k);

    AbstractC6524y.AbstractView$OnClickListenerC6525b getOpenPlatformBehavior(Context context, DataCenter dataCenter, Function2<? super C3380j, ? super C3385r, ? extends AbstractC6524y.AbstractView$OnClickListenerC6525b> function2, AbstractC3360k abstractC3360k);

    AbstractC6524y.AbstractView$OnClickListenerC6525b getOpenPlatformItemBehavior(C3384q c3384q, AbstractC87801Kih abstractC87801Kih);

    PageDataV2 getPreMountMiniAppData();

    Intent getPreviewOpenFeatureActivity(Context context);

    IGameEngine getWMiniGameEngine();

    boolean hasPreMountMiniApp();

    void initGameContext(Fragment fragment, boolean z);

    boolean isInAudioZhufenGame(boolean z);

    boolean isInGameInviting();

    boolean isPlayingGame();

    boolean isPlayingGame(InteractID interactID);

    Observable<C5176i<Object>> notifyAudiencePreloadFloatRes(long j, long j2, String str);

    Observable<C5176i<C3387w>> notifyServerGameStart(long j, long j2, String str, long j3);

    Observable<C5176i<Object>> notifyServerGameStop(long j, long j2, long j3, String str, boolean z, int i, long j4);

    void onSei(String str);

    boolean openMiniApp(Context context, String str, Map<String, String> map);

    void removeJsEventSender(AbstractC3941d abstractC3941d);

    void sendGameCastStatusSEI(boolean z);

    void sendGameSeiStatus(GameSeiStatus gameSeiStatus, AbstractC5436a abstractC5436a, C3384q c3384q);

    void setAudienceMiniAppReady(boolean z);

    void setAudienceMiniAppSchema(String str);

    void setGameGuideHelper(String str);

    void setOldVersionMiniApp(boolean z);

    void setWMiniGameEngine(IGameEngine iGameEngine);

    void showGameInteractPanel(boolean z);

    void stopGameCastToAudience();

    void stopRunningPlugin();

    void tryGetSwitchGameConfirmDialog(C3384q c3384q, Context context, DataCenter dataCenter, Function0<Unit> function0, Function0<Unit> function02);
}
