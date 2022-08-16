package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class HttpDispatcher {

    /* renamed from: a */
    public CopyOnWriteArraySet<IDispatchEventListener> f20741a;

    /* renamed from: b */
    public C0555a f20742b;

    /* renamed from: c */
    public volatile boolean f20743c;

    /* renamed from: d */
    public Set<String> f20744d;

    /* renamed from: e */
    public Set<String> f20745e;

    /* renamed from: f */
    public AtomicBoolean f20746f;

    /* loaded from: classes2.dex */
    public interface IDispatchEventListener {
        static {
            Covode.recordClassIndex(2320);
        }

        void onEvent(DispatchEvent dispatchEvent);
    }

    static {
        Covode.recordClassIndex(2319);
    }

    public static HttpDispatcher getInstance() {
        return C0554a.f20747a;
    }

    /* renamed from: anet.channel.strategy.dispatch.HttpDispatcher$a */
    /* loaded from: classes2.dex */
    public static class C0554a {

        /* renamed from: a */
        public static HttpDispatcher f20747a = new HttpDispatcher(null);

        static {
            Covode.recordClassIndex(2321);
        }
    }

    public synchronized Set<String> getInitHosts() {
        HashSet hashSet;
        MethodCollector.m14708i(78);
        m20831a();
        hashSet = new HashSet(this.f20745e);
        MethodCollector.m14707o(78);
        return hashSet;
    }

    public void switchENV() {
        this.f20744d.clear();
        this.f20745e.clear();
        this.f20746f.set(false);
    }

    public HttpDispatcher() {
        this.f20741a = new CopyOnWriteArraySet<>();
        this.f20742b = new C0555a();
        this.f20743c = true;
        this.f20744d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f20745e = new TreeSet();
        this.f20746f = new AtomicBoolean();
        m20831a();
    }

    /* renamed from: a */
    private void m20831a() {
        if (!this.f20746f.get() && GlobalAppRuntimeInfo.getContext() != null && this.f20746f.compareAndSet(false, true)) {
            this.f20745e.add(DispatchConstants.getAmdcServerDomain());
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                this.f20745e.addAll(Arrays.asList(DispatchConstants.initHostArray));
            }
        }
    }

    public /* synthetic */ HttpDispatcher(C0560e c0560e) {
        this();
    }

    public void setEnable(boolean z) {
        this.f20743c = z;
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        this.f20741a.add(iDispatchEventListener);
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        this.f20741a.remove(iDispatchEventListener);
    }

    public static void setInitHosts(List<String> list) {
        if (list != null) {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    /* renamed from: a */
    public void m20830a(DispatchEvent dispatchEvent) {
        Iterator<IDispatchEventListener> it = this.f20741a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEvent(dispatchEvent);
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void addHosts(List<String> list) {
        MethodCollector.m14708i(77);
        if (list != null) {
            this.f20745e.addAll(list);
            this.f20744d.clear();
        }
        MethodCollector.m14707o(77);
    }

    public boolean isInitHostsChanged(String str) {
        if (TextUtils.isEmpty(str) || this.f20744d.contains(str)) {
            return false;
        }
        this.f20744d.add(str);
        return true;
    }

    public void sendAmdcRequest(Set<String> set, int i) {
        if (this.f20743c && set != null && !set.isEmpty()) {
            if (ALog.isPrintLog(2)) {
                ALog.m20785i("awcn.HttpDispatcher", "sendAmdcRequest", null, "hosts", set.toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("hosts", set);
            hashMap.put("cv", String.valueOf(i));
            this.f20742b.m20827a(hashMap);
            return;
        }
        ALog.m20786e("awcn.HttpDispatcher", "invalid parameter", null, new Object[0]);
    }
}
