package com.amap.api.services.p126a;

import com.amap.api.services.p126a.C1943cy;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.dn */
/* loaded from: classes19.dex */
public class C1974dn {
    static {
        Covode.recordClassIndex(5585);
    }

    /* renamed from: a */
    public static void m16440a(C1943cy c1943cy) {
        if (c1943cy != null) {
            try {
                c1943cy.m16544d();
            } catch (Throwable th) {
                C1906cb.m16716c(th, "ofm", "dlo");
            }
        }
    }

    /* renamed from: a */
    public static void m16437a(C1973dm c1973dm) {
        C1943cy c1943cy = null;
        try {
            if (c1973dm.f24768f.m16399c()) {
                c1973dm.f24768f.mo16401a(true);
                c1943cy = C1943cy.m16554a(new File(c1973dm.f24763a), 1, 1, c1973dm.f24764b);
                try {
                    ArrayList arrayList = new ArrayList();
                    byte[] m16439a = m16439a(c1943cy, c1973dm, arrayList);
                    if (m16439a != null && m16439a.length != 0) {
                        JSONObject jSONObject = new JSONObject(new String(C1957dd.m16503a().mo16457b(new C1905ca(m16439a, c1973dm.f24765c))));
                        if (jSONObject.has(C2521l.LJIIJ) && jSONObject.getInt(C2521l.LJIIJ) == 1) {
                            if (c1973dm.f24768f != null) {
                                c1973dm.f24768f.mo16402a(m16439a.length);
                            }
                            if (c1973dm.f24768f.mo16400b() < Integer.MAX_VALUE) {
                                m16438a(c1943cy, arrayList);
                            } else {
                                m16440a(c1943cy);
                            }
                        } else if (c1943cy != null) {
                            try {
                                c1943cy.close();
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (c1943cy != null) {
                        try {
                            c1943cy.close();
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C1906cb.m16716c(th, "leg", "uts");
                        if (c1943cy != null) {
                            try {
                                c1943cy.close();
                            } catch (Throwable unused3) {
                            }
                        }
                    } catch (Throwable th2) {
                        if (c1943cy != null) {
                            try {
                                c1943cy.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    public static boolean m16436a(String str, String str2) {
        try {
            new StringBuilder();
            return new File(str, C0002O.m25086C(str2, ".0")).exists();
        } catch (Throwable th) {
            C1906cb.m16716c(th, "leg", "fet");
            return false;
        }
    }

    /* renamed from: a */
    public static void m16438a(C1943cy c1943cy, List<String> list) {
        if (c1943cy != null) {
            try {
                for (String str : list) {
                    c1943cy.m16545c(str);
                }
                c1943cy.close();
            } catch (Throwable th) {
                C1906cb.m16716c(th, "ofm", "dlo");
            }
        }
    }

    /* renamed from: a */
    public static void m16435a(String str, byte[] bArr, C1973dm c1973dm) {
        OutputStream outputStream = null;
        try {
            if (m16436a(c1973dm.f24763a, str)) {
                return;
            }
            File file = new File(c1973dm.f24763a);
            if (!file.exists()) {
                file.mkdirs();
            }
            C1943cy m16554a = C1943cy.m16554a(file, 1, 1, c1973dm.f24764b * c1973dm.f24766d);
            try {
                m16554a.m16560a(c1973dm.f24766d);
                byte[] m16766b = c1973dm.f24767e.m16766b(bArr);
                C1943cy.C1947a m16548b = m16554a.m16548b(str);
                outputStream = m16548b.m16529a(0);
                outputStream.write(m16766b);
                m16548b.m16530a();
                m16554a.m16547c();
                try {
                    outputStream.close();
                } catch (Throwable unused) {
                }
                try {
                    m16554a.close();
                } catch (Throwable unused2) {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m16439a(C1943cy c1943cy, C1973dm c1973dm, List<String> list) {
        String[] list2;
        try {
            File m16550b = c1943cy.m16550b();
            if (m16550b != null && m16550b.exists()) {
                int i = 0;
                for (String str : m16550b.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] m16416a = C1983ds.m16416a(c1943cy, str2, false);
                        i += m16416a.length;
                        list.add(str2);
                        if (i > c1973dm.f24768f.mo16400b()) {
                            break;
                        }
                        c1973dm.f24769g.mo16409b(m16416a);
                    }
                }
                return c1973dm.f24769g.m16410a();
            }
        } catch (Throwable th) {
            C1906cb.m16716c(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
