package com.amap.api.mapcore2d;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.cw */
/* loaded from: classes19.dex */
public class C1590cw {

    /* renamed from: a */
    public volatile C1593b f23293a = new C1593b(null);

    /* renamed from: b */
    public C1657el f23294b = new C1657el("HttpsDecisionUtil");

    /* renamed from: com.amap.api.mapcore2d.cw$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C15911 {
        static {
            Covode.recordClassIndex(5139);
        }
    }

    static {
        Covode.recordClassIndex(5138);
    }

    /* renamed from: a */
    public static C1590cw m18013a() {
        return C1592a.f23295a;
    }

    /* renamed from: com.amap.api.mapcore2d.cw$b */
    /* loaded from: classes19.dex */
    public static class C1593b {

        /* renamed from: a */
        public boolean f23296a;

        /* renamed from: b */
        public int f23297b;

        /* renamed from: c */
        public final boolean f23298c;

        /* renamed from: d */
        public boolean f23299d;

        static {
            Covode.recordClassIndex(5141);
        }

        /* renamed from: b */
        private int m17998b() {
            int i = this.f23297b;
            if (i <= 0) {
                return 28;
            }
            return i;
        }

        public C1593b() {
            this.f23296a = true;
            this.f23298c = true;
        }

        /* renamed from: c */
        private boolean m17996c() {
            if (m17998b() >= 28) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private boolean m17995d() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean m18001a() {
            if (!this.f23299d && !m17994e()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private boolean m17994e() {
            boolean z;
            boolean m17995d = m17995d();
            if (this.f23296a && !m17996c()) {
                z = false;
            } else {
                z = true;
            }
            if (!m17995d || !z) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C1593b(C15911 c15911) {
            this();
        }

        /* renamed from: a */
        public void m17999a(boolean z) {
            this.f23296a = z;
        }

        /* renamed from: b */
        public void m17997b(boolean z) {
            this.f23299d = z;
        }

        /* renamed from: a */
        public void m18000a(Context context) {
            if (context != null && this.f23297b <= 0) {
                int i = Build.VERSION.SDK_INT;
                this.f23297b = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }
    }

    /* renamed from: com.amap.api.mapcore2d.cw$a */
    /* loaded from: classes19.dex */
    public static class C1592a {

        /* renamed from: a */
        public static C1590cw f23295a = new C1590cw();

        static {
            Covode.recordClassIndex(5140);
        }
    }

    /* renamed from: c */
    public static boolean m18004c() {
        if (Build.VERSION.SDK_INT == 19) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m18008b() {
        if (this.f23293a == null) {
            this.f23293a = new C1593b(null);
        }
        return this.f23293a.m18001a();
    }

    /* renamed from: b */
    public void m18007b(Context context) {
        m18002d(context);
    }

    /* renamed from: d */
    private void m18002d(Context context) {
        this.f23294b.m17677a(context, "isTargetRequired", true);
    }

    /* renamed from: c */
    private boolean m18003c(Context context) {
        return this.f23294b.m17675b(context, "isTargetRequired", true);
    }

    /* renamed from: a */
    public void m18012a(Context context) {
        if (this.f23293a == null) {
            this.f23293a = new C1593b(null);
        }
        this.f23293a.m17999a(m18003c(context));
        this.f23293a.m18000a(context);
    }

    /* renamed from: a */
    public static String m18010a(String str) {
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
    public boolean m18005b(boolean z) {
        if (m18004c()) {
            return false;
        }
        if (!z && !m18008b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m18009a(boolean z) {
        if (this.f23293a == null) {
            this.f23293a = new C1593b(null);
        }
        this.f23293a.m17997b(z);
    }

    /* renamed from: b */
    private void m18006b(Context context, boolean z) {
        this.f23294b.m17677a(context, "isTargetRequired", z);
    }

    /* renamed from: a */
    public void m18011a(Context context, boolean z) {
        if (this.f23293a == null) {
            this.f23293a = new C1593b(null);
        }
        m18006b(context, z);
        this.f23293a.m17999a(z);
    }
}
