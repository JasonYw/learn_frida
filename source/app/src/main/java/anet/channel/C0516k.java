package anet.channel;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p003X.V30;

/* renamed from: anet.channel.k */
/* loaded from: classes13.dex */
public class C0516k implements V30 {

    /* renamed from: a */
    public final /* synthetic */ RunnableC0515j f20537a;

    static {
        Covode.recordClassIndex(2222);
    }

    public C0516k(RunnableC0515j runnableC0515j) {
        this.f20537a = runnableC0515j;
    }

    @Override // p003X.V30
    public boolean handleCache(String str, Map<String, String> map) {
        return "weex".equals(map.get("f-refer"));
    }
}
