package com.alibaba.wireless.security.jaq;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class SecuritySignature {

    /* renamed from: a */
    public Context f21825a;

    static {
        Covode.recordClassIndex(4561);
    }

    public SecuritySignature(Context context) {
        if (context != null) {
            this.f21825a = context.getApplicationContext();
        }
    }

    public String atlasSign(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("INPUT", str);
        hashMap.put("ATLAS", "a");
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = str2;
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 5;
        try {
            if (SecurityGuardManager.getInstance(this.f21825a).getAtlasEncryptComp() == null) {
                throw new SecException(1098);
            }
            return SecurityGuardManager.getInstance(this.f21825a).getSecureSignatureComp().signRequest(securityGuardParamContext, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public String sign(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("INPUT", str);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = str2;
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 3;
        try {
            return SecurityGuardManager.getInstance(this.f21825a).getSecureSignatureComp().signRequest(securityGuardParamContext, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public String signWithSimulator(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("INPUT", str);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = str2;
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 6;
        try {
            return SecurityGuardManager.getInstance(this.f21825a).getSecureSignatureComp().signRequest(securityGuardParamContext, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }
}
