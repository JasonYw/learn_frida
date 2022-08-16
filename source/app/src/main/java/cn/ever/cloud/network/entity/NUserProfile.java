package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;

/* loaded from: classes23.dex */
public final class NUserProfile {
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public final long f21065id;
    @SerializedName("media_num")
    public final long mediaNum;
    @SerializedName("quota")
    public final long quota;
    @SerializedName("usage")
    public final long usage;

    static {
        Covode.recordClassIndex(3241);
    }

    public final long getId() {
        return this.f21065id;
    }

    public final long getMediaNum() {
        return this.mediaNum;
    }

    public final long getQuota() {
        return this.quota;
    }

    public final long getUsage() {
        return this.usage;
    }

    public NUserProfile(long j, long j2, long j3, long j4) {
        this.f21065id = j;
        this.quota = j2;
        this.usage = j3;
        this.mediaNum = j4;
    }
}
