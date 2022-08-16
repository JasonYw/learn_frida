package anet.channel.strategy;

import anet.channel.strategy.C0568l;
import anet.channel.strategy.utils.C0579c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class StrategyList implements Serializable {

    /* renamed from: a */
    public List<IPConnStrategy> f20719a;

    /* renamed from: b */
    public Map<Integer, ConnHistoryItem> f20720b;

    /* renamed from: c */
    public boolean f20721c;

    /* renamed from: d */
    public transient Comparator<IPConnStrategy> f20722d;

    /* loaded from: classes11.dex */
    public interface Predicate<T> {
        static {
            Covode.recordClassIndex(2306);
        }

        boolean apply(T t);
    }

    static {
        Covode.recordClassIndex(2305);
    }

    /* renamed from: a */
    private Comparator m20852a() {
        if (this.f20722d == null) {
            this.f20722d = new C0567k(this);
        }
        return this.f20722d;
    }

    public String toString() {
        return new ArrayList(this.f20719a).toString();
    }

    public StrategyList() {
        this.f20719a = new ArrayList();
        this.f20720b = new SerialLruCache(40);
        this.f20721c = false;
        this.f20722d = null;
    }

    public boolean shouldRefresh() {
        boolean z = true;
        boolean z2 = true;
        for (IPConnStrategy iPConnStrategy : this.f20719a) {
            if (!this.f20720b.get(Integer.valueOf(iPConnStrategy.getUniqueId())).m20873b()) {
                if (iPConnStrategy.f20698a == 0) {
                    z = false;
                }
                z2 = false;
            }
        }
        if ((this.f20721c && z) || z2) {
            return true;
        }
        return false;
    }

    public void checkInit() {
        if (this.f20719a == null) {
            this.f20719a = new ArrayList();
        }
        if (this.f20720b == null) {
            this.f20720b = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.f20720b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().m20871d()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.f20719a) {
            if (!this.f20720b.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.f20720b.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.f20719a, m20852a());
    }

    public List<IConnStrategy> getStrategyList() {
        if (this.f20719a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = null;
        for (IPConnStrategy iPConnStrategy : this.f20719a) {
            ConnHistoryItem connHistoryItem = this.f20720b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem != null && connHistoryItem.m20872c()) {
                ALog.m20785i("awcn.StrategyList", "strategy ban!", null, "strategy", iPConnStrategy);
            } else {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(iPConnStrategy);
            }
        }
        if (linkedList == null) {
            return Collections.EMPTY_LIST;
        }
        return linkedList;
    }

    public StrategyList(List<IPConnStrategy> list) {
        this.f20719a = new ArrayList();
        this.f20720b = new SerialLruCache(40);
        this.f20721c = false;
        this.f20722d = null;
        this.f20719a = list;
    }

    public void update(C0568l.C0570b c0570b) {
        int i;
        for (IPConnStrategy iPConnStrategy : this.f20719a) {
            iPConnStrategy.f20700c = true;
        }
        for (int i2 = 0; i2 < c0570b.f20786h.length; i2++) {
            for (int i3 = 0; i3 < c0570b.f20784f.length; i3++) {
                m20850a(c0570b.f20784f[i3], 1, c0570b.f20786h[i2]);
            }
            if (c0570b.f20785g != null) {
                this.f20721c = true;
                for (int i4 = 0; i4 < c0570b.f20785g.length; i4++) {
                    m20850a(c0570b.f20785g[i4], 0, c0570b.f20786h[i2]);
                }
            } else {
                this.f20721c = false;
            }
        }
        if (c0570b.f20787i != null) {
            for (int i5 = 0; i5 < c0570b.f20787i.length; i5++) {
                C0568l.C0573e c0573e = c0570b.f20787i[i5];
                String str = c0573e.f20801a;
                if (C0579c.m20792c(c0573e.f20801a)) {
                    i = -1;
                } else {
                    i = 1;
                }
                m20850a(str, i, c0573e.f20802b);
            }
        }
        ListIterator<IPConnStrategy> listIterator = this.f20719a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f20700c) {
                listIterator.remove();
            }
        }
        Collections.sort(this.f20719a, m20852a());
    }

    /* renamed from: a */
    public static <T> int m20849a(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        int i = 0;
        Iterator<T> it = collection.iterator();
        while (it.hasNext() && !predicate.apply(it.next())) {
            i++;
        }
        if (i == collection.size()) {
            return -1;
        }
        return i;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if ((iConnStrategy instanceof IPConnStrategy) && this.f20719a.indexOf(iConnStrategy) != -1) {
            this.f20720b.get(Integer.valueOf(((IPConnStrategy) iConnStrategy).getUniqueId())).m20874a(connEvent.isSuccess);
            Collections.sort(this.f20719a, this.f20722d);
        }
    }

    /* renamed from: a */
    private void m20850a(String str, int i, C0568l.C0569a c0569a) {
        int m20849a = m20849a(this.f20719a, new C0566j(this, c0569a, str, ConnProtocol.valueOf(c0569a)));
        if (m20849a != -1) {
            IPConnStrategy iPConnStrategy = this.f20719a.get(m20849a);
            iPConnStrategy.cto = c0569a.f20773c;
            iPConnStrategy.rto = c0569a.f20774d;
            iPConnStrategy.heartbeat = c0569a.f20776f;
            iPConnStrategy.f20698a = i;
            iPConnStrategy.f20699b = 0;
            iPConnStrategy.f20700c = false;
            return;
        }
        IPConnStrategy m20869a = IPConnStrategy.m20869a(str, c0569a);
        if (m20869a != null) {
            m20869a.f20698a = i;
            m20869a.f20699b = 0;
            if (!this.f20720b.containsKey(Integer.valueOf(m20869a.getUniqueId()))) {
                this.f20720b.put(Integer.valueOf(m20869a.getUniqueId()), new ConnHistoryItem());
            }
            this.f20719a.add(m20869a);
        }
    }
}
