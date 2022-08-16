package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dalvik.system.DexFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.api.services.a.cu */
/* loaded from: classes19.dex */
public abstract class AbstractC1938cu extends ClassLoader {

    /* renamed from: a */
    public final Context f24660a;

    /* renamed from: e */
    public C1889bo f24664e;

    /* renamed from: f */
    public String f24665f;

    /* renamed from: b */
    public final Map<String, Class<?>> f24661b = new HashMap();

    /* renamed from: c */
    public DexFile f24662c = null;

    /* renamed from: d */
    public volatile boolean f24663d = true;

    /* renamed from: g */
    public volatile boolean f24666g = false;

    /* renamed from: h */
    public volatile boolean f24667h = false;

    static {
        Covode.recordClassIndex(5549);
    }

    /* renamed from: a */
    public boolean m16578a() {
        if (this.f24662c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m16577b() {
        try {
            synchronized (this.f24661b) {
                this.f24661b.clear();
            }
            if (this.f24662c != null) {
                if (this.f24667h) {
                    synchronized (this.f24662c) {
                        this.f24662c.wait();
                    }
                }
                this.f24666g = true;
                this.f24662c.close();
            }
        } catch (Throwable th) {
            C1935ct.m16581a(th, "BaseLoader", "releaseDexFile()");
        }
    }

    public AbstractC1938cu(Context context, C1889bo c1889bo, boolean z) {
        super(context.getClassLoader());
        this.f24660a = context;
        this.f24664e = c1889bo;
    }
}
