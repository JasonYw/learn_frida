package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;

/* renamed from: com.amap.api.services.a.ck */
/* loaded from: classes19.dex */
public class C1919ck {

    /* renamed from: a */
    public C1914cf f24599a;

    /* renamed from: b */
    public Context f24600b;

    static {
        Covode.recordClassIndex(5530);
    }

    /* renamed from: a */
    public List<C1889bo> m16671a() {
        try {
            return this.f24599a.m16684a(C1889bo.m16808g(), C1889bo.class, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void m16669a(C1889bo c1889bo) {
        if (c1889bo == null) {
            return;
        }
        try {
            if (this.f24599a == null) {
                this.f24599a = m16670a(this.f24600b, false);
            }
            String m16817a = C1889bo.m16817a(c1889bo.m16818a());
            List<C1889bo> m16677b = this.f24599a.m16677b(m16817a, C1889bo.class);
            if (m16677b != null && m16677b.size() != 0) {
                if (m16668a(m16677b, c1889bo)) {
                    this.f24599a.m16683a(m16817a, c1889bo);
                    return;
                }
                return;
            }
            this.f24599a.m16690a((C1914cf) c1889bo);
        } catch (Throwable th) {
            C1906cb.m16716c(th, "sd", AdvanceSetting.NETWORK_TYPE);
        }
    }

    public C1919ck(Context context, boolean z) {
        this.f24600b = context;
        this.f24599a = m16670a(this.f24600b, z);
    }

    /* renamed from: a */
    private C1914cf m16670a(Context context, boolean z) {
        try {
            return new C1914cf(context, C1914cf.m16692a((Class<? extends AbstractC1913ce>) C1918cj.class));
        } catch (Throwable th) {
            if (!z) {
                C1906cb.m16716c(th, "sd", "gdb");
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    private boolean m16668a(List<C1889bo> list, C1889bo c1889bo) {
        for (C1889bo c1889bo2 : list) {
            if (c1889bo2.equals(c1889bo)) {
                return false;
            }
        }
        return true;
    }
}
