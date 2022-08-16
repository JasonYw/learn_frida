package com.bef.effectsdk.effectupdate;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.GeckoClient;
import com.bytedance.geckox.GeckoConfig;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class EffectUpdateRunner {
    public static EffectUpdateRunner INSTANCE;
    public static File ROOT_DIR;
    public static ChangeQuickRedirect changeQuickRedirect;
    public GeckoClient mClient;
    public GeckoConfig mConfig;
    public Context mContext;
    public File mGeckoRootDir;
    public boolean mInited;
    public EffectUpdateListener mListener;
    public File mModulesDir;
    public File mModulesUpdateDir;
    public boolean mDebugMode = true;
    public String mDeviceID = "";
    public int mAppID = 1128;
    public String mAppVersion = "";

    static {
        Covode.recordClassIndex(9552);
    }

    public void clearCache(Context context) {
    }

    public boolean getDebugMode() {
        return this.mDebugMode;
    }

    public boolean isInited() {
        return this.mInited;
    }

    public String getRootDir() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        File file = ROOT_DIR;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return "";
    }

    public String getUpdateDir() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        File file = this.mModulesUpdateDir;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return "";
    }

    public static synchronized EffectUpdateRunner instance() {
        synchronized (EffectUpdateRunner.class) {
            MethodCollector.m14708i(661);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                EffectUpdateRunner effectUpdateRunner = (EffectUpdateRunner) proxy.result;
                MethodCollector.m14707o(661);
                return effectUpdateRunner;
            }
            if (INSTANCE == null) {
                INSTANCE = new EffectUpdateRunner();
            }
            EffectUpdateRunner effectUpdateRunner2 = INSTANCE;
            MethodCollector.m14707o(661);
            return effectUpdateRunner2;
        }
    }

    public String getUpdateSuccessFilePath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return new File(this.mModulesUpdateDir, "update_success.dummy").getAbsolutePath();
    }

    public boolean isLastUpdateSuccess() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!new File(this.mModulesUpdateDir, "update_success.dummy").exists()) {
            return false;
        }
        return true;
    }

    public synchronized void update() {
        String str;
        MethodCollector.m14708i(663);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            MethodCollector.m14707o(663);
            return;
        }
        if (this.mConfig == null && this.mContext != null) {
            try {
                GeckoConfig.Builder allLocalAccessKeys = new GeckoConfig.Builder(this.mContext.getApplicationContext()).allLocalAccessKeys("d1183649af2e5b35d4c53aac42c73e32", "e7f93aba36d7d196c56dac8d081eff66");
                String[] strArr = new String[1];
                if (this.mDebugMode) {
                    str = "d1183649af2e5b35d4c53aac42c73e32";
                } else {
                    str = "e7f93aba36d7d196c56dac8d081eff66";
                }
                strArr[0] = str;
                GeckoConfig.Builder appId = allLocalAccessKeys.accessKey(strArr).appId(this.mAppID);
                appId.deviceId(this.mDeviceID);
                appId.host("gecko.snssdk.com");
                appId.appVersion(this.mAppVersion);
                appId.resRootDir(this.mGeckoRootDir);
                this.mConfig = appId.build();
            } catch (Exception unused) {
                MethodCollector.m14707o(663);
                return;
            }
        }
        if (this.mClient == null) {
            if (this.mConfig != null) {
                try {
                    this.mClient = GeckoClient.create(this.mConfig);
                    this.mListener = new EffectUpdateListener();
                    this.mListener.setUpdateDir(this.mModulesUpdateDir);
                    this.mListener.setModulesDir(this.mModulesDir);
                    this.mListener.setUpdateSuccessFileName("update_success.dummy");
                    this.mListener.setConfig(this.mConfig);
                } catch (Exception unused2) {
                    MethodCollector.m14707o(663);
                    return;
                }
            } else {
                MethodCollector.m14707o(663);
                return;
            }
        }
        if (this.mClient != null && this.mListener != null) {
            this.mClient.checkUpdateMulti("effect_group", this.mListener);
        }
        MethodCollector.m14707o(663);
    }

    public static void createRootDir(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 1).isSupported && ROOT_DIR == null) {
            ROOT_DIR = new File(C116971W2r.LIZIZ(context), "effect_modules");
        }
    }

    public EffectUpdateRunner setAppID(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (EffectUpdateRunner) proxy.result;
        }
        if (!this.mInited) {
            this.mAppID = i;
        }
        return instance();
    }

    public EffectUpdateRunner setAppVersion(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (EffectUpdateRunner) proxy.result;
        }
        if (!this.mInited) {
            this.mAppVersion = str;
        }
        return instance();
    }

    public EffectUpdateRunner setDebugMode(boolean z) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (EffectUpdateRunner) proxy.result;
        }
        if (!this.mInited) {
            this.mDebugMode = z;
        }
        StringBuilder sb = new StringBuilder("Debug mode: ");
        if (z) {
            str = "debug";
        } else {
            str = "online";
        }
        sb.append(str);
        return instance();
    }

    public EffectUpdateRunner setDeviceID(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (EffectUpdateRunner) proxy.result;
        }
        if (!this.mInited) {
            this.mDeviceID = str;
        }
        return instance();
    }

    public synchronized void build(Context context) {
        MethodCollector.m14708i(662);
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 7).isSupported) {
            MethodCollector.m14707o(662);
        } else if (this.mInited) {
            MethodCollector.m14707o(662);
        } else {
            this.mContext = context;
            createRootDir(context);
            this.mGeckoRootDir = new File(ROOT_DIR, "gecko");
            this.mModulesUpdateDir = new File(ROOT_DIR, "modules_update");
            this.mModulesDir = new File(ROOT_DIR, "modules");
            if (!ROOT_DIR.exists()) {
                ROOT_DIR.mkdirs();
            }
            if (!this.mDeviceID.isEmpty() && !this.mAppVersion.isEmpty()) {
                this.mInited = true;
                MethodCollector.m14707o(662);
                return;
            }
            MethodCollector.m14707o(662);
        }
    }
}
