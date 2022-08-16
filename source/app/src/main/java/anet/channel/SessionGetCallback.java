package anet.channel;

import com.bytedance.covode.number.Covode;

/* loaded from: classes3.dex */
public interface SessionGetCallback {
    static {
        Covode.recordClassIndex(2141);
    }

    void onSessionGetFail();

    void onSessionGetSuccess(Session session);
}
