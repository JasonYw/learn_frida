package com.alipay.sdk.p082m.p111o;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alipay.sdk.p082m.p122w.C1405b;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;

/* renamed from: com.alipay.sdk.m.o.a */
/* loaded from: classes2.dex */
public final class C1344a {

    /* renamed from: c */
    public static final CookieManager f22301c = new CookieManager();

    static {
        Covode.recordClassIndex(4844);
    }

    /* renamed from: com.alipay.sdk.m.o.a$a */
    /* loaded from: classes2.dex */
    public static final class C1345a {

        /* renamed from: a */
        public final String f22302a;

        /* renamed from: b */
        public final byte[] f22303b;

        /* renamed from: c */
        public final Map<String, String> f22304c;

        static {
            Covode.recordClassIndex(4845);
        }

        public final String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f22302a, this.f22304c);
        }

        public C1345a(String str, Map<String, String> map, byte[] bArr) {
            this.f22302a = str;
            this.f22303b = bArr;
            this.f22304c = map;
        }
    }

    /* renamed from: a */
    public static byte[] m19034a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
        while (true) {
            int read = inputStream.read(bArr, 0, AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: a */
    public static String m19036a(Context context) {
        try {
            NetworkInfo m18752a = C1405b.m18752a(null, context);
            if (m18752a != null && m18752a.isAvailable()) {
                if (m18752a.getType() == 1) {
                    return "wifi";
                }
                return m18752a.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    /* renamed from: b */
    public static Proxy m19033b(Context context) {
        String m19036a = m19036a(context);
        if (m19036a != null && !m19036a.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.sdk.p082m.p111o.C1344a.C1346b m19035a(android.content.Context r11, com.alipay.sdk.p082m.p111o.C1344a.C1345a r12) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p111o.C1344a.m19035a(android.content.Context, com.alipay.sdk.m.o.a$a):com.alipay.sdk.m.o.a$b");
    }

    /* renamed from: com.alipay.sdk.m.o.a$b */
    /* loaded from: classes2.dex */
    public static final class C1346b {

        /* renamed from: a */
        public final Map<String, List<String>> f22305a;

        /* renamed from: b */
        public final String f22306b;

        /* renamed from: c */
        public final byte[] f22307c;

        static {
            Covode.recordClassIndex(4846);
        }

        public C1346b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f22305a = map;
            this.f22306b = str;
            this.f22307c = bArr;
        }
    }
}
