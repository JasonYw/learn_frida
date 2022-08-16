package com.alibaba.sdk.android.utils.crashdefend;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.utils.C1109c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.b */
/* loaded from: classes13.dex */
public class C1111b {

    /* renamed from: b */
    public static C1111b f21716b;

    /* renamed from: a */
    public Context f21717a;

    /* renamed from: a */
    public C1109c f21718a;

    /* renamed from: a */
    public C1113c f21720a;

    /* renamed from: b */
    public ExecutorService f21723b;

    /* renamed from: a */
    public C1110a f21719a = new C1110a();

    /* renamed from: a */
    public final List<C1113c> f21721a = new ArrayList();

    /* renamed from: d */
    public Map<String, String> f21724d = new HashMap();

    /* renamed from: a */
    public final int[] f21722a = new int[5];

    static {
        Covode.recordClassIndex(4528);
    }

    /* renamed from: d */
    public void m19783d(String str, String str2) {
    }

    /* renamed from: a */
    public boolean m19789a(C1113c c1113c, SDKMessageCallback sDKMessageCallback) {
        C1113c m19790a;
        if (c1113c != null && sDKMessageCallback != null) {
            try {
                if (TextUtils.isEmpty(c1113c.f21733b) || TextUtils.isEmpty(c1113c.f21730a) || (m19790a = m19790a(c1113c, sDKMessageCallback)) == null) {
                    return false;
                }
                boolean m19791a = m19791a(m19790a);
                if (m19790a.crashCount == m19790a.f21727a) {
                    m19787a(m19790a.f21730a, m19790a.f21733b, m19790a.crashCount, m19790a.f21727a);
                }
                m19790a.crashCount++;
                C1115e.m19780a(this.f21717a, this.f21719a, this.f21721a);
                if (m19791a) {
                    m19792a(m19790a);
                    return true;
                }
                sDKMessageCallback.crashDefendMessage(m19790a.f21727a, m19790a.crashCount - 1);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m19791a(C1113c c1113c) {
        if (c1113c.crashCount < c1113c.f21727a) {
            c1113c.f21728a = c1113c.f21732b;
            return true;
        }
        C1113c c1113c2 = this.f21720a;
        if (c1113c2 == null || !c1113c2.f21730a.equals(c1113c.f21730a)) {
            return false;
        }
        c1113c.crashCount = c1113c.f21727a - 1;
        c1113c.f21728a = c1113c.f21732b;
        return true;
    }

    /* renamed from: com.alibaba.sdk.android.utils.crashdefend.b$a */
    /* loaded from: classes13.dex */
    public class RunnableC1112a implements Runnable {

        /* renamed from: a */
        public C1114d f21725a;

        static {
            Covode.recordClassIndex(4529);
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    Thread.sleep(1000L);
                    C1114d c1114d = this.f21725a;
                    c1114d.f21737d--;
                } catch (InterruptedException | Exception unused) {
                    return;
                }
            } while (this.f21725a.f21737d > 0);
            if (this.f21725a.f21737d > 0) {
                return;
            }
            C1111b.this.m19785b(this.f21725a.f21736b);
            C1115e.m19780a(C1111b.this.f21717a, C1111b.this.f21719a, (List<C1113c>) C1111b.this.f21721a);
        }

        public RunnableC1112a(C1114d c1114d) {
            this.f21725a = c1114d;
        }
    }

    /* renamed from: a */
    private void m19798a() {
        if (C1115e.m19779a(this.f21717a, this.f21719a, this.f21721a)) {
            this.f21719a.f21715a++;
            return;
        }
        this.f21719a.f21715a = 1L;
    }

    /* renamed from: b */
    private void m19786b() {
        this.f21720a = null;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f21721a) {
            for (C1113c c1113c : this.f21721a) {
                if (c1113c.crashCount >= c1113c.f21727a) {
                    arrayList.add(c1113c);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1113c c1113c2 = (C1113c) it.next();
                if (c1113c2.f21734c < 5) {
                    if (c1113c2.f21728a < this.f21719a.f21715a - this.f21722a[c1113c2.f21734c]) {
                        this.f21720a = c1113c2;
                        break;
                    }
                }
            }
            if (this.f21720a != null) {
                this.f21720a.f21734c++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m19785b(C1113c c1113c) {
        if (c1113c == null) {
            return;
        }
        if (c1113c.f21734c > 0) {
            m19784b(c1113c.f21730a, c1113c.f21733b, c1113c.f21734c, 5);
        }
        c1113c.crashCount = 0;
        c1113c.f21734c = 0;
    }

    /* renamed from: a */
    private void m19792a(C1113c c1113c) {
        if (c1113c == null) {
            return;
        }
        C1114d c1114d = new C1114d();
        c1114d.f21736b = c1113c;
        c1114d.f21737d = c1113c.f21731b;
        m19788a(c1114d);
        if (c1113c.f21729a != null) {
            c1113c.f21729a.crashDefendMessage(c1113c.f21727a, c1113c.crashCount - 1);
        }
    }

    /* renamed from: a */
    private void m19788a(C1114d c1114d) {
        if (c1114d != null && c1114d.f21736b != null) {
            this.f21723b.execute(new RunnableC1112a(c1114d));
        }
    }

    /* renamed from: a */
    public static synchronized C1111b m19797a(Context context, C1109c c1109c) {
        C1111b c1111b;
        synchronized (C1111b.class) {
            if (f21716b == null) {
                f21716b = new C1111b(context, c1109c);
            }
            c1111b = f21716b;
        }
        return c1111b;
    }

    public C1111b(Context context, C1109c c1109c) {
        this.f21723b = null;
        this.f21717a = context;
        this.f21718a = c1109c;
        this.f21723b = new C1116f().m19778a();
        int i = 0;
        do {
            this.f21722a[i] = (i * 5) + 5;
            i++;
        } while (i < 5);
        this.f21724d.put("sdkId", "utils");
        this.f21724d.put("sdkVersion", "1.1.5");
        try {
            m19798a();
            m19786b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private C1113c m19790a(C1113c c1113c, SDKMessageCallback sDKMessageCallback) {
        C1113c c1113c2;
        synchronized (this.f21721a) {
            if (this.f21721a != null && this.f21721a.size() > 0) {
                Iterator<C1113c> it = this.f21721a.iterator();
                while (it.hasNext()) {
                    c1113c2 = it.next();
                    if (c1113c2 != null && c1113c2.f21730a.equals(c1113c.f21730a)) {
                        if (!c1113c2.f21733b.equals(c1113c.f21733b)) {
                            c1113c2.f21733b = c1113c.f21733b;
                            c1113c2.f21727a = c1113c.f21727a;
                            c1113c2.f21731b = c1113c.f21731b;
                            c1113c2.crashCount = 0;
                            c1113c2.f21734c = 0;
                        }
                        if (c1113c2.f21735d) {
                            return null;
                        }
                        c1113c2.f21735d = true;
                        c1113c2.f21729a = sDKMessageCallback;
                        c1113c2.f21732b = this.f21719a.f21715a;
                        return c1113c2;
                    }
                }
            }
            c1113c2 = (C1113c) c1113c.clone();
            c1113c2.f21735d = true;
            c1113c2.f21729a = sDKMessageCallback;
            c1113c2.crashCount = 0;
            c1113c2.f21732b = this.f21719a.f21715a;
            this.f21721a.add(c1113c2);
            return c1113c2;
        }
    }

    /* renamed from: b */
    private void m19784b(String str, String str2, int i, int i2) {
        if (this.f21718a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f21724d);
        hashMap.put("crashSdkId", str);
        hashMap.put("crashSdkVer", str2);
        hashMap.put("recoverCount", String.valueOf(i));
        hashMap.put("recoverThreshold", String.valueOf(i2));
        this.f21718a.sendCustomHit("utils_biz_recover", 0L, hashMap);
    }

    /* renamed from: a */
    private void m19787a(String str, String str2, int i, int i2) {
        if (this.f21718a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f21724d);
        hashMap.put("crashSdkId", str);
        hashMap.put("crashSdkVer", str2);
        hashMap.put("curCrashCount", String.valueOf(i));
        hashMap.put("crashThreshold", String.valueOf(i2));
        this.f21718a.sendCustomHit("utils_biz_crash", 0L, hashMap);
    }
}
