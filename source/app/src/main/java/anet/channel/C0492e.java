package anet.channel;

import anet.channel.entity.C0504c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: anet.channel.e */
/* loaded from: classes2.dex */
public class C0492e {

    /* renamed from: a */
    public final Map<SessionRequest, List<Session>> f20475a = new HashMap();

    /* renamed from: b */
    public final ReentrantReadWriteLock f20476b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public final ReentrantReadWriteLock.ReadLock f20477c = this.f20476b.readLock();

    /* renamed from: d */
    public final ReentrantReadWriteLock.WriteLock f20478d = this.f20476b.writeLock();

    static {
        Covode.recordClassIndex(2186);
    }

    /* renamed from: a */
    public List<SessionRequest> m21019a() {
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.f20477c.lock();
        try {
            if (this.f20475a.isEmpty()) {
                return list;
            }
            return new ArrayList(this.f20475a.keySet());
        } finally {
            this.f20477c.unlock();
        }
    }

    /* renamed from: a */
    public List<Session> m21018a(SessionRequest sessionRequest) {
        this.f20477c.lock();
        try {
            List<Session> list = this.f20475a.get(sessionRequest);
            if (list != null) {
                return new ArrayList(list);
            }
            return Collections.EMPTY_LIST;
        } finally {
            this.f20477c.unlock();
        }
    }

    /* renamed from: b */
    public void m21015b(SessionRequest sessionRequest, Session session) {
        this.f20478d.lock();
        try {
            List<Session> list = this.f20475a.get(sessionRequest);
            if (list != null) {
                list.remove(session);
                if (list.size() == 0) {
                    this.f20475a.remove(sessionRequest);
                }
            }
        } finally {
            this.f20478d.unlock();
        }
    }

    /* renamed from: c */
    public boolean m21014c(SessionRequest sessionRequest, Session session) {
        this.f20477c.lock();
        try {
            List<Session> list = this.f20475a.get(sessionRequest);
            boolean z = false;
            if (list != null) {
                if (list.indexOf(session) != -1) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f20477c.unlock();
        }
    }

    /* renamed from: a */
    public Session m21017a(SessionRequest sessionRequest, int i) {
        this.f20477c.lock();
        try {
            List<Session> list = this.f20475a.get(sessionRequest);
            Session session = null;
            if (list == null || list.isEmpty()) {
                return null;
            }
            for (Session session2 : list) {
                if (session2 != null && session2.isAvailable() && (i == C0504c.f20507c || session2.f20354j.getType() == i)) {
                    session = session2;
                    break;
                }
            }
            return session;
        } finally {
            this.f20477c.unlock();
        }
    }

    /* renamed from: a */
    public void m21016a(SessionRequest sessionRequest, Session session) {
        if (sessionRequest != null && sessionRequest.m21075a() != null && session != null) {
            this.f20478d.lock();
            try {
                List<Session> list = this.f20475a.get(sessionRequest);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f20475a.put(sessionRequest, list);
                }
                if (list.indexOf(session) == -1) {
                    list.add(session);
                    Collections.sort(list);
                }
            } finally {
                this.f20478d.unlock();
            }
        }
    }
}
