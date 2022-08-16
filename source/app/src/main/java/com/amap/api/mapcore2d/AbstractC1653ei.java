package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dalvik.system.DexFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.api.mapcore2d.ei */
/* loaded from: classes19.dex */
public abstract class AbstractC1653ei extends ClassLoader {

    /* renamed from: a */
    public final Context f23475a;

    /* renamed from: e */
    public C1599da f23479e;

    /* renamed from: f */
    public String f23480f;

    /* renamed from: b */
    public final Map<String, Class<?>> f23476b = new HashMap();

    /* renamed from: c */
    public DexFile f23477c = null;

    /* renamed from: d */
    public volatile boolean f23478d = true;

    /* renamed from: g */
    public volatile boolean f23481g = false;

    /* renamed from: h */
    public volatile boolean f23482h = false;

    static {
        Covode.recordClassIndex(5201);
    }

    /* renamed from: a */
    public boolean m17691a() {
        if (this.f23477c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m17690b() {
        try {
            synchronized (this.f23476b) {
                this.f23476b.clear();
            }
            if (this.f23477c != null) {
                if (this.f23482h) {
                    synchronized (this.f23477c) {
                        this.f23477c.wait();
                    }
                }
                this.f23481g = true;
                this.f23477c.close();
            }
        } catch (Throwable th) {
            C1650eh.m17694a(th, "BaseLoader", "releaseDexFile()");
        }
    }

    public AbstractC1653ei(Context context, C1599da c1599da, boolean z) {
        super(context.getClassLoader());
        this.f23475a = context;
        this.f23479e = c1599da;
    }
}
