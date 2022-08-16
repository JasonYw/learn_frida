package com.bytedance.android.live.broadcastgame.api;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcastgame.api.interactgame.AbstractC3360k;
import com.bytedance.android.live.broadcastgame.api.interactgame.GameInviteState;
import com.bytedance.android.live.broadcastgame.api.interactgame.GameSeiStatus;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.interactgame.JsFuncInjector;
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
import com.bytedance.android.live.utility.ServiceManager;
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
import p003X.KUC;

/* loaded from: classes12.dex */
public class InteractGameServiceDummy implements IInteractGameService {
    static {
        Covode.recordClassIndex(19013);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void addJsEventSender(AbstractC3941d abstractC3941d) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void clearAutoMountMiniAppData() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void confirmGameException(Context context, DataCenter dataCenter, C3384q c3384q, boolean z, Throwable th) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void confirmGameStartFailed(Context context, DataCenter dataCenter, C3384q c3384q, int i, Throwable th, Function0<Unit> function0) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public AbstractC6524y.AbstractView$OnClickListenerC6525b createOpenGameBehaivor() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public JsFuncInjector createOpenJsFuncInject(AbstractC3940c abstractC3940c, DataCenter dataCenter, Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Object createOpenToolbarEntBehavior() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public String decryptUserInfo(String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void dispatchJsEventMessage(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void downloadEffectResource(String str, Function1<? super Sticker, Unit> function1) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void executeEnterRoomTask(boolean z, Room room) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Observable<Object> gameBeInviteStateChange() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Observable<GameInviteState> gameInviteStateChange() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public IAnchorGameWidget getAnchorGameWidget(AbstractC5436a abstractC5436a, Room room, Fragment fragment, FragmentManager fragmentManager) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public IAudienceGameWidget getAudienceGameWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public C3384q getCurrentPlayingGame() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Observable<C5176i<C3381l>> getGameEntrance(long j, String str, String str2) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public KUC getGameExitConformDialog(Context context, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public C4315035k getGameGuideHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public AbstractC88219KpR<C3384q, a$b> getLiveOpenFeatureSceneFilter(DataCenter dataCenter) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public AbstractC6524y.AbstractView$OnClickListenerC6525b getOldOpenPlatformBehavior(Context context, DataCenter dataCenter, AbstractC3360k abstractC3360k) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public AbstractC6524y.AbstractView$OnClickListenerC6525b getOpenPlatformBehavior(Context context, DataCenter dataCenter, Function2<? super C3380j, ? super C3385r, ? extends AbstractC6524y.AbstractView$OnClickListenerC6525b> function2, AbstractC3360k abstractC3360k) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public AbstractC6524y.AbstractView$OnClickListenerC6525b getOpenPlatformItemBehavior(C3384q c3384q, AbstractC87801Kih abstractC87801Kih) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public PageDataV2 getPreMountMiniAppData() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Intent getPreviewOpenFeatureActivity(Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public IGameEngine getWMiniGameEngine() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public boolean hasPreMountMiniApp() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void initGameContext(Fragment fragment, boolean z) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public boolean isInAudioZhufenGame(boolean z) {
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public boolean isInGameInviting() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public boolean isPlayingGame() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public boolean isPlayingGame(InteractID interactID) {
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Observable<C5176i<Object>> notifyAudiencePreloadFloatRes(long j, long j2, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Observable<C5176i<C3387w>> notifyServerGameStart(long j, long j2, String str, long j3) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public Observable<C5176i<Object>> notifyServerGameStop(long j, long j2, long j3, String str, boolean z, int i, long j4) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void onSei(String str) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public boolean openMiniApp(Context context, String str, Map<String, String> map) {
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void removeJsEventSender(AbstractC3941d abstractC3941d) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void sendGameCastStatusSEI(boolean z) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void sendGameSeiStatus(GameSeiStatus gameSeiStatus, AbstractC5436a abstractC5436a, C3384q c3384q) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void setAudienceMiniAppReady(boolean z) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void setAudienceMiniAppSchema(String str) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void setGameGuideHelper(String str) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void setOldVersionMiniApp(boolean z) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void setWMiniGameEngine(IGameEngine iGameEngine) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void showGameInteractPanel(boolean z) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void stopGameCastToAudience() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void stopRunningPlugin() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public void tryGetSwitchGameConfirmDialog(C3384q c3384q, Context context, DataCenter dataCenter, Function0<Unit> function0, Function0<Unit> function02) {
    }

    public InteractGameServiceDummy() {
        ServiceManager.registerService(IInteractGameService.class, this);
    }
}
