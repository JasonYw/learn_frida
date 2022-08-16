package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NPackTag {
    @SerializedName("cover_link")
    public final Long coverLink;
    @SerializedName("cover_md5")
    public final String coverMd5;
    @SerializedName("created_at_utc")
    public final long createdAtUtc;
    @SerializedName("creator_id")
    public final long creatorId;
    @SerializedName("deleted")
    public final boolean deleted;
    @SerializedName("desc")
    public final String desc;
    @SerializedName("display_name")
    public final String displayName;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public final long f21064id;
    @SerializedName("modified_time_utc")
    public final long modifiedTimeUtc;

    static {
        Covode.recordClassIndex(3224);
    }

    public final Long getCoverLink() {
        return this.coverLink;
    }

    public final String getCoverMd5() {
        return this.coverMd5;
    }

    public final long getCreatedAtUtc() {
        return this.createdAtUtc;
    }

    public final long getCreatorId() {
        return this.creatorId;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getId() {
        return this.f21064id;
    }

    public final long getModifiedTimeUtc() {
        return this.modifiedTimeUtc;
    }

    public NPackTag(long j, String str, long j2, boolean z, long j3, long j4, String str2, Long l, String str3) {
        C106862S5w.LIZ(str);
        this.f21064id = j;
        this.displayName = str;
        this.creatorId = j2;
        this.deleted = z;
        this.modifiedTimeUtc = j3;
        this.createdAtUtc = j4;
        this.coverMd5 = str2;
        this.coverLink = l;
        this.desc = str3;
    }
}
