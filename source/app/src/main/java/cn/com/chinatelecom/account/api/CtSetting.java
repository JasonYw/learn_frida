package cn.com.chinatelecom.account.api;

import com.bytedance.covode.number.Covode;
import p003X.TFG;

/* loaded from: classes2.dex */
public class CtSetting {
    public int connTimeout;
    public int readTimeout;
    public int totalTimeout;

    static {
        Covode.recordClassIndex(2675);
    }

    public CtSetting() {
    }

    public CtSetting(int i, int i2, int i3) {
        this.connTimeout = i;
        this.readTimeout = i2;
        this.totalTimeout = i3;
    }

    public static int getConnTimeout(CtSetting ctSetting) {
        int i;
        return (ctSetting == null || (i = ctSetting.connTimeout) <= 0) ? TFG.LIZIZ : i;
    }

    public static int getReadTimeout(CtSetting ctSetting) {
        int i;
        return (ctSetting == null || (i = ctSetting.readTimeout) <= 0) ? TFG.LIZIZ : i;
    }

    public static int getTotalTimeout(CtSetting ctSetting) {
        int i;
        if (ctSetting == null || (i = ctSetting.totalTimeout) <= 0) {
            return 10000;
        }
        return i;
    }

    public void setConnTimeout(int i) {
        this.connTimeout = i;
    }

    public void setReadTimeout(int i) {
        this.readTimeout = i;
    }

    public void setTotalTimeout(int i) {
        this.totalTimeout = i;
    }
}
