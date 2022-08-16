package com.amap.api.services.core;

import com.amap.api.services.p126a.C1810aj;
import com.amap.api.services.p126a.C1874bh;
import com.amap.api.services.p126a.C1883bl;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;
import p003X.TFG;

/* loaded from: classes19.dex */
public class ServiceSettings {

    /* renamed from: c */
    public static ServiceSettings f24984c;

    /* renamed from: a */
    public String f24985a = "zh-CN";

    /* renamed from: b */
    public int f24986b = 1;

    /* renamed from: d */
    public int f24987d = 20000;

    /* renamed from: e */
    public int f24988e = 20000;

    static {
        Covode.recordClassIndex(5682);
    }

    public int getConnectionTimeOut() {
        return this.f24987d;
    }

    public String getLanguage() {
        return this.f24985a;
    }

    public int getProtocol() {
        return this.f24986b;
    }

    public int getSoTimeOut() {
        return this.f24988e;
    }

    public static ServiceSettings getInstance() {
        if (f24984c == null) {
            f24984c = new ServiceSettings();
        }
        return f24984c;
    }

    public void destroyInnerAsynThreadPool() {
        try {
            C1810aj.m17070b();
        } catch (Throwable th) {
            C2007j.m16371a(th, "ServiceSettings", "destroyInnerAsynThreadPool");
        }
    }

    public void setApiKey(String str) {
        C1874bh.m16938a(str);
    }

    public void setConnectionTimeOut(int i) {
        if (i < 5000) {
            this.f24987d = TFG.LIZIZ;
        } else if (i > 30000) {
            this.f24987d = 30000;
        } else {
            this.f24987d = i;
        }
    }

    public void setLanguage(String str) {
        if ("en".equals(str) || "zh-CN".equals(str)) {
            this.f24985a = str;
        }
    }

    public void setProtocol(int i) {
        boolean z;
        this.f24986b = i;
        C1883bl m16855a = C1883bl.m16855a();
        if (this.f24986b == 2) {
            z = true;
        } else {
            z = false;
        }
        m16855a.m16851a(z);
    }

    public void setSoTimeOut(int i) {
        if (i < 5000) {
            this.f24988e = TFG.LIZIZ;
        } else if (i > 30000) {
            this.f24988e = 30000;
        } else {
            this.f24988e = i;
        }
    }
}
