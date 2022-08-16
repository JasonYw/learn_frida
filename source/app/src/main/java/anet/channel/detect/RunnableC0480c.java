package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.detect.c */
/* loaded from: classes20.dex */
public class RunnableC0480c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RequestStatistic f20451a;

    /* renamed from: b */
    public final /* synthetic */ ExceptionDetector f20452b;

    static {
        Covode.recordClassIndex(2174);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f20451a == null) {
                return;
            }
            if (!TextUtils.isEmpty(this.f20451a.f20664ip) && this.f20451a.ret == 0) {
                if ("guide-acs.m.taobao.com".equalsIgnoreCase(this.f20451a.host)) {
                    this.f20452b.f20436b = this.f20451a.f20664ip;
                } else if ("msgacs.m.taobao.com".equalsIgnoreCase(this.f20451a.host)) {
                    this.f20452b.f20437c = this.f20451a.f20664ip;
                } else if ("gw.alicdn.com".equalsIgnoreCase(this.f20451a.host)) {
                    this.f20452b.f20438d = this.f20451a.f20664ip;
                }
            }
            if (!TextUtils.isEmpty(this.f20451a.url)) {
                this.f20452b.f20439e.add(Pair.create(this.f20451a.url, Integer.valueOf(this.f20451a.statusCode)));
            }
            if (!this.f20452b.m21034c()) {
                return;
            }
            this.f20452b.m21035b();
        } catch (Throwable th) {
            ALog.m20787e("anet.ExceptionDetector", "network detect fail.", null, th, new Object[0]);
        }
    }

    public RunnableC0480c(ExceptionDetector exceptionDetector, RequestStatistic requestStatistic) {
        this.f20452b = exceptionDetector;
        this.f20451a = requestStatistic;
    }
}
