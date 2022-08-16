package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C2995dh;
import com.bytedance.android.live.broadcast.api.AbstractC2924n;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C2914l;
import com.bytedance.android.live.broadcast.api.model.PreviewDataTransferHolder;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.broadcast.refactoring.CommonDataConfigWidget;
import com.bytedance.android.live.broadcast.refactoring.CommonUIWidget;
import com.bytedance.android.live.broadcast.refactoring.EndingBlockWidget;
import com.bytedance.android.live.broadcast.refactoring.InteractStateWidget;
import com.bytedance.android.live.broadcast.refactoring.LiveBroadcastEndWidget;
import com.bytedance.android.live.broadcast.refactoring.LiveBroadcastIllegalWidget;
import com.bytedance.android.live.broadcast.refactoring.LiveStreamManager;
import com.bytedance.android.live.broadcast.widget.MagicGestureActivityAnchorWidget;
import com.bytedance.android.live.broadcast.widget.MsSeiSignWidget;
import com.bytedance.android.live.broadcast.widget.PixAutoWearPropWidget;
import com.bytedance.android.live.broadcastgame.api.channel.IAnchorAudienceMsgService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.core.privacy.p320av.api.C4082a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.view.EffectLiveBroadcastActivityProxy;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.pushstream.report.AbstractC5443b;
import com.bytedance.android.live.room.AbstractC5478a;
import com.bytedance.android.live.room.AbstractC5483d;
import com.bytedance.android.live.room.IExternalFunctionInjector;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostBusiness;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveHashTag;
import com.bytedance.android.livehostapi.foundation.depend.PluginType;
import com.bytedance.android.livesdk.announce.AnnouncementInfo;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.C5924dr;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.event.C5993bc;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r;
import com.bytedance.android.livesdk.chatroom.model.C6139e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.dynamic.C6514m;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.config.PerformanceTestSettings;
import com.bytedance.android.livesdk.lifecycle.ILifeCycleAware;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.log.p723a.AbstractC8645j;
import com.bytedance.android.livesdk.message.model.C8760bd;
import com.bytedance.android.livesdk.model.C9061c;
import com.bytedance.android.livesdk.reddot.C9225a;
import com.bytedance.android.livesdkapi.announcement.IAnnouncementService;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.avframework.utils.AVLog;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002O.C0002O;
import p003X.AbstractC409702Jo;
import p003X.AbstractC412312Tp;
import p003X.AbstractC426222tk;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC86311Jzl;
import p003X.AbstractC86377K1z;
import p003X.AbstractC86387K2j;
import p003X.AbstractC86456K5a;
import p003X.AbstractC90419Ljp;
import p003X.C100980Ppm;
import p003X.C116971W2r;
import p003X.C2IN;
import p003X.C2VQ;
import p003X.C2W5;
import p003X.C3J9;
import p003X.C413202Xa;
import p003X.C415302c8;
import p003X.C420712kr;
import p003X.C421392lx;
import p003X.C427772wF;
import p003X.C42T;
import p003X.C4306532d;
import p003X.C439993ar;
import p003X.C446923m2;
import p003X.C4574547f;
import p003X.C74768Fdy;
import p003X.C77108Gac;
import p003X.C79007HCn;
import p003X.C79169HIt;
import p003X.C81173Hz5;
import p003X.C86296JzW;
import p003X.C86300Jza;
import p003X.C86307Jzh;
import p003X.C86334K0i;
import p003X.C86378K2a;
import p003X.C86407K3d;
import p003X.C86428K3y;
import p003X.C86470K5o;
import p003X.C86634KBw;
import p003X.C86665KDb;
import p003X.C86748KGg;
import p003X.C86797KId;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88326KrA;
import p003X.C88725Kxb;
import p003X.C90651LnZ;
import p003X.C91211Lwb;
import p003X.C91264LxS;
import p003X.HH8;
import p003X.K06;
import p003X.K0D;
import p003X.K0T;
import p003X.K2T;
import p003X.K2Z;
import p003X.K3H;
import p003X.K3L;
import p003X.K3R;
import p003X.K41;
import p003X.K4D;
import p003X.K4N;
import p003X.K7G;
import p003X.K8Q;
import p003X.KB2;
import p003X.KCU;
import p003X.KGQ;
import p003X.KPM;
import p003X.LK5;
import p003X.M0Q;
import p003X.M0W;

/* renamed from: com.bytedance.android.live.broadcast.dh */
/* loaded from: classes5.dex */
public class C2995dh extends C4070a implements AbstractC2924n, AbstractC86387K2j, AbstractC5443b, AbstractC5478a, AbstractC86311Jzl, WeakHandler.IHandler, AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2863ai LIZIZ;
    public AbstractC2865ak LIZJ;
    public AbstractC2864aj LIZLLL;

    /* renamed from: LJ */
    public K2Z f25814LJ;
    public Room LJFF;
    public K06 LJI;
    public AbstractC86377K1z LJII;
    public HSImageView LJIIIZ;
    public EffectLiveBroadcastActivityProxy LJIIJ;
    public LiveBroadcastIllegalWidget LJIIJJI;
    public EndingBlockWidget LJIIL;
    public WidgetManager LJIILIIL;
    public DataCenter LJIILJJIL;
    public ViewGroup LJIILL;
    public View LJIILLIIL;
    public ViewGroup LJIIZILJ;
    public long LJIJ;
    public PixAutoWearPropWidget LJIJI;
    public AbstractC2866al LJIJJ;
    public MsSeiSignWidget LJIJJLI;
    public HSImageView LJIL;
    public C2W5 LJJ;
    public K2T LJJI;
    public CommonUIWidget LJJII;
    public C86300Jza LJJIII;
    public C86296JzW LJJIIJ;
    public CommonDataConfigWidget LJJIIJZLJL;
    public InteractStateWidget LJJIIZ;
    public C86307Jzh LJJIIZI;
    public LiveBroadcastEndWidget LJJIJ;
    public LiveStreamManager LJJIJIIJI;
    public AbstractC412312Tp LJJIJIIJIL;
    public AbstractC409702Jo LJJIJIL;
    public WeakHandler LJIIIIZZ = new WeakHandler(this);
    public boolean LJJIFFI = false;

    static {
        Covode.recordClassIndex(15376);
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2883g
    public final void LIZ(K41 k41) {
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2883g
    public final void LIZ(K4D k4d) {
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final void LIZ(FrameLayout frameLayout, FragmentManager fragmentManager) {
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final void LIZ(Runnable runnable) {
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2924n
    public final void LIZ(String str, int i, String str2) {
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final void LIZIZ(Runnable runnable) {
    }

    public AbstractC86456K5a LIZJ(int i) {
        return null;
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final AbstractC6070q LIZLLL() {
        return null;
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final AbstractC2924n LJI() {
        return this;
    }

    @Override // p003X.AbstractC86311Jzl
    public final Fragment LJIJI() {
        return this;
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneFullName() {
        return "com/bytedance/android/live/broadcast/LiveBroadcastFragmentForStream";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneSimpleName() {
        return "LiveBroadcastFragmentForStream";
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final DataCenter LIZIZ() {
        return this.LJIILJJIL;
    }

    @Override // p003X.AbstractC86311Jzl
    /* renamed from: LJIILL */
    public final ViewGroup LJIL() {
        return this.LJIILL;
    }

    public void LIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 35).isSupported) {
            return;
        }
        this.LJIIL.LIZ(hashMap);
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2924n
    public final View.OnTouchListener LJIILLIIL() {
        return this.LJJIIJ.LJIL;
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2924n
    public final DialogInterface.OnKeyListener LJIIZILJ() {
        return this.LJJIIJ.LJIJJLI;
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final boolean LJII() {
        LiveBroadcastEndWidget liveBroadcastEndWidget = this.LJJIJ;
        if (liveBroadcastEndWidget != null) {
            return liveBroadcastEndWidget.LJFF;
        }
        return false;
    }

    private AbstractC5436a LJJIFFI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        return this.LJI.LJI();
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final AbstractC5436a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        return LJJIFFI();
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
            return;
        }
        LJIIL();
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2924n
    public final AbstractC6071r LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return (AbstractC6071r) proxy.result;
        }
        AbstractC2866al abstractC2866al = this.LJIJJ;
        if (abstractC2866al != null) {
            return abstractC2866al.LIZJ();
        }
        return null;
    }

    @Override // p003X.AbstractC86311Jzl
    public final K0D LJIJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 38);
        if (proxy.isSupported) {
            return (K0D) proxy.result;
        }
        AbstractC86377K1z abstractC86377K1z = this.LJII;
        if (abstractC86377K1z == null) {
            return null;
        }
        return abstractC86377K1z.LIZ();
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onPause();
        ALogger.m15800e("create_duration", "broadcast onPause");
        this.LJJIIJ.LIZIZ = false;
    }

    private long LJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        Room room = this.LJFF;
        if (room == null) {
            return 0L;
        }
        return room.getId();
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final C5923dp LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 29);
        if (proxy.isSupported) {
            return (C5923dp) proxy.result;
        }
        C86307Jzh c86307Jzh = this.LJJIIZI;
        if (c86307Jzh != null) {
            return c86307Jzh.LIZ();
        }
        return new C86307Jzh(this.LJIILJJIL, getContext()).LIZ();
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    /* renamed from: LJ */
    public final AbstractC412312Tp mo15605LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 30);
        if (proxy.isSupported) {
            return (AbstractC412312Tp) proxy.result;
        }
        if (this.LJJIJIIJIL == null) {
            this.LJJIJIIJIL = new K0T(this);
        }
        return this.LJJIJIIJIL;
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final AbstractC409702Jo LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 31);
        if (proxy.isSupported) {
            return (AbstractC409702Jo) proxy.result;
        }
        if (this.LJJIJIL == null && this.LJIIJ != null) {
            this.LJJIJIL = new AbstractC409702Jo(this) { // from class: X.K0d
                public static ChangeQuickRedirect LIZ;
                public final C2995dh LIZIZ;

                static {
                    Covode.recordClassIndex(15499);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // p003X.AbstractC409702Jo
                public final void LIZ(float f) {
                    if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C2995dh c2995dh = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, c2995dh, C2995dh.LIZ, false, 42).isSupported) {
                        return;
                    }
                    if (f > 0.0f) {
                        c2995dh.LJIIJ.onEvent(new K3E(1));
                    } else {
                        c2995dh.LJIIJ.onEvent(new K3E(2));
                    }
                }
            };
        }
        return this.LJJIJIL;
    }

    @Override // p003X.AbstractC86311Jzl
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported || this.LJJIFFI) {
            return;
        }
        this.LJJIFFI = true;
        K06 k06 = this.LJI;
        if (k06 != null) {
            k06.LIZJ();
        }
        if (LJIJJLI() != null) {
            LJIJJLI().LIZJ();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        super.onDestroyView();
        C91264LxS.LIZJ.LIZIZ(getActivity());
        this.LJJIIJ.LIZJ = false;
    }

    public void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        AbstractC86456K5a streamReporter = ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).getStreamReporter(this.LJFF, this);
        LiveStreamManager liveStreamManager = this.LJJIJIIJI;
        if (!PatchProxy.proxy(new Object[]{streamReporter}, liveStreamManager, LiveStreamManager.LIZJ, false, 10).isSupported) {
            liveStreamManager.LJIIIIZZ = streamReporter;
            if (liveStreamManager.LJIIIIZZ != null) {
                liveStreamManager.LJIIIIZZ.LIZ();
                C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(liveStreamManager.LJIIJJI);
            }
        }
    }

    public HashMap<String, String> LJIILJJIL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        EndingBlockWidget endingBlockWidget = this.LJIIL;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], endingBlockWidget, EndingBlockWidget.LIZJ, false, 29);
        if (proxy2.isSupported) {
            return (HashMap) proxy2.result;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_id", endingBlockWidget.LIZJ());
        if (endingBlockWidget.LIZIZ()) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_mini_window_close_live", str);
        int intValue = ((Integer) endingBlockWidget.LIZLLL.get("data_link_state", (String) 0)).intValue();
        if (C79169HIt.LIZIZ(intValue, 8) || C79169HIt.LIZIZ(intValue, 32)) {
            hashMap.put("interact_function", "chat_room");
        }
        return hashMap;
    }

    public final /* synthetic */ void LJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported || !LJIILIIL()) {
            return;
        }
        DataCenter dataCenter = this.LJIILJJIL;
        if (dataCenter != null) {
            dataCenter.put("cmd_dismiss_dialog_end", new Object());
        }
        LJIIJJI();
        C86296JzW c86296JzW = this.LJJIIJ;
        if (c86296JzW != null) {
            c86296JzW.LIZIZ();
        }
        LiveBroadcastEndWidget liveBroadcastEndWidget = this.LJJIJ;
        if (liveBroadcastEndWidget != null && !PatchProxy.proxy(new Object[0], liveBroadcastEndWidget, LiveBroadcastEndWidget.LIZJ, false, 8).isSupported && liveBroadcastEndWidget.f25942LJ != null) {
            boolean contains = C420712kr.LIZ().LIZLLL.contains("record");
            Bundle bundle = new Bundle();
            bundle.putBoolean("record_panel_show", contains);
            C86665KDb.LIZIZ("ttlive_start_end_fragment", "LiveBroadcastFragment");
            liveBroadcastEndWidget.f25942LJ.LIZ(bundle, liveBroadcastEndWidget.LJI, liveBroadcastEndWidget.LJII, liveBroadcastEndWidget.LJIIIIZZ, liveBroadcastEndWidget.LJIIIZ);
            C421392lx.LIZIZ.LIZ();
        }
    }

    /* renamed from: j_ */
    public void mo15905j_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        MsSeiSignWidget msSeiSignWidget = this.LJIJJLI;
        if (msSeiSignWidget != null) {
            msSeiSignWidget.LIZIZ();
        }
        LiveStreamManager liveStreamManager = this.LJJIJIIJI;
        if (!PatchProxy.proxy(new Object[0], liveStreamManager, LiveStreamManager.LIZJ, false, 22).isSupported) {
            C86665KDb.LIZIZ("ttlive_on_start_live_stream", "LiveBroadcastFragment");
            C86748KGg.LIZ("ttlive_start_live_stream").LIZ(0).LIZ("0").LIZ().LIZ();
            AbstractC80293Hkt.LJJIJ.LIZ(Long.valueOf(System.currentTimeMillis()));
            liveStreamManager.LJII.LIZ().LIZ(liveStreamManager.LJIIIZ.getStreamUrl().pushUrlList);
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_api_name", "start_normal_streaming");
            C86634KBw.LIZIZ.LIZJ(LiveTracingMonitor.EventModule.OPEN_LIVE, C86634KBw.LIZIZ.LIZ(hashMap, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStop();
        LiveBroadcastEndWidget liveBroadcastEndWidget = this.LJJIJ;
        if (liveBroadcastEndWidget != null && liveBroadcastEndWidget.LJFF) {
            return;
        }
        C88326KrA.LIZIZ();
        AbstractC426222tk broadcastFloatWindowManager = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).broadcastFloatWindowManager();
        if (this.LJFF != null) {
            if (broadcastFloatWindowManager == null || !broadcastFloatWindowManager.LIZIZ()) {
                C4082a c4082a = new C4082a();
                c4082a.LIZ = 500;
                HashMap hashMap = new HashMap();
                hashMap.put("live_mode", LiveMode.convertLiveModeToString(this.LJFF.getStreamType()));
                hashMap.put("room_id", String.valueOf(this.LJFF.getRoomId()));
                C86797KId.f8419LJ.LIZJ("privacy_start_live", "privacy_live_broadcast_invisible", hashMap, C86470K5o.LIZ(), c4082a);
            }
        }
    }

    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJIILJJIL.put("data_room", this.LJFF);
        C5923dp LIZJ = LIZJ();
        LIZJ.LIZ().LIZ(this.LJFF);
        if (this.LJFF.welfareProjectInfo != null) {
            LIZJ.LLIILZL().LIZ(this.LJFF.welfareProjectInfo);
        }
        K06 k06 = this.LJI;
        if (k06 != null) {
            k06.LIZIZ();
        }
        this.LJJIJIIJI.LIZIZ();
        this.LJJIIJ.LIZLLL();
        C415302c8 LIZIZ = C413202Xa.LIZIZ();
        if (this.LJIIJ != null) {
            LIZIZ.LIZ(ToolbarButton.FILTER, new K4N(this.LJIILJJIL, this.LJIIJ));
            LIZIZ.LIZ(ToolbarButton.BEAUTY, new K3L(this.LJIILJJIL, LIZJ, this.LJIIJ));
            LIZIZ.LIZ(ToolbarButton.SOUND_EFFECT, new KGQ(this.LJIIJ));
        }
        ToolbarButton toolbarButton = ToolbarButton.POI;
        final Room room = this.LJFF;
        final FragmentActivity activity = getActivity();
        LIZIZ.LIZ(toolbarButton, new AbstractC6524y.AbstractView$OnClickListenerC6525b(room, activity) { // from class: X.2Js
            public static ChangeQuickRedirect LIZ;
            public final Room LIZIZ;
            public final Context LIZJ;

            static {
                Covode.recordClassIndex(17852);
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C2TD c2td) {
                boolean z = PatchProxy.proxy(new Object[]{c2td}, this, LIZ, false, 9).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 7).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(boolean z) {
                boolean z2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final C9225a LIZIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
                if (proxy.isSupported) {
                    return (C9225a) proxy.result;
                }
                return null;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(View view, DataCenter dataCenter) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 6).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 12).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final boolean aK_() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                return false;
            }

            private HashMap<String, String> LIZJ() {
                String str;
                long j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
                if (proxy.isSupported) {
                    return (HashMap) proxy.result;
                }
                IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                if (LIZ2 instanceof User) {
                    str = ((User) LIZ2).getIdStr();
                } else {
                    str = "";
                }
                Room room2 = this.LIZIZ;
                if (room2 != null) {
                    j = room2.getId();
                } else {
                    j = 0;
                }
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("anchor_id", str);
                hashMap.put("room_id", String.valueOf(j));
                hashMap.put("event_page", "live_take_detail");
                return hashMap;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long j;
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                Room room2 = this.LIZIZ;
                if (room2 != null) {
                    j = room2.getId();
                } else {
                    j = 0;
                }
                ((IHostBusiness) ServiceManager.getService(IHostBusiness.class)).showManagePoiDialog(this.LIZJ, true, j, null);
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
                    C4574547f.LIZ().LIZ("livesdk_poi_icon_click", LIZJ(), new Object[0]);
                }
            }

            {
                this.LIZIZ = room;
                this.LIZJ = activity;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(View view, DataCenter dataCenter) {
                if (!PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 1).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                    C4574547f.LIZ().LIZ("livesdk_poi_icon_show", LIZJ(), new Object[0]);
                }
            }
        });
        if (LiveConfigSettingKeys.LIVE_ENABLE_ADJUST_FULL_DISPLAY.getValue().booleanValue()) {
            this.LJJIII.LIZJ();
        }
        this.LJJII.LIZ();
        this.LJJII.LIZIZ();
    }

    @Override // p003X.AbstractC86311Jzl
    public final void LJIIL() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        LiveBroadcastEndWidget liveBroadcastEndWidget = this.LJJIJ;
        C5923dp LIZJ = LIZJ();
        Room room = this.LJFF;
        if (!PatchProxy.proxy(new Object[]{LIZJ, room}, liveBroadcastEndWidget, LiveBroadcastEndWidget.LIZJ, false, 5).isSupported) {
            C86665KDb.LIZIZ("ttlive_on_show_live_end_dialog", "LiveBroadcastFragment");
            LIZJ.LLD().LIZ(Boolean.TRUE);
            ((IExternalFunctionInjector) ServiceManager.getService(IExternalFunctionInjector.class)).getLiveRoomController(room.getIdStr()).LJFF();
            liveBroadcastEndWidget.LJFF = true;
            liveBroadcastEndWidget.LIZLLL.LJIIJ = true;
        }
        KPM.LIZIZ();
        EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = this.LJIIJ;
        if (effectLiveBroadcastActivityProxy != null) {
            effectLiveBroadcastActivityProxy.LIZJ();
        }
        if (!LJIILIIL()) {
            return;
        }
        if (LJIJJLI() != null) {
            LJIJJLI().LJFF();
        }
        ILifeCycleAware iLifeCycleAware = (ILifeCycleAware) ServiceManager.getService(ILifeCycleAware.class);
        if (iLifeCycleAware != null) {
            Room room2 = this.LJFF;
            if (room2 != null && room2.getIdStr() != null) {
                str = this.LJFF.getIdStr();
            } else {
                str = LoggerUtil.UNKNOWN;
            }
            iLifeCycleAware.onEndSession(str);
        }
        AbstractC2866al abstractC2866al = this.LJIJJ;
        if (abstractC2866al != null) {
            abstractC2866al.LIZ();
        }
        DataCenter dataCenter = this.LJIILJJIL;
        if (dataCenter != null) {
            dataCenter.put("cmd_anchor_broadcast_end", new Object());
        }
        this.LJIIIIZZ.post(new Runnable(this) { // from class: X.K2O
            public static ChangeQuickRedirect LIZ;
            public final C2995dh LIZIZ;

            static {
                Covode.recordClassIndex(15498);
            }

            {
                this.LIZIZ = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.LJJ();
            }
        });
    }

    public CharSequence LJIJJ() {
        String LIZ2;
        String valueOf;
        int indexOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (CharSequence) proxy.result;
        }
        EndingBlockWidget endingBlockWidget = this.LJIIL;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], endingBlockWidget, EndingBlockWidget.LIZJ, false, 14);
        if (proxy2.isSupported) {
            return (CharSequence) proxy2.result;
        }
        int LIZ3 = endingBlockWidget.LIZ();
        if (LIZ3 <= 0) {
            LIZ2 = LK5.LIZ(2131585111);
        } else {
            LIZ2 = LK5.LIZ(2131886131, LIZ3, Integer.valueOf(LIZ3));
        }
        C8760bd c8760bd = (C8760bd) endingBlockWidget.LIZLLL.get("data_dou_plus_promote_message", (String) null);
        if (c8760bd != null && c8760bd.LIZ == 1) {
            LIZ2 = LK5.LIZ(2131582943);
        }
        if (!TextUtils.isEmpty(LIZ2) && LIZ3 > 0 && (indexOf = LIZ2.indexOf((valueOf = String.valueOf(LIZ3)))) != -1) {
            SpannableString spannableString = new SpannableString(LIZ2);
            spannableString.setSpan(new ForegroundColorSpan(-56832), indexOf, valueOf.length() + indexOf, 34);
            return spannableString;
        }
        return LIZ2;
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onResume();
        C91264LxS.LIZJ.LIZJ(getActivity());
        C86665KDb.LIZIZ("ttlive_broadcast_on_resume", "LiveBroadcastFragment");
        ALogger.m15800e("create_duration", "broadcast onResume");
        EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = this.LJIIJ;
        if (effectLiveBroadcastActivityProxy != null) {
            effectLiveBroadcastActivityProxy.LIZ();
        }
        ((IRoomService) ServiceManager.getService(IRoomService.class)).setIsOnNeedMuteAudioFullPage(false);
        LIZJ().LIZ(this.LJIILJJIL, this.LJFF);
        final C86296JzW c86296JzW = this.LJJIIJ;
        if (!PatchProxy.proxy(new Object[0], c86296JzW, C86296JzW.LIZ, false, 3).isSupported) {
            c86296JzW.LIZIZ = true;
            if (!PatchProxy.proxy(new Object[]{K3H.class}, c86296JzW, C86296JzW.LIZ, false, 21).isSupported) {
                c86296JzW.LJJ.add(C87010KQi.LIZ().LIZ(K3H.class).subscribe(new Consumer(c86296JzW) { // from class: X.K1c
                    public static ChangeQuickRedirect LIZ;
                    public final C86296JzW LIZIZ;

                    static {
                        Covode.recordClassIndex(17831);
                    }

                    {
                        this.LIZIZ = c86296JzW;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C86296JzW c86296JzW2 = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{obj}, c86296JzW2, C86296JzW.LIZ, false, 32).isSupported || !(obj instanceof K3H)) {
                            return;
                        }
                        c86296JzW2.onEvent((K3H) obj);
                    }
                }));
            }
            while (!c86296JzW.LJIJI.isEmpty()) {
                c86296JzW.onChanged(c86296JzW.LJIJI.poll());
            }
        }
        if (LJII()) {
            this.LJIIIIZZ.removeCallbacksAndMessages(null);
            return;
        }
        LiveSettingKeys.LIVE_WEBP_OPT_WEBPFRAMECACHEKEYOPT.getValue().booleanValue();
        if (LiveSettingKeys.LIVE_WEBP_OPT_FRAMESCHEDULER.getValue().booleanValue()) {
            C88326KrA.LIZ();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_broadcast_on_destroy", "LiveBroadcastFragment");
        AbstractC80293Hkt.LJJIIZ.LIZ(Boolean.FALSE);
        LJIIJJI();
        C86296JzW c86296JzW = this.LJJIIJ;
        if (c86296JzW != null && !PatchProxy.proxy(new Object[0], c86296JzW, C86296JzW.LIZ, false, 26).isSupported) {
            c86296JzW.LIZJ = false;
            c86296JzW.LIZLLL = true;
            if (c86296JzW.LJIILL != null && !c86296JzW.LJIILL.isDisposed()) {
                c86296JzW.LJIILL.dispose();
            }
            if (c86296JzW.LJIJ != null && c86296JzW.LJIJ.LJIILIIL()) {
                c86296JzW.LJIJ.dismiss();
            }
            if (c86296JzW.LJIJJ != null) {
                c86296JzW.LJIJJ.clear();
            }
            if (c86296JzW.LJIIIZ != null) {
                LinkCrossRoomDataHolder.LIZIZ(c86296JzW.LJIIIZ.getId());
            }
            C79007HCn.LJII().LJI();
            try {
                ((AbstractC90419Ljp) ServiceManager.getService(AbstractC90419Ljp.class)).clearAssets("effects");
            } catch (IllegalStateException unused) {
            }
        }
        K2T k2t = this.LJJI;
        if (k2t != null) {
            k2t.LIZJ();
            this.LJJI = null;
        }
        C2W5 c2w5 = this.LJJ;
        if (c2w5 != null) {
            c2w5.LIZIZ();
        }
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).setCurrentRoom(null);
            ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).setStreamerRoom(null);
        }
        Room room = this.LJFF;
        long j = 0;
        if (room != null && room.getId() > 0) {
            str = String.valueOf(this.LJFF.getId());
        } else {
            str = null;
        }
        ILifeCycleAware iLifeCycleAware = (ILifeCycleAware) ServiceManager.getService(ILifeCycleAware.class);
        if (iLifeCycleAware != null) {
            if (str == null) {
                str = LoggerUtil.UNKNOWN;
            }
            iLifeCycleAware.onEndSession(str);
        }
        C86296JzW c86296JzW2 = this.LJJIIJ;
        if (c86296JzW2 != null) {
            c86296JzW2.LIZIZ();
        }
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStop("stream");
        super.onDestroy();
        C86300Jza c86300Jza = this.LJJIII;
        if (c86300Jza != null) {
            c86300Jza.LIZLLL();
        }
        ((IHostBusiness) ServiceManager.getService(IHostBusiness.class)).resetPoiMemoryPoiDetailData();
        AbstractC2864aj abstractC2864aj = this.LIZLLL;
        if (abstractC2864aj != null) {
            abstractC2864aj.LIZLLL().LIZIZ();
        }
        C86307Jzh c86307Jzh = this.LJJIIZI;
        if (c86307Jzh != null && !PatchProxy.proxy(new Object[0], c86307Jzh, C86307Jzh.LIZ, false, 5).isSupported && c86307Jzh.LIZIZ != null) {
            ALogger.m15797i("LiveBroadcastFragment", "DisposeRoomContext this=" + c86307Jzh.hashCode() + " context=" + c86307Jzh.LIZIZ.getFirst().hashCode());
            c86307Jzh.LIZIZ.getSecond().dispose();
            c86307Jzh.LIZIZ = null;
        }
        Room room2 = this.LJFF;
        if (room2 != null) {
            j = room2.getId();
        }
        ((IAnchorAudienceMsgService) ServiceManager.getService(IAnchorAudienceMsgService.class)).release(j);
        C88725Kxb.LIZ(false);
        AVLog.setupLogIODevice(null);
    }

    public void LIZIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 36).isSupported) {
            return;
        }
        this.LJIIL.LIZIZ(hashMap);
    }

    @Override // p003X.AbstractC86387K2j
    public final void LIZLLL(int i) {
        LiveBroadcastEndWidget liveBroadcastEndWidget;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 39).isSupported && (liveBroadcastEndWidget = this.LJJIJ) != null) {
            liveBroadcastEndWidget.LIZ(false, i);
        }
    }

    @Override // com.bytedance.android.live.room.AbstractC5478a
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 33).isSupported) {
            return;
        }
        LiveStreamManager liveStreamManager = this.LJJIJIIJI;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, liveStreamManager, LiveStreamManager.LIZJ, false, 33).isSupported && liveStreamManager.LJIIIIZZ != null) {
            liveStreamManager.LJIIIIZZ.LIZ(i);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (!PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 21).isSupported && 3 == message.what) {
            LiveBroadcastEndWidget liveBroadcastEndWidget = this.LJJIJ;
            Object obj = message.obj;
            if (!PatchProxy.proxy(new Object[]{obj}, liveBroadcastEndWidget, LiveBroadcastEndWidget.LIZJ, false, 4).isSupported) {
                C86378K2a c86378K2a = new C86378K2a(liveBroadcastEndWidget, (byte) 0);
                if (obj instanceof ApiServerException) {
                    c86378K2a.LIZ = ((ApiException) obj).mErrorCode;
                }
                if (c86378K2a.LIZ == 30001 || c86378K2a.LIZ == 50002 || c86378K2a.LIZ == 30003) {
                    ALogger.m15801d("LiveBroadcastFragment", "room close handleUpdateRoomStatusResult errorCode:" + c86378K2a.LIZ);
                    C86665KDb.LIZ("ttlive_on_handle_update_room_status", "room").LIZ(C86407K3d.LIZIZ(c86378K2a.LIZ)).LIZ().LIZ();
                    liveBroadcastEndWidget.LIZ(false);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 40).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        ALogger.m15795w("LiveBroadcastFragment", C0002O.m25086C("onConfigurationChanged: device_type: ", Build.MODEL));
        this.LJJIIJ.LJIILLIIL = configuration;
        CommonUIWidget commonUIWidget = this.LJJII;
        C86300Jza c86300Jza = this.LJJIII;
        if (!PatchProxy.proxy(new Object[]{configuration, c86300Jza}, commonUIWidget, CommonUIWidget.LIZJ, false, 3).isSupported) {
            ALogger.m15795w("LiveBroadcastFragment", C0002O.m25086C("onConfigurationChanged: device_type: ", Build.MODEL));
            if (commonUIWidget.LIZLLL != configuration.screenWidthDp) {
                ALogger.m15795w("LiveBroadcastFragment", String.format("onConfigurationChanged:start to adjustFullDisplay for screenWidthDp:%s", Integer.valueOf(commonUIWidget.LIZLLL)));
                commonUIWidget.LIZLLL = configuration.screenWidthDp;
                c86300Jza.LIZJ();
            }
        }
    }

    @Override // p003X.AbstractC86311Jzl
    public final void LIZIZ(int i) {
        String str;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        LiveBroadcastIllegalWidget liveBroadcastIllegalWidget = this.LJIIJJI;
        if (!PatchProxy.proxy(new Object[0], liveBroadcastIllegalWidget, LiveBroadcastIllegalWidget.LIZJ, false, 18).isSupported && liveBroadcastIllegalWidget.LJFF != null) {
            liveBroadcastIllegalWidget.LJFF.LIZIZ();
        }
        C86296JzW c86296JzW = this.LJJIIJ;
        if (!PatchProxy.proxy(new Object[0], c86296JzW, C86296JzW.LIZ, false, 24).isSupported && c86296JzW.LJIIIIZZ > 0) {
            long currentTimeMillis = System.currentTimeMillis() - c86296JzW.LJIIIIZZ;
            long j = c86296JzW.f8301LJ;
            c86296JzW.f8301LJ = 0L;
            c86296JzW.LJIIIIZZ = 0L;
            if (j > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration_room", String.valueOf(currentTimeMillis));
                hashMap.put("duration_gift_effect", String.valueOf(j));
                hashMap.put("gift_effect_live_ratio", String.valueOf((j * 1.0d) / currentTimeMillis));
                if (((Boolean) c86296JzW.LJII.get("data_is_anchor", (String) Boolean.FALSE)).booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("is_anchor", str);
                hashMap.put("room_type", "video");
                C4574547f.LIZ().LIZ("livesdk_gift_effect_show_summary", hashMap, Room.class, C8668v.class);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C74768Fdy.LIZ(getActivity());
        super.onActivityCreated(bundle);
        C86665KDb.LIZIZ("ttlive_broadcast_on_activity_created", "LiveBroadcastFragment");
        getActivity().getWindow().setSoftInputMode(50);
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(AbstractC5483d.LIZ);
        if (findFragmentByTag != null) {
            try {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commitNowAllowingStateLoss();
            } catch (Exception e) {
                C2IN.LIZIZ().LIZ(6, e.getStackTrace());
            }
        }
        final LiveStreamManager liveStreamManager = this.LJJIJIIJI;
        if (!PatchProxy.proxy(new Object[0], liveStreamManager, LiveStreamManager.LIZJ, false, 2).isSupported) {
            HashMap hashMap = new HashMap();
            if (liveStreamManager.LJIIIZ != null) {
                if (liveStreamManager.LJIIIZ.isLiveTypeAudio()) {
                    liveMode = LiveMode.AUDIO;
                } else {
                    liveMode = LiveMode.VIDEO;
                }
                hashMap.put("live_type", C2VQ.LIZ(liveMode));
            }
            hashMap.put("live_page_load", String.valueOf(System.currentTimeMillis()));
            C4574547f.LIZ().LIZ("livesdk_performance_anchor_create_room_duration", hashMap, new Object[0]);
            if (PerformanceTestSettings.TEST_DISABLE_INTERACTION.getValue().booleanValue() || LiveConfigSettingKeys.LIVE_PERFORMANCE_HIDE_INTERACTION.getValue().booleanValue()) {
                C3J9.LIZ().postDelayed(new Runnable(liveStreamManager) { // from class: X.K1Y
                    public static ChangeQuickRedirect LIZ;
                    public final LiveStreamManager LIZIZ;

                    static {
                        Covode.recordClassIndex(17841);
                    }

                    {
                        this.LIZIZ = liveStreamManager;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveStreamManager liveStreamManager2 = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[0], liveStreamManager2, LiveStreamManager.LIZJ, false, 42).isSupported) {
                            return;
                        }
                        liveStreamManager2.onEvent(new C5986ap(3));
                    }
                }, JsBridgeDelegate.GET_URL_OUT_TIME);
            }
        }
    }

    public final /* synthetic */ void LIZ(Object obj) {
        if (!PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 45).isSupported && (obj instanceof C5993bc) && this.LJJLIL) {
            C5993bc c5993bc = (C5993bc) obj;
            if (!PatchProxy.proxy(new Object[]{c5993bc}, this, LIZ, false, 12).isSupported && LiveSettingKeys.LIVE_NEW_DOU_PLUS_CAROUSEL_STYLE.getValue().booleanValue()) {
                if (c5993bc.LIZ == 4) {
                    if (getContext() != null) {
                        ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).openRoomIntroDialog(C439993ar.LIZIZ(getContext()), this.LJFF, null, null);
                    }
                } else if (c5993bc.LIZ == 0 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
                    C86665KDb.LIZIZ("ttlive_on_tool_bar_beauty_click", "LiveBroadcastFragment");
                    if (!C427772wF.LIZ(this.LJIILJJIL)) {
                        EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = this.LJIIJ;
                        if (effectLiveBroadcastActivityProxy != null) {
                            effectLiveBroadcastActivityProxy.LIZ(KB2.LIZ(LIZJ().LJIIIZ().LIZIZ()), C86334K0i.LIZIZ);
                        }
                        C87010KQi.LIZ().LIZ(new C2914l(true));
                        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).monitorPerformance("beauty");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        K8Q.LIZ().LJIIIZ().LIZ(this);
        K7G k7g = K7G.LIZIZ;
        k7g.LIZ();
        C86748KGg.LIZ(k7g);
        this.LJIJ = System.currentTimeMillis();
        this.LJJIIJZLJL = new CommonDataConfigWidget();
        this.LJJII = new CommonUIWidget(this, this.LJIIIIZZ);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        if (LiveSettingKeys.LIVE_STREAM_REFACTOR.getValue().booleanValue()) {
            AbstractC86377K1z abstractC86377K1z = this.LJII;
            if (abstractC86377K1z != null) {
                this.LJIILJJIL = abstractC86377K1z.LIZIZ();
            }
        } else {
            this.LJIILJJIL = DataCenter.create(ViewModelProviders.m21144of(this), this);
        }
        this.LJJIIZI = new C86307Jzh(this.LJIILJJIL, getContext());
        LIZJ().LIZ(this.LJIILJJIL, this.LJFF);
        this.LJJ = new C2W5(this.LJIILJJIL);
        PluginType.LiveResource.LIZJ();
        if (LJIJJLI() != null) {
            this.LJIIJ = LJIJJLI().mo15855LJ();
        }
        Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        if (currentRoom == null) {
            liveMode = LiveMode.UNDEFINED;
        } else if (currentRoom.isLiveTypeAudio()) {
            liveMode = LiveMode.AUDIO;
        } else {
            liveMode = LiveMode.VIDEO;
        }
        KCU.LIZ(liveMode, "broadcast_fragment_create");
        this.LJIIL = new EndingBlockWidget(this, this.LJIILJJIL, this.LIZJ);
        this.LJJIJIIJI = new LiveStreamManager(this.LJIILJJIL, LIZJ(), getActivity(), this.LJIIIIZZ, this.LIZIZ, this.LJJ, this.LIZJ, this, this.f25814LJ, this);
        this.LJJIIJ = new C86296JzW(this, this.LJIILJJIL, this.LJIJ);
        C88725Kxb.LIZ();
        C88725Kxb.LIZ(true);
        if (!PatchProxy.proxy(new Object[]{C5993bc.class}, this, LIZ, false, 11).isSupported) {
            LIZIZ(C87010KQi.LIZ().LIZ(C5993bc.class).subscribe(new Consumer(this) { // from class: X.K2V
                public static ChangeQuickRedirect LIZ;
                public final C2995dh LIZIZ;

                static {
                    Covode.recordClassIndex(15378);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.LIZ(obj);
                }
            }));
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        DouPlusEntry douPlusEntry;
        Serializable serializable;
        AnnouncementInfo announcementInfo;
        Serializable serializable2;
        Parcelable parcelable;
        long j;
        Parcelable parcelable2;
        LiveHashTag liveHashTag;
        boolean z;
        String string;
        Bundle bundle2;
        C5923dp LLLLII;
        boolean z2;
        boolean z3;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        C86665KDb.LIZIZ("ttlive_broadcast_on_view_created", "LiveBroadcastFragment");
        AbstractC80293Hkt.LJJLIIIJLLLLLLLZ.LIZ(Long.valueOf(System.currentTimeMillis()));
        this.LJIILIIL = WidgetManager.m14494of(this, getView()).setDataCenter(this.LJIILJJIL);
        this.LJIIIZ = (HSImageView) getView().findViewById(2131181026);
        this.LJIIZILJ = (ViewGroup) getView().findViewById(2131186183);
        this.LJFF = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            if (!((Boolean) proxy.result).booleanValue()) {
                return;
            }
        } else if (!Room.isValid(this.LJFF) || this.LJFF.getStreamUrl() == null) {
            C86428K3y.LIZ(this.LJFF);
            C91211Lwb.LIZ("ttlive_start_live_room_null", 0, new HashMap());
            if (getActivity() == null) {
                return;
            }
            getActivity().finish();
            return;
        }
        if (LJIJJLI() != null) {
            List<View> LIZLLL = LJIJJLI().LIZLLL();
            this.LJIL = (HSImageView) LIZLLL.get(0);
            this.LJIILL = (ViewGroup) LIZLLL.get(1);
            this.LJIIZILJ = (ViewGroup) LIZLLL.get(1);
            this.LJIILLIIL = LIZLLL.get(2);
            if (LiveSettingKeys.LIVE_STREAM_REFACTOR.getValue().booleanValue()) {
                LJIJJLI().LIZ(this.LJFF);
            }
        }
        CommonUIWidget commonUIWidget = this.LJJII;
        ViewGroup viewGroup = this.LJIILL;
        if (!PatchProxy.proxy(new Object[]{viewGroup}, commonUIWidget, CommonUIWidget.LIZJ, false, 6).isSupported && viewGroup != null && LiveConfigSettingKeys.LIVE_ENABLE_FIX_LIVE_END.getValue().booleanValue()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.leftMargin = 1;
            layoutParams.rightMargin = 1;
            viewGroup.setLayoutParams(layoutParams);
        }
        C91264LxS.LIZJ.LIZ(this.LJFF, "anchor");
        this.LJIILJJIL.put("data_room", this.LJFF);
        this.LJIILJJIL.put("data_is_anchor", Boolean.TRUE);
        C5923dp LIZJ = LIZJ();
        LIZJ.LIZ().LIZ(this.LJFF);
        LiveStreamManager liveStreamManager = this.LJJIJIIJI;
        Room room = this.LJFF;
        liveStreamManager.LJIIIZ = room;
        this.LJIIJJI = new LiveBroadcastIllegalWidget(this, room, this.LJIILJJIL, this.LJI, this.LIZIZ);
        this.LJJIJ = new LiveBroadcastEndWidget(this, this.LJIILJJIL, this.LJI, this.LJJIJIIJI);
        this.LJJIIZ = new InteractStateWidget(this, this.LJIILJJIL, this.LJJIJIIJI);
        this.LJIILIIL.load(this.LJJIJIIJI);
        this.LJIILIIL.load(this.LJIIJJI);
        this.LJIILIIL.load(this.LJJII);
        this.LJIILIIL.load(this.LJJIIZ);
        this.LJIILIIL.load(this.LJIIL);
        this.LJIILIIL.load(this.LJJIJ);
        this.LJJIII = new C86300Jza(this, this.LJIILJJIL, this.LJFF.getStreamUrlExtraSafely(), LIZJ);
        C86296JzW c86296JzW = this.LJJIIJ;
        Room room2 = this.LJFF;
        View view2 = this.LJIILLIIL;
        HSImageView hSImageView = this.LJIL;
        ViewGroup viewGroup2 = this.LJIILL;
        C86300Jza c86300Jza = this.LJJIII;
        if (!PatchProxy.proxy(new Object[]{room2, view2, hSImageView, viewGroup2, c86300Jza, this}, c86296JzW, C86296JzW.LIZ, false, 2).isSupported) {
            c86296JzW.LJIIIZ = room2;
            c86296JzW.LJIIJ = view2;
            c86296JzW.LJIIJJI = hSImageView;
            c86296JzW.LJIIL = viewGroup2;
            c86296JzW.LJIILIIL = (ViewGroup) c86296JzW.LJI.LJIJI().getView().findViewById(2131166409);
            c86296JzW.LJIILJJIL = c86300Jza;
            c86296JzW.LIZJ = true;
            LinkCrossRoomDataHolder.LIZ(c86296JzW.LJIIIZ.getId(), ViewModelProviders.m21144of(c86296JzW.LJI.LJIJI()), this);
            ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).initGameContext(c86296JzW.LJI.LJIJI(), true);
            ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).executeEnterRoomTask(true, c86296JzW.LJIIIZ);
            c86296JzW.LIZJ();
        }
        CommonDataConfigWidget commonDataConfigWidget = this.LJJIIJZLJL;
        Room room3 = this.LJFF;
        if (!PatchProxy.proxy(new Object[]{room3, LIZJ}, commonDataConfigWidget, CommonDataConfigWidget.LIZ, false, 2).isSupported) {
            commonDataConfigWidget.LIZIZ = room3;
            if (commonDataConfigWidget.LIZIZ.welfareProjectInfo != null) {
                LIZJ.LLIILZL().LIZ(commonDataConfigWidget.LIZIZ.welfareProjectInfo);
            }
            C5924dr c5924dr = new C5924dr();
            LIZJ.LJJIIZI().LIZ(c5924dr);
            C5924dr.LIZJ.LIZ(c5924dr, commonDataConfigWidget.LIZIZ.anchorAbMap);
        }
        if (!PatchProxy.proxy(new Object[]{LIZJ}, this.LJJIIJZLJL, CommonDataConfigWidget.LIZ, false, 3).isSupported) {
            PreviewDataTransferHolder LIZ2 = K3R.LIZ();
            if (LIZ2 != null) {
                PreviewSourceParam previewSourceParam = LIZ2.previewSourceParam;
                if (previewSourceParam != null) {
                    LIZJ.LLJJ().LIZIZ(previewSourceParam);
                }
                LIZJ.LLLIL().LIZ(LIZ2.paidLiveCreateRights);
                LIZJ.LLLILZ().LIZ(Long.valueOf(LIZ2.ownerIdOfSellTicket));
            }
            K3R.LIZJ();
        }
        CommonUIWidget commonUIWidget2 = this.LJJII;
        ViewGroup viewGroup3 = this.LJIIZILJ;
        ViewGroup viewGroup4 = this.LJIILL;
        if (!PatchProxy.proxy(new Object[]{LIZJ, viewGroup3, viewGroup4}, commonUIWidget2, CommonUIWidget.LIZJ, false, 9).isSupported) {
            LIZJ.LLJJJ().LIZ(new WeakReference<>(viewGroup3));
            LIZJ.LLJJJIL().LIZ(new WeakReference<>(viewGroup4));
        }
        C86307Jzh c86307Jzh = this.LJJIIZI;
        Bundle arguments = getArguments();
        Room room4 = this.LJFF;
        String str = "";
        if (!PatchProxy.proxy(new Object[]{arguments, room4}, c86307Jzh, C86307Jzh.LIZ, false, 1).isSupported && arguments != null) {
            Bundle bundle3 = arguments.getBundle("extra");
            if (bundle3 == null) {
                douPlusEntry = null;
            } else {
                douPlusEntry = (DouPlusEntry) bundle3.getSerializable("data_dou_plus_promote_entry");
            }
            C4306532d.LIZ(douPlusEntry, room4, c86307Jzh.LIZJ);
            if (bundle3 == null) {
                serializable = null;
            } else {
                serializable = bundle3.getSerializable("data_live_scheduled_info");
            }
            c86307Jzh.LIZJ.put("data_live_scheduled_info", serializable);
            if (bundle3 == null) {
                announcementInfo = null;
            } else {
                announcementInfo = (AnnouncementInfo) bundle3.getSerializable("data_live_announcement_info");
            }
            ((IAnnouncementService) ServiceManager.getService(IAnnouncementService.class)).setAnnouncementInfo(c86307Jzh.LIZLLL, announcementInfo);
            if (bundle3 == null) {
                serializable2 = null;
            } else {
                serializable2 = bundle3.getSerializable("data_live_broadcast_preview_info");
            }
            c86307Jzh.LIZJ.put("data_live_broadcast_preview_info", serializable2);
            if (bundle3 == null) {
                parcelable = null;
            } else {
                parcelable = bundle3.getParcelable("data_welfare_permission_info");
            }
            c86307Jzh.LIZJ.put("data_welfare_permission_info", parcelable);
            DataCenter dataCenter = c86307Jzh.LIZJ;
            if (bundle3 == null) {
                j = 0;
            } else {
                j = bundle3.getLong("data_anchor_welfare_id", 0L);
            }
            dataCenter.put("data_anchor_welfare_id", Long.valueOf(j));
            DataCenter dataCenter2 = c86307Jzh.LIZJ;
            long j2 = 15;
            if (bundle3 != null) {
                j2 = bundle3.getLong("data_anchor_welfare_frequency", 15L);
            }
            dataCenter2.put("data_anchor_welfare_frequency", Long.valueOf(j2));
            if (bundle3 == null) {
                parcelable2 = null;
            } else {
                parcelable2 = bundle3.getParcelable("data_hash_tag_use_info");
            }
            c86307Jzh.LIZJ.put("data_hash_tag_use_info", parcelable2);
            if (bundle3 == null) {
                liveHashTag = null;
            } else {
                liveHashTag = (LiveHashTag) bundle3.getSerializable("cmd_update_live_challenge");
            }
            c86307Jzh.LIZJ.put("cmd_update_live_challenge", liveHashTag);
            if (liveHashTag != null && liveHashTag.taskId != null && !liveHashTag.taskId.isEmpty()) {
                ALogger.m15801d("LiveBroadcastFragment", String.format("get task id [%s] from challenge, start put toast", liveHashTag.taskId));
                c86307Jzh.LIZJ.put("data_need_show_task_challenge_toast", Boolean.valueOf(!liveHashTag.challengeTaskOptional));
                if (liveHashTag.taskStickerId != null && !liveHashTag.taskStickerId.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ALogger.m15801d("LiveBroadcastFragment", String.format("get task sticker id [%s] from challenge", liveHashTag.taskStickerId));
                DataCenter dataCenter3 = c86307Jzh.LIZJ;
                if (z2 && !liveHashTag.stickerTaskOptional) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                dataCenter3.put("data_need_show_task_sticker_toast", Boolean.valueOf(z3));
            }
            if (bundle3 != null && bundle3.getBoolean("from_promote_live")) {
                z = true;
            } else {
                z = false;
            }
            c86307Jzh.LIZJ.put("from_promote_live", Boolean.valueOf(z));
            if (bundle3 == null) {
                string = str;
            } else {
                string = bundle3.getString("data_commerce_task_id", str);
            }
            c86307Jzh.LIZJ.put("data_commerce_task_id", string);
            if (!PatchProxy.proxy(new Object[]{bundle3}, c86307Jzh, C86307Jzh.LIZ, false, 2).isSupported && bundle3 != null) {
                AbstractC8644i LIZ3 = C4574547f.LIZ().LIZ(C8668v.class);
                Bundle bundle4 = bundle3.getBundle("source_params");
                if (bundle4 == null) {
                    ((C81173Hz5) LIZ3).LJII = false;
                    C5923dp LLLLII2 = C5923dp.LLLLII();
                    if (LLLLII2 != null) {
                        LLLLII2.LLLIIII().LIZ(null);
                    }
                    Map<String, String> LIZ4 = LIZ3.LIZ();
                    if (LIZ4 != null) {
                        LIZ4.remove("enter_from_merge");
                        LIZ4.remove("enter_from");
                        LIZ4.remove("enter_method");
                        LIZ4.remove("open_source");
                        LIZ4.remove("source");
                    }
                } else {
                    if (bundle4.containsKey("enter_from_merge")) {
                        LIZ3.LIZ("enter_from_merge", bundle4.getString("enter_from_merge", str));
                    } else {
                        LIZ3.LIZ().remove("enter_from_merge");
                    }
                    if (bundle4.containsKey("enter_from")) {
                        String string2 = bundle4.getString("enter_from", str);
                        LIZ3.LIZ("enter_from", string2);
                        c86307Jzh.LIZ().LLFF().LIZ(string2);
                    } else {
                        LIZ3.LIZ().remove("enter_from");
                    }
                    if (bundle4.containsKey("enter_method")) {
                        String string3 = bundle4.getString("enter_method", str);
                        LIZ3.LIZ("enter_method", string3);
                        LIZ3.LIZ("open_source", string3);
                        LIZ3.LIZ("source", string3);
                    } else {
                        LIZ3.LIZ().remove("enter_method");
                        LIZ3.LIZ().remove("open_source");
                        LIZ3.LIZ().remove("source");
                    }
                    if (LIZ3 instanceof C81173Hz5) {
                        if (bundle4.containsKey("shoot_way")) {
                            ((C81173Hz5) LIZ3).LJI = bundle4.getString("shoot_way");
                        }
                        if (bundle4.containsKey("need_invite")) {
                            ((C81173Hz5) LIZ3).LJII = bundle4.getBoolean("need_invite");
                        }
                        if (bundle4.containsKey("play_mode") && (LLLLII = C5923dp.LLLLII()) != null) {
                            LLLLII.LLLIIII().LIZ(bundle4.getIntegerArrayList("play_mode"));
                        }
                    }
                }
            }
            if (!PatchProxy.proxy(new Object[]{bundle3}, c86307Jzh, C86307Jzh.LIZ, false, 3).isSupported && bundle3 != null && (bundle2 = bundle3.getBundle("source_params")) != null) {
                if (bundle2.containsKey("open_panel_type") && C5923dp.LLLLII() != null) {
                    C5923dp.LLLLII().LLLILZJ().LIZ(Integer.valueOf(bundle2.getInt("open_panel_type")));
                }
                if (bundle2.containsKey("ktv_type") && C5923dp.LLLLII() != null) {
                    C5923dp.LLLLII().LLLILZLLLI().LIZ(Integer.valueOf(bundle2.getInt("ktv_type")));
                }
                if (bundle2.containsKey("platform_activity_id") && C5923dp.LLLLII() != null) {
                    C5923dp.LLLLII().LLLIZZ().LIZ(bundle2.getString("platform_activity_id"));
                }
                if (bundle2.containsKey("open_panel_type") && bundle2.containsKey("platform_activity_id")) {
                    int i = bundle2.getInt("open_panel_type");
                    String string4 = bundle2.getString("platform_activity_id");
                    ALogger.m15801d("receive_open_panel_for_schema_event", "receive params : openPanelType = " + i + ", platformActivityId = " + string4);
                    if (string4 != null) {
                        HH8.LIZ(i, string4);
                    }
                }
            }
        }
        AbstractC8644i LIZ5 = C4574547f.LIZ().LIZ(Room.class);
        if (LIZ5 instanceof C446923m2) {
            LIZ5.LIZ((AbstractC8644i) this.LJFF);
        }
        if (ServiceManager.getService(IInteractService.class) != null) {
            Pair<String, AbstractC8645j> provideFunctionTypeLogInjector = ((IInteractService) ServiceManager.getService(IInteractService.class)).provideFunctionTypeLogInjector();
            if (provideFunctionTypeLogInjector != null) {
                C4574547f.LIZ().LIZ(provideFunctionTypeLogInjector.first, (AbstractC8645j) provideFunctionTypeLogInjector.second);
            }
            Pair<String, AbstractC8645j> providePlayModeLogInjector = ((IInteractService) ServiceManager.getService(IInteractService.class)).providePlayModeLogInjector();
            if (providePlayModeLogInjector != null) {
                C4574547f.LIZ().LIZ(providePlayModeLogInjector.first, (AbstractC8645j) providePlayModeLogInjector.second);
            }
            Pair<String, AbstractC8645j> provideFunctionType2LogInjector = ((IInteractService) ServiceManager.getService(IInteractService.class)).provideFunctionType2LogInjector();
            if (provideFunctionType2LogInjector != null) {
                C4574547f.LIZ().LIZ(provideFunctionType2LogInjector.first, (AbstractC8645j) provideFunctionType2LogInjector.second);
            }
        }
        if (this.LJFF.isLiveTypeAudio()) {
            HSImageView hSImageView2 = (HSImageView) getView().findViewById(2131187053);
            View findViewById = getView().findViewById(2131187054);
            hSImageView2.setVisibility(0);
            findViewById.setVisibility(0);
            M0Q.LIZ(hSImageView2, this.LJFF.getOwner().getAvatarLarge(), new M0W(5, UIUtils.getScreenWidth(getContext()) / UIUtils.getScreenHeight(getContext()), null));
        }
        final CommonUIWidget commonUIWidget3 = this.LJJII;
        if (!PatchProxy.proxy(new Object[0], commonUIWidget3, CommonUIWidget.LIZJ, false, 4).isSupported) {
            commonUIWidget3.LJFF = ((RoomRetrofitApi) C88306Kqq.LIZ().LIZ(RoomRetrofitApi.class)).fetchAudioChatSwitch(commonUIWidget3.f25939LJ.getId()).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(commonUIWidget3) { // from class: X.3Uo
                public static ChangeQuickRedirect LIZ;
                public final CommonUIWidget LIZIZ;

                static {
                    Covode.recordClassIndex(17719);
                }

                {
                    this.LIZIZ = commonUIWidget3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    boolean z4 = true;
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CommonUIWidget commonUIWidget4 = this.LIZIZ;
                    C5171b c5171b = (C5171b) obj;
                    if (PatchProxy.proxy(new Object[]{c5171b}, commonUIWidget4, CommonUIWidget.LIZJ, false, 13).isSupported) {
                        return;
                    }
                    AbstractC80293Hkt.LLZZJLIL.LIZ(Integer.valueOf(((C6139e) c5171b.LIZJ).f26882LJ));
                    AbstractC80293Hkt.LLZLL.LIZ(Integer.valueOf(((C6139e) c5171b.LIZJ).LIZLLL));
                    AbstractC80293Hkt.LLZLLLL.LIZ(Boolean.valueOf(((C6139e) c5171b.LIZJ).LIZ));
                    AbstractC80293Hkt.LLZZ.LIZ(Boolean.valueOf(!commonUIWidget4.f25939LJ.isThirdParty && ((C6139e) c5171b.LIZJ).LIZIZ));
                    commonUIWidget4.dataCenter.put("data_room_audio_comment_anchor_show", Boolean.valueOf(((C6139e) c5171b.LIZJ).LIZJ));
                    commonUIWidget4.dataCenter.put("data_room_audio_comment_enable", Boolean.valueOf(((C6139e) c5171b.LIZJ).LIZ));
                    DataCenter dataCenter4 = commonUIWidget4.dataCenter;
                    if (commonUIWidget4.f25939LJ.isThirdParty || !((C6139e) c5171b.LIZJ).LIZIZ) {
                        z4 = false;
                    }
                    dataCenter4.put("data_room_audio_comment_auto_play", Boolean.valueOf(z4));
                }
            }, new Consumer(commonUIWidget3) { // from class: X.3Up
                public static ChangeQuickRedirect LIZ;
                public final CommonUIWidget LIZIZ;

                static {
                    Covode.recordClassIndex(17763);
                }

                {
                    this.LIZIZ = commonUIWidget3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CommonUIWidget commonUIWidget4 = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, commonUIWidget4, CommonUIWidget.LIZJ, false, 12).isSupported) {
                        return;
                    }
                    commonUIWidget4.dataCenter.put("data_room_audio_comment_anchor_show", Boolean.FALSE);
                    commonUIWidget4.dataCenter.put("data_room_audio_comment_enable", Boolean.TRUE);
                    commonUIWidget4.dataCenter.put("data_room_audio_comment_auto_play", Boolean.valueOf(true ^ commonUIWidget4.f25939LJ.isThirdParty));
                }
            });
        }
        LJIIIZ();
        if (this.LJFF.isLiveTypeAudio()) {
            M0Q.LIZ(this.LJIIIZ, C9061c.LIZ(LiveSettingKeys.LIVE_AUDIO_LIVE_BG.getValue(), this.LJFF.getOwnerUserId()), 2130854253);
            AbstractC2865ak abstractC2865ak = this.LIZJ;
            if (abstractC2865ak != null) {
                this.LJIJJ = abstractC2865ak.LIZ(this.LJFF);
                this.LJIILIIL.load(this.LJIJJ.LIZIZ());
            }
        } else {
            this.LJIIIZ.setVisibility(8);
            KCU.LIZ(LiveMode.VIDEO, "video_widget_new");
        }
        if (this.LJFF.isMediaRoom()) {
            str = "media";
        }
        C42T c42t = new C42T();
        c42t.LIZ(LJJI());
        c42t.LIZ(true);
        c42t.LIZIZ(this.LJFF.isMediaRoom());
        c42t.LIZ(str);
        c42t.LIZ(C90651LnZ.LIZ(LIZJ, LJJI()));
        c42t.LIZIZ(this.LJFF.getOwnerUserId());
        IMessageManager LIZ6 = C100980Ppm.LIZ(getContext(), c42t.LIZ());
        this.LJIILJJIL.put("data_message_manager", LIZ6);
        LIZJ.LJIILLIIL().LIZIZ(LIZ6);
        ((IAnchorAudienceMsgService) ServiceManager.getService(IAnchorAudienceMsgService.class)).mo25451createAnchorAudienceMsgChannel(this.LJIILJJIL, LJJIFFI(), true, this.LJFF);
        C77108Gac.LIZ(this.LJFF.getRoomId());
        LJIIJ();
        this.LJIJI = new PixAutoWearPropWidget();
        this.LJIILIIL.load(this.LJIJI);
        if (LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SEI_SIGN.getValue().booleanValue()) {
            this.LJIJJLI = new MsSeiSignWidget(LJJIFFI());
            this.LJIJJLI.setRoomContext(LIZJ);
            this.LJIILIIL.load(this.LJIJJLI);
        }
        Room room5 = this.LJFF;
        if (room5 != null && !room5.isLiveTypeAudio()) {
            this.LJIILIIL.load(new MagicGestureActivityAnchorWidget(LJJIFFI()));
        }
    }

    public static C2995dh LIZ(K06 k06, K2Z k2z, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{k06, k2z, bundle}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (C2995dh) proxy.result;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        C2995dh c2995dh = new C2995dh();
        c2995dh.setArguments(bundle2);
        c2995dh.LJI = k06;
        c2995dh.LJII = k06.LJFF();
        c2995dh.f25814LJ = k2z;
        return c2995dh;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View LIZ2 = C116971W2r.LIZ(layoutInflater, 2131699196, viewGroup, false);
        C91264LxS.LIZJ.LIZ(getActivity());
        return LIZ2;
    }

    @Override // com.bytedance.android.live.pushstream.report.AbstractC5443b
    public final void LIZ(int i, boolean z, int i2, Throwable th) {
        LiveStreamManager liveStreamManager;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), th}, this, LIZ, false, 37).isSupported && (liveStreamManager = this.LJJIJIIJI) != null) {
            liveStreamManager.LIZ(i, z, i2, th);
        }
    }
}
