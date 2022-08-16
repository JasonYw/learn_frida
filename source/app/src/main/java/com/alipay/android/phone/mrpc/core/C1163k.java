package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p003X.C116971W2r;

/* renamed from: com.alipay.android.phone.mrpc.core.k */
/* loaded from: classes2.dex */
public final class C1163k {

    /* renamed from: a */
    public static final Pattern f21888a = C116971W2r.LIZJ("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* renamed from: b */
    public static final Pattern f21889b = C116971W2r.LIZJ("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* renamed from: com.alipay.android.phone.mrpc.core.k$a */
    /* loaded from: classes2.dex */
    public static class C1164a {

        /* renamed from: a */
        public int f21890a;

        /* renamed from: b */
        public int f21891b;

        /* renamed from: c */
        public int f21892c;

        static {
            Covode.recordClassIndex(4635);
        }

        public C1164a(int i, int i2, int i3) {
            this.f21890a = i;
            this.f21891b = i2;
            this.f21892c = i3;
        }
    }

    static {
        Covode.recordClassIndex(4634);
    }

    /* renamed from: a */
    public static long m19643a(String str) {
        int m19641c;
        int m19642b;
        C1164a m19639e;
        int m19640d;
        Matcher matcher = f21888a.matcher(str);
        if (matcher.find()) {
            m19642b = m19642b(matcher.group(1));
            m19641c = m19641c(matcher.group(2));
            m19640d = m19640d(matcher.group(3));
            m19639e = m19639e(matcher.group(4));
        } else {
            Matcher matcher2 = f21889b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            m19641c = m19641c(matcher2.group(1));
            m19642b = m19642b(matcher2.group(2));
            m19639e = m19639e(matcher2.group(3));
            m19640d = m19640d(matcher2.group(4));
        }
        if (m19640d >= 2038) {
            m19642b = 1;
            m19641c = 0;
            m19640d = 2038;
        }
        Time time = new Time("UTC");
        time.set(m19639e.f21892c, m19639e.f21891b, m19639e.f21890a, m19642b, m19641c, m19640d);
        return time.toMillis(false);
    }

    /* renamed from: b */
    public static int m19642b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    /* renamed from: c */
    public static int m19641c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase != 9) {
            if (lowerCase == 10) {
                return 1;
            }
            if (lowerCase == 22) {
                return 0;
            }
            if (lowerCase == 26) {
                return 7;
            }
            if (lowerCase == 29) {
                return 2;
            }
            if (lowerCase == 32) {
                return 3;
            }
            if (lowerCase == 40) {
                return 6;
            }
            if (lowerCase == 42) {
                return 5;
            }
            if (lowerCase == 48) {
                return 10;
            }
            switch (lowerCase) {
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    return 9;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    return 4;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    return 8;
                default:
                    throw new IllegalArgumentException();
            }
        }
        return 11;
    }

    /* renamed from: d */
    public static int m19640d(String str) {
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return charAt >= 70 ? charAt + 1900 : charAt + Constants.ASSEMBLE_PUSH_RETRY_INTERVAL;
        } else if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        } else {
            if (str.length() != 4) {
                return 1970;
            }
            return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
        }
    }

    /* renamed from: e */
    public static C1164a m19639e(String str) {
        int i;
        int i2;
        int i3;
        int charAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            i = 2;
            charAt = (charAt * 10) + (str.charAt(1) - '0');
        } else {
            i = 1;
        }
        int i4 = i + 1 + 1 + 1 + 1;
        return new C1164a(charAt, ((str.charAt(i2) - '0') * 10) + (str.charAt(i3) - '0'), ((str.charAt(i4) - '0') * 10) + (str.charAt(i4 + 1) - '0'));
    }
}
