package anet.channel.p025d;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.taobao.tlog.adapter.AdapterForTLog;

/* renamed from: anet.channel.d.a */
/* loaded from: classes2.dex */
public class C0476a implements ALog.ILog {
    static {
        Covode.recordClassIndex(2168);
    }

    /* renamed from: a */
    private int m21042a(char c) {
        if (c != 'D') {
            if (c == 'E') {
                return 4;
            }
            if (c == 'I') {
                return 2;
            }
            if (c == 'V') {
                return 0;
            }
            return c != 'W' ? 5 : 3;
        }
        return 1;
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i) {
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        return AdapterForTLog.isValid();
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i) {
        if (i < m21042a(AdapterForTLog.getLogLevel().charAt(0))) {
            return false;
        }
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo20782d(String str, String str2) {
        AdapterForTLog.logd(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo20781e(String str, String str2) {
        AdapterForTLog.loge(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo20779i(String str, String str2) {
        AdapterForTLog.logi(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo20778w(String str, String str2) {
        AdapterForTLog.logw(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo20780e(String str, String str2, Throwable th) {
        AdapterForTLog.loge(str, str2, th);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo20777w(String str, String str2, Throwable th) {
        AdapterForTLog.logw(str, str2, th);
    }
}
