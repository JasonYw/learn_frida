package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EpUserInfo {
    public final String token;
    public final EpUser user;

    static {
        Covode.recordClassIndex(3409);
    }

    public final String getToken() {
        return this.token;
    }

    public final EpUser getUser() {
        return this.user;
    }

    public EpUserInfo(EpUser epUser, String str) {
        C106862S5w.LIZ(epUser, str);
        this.user = epUser;
        this.token = str;
    }
}
