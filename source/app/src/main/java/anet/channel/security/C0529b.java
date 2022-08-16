package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p003X.C116971W2r;

/* renamed from: anet.channel.security.b */
/* loaded from: classes2.dex */
public class C0529b implements ISecurity {

    /* renamed from: a */
    public static String f20620a = "awcn.DefaultSecurityGuard";

    /* renamed from: b */
    public static boolean f20621b;

    /* renamed from: c */
    public static Map<String, Integer> f20622c;

    /* renamed from: d */
    public String f20623d;

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return false;
    }

    static {
        Covode.recordClassIndex(2245);
        try {
            C116971W2r.LIZ("com.alibaba.wireless.security.open.SecurityGuardManager");
            f20621b = true;
            HashMap hashMap = new HashMap();
            f20622c = hashMap;
            hashMap.put("HMAC_SHA1", 3);
            f20622c.put("ASE128", 16);
        } catch (Throwable unused) {
            f20621b = false;
        }
    }

    public C0529b(String str) {
        this.f20623d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        byte[] bArr = null;
        bArr = null;
        bArr = null;
        String str2 = 0;
        bArr = null;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
                if (securityGuardManager != null && (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) != null) {
                    str2 = dynamicDataStoreComp.getByteArray(str);
                    return str2;
                }
            } catch (Throwable th) {
                ALog.m20787e(f20620a, "getBytes", str2, th, new Object[0]);
                bArr = str2;
            }
        }
        return bArr;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context != null && bArr != null && !TextUtils.isEmpty(str)) {
            try {
                SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
                if (securityGuardManager != null && (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) != null) {
                    if (dynamicDataStoreComp.putByteArray(str, bArr) != 0) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                ALog.m20787e(f20620a, "saveBytes", null, th, new Object[0]);
            }
        }
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        Integer num;
        IStaticDataEncryptComponent staticDataEncryptComp;
        if (!f20621b || context == null || bArr == null || TextUtils.isEmpty(str2) || !f20622c.containsKey(str) || (num = f20622c.get(str)) == null) {
            return null;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager != null && (staticDataEncryptComp = securityGuardManager.getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticBinarySafeDecryptNoB64(num.intValue(), str2, bArr, this.f20623d);
            }
        } catch (Throwable th) {
            ALog.m20787e(f20620a, "staticBinarySafeDecryptNoB64", null, th, new Object[0]);
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (f20621b && context != null && !TextUtils.isEmpty(str2) && f20622c.containsKey(str)) {
            try {
                ISecureSignatureComponent secureSignatureComp = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
                if (secureSignatureComp != null) {
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str2;
                    securityGuardParamContext.paramMap.put("INPUT", str3);
                    securityGuardParamContext.requestType = f20622c.get(str).intValue();
                    return secureSignatureComp.signRequest(securityGuardParamContext, this.f20623d);
                }
            } catch (Throwable th) {
                ALog.m20787e(f20620a, "Securityguard sign request failed.", null, th, new Object[0]);
            }
        }
        return null;
    }
}
