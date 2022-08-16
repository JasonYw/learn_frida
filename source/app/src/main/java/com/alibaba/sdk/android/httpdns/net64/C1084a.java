package com.alibaba.sdk.android.httpdns.net64;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.alibaba.sdk.android.httpdns.net64.a */
/* loaded from: classes19.dex */
public class C1084a implements Net64Service {

    /* renamed from: a */
    public C1087b f21643a;

    /* renamed from: a */
    public ConcurrentHashMap<String, List<String>> f21644a;

    /* renamed from: o */
    public boolean f21645o;

    /* renamed from: p */
    public volatile boolean f21646p;

    /* renamed from: com.alibaba.sdk.android.httpdns.net64.a$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C10851 {
        static {
            Covode.recordClassIndex(4492);
        }
    }

    /* renamed from: com.alibaba.sdk.android.httpdns.net64.a$a */
    /* loaded from: classes19.dex */
    public static final class C1086a {

        /* renamed from: a */
        public static final C1084a f21647a = new C1084a(null);

        static {
            Covode.recordClassIndex(4493);
        }
    }

    static {
        Covode.recordClassIndex(4491);
    }

    public C1084a() {
        this.f21643a = new C1087b();
        this.f21644a = new ConcurrentHashMap<>();
    }

    public /* synthetic */ C1084a(C10851 c10851) {
        this();
    }

    /* renamed from: a */
    public static C1084a m19856a() {
        return C1086a.f21647a;
    }

    /* renamed from: a */
    public List<String> m19854a(String str) {
        return this.f21644a.get(str);
    }

    /* renamed from: a */
    public void m19853a(String str, List<String> list) {
        this.f21644a.put(str, list);
    }

    /* renamed from: a */
    public boolean m19855a() {
        return this.f21645o;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z) {
        this.f21645o = z;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        List<String> list;
        if (this.f21645o && (list = this.f21644a.get(str)) != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: i */
    public boolean m19852i() {
        return this.f21646p;
    }
}
