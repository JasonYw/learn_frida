package anet.channel.detect;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.detect.i */
/* loaded from: classes20.dex */
public class C0486i implements RequestCb {

    /* renamed from: a */
    public final /* synthetic */ C0485h f20464a;

    static {
        Covode.recordClassIndex(2180);
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z) {
    }

    public C0486i(C0485h c0485h) {
        this.f20464a = c0485h;
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i, Map<String, List<String>> map) {
        this.f20464a.f20458a.reqErrorCode = i;
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        MethodCollector.m14708i(37);
        int i2 = 0;
        ALog.m20785i("anet.HorseRaceDetector", "LongLinkTask request finish", this.f20464a.f20460c, "statusCode", Integer.valueOf(i), "msg", str);
        if (this.f20464a.f20458a.reqErrorCode == 0) {
            this.f20464a.f20458a.reqErrorCode = i;
        } else {
            HorseRaceStat horseRaceStat = this.f20464a.f20458a;
            if (this.f20464a.f20458a.reqErrorCode == 200) {
                i2 = 1;
            }
            horseRaceStat.reqRet = i2;
        }
        this.f20464a.f20458a.reqTime = (System.currentTimeMillis() - this.f20464a.f20459b) + this.f20464a.f20458a.connTime;
        synchronized (this.f20464a.f20458a) {
            try {
                this.f20464a.f20458a.notify();
            } catch (Throwable th) {
                MethodCollector.m14707o(37);
                throw th;
            }
        }
        MethodCollector.m14707o(37);
    }
}
