package anet.channel.strategy;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.c */
/* loaded from: classes13.dex */
public class C0551c {

    /* renamed from: a */
    public final ConcurrentHashMap<String, String> f20736a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public boolean f20737b = true;

    static {
        Covode.recordClassIndex(2313);
    }

    /* renamed from: anet.channel.strategy.c$a */
    /* loaded from: classes13.dex */
    public static class C0552a {

        /* renamed from: a */
        public static C0551c f20738a = new C0551c();

        static {
            Covode.recordClassIndex(2314);
        }
    }

    /* renamed from: a */
    public void m20833a(boolean z) {
        this.f20737b = z;
    }

    /* renamed from: b */
    public void m20832b(String str) {
        this.f20736a.put(str, "http");
    }

    /* renamed from: a */
    public String m20834a(String str) {
        if (!this.f20737b) {
            return null;
        }
        String str2 = this.f20736a.get(str);
        if (str2 == null) {
            this.f20736a.put(str, "https");
            return "https";
        }
        return str2;
    }
}
