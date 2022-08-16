package anet.channel.strategy.dispatch;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IAmdcSign {
    static {
        Covode.recordClassIndex(2322);
    }

    String getAppkey();

    String sign(String str);

    boolean useSecurityGuard();
}
