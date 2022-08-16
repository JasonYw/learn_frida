package cn.com.chinatelecom.account.api.p037d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import p003X.C116971W2r;

/* renamed from: cn.com.chinatelecom.account.api.d.a */
/* loaded from: classes.dex */
public class C0656a {

    /* renamed from: b */
    public static Executor f20954b = C116971W2r.LIZ();

    /* renamed from: a */
    public Handler f20955a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(2707);
    }

    /* renamed from: a */
    public static void m20694a(Runnable runnable) {
        f20954b.execute(runnable);
    }
}
