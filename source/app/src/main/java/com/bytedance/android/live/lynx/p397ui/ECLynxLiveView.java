package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.platform.IHostAction;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.roomplayer.AbstractC9685d;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerClient;
import com.bytedance.android.livesdkapi.roomplayer.LivePlayerView;
import com.bytedance.android.livesdkapi.roomplayer.LiveRequest;
import com.bytedance.android.livesdkapi.roomplayer.PlayerClientType;
import com.bytedance.android.livesdkapi.view.IRenderView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.drawable.ScalingUtils;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.p1543ui.LynxUI;
import com.lynx.tasm.event.LynxDetailEvent;
import com.lynx.tasm.p1544ui.image.FrescoImageView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C145438emi;
import p003X.C458694Bz;
import p003X.KM9;
import p003X.RunnableC145426emW;
import p003X.RunnableC145427emX;
import p003X.RunnableC145428emY;
import p003X.RunnableC145432emc;
import p003X.RunnableC145433emd;
import p003X.RunnableC145434eme;
import p003X.TSM;

/* renamed from: com.bytedance.android.live.lynx.ui.ECLynxLiveView */
/* loaded from: classes19.dex */
public final class ECLynxLiveView extends LynxUI<C5162e> implements View.OnAttachStateChangeListener, AbstractC4569445g {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static AbstractDraweeControllerBuilder<?, ?, ?, ?> mDraweeControllerBuilder;
    public volatile boolean muteTemp;
    public volatile String posterTemp;
    public FrescoImageView posterView;
    public volatile String qualitiesTemp;
    public volatile Room room;
    public volatile String streamData;
    public volatile String streamDataTemp;
    public static final C145438emi Companion = new C145438emi((byte) 0);
    public static long fakeRoomId = 1;
    public volatile String roomId = "0";
    public volatile boolean releasePlayerClient = true;
    public volatile boolean sharePlayerClientToOther = true;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onHostResume() {
        this.releasePlayerClient = true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            onHostDestroy();
        } else if (event != Lifecycle.Event.ON_RESUME) {
        } else {
            onHostResume();
        }
    }

    @LynxUIMethod
    public final void sharePlayerToInner() {
        this.releasePlayerClient = false;
        this.sharePlayerClientToOther = true;
    }

    static {
        Covode.recordClassIndex(32296);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void onDetach() {
        C5162e view;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        super.onDetach();
        this.streamDataTemp = null;
        if (this.releasePlayerClient && (view = getView()) != null && (playerView$livehybrid_impl_cnDouyinRelease = view.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
            client.release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onHostDestroy() {
        Lifecycle mo29786getLifecycle;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        LynxContext lynxContext = getLynxContext();
        if (!(lynxContext instanceof LifecycleOwner)) {
            lynxContext = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) lynxContext;
        if (lifecycleOwner != null && (mo29786getLifecycle = lifecycleOwner.mo29786getLifecycle()) != null) {
            mo29786getLifecycle.removeObserver(this);
        }
        getView().removeOnAttachStateChangeListener(this);
    }

    public ECLynxLiveView(LynxContext lynxContext) {
        super(lynxContext);
    }

    @LynxUIMethod
    public final void play(ReadableMap readableMap) {
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        startPlay(this.streamDataTemp);
    }

    @LynxProp(name = "share-player")
    public final void setSharePlayer(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 8).isSupported && bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.releasePlayerClient = !booleanValue;
            this.sharePlayerClientToOther = booleanValue;
        }
    }

    private final Room parseRoom(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        if (str != null && str.length() != 0) {
            return (Room) GsonProtectorUtils.fromJson(KM9.LIZ(), str, new TSM().getType());
        }
        return null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        this.releasePlayerClient = true;
        if (this.streamDataTemp != null) {
            handlePoster$default(this, false, 1, null);
            startPlay(this.streamDataTemp);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C5162e view2;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 18).isSupported && this.releasePlayerClient && (view2 = getView()) != null && (playerView$livehybrid_impl_cnDouyinRelease = view2.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
            client.release();
        }
    }

    @LynxUIMethod
    public final void pause(ReadableMap readableMap) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C5162e view = getView();
        if (view != null && (playerView$livehybrid_impl_cnDouyinRelease = view.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
            client.stop();
        }
        handlePoster$default(this, false, 1, null);
    }

    @LynxProp(name = "liveData")
    public final void setLiveData(String str) {
        Room parseRoom;
        String str2;
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 11).isSupported && (parseRoom = parseRoom(str)) != null) {
            this.room = parseRoom;
            StreamUrl streamUrl = parseRoom.getStreamUrl();
            if (streamUrl != null) {
                str2 = streamUrl.LJII();
            } else {
                str2 = null;
            }
            setStreamData(str2);
            setRoomId(String.valueOf(parseRoom.getRoomId()));
        }
    }

    @LynxProp(name = "objectfit")
    public final void setObjectfit(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C5162e view = getView();
            if (view != null) {
                view.post(new RunnableC145432emc(this, str));
                return;
            }
            return;
        }
        handleObjectfit(str);
    }

    @LynxProp(name = "poster")
    public final void setPoster(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.posterTemp = str;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C5162e view = getView();
            if (view != null) {
                view.post(new RunnableC145433emd(this));
                return;
            }
            return;
        }
        handlePoster$default(this, false, 1, null);
    }

    @LynxProp(name = "room-id")
    public final void setRoomId(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        if (str == null) {
            long j = fakeRoomId;
            fakeRoomId = 1 + j;
            str = String.valueOf(j);
        }
        this.roomId = str;
    }

    @LynxProp(name = "streamData")
    public final void setStreamData(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C5162e view = getView();
            if (view != null) {
                view.post(new RunnableC145434eme(this, str));
            }
        } else {
            startPlay(str);
        }
        this.streamData = str;
    }

    @LynxUIMethod
    public final void stop(ReadableMap readableMap) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C5162e view = getView();
        if (view != null && (playerView$livehybrid_impl_cnDouyinRelease = view.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
            client.stop();
        }
        handlePoster$default(this, false, 1, null);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public final C5162e mo29230createView(Context context) {
        Lifecycle mo29786getLifecycle;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C5162e) proxy.result;
        }
        C106862S5w.LIZ(context);
        if (mDraweeControllerBuilder == null) {
            mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        }
        this.posterView = new FrescoImageView(context, mDraweeControllerBuilder, null, null);
        C5162e c5162e = new C5162e(context, null, 0, 6);
        if (!(context instanceof LifecycleOwner)) {
            context = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) context;
        if (lifecycleOwner != null && (mo29786getLifecycle = lifecycleOwner.mo29786getLifecycle()) != null) {
            mo29786getLifecycle.addObserver(this);
        }
        c5162e.addOnAttachStateChangeListener(this);
        c5162e.addView(this.posterView, new ViewGroup.LayoutParams(-1, -1));
        return c5162e;
    }

    public final void handlePoster(boolean z) {
        C5162e view;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        if (z) {
            FrescoImageView frescoImageView = this.posterView;
            if (frescoImageView != null) {
                frescoImageView.setVisibility(8);
                return;
            }
            return;
        }
        FrescoImageView frescoImageView2 = this.posterView;
        if (frescoImageView2 != null) {
            frescoImageView2.setSrc(this.posterTemp);
        }
        if (!TextUtils.isEmpty(this.posterTemp) && (view = getView()) != null && (playerView$livehybrid_impl_cnDouyinRelease = view.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null && !client.isPlaying()) {
            FrescoImageView frescoImageView3 = this.posterView;
            if (frescoImageView3 != null) {
                frescoImageView3.setVisibility(0);
                return;
            }
            return;
        }
        FrescoImageView frescoImageView4 = this.posterView;
        if (frescoImageView4 != null) {
            frescoImageView4.setVisibility(8);
        }
    }

    @LynxProp(name = "mute")
    public final void setMute(Boolean bool) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease2;
        ILivePlayerClient client2;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C5162e view = getView();
            if (view != null) {
                view.post(new RunnableC145428emY(this, bool));
            }
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            C5162e view2 = getView();
            if (view2 != null && (playerView$livehybrid_impl_cnDouyinRelease2 = view2.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client2 = playerView$livehybrid_impl_cnDouyinRelease2.getClient()) != null) {
                client2.mute();
            }
        } else {
            C5162e view3 = getView();
            if (view3 != null && (playerView$livehybrid_impl_cnDouyinRelease = view3.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
                client.unmute();
            }
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        this.muteTemp = z;
    }

    @LynxProp(name = "qualities")
    public final void setQualities(String str) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.qualitiesTemp = str;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C5162e view = getView();
            if (view != null) {
                view.post(new RunnableC145427emX(this, str));
                return;
            }
            return;
        }
        C5162e view2 = getView();
        if (view2 != null && (playerView$livehybrid_impl_cnDouyinRelease = view2.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
            if (str == null) {
                str = "";
            }
            client.switchResolution(str);
        }
    }

    @LynxProp(defaultDouble = 0.0d, name = "volume")
    public final void setVolume(float f) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C5162e view = getView();
            if (view != null) {
                view.post(new RunnableC145426emW(this, f));
                return;
            }
            return;
        }
        C5162e view2 = getView();
        if (view2 != null && (playerView$livehybrid_impl_cnDouyinRelease = view2.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
            client.setPlayerVolume(f);
        }
    }

    @LynxUIMethod
    public final void enterRoom(ReadableMap readableMap) {
        String str;
        HashMap<String, String> hashMap;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 15).isSupported || this.room == null) {
            return;
        }
        C5162e view = getView();
        if (view != null && (playerView$livehybrid_impl_cnDouyinRelease = view.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null) {
            client.setShouldDestroy(false);
        }
        Bundle bundle = new Bundle();
        Room room = this.room;
        if (room != null) {
            bundle.putString("live.intent.extra.PULL_STREAM_DATA", room.getCompoundStreamData(true));
            bundle.putString("live.intent.extra.PULL_SHARE_URL", room.getCompoundStreamData(true));
            StreamUrl streamUrl = room.getStreamUrl();
            if (streamUrl == null || (hashMap = streamUrl.sdkParamsMap) == null || (str = hashMap.toString()) == null) {
                str = "";
            }
            bundle.putString("live.intent.extra.PULL_SDK_PARAMS", str);
            bundle.putString("live.intent.extra.PULL_DEFAULT_RESOLUTION", room.getMultiStreamDefaultQualitySdkKey());
            bundle.putBoolean("enter_preview_smooth", true);
            bundle.putLong("live.intent.extra.ROOM_ID", room.getId());
            if (readableMap != null) {
                HashMap<String, Object> hashMap2 = readableMap.toHashMap();
                Intrinsics.checkNotNullExpressionValue(hashMap2, "");
                for (Map.Entry<String, Object> entry : hashMap2.entrySet()) {
                    if (entry.getValue() instanceof JavaOnlyMap) {
                        bundle.putString(entry.getKey(), GsonProtectorUtils.toJson(KM9.LIZ(), entry.getValue()));
                    } else {
                        bundle.putString(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
            sharePlayerToInner();
            ((IHostAction) ServiceManager.getService(IHostAction.class)).enterRoom(getLynxContext(), bundle, this.room);
        }
    }

    public final void handleObjectfit(String str) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease2;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease3;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1183789060) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str.equals("contain")) {
                        C5162e view = getView();
                        if (view != null && (playerView$livehybrid_impl_cnDouyinRelease3 = view.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null) {
                            playerView$livehybrid_impl_cnDouyinRelease3.setScaleType(1);
                        }
                        FrescoImageView frescoImageView = this.posterView;
                        if (frescoImageView != null) {
                            frescoImageView.setScaleType(ScalingUtils.ScaleType.FIT_CENTER);
                        }
                    }
                } else if (str.equals("cover")) {
                    C5162e view2 = getView();
                    if (view2 != null && (playerView$livehybrid_impl_cnDouyinRelease2 = view2.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null) {
                        playerView$livehybrid_impl_cnDouyinRelease2.setScaleType(2);
                    }
                    FrescoImageView frescoImageView2 = this.posterView;
                    if (frescoImageView2 != null) {
                        frescoImageView2.setScaleType(ScalingUtils.ScaleType.CENTER_CROP);
                    }
                }
            } else if (str.equals("inside")) {
                C5162e view3 = getView();
                if (view3 != null && (playerView$livehybrid_impl_cnDouyinRelease = view3.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null) {
                    playerView$livehybrid_impl_cnDouyinRelease.setScaleType(0);
                }
                FrescoImageView frescoImageView3 = this.posterView;
                if (frescoImageView3 != null) {
                    frescoImageView3.setScaleType(ScalingUtils.ScaleType.CENTER_INSIDE);
                }
            }
        }
        handlePoster$default(this, false, 1, null);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [byte, boolean] */
    public final void startPlay(String str) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        IRenderView renderView;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease2;
        ILivePlayerClient client;
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease3;
        ILivePlayerClient client2;
        ViewParent viewParent;
        C458694Bz c458694Bz;
        ILivePlayerClient client3;
        MethodCollector.m14708i(2124);
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22).isSupported) {
            MethodCollector.m14707o(2124);
            return;
        }
        C5162e view = getView();
        if (view != null) {
            String str2 = this.roomId;
            ?? r6 = this.sharePlayerClientToOther;
            if (!PatchProxy.proxy(new Object[]{str2, Byte.valueOf(r6 == true ? (byte) 1 : (byte) 0)}, view, C5162e.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(str2);
                if (str2.length() != 0 && !Intrinsics.areEqual("0", str2)) {
                    LivePlayerView livePlayerView = view.LIZIZ;
                    if (livePlayerView != null && (client3 = livePlayerView.getClient()) != null) {
                        client3.release();
                    }
                    LivePlayerView livePlayerView2 = view.LIZIZ;
                    if (livePlayerView2 != null) {
                        viewParent = livePlayerView2.getParent();
                    } else {
                        viewParent = null;
                    }
                    if (!(viewParent instanceof ViewGroup)) {
                        viewParent = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    if (Intrinsics.areEqual(viewGroup, view) && viewGroup != null) {
                        viewGroup.removeView(view.LIZIZ);
                    }
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    AbstractC9685d LIZ = AbstractC9685d.LIZLLL.LIZ("ec_immersive_preview");
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZ, str2, Byte.valueOf((byte) r6)}, view, C5162e.LIZ, false, 2);
                    if (proxy.isSupported) {
                        c458694Bz = (C458694Bz) proxy.result;
                    } else if (str2 == null) {
                        c458694Bz = new C458694Bz(LIZ, null, null, false, null, false, false, null, false, 0, false, 2046);
                    } else {
                        c458694Bz = new C458694Bz(LIZ, str2, PlayerClientType.NORMAL, r6, null, false, true, IRenderView.RenderViewType.KEEP_TEXTURE_RENDER_VIEW, false, 0, false, 1840);
                    }
                    view.LIZIZ = new LivePlayerView(context, c458694Bz);
                    LivePlayerView livePlayerView3 = view.LIZIZ;
                    if (livePlayerView3 != null) {
                        view.addView(livePlayerView3, -1, -1);
                    }
                }
            }
        }
        if (str != null && str.length() != 0) {
            this.streamDataTemp = str;
            LiveRequest.Builder builder = new LiveRequest.Builder();
            builder.mute(this.muteTemp);
            LiveRequest.Builder streamData = builder.streamData(str);
            String str3 = this.qualitiesTemp;
            if (str3 == null) {
                str3 = "";
            }
            LiveRequest build = streamData.LIZ(str3).build();
            C5162e view2 = getView();
            if (view2 != null && (playerView$livehybrid_impl_cnDouyinRelease3 = view2.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client2 = playerView$livehybrid_impl_cnDouyinRelease3.getClient()) != null) {
                client2.stream(build, new ECLynxLiveView$startPlay$1(this));
            }
            C5162e view3 = getView();
            if (view3 != null && (playerView$livehybrid_impl_cnDouyinRelease = view3.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (renderView = playerView$livehybrid_impl_cnDouyinRelease.getRenderView()) != null) {
                C5162e view4 = getView();
                if (view4 != null && (playerView$livehybrid_impl_cnDouyinRelease2 = view4.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease2.getClient()) != null) {
                    client.bindRenderView(renderView);
                } else {
                    MethodCollector.m14707o(2124);
                    return;
                }
            }
            MethodCollector.m14707o(2124);
            return;
        }
        MethodCollector.m14707o(2124);
    }

    public final void sendCustomEvents(String str, Map<String, ? extends Object> map) {
        EventEmitter eventEmitter;
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        int sign = getSign();
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        LynxDetailEvent lynxDetailEvent = new LynxDetailEvent(sign, str, map);
        LynxContext lynxContext = getLynxContext();
        if (lynxContext != null && (eventEmitter = lynxContext.getEventEmitter()) != null) {
            eventEmitter.sendCustomEvent(lynxDetailEvent);
        }
    }

    public static /* synthetic */ void handlePoster$default(ECLynxLiveView eCLynxLiveView, boolean z, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{eCLynxLiveView, Byte.valueOf(b), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 21).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eCLynxLiveView.handlePoster(z);
    }

    public static /* synthetic */ void sendCustomEvents$default(ECLynxLiveView eCLynxLiveView, String str, Map map, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{eCLynxLiveView, str, map, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 24).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        eCLynxLiveView.sendCustomEvents(str, map);
    }
}
