package anet.channel;

import android.content.Intent;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public class AccsSessionManager {

    /* renamed from: c */
    public static CopyOnWriteArraySet<ISessionListener> f20296c = new CopyOnWriteArraySet<>();

    /* renamed from: a */
    public SessionCenter f20297a;

    /* renamed from: b */
    public Set<String> f20298b = Collections.EMPTY_SET;

    static {
        Covode.recordClassIndex(2126);
    }

    /* renamed from: b */
    private boolean m21097b() {
        if ((GlobalAppRuntimeInfo.isAppBackground() && AwcnConfig.isAccsSessionCreateForbiddenInBg()) || !NetworkStatusHelper.isConnected()) {
            return false;
        }
        return true;
    }

    public synchronized void checkAndStartSession() {
        String str;
        MethodCollector.m14708i(1);
        Collection<SessionInfo> m21048a = this.f20297a.f20378g.m21048a();
        Set<String> set = Collections.EMPTY_SET;
        if (!m21048a.isEmpty()) {
            set = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : m21048a) {
            if (sessionInfo.isKeepAlive) {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                String str2 = sessionInfo.host;
                if (sessionInfo.isAccs) {
                    str = "https";
                } else {
                    str = "http";
                }
                set.add(StringUtils.concatString(strategyCenter.getSchemeByHost(str2, str), "://", sessionInfo.host));
            }
        }
        for (String str3 : this.f20298b) {
            if (!set.contains(str3)) {
                m21098a(str3);
            }
        }
        if (!m21097b()) {
            MethodCollector.m14707o(1);
            return;
        }
        for (String str4 : set) {
            try {
                this.f20297a.get(str4, ConnType.TypeLevel.SPDY, 0L);
            } catch (Exception unused) {
                ALog.m20786e("start session failed", null, C1315c.f22208f, str4);
            }
        }
        this.f20298b = set;
        MethodCollector.m14707o(1);
    }

    public void registerListener(ISessionListener iSessionListener) {
        if (iSessionListener != null) {
            f20296c.add(iSessionListener);
        }
    }

    public void unregisterListener(ISessionListener iSessionListener) {
        f20296c.remove(iSessionListener);
    }

    public AccsSessionManager(SessionCenter sessionCenter) {
        this.f20297a = sessionCenter;
    }

    public void notifyListener(Intent intent) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0460a(this, intent));
    }

    /* renamed from: a */
    private void m21098a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ALog.m20788d("awcn.AccsSessionManager", "closeSessions", this.f20297a.f20374c, C1315c.f22208f, str);
        this.f20297a.m21080a(str).m21059b(false);
    }

    public synchronized void forceCloseSession(boolean z) {
        MethodCollector.m14708i(2);
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.AccsSessionManager", "forceCloseSession", this.f20297a.f20374c, "reCreate", Boolean.valueOf(z));
        }
        for (String str : this.f20298b) {
            m21098a(str);
        }
        if (z) {
            checkAndStartSession();
        }
        MethodCollector.m14707o(2);
    }
}
