package com.byted.cast.proxy;

import android.content.Context;
import com.byted.cast.proxy.impl.CastProxyImpl;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public class CastProxy {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CastProxyImpl impl = new CastProxyImpl();

    static {
        Covode.recordClassIndex(9766);
    }

    public String getVersion() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.impl.getVersion();
    }

    public boolean stop() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.impl.stop();
    }

    public boolean start(Context context, Config config) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, config}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.impl.start(context, config);
    }

    public String proxyUrl(String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.impl.proxyUrl(str, str2, str3);
    }

    public String proxyUrl(String str, String str2, String str3, String str4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.impl.proxyUrl(str, str2, str3, str4);
    }
}
