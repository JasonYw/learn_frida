package anet.channel.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class ALog {
    public static volatile ILog log;
    public static Logcat logcat;
    public static Object LOG_BREAK = "|";
    public static boolean isPrintLog = true;
    public static boolean canUseTlog = true;

    /* loaded from: classes2.dex */
    public interface ILog {
        static {
            Covode.recordClassIndex(2356);
        }

        /* renamed from: d */
        void mo20782d(String str, String str2);

        /* renamed from: e */
        void mo20781e(String str, String str2);

        /* renamed from: e */
        void mo20780e(String str, String str2, Throwable th);

        /* renamed from: i */
        void mo20779i(String str, String str2);

        boolean isPrintLog(int i);

        boolean isValid();

        void setLogLevel(int i);

        /* renamed from: w */
        void mo20778w(String str, String str2);

        /* renamed from: w */
        void mo20777w(String str, String str2, Throwable th);
    }

    /* loaded from: classes2.dex */
    public static class Level {
        static {
            Covode.recordClassIndex(2357);
        }
    }

    public static String buildLogTag(String str) {
        return str;
    }

    public static ILog getLog() {
        return log;
    }

    static {
        Covode.recordClassIndex(2355);
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
    }

    public static void setPrintLog(boolean z) {
        isPrintLog = z;
    }

    /* loaded from: classes2.dex */
    public static class Logcat implements ILog {
        public int defaultLevel = 1;

        static {
            Covode.recordClassIndex(2358);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: d */
        public void mo20782d(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo20781e(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo20780e(String str, String str2, Throwable th) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: i */
        public void mo20779i(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isValid() {
            return true;
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo20778w(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo20777w(String str, String str2, Throwable th) {
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isPrintLog(int i) {
            if (i >= this.defaultLevel) {
                return true;
            }
            return false;
        }

        @Override // anet.channel.util.ALog.ILog
        public void setLogLevel(int i) {
            if (i >= 0 && i <= 5) {
                this.defaultLevel = i;
            } else {
                this.defaultLevel = 5;
            }
        }
    }

    public static void setLevel(int i) {
        if (log != null) {
            log.setLogLevel(i);
        }
    }

    public static void setUseTlog(boolean z) {
        if (!z) {
            canUseTlog = false;
            log = logcat;
            return;
        }
        canUseTlog = true;
    }

    public static boolean isPrintLog(int i) {
        if (!isPrintLog || log == null) {
            return false;
        }
        return log.isPrintLog(i);
    }

    public static void setLog(ILog iLog) {
        if (iLog == null) {
            return;
        }
        if ((!canUseTlog && iLog.getClass().getSimpleName().toLowerCase().contains("tlog")) || !iLog.isValid()) {
            return;
        }
        log = iLog;
    }

    public static String buildLogMsg(String str, String str2, Object... objArr) {
        Object obj;
        Object obj2;
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(LOG_BREAK);
            sb.append("[seq:");
            sb.append(str2);
            sb.append("]");
        }
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                if (objArr[i] == null) {
                    obj = "";
                } else {
                    obj = objArr[i];
                }
                sb.append(obj);
                sb.append(Constants.COLON_SEPARATOR);
                if (objArr[i2] == null) {
                    obj2 = "";
                } else {
                    obj2 = objArr[i2];
                }
                sb.append(obj2);
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m20788d(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(1) && log != null) {
            ILog iLog = log;
            buildLogTag(str);
            iLog.mo20782d(str, buildLogMsg(str2, str3, objArr));
        }
    }

    /* renamed from: i */
    public static void m20785i(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(2) && log != null) {
            ILog iLog = log;
            buildLogTag(str);
            iLog.mo20779i(str, buildLogMsg(str2, str3, objArr));
        }
    }

    /* renamed from: e */
    public static void m20786e(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(4) && log != null) {
            ILog iLog = log;
            buildLogTag(str);
            iLog.mo20781e(str, buildLogMsg(str2, str3, objArr));
        }
    }

    /* renamed from: w */
    public static void m20783w(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(3) && log != null) {
            ILog iLog = log;
            buildLogTag(str);
            iLog.mo20778w(str, buildLogMsg(str2, str3, objArr));
        }
    }

    /* renamed from: e */
    public static void m20787e(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (isPrintLog(4) && log != null) {
            ILog iLog = log;
            buildLogTag(str);
            iLog.mo20780e(str, buildLogMsg(str2, str3, objArr), th);
        }
    }

    /* renamed from: w */
    public static void m20784w(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (isPrintLog(3) && log != null) {
            ILog iLog = log;
            buildLogTag(str);
            iLog.mo20777w(str, buildLogMsg(str2, str3, objArr), th);
        }
    }
}
