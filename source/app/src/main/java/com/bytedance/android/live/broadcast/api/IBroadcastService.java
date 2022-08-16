package com.bytedance.android.live.broadcast.api;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.model.ScheduledSettingInfo;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2884d;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.core.widget.AbstractC4165j;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.depend.model.p771a.C9477q;
import com.bytedance.android.livesdkapi.service.IBaseBroadcastService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.Observable;
import java.util.List;
import p003X.AbstractC100959PpR;
import p003X.AbstractC134734bzd;
import p003X.AbstractC146440f2w;
import p003X.AbstractC412322Tq;
import p003X.AbstractC426222tk;
import p003X.AbstractC80428Hn4;
import p003X.AbstractC81935IRd;
import p003X.AbstractC81939IRh;
import p003X.AbstractC81969ISl;
import p003X.AbstractC86584K9y;
import p003X.AbstractC86810KIq;
import p003X.AbstractC89439LLt;
import p003X.C2FC;
import p003X.E78;
import p003X.GN7;
import p003X.HCC;
import p003X.HFT;
import p003X.HGX;
import p003X.HKC;
import p003X.K06;
import p003X.K2Z;
import p003X.K8A;
import p003X.LKD;

/* loaded from: classes5.dex */
public interface IBroadcastService extends IBaseBroadcastService {
    static {
        Covode.recordClassIndex(14397);
    }

    AbstractC426222tk broadcastFloatWindowManager();

    GN7 createBgBroadcastBinder();

    Fragment createBgBroadcastFragment(K06 k06, Bundle bundle);

    E78 createBgMirrorFragment(Bundle bundle);

    Fragment createBroadcastStreamFragment(K06 k06, LiveMode liveMode, StreamUrlExtra streamUrlExtra, String str);

    C2FC createCoverController(Fragment fragment, Room room);

    AbstractC80428Hn4 createDigitAvatarPreView(Context context);

    AbstractC412322Tq createEffectGestureDetector(Context context);

    HGX createLinkInRoomView(AbstractC5436a abstractC5436a, Context context, int i);

    AbstractC2884d createLinkVideoView(Context context, HCC hcc, String str);

    Fragment createLiveBroadcastFragment(K06 k06, K2Z k2z, Bundle bundle);

    AbstractC146440f2w createPreviewContainerFragment(Bundle bundle);

    LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity);

    AbstractC86584K9y createStartLiveFragment();

    AbstractC2885g createVideoTalkView(Context context, String str, boolean z, AbstractC2885g.AbstractC2887b abstractC2887b);

    AbstractC81939IRh createVoiceLiveThemeDialog(Context context, Boolean bool, AbstractC81969ISl abstractC81969ISl, int i);

    HFT createVoiceRoomVideoView(Context context, String str);

    Fragment createXTMediaBroadcastFragment(K2Z k2z, Bundle bundle);

    K8A digitAvatarEffectHelper();

    void downloadRequirements(List<String> list);

    boolean fastStartLivePreCheck(FragmentActivity fragmentActivity, LiveMode liveMode);

    void fastStartLivePreLoad(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig);

    String getAuthString(String str);

    AbstractC2891l getGamePromoteService();

    String getLiveCoreVersion();

    AbstractC134734bzd getMsgFilter();

    Class<? extends Widget> getStartLiveVisibilityTransformWidgetClass();

    <T> Class<T> getWidgetClass(int i);

    IXTBroadcastService getXTBroadcastService();

    AbstractC100959PpR getXTMediaBroadcastService();

    void init();

    boolean isInDrawGuessGame();

    boolean isInterceptOnClickToolBar(DataCenter dataCenter, ToolbarButton toolbarButton);

    boolean isPlayingGame();

    boolean isRequirementsDownloaded(List<String> list);

    void justReportRoomEvent(int i, long j, int i2, String str);

    HKC linkEffectHelper();

    AbstractC4165j loadBroadcastFilterLineEntryWidget(WidgetManager widgetManager, int i);

    Observable<Integer> loadShortVideoRes();

    void markEnterSceneFromJsb(int i);

    void markPopupShown(int i);

    void openCategoryDialog(Context context, DataCenter dataCenter);

    void openForenoticeDialog(Context context, boolean z, boolean z2, ScheduledSettingInfo scheduledSettingInfo, LKD lkd, int i, String str);

    void openPreviewSettingDialog(Context context);

    void openPrivilegeDetailSettingDialog(Context context);

    void openRoomChoosePVCountDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode);

    void openRoomIntroDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode, Long l);

    void openRoomIntroMediaDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode);

    void openVideoCategoryDialog(Context context, String str);

    void preInitStartLiveData(String... strArr);

    Object provideToolbarBehavior(int i, List<Object> list);

    Observable<C5176i<Object>> reportRoomEvent(int i, long j, int i2, String str);

    boolean shouldShowGuidePromptBubble(int i);

    void showAddAnchorShowDialog(Context context, int i, AbstractC89439LLt abstractC89439LLt);

    void showLiveGameDiscoveryDialog(Context context, Bundle bundle);

    AbstractC86810KIq startLiveManager();

    Observable<Integer> updateBroadcastRoomHashTag(C9477q c9477q);

    Observable<String> updateForenoticeInfo(ScheduledSettingInfo scheduledSettingInfo);

    void updateGameMsgViewUserCount(int i);

    AbstractC81935IRd voiceLiveThemeManager();
}
