package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xelement.alphavideo.C13171d;
import com.bytedance.ies.xelement.api.IXResourceLoader;
import com.bytedance.ies.xelement.api.XResourceFrom;
import com.bytedance.ies.xelement.api.XResourceLoadInfo;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.gson.JsonSyntaxException;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.p1543ui.image.ImageUrlRedirectUtils;
import com.lynx.tasm.behavior.p1543ui.view.UISimpleView;
import com.lynx.tasm.event.EventsListener;
import com.p1594ss.android.socialbase.downloader.downloader.BaseDownloader;
import com.p1594ss.android.socialbase.downloader.model.DownloadTask;
import com.p1594ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.p1594ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.p1594ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.p1594ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.p1594ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.umeng.message.proguard.C34037f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3059io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC109415T6b;
import p003X.AbstractC90419Ljp;
import p003X.C100824PnG;
import p003X.C106862S5w;
import p003X.C109358T3w;
import p003X.C109414T6a;
import p003X.C115867VjJ;
import p003X.C116971W2r;
import p003X.C130291apg;
import p003X.C149032fik;
import p003X.C149034fim;
import p003X.C149036fio;
import p003X.C149042fiu;
import p003X.C149135fkQ;
import p003X.C149136fkR;
import p003X.C149139fkU;
import p003X.C149141fkW;
import p003X.C149144fkZ;
import p003X.C149146fkb;
import p003X.C149147fkc;
import p003X.CallableC149039fir;
import p003X.CallableC149040fis;
import p003X.CallableC149047fj0;
import p003X.T46;

/* renamed from: com.bytedance.android.live.lynx.ui.LiveLynxAlphaPlayer */
/* loaded from: classes20.dex */
public final class LiveLynxAlphaPlayer extends UISimpleView<C5163f> {
    public static final C149147fkc Companion = new C149147fkc((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public DataSource mDataSource;
    public boolean mIsLoop;
    public boolean mKeepLastFrame;
    public Bitmap mLastFrame;
    public IPlayerController mPlayerController;
    public IXResourceLoader<XResourceLoadInfo> mResourceLoader;
    public final C130291apg monitor;
    public XResourceFrom resourceFrom;
    public Set<String> supportedEvents;
    public boolean useResourceImg;
    public boolean mAutoPlay = true;
    public String mResourceURL = "";
    public final List<Integer> trackedMSArray = new ArrayList();
    public final List<Integer> trackedMSSentArray = new ArrayList();
    public int mTotalMilliseconds = -1;

    static {
        Covode.recordClassIndex(32325);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.UIGroup, com.lynx.tasm.behavior.p1543ui.LynxUI, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22).isSupported) {
            return;
        }
        super.onDetach();
        IPlayerController iPlayerController = this.mPlayerController;
        if (iPlayerController != null) {
            iPlayerController.detachAlphaView((ViewGroup) this.mView);
        }
    }

    private final void clearAlphaVideoStatus() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28).isSupported) {
            return;
        }
        IPlayerController iPlayerController = this.mPlayerController;
        if (iPlayerController != null) {
            iPlayerController.detachAlphaView((ViewGroup) this.mView);
        }
        this.mDataSource = null;
        this.mResourceURL = "";
    }

    private final JavaOnlyMap getCommonSuccessRes() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (JavaOnlyMap) proxy.result;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("success", true);
        javaOnlyMap.putMap(C2521l.LJIIL, new JavaOnlyMap());
        return javaOnlyMap;
    }

    @Override // com.lynx.tasm.behavior.p1543ui.UIGroup, com.lynx.tasm.behavior.p1543ui.LynxUI, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void destroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32).isSupported) {
            return;
        }
        super.destroy();
        IPlayerController iPlayerController = this.mPlayerController;
        if (iPlayerController != null) {
            iPlayerController.detachAlphaView((ViewGroup) this.mView);
        }
        IPlayerController iPlayerController2 = this.mPlayerController;
        if (iPlayerController2 != null) {
            iPlayerController2.withVideoAction(null);
        }
        IPlayerController iPlayerController3 = this.mPlayerController;
        if (iPlayerController3 != null) {
            iPlayerController3.setMonitor(null);
        }
        this.mPlayerController = null;
        ((C5163f) this.mView).setMPoster(null);
        ((C5163f) this.mView).setMLastFrame(null);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.UIGroup, com.lynx.tasm.behavior.p1543ui.LynxUI, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void onAttach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        super.onAttach();
        IPlayerController iPlayerController = this.mPlayerController;
        if (iPlayerController != null && this.mAutoPlay) {
            iPlayerController.attachAlphaView((ViewGroup) this.mView);
        }
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void onLayoutUpdated() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        super.onLayoutUpdated();
        IPlayerController iPlayerController = this.mPlayerController;
        if (iPlayerController != null && (view = iPlayerController.getView()) != null) {
            view.layout(0, 0, getWidth(), getHeight());
        }
    }

    @LynxProp(defaultBoolean = true, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        this.mAutoPlay = z;
        T t = this.mView;
        if (t != 0) {
            ((C13171d) t).setMAutoPlay(z);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.xelement.alphavideo.LynxAlphaVideoView");
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void setEvents(Map<String, EventsListener> map) {
        Set<String> set;
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        super.setEvents(map);
        if (map != null) {
            set = map.keySet();
        } else {
            set = null;
        }
        this.supportedEvents = set;
    }

    @LynxProp(defaultBoolean = false, name = "keep-last-frame")
    public final void setKeepLastFrame(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 9).isSupported && this.mKeepLastFrame != z) {
            DataSource dataSource = this.mDataSource;
            if (dataSource != null) {
                dataSource.setAutoRelease(!z ? 1 : 0);
            }
            this.mKeepLastFrame = z;
        }
    }

    @LynxProp(name = "last-frame")
    public final void setLastFrame(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        new C115867VjJ(new CallableC149040fis(this, str)).LIZ(new C149135fkQ(this)).LIZIZ(new C149042fiu(this, str));
    }

    @LynxProp(defaultBoolean = false, name = "loop")
    public final void setLoop(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        this.mIsLoop = z;
        DataSource dataSource = this.mDataSource;
        if (dataSource != null) {
            dataSource.setLoop(z);
        }
    }

    @LynxProp(name = "poster")
    public final void setPoster(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        new C115867VjJ(new CallableC149039fir(this, str)).LIZ(new C149136fkR(this)).LIZIZ(new C149034fim(this, str));
    }

    @LynxProp(name = "src")
    public final void setSrc(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported || TextUtils.isEmpty(str)) {
            return;
        }
        clearAlphaVideoStatus();
        String decode = URLDecoder.decode(ImageUrlRedirectUtils.redirectUrl(getLynxContext(), str), C34037f.f43302f);
        Intrinsics.checkNotNullExpressionValue(decode, "");
        this.mResourceURL = decode;
        IXResourceLoader<XResourceLoadInfo> iXResourceLoader = this.mResourceLoader;
        if (iXResourceLoader != null) {
            this.resourceFrom = null;
            iXResourceLoader.loadResource(decode, new LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$1(this, decode), new LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$2(this, decode));
            return;
        }
        legacySetSrc(decode);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public final C5163f mo29230createView(Context context) {
        IPlayerController iPlayerController;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C5163f) proxy.result;
        }
        C5163f c5163f = new C5163f(context);
        Configuration configuration = new Configuration();
        configuration.setContext(context);
        configuration.setLifecycleOwner(c5163f);
        configuration.setAlphaVideoViewType(1);
        C149139fkU c149139fkU = new C149139fkU(this);
        C149032fik c149032fik = new C149032fik(this);
        try {
            IService service = ServiceManager.getService(AbstractC90419Ljp.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            iPlayerController = ((AbstractC90419Ljp) service).getCommonPlayerControllerManager().LIZ(context);
        } catch (Exception e) {
            handleErrorMsg("init CustomPlayerImpl failed and try to use DefaultSystemPlayer, the exception is " + e, this.mResourceURL, -10);
            iPlayerController = PlayerController.get(configuration, new DefaultSystemPlayer());
        }
        this.mPlayerController = iPlayerController;
        IPlayerController iPlayerController2 = this.mPlayerController;
        if (iPlayerController2 != null) {
            iPlayerController2.withVideoAction(c149139fkU);
        }
        IPlayerController iPlayerController3 = this.mPlayerController;
        if (iPlayerController3 != null) {
            iPlayerController3.setMonitor(c149032fik);
        }
        IPlayerController iPlayerController4 = this.mPlayerController;
        if (iPlayerController4 != null) {
            iPlayerController4.setProgressListener(new C149144fkZ(this), 5L);
        }
        return c5163f;
    }

    public final DataSource applyConfig(String str) {
        MethodCollector.m14708i(2126);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            DataSource dataSource = (DataSource) proxy.result;
            MethodCollector.m14707o(2126);
            return dataSource;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str + "config.json"));
        try {
            BufferedReader bufferedReader2 = bufferedReader;
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            CloseableKt.closeFinally(bufferedReader, null);
            try {
                C149146fkb c149146fkb = (C149146fkb) GsonProtectorUtils.fromJson(C100824PnG.LIZ(), sb.toString(), (Class<Object>) C149146fkb.class);
                if (c149146fkb != null) {
                    DataSource dataSource2 = new DataSource();
                    if (c149146fkb.LIZ != null) {
                        DataSource.DataInfo scaleType = new DataSource.DataInfo(str + c149146fkb.LIZ.LIZ).setScaleType(c149146fkb.LIZ.LIZIZ);
                        scaleType.setVersion(c149146fkb.LIZ.LIZJ);
                        scaleType.setTotalFrame(c149146fkb.LIZ.LIZLLL);
                        scaleType.setVideoWidth(c149146fkb.LIZ.LJI);
                        scaleType.setVideoHeight(c149146fkb.LIZ.LJII);
                        scaleType.setActualWidth(c149146fkb.LIZ.f20003LJ);
                        scaleType.setActualHeight(c149146fkb.LIZ.LJFF);
                        DataSource.DataInfo rgbArea = scaleType.setAlphaArea(c149146fkb.LIZ.LJIIIIZZ).setRgbArea(c149146fkb.LIZ.LJIIIZ);
                        rgbArea.setMasks(c149146fkb.LIZ.LJIIJ);
                        dataSource2.setPortraitDataInfo(rgbArea);
                    }
                    if (c149146fkb.LIZIZ != null) {
                        DataSource.DataInfo scaleType2 = new DataSource.DataInfo(str + c149146fkb.LIZIZ.LIZ).setScaleType(c149146fkb.LIZIZ.LIZIZ);
                        scaleType2.setVersion(c149146fkb.LIZIZ.LIZJ);
                        scaleType2.setTotalFrame(c149146fkb.LIZIZ.LIZLLL);
                        scaleType2.setVideoWidth(c149146fkb.LIZIZ.LJI);
                        scaleType2.setVideoHeight(c149146fkb.LIZIZ.LJII);
                        scaleType2.setActualWidth(c149146fkb.LIZIZ.f20003LJ);
                        scaleType2.setActualHeight(c149146fkb.LIZIZ.LJFF);
                        DataSource.DataInfo rgbArea2 = scaleType2.setAlphaArea(c149146fkb.LIZIZ.LJIIIIZZ).setRgbArea(c149146fkb.LIZIZ.LJIIIZ);
                        rgbArea2.setMasks(c149146fkb.LIZIZ.LJIIJ);
                        dataSource2.setLandscapeDataInfo(rgbArea2);
                    }
                    if (Intrinsics.areEqual(getProps().get("keep-last-frame"), Boolean.TRUE)) {
                        dataSource2.setAutoRelease(false);
                    }
                    if (Intrinsics.areEqual(getProps().get("loop"), Boolean.TRUE)) {
                        dataSource2.setLoop(true);
                    }
                    MethodCollector.m14707o(2126);
                    return dataSource2;
                }
            } catch (JsonSyntaxException e) {
                handleErrorMsg("parse config.json failed, error msg is " + e, this.mResourceURL, -3);
            }
            handleErrorMsg("fileModel is null", this.mResourceURL, -14);
            MethodCollector.m14707o(2126);
            return null;
        } finally {
        }
    }

    public final void legacySetSrc(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        try {
            this.useResourceImg = false;
            LLog.m10232i("x-alpha-video", "legacySetSrc, directUrl is " + str);
            if (str != null) {
                Uri parse = Uri.parse(str);
                this.mDataSource = null;
                Intrinsics.checkNotNullExpressionValue(parse, "");
                String scheme = parse.getScheme();
                if (scheme == null) {
                    return;
                }
                int hashCode = scheme.hashCode();
                if (hashCode != 3143036) {
                    if (hashCode != 3213448) {
                        if (hashCode != 99617003 || !scheme.equals("https")) {
                            return;
                        }
                    } else if (!scheme.equals("http")) {
                        return;
                    }
                    if (StringsKt__StringsJVMKt.endsWith$default(str, ".zip", false, 2, null)) {
                        DownloadTask name = BaseDownloader.with(getLynxContext()).url(str).name(parse.getLastPathSegment());
                        LynxContext lynxContext = getLynxContext();
                        Intrinsics.checkNotNullExpressionValue(lynxContext, "");
                        Context applicationContext = lynxContext.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                        File LIZIZ = C116971W2r.LIZIZ(applicationContext);
                        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
                        name.savePath(LIZIZ.getAbsolutePath()).mainThreadListener(new T46(this, str, parse)).download();
                        return;
                    }
                    handleErrorMsg("resource type is not support", this.mResourceURL, -13);
                } else if (scheme.equals("file")) {
                    try {
                        this.mDataSource = applyConfig(parse.getPath() + '/');
                        sendEvent("ready", getVideoEventParams(1, "load resource success", null));
                        if (this.mDataSource != null && this.mAutoPlay) {
                            IPlayerController iPlayerController = this.mPlayerController;
                            if (iPlayerController != null) {
                                iPlayerController.attachAlphaView((ViewGroup) this.mView);
                            }
                            IPlayerController iPlayerController2 = this.mPlayerController;
                            if (iPlayerController2 != null) {
                                iPlayerController2.start(this.mDataSource);
                            }
                        }
                    } catch (Exception e) {
                        handleErrorMsg("parse config.json failed, resource is " + str + ", error msg is " + e, this.mResourceURL, -3);
                    }
                }
            }
        } catch (Exception e2) {
            LLog.m10233e("x-alpha-video", e2.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxAlphaPlayer(LynxContext lynxContext, String str) {
        super(lynxContext);
        C106862S5w.LIZ(lynxContext, str);
        this.monitor = new C130291apg(str);
    }

    public final void resolveResAndTryPlay(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        new C115867VjJ(new CallableC149047fj0(this, str, str2)).LIZ(new C149141fkW(this)).LIZIZ(new C149036fio(this));
    }

    public final void sendEvent(String str, Map<String, Object> map) {
        Set<String> set;
        LynxContext lynxContext;
        EventEmitter eventEmitter;
        if (!PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 24).isSupported && (set = this.supportedEvents) != null && set.contains(str) && (lynxContext = getLynxContext()) != null && (eventEmitter = lynxContext.getEventEmitter()) != null) {
            eventEmitter.sendCustomEvent(new C109358T3w(this, map, str, getSign(), str));
        }
    }

    @LynxUIMethod
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        int i;
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap, callback);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && this.mPlayerController != null) {
            try {
                javaOnlyMap.putBoolean("success", true);
                IPlayerController iPlayerController = this.mPlayerController;
                if (iPlayerController != null) {
                    i = iPlayerController.getDuration();
                } else {
                    i = 0;
                }
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.putInt("duration", i);
                javaOnlyMap.putMap(C2521l.LJIIL, javaOnlyMap2);
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @LynxUIMethod
    public final void isPlaying(ReadableMap readableMap, Callback callback) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap, callback);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && this.mPlayerController != null) {
            try {
                javaOnlyMap.putBoolean("success", true);
                IPlayerController iPlayerController = this.mPlayerController;
                if (iPlayerController != null && iPlayerController.isPlaying()) {
                    z = true;
                } else {
                    z = false;
                }
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.putBoolean("isPlaying", z);
                javaOnlyMap.putMap(C2521l.LJIIL, javaOnlyMap2);
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @LynxUIMethod
    public final void pause(ReadableMap readableMap, Callback callback) {
        IPlayerController iPlayerController;
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap, callback);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (iPlayerController = this.mPlayerController) != null) {
            try {
                iPlayerController.pause();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @LynxUIMethod
    public final void release(ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap, callback);
        JavaOnlyMap commonSuccessRes = getCommonSuccessRes();
        if (this.mView != 0 && this.mPlayerController != null) {
            try {
                callback.invoke(0, commonSuccessRes);
                return;
            } catch (Exception e) {
                commonSuccessRes.putString("message:", e.getMessage());
                callback.invoke(1, commonSuccessRes);
                return;
            }
        }
        commonSuccessRes.putString("message", "view is not exist");
        callback.invoke(1, commonSuccessRes);
    }

    public final void requestBitmapSync(String str, AbstractC109415T6b abstractC109415T6b) {
        if (PatchProxy.proxy(new Object[]{str, abstractC109415T6b}, this, changeQuickRedirect, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC109415T6b);
        String redirectUrl = ImageUrlRedirectUtils.redirectUrl(getLynxContext(), str);
        Intrinsics.checkNotNullExpressionValue(redirectUrl, "");
        com.facebook.datasource.DataSource<CloseableReference<CloseableImage>> fetchDecodedImage = Fresco.getImagePipeline().fetchDecodedImage(ImageRequestBuilder.newBuilderWithSource(Uri.parse(redirectUrl)).build(), "x-alpha-video");
        if (fetchDecodedImage == null) {
            abstractC109415T6b.LIZ();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C109414T6a c109414T6a = new C109414T6a(abstractC109415T6b, countDownLatch, fetchDecodedImage);
        fetchDecodedImage.subscribe(c109414T6a, CallerThreadExecutor.getInstance());
        try {
            if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                c109414T6a.onFailure(fetchDecodedImage);
            }
        } catch (InterruptedException unused) {
            c109414T6a.onFailure(fetchDecodedImage);
        }
    }

    @LynxUIMethod
    public final void resume(ReadableMap readableMap, Callback callback) {
        IPlayerController iPlayerController;
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap, callback);
        JavaOnlyMap commonSuccessRes = getCommonSuccessRes();
        if (this.mView != 0 && (iPlayerController = this.mPlayerController) != null && !iPlayerController.isPlaying()) {
            try {
                IPlayerController iPlayerController2 = this.mPlayerController;
                if (iPlayerController2 != null) {
                    iPlayerController2.attachAlphaView((ViewGroup) this.mView);
                }
                IPlayerController iPlayerController3 = this.mPlayerController;
                if (iPlayerController3 != null) {
                    iPlayerController3.resume();
                }
                callback.invoke(0, commonSuccessRes);
                return;
            } catch (Exception e) {
                commonSuccessRes.putString("message:", e.getMessage());
                callback.invoke(1, commonSuccessRes);
                return;
            }
        }
        commonSuccessRes.putString("message", "view is not exist");
        callback.invoke(1, commonSuccessRes);
    }

    @LynxUIMethod
    public final void stop(ReadableMap readableMap, Callback callback) {
        IPlayerController iPlayerController;
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap, callback);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (iPlayerController = this.mPlayerController) != null) {
            try {
                iPlayerController.stop();
                callback.invoke(0, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @LynxUIMethod
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap);
        int i = readableMap.getInt("ms");
        if (this.trackedMSArray.contains(Integer.valueOf(i))) {
            this.trackedMSArray.remove(Integer.valueOf(i));
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, i + " milliseconds is not subscribed");
        }
    }

    @LynxUIMethod
    public final void play(ReadableMap readableMap, Callback callback) {
        IPlayerController iPlayerController;
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap, callback);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != 0 && (iPlayerController = this.mPlayerController) != null) {
            try {
                if (!iPlayerController.isPlaying() && this.mDataSource != null) {
                    IPlayerController iPlayerController2 = this.mPlayerController;
                    if (iPlayerController2 != null) {
                        iPlayerController2.attachAlphaView((ViewGroup) this.mView);
                    }
                    IPlayerController iPlayerController3 = this.mPlayerController;
                    if (iPlayerController3 != null) {
                        iPlayerController3.start(this.mDataSource);
                    }
                    callback.invoke(0, javaOnlyMap);
                    return;
                }
                callback.invoke(1, javaOnlyMap);
                return;
            } catch (Exception e) {
                javaOnlyMap.putString("message:", e.getMessage());
                callback.invoke(1, javaOnlyMap);
                return;
            }
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @LynxUIMethod
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{readableMap, callback}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap);
        int i = readableMap.getInt("ms");
        LLog.m10232i("x-alpha-video", "subscribeUpdateEvent: " + i);
        if (!this.trackedMSArray.contains(Integer.valueOf(i))) {
            this.trackedMSArray.add(Integer.valueOf(i));
            List<Integer> list = this.trackedMSArray;
            if (list.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator<T>() { // from class: X.1aj
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(32347);
                    }

                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t, t2}, this, LIZ, false, 1);
                        if (proxy.isSupported) {
                            return ((Integer) proxy.result).intValue();
                        }
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Number) t).intValue()), Integer.valueOf(((Number) t2).intValue()));
                    }
                });
            }
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, "already subscribeUpdateEvent with " + i + " milliseconds");
        }
    }

    public final Map<String, Object> getVideoEventParams(int i, String str, JavaOnlyMap javaOnlyMap) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, javaOnlyMap}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C2521l.LJIIJ, Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        if (javaOnlyMap != null) {
            linkedHashMap.put(C2521l.LJIIL, javaOnlyMap);
        }
        return linkedHashMap;
    }

    public final void handleErrorMsg(String str, String str2, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 29).isSupported) {
            return;
        }
        sendEvent("error", getVideoEventParams(i, str, null));
        this.monitor.LIZ(str2, str, i);
        LLog.m10233e("x-alpha-video", str);
    }
}
