package com.amap.api.mapcore2d;

import com.amap.api.mapcore2d.C1658em;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.fb */
/* loaded from: classes19.dex */
public class C1691fb {
    static {
        Covode.recordClassIndex(5239);
    }

    /* renamed from: a */
    public static void m17549a(C1658em c1658em) {
        if (c1658em != null) {
            try {
                c1658em.m17654e();
            } catch (Throwable th) {
                C1616do.m17866c(th, "ofm", "dlo");
            }
        }
    }

    /* renamed from: a */
    public static void m17546a(C1690fa c1690fa) {
        C1658em c1658em = null;
        try {
            if (c1690fa.f23588f.m17506c()) {
                c1690fa.f23588f.mo17508a(true);
                c1658em = C1658em.m17667a(new File(c1690fa.f23583a), 1, 1, c1690fa.f23584b);
                try {
                    ArrayList arrayList = new ArrayList();
                    byte[] m17548a = m17548a(c1658em, c1690fa, arrayList);
                    if (m17548a != null && m17548a.length != 0) {
                        JSONObject jSONObject = new JSONObject(new String(C1671er.m17615a().mo17576b(new C1615dn(m17548a, c1690fa.f23585c))));
                        if (jSONObject.has(C2521l.LJIIJ) && jSONObject.getInt(C2521l.LJIIJ) == 1) {
                            if (c1690fa.f23588f != null) {
                                c1690fa.f23588f.mo17509a(m17548a.length);
                            }
                            if (c1690fa.f23588f.mo17507b() < Integer.MAX_VALUE) {
                                m17547a(c1658em, arrayList);
                            } else {
                                m17549a(c1658em);
                            }
                        } else if (c1658em != null) {
                            try {
                                c1658em.close();
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (c1658em != null) {
                        try {
                            c1658em.close();
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C1616do.m17866c(th, "leg", "uts");
                        if (c1658em != null) {
                            try {
                                c1658em.close();
                            } catch (Throwable unused3) {
                            }
                        }
                    } catch (Throwable th2) {
                        if (c1658em != null) {
                            try {
                                c1658em.close();
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
    public static boolean m17545a(String str, String str2) {
        try {
            new StringBuilder();
            return new File(str, C0002O.m25086C(str2, ".0")).exists();
        } catch (Throwable th) {
            C1616do.m17866c(th, "leg", "fet");
            return false;
        }
    }

    /* renamed from: a */
    public static void m17547a(C1658em c1658em, List<String> list) {
        if (c1658em != null) {
            try {
                for (String str : list) {
                    c1658em.m17658c(str);
                }
                c1658em.close();
            } catch (Throwable th) {
                C1616do.m17866c(th, "ofm", "dlo");
            }
        }
    }

    /* renamed from: a */
    public static void m17544a(String str, byte[] bArr, C1690fa c1690fa) {
        OutputStream outputStream = null;
        try {
            if (m17545a(c1690fa.f23583a, str)) {
                return;
            }
            File file = new File(c1690fa.f23583a);
            if (!file.exists()) {
                file.mkdirs();
            }
            C1658em m17667a = C1658em.m17667a(file, 1, 1, c1690fa.f23584b);
            try {
                m17667a.m17673a(c1690fa.f23586d);
                byte[] m17915b = c1690fa.f23587e.m17915b(bArr);
                C1658em.C1662a m17661b = m17667a.m17661b(str);
                outputStream = m17661b.m17641a(0);
                outputStream.write(m17915b);
                m17661b.m17642a();
                m17667a.m17657d();
                try {
                    outputStream.close();
                } catch (Throwable unused) {
                }
                try {
                    m17667a.close();
                } catch (Throwable unused2) {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m17548a(C1658em c1658em, C1690fa c1690fa, List<String> list) {
        String[] list2;
        try {
            File m17660c = c1658em.m17660c();
            if (m17660c != null && m17660c.exists()) {
                int i = 0;
                for (String str : m17660c.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] m17522a = C1702fh.m17522a(c1658em, str2, false);
                        i += m17522a.length;
                        list.add(str2);
                        if (i > c1690fa.f23588f.mo17507b()) {
                            break;
                        }
                        c1690fa.f23589g.mo17515b(m17522a);
                    }
                }
                return c1690fa.f23589g.m17516a();
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
