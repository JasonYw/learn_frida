package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.amap.api.services.a.a */
/* loaded from: classes19.dex */
public abstract class AbstractC1799a<T, V> extends AbstractC1969di {

    /* renamed from: a */
    public T f24221a;

    /* renamed from: d */
    public Context f24224d;

    /* renamed from: b */
    public int f24222b = 1;

    /* renamed from: c */
    public String f24223c = "";

    /* renamed from: i */
    public int f24226i = 1;

    /* renamed from: e */
    public String f24225e = "";

    static {
        Covode.recordClassIndex(5410);
    }

    /* renamed from: a */
    public abstract V mo16254a(String str);

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: d */
    public Map<String, String> mo16450d() {
        return null;
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: e */
    public Map<String, String> mo16388e() {
        return null;
    }

    /* renamed from: f */
    public V mo16995f() {
        return null;
    }

    /* renamed from: a */
    public String m17092a() {
        return this.f24225e;
    }

    /* renamed from: c */
    public V m17087c() {
        if (this.f24221a != null) {
            try {
                return m17086g();
            } catch (AMapException e) {
                C1809ai.m17073a(m17089b(), m17092a(), e);
                throw e;
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m17089b() {
        String mo16250i = mo16250i();
        if (mo16250i != null) {
            try {
                int indexOf = mo16250i.indexOf(".com/");
                int indexOf2 = mo16250i.indexOf("?");
                if (indexOf2 == -1) {
                    return mo16250i.substring(indexOf + 5);
                }
                return mo16250i.substring(indexOf + 5, indexOf2);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: g */
    private V m17086g() {
        V v = null;
        int i = 0;
        while (i < this.f24222b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    int protocol = ServiceSettings.getInstance().getProtocol();
                    C1883bl.m16855a().m16854a(this.f24224d);
                    C1966dh m16459a = C1966dh.m16459a(false);
                    m16452a(C1888bn.m16825a(this.f24224d));
                    byte[] mo17078a = mo17078a(protocol, m16459a, this);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    v = m17088b(mo17078a);
                    C1809ai.m17076a(this.f24224d, m17089b(), currentTimeMillis2 - currentTimeMillis, true);
                    i = this.f24222b;
                } catch (C1863be e) {
                    C1809ai.m17076a(this.f24224d, m17089b(), System.currentTimeMillis() - currentTimeMillis, false);
                    i++;
                    if (i < this.f24222b) {
                        try {
                            Thread.sleep(this.f24226i * 1000);
                        } catch (InterruptedException unused) {
                            if (!"http连接失败 - ConnectionException".equals(e.getMessage()) && !"socket 连接异常 - SocketException".equals(e.getMessage()) && !"服务器连接失败 - UnknownServiceException".equals(e.getMessage())) {
                                throw new AMapException(e.m16975a(), 1, e.m16971c());
                            }
                            throw new AMapException("http或socket连接失败 - ConnectionException", 1, e.m16971c());
                        }
                    } else {
                        mo16995f();
                        if (!"http连接失败 - ConnectionException".equals(e.getMessage()) && !"socket 连接异常 - SocketException".equals(e.getMessage()) && !"未知的错误".equals(e.m16975a()) && !"服务器连接失败 - UnknownServiceException".equals(e.getMessage())) {
                            throw new AMapException(e.m16975a(), 1, e.m16971c());
                        }
                        throw new AMapException("http或socket连接失败 - ConnectionException", 1, e.m16971c());
                    }
                } catch (AMapException e2) {
                    C1809ai.m17076a(this.f24224d, m17089b(), System.currentTimeMillis() - currentTimeMillis, false);
                    i++;
                    if (i >= this.f24222b) {
                        throw e2;
                    }
                }
            } catch (AMapException e3) {
                throw e3;
            }
        }
        return v;
    }

    /* renamed from: b */
    private V m17088b(byte[] bArr) {
        return m17090a(bArr);
    }

    /* renamed from: a */
    public V m17090a(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e) {
            C2007j.m16371a(e, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        C2007j.m16367b(str);
        return mo16254a(str);
    }

    public AbstractC1799a(Context context, T t) {
        m17091a(context, t);
    }

    /* renamed from: a */
    private void m17091a(Context context, T t) {
        this.f24224d = context;
        this.f24221a = t;
        this.f24222b = 1;
        m16451b(ServiceSettings.getInstance().getSoTimeOut());
        m16453a(ServiceSettings.getInstance().getConnectionTimeOut());
    }

    /* renamed from: a */
    public byte[] mo17078a(int i, C1966dh c1966dh, AbstractC1969di abstractC1969di) {
        C1971dk m16501a;
        if (i == 1) {
            m16501a = c1966dh.m16501a(abstractC1969di, false);
        } else if (i != 2) {
            return null;
        } else {
            m16501a = c1966dh.m16501a(abstractC1969di, true);
        }
        if (m16501a == null) {
            return null;
        }
        byte[] bArr = m16501a.f24757a;
        this.f24225e = m16501a.f24760d;
        return bArr;
    }
}
