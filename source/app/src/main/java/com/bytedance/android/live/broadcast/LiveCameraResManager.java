package com.bytedance.android.live.broadcast;

import android.content.res.AssetManager;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.AbstractC34965e;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import okio.Source;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.C116971W2r;
import p003X.LK5;

/* loaded from: classes8.dex */
public enum LiveCameraResManager {
    INST;
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String sLiveCameraResStoragePath;
    public MutableLiveData<Boolean> isLoadedRes = new MutableLiveData<>();
    public boolean isLoadingRes;
    public String lastTimeFailedReason;
    public static final String FILTER_DIRECTORY = "live_res";
    public static final String ROI = "roi";
    public static final String[] FOLDER_RES_FILES = new String[0];

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LiveCameraResManager[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (LiveCameraResManager[]) proxy.result;
        }
        return (LiveCameraResManager[]) values().clone();
    }

    static {
        Covode.recordClassIndex(14299);
        File dir = LK5.LJIIJ().getDir(FILTER_DIRECTORY, 0);
        new StringBuilder();
        sLiveCameraResStoragePath = C0002O.m25086C(dir.getAbsolutePath(), File.separator);
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25086C(sLiveCameraResStoragePath, ROI);
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.23".equals(AbstractC80293Hkt.LJIIIZ.LIZ())));
        }
        return this.isLoadedRes.getValue().booleanValue();
    }

    public boolean LIZLLL() {
        String[] strArr;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AssetManager assets = LK5.LJIIJ().getAssets();
        boolean z = true;
        for (String str : FOLDER_RES_FILES) {
            try {
                new StringBuilder();
                LIZ(assets, str, C0002O.m25085C(sLiveCameraResStoragePath, File.separator, str));
            } catch (IOException e) {
                e.printStackTrace();
                ALogger.m15798e("LiveCameraResManager", e);
                z = false;
            }
        }
        return z;
    }

    public final synchronized void LIZIZ() {
        MethodCollector.m14708i(1189);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            MethodCollector.m14707o(1189);
        } else if (this.isLoadingRes) {
            MethodCollector.m14707o(1189);
        } else if ("0.0.23".equals(AbstractC80293Hkt.LJIIIZ.LIZ())) {
            if (this.isLoadedRes.getValue() == null || !this.isLoadedRes.getValue().booleanValue()) {
                Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this) { // from class: X.Qmd
                    public static ChangeQuickRedirect LIZ;
                    public final LiveCameraResManager LIZIZ;

                    static {
                        Covode.recordClassIndex(15665);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveCameraResManager liveCameraResManager = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{obj}, liveCameraResManager, LiveCameraResManager.changeQuickRedirect, false, 13).isSupported) {
                            return;
                        }
                        liveCameraResManager.isLoadedRes.setValue(Boolean.TRUE);
                    }
                });
            }
            MethodCollector.m14707o(1189);
        } else {
            this.isLoadingRes = true;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
                AbstractC34965e.LIZ(new Callable(this) { // from class: X.Qme
                    public static ChangeQuickRedirect LIZ;
                    public final LiveCameraResManager LIZIZ;

                    static {
                        Covode.recordClassIndex(15666);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                        if (proxy.isSupported) {
                            return proxy.result;
                        }
                        LiveCameraResManager liveCameraResManager = this.LIZIZ;
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], liveCameraResManager, LiveCameraResManager.changeQuickRedirect, false, 12);
                        return proxy2.isSupported ? proxy2.result : Boolean.valueOf(liveCameraResManager.LIZLLL());
                    }
                }).LIZIZ(Schedulers.m138io()).LIZ(AndroidSchedulers.mainThread()).LIZ(new Consumer(this) { // from class: X.Qmb
                    public static ChangeQuickRedirect LIZ;
                    public final LiveCameraResManager LIZIZ;

                    static {
                        Covode.recordClassIndex(15667);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveCameraResManager liveCameraResManager = this.LIZIZ;
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.proxy(new Object[]{bool}, liveCameraResManager, LiveCameraResManager.changeQuickRedirect, false, 11).isSupported) {
                            return;
                        }
                        if (bool.booleanValue()) {
                            liveCameraResManager.isLoadingRes = false;
                            AbstractC80293Hkt.LJIIIZ.LIZ("0.0.23");
                            liveCameraResManager.isLoadedRes.setValue(Boolean.TRUE);
                            return;
                        }
                        liveCameraResManager.isLoadingRes = false;
                        liveCameraResManager.isLoadedRes.setValue(Boolean.FALSE);
                    }
                }, new Consumer(this) { // from class: X.Qmc
                    public static ChangeQuickRedirect LIZ;
                    public final LiveCameraResManager LIZIZ;

                    static {
                        Covode.recordClassIndex(15668);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveCameraResManager liveCameraResManager = this.LIZIZ;
                        Throwable th = (Throwable) obj;
                        if (PatchProxy.proxy(new Object[]{th}, liveCameraResManager, LiveCameraResManager.changeQuickRedirect, false, 10).isSupported) {
                            return;
                        }
                        liveCameraResManager.isLoadedRes.setValue(Boolean.FALSE);
                        liveCameraResManager.isLoadingRes = false;
                        liveCameraResManager.lastTimeFailedReason = th.toString();
                        ALogger.m15800e("LiveCameraResManager", th.toString());
                    }
                }, new Action(this) { // from class: X.Qmf
                    public static ChangeQuickRedirect LIZ;
                    public final LiveCameraResManager LIZIZ;

                    static {
                        Covode.recordClassIndex(15669);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        this.LIZIZ.isLoadingRes = false;
                    }
                });
            }
            MethodCollector.m14707o(1189);
        }
    }

    public static LiveCameraResManager valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (LiveCameraResManager) proxy.result;
        }
        return (LiveCameraResManager) Enum.valueOf(LiveCameraResManager.class, str);
    }

    LiveCameraResManager() {
    }

    private void LIZ(AssetManager assetManager, String str, String str2) {
        MethodCollector.m14708i(1190);
        if (PatchProxy.proxy(new Object[]{assetManager, str, str2}, this, changeQuickRedirect, false, 9).isSupported) {
            MethodCollector.m14707o(1190);
            return;
        }
        String[] list = assetManager.list(str);
        if (list.length > 0) {
            new File(str2).mkdirs();
            for (String str3 : list) {
                new StringBuilder();
                String m25085C = C0002O.m25085C(str, File.separator, str3);
                new StringBuilder();
                LIZ(assetManager, m25085C, C0002O.m25085C(str2, File.separator, str3));
            }
            MethodCollector.m14707o(1190);
            return;
        }
        if (!PatchProxy.proxy(new Object[]{assetManager, str, str2}, this, changeQuickRedirect, false, 8).isSupported && !TextUtils.isEmpty(str)) {
            BufferedSink bufferedSink = null;
            try {
                InputStream open = assetManager.open(str);
                try {
                    Source source = Okio.source(open);
                    try {
                        File file = new File(str2);
                        if (file.exists()) {
                            C116971W2r.LIZ(file);
                        }
                        Sink sink = Okio.sink(file);
                        try {
                            bufferedSink = Okio.buffer(sink);
                            bufferedSink.writeAll(source);
                            bufferedSink.flush();
                            bufferedSink.close();
                            if (sink != null) {
                                sink.close();
                            }
                            if (source != null) {
                                source.close();
                            }
                            if (open != null) {
                                open.close();
                                MethodCollector.m14707o(1190);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedSink != null) {
                                bufferedSink.close();
                            }
                            if (sink != null) {
                                sink.close();
                            }
                            if (source != null) {
                                source.close();
                            }
                            if (open != null) {
                                open.close();
                            }
                            MethodCollector.m14707o(1190);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        MethodCollector.m14707o(1190);
    }
}
