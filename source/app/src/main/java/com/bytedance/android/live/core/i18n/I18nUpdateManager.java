package com.bytedance.android.live.core.i18n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Header;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.p1594ss.android.ugc.quota.BDNetworkTagContextProviderAdapter;
import com.p1594ss.android.ugc.quota.BDNetworkTagManager;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import p003X.AbstractC91257LxL;
import p003X.C88306Kqq;

/* loaded from: classes17.dex */
public class I18nUpdateManager {
    public static ChangeQuickRedirect LIZ;
    public static long[] LJIIIZ = {JsBridgeDelegate.GET_URL_OUT_TIME, 6000, 9000, 60000, 60000, 60000, 600000};
    public static I18nApi LJIIJ;
    public String LIZIZ;
    public AbstractC91257LxL LIZLLL;

    /* renamed from: LJ */
    public boolean f26167LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public Handler.Callback LJIIJJI = new Handler.Callback() { // from class: com.bytedance.android.live.core.i18n.I18nUpdateManager.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(23455);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (message.what != 0) {
                return false;
            }
            I18nUpdateManager i18nUpdateManager = I18nUpdateManager.this;
            i18nUpdateManager.LIZ(i18nUpdateManager.LJII);
            return true;
        }
    };
    public Disposable LJIIIIZZ = null;
    public Handler LIZJ = new Handler(Looper.getMainLooper(), this.LJIIJJI);

    /* loaded from: classes17.dex */
    public interface I18nApi {
        static {
            Covode.recordClassIndex(23460);
        }

        @GET("/webcast/setting/i18n/package/")
        Observable<C5176i<C4077a>> update(@Query("locale") String str, @Query("cur_version") long j, @Header("x-tt-request-tag") String str2);
    }

    static {
        Covode.recordClassIndex(23454);
    }

    public final void LIZ(Throwable th) {
        long j;
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJFF++;
        Handler handler = this.LIZJ;
        int i = this.LJFF;
        long[] jArr = LJIIIZ;
        int length = jArr.length;
        if (i < length && i >= 0) {
            j = jArr[i];
        } else {
            j = LJIIIZ[length - 1];
        }
        handler.sendEmptyMessageDelayed(0, j);
    }

    public final void LIZ(long j) {
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 1).isSupported && !this.f26167LJ && !this.LIZJ.hasMessages(0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.LJI;
            if (elapsedRealtime > j2 && elapsedRealtime - j2 < 60000) {
                return;
            }
            this.LJII = j;
            this.f26167LJ = true;
            this.LJIIIIZZ = LJIIJ.update(this.LIZIZ, j, (String) BDNetworkTagManager.getInstance().buildBDNetworkTag(new BDNetworkTagContextProviderAdapter(this) { // from class: com.bytedance.android.live.core.i18n.I18nUpdateManager.2
                static {
                    Covode.recordClassIndex(23456);
                }

                @Override // com.p1594ss.android.ugc.quota.BDNetworkTagContextProviderAdapter, com.p1594ss.android.ugc.quota.IBDNetworkTagContextProvider
                public int triggerType() {
                    return 0;
                }
            }).second).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.m138io()).subscribe(new Consumer<C5176i<C4077a>>() { // from class: com.bytedance.android.live.core.i18n.I18nUpdateManager.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(23457);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5176i<C4077a> c5176i) {
                    C5176i<C4077a> c5176i2 = c5176i;
                    if (!PatchProxy.proxy(new Object[]{c5176i2}, this, LIZ, false, 1).isSupported) {
                        I18nUpdateManager.this.f26167LJ = false;
                        if (c5176i2 != null && c5176i2.LIZIZ == 0 && c5176i2.LIZJ != null) {
                            I18nUpdateManager i18nUpdateManager = I18nUpdateManager.this;
                            i18nUpdateManager.LJFF = 0;
                            i18nUpdateManager.LJI = SystemClock.elapsedRealtime();
                            C4077a c4077a = c5176i2.LIZJ;
                            if (I18nUpdateManager.this.LIZLLL != null) {
                                I18nUpdateManager.this.LIZLLL.LIZ(I18nUpdateManager.this.LIZIZ, c4077a.LIZ, c4077a.LIZIZ);
                                return;
                            }
                            return;
                        }
                        I18nUpdateManager.this.LIZ(new Throwable("response == null || response.statusCode != 0 || response.data == null"));
                    }
                }
            }, new Consumer<Throwable>() { // from class: com.bytedance.android.live.core.i18n.I18nUpdateManager.4
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(23458);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        I18nUpdateManager i18nUpdateManager = I18nUpdateManager.this;
                        i18nUpdateManager.f26167LJ = false;
                        i18nUpdateManager.LIZ(th2);
                    }
                }
            }, new Action() { // from class: com.bytedance.android.live.core.i18n.I18nUpdateManager.5
                static {
                    Covode.recordClassIndex(23459);
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    I18nUpdateManager.this.f26167LJ = false;
                }
            });
        }
    }

    public I18nUpdateManager(String str, AbstractC91257LxL abstractC91257LxL) {
        this.LIZIZ = str;
        this.LIZLLL = abstractC91257LxL;
        if (LJIIJ == null) {
            LJIIJ = (I18nApi) C88306Kqq.LIZ().LIZ(I18nApi.class);
        }
    }
}
