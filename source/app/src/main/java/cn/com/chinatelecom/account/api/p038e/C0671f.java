package cn.com.chinatelecom.account.api.p038e;

import android.content.Context;
import cn.com.chinatelecom.account.p033a.C0626b;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import org.json.JSONObject;

/* renamed from: cn.com.chinatelecom.account.api.e.f */
/* loaded from: classes2.dex */
public class C0671f {

    /* renamed from: a */
    public static int f21022a = 0;

    /* renamed from: b */
    public static Map f21023b = new HashMap();

    /* renamed from: c */
    public static List f21024c = new ArrayList();

    /* renamed from: d */
    public static C0670e f21025d = null;

    static {
        Covode.recordClassIndex(2722);
        C0671f.class.getSimpleName();
    }

    /* renamed from: a */
    public static synchronized C0670e m20603a(String str) {
        C0670e c0670e;
        synchronized (C0671f.class) {
            MethodCollector.m14708i(189);
            if (!f21023b.containsKey(str) || (c0670e = (C0670e) f21023b.get(str)) == null) {
                c0670e = new C0670e(str);
                f21023b.put(str, c0670e);
            }
            MethodCollector.m14707o(189);
        }
        return c0670e;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20605a(Context context) {
        MethodCollector.m14708i(193);
        if (context == null) {
            MethodCollector.m14707o(193);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (C0671f.class) {
                if (f21025d != null) {
                    arrayList.add(f21025d.toString());
                    f21025d = null;
                }
                for (C0670e c0670e : f21024c) {
                    arrayList.add(c0670e.toString());
                }
                f21022a = 0;
                f21024c.clear();
            }
            if (arrayList.isEmpty()) {
                MethodCollector.m14707o(193);
                return;
            }
            C0626b.m20749a(context, arrayList);
            MethodCollector.m14707o(193);
        } catch (Throwable th) {
            th.printStackTrace();
            MethodCollector.m14707o(193);
        }
    }

    /* renamed from: a */
    public static void m20604a(Context context, String str) {
        C0626b.m20750a(context, str);
    }

    /* renamed from: a */
    public static synchronized void m20602a(String str, JSONObject jSONObject, String str2) {
        synchronized (C0671f.class) {
            MethodCollector.m14708i(191);
            if (f21023b.containsKey(str)) {
                ((C0670e) f21023b.get(str)).m20606g(str2);
                MethodCollector.m14707o(191);
                return;
            }
            if (f21024c.size() > 0) {
                for (C0670e c0670e : f21024c) {
                    if (c0670e.m20618a() != null && c0670e.m20618a().equals(str) && jSONObject != null) {
                        jSONObject.remove(C2521l.LJIIL);
                        c0670e.m20606g(jSONObject.toString());
                        c0670e.m20606g(str2);
                    }
                }
            }
            MethodCollector.m14707o(191);
        }
    }

    /* renamed from: b */
    public static synchronized void m20601b(String str) {
        synchronized (C0671f.class) {
            MethodCollector.m14708i(190);
            if (f21023b.containsKey(str)) {
                C0670e c0670e = (C0670e) f21023b.get(str);
                f21025d = c0670e;
                c0670e.m20614b();
                f21023b.remove(str);
            }
            MethodCollector.m14707o(190);
        }
    }

    /* renamed from: b */
    public static void m20600b(String str, JSONObject jSONObject, String str2) {
        try {
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("msg");
            if (optInt == 0) {
                C0670e m20603a = m20603a(str);
                m20603a.m20617a(optInt);
                m20603a.m20608e(optString);
                return;
            }
            C0670e m20603a2 = m20603a(str);
            m20603a2.m20617a(optInt);
            m20603a2.m20608e(optString);
            m20603a2.m20609d(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m20599c(String str) {
        MethodCollector.m14708i(192);
        try {
            synchronized (C0671f.class) {
                if (f21023b.containsKey(str)) {
                    C0670e c0670e = (C0670e) f21023b.get(str);
                    c0670e.m20614b();
                    f21024c.add(c0670e);
                    f21023b.remove(str);
                }
                if (f21022a == 1 || f21024c.isEmpty()) {
                    MethodCollector.m14707o(192);
                    return;
                }
                f21022a = 1;
                new Timer().schedule(new C0672g(), 8000L);
                MethodCollector.m14707o(192);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            MethodCollector.m14707o(192);
        }
    }
}
