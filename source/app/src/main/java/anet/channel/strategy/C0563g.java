package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0577a;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: anet.channel.strategy.g */
/* loaded from: classes2.dex */
public class C0563g implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    public boolean f20759a;

    /* renamed from: b */
    public StrategyInfoHolder f20760b;

    /* renamed from: c */
    public long f20761c;

    /* renamed from: d */
    public CopyOnWriteArraySet<IStrategyListener> f20762d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    public IStrategyFilter f20763e = new C0564h(this);

    static {
        Covode.recordClassIndex(2331);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m20815a() {
        if (this.f20760b != null) {
            return false;
        }
        ALog.m20783w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.f20759a));
        return true;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        if (m20815a()) {
            return "";
        }
        return this.f20760b.m20856d().f20725b;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        MethodCollector.m14708i(85);
        ALog.m20785i("awcn.StrategyCenter", "saveData", null, new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f20761c > 30000) {
            this.f20761c = currentTimeMillis;
            C0577a.m20798a(new RunnableC0565i(this), 500L);
        }
        MethodCollector.m14707o(85);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        MethodCollector.m14708i(84);
        C0574m.m20810a();
        HttpDispatcher.getInstance().switchENV();
        if (this.f20760b != null) {
            this.f20760b.m20858b();
            this.f20760b = StrategyInfoHolder.m20862a();
        }
        MethodCollector.m14707o(84);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        return getConnStrategyListByHost(str, this.f20763e);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str) {
        return getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        if (!m20815a() && !TextUtils.isEmpty(str)) {
            return this.f20760b.m20856d().getCnameByHost(str);
        }
        return null;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        if (m20815a()) {
            return null;
        }
        return this.f20760b.f20714b.m20863b(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        ALog.m20786e("awcn.StrategyCenter", "registerListener", null, "listener", this.f20762d);
        if (iStrategyListener != null) {
            this.f20762d.add(iStrategyListener);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        ALog.m20786e("awcn.StrategyCenter", "unregisterListener", null, "listener", this.f20762d);
        this.f20762d.remove(iStrategyListener);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        if (!m20815a() && !TextUtils.isEmpty(str)) {
            ALog.m20785i("awcn.StrategyCenter", "force refresh strategy", null, C1315c.f22208f, str);
            this.f20760b.m20856d().m20844a(str, true);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            ALog.m20786e("awcn.StrategyCenter", "url is invalid.", null, "URL", str);
            return null;
        }
        String urlString = parse.urlString();
        try {
            String schemeByHost = getSchemeByHost(parse.host(), parse.scheme());
            if (!schemeByHost.equalsIgnoreCase(parse.scheme())) {
                urlString = StringUtils.concatString(schemeByHost, Constants.COLON_SEPARATOR, str.substring(str.indexOf("//")));
            }
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.StrategyCenter", "", null, "raw", StringUtils.simplifyString(str, 128), "ret", StringUtils.simplifyString(urlString, 128));
                return urlString;
            }
        } catch (Exception e) {
            ALog.m20787e("awcn.StrategyCenter", "getFormalizeUrl failed", null, e, "raw", str);
        }
        return urlString;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        MethodCollector.m14708i(83);
        if (!this.f20759a && context != null) {
            try {
                ALog.m20785i("awcn.StrategyCenter", "StrategyCenter initialize started.", null, new Object[0]);
                AmdcRuntimeInfo.setContext(context);
                C0574m.m20809a(context);
                HttpDispatcher.getInstance().addListener(this);
                this.f20760b = StrategyInfoHolder.m20862a();
                this.f20759a = true;
                ALog.m20785i("awcn.StrategyCenter", "StrategyCenter initialize finished.", null, new Object[0]);
                MethodCollector.m14707o(83);
                return;
            } catch (Exception e) {
                ALog.m20787e("awcn.StrategyCenter", "StrategyCenter initialize failed.", null, e, new Object[0]);
                MethodCollector.m14707o(83);
                return;
            }
        }
        MethodCollector.m14707o(83);
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        if (dispatchEvent.eventType == 1 && this.f20760b != null) {
            ALog.m20788d("awcn.StrategyCenter", "receive amdc event", null, new Object[0]);
            C0568l.C0572d m20811a = C0568l.m20811a((JSONObject) dispatchEvent.extraObject);
            if (m20811a == null) {
                return;
            }
            this.f20760b.m20860a(m20811a);
            saveData();
            Iterator<IStrategyListener> it = this.f20762d.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onStrategyUpdated(m20811a);
                } catch (Exception e) {
                    ALog.m20787e("awcn.StrategyCenter", "onStrategyUpdated failed", null, e, new Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        anet.channel.util.ALog.m20788d("awcn.StrategyCenter", "getSchemeByHost", null, com.alipay.sdk.p082m.p105l.C1315c.f22208f, r5, "scheme", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        r6 = anet.channel.strategy.C0551c.C0552a.f20738a.m20834a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r6 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
        r6 = "http";
     */
    @Override // anet.channel.strategy.IStrategyInstance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getSchemeByHost(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r3 = 0
            if (r0 == 0) goto L8
            return r3
        L8:
            boolean r0 = r4.m20815a()
            if (r0 == 0) goto Lf
            return r6
        Lf:
            anet.channel.strategy.StrategyInfoHolder r0 = r4.f20760b
            anet.channel.strategy.StrategyConfig r0 = r0.f20714b
            java.lang.String r0 = r0.m20865a(r5)
            if (r0 != 0) goto L46
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L21
        L1f:
            if (r6 != 0) goto L2b
        L21:
            anet.channel.strategy.c r0 = anet.channel.strategy.C0551c.C0552a.f20738a
            java.lang.String r6 = r0.m20834a(r5)
            if (r6 != 0) goto L2b
            java.lang.String r6 = "http"
        L2b:
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r0 = "host"
            r2[r1] = r0
            r0 = 1
            r2[r0] = r5
            r1 = 2
            java.lang.String r0 = "scheme"
            r2[r1] = r0
            r0 = 3
            r2[r0] = r6
            java.lang.String r1 = "awcn.StrategyCenter"
            java.lang.String r0 = "getSchemeByHost"
            anet.channel.util.ALog.m20788d(r1, r0, r3, r2)
            return r6
        L46:
            r6 = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.C0563g.getSchemeByHost(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        boolean z;
        if (!TextUtils.isEmpty(str) && !m20815a()) {
            String cnameByHost = this.f20760b.m20856d().getCnameByHost(str);
            if (!TextUtils.isEmpty(cnameByHost)) {
                str = cnameByHost;
            }
            List queryByHost = this.f20760b.m20856d().queryByHost(str);
            if (queryByHost.isEmpty()) {
                queryByHost = this.f20760b.f20715c.m20838a(str);
            }
            if (!queryByHost.isEmpty() && iStrategyFilter != null) {
                if (!AwcnConfig.isIpv6Enable() || (AwcnConfig.isIpv6BlackListEnable() && this.f20760b.m20856d().m20846a(str, AwcnConfig.getIpv6BlackListTtl()))) {
                    z = true;
                } else {
                    z = false;
                }
                ListIterator<IConnStrategy> listIterator = queryByHost.listIterator();
                while (listIterator.hasNext()) {
                    IConnStrategy next = listIterator.next();
                    if (!iStrategyFilter.accept(next)) {
                        listIterator.remove();
                    } else if (z && C0579c.m20793b(next.getIp())) {
                        listIterator.remove();
                    }
                }
                if (ALog.isPrintLog(1)) {
                    ALog.m20788d("getConnStrategyListByHost", null, C1315c.f22208f, str, "result", queryByHost);
                }
                return queryByHost;
            }
            ALog.m20788d("getConnStrategyListByHost", null, C1315c.f22208f, str, "result", queryByHost);
            return queryByHost;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!m20815a() && iConnStrategy != null && (iConnStrategy instanceof IPConnStrategy)) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
            if (iPConnStrategy.f20699b == 1) {
                this.f20760b.f20715c.m20836a(str, iConnStrategy, connEvent);
            } else if (iPConnStrategy.f20699b == 0) {
                this.f20760b.m20856d().m20845a(str, iConnStrategy, connEvent);
            }
        }
    }
}
