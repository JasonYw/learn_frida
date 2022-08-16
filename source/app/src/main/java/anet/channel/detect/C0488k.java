package anet.channel.detect;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.MtuDetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import p002O.C0002O;

/* renamed from: anet.channel.detect.k */
/* loaded from: classes20.dex */
public class C0488k {

    /* renamed from: a */
    public static HashMap<String, Long> f20467a = new HashMap<>();

    static {
        Covode.recordClassIndex(2182);
    }

    /* renamed from: a */
    public void m21025a() {
        NetworkStatusHelper.addStatusChangeListener(new C0489l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m21022a(String str) {
        String str2;
        if (!AwcnConfig.isNetworkDetectEnable()) {
            ALog.m20785i("anet.MTUDetector", "network detect closed.", null, new Object[0]);
            return;
        }
        ALog.m20785i("anet.MTUDetector", "mtuDetectTask start", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = f20467a.get(str);
        if (l != null && currentTimeMillis < l.longValue()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
        long j = defaultSharedPreferences.getLong(C0002O.m25086C("sp_mtu_", str), 0L);
        if (currentTimeMillis < j) {
            f20467a.put(str, Long.valueOf(j));
            ALog.m20785i("anet.MTUDetector", "mtuDetectTask in period of validity", null, new Object[0]);
            return;
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost("guide-acs.m.taobao.com");
        if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
            str2 = connStrategyListByHost.get(0).getIp();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Future launch = new PingTask(str2, 1000, 3, 0, 0).launch();
        Future launch2 = new PingTask(str2, 1000, 3, 1172, 0).launch();
        Future launch3 = new PingTask(str2, 1000, 3, 1272, 0).launch();
        Future launch4 = new PingTask(str2, 1000, 3, 1372, 0).launch();
        Future launch5 = new PingTask(str2, 1000, 3, 1432, 0).launch();
        try {
            PingResponse pingResponse = (PingResponse) launch.get();
            if (pingResponse != null) {
                if (pingResponse.getSuccessCnt() < 2) {
                    ALog.m20786e("anet.MTUDetector", "MTU detect preTask error", null, "errCode", Integer.valueOf(pingResponse.getErrcode()), "successCount", Integer.valueOf(pingResponse.getSuccessCnt()));
                    return;
                }
                m21024a(1200, launch2);
                m21024a(1300, launch3);
                m21024a(1400, launch4);
                m21024a(1460, launch5);
                long j2 = currentTimeMillis + 432000000;
                f20467a.put(str, Long.valueOf(j2));
                defaultSharedPreferences.edit().putLong(C0002O.m25086C("sp_mtu_", str), j2).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m21024a(int i, Future future) {
        try {
            PingResponse pingResponse = (PingResponse) future.get();
            if (pingResponse != null) {
                int successCnt = pingResponse.getSuccessCnt();
                int i2 = 3 - successCnt;
                StringBuilder sb = new StringBuilder();
                PingEntry[] results = pingResponse.getResults();
                int length = results.length;
                for (int i3 = 0; i3 < length; i3++) {
                    sb.append(results[i3].rtt);
                    if (i3 != length - 1) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                ALog.m20785i("anet.MTUDetector", "MTU detect result", null, "mtu", Integer.valueOf(i), "successCount", Integer.valueOf(successCnt), "timeoutCount", Integer.valueOf(i2));
                MtuDetectStat mtuDetectStat = new MtuDetectStat();
                mtuDetectStat.mtu = i;
                mtuDetectStat.pingSuccessCount = successCnt;
                mtuDetectStat.pingTimeoutCount = i2;
                mtuDetectStat.rtt = sb.toString();
                mtuDetectStat.errCode = pingResponse.getErrcode();
                AppMonitor.getInstance().commitStat(mtuDetectStat);
            }
        } catch (Exception unused) {
        }
    }
}
