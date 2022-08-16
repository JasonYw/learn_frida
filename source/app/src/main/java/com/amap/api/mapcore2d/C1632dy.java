package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;

/* renamed from: com.amap.api.mapcore2d.dy */
/* loaded from: classes19.dex */
public class C1632dy {

    /* renamed from: a */
    public C1627dt f23406a;

    /* renamed from: b */
    public Context f23407b;

    static {
        Covode.recordClassIndex(5180);
    }

    /* renamed from: a */
    public List<C1599da> m17800a() {
        try {
            return this.f23406a.m17813a(C1599da.m17961h(), C1599da.class, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void m17798a(C1599da c1599da) {
        if (c1599da == null) {
            return;
        }
        try {
            if (this.f23406a == null) {
                this.f23406a = m17799a(this.f23407b, false);
            }
            String m17971a = C1599da.m17971a(c1599da.m17972a());
            List<C1599da> m17806b = this.f23406a.m17806b(m17971a, C1599da.class);
            if (m17806b != null && m17806b.size() != 0) {
                if (m17797a(m17806b, c1599da)) {
                    this.f23406a.m17812a(m17971a, c1599da);
                    return;
                }
                return;
            }
            this.f23406a.m17819a((C1627dt) c1599da);
        } catch (Throwable th) {
            C1616do.m17866c(th, "sd", AdvanceSetting.NETWORK_TYPE);
        }
    }

    public C1632dy(Context context, boolean z) {
        this.f23407b = context;
        this.f23406a = m17799a(this.f23407b, z);
    }

    /* renamed from: a */
    private C1627dt m17799a(Context context, boolean z) {
        try {
            return new C1627dt(context, C1627dt.m17821a((Class<? extends AbstractC1626ds>) C1631dx.class));
        } catch (Throwable th) {
            if (!z) {
                C1616do.m17866c(th, "sd", "gdb");
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    private boolean m17797a(List<C1599da> list, C1599da c1599da) {
        for (C1599da c1599da2 : list) {
            if (c1599da2.equals(c1599da)) {
                return false;
            }
        }
        return true;
    }
}
