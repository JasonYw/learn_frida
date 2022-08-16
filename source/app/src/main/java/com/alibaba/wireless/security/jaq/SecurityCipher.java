package com.alibaba.wireless.security.jaq;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class SecurityCipher {

    /* renamed from: a */
    public Context f21824a;

    static {
        Covode.recordClassIndex(4559);
    }

    public SecurityCipher(Context context) {
        if (context != null) {
            this.f21824a = context.getApplicationContext();
        }
    }

    public String atlasEncryptString(String str) {
        try {
            IAtlasEncryptComponent atlasEncryptComp = SecurityGuardManager.getInstance(this.f21824a).getAtlasEncryptComp();
            if (atlasEncryptComp == null) {
                throw new SecException(1098);
            }
            return atlasEncryptComp.atlasSafeEncrypt(str, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public byte[] decryptBinary(byte[] bArr, String str) {
        try {
            return SecurityGuardManager.getInstance(this.f21824a).getStaticDataEncryptComp().staticBinarySafeDecrypt(16, str, bArr, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public String decryptString(String str, String str2) {
        try {
            return SecurityGuardManager.getInstance(this.f21824a).getStaticDataEncryptComp().staticSafeDecrypt(16, str2, str, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public byte[] encryptBinary(byte[] bArr, String str) {
        try {
            return SecurityGuardManager.getInstance(this.f21824a).getStaticDataEncryptComp().staticBinarySafeEncrypt(16, str, bArr, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public String encryptString(String str, String str2) {
        try {
            return SecurityGuardManager.getInstance(this.f21824a).getStaticDataEncryptComp().staticSafeEncrypt(16, str2, str, "0335");
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }
}
