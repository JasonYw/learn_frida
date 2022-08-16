package com.benchmark.collection.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.benchmark.port.nativePort.ApplogUtilsInvoker;
import com.benchmark.port.nativePort.LogcatInvoker;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.compliance.business.ComplianceBusinessServiceImpl;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import java.io.File;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractBinderC108880Stu;
import p003X.AbstractC108869Stj;
import p003X.AbstractC108886Su0;
import p003X.AbstractC108897SuB;
import p003X.C108306Ske;
import p003X.C108862Stc;
import p003X.C108868Sti;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes10.dex */
public class ByteBenchService extends Service {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ByteBenchProcessInterface mByteBenchProcess;
    public AbstractC108897SuB mCallback;
    public String mRuntimeLibLoadingPath;
    public volatile STATUS mStatus = STATUS.INVALID;
    public String mInternalFile = "";
    public String mExternalFile = "";
    public final AbstractC108886Su0 ibtcManager = new AbstractBinderC108880Stu() { // from class: com.benchmark.collection.service.ByteBenchService.1
        public static ChangeQuickRedirect LIZIZ;

        static {
            Covode.recordClassIndex(9660);
        }

        @Override // p003X.AbstractC108886Su0
        public final void LIZ() {
            MethodCollector.m14708i(780);
            if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
                MethodCollector.m14707o(780);
                return;
            }
            STATUS status = ByteBenchService.this.mStatus;
            STATUS status2 = ByteBenchService.this.mStatus;
            if (status == STATUS.START) {
                ByteBenchService.this.mByteBenchProcess.stopByteBench();
                ByteBenchService.this.mStatus = STATUS.STOP;
                if (ByteBenchService.this.mCallback != null) {
                    ByteBenchService.this.mCallback.LIZ(102, "stop");
                    MethodCollector.m14707o(780);
                    return;
                }
            } else if (ByteBenchService.this.mCallback != null) {
                ByteBenchService.this.mCallback.LIZ(102, -1, "stop failed");
            }
            MethodCollector.m14707o(780);
        }

        @Override // p003X.AbstractC108886Su0
        public final void LIZ(int i, String str, String str2, AbstractC108897SuB abstractC108897SuB) {
            MethodCollector.m14708i(779);
            if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, abstractC108897SuB}, this, LIZIZ, false, 1).isSupported) {
                MethodCollector.m14707o(779);
                return;
            }
            ByteBenchService byteBenchService = ByteBenchService.this;
            byteBenchService.mCallback = abstractC108897SuB;
            if (byteBenchService.mStatus != STATUS.START && ByteBenchService.this.mStatus != STATUS.DESTROY) {
                if (ByteBenchService.this.mStatus == STATUS.INVALID) {
                    ByteBenchService.this.mByteBenchProcess = new ByteBenchProcessInterface();
                    if (ByteBenchService.this.mByteBenchProcess.init(str, ByteBenchService.this.mInternalFile, ByteBenchService.this.mExternalFile, ByteBenchService.this.mRuntimeLibLoadingPath, ByteBenchService.this) < 0) {
                        C108306Ske.LIZLLL("ByteBenchService", "ByteBenchProcess init failed");
                        ByteBenchService.this.mStatus = STATUS.INVALID;
                        MethodCollector.m14707o(779);
                        return;
                    }
                    ByteBenchService.this.mByteBenchProcess.setByteBenchCallback(abstractC108897SuB);
                    C108306Ske.LIZ("ByteBenchService", C108862Stc.LIZIZ().LJIIL);
                    LogcatInvoker.LIZ(C108862Stc.LIZIZ().LJIIL);
                    C108868Sti.LIZ(new AbstractC108869Stj() { // from class: com.benchmark.collection.service.ByteBenchService.1.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(9661);
                        }

                        @Override // p003X.AbstractC108869Stj
                        public final void LIZ(String str3, JSONObject jSONObject) {
                            MethodCollector.m14708i(778);
                            if (PatchProxy.proxy(new Object[]{str3, jSONObject}, this, LIZ, false, 1).isSupported) {
                                MethodCollector.m14707o(778);
                                return;
                            }
                            try {
                                if (ByteBenchService.this.mCallback != null) {
                                    ByteBenchService.this.mCallback.LIZ(str3, jSONObject.toString());
                                }
                                MethodCollector.m14707o(778);
                            } catch (RemoteException e) {
                                C108306Ske.LIZJ("ByteBenchService", e.getMessage());
                                MethodCollector.m14707o(778);
                            }
                        }
                    });
                    ApplogUtilsInvoker.Init();
                    ByteBenchService.this.mStatus = STATUS.INIT;
                }
                if (ByteBenchService.this.mByteBenchProcess == null) {
                    if (ByteBenchService.this.mCallback != null) {
                        ByteBenchService.this.mCallback.LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS, -1, "mByteBenchProcess is null, start failed");
                    }
                    MethodCollector.m14707o(779);
                    return;
                }
                int loadByteBench = ByteBenchService.this.mByteBenchProcess.loadByteBench(str2);
                if (loadByteBench != 0) {
                    ByteBenchService.this.mStatus = STATUS.INVALID;
                    if (ByteBenchService.this.mCallback != null) {
                        ByteBenchService.this.mCallback.LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS, loadByteBench, "init, loadByteBench start failed");
                    }
                    MethodCollector.m14707o(779);
                    return;
                }
                int startTest = ByteBenchService.this.mByteBenchProcess.startTest(i, str2);
                if (startTest < 0) {
                    if (ByteBenchService.this.mCallback != null) {
                        ByteBenchService.this.mCallback.LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS, startTest, "start native task failed");
                    }
                    ByteBenchService.this.mStatus = STATUS.INIT;
                    MethodCollector.m14707o(779);
                    return;
                }
                ByteBenchService.this.mStatus = STATUS.START;
                if (ByteBenchService.this.mCallback != null) {
                    ByteBenchService.this.mCallback.LIZ(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS, "start");
                }
                MethodCollector.m14707o(779);
                return;
            }
            MethodCollector.m14707o(779);
        }
    };

    static {
        Covode.recordClassIndex(9659);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        m16001xf9c0cd0f(this, context);
    }

    /* renamed from: com_benchmark_collection_service_ByteBenchService__attachBaseContext$___twin___ */
    public void m16003x4245da7b(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        super.attachBaseContext(context);
    }

    /* renamed from: com_benchmark_collection_service_ByteBenchService__onStartCommand$___twin___ */
    public int m16002xd881907c(Intent intent, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : m16000x72abfbdc(this, intent, i, i2);
    }

    /* loaded from: classes10.dex */
    public enum STATUS {
        INVALID,
        INIT,
        START,
        STOP,
        DESTROY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static STATUS[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (STATUS[]) proxy.result;
            }
            return (STATUS[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9662);
        }

        public static STATUS valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (STATUS) proxy.result;
            }
            return (STATUS) Enum.valueOf(STATUS.class, str);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        KevaBuilder.getInstance().setContext(getApplicationContext());
        Keva.forceInit();
        C108862Stc.LIZIZ().LIZIZ = getApplicationContext();
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.mStatus = STATUS.DESTROY;
        ByteBenchProcessInterface byteBenchProcessInterface = this.mByteBenchProcess;
        if (byteBenchProcessInterface != null) {
            byteBenchProcessInterface.destroy();
            this.mByteBenchProcess = null;
        }
        C108862Stc.LIZIZ().LIZIZ = null;
        this.mStatus = STATUS.INVALID;
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (IBinder) proxy.result;
        }
        this.mStatus = STATUS.INVALID;
        this.mInternalFile = getCacheDir().getPath();
        File externalCacheDir = getExternalCacheDir();
        if (externalCacheDir != null) {
            this.mExternalFile = externalCacheDir.getPath();
        }
        this.mRuntimeLibLoadingPath = getApplicationInfo().nativeLibraryDir;
        C108862Stc.LIZIZ().LJIIL = intent.getByteExtra("Loglevel", (byte) 3);
        return this.ibtcManager.asBinder();
    }

    /* renamed from: com_benchmark_collection_service_ByteBenchService_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_serviceAttachBaseContext */
    public static void m16001xf9c0cd0f(ByteBenchService byteBenchService, Context context) {
        if (PatchProxy.proxy(new Object[]{byteBenchService, context}, null, changeQuickRedirect, true, 7).isSupported) {
            return;
        }
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        byteBenchService.m16003x4245da7b(context);
    }

    /* renamed from: com_benchmark_collection_service_ByteBenchService_com_ss_android_ugc_aweme_lancet_KeepAliveLancet_onStartCommand */
    public static int m16000x72abfbdc(ByteBenchService byteBenchService, Intent intent, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{byteBenchService, intent, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int m16002xd881907c = byteBenchService.m16002xd881907c(intent, i, i2);
        new StringBuilder();
        ALog.m8953i("KeepAliveLancet", C0002O.m25086C(byteBenchService.getClass().getName(), "： hook Service.onStartCommand"));
        if (ComplianceBusinessServiceImpl.LIZ(false).isNeedHookService(byteBenchService.getClass().getName())) {
            ALog.m8953i("KeepAliveLancet", "return START_NOT_STICKY");
            return 2;
        }
        return m16002xd881907c;
    }
}
