package anet.channel.fulltrace;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.fulltrace.a */
/* loaded from: classes2.dex */
public class C0506a {

    /* renamed from: a */
    public static volatile IFullTraceAnalysis f20511a = new C0507a(null);

    /* renamed from: b */
    public static boolean f20512b = false;

    /* renamed from: a */
    public static IFullTraceAnalysis m20987a() {
        return f20511a;
    }

    /* renamed from: anet.channel.fulltrace.a$a */
    /* loaded from: classes2.dex */
    public static class C0507a implements IFullTraceAnalysis {

        /* renamed from: a */
        public IFullTraceAnalysis f20513a;

        static {
            Covode.recordClassIndex(2211);
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public String createRequest() {
            String str = null;
            if (!C0506a.f20512b) {
                return null;
            }
            IFullTraceAnalysis iFullTraceAnalysis = this.f20513a;
            if (iFullTraceAnalysis != null) {
                try {
                    str = iFullTraceAnalysis.createRequest();
                    return str;
                } catch (Throwable th) {
                    boolean unused = C0506a.f20512b = false;
                    ALog.m20787e("anet.AnalysisFactory", "createRequest fail.", str, th, new Object[0]);
                }
            }
            return str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [anet.channel.fulltrace.b] */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public C0508b getSceneInfo() {
            C0508b c0508b = null;
            String str = 0;
            if (!C0506a.f20512b) {
                return null;
            }
            IFullTraceAnalysis iFullTraceAnalysis = this.f20513a;
            if (iFullTraceAnalysis != null) {
                try {
                    str = iFullTraceAnalysis.getSceneInfo();
                    return str;
                } catch (Throwable th) {
                    boolean unused = C0506a.f20512b = false;
                    ALog.m20787e("anet.AnalysisFactory", "getSceneInfo fail", str, th, new Object[0]);
                    c0508b = str;
                }
            }
            return c0508b;
        }

        public C0507a(IFullTraceAnalysis iFullTraceAnalysis) {
            this.f20513a = iFullTraceAnalysis;
            boolean unused = C0506a.f20512b = true;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public void commitRequest(String str, RequestStatistic requestStatistic) {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (C0506a.f20512b && (iFullTraceAnalysis = this.f20513a) != null) {
                try {
                    iFullTraceAnalysis.commitRequest(str, requestStatistic);
                } catch (Throwable th) {
                    boolean unused = C0506a.f20512b = false;
                    ALog.m20787e("anet.AnalysisFactory", "fulltrace commit fail.", null, th, new Object[0]);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(2210);
    }

    /* renamed from: a */
    public static void m20986a(IFullTraceAnalysis iFullTraceAnalysis) {
        f20511a = new C0507a(iFullTraceAnalysis);
    }
}
