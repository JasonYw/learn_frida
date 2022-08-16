package anet.channel.p022a;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.C0508b;
import anet.channel.fulltrace.IFullTraceAnalysis;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.fulltrace.RequestInfo;
import com.taobao.analysis.scene.SceneIdentifier;
import p003X.C116971W2r;

/* renamed from: anet.channel.a.a */
/* loaded from: classes20.dex */
public class C0461a implements IFullTraceAnalysis {

    /* renamed from: a */
    public boolean f20407a;

    static {
        Covode.recordClassIndex(2150);
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public String createRequest() {
        if (this.f20407a) {
            return FullTraceAnalysis.getInstance().createRequest("network");
        }
        return null;
    }

    public C0461a() {
        try {
            C116971W2r.LIZ("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            SceneIdentifier.setContext(GlobalAppRuntimeInfo.getContext());
            this.f20407a = true;
        } catch (Exception unused) {
            this.f20407a = false;
            ALog.m20786e("awcn.DefaultFullTraceAnalysis", "not supoort FullTraceAnalysis", null, new Object[0]);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public C0508b getSceneInfo() {
        if (this.f20407a) {
            C0508b c0508b = new C0508b();
            c0508b.f20515b = SceneIdentifier.isUrlLaunch();
            c0508b.f20516c = SceneIdentifier.getAppLaunchTime();
            c0508b.f20517d = SceneIdentifier.getLastLaunchTime();
            c0508b.f20518e = SceneIdentifier.getDeviceLevel();
            c0508b.f20514a = SceneIdentifier.getStartType();
            c0508b.f20519f = SceneIdentifier.getBucketInfo();
            c0508b.f20520g = ABTestCenter.getUTABTestBucketId("networksdk");
            return c0508b;
        }
        return null;
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void commitRequest(String str, RequestStatistic requestStatistic) {
        if (this.f20407a && requestStatistic != null && !TextUtils.isEmpty(str)) {
            RequestInfo requestInfo = new RequestInfo();
            requestInfo.host = requestStatistic.host;
            requestInfo.bizId = requestStatistic.bizId;
            requestInfo.url = requestStatistic.url;
            requestInfo.retryTimes = requestStatistic.retryTimes;
            requestInfo.netType = requestStatistic.netType;
            requestInfo.protocolType = requestStatistic.protocolType;
            requestInfo.ret = requestStatistic.ret;
            requestInfo.isCbMain = false;
            requestInfo.isReqMain = requestStatistic.isReqMain;
            requestInfo.isReqSync = requestStatistic.isReqSync;
            requestInfo.netErrorCode = String.valueOf(requestStatistic.statusCode);
            requestInfo.pTraceId = requestStatistic.pTraceId;
            requestInfo.netReqStart = requestStatistic.netReqStart;
            requestInfo.netReqServiceBindEnd = requestStatistic.reqServiceTransmissionEnd;
            requestInfo.netReqProcessStart = requestStatistic.reqStart;
            requestInfo.netReqSendStart = requestStatistic.sendStart;
            requestInfo.netRspRecvEnd = requestStatistic.rspEnd;
            requestInfo.netRspCbDispatch = requestStatistic.rspCbDispatch;
            requestInfo.netRspCbStart = requestStatistic.rspCbStart;
            requestInfo.netRspCbEnd = requestStatistic.rspCbEnd;
            requestInfo.reqDeflateSize = requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize;
            requestInfo.reqInflateSize = requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize;
            requestInfo.rspDeflateSize = requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize;
            requestInfo.rspInflateSize = requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize;
            requestInfo.serverRT = requestStatistic.serverRT;
            requestInfo.sendDataTime = requestStatistic.sendDataTime;
            requestInfo.firstDataTime = requestStatistic.firstDataTime;
            requestInfo.recvDataTime = requestStatistic.recDataTime;
            FullTraceAnalysis.getInstance().commitRequest(str, "network", requestInfo);
        }
    }
}
