package cn.com.chinatelecom.account.p033a;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.Helper;
import cn.com.chinatelecom.account.api.p034a.C0631c;
import cn.com.chinatelecom.account.api.p037d.C0656a;
import cn.com.chinatelecom.account.api.p038e.C0668c;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.umeng.message.proguard.C34037f;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: cn.com.chinatelecom.account.a.b */
/* loaded from: classes2.dex */
public class C0626b extends C0656a {
    static {
        Covode.recordClassIndex(2670);
        C0626b.class.getSimpleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5.equals("ERROR") != false) goto L9;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m20750a(android.content.Context r4, java.lang.String r5) {
        /*
            int r3 = r5.hashCode()
            r2 = 64897(0xfd81, float:9.094E-41)
            r0 = 2
            r0 = 1
            r1 = -1
            r0 = 0
            if (r3 == r2) goto L2a
            r0 = 78159(0x1314f, float:1.09524E-40)
            if (r3 == r0) goto L20
            r0 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r3 != r0) goto L30
            java.lang.String r0 = "ERROR"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L30
            goto L31
        L20:
            java.lang.String r0 = "OFF"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L30
            r1 = -2
            goto L31
        L2a:
            java.lang.String r0 = "ALL"
            boolean r0 = r5.equals(r0)
        L30:
            r1 = 0
        L31:
            java.lang.String r0 = "key_c_l_l_v"
            cn.com.chinatelecom.account.api.p038e.C0668c.m20647a(r4, r0, r1)     // Catch: java.lang.Exception -> L37
            return
        L37:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.p033a.C0626b.m20750a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m20749a(Context context, List list) {
        int m20745b = m20745b(context);
        if (m20745b == -2) {
            return;
        }
        C0656a.m20694a(new RunnableC0627c(context, list, m20745b));
    }

    /* renamed from: a */
    public static /* synthetic */ void m20746a(Context context, Queue queue, int i) {
        String str;
        JSONObject jSONObject;
        MethodCollector.m14708i(167);
        JSONArray jSONArray = new JSONArray();
        if (queue != null && !queue.isEmpty()) {
            Iterator it = queue.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                try {
                    jSONObject = new JSONObject((String) it.next());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i != -1 || jSONObject.getInt("rt") != 0) {
                    jSONArray.put(jSONObject);
                    i2++;
                    if (i2 > 10) {
                        break;
                    }
                }
            }
        }
        if (jSONArray.length() > 0) {
            try {
                str = Helper.eneulret(jSONArray.toString());
            } catch (Exception e2) {
                str = null;
                e2.printStackTrace();
            }
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            C0668c.m20648a(context, str);
        }
        MethodCollector.m14707o(167);
    }

    /* renamed from: b */
    public static int m20745b(Context context) {
        int i = 0;
        try {
            i = C0668c.m20642b(context, "key_c_l_l_v", 0);
            return i;
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    /* renamed from: b */
    public static String m20743b(Context context, Queue queue) {
        MethodCollector.m14708i(166);
        JSONArray jSONArray = new JSONArray();
        String jSONArray2 = jSONArray.toString();
        if (!queue.isEmpty()) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(new JSONObject((String) it.next()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (jSONArray.length() <= 0) {
            MethodCollector.m14707o(166);
            return "";
        }
        String jSONArray3 = jSONArray.toString();
        if (!TextUtils.isEmpty(jSONArray3)) {
            try {
                jSONArray2 = URLEncoder.encode(Helper.guulam(context, jSONArray3), C34037f.f43302f);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String m20752a = C0625a.m20752a(C0673h.m20593c(), jSONArray2);
        MethodCollector.m14707o(166);
        return m20752a;
    }

    /* renamed from: b */
    public static synchronized Queue m20744b(Context context, List list, int i) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (C0626b.class) {
            MethodCollector.m14708i(165);
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            String m20649a = C0668c.m20649a(context);
            if (!TextUtils.isEmpty(m20649a)) {
                try {
                    JSONArray jSONArray = new JSONArray(new String(Helper.dneulret(C0631c.m20737a(m20649a))));
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length && i2 <= 10; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            concurrentLinkedQueue.add(jSONObject.toString());
                        }
                    }
                    C0668c.m20648a(context, "");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (i == -1) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    try {
                        if (new JSONObject(str).getInt("rt") != 0) {
                            concurrentLinkedQueue.add(str);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (i == 0) {
                concurrentLinkedQueue.addAll(list);
            }
            while (concurrentLinkedQueue.size() > 10) {
                concurrentLinkedQueue.poll();
            }
            MethodCollector.m14707o(165);
        }
        return concurrentLinkedQueue;
    }
}
