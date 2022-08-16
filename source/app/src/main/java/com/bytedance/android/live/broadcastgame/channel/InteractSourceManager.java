package com.bytedance.android.live.broadcastgame.channel;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.channel.InteractSourceManager;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.LiveSdkInitHelper;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.gecko.g$b;
import com.bytedance.android.livesdk.gecko.g$f;
import com.bytedance.android.livesdk.gecko.m$a;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p1594ss.android.socialbase.downloader.downloader.BaseDownloader;
import com.p1594ss.android.socialbase.downloader.exception.BaseException;
import com.p1594ss.android.socialbase.downloader.model.DownloadInfo;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002O.C0002O;
import p003X.AbstractC88270KqG;
import p003X.AbstractC88271KqH;
import p003X.AbstractC88273KqJ;
import p003X.AbstractC88283KqT;
import p003X.AbstractC88287KqX;
import p003X.AbstractC88290Kqa;
import p003X.AbstractC88385Ks7;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C88268KqE;
import p003X.C88269KqF;
import p003X.C88280KqQ;
import p003X.C88288KqY;
import p003X.C88355Krd;
import p003X.C90963Lsb;
import p003X.LK5;

/* loaded from: classes5.dex */
public class InteractSourceManager implements IInteractSourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC88271KqH client;
    public C88288KqY delegateListener = new C88288KqY();
    public C88269KqF helper;
    public DataCenter mDataCenter;
    public String mEffectResourceDirectory;
    public AbstractC88290Kqa mLiveGeckoClient;
    public String mWGameVersion;

    static {
        Covode.recordClassIndex(19361);
    }

    public InteractSourceManager() {
        ServiceManager.registerService(IInteractSourceManager.class, this);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager$2 */
    /* loaded from: classes5.dex */
    public class C34172 implements AbstractC88287KqX {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(19365);
        }

        @Override // p003X.AbstractC88287KqX
        public final AbstractC88270KqG LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (AbstractC88270KqG) proxy.result;
            }
            return InteractSourceManager.this.createCDNClient(false);
        }

        @Override // p003X.AbstractC88287KqX
        public final AbstractC88283KqT LIZIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (AbstractC88283KqT) proxy.result;
            }
            if (LiveSdkInitHelper.isEnableLauncherOpt()) {
                C88355Krd.LIZ().LIZIZ();
            }
            return new AbstractC88283KqT(this) { // from class: X.KqS
                public static ChangeQuickRedirect LIZ;
                public final InteractSourceManager.C34172 LIZIZ;

                static {
                    Covode.recordClassIndex(19395);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // p003X.AbstractC88283KqT
                public final Observable LIZ(C3383p c3383p, g$f g_f, String str, int i) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c3383p, g_f, str, Integer.valueOf(i)}, this, LIZ, false, 1);
                    if (proxy2.isSupported) {
                        return (Observable) proxy2.result;
                    }
                    InteractSourceManager.C34172 c34172 = this.LIZIZ;
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{c3383p, g_f, str, Integer.valueOf(i)}, c34172, InteractSourceManager.C34172.LIZ, false, 4);
                    return proxy3.isSupported ? (Observable) proxy3.result : InteractSourceManager.this.mLiveGeckoClient.LIZ(g_f, false).flatMap(new Function(str) { // from class: X.KqR
                        public static ChangeQuickRedirect LIZ;
                        public final String LIZIZ;

                        static {
                            Covode.recordClassIndex(19396);
                        }

                        {
                            this.LIZIZ = str;
                        }

                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                            if (proxy4.isSupported) {
                                return proxy4.result;
                            }
                            String str2 = this.LIZIZ;
                            g$b g_b = (g$b) obj;
                            PatchProxyResult proxy5 = PatchProxy.proxy(new Object[]{str2, g_b}, null, InteractSourceManager.C34172.LIZ, true, 5);
                            return proxy5.isSupported ? proxy5.result : C88278KqO.LIZIZ.LIZ(g_b, str2);
                        }
                    });
                }
            };
        }

        @Override // p003X.AbstractC88287KqX
        public final AbstractC88271KqH LIZJ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            if (proxy.isSupported) {
                return (AbstractC88271KqH) proxy.result;
            }
            if (LiveSdkInitHelper.isEnableLauncherOpt()) {
                C88355Krd.LIZ().LIZIZ();
            }
            return InteractSourceManager.this.client;
        }

        public C34172() {
        }
    }

    public Context getContext() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Context) proxy.result;
        }
        return ((IHostContext) ServiceManager.getService(IHostContext.class)).context();
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager$1 */
    /* loaded from: classes5.dex */
    public class C34141 implements AbstractC88270KqG {
        public static ChangeQuickRedirect LIZ;
        public final /* synthetic */ long LIZIZ;

        static {
            Covode.recordClassIndex(19362);
        }

        public final String LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return new File(C116971W2r.LIZJ(InteractSourceManager.this.getContext()), "cdn").getAbsolutePath();
        }

        private String LIZIZ(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new File(LIZ(), DigestUtils.md5Hex(str)).getAbsolutePath();
        }

        @Override // p003X.AbstractC88270KqG
        public final Observable<g$b> LIZ(final String str) {
            boolean exists;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return (Observable) proxy.result;
            }
            if (TextUtils.isEmpty(str)) {
                return Observable.error(new FallBackUrlEmptyThrowable("url is empty"));
            }
            ALogger.m15797i("AAM.Source.InteractSourceManager", C0002O.m25086C("cdn client start: ", str));
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
            if (proxy2.isSupported) {
                exists = ((Boolean) proxy2.result).booleanValue();
            } else {
                String LIZIZ = LIZIZ(str);
                if (!TextUtils.isEmpty(LIZIZ)) {
                    exists = new File(LIZIZ).exists();
                }
                return Observable.create(new ObservableOnSubscribe<g$b>() { // from class: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager.1.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(19363);
                    }

                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(final ObservableEmitter<g$b> observableEmitter) {
                        if (PatchProxy.proxy(new Object[]{observableEmitter}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        String md5Hex = DigestUtils.md5Hex(str);
                        AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager.1.1.1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(19364);
                            }

                            @Override // com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p1594ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onProgress(DownloadInfo downloadInfo) {
                                if (PatchProxy.proxy(new Object[]{downloadInfo}, this, LIZ, false, 2).isSupported) {
                                    return;
                                }
                                super.onProgress(downloadInfo);
                                observableEmitter.onNext(new C88280KqQ(downloadInfo.getDownloadProcess()));
                            }

                            @Override // com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p1594ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onSuccessed(DownloadInfo downloadInfo) {
                                if (PatchProxy.proxy(new Object[]{downloadInfo}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                super.onSuccessed(downloadInfo);
                                ALogger.m15797i("AAM.Source.InteractSourceManager", C0002O.m25084C("cdn client success: ", str, " ", downloadInfo.getTargetFilePath()));
                                observableEmitter.onNext(new C88268KqE(false, downloadInfo.getTargetFilePath()));
                                observableEmitter.onComplete();
                            }

                            @Override // com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p1594ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                if (PatchProxy.proxy(new Object[]{downloadInfo, baseException}, this, LIZ, false, 3).isSupported) {
                                    return;
                                }
                                super.onFailed(downloadInfo, baseException);
                                ALogger.m15800e("AAM.Source.InteractSourceManager", C0002O.m25086C("cdn client failed: ", baseException.getErrorMessage()));
                                if (!observableEmitter.isDisposed()) {
                                    observableEmitter.onError(baseException);
                                }
                                observableEmitter.onComplete();
                            }
                        };
                        C88288KqY c88288KqY = InteractSourceManager.this.delegateListener;
                        String str2 = str;
                        if (!PatchProxy.proxy(new Object[]{str2, absDownloadListener}, c88288KqY, C88288KqY.LIZ, false, 1).isSupported) {
                            C106862S5w.LIZ(str2, absDownloadListener);
                            Set<SoftReference<AbsDownloadListener>> set = c88288KqY.LIZIZ.get(str2);
                            if (set == null) {
                                set = new LinkedHashSet<>();
                            }
                            set.add(new SoftReference<>(absDownloadListener));
                            c88288KqY.LIZIZ.put(str2, set);
                        }
                        int download = BaseDownloader.with(InteractSourceManager.this.getContext()).url(str).name(md5Hex).tempPath(C34141.this.LIZ()).savePath(C34141.this.LIZ()).subThreadListener(InteractSourceManager.this.delegateListener).download();
                        ALogger.m15797i("AAM.Source.InteractSourceManager", C34141.this.LIZIZ + " start cdn downloader: " + str + " taskID:" + download);
                    }
                });
            }
            if (exists) {
                String LIZIZ2 = LIZIZ(str);
                if (TextUtils.isEmpty(LIZIZ2)) {
                    return Observable.error(new Throwable("get path is empty"));
                }
                ALogger.m15797i("AAM.Source.InteractSourceManager", C0002O.m25084C("cdn client hit cache: ", str, " path:", LIZIZ2));
                return Observable.just(new C88268KqE(true, LIZIZ2));
            }
            return Observable.create(new ObservableOnSubscribe<g$b>() { // from class: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager.1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(19363);
                }

                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(final ObservableEmitter observableEmitter) {
                    if (PatchProxy.proxy(new Object[]{observableEmitter}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    String md5Hex = DigestUtils.md5Hex(str);
                    AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager.1.1.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(19364);
                        }

                        @Override // com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p1594ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                            if (PatchProxy.proxy(new Object[]{downloadInfo}, this, LIZ, false, 2).isSupported) {
                                return;
                            }
                            super.onProgress(downloadInfo);
                            observableEmitter.onNext(new C88280KqQ(downloadInfo.getDownloadProcess()));
                        }

                        @Override // com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p1594ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            if (PatchProxy.proxy(new Object[]{downloadInfo}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            super.onSuccessed(downloadInfo);
                            ALogger.m15797i("AAM.Source.InteractSourceManager", C0002O.m25084C("cdn client success: ", str, " ", downloadInfo.getTargetFilePath()));
                            observableEmitter.onNext(new C88268KqE(false, downloadInfo.getTargetFilePath()));
                            observableEmitter.onComplete();
                        }

                        @Override // com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener, com.p1594ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            if (PatchProxy.proxy(new Object[]{downloadInfo, baseException}, this, LIZ, false, 3).isSupported) {
                                return;
                            }
                            super.onFailed(downloadInfo, baseException);
                            ALogger.m15800e("AAM.Source.InteractSourceManager", C0002O.m25086C("cdn client failed: ", baseException.getErrorMessage()));
                            if (!observableEmitter.isDisposed()) {
                                observableEmitter.onError(baseException);
                            }
                            observableEmitter.onComplete();
                        }
                    };
                    C88288KqY c88288KqY = InteractSourceManager.this.delegateListener;
                    String str2 = str;
                    if (!PatchProxy.proxy(new Object[]{str2, absDownloadListener}, c88288KqY, C88288KqY.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(str2, absDownloadListener);
                        Set<SoftReference<AbsDownloadListener>> set = c88288KqY.LIZIZ.get(str2);
                        if (set == null) {
                            set = new LinkedHashSet<>();
                        }
                        set.add(new SoftReference<>(absDownloadListener));
                        c88288KqY.LIZIZ.put(str2, set);
                    }
                    int download = BaseDownloader.with(InteractSourceManager.this.getContext()).url(str).name(md5Hex).tempPath(C34141.this.LIZ()).savePath(C34141.this.LIZ()).subThreadListener(InteractSourceManager.this.delegateListener).download();
                    ALogger.m15797i("AAM.Source.InteractSourceManager", C34141.this.LIZIZ + " start cdn downloader: " + str + " taskID:" + download);
                }
            });
        }

        public C34141(long j) {
            this.LIZIZ = j;
        }
    }

    private C88269KqF getDownloaderHelper() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (C88269KqF) proxy.result;
        }
        if (this.helper == null) {
            this.helper = new C88269KqF(new C34172());
        }
        return this.helper;
    }

    private String getEffectResourceDirectory() {
        String absolutePath;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(this.mEffectResourceDirectory)) {
            File LIZ = C116971W2r.LIZ(LK5.LJIIJ(), (String) null);
            if (LIZ == null) {
                absolutePath = "";
            } else {
                absolutePath = LIZ.getAbsolutePath();
            }
            this.mEffectResourceDirectory = absolutePath;
        }
        return this.mEffectResourceDirectory;
    }

    /* loaded from: classes5.dex */
    public static class FallBackUrlEmptyThrowable extends Throwable {
        static {
            Covode.recordClassIndex(19369);
        }

        public FallBackUrlEmptyThrowable(String str) {
            super(str);
        }
    }

    /* loaded from: classes5.dex */
    public static class UnZipThrowable extends Throwable {
        static {
            Covode.recordClassIndex(19370);
        }

        public UnZipThrowable(Throwable th) {
            super(th);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public void setGeckoClient(AbstractC88290Kqa abstractC88290Kqa) {
        this.mLiveGeckoClient = abstractC88290Kqa;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public void setTC21GeckoClient(AbstractC88271KqH abstractC88271KqH) {
        this.client = abstractC88271KqH;
    }

    public final /* synthetic */ void lambda$setDataCenter$0$InteractSourceManager(KVData kVData) {
        C3383p c3383p;
        if (!PatchProxy.proxy(new Object[]{kVData}, this, changeQuickRedirect, false, 24).isSupported && (c3383p = (C3383p) kVData.getData()) != null) {
            updateAudienceResource(c3383p);
        }
    }

    private String getEffectUnZipPath(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25084C(getEffectResourceDirectory(), File.separator, str, "_zip");
    }

    public AbstractC88270KqG createCDNClient(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (AbstractC88270KqG) proxy.result;
        }
        return new C34141(System.currentTimeMillis());
    }

    public final /* synthetic */ void lambda$setDataCenter$1$InteractSourceManager(KVData kVData) {
        C3383p c3383p;
        if (!PatchProxy.proxy(new Object[]{kVData}, this, changeQuickRedirect, false, 23).isSupported && (c3383p = (C3383p) kVData.getData()) != null && c3383p.LJJJJZ) {
            updateAudienceResource(c3383p);
        }
    }

    private AbstractC88273KqJ createAnchorLynxPanelDownloader(C3383p c3383p) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (AbstractC88273KqJ) proxy.result;
        }
        if (!TextUtils.isEmpty(c3383p.LJJLI) && !TextUtils.isEmpty(c3383p.LJJLIIIJL)) {
            ALogger.m15797i("AAM.Source.InteractSourceManager", C0002O.m25084C("lynx_channel=", c3383p.LJJLI, ";gameVersion=", this.mWGameVersion));
            if (c3383p.LJJLIL == null) {
                str = "";
            } else {
                str = c3383p.LJJLIL;
            }
            String str2 = c3383p.LJJLI;
            String str3 = this.mWGameVersion;
            if (str3 == null) {
                str3 = c3383p.LJJLIIIJJIZ;
            }
            return getDownloaderHelper().LIZ(new m$a(str, str2, str3, c3383p.LJJLIIIJL), c3383p, 0, "");
        }
        return null;
    }

    private AbstractC88273KqJ createAudienceLynxPanelDownloader(C3383p c3383p) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (AbstractC88273KqJ) proxy.result;
        }
        if (!TextUtils.isEmpty(c3383p.LJJLI) && !TextUtils.isEmpty(c3383p.LJJLIIIJLJLI)) {
            if (c3383p.LJJLIL == null) {
                str = "";
            } else {
                str = c3383p.LJJLIL;
            }
            String str2 = c3383p.LJJLI;
            String str3 = this.mWGameVersion;
            if (str3 == null) {
                str3 = c3383p.LJJLIIIJJIZ;
            }
            return getDownloaderHelper().LIZ(new m$a(str, str2, str3, c3383p.LJJLIIIJLJLI), c3383p, 0, "");
        }
        return null;
    }

    private void updateAudienceResource(C3383p c3383p) {
        if (PatchProxy.proxy(new Object[]{c3383p}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        AbstractC88273KqJ createAudienceLynxPanelDownloader = createAudienceLynxPanelDownloader(c3383p);
        if (createAudienceLynxPanelDownloader != null) {
            subscribe(createAudienceLynxPanelDownloader.LIZ(), c3383p, 1, false);
        }
        if (TextUtils.isEmpty(c3383p.LJL) && TextUtils.isEmpty(c3383p.LJJZZIII)) {
            subscribe(getPngFile(c3383p, 0), c3383p, 3, false);
        }
        if (!TextUtils.isEmpty(c3383p.LJJLIIIJILLIZJL)) {
            subscribe(getEffectSource(c3383p, false), c3383p, 2, false);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public void setDataCenter(DataCenter dataCenter) {
        if (PatchProxy.proxy(new Object[]{dataCenter}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        this.mDataCenter = dataCenter;
        if (this.mDataCenter == null) {
            return;
        }
        dataCenter.observe("cmd_interact_game_preload_float_res", new Observer<KVData>() { // from class: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(19366);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(KVData kVData) {
                C3383p c3383p;
                KVData kVData2 = kVData;
                if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 1).isSupported && kVData2 != null && (c3383p = (C3383p) kVData2.getData()) != null) {
                    InteractSourceManager.this.updateAnchorResource(c3383p);
                }
            }
        });
        dataCenter.observe("data_wmingame_info", new Observer<KVData>() { // from class: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(19367);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(KVData kVData) {
                HashMap hashMap;
                C3383p c3383p;
                KVData kVData2 = kVData;
                if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 1).isSupported && (hashMap = (HashMap) kVData2.getData()) != null && (c3383p = (C3383p) hashMap.get("interactitem")) != null && c3383p.LJJJJLL) {
                    Object obj = hashMap.get("lynx_resource_business_version");
                    if (obj instanceof String) {
                        InteractSourceManager.this.mWGameVersion = (String) obj;
                    }
                    ALogger.m15797i("AAM.Source.InteractSourceManager", C0002O.m25086C("wgame version: ", InteractSourceManager.this.mWGameVersion));
                    InteractSourceManager.this.updateAnchorResource(c3383p);
                }
            }
        });
        dataCenter.observe("cmd_interact_game_audience_preload_float_res", new Observer(this) { // from class: X.KqN
            public static ChangeQuickRedirect LIZ;
            public final InteractSourceManager LIZIZ;

            static {
                Covode.recordClassIndex(19603);
            }

            {
                this.LIZIZ = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.lambda$setDataCenter$0$InteractSourceManager((KVData) obj);
            }
        });
        dataCenter.observe("data_audience_interact_game", new Observer(this) { // from class: X.KqM
            public static ChangeQuickRedirect LIZ;
            public final InteractSourceManager LIZIZ;

            static {
                Covode.recordClassIndex(19391);
            }

            {
                this.LIZIZ = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.lambda$setDataCenter$1$InteractSourceManager((KVData) obj);
            }
        });
    }

    public void updateAnchorResource(C3383p c3383p) {
        if (PatchProxy.proxy(new Object[]{c3383p}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        AbstractC88273KqJ createAnchorLynxPanelDownloader = createAnchorLynxPanelDownloader(c3383p);
        if (createAnchorLynxPanelDownloader != null) {
            subscribe(createAnchorLynxPanelDownloader.LIZ(), c3383p, 1, true);
        }
        if (TextUtils.isEmpty(c3383p.LJL) && TextUtils.isEmpty(c3383p.LJJZZIII)) {
            subscribe(getPngFile(c3383p, 0), c3383p, 3, true);
        }
        if (!TextUtils.isEmpty(c3383p.LJJLIIIJ)) {
            subscribe(getEffectSource(c3383p, true), c3383p, 2, true);
        }
    }

    private String getUrl(List<String> list, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (list != null && list.size() != 0) {
            new StringBuilder();
            return C0002O.m25086C(list.get(0), str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public Observable<g$b> getPngFile(C3383p c3383p, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, Integer.valueOf(i)}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        AbstractC88273KqJ createPngDownload = createPngDownload(c3383p, i);
        if (createPngDownload == null) {
            return Observable.error(new Throwable("float entrance style is null"));
        }
        return createPngDownload.LIZ();
    }

    private AbstractC88273KqJ createPngDownload(C3383p c3383p, int i) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, Integer.valueOf(i)}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (AbstractC88273KqJ) proxy.result;
        }
        String str2 = null;
        if (c3383p.LJJL == null) {
            return null;
        }
        String style = c3383p.LJJL.getStyle(i);
        if (c3383p.LJJLIL != null) {
            str = c3383p.LJJLIL;
        } else {
            str = "";
        }
        String str3 = c3383p.LJJLJ;
        String str4 = this.mWGameVersion;
        if (str4 == null) {
            str4 = c3383p.LJJLIIIJJIZ;
        }
        new StringBuilder();
        m$a m_a = new m$a(str, str3, str4, C0002O.m25086C(style, ".png"));
        C88269KqF downloaderHelper = getDownloaderHelper();
        if (c3383p.LJIIZILJ != null && c3383p.LJIIZILJ.size() > 0) {
            new StringBuilder();
            str2 = C0002O.m25086C(c3383p.LJIIZILJ.get(0), style);
        }
        return downloaderHelper.LIZ(m_a, c3383p, 1, str2);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public Observable<g$b> getEffectSource(final C3383p c3383p, final boolean z) {
        final String url;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        AbstractC88270KqG createCDNClient = createCDNClient(true);
        if (z) {
            url = getUrl(c3383p.LJIIZILJ, c3383p.LJJLIIIJ);
        } else {
            url = getUrl(c3383p.LJIIZILJ, c3383p.LJJLIIIJILLIZJL);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        return createCDNClient.LIZ(url).subscribeOn(Schedulers.m138io()).flatMap(new Function(this, c3383p, currentTimeMillis, z, url) { // from class: X.KqI
            public static ChangeQuickRedirect LIZ;
            public final InteractSourceManager LIZIZ;
            public final C3383p LIZJ;
            public final long LIZLLL;

            /* renamed from: LJ */
            public final boolean f8624LJ;
            public final String LJFF;

            static {
                Covode.recordClassIndex(19394);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = c3383p;
                this.LIZLLL = currentTimeMillis;
                this.f8624LJ = z;
                this.LJFF = url;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                return proxy2.isSupported ? proxy2.result : this.LIZIZ.lambda$getEffectSource$4$InteractSourceManager(this.LIZJ, this.LIZLLL, this.f8624LJ, this.LJFF, (g$b) obj);
            }
        }).doOnError(new Consumer<Throwable>() { // from class: com.bytedance.android.live.broadcastgame.channel.InteractSourceManager.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(19368);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Throwable th) {
                if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported && !(th instanceof UnZipThrowable)) {
                    InteractSourceManager.this.sendResDownloadStatistics(String.valueOf(c3383p.LIZLLL), c3383p.f26026LJ, currentTimeMillis, 1, z);
                }
            }
        });
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public Observable<g$b> getLynxFile(C3383p c3383p, boolean z, String str) {
        AbstractC88273KqJ createAudienceLynxPanelDownloader;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        this.mWGameVersion = str;
        if (z) {
            createAudienceLynxPanelDownloader = createAnchorLynxPanelDownloader(c3383p);
        } else {
            createAudienceLynxPanelDownloader = createAudienceLynxPanelDownloader(c3383p);
        }
        if (createAudienceLynxPanelDownloader == null) {
            return Observable.error(new Throwable("can't create downloader"));
        }
        return createAudienceLynxPanelDownloader.LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public Observable<g$b> updateOpenPlatformJsSdk(String str, String str2, String str3, String str4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        m$a m_a = new m$a(str, str2, str3, str4);
        AbstractC88271KqH abstractC88271KqH = this.client;
        if (abstractC88271KqH != null) {
            return abstractC88271KqH.LIZ(m_a, false);
        }
        return null;
    }

    private Disposable subscribe(Observable<g$b> observable, final C3383p c3383p, final int i, final boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{observable, c3383p, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (Disposable) proxy.result;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        return observable.compose(C100839PnV.LIZJ()).subscribe(new Consumer(c3383p, i, z, currentTimeMillis) { // from class: X.KqK
            public static ChangeQuickRedirect LIZ;
            public final C3383p LIZIZ;
            public final int LIZJ;
            public final boolean LIZLLL;

            /* renamed from: LJ */
            public final long f8625LJ;

            static {
                Covode.recordClassIndex(19392);
            }

            {
                this.LIZIZ = c3383p;
                this.LIZJ = i;
                this.LIZLLL = z;
                this.f8625LJ = currentTimeMillis;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                InteractSourceManager.lambda$subscribe$2$InteractSourceManager(this.LIZIZ, this.LIZJ, this.LIZLLL, this.f8625LJ, (g$b) obj);
            }
        }, new Consumer(this, c3383p, i, currentTimeMillis) { // from class: X.KqL
            public static ChangeQuickRedirect LIZ;
            public final InteractSourceManager LIZIZ;
            public final C3383p LIZJ;
            public final int LIZLLL;

            /* renamed from: LJ */
            public final long f8626LJ;

            static {
                Covode.recordClassIndex(19393);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = c3383p;
                this.LIZLLL = i;
                this.f8626LJ = currentTimeMillis;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.lambda$subscribe$3$InteractSourceManager(this.LIZJ, this.LIZLLL, this.f8626LJ, (Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$subscribe$3$InteractSourceManager(C3383p c3383p, int i, long j, Throwable th) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{c3383p, Integer.valueOf(i), new Long(j), th}, this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        ALogger.m15800e("AAM.Source.InteractSourceManager", C0002O.m25086C("download error: ", th.toString()));
        DataCenter dataCenter = this.mDataCenter;
        if (dataCenter != null) {
            z = ((Boolean) dataCenter.get("data_is_anchor", (String) Boolean.FALSE)).booleanValue();
        } else {
            z = false;
        }
        if (!(th instanceof FallBackUrlEmptyThrowable)) {
            ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logAnchorAudienceGamePanelResDownload(false, c3383p, i, z, System.currentTimeMillis() - j, th.toString());
        }
    }

    public static final /* synthetic */ void lambda$subscribe$2$InteractSourceManager(C3383p c3383p, int i, boolean z, long j, g$b g_b) {
        if (!PatchProxy.proxy(new Object[]{c3383p, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), g_b}, null, changeQuickRedirect, true, 22).isSupported && (g_b instanceof C88268KqE)) {
            C88268KqE c88268KqE = (C88268KqE) g_b;
            ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logAnchorAudienceGameResDownloadHitCache(c88268KqE.LIZIZ, c3383p, i, z);
            if (!c88268KqE.LIZIZ) {
                ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logAnchorAudienceGamePanelResDownload(true, c3383p, i, z, System.currentTimeMillis() - j, null);
            }
        }
    }

    private void sendResLoadStatistics(String str, String str2, long j, int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("game_id", str);
        hashMap.put("game_name", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() - j);
        hashMap.put("duration", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        hashMap.put("status", sb2.toString());
        if (z) {
            ((AbstractC88385Ks7) ServiceManager.getService(AbstractC88385Ks7.class)).LIZ("livesdk_live_game_publicity_download_duration", hashMap);
        } else {
            ((AbstractC88385Ks7) ServiceManager.getService(AbstractC88385Ks7.class)).LIZ("livesdk_live_game_audience_publicity_download_duration", hashMap);
        }
    }

    public void sendResDownloadStatistics(String str, String str2, long j, int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("game_id", str);
        hashMap.put("game_name", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() - j);
        hashMap.put("duration", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        hashMap.put("status", sb2.toString());
        if (z) {
            ((AbstractC88385Ks7) ServiceManager.getService(AbstractC88385Ks7.class)).LIZ("livesdk_live_game_publicity_download_duration", hashMap);
        } else {
            ((AbstractC88385Ks7) ServiceManager.getService(AbstractC88385Ks7.class)).LIZ("livesdk_live_game_audience_publicity_download_duration", hashMap);
        }
    }

    public final /* synthetic */ ObservableSource lambda$getEffectSource$4$InteractSourceManager(C3383p c3383p, long j, boolean z, String str, g$b g_b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str, g_b}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (ObservableSource) proxy.result;
        }
        if (g_b instanceof C88268KqE) {
            C88268KqE c88268KqE = (C88268KqE) g_b;
            if (!c88268KqE.LIZIZ) {
                sendResDownloadStatistics(String.valueOf(c3383p.LIZLLL), c3383p.f26026LJ, j, 1, z);
            }
            String effectUnZipPath = getEffectUnZipPath(DigestUtils.md5Hex(str));
            File file = new File(effectUnZipPath);
            try {
                File file2 = new File(effectUnZipPath);
                if (c88268KqE.LIZIZ && file2.exists()) {
                    ALogger.m15797i("AAM.Source.InteractSourceManager", "hit cache and unzip, just return");
                    return Observable.just(new C88268KqE(c88268KqE.LIZIZ, effectUnZipPath));
                }
                if (!file.exists()) {
                    C90963Lsb.LIZ(c88268KqE.LIZJ, effectUnZipPath);
                }
                if (!c88268KqE.LIZIZ) {
                    sendResLoadStatistics(String.valueOf(c3383p.LIZLLL), c3383p.f26026LJ, j, 1, z);
                }
                return Observable.just(new C88268KqE(c88268KqE.LIZIZ, effectUnZipPath));
            } catch (IOException e) {
                if (!c88268KqE.LIZIZ) {
                    sendResLoadStatistics(String.valueOf(c3383p.LIZLLL), c3383p.f26026LJ, j, 0, z);
                }
                return Observable.error(new UnZipThrowable(e));
            }
        }
        return Observable.just(g_b);
    }
}
