package cn.com.chinatelecom.account.api;

import cn.com.chinatelecom.account.api.p038e.C0671f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: cn.com.chinatelecom.account.api.d */
/* loaded from: classes2.dex */
public final class RunnableC0655d implements Runnable {

    /* renamed from: a */
    public /* synthetic */ ResultListener f20951a;

    /* renamed from: b */
    public /* synthetic */ String f20952b;

    /* renamed from: c */
    public /* synthetic */ JSONObject f20953c;

    static {
        Covode.recordClassIndex(2706);
    }

    public RunnableC0655d(ResultListener resultListener, String str, JSONObject jSONObject) {
        this.f20951a = resultListener;
        this.f20952b = str;
        this.f20953c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20951a != null) {
            try {
                if (this.f20952b != null) {
                    this.f20953c.put("reqId", this.f20952b);
                }
                this.f20951a.onResult(this.f20953c.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C0671f.m20599c(this.f20952b);
        }
    }
}
