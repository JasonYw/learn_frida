package com.bytedance.android.live.misc;

import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.i18n.I18nService;
import com.bytedance.android.live.linkpk.ILinkPkService;
import com.bytedance.android.live.lottie.ILottieService;
import com.bytedance.android.live.room.IExternalFunctionInjector;
import com.bytedance.android.live.room.IHighlightAnnouncementService;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.room.IMicRoomService;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.room.IRoomUserInfoService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.livead.ILiveAdService;
import com.bytedance.android.livehostapi.business.depend.livead.ILiveMiniAppService;
import com.bytedance.android.livehostapi.business.depend.locallife.ILiveLocalLifeService;
import com.bytedance.android.livesdk.announcement.AnnouncementServiceImpl;
import com.bytedance.android.livesdk.announcement.highlight.AnnouncementHighlightAnchorWidget;
import com.bytedance.android.livesdk.announcement.highlight.AnnouncementHighlightAudienceWidget;
import com.bytedance.android.livesdk.chatroom.helper.LiveUserInterfaceTracer;
import com.bytedance.android.livesdk.explore.LiveExploreService;
import com.bytedance.android.livesdk.feedback.LiveFeedbackService;
import com.bytedance.android.livesdk.floatview.VideoFloatWindowOuterService;
import com.bytedance.android.livesdk.lifecycle.LifeCycleService;
import com.bytedance.android.livesdk.livead.LiveAdServiceImpl;
import com.bytedance.android.livesdk.livead.LiveMiniAppService;
import com.bytedance.android.livesdk.locallife.LiveLocalLifeServiceImpl;
import com.bytedance.android.livesdk.lottie.LottieService;
import com.bytedance.android.livesdk.microom.MicRoomService;
import com.bytedance.android.livesdk.module.I18nServices;
import com.bytedance.android.livesdk.module.LinkPkService;
import com.bytedance.android.livesdk.module.LiveSDKService;
import com.bytedance.android.livesdk.module.RoomService;
import com.bytedance.android.livesdk.module.UserService;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.provideservices.RoomUserInfoService;
import com.bytedance.android.livesdk.room.service.ExternalFunctionInjectorService;
import com.bytedance.android.livesdk.schema.LiveActionHandlerImpl;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.service.LiveMiscService;
import com.bytedance.android.livesdkapi.announcement.IAnnouncementService;
import com.bytedance.android.livesdkapi.browse.ILiveBrowserService;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.explore.ILiveExploreService;
import com.bytedance.android.livesdkapi.feedback.ILiveFeedbackService;
import com.bytedance.android.livesdkapi.jsb.IJsMethodsProvideService;
import com.bytedance.android.livesdkapi.lifecycle.ILiveLifecycle;
import com.bytedance.android.livesdkapi.service.IHotRoomManager;
import com.bytedance.android.livesdkapi.service.ILiveUxTracer;
import com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C420572kd;
import p003X.C448243oA;
import p003X.C99985PZj;
import p003X.NYV;

/* loaded from: classes12.dex */
public class LiveService$$livesdk {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32511);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        internalRegisterService();
        LiveTask$$livesdk.registerTask();
    }

    public static void internalRegisterService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        ServiceManager.registerService(IRoomUserInfoService.class, new RoomUserInfoService());
        ServiceManager.registerService(IExternalFunctionInjector.class, new ExternalFunctionInjectorService());
        ServiceManager.registerService(IUserService.class, new UserService());
        ServiceManager.registerService(ILiveLifecycle.class, new LifeCycleService());
        ServiceManager.registerService(ILiveUxTracer.class, new LiveUserInterfaceTracer());
        ServiceManager.registerService(ILiveVideoFloatWindowService.class, new VideoFloatWindowOuterService());
        ServiceManager.registerService(NYV.class, new LiveMiscService());
        ServiceManager.registerService(IAnnouncementService.class, new AnnouncementServiceImpl());
        ServiceManager.registerService(ILiveAdService.class, new LiveAdServiceImpl());
        ServiceManager.registerService(ILiveLocalLifeService.class, new LiveLocalLifeServiceImpl());
        ServiceManager.registerService(ILiveMiniAppService.class, new LiveMiniAppService());
        ServiceManager.registerService(IRoomService.class, new RoomService());
        ServiceManager.registerService(ILiveRoomService.class, new RoomService());
        ServiceManager.registerService(ILiveSDKService.class, new LiveSDKService());
        ServiceManager.registerService(ILinkPkService.class, new LinkPkService());
        ServiceManager.registerService(I18nService.class, new I18nServices());
        ServiceManager.registerService(IMicRoomService.class, new MicRoomService());
        ServiceManager.registerService(ILiveActionHandler.class, new LiveActionHandlerImpl());
        ServiceManager.registerService(ILottieService.class, new LottieService());
        ServiceManager.registerService(IPerformanceManager.class, new LivePerformanceManager());
        ServiceManager.registerService(IHotRoomManager.class, new C99985PZj());
        ServiceManager.registerService(IJsMethodsProvideService.class, new C420572kd());
        ServiceManager.registerService(ILiveExploreService.class, new LiveExploreService());
        ServiceManager.registerService(ILiveFeedbackService.class, new LiveFeedbackService());
        ServiceManager.registerService(ILiveBrowserService.class, new C448243oA());
        ServiceManager.registerService(IHighlightAnnouncementService.class, new IHighlightAnnouncementService() { // from class: X.3UC
            static {
                Covode.recordClassIndex(58662);
            }

            @Override // com.bytedance.android.live.room.IHighlightAnnouncementService
            public final Class<? extends LiveWidget> getAnchorAnnouncementHighlightWidget() {
                return AnnouncementHighlightAnchorWidget.class;
            }

            @Override // com.bytedance.android.live.room.IHighlightAnnouncementService
            public final Class<? extends LiveWidget> getAudienceAnnouncementHighlightWidget() {
                return AnnouncementHighlightAudienceWidget.class;
            }
        });
    }
}
