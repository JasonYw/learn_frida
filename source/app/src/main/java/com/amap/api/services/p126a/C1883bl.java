package com.amap.api.services.p126a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.bl */
/* loaded from: classes19.dex */
public class C1883bl {

    /* renamed from: a */
    public volatile C1886b f24514a = new C1886b(null);

    /* renamed from: b */
    public C1942cx f24515b = new C1942cx("HttpsDecisionUtil");

    /* renamed from: com.amap.api.services.a.bl$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C18841 {
        static {
            Covode.recordClassIndex(5495);
        }
    }

    static {
        Covode.recordClassIndex(5494);
    }

    /* renamed from: a */
    public static C1883bl m16855a() {
        return C1885a.f24516a;
    }

    /* renamed from: com.amap.api.services.a.bl$b */
    /* loaded from: classes19.dex */
    public static class C1886b {

        /* renamed from: a */
        public boolean f24517a;

        /* renamed from: b */
        public int f24518b;

        /* renamed from: c */
        public final boolean f24519c;

        /* renamed from: d */
        public boolean f24520d;

        static {
            Covode.recordClassIndex(5497);
        }

        /* renamed from: b */
        private int m16840b() {
            int i = this.f24518b;
            if (i <= 0) {
                return 28;
            }
            return i;
        }

        public C1886b() {
            this.f24517a = true;
            this.f24519c = true;
        }

        /* renamed from: c */
        private boolean m16838c() {
            if (m16840b() >= 28) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private boolean m16837d() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean m16843a() {
            if (!this.f24520d && !m16836e()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private boolean m16836e() {
            boolean z;
            boolean m16837d = m16837d();
            if (this.f24517a && !m16838c()) {
                z = false;
            } else {
                z = true;
            }
            if (!m16837d || !z) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C1886b(C18841 c18841) {
            this();
        }

        /* renamed from: a */
        public void m16841a(boolean z) {
            this.f24517a = z;
        }

        /* renamed from: b */
        public void m16839b(boolean z) {
            this.f24520d = z;
        }

        /* renamed from: a */
        public void m16842a(Context context) {
            if (context != null && this.f24518b <= 0) {
                int i = Build.VERSION.SDK_INT;
                this.f24518b = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }
    }

    /* renamed from: com.amap.api.services.a.bl$a */
    /* loaded from: classes19.dex */
    public static class C1885a {

        /* renamed from: a */
        public static C1883bl f24516a = new C1883bl();

        static {
            Covode.recordClassIndex(5496);
        }
    }

    /* renamed from: c */
    public static boolean m16846c() {
        if (Build.VERSION.SDK_INT == 19) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m16850b() {
        if (this.f24514a == null) {
            this.f24514a = new C1886b(null);
        }
        return this.f24514a.m16843a();
    }

    /* renamed from: b */
    public void m16849b(Context context) {
        m16844d(context);
    }

    /* renamed from: d */
    private void m16844d(Context context) {
        this.f24515b.m16564a(context, "isTargetRequired", true);
    }

    /* renamed from: c */
    private boolean m16845c(Context context) {
        return this.f24515b.m16562b(context, "isTargetRequired", true);
    }

    /* renamed from: a */
    public void m16854a(Context context) {
        if (this.f24514a == null) {
            this.f24514a = new C1886b(null);
        }
        this.f24514a.m16841a(m16845c(context));
        this.f24514a.m16842a(context);
    }

    /* renamed from: a */
    public static String m16852a(String str) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("https")) {
            try {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.scheme("https");
                return buildUpon.build().toString();
            } catch (Throwable unused) {
                return str;
            }
        }
        return str;
    }

    /* renamed from: b */
    public boolean m16847b(boolean z) {
        if (m16846c()) {
            return false;
        }
        if (!z && !m16850b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m16851a(boolean z) {
        if (this.f24514a == null) {
            this.f24514a = new C1886b(null);
        }
        this.f24514a.m16839b(z);
    }

    /* renamed from: b */
    private void m16848b(Context context, boolean z) {
        this.f24515b.m16564a(context, "isTargetRequired", z);
    }

    /* renamed from: a */
    public void m16853a(Context context, boolean z) {
        if (this.f24514a == null) {
            this.f24514a = new C1886b(null);
        }
        m16848b(context, z);
        this.f24514a.m16841a(z);
    }
}
