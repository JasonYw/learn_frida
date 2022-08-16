package com.alibaba.wireless.security.jaq;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class SecurityStorage {

    /* renamed from: a */
    public Context f21826a;

    static {
        Covode.recordClassIndex(4562);
    }

    public SecurityStorage(Context context) {
        if (context != null) {
            this.f21826a = context.getApplicationContext();
        }
    }

    public String getString(String str) {
        try {
            return SecurityGuardManager.getInstance(this.f21826a).getDynamicDataStoreComp().getString(str);
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public int putString(String str, String str2) {
        try {
            return SecurityGuardManager.getInstance(this.f21826a).getDynamicDataStoreComp().putString(str, str2);
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }

    public void removeString(String str) {
        try {
            SecurityGuardManager.getInstance(this.f21826a).getDynamicDataStoreComp().removeString(str);
        } catch (SecException e) {
            e.printStackTrace();
            throw new JAQException(e.getErrorCode());
        }
    }
}
