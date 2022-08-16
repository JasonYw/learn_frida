package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EpUser {
    public final String bizSecUid;
    public final String bizUid;
    public final long epUid;

    static {
        Covode.recordClassIndex(3408);
    }

    public final String getBizSecUid() {
        return this.bizSecUid;
    }

    public final String getBizUid() {
        return this.bizUid;
    }

    public final long getEpUid() {
        return this.epUid;
    }

    public EpUser(String str, String str2, long j) {
        C106862S5w.LIZ(str);
        this.bizUid = str;
        this.bizSecUid = str2;
        this.epUid = j;
    }
}
