package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class HttpDnsAdapter {
    static {
        Covode.recordClassIndex(2293);
    }

    /* loaded from: classes2.dex */
    public static final class HttpDnsOrigin {
        public final IConnStrategy connStrategy;

        static {
            Covode.recordClassIndex(2294);
        }

        public final String getOriginIP() {
            return this.connStrategy.getIp();
        }

        public final int getOriginPort() {
            return this.connStrategy.getPort();
        }

        public final String toString() {
            return this.connStrategy.toString();
        }

        public final String getOriginProtocol() {
            return this.connStrategy.getProtocol().protocol;
        }

        public final boolean canWithSPDY() {
            String str = this.connStrategy.getProtocol().protocol;
            if (!str.equalsIgnoreCase("http") && !str.equalsIgnoreCase("https")) {
                return true;
            }
            return false;
        }

        public HttpDnsOrigin(IConnStrategy iConnStrategy) {
            this.connStrategy = iConnStrategy;
        }
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDns(String str) {
        return getOriginsByHttpDns(str, true);
    }

    public static void setHosts(ArrayList<String> arrayList) {
        HttpDispatcher.getInstance().addHosts(arrayList);
    }

    public static String getIpByHttpDns(String str) {
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost.isEmpty()) {
            return null;
        }
        return connStrategyListByHost.get(0).getIp();
    }

    public static HttpDnsOrigin getOriginByHttpDns(String str) {
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost.isEmpty()) {
            return null;
        }
        return new HttpDnsOrigin(connStrategyListByHost.get(0));
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDns(String str, boolean z) {
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost.isEmpty()) {
            return null;
        }
        ArrayList<HttpDnsOrigin> arrayList = new ArrayList<>(connStrategyListByHost.size());
        for (IConnStrategy iConnStrategy : connStrategyListByHost) {
            if (z || iConnStrategy.getIpSource() != 1) {
                arrayList.add(new HttpDnsOrigin(iConnStrategy));
            }
        }
        return arrayList;
    }

    public static void notifyConnEvent(String str, HttpDnsOrigin httpDnsOrigin, boolean z) {
        if (TextUtils.isEmpty(str) || httpDnsOrigin == null || !AwcnConfig.isAllowHttpDnsNotify(str)) {
            return;
        }
        ConnEvent connEvent = new ConnEvent();
        connEvent.isSuccess = z;
        StrategyCenter.getInstance().notifyConnEvent(str, httpDnsOrigin.connStrategy, connEvent);
    }
}
