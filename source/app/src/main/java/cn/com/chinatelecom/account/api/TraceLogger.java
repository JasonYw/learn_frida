package cn.com.chinatelecom.account.api;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface TraceLogger {
    static {
        Covode.recordClassIndex(2678);
    }

    void debug(String str, String str2);

    void info(String str, String str2);

    void warn(String str, String str2, Throwable th);
}
