package com.bytedance.android.live.broadcast.api.dummy;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.AbstractC2879d;
import com.bytedance.android.live.broadcast.api.AbstractC2891l;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.IXTBroadcastService;
import com.bytedance.android.live.broadcast.api.model.ScheduledSettingInfo;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2884d;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.core.widget.AbstractC4165j;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdkapi.AbstractC9586k;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.depend.model.p771a.C9477q;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.Observable;
import java.util.ArrayList;
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
public class BroadcastServiceDummy implements IBroadcastService {
    static {
        Covode.recordClassIndex(14432);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC426222tk broadcastFloatWindowManager() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public GN7 createBgBroadcastBinder() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createBgBroadcastFragment(K06 k06, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public E78 createBgMirrorFragment(Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createBroadcastStreamFragment(K06 k06, LiveMode liveMode, StreamUrlExtra streamUrlExtra, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public C2FC createCoverController(Fragment fragment, Room room) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC80428Hn4 createDigitAvatarPreView(Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC412322Tq createEffectGestureDetector(Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public HGX createLinkInRoomView(AbstractC5436a abstractC5436a, Context context, int i) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC2884d createLinkVideoView(Context context, HCC hcc, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createLiveBroadcastFragment(K06 k06, K2Z k2z, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC146440f2w createPreviewContainerFragment(Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC86584K9y createStartLiveFragment() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC2885g createVideoTalkView(Context context, String str, boolean z, AbstractC2885g.AbstractC2887b abstractC2887b) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC81939IRh createVoiceLiveThemeDialog(Context context, Boolean bool, AbstractC81969ISl abstractC81969ISl, int i) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public HFT createVoiceRoomVideoView(Context context, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createXTMediaBroadcastFragment(K2Z k2z, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public K8A digitAvatarEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void downloadRequirements(List<String> list) {
    }

    @Override // com.bytedance.android.livesdkapi.service.IBaseBroadcastService
    public void fastStartLive(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig, ArrayList<AbstractC9586k> arrayList, AbstractC2879d abstractC2879d) {
    }

    @Override // com.bytedance.android.livesdkapi.service.IBaseBroadcastService
    public void fastStartLiveForSchema(Context context, FastStartLiveConfig fastStartLiveConfig, ArrayList<AbstractC9586k> arrayList, AbstractC2879d abstractC2879d) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean fastStartLivePreCheck(FragmentActivity fragmentActivity, LiveMode liveMode) {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void fastStartLivePreLoad(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getAuthString(String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC2891l getGamePromoteService() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveCoreVersion() {
        return "";
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC134734bzd getMsgFilter() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Class<? extends Widget> getStartLiveVisibilityTransformWidgetClass() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public <T> Class<T> getWidgetClass(int i) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public IXTBroadcastService getXTBroadcastService() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC100959PpR getXTMediaBroadcastService() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void init() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isInDrawGuessGame() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isInterceptOnClickToolBar(DataCenter dataCenter, ToolbarButton toolbarButton) {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isPlayingGame() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isRequirementsDownloaded(List<String> list) {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void justReportRoomEvent(int i, long j, int i2, String str) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public HKC linkEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC4165j loadBroadcastFilterLineEntryWidget(WidgetManager widgetManager, int i) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<Integer> loadShortVideoRes() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void markEnterSceneFromJsb(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void markPopupShown(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openCategoryDialog(Context context, DataCenter dataCenter) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openForenoticeDialog(Context context, boolean z, boolean z2, ScheduledSettingInfo scheduledSettingInfo, LKD lkd, int i, String str) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openPreviewSettingDialog(Context context) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openPrivilegeDetailSettingDialog(Context context) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openRoomChoosePVCountDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openRoomIntroDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode, Long l) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openRoomIntroMediaDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openVideoCategoryDialog(Context context, String str) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void preInitStartLiveData(String... strArr) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Object provideToolbarBehavior(int i, List<Object> list) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<C5176i<Object>> reportRoomEvent(int i, long j, int i2, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean shouldShowGuidePromptBubble(int i) {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showAddAnchorShowDialog(Context context, int i, AbstractC89439LLt abstractC89439LLt) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showLiveGameDiscoveryDialog(Context context, Bundle bundle) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC86810KIq startLiveManager() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<Integer> updateBroadcastRoomHashTag(C9477q c9477q) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<String> updateForenoticeInfo(ScheduledSettingInfo scheduledSettingInfo) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void updateGameMsgViewUserCount(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC81935IRd voiceLiveThemeManager() {
        return null;
    }

    public BroadcastServiceDummy() {
        ServiceManager.registerService(IBroadcastService.class, this);
    }
}
