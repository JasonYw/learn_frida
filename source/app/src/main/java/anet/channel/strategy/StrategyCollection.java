package anet.channel.strategy;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PolicyVersionStat;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class StrategyCollection implements Serializable {

    /* renamed from: a */
    public String f20702a;

    /* renamed from: b */
    public volatile long f20703b;

    /* renamed from: c */
    public volatile String f20704c;

    /* renamed from: d */
    public boolean f20705d;

    /* renamed from: e */
    public int f20706e;

    /* renamed from: f */
    public StrategyList f20707f;

    /* renamed from: g */
    public transient long f20708g;

    /* renamed from: h */
    public transient boolean f20709h = true;

    static {
        Covode.recordClassIndex(PushConstants.DOWN_LOAD_LARGE_ICON_SUCCESS);
    }

    public StrategyCollection() {
    }

    public boolean isExpired() {
        if (System.currentTimeMillis() > this.f20703b) {
            return true;
        }
        return false;
    }

    public synchronized void checkInit() {
        MethodCollector.m14708i(51);
        if (System.currentTimeMillis() - this.f20703b > 172800000) {
            this.f20707f = null;
            MethodCollector.m14707o(51);
            return;
        }
        if (this.f20707f != null) {
            this.f20707f.checkInit();
        }
        MethodCollector.m14707o(51);
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        MethodCollector.m14708i(52);
        if (this.f20707f == null) {
            List<IConnStrategy> list = Collections.EMPTY_LIST;
            MethodCollector.m14707o(52);
            return list;
        }
        if (this.f20709h) {
            this.f20709h = false;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f20702a, this.f20706e);
            policyVersionStat.reportType = 0;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        List<IConnStrategy> strategyList = this.f20707f.getStrategyList();
        MethodCollector.m14707o(52);
        return strategyList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("\nStrategyList = ");
        sb.append(this.f20703b);
        StrategyList strategyList = this.f20707f;
        if (strategyList != null) {
            sb.append(strategyList.toString());
        } else if (this.f20704c != null) {
            sb.append(LoggerUtil.M_LEFT_TAG);
            sb.append(this.f20702a);
            sb.append("=>");
            sb.append(this.f20704c);
            sb.append(LoggerUtil.M_RIGHT_TAG);
        } else {
            sb.append("[]");
        }
        return sb.toString();
    }

    public StrategyCollection(String str) {
        this.f20702a = str;
        this.f20705d = DispatchConstants.isAmdcServerDomain(str);
    }

    public synchronized void update(C0568l.C0570b c0570b) {
        MethodCollector.m14708i(54);
        this.f20703b = System.currentTimeMillis() + (c0570b.f20780b * 1000);
        if (!c0570b.f20779a.equalsIgnoreCase(this.f20702a)) {
            ALog.m20786e("StrategyCollection", "update error!", null, C1315c.f22208f, this.f20702a, "dnsInfo.host", c0570b.f20779a);
            MethodCollector.m14707o(54);
            return;
        }
        if (this.f20706e != c0570b.f20790l) {
            this.f20706e = c0570b.f20790l;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f20702a, this.f20706e);
            policyVersionStat.reportType = 1;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        this.f20704c = c0570b.f20782d;
        if ((c0570b.f20784f == null || c0570b.f20784f.length == 0 || c0570b.f20786h == null || c0570b.f20786h.length == 0) && (c0570b.f20787i == null || c0570b.f20787i.length == 0)) {
            this.f20707f = null;
            MethodCollector.m14707o(54);
            return;
        }
        if (this.f20707f == null) {
            this.f20707f = new StrategyList();
        }
        this.f20707f.update(c0570b);
        MethodCollector.m14707o(54);
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        MethodCollector.m14708i(53);
        if (this.f20707f != null) {
            this.f20707f.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.f20707f.shouldRefresh()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f20708g > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.f20702a);
                    this.f20708g = currentTimeMillis;
                }
            }
        }
        MethodCollector.m14707o(53);
    }
}
