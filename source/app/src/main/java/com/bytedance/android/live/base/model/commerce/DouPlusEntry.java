package com.bytedance.android.live.base.model.commerce;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class DouPlusEntry implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String douPlusEntry;
    public boolean enableShareEntry;
    public boolean hasDouPlusEntry;
    public boolean isEcpEntryMode;
    public HashMap<String, String> urlParams = new HashMap<>();
    public HashMap<String, String> dialogParams = new HashMap<>();

    static {
        Covode.recordClassIndex(13997);
    }

    public static DouPlusEntry LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (DouPlusEntry) proxy.result;
        }
        return new DouPlusEntry(false, "");
    }

    public DouPlusEntry(boolean z, String str) {
        this.hasDouPlusEntry = z;
        this.douPlusEntry = str;
    }
}
