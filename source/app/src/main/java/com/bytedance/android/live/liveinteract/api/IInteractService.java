package com.bytedance.android.live.liveinteract.api;

import android.content.Context;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a;
import com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$c;
import com.bytedance.android.live.liveinteract.api.p338b.AbstractC4265b;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4408a;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4409d;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
import com.bytedance.android.live.liveinteract.p357f.AbstractC4411b;
import com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.UserType;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.interact.model.C6044ac;
import com.bytedance.android.livesdk.chatroom.model.interact.C6163g;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.config.C7013k;
import com.bytedance.android.livesdk.log.p723a.AbstractC8645j;
import com.bytedance.android.livesdk.rank.model.C9215d;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p763d.AbstractC9437e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p1594ss.avframework.livestreamv2.core.Client;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC412712Vd;
import p003X.AbstractC434073Fh;
import p003X.AbstractC77617Gip;
import p003X.AbstractC78380Gv8;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79150HIa;
import p003X.AbstractC79168HIs;
import p003X.AbstractC79424HSo;
import p003X.AbstractC81976ISs;
import p003X.AbstractC91338Lye;
import p003X.AbstractC94837NXj;
import p003X.C3BK;
import p003X.C3BL;
import p003X.C3BM;
import p003X.H5N;
import p003X.HIZ;
import p003X.HSG;

/* loaded from: classes3.dex */
public interface IInteractService extends AbstractC91338Lye {
    public static final HashMap<String, Integer> micRoomHostStateMap = new HashMap<>();
    public static final NextLiveData<List<C6044ac>> linkMicSettings = new NextLiveData<>();

    void addBusinessDegradeStrategy(C7013k c7013k);

    AbstractC4408a audioPaidLinkService();

    String changeMode2String(int i);

    void clickLinkRoomFightIcon(String str);

    BaseLinkControlWidget createLinkControlWidget(HIZ hiz, ViewGroup viewGroup, Boolean bool);

    BaseLinkMultiControlWidget createLinkMultiControlWidget(AbstractC79168HIs abstractC79168HIs, ViewGroup viewGroup, Boolean bool);

    BaseLinkRevControlWidget createLinkRevControlWidget(AbstractC79150HIa abstractC79150HIa, ViewGroup viewGroup, Boolean bool);

    AbstractC94837NXj createLiveSeiHelper(a$a a_a, HSG hsg, a$c a_c);

    AbstractC4725a doublePkService();

    boolean enableCaptureAudioOnBackground(boolean z);

    SurfaceView getAnchorLinkmicSurfaceView();

    AbstractC4265b getAudioTalkService();

    AbstractC4289e getBidLinkMicService();

    C3BM getCommonService();

    String getCurrentFunctionType();

    List<Integer> getCurrentPlayModes();

    @Override // p003X.AbstractC91338Lye
    int getCurrentScene();

    int getCurrentUiLayout();

    AbstractC6524y.AbstractView$OnClickListenerC6525b getDigitAvatarBehavior();

    String getDisplayTicketStr(long j, List<Long> list, String str, String str2);

    AbstractDialogC9363b getDynamicEmojiDialog(Context context, DataCenter dataCenter, String str, boolean z);

    String getFunctionType2();

    String getFunctionType2BeforeReset();

    String getFunctionTypeForLog();

    Client getGuestRtcClient();

    C3BL getInteractAudienceService();

    AbstractC9437e getInteractFeedView(Context context, int i, int i2);

    String getLinkAnchorCount();

    String getLinkConnectionType();

    int getLinkMode();

    AbstractC78986HBs<LinkPlayerInfo> getLinkUserInfoCenter();

    String getLiveTypeForLog();

    AbstractC79424HSo getMultiAnchorService();

    ArrayList<LinkPlayerInfo> getOnlineList();

    AbstractC78986HBs<LinkPlayerInfo> getPkLinkUserInfoCenter();

    C3BK getPkService();

    AbstractC412712Vd getProfileCardOutService();

    AbstractC4411b getSelfDisciplineService();

    Single<C5176i<C6163g>> getUserWaitingRankPosition(long j, long j2, int i);

    AbstractC434073Fh getVideoTalkService();

    AbstractC81976ISs guestBattleContext();

    void handleInteractClick();

    void handleInteractState(DataCenter dataCenter, String str, H5N h5n);

    boolean hasEmptySeatForLink();

    AbstractC4409d interactPaidLinkService();

    boolean isAnonymousUser(Long l);

    @Override // p003X.AbstractC91338Lye
    boolean isAudienceLinkEngineOn();

    boolean isEnableTalkRoomEmoji();

    boolean isLiveShakeEnable();

    boolean isMicRoomHost(long j);

    boolean isPaidInteractAudienceOnOrBiddingOpen();

    void kickOutLinkUserInChatRoom(long j, String str, String str2);

    AbstractC78380Gv8 linkRoomFightService();

    void onDownGradeInfo(boolean z, int i);

    void openEmojiDialog(long j, String str);

    void openInvitePanel(String str);

    Pair<String, AbstractC8645j> provideFunctionType2LogInjector();

    Pair<String, AbstractC8645j> provideFunctionTypeLogInjector();

    Pair<String, AbstractC8645j> providePlayModeLogInjector();

    Pair<String, AbstractC8645j> provideSubscribeLogInjector();

    void resetAnchorLinkmicSurfaceView(SurfaceView surfaceView);

    void resetBusinessDegradeStrategy(int i, String str);

    void setCposition(long j, long j2, boolean z, Function1<Boolean, Unit> function1);

    void showLinkDistributeSetting(Context context, int i, String str, Boolean bool, AbstractC77617Gip abstractC77617Gip);

    void showLynxGuestContributionRankList(Context context, User user, Room room);

    void switchScene(int i, int i2, String str, Integer num);

    Observable<C5176i<C9215d>> syncLinkerRankList(long j, String str, String str2, long j2);

    AbstractC4286c teamFightService();

    UserType tryGetTargetUserType(long j);

    void updateFunctionType2(Room room);

    void updateSwitchSceneSource(String str);

    AbstractC4410g videoPaidLinkService();

    static {
        Covode.recordClassIndex(25102);
    }
}
