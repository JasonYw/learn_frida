package cn.ever.cloud.network.auth;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public interface DependToken {
    static {
        Covode.recordClassIndex(3175);
    }

    SessionToken getNewToken();

    /* loaded from: classes23.dex */
    public static final class SessionToken {
        public final String newSessionToken;
        public final UserId userId;

        static {
            Covode.recordClassIndex(3176);
        }

        public final String getNewSessionToken() {
            return this.newSessionToken;
        }

        public final UserId getUserId() {
            return this.userId;
        }

        public SessionToken(UserId userId, String str) {
            C106862S5w.LIZ(userId, str);
            this.userId = userId;
            this.newSessionToken = str;
        }
    }
}
