package com.bytedance.android.annie.service.resource;

import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.annie.service.resource.h */
/* loaded from: classes7.dex */
public class C2646h {
    public static ChangeQuickRedirect LIZIZ;
    public boolean LIZLLL;
    public boolean LJFF;
    public long LJI;
    public String LIZJ = "";

    /* renamed from: LJ */
    public String f25634LJ = "";

    static {
        Covode.recordClassIndex(11215);
    }

    public WebResourceResponse LIZIZ() {
        return null;
    }

    public byte[] LIZJ() {
        return null;
    }

    public Map<String, Long> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return new LinkedHashMap();
    }

    public C2646h(boolean z) {
    }
}
