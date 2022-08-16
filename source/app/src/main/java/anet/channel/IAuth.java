package anet.channel;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IAuth {

    /* loaded from: classes2.dex */
    public interface AuthCallback {
        static {
            Covode.recordClassIndex(2133);
        }

        void onAuthFail(int i, String str);

        void onAuthSuccess();
    }

    static {
        Covode.recordClassIndex(2132);
    }

    void auth(Session session, AuthCallback authCallback);
}
