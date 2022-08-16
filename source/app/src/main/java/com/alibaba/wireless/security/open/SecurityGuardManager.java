package com.alibaba.wireless.security.open;

import android.content.Context;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent;
import com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.initialize.C1135a;
import com.alibaba.wireless.security.open.initialize.C1138c;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.alibaba.wireless.security.open.maldetection.IMalDetect;
import com.alibaba.wireless.security.open.nocaptcha.INoCaptchaComponent;
import com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent;
import com.alibaba.wireless.security.open.pkgvaliditycheck.IPkgValidityCheckComponent;
import com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SecurityGuardManager {

    /* renamed from: b */
    public static volatile SecurityGuardManager f21828b;

    /* renamed from: c */
    public static volatile IInitializeComponent f21829c;

    /* renamed from: d */
    public static final Object f21830d = new Object();

    /* renamed from: e */
    public static JSONObject f21831e = null;

    /* renamed from: g */
    public static Object f21832g = new Object();

    /* renamed from: a */
    public ISGPluginManager f21833a;

    /* renamed from: f */
    public final Map<Integer, Class> f21834f = new HashMap<Integer, Class>() { // from class: com.alibaba.wireless.security.open.SecurityGuardManager.1
        static {
            Covode.recordClassIndex(4566);
        }

        {
            put(1, ISecureSignatureComponent.class);
            put(2, IDynamicDataStoreComponent.class);
            put(3, IStaticDataStoreComponent.class);
            put(5, IDataCollectionComponent.class);
            put(6, IStaticDataEncryptComponent.class);
            put(7, IDynamicDataEncryptComponent.class);
            put(8, ISimulatorDetectComponent.class);
            put(9, IStaticKeyEncryptComponent.class);
            put(10, IOpenSDKComponent.class);
            put(11, IUMIDComponent.class);
            put(12, IPkgValidityCheckComponent.class);
            put(13, IAtlasEncryptComponent.class);
            put(14, IMalDetect.class);
            put(15, INoCaptchaComponent.class);
            put(16, ISafeTokenComponent.class);
            put(17, ISecurityBodyComponent.class);
        }
    };

    static {
        Covode.recordClassIndex(4565);
    }

    public SecurityGuardManager(ISGPluginManager iSGPluginManager) {
        this.f21833a = iSGPluginManager;
    }

    public static String getGlobalUserData() {
        String jSONObject;
        synchronized (f21832g) {
            jSONObject = f21831e.toString();
        }
        return jSONObject;
    }

    public static IInitializeComponent getInitializer() {
        return getInitializer(null);
    }

    public static IInitializeComponent getInitializer(String str) {
        if (f21829c == null) {
            synchronized (f21830d) {
                if (f21829c == null) {
                    f21829c = new C1135a(str);
                }
            }
        }
        return f21829c;
    }

    public static SecurityGuardManager getInstance(Context context) {
        return getInstance(context, null);
    }

    public static SecurityGuardManager getInstance(Context context, String str) {
        if (f21828b == null) {
            synchronized (SecurityGuardManager.class) {
                if (context == null) {
                    return null;
                }
                if (f21828b == null && getInitializer(str).initialize(context) == 0) {
                    f21828b = new SecurityGuardManager(((C1135a) getInitializer(str)).m19683a());
                }
            }
        }
        return f21828b;
    }

    public static boolean setGlobalUserData(String str, String str2) {
        try {
            synchronized (f21832g) {
                if (str == null) {
                    if (str2 == null) {
                        f21831e = null;
                    }
                    throw new SecException(118);
                }
                if (str2 != null) {
                    if (f21831e == null) {
                        f21831e = new JSONObject();
                    }
                    f21831e.put(str, str2);
                }
                throw new SecException(118);
            }
            return true;
        } catch (JSONException e) {
            throw new SecException(e.getMessage(), 119);
        }
    }

    /* renamed from: a */
    public IComponent m19684a(int i) {
        try {
            return (IComponent) getInterface(this.f21834f.get(Integer.valueOf(i)));
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public IAtlasEncryptComponent getAtlasEncryptComp() {
        IAtlasEncryptComponent iAtlasEncryptComponent = (IAtlasEncryptComponent) m19684a(13);
        if (iAtlasEncryptComponent == null) {
            new SecException(1098).printStackTrace();
        }
        return iAtlasEncryptComponent;
    }

    public IDataCollectionComponent getDataCollectionComp() {
        return (IDataCollectionComponent) m19684a(5);
    }

    public IDynamicDataEncryptComponent getDynamicDataEncryptComp() {
        return (IDynamicDataEncryptComponent) m19684a(7);
    }

    public IDynamicDataStoreComponent getDynamicDataStoreComp() {
        return (IDynamicDataStoreComponent) m19684a(2);
    }

    public <T> T getInterface(Class<T> cls) {
        return (T) this.f21833a.getInterface(cls);
    }

    public IMalDetect getMalDetectionComp() {
        IMalDetect iMalDetect = (IMalDetect) m19684a(14);
        if (iMalDetect == null) {
            new SecException(1398).printStackTrace();
        }
        return iMalDetect;
    }

    public INoCaptchaComponent getNoCaptchaComp() {
        INoCaptchaComponent iNoCaptchaComponent = (INoCaptchaComponent) m19684a(15);
        if (iNoCaptchaComponent == null) {
            new SecException(1299).printStackTrace();
        }
        return iNoCaptchaComponent;
    }

    public IOpenSDKComponent getOpenSDKComp() {
        return (IOpenSDKComponent) m19684a(10);
    }

    public IPkgValidityCheckComponent getPackageValidityCheckComp() {
        return (IPkgValidityCheckComponent) m19684a(12);
    }

    public String getSDKVerison() {
        return C1138c.m19672a();
    }

    public ISGPluginManager getSGPluginManager() {
        return this.f21833a;
    }

    public ISafeTokenComponent getSafeTokenComp() {
        ISafeTokenComponent iSafeTokenComponent = (ISafeTokenComponent) m19684a(16);
        if (iSafeTokenComponent == null) {
            new SecException(1699).printStackTrace();
        }
        return iSafeTokenComponent;
    }

    public ISecureSignatureComponent getSecureSignatureComp() {
        return (ISecureSignatureComponent) m19684a(1);
    }

    public ISecurityBodyComponent getSecurityBodyComp() {
        ISecurityBodyComponent iSecurityBodyComponent = (ISecurityBodyComponent) m19684a(17);
        if (iSecurityBodyComponent == null) {
            new SecException(1498).printStackTrace();
        }
        return iSecurityBodyComponent;
    }

    public ISimulatorDetectComponent getSimulatorDetectComp() {
        ISimulatorDetectComponent iSimulatorDetectComponent = (ISimulatorDetectComponent) m19684a(8);
        if (iSimulatorDetectComponent == null) {
            new SecException(1598).printStackTrace();
        }
        return iSimulatorDetectComponent;
    }

    public IStaticDataEncryptComponent getStaticDataEncryptComp() {
        return (IStaticDataEncryptComponent) m19684a(6);
    }

    public IStaticDataStoreComponent getStaticDataStoreComp() {
        return (IStaticDataStoreComponent) m19684a(3);
    }

    public IStaticKeyEncryptComponent getStaticKeyEncryptComp() {
        return (IStaticKeyEncryptComponent) m19684a(9);
    }

    public IUMIDComponent getUMIDComp() {
        return (IUMIDComponent) m19684a(11);
    }

    public Boolean isOpen() {
        return Boolean.TRUE;
    }

    public boolean setReportSwitch(boolean z) {
        IRouterComponent router = this.f21833a.getRouter();
        if (router != null) {
            try {
                router.doCommand(11154, Integer.valueOf(z ? 1 : 0));
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
