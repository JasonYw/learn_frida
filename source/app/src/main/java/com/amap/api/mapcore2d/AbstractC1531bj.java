package com.amap.api.mapcore2d;

import com.amap.api.maps2d.AMapException;
import com.amap.api.maps2d.MapsInitializer;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.bj */
/* loaded from: classes19.dex */
public abstract class AbstractC1531bj<T, V> extends AbstractC1683ew {

    /* renamed from: a */
    public boolean f23011a;

    /* renamed from: b */
    public T f23012b;

    /* renamed from: f */
    public int f23013f;

    /* renamed from: g */
    public int f23014g;

    static {
        Covode.recordClassIndex(5079);
    }

    /* renamed from: a */
    public abstract V mo18229a(byte[] bArr);

    /* renamed from: d */
    public V mo18225d() {
        return null;
    }

    public AbstractC1531bj() {
        this.f23013f = 1;
        this.f23013f = 1;
        this.f23014g = 2;
    }

    /* renamed from: a */
    public V m18285a() {
        if (this.f23012b != null) {
            return m18282e();
        }
        return null;
    }

    /* renamed from: e */
    private V m18282e() {
        try {
            return m18284b(mo18227b());
        } catch (AMapException e) {
            mo18225d();
            throw new AMapException(e.getErrorMessage());
        } catch (Throwable th) {
            C1569cm.m18147a(th, "ProtocalHandler", "GetDataMayThrow");
            return null;
        }
    }

    /* renamed from: b */
    public byte[] mo18227b() {
        int i = 0;
        while (i < this.f23013f) {
            try {
                return m18283c();
            } catch (C1572cp e) {
                i++;
                if (i < this.f23013f) {
                    try {
                        Thread.sleep(this.f23014g * 1000);
                        C1569cm.m18147a(e, "ProtocalHandler", "getData");
                    } catch (InterruptedException unused) {
                        throw new AMapException(e.getMessage());
                    }
                } else {
                    throw new AMapException(e.m18132a());
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public byte[] m18283c() {
        int protocol = MapsInitializer.getProtocol();
        C1680ev m17578a = C1680ev.m17578a(false);
        if (protocol == 1) {
            if (this.f23011a) {
                return m17578a.mo17576b(this);
            }
            return m17578a.m17574d(this);
        } else if (protocol == 2) {
            if (this.f23011a) {
                return m17578a.m17614a(this);
            }
            return m17578a.m17573e(this);
        } else {
            return null;
        }
    }

    public AbstractC1531bj(T t) {
        this();
        this.f23012b = t;
    }

    /* renamed from: b */
    private V m18284b(byte[] bArr) {
        return mo18229a(bArr);
    }
}
