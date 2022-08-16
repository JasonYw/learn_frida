package com.alibaba.sdk.android.httpdns.p072c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.alibaba.sdk.android.httpdns.c.a */
/* loaded from: classes19.dex */
public class C1043a {

    /* renamed from: i */
    public int f21553i;

    /* renamed from: q */
    public String f21554q;

    /* renamed from: com.alibaba.sdk.android.httpdns.c.a$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C10441 {
        static {
            Covode.recordClassIndex(4450);
        }
    }

    /* renamed from: com.alibaba.sdk.android.httpdns.c.a$a */
    /* loaded from: classes19.dex */
    public static final class C1045a {

        /* renamed from: b */
        public static final C1043a f21555b = new C1043a(null);

        static {
            Covode.recordClassIndex(4451);
        }
    }

    static {
        Covode.recordClassIndex(4449);
    }

    public C1043a() {
        this.f21554q = "UNKNOWN";
    }

    public /* synthetic */ C1043a(C10441 c10441) {
        this();
    }

    /* renamed from: a */
    private int m19944a(Context context) {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo LIZ = C116971W2r.LIZ(connectivityManager);
        if (LIZ != null && LIZ.isAvailable() && LIZ.isConnected()) {
            if (LIZ.getType() == 1) {
                return 1;
            }
            if (LIZ.getType() != 0) {
                return 0;
            }
            switch (LIZ.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case MotionEventCompat.AXIS_HAT_X /* 15 */:
                    return 3;
                case 12:
                case 14:
                default:
                    return 0;
                case 13:
                    return 4;
            }
        }
        return MotionEventCompat.ACTION_MASK;
    }

    /* renamed from: a */
    public static C1043a m19945a() {
        return C1045a.f21555b;
    }

    /* renamed from: a */
    private String m19943a(Context context) {
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            return !TextUtils.isEmpty(simOperator) ? simOperator : "0";
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: b */
    private String m19942b(Context context) {
        return "";
    }

    /* renamed from: d */
    private void m19940d(Context context) {
        String m19942b;
        int m19944a = m19944a(context);
        this.f21553i = m19944a;
        if (m19944a != 0) {
            if (m19944a == 1) {
                m19942b = m19942b(context);
            } else if (m19944a == 2 || m19944a == 3 || m19944a == 4) {
                m19942b = m19943a(context);
            }
            this.f21554q = m19942b;
        }
        if (TextUtils.isEmpty(this.f21554q)) {
            this.f21554q = "UNKNOWN";
        }
    }

    /* renamed from: c */
    public void m19941c(Context context) {
        m19940d(context);
    }

    public int getNetworkType() {
        return this.f21553i;
    }

    /* renamed from: h */
    public boolean m19939h() {
        return this.f21553i == 1;
    }

    /* renamed from: i */
    public String m19938i() {
        return this.f21554q;
    }
}
