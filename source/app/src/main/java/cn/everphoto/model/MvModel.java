package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.p1594ss.android.ugc.aweme.base.model.UrlModel;
import com.umeng.commonsdk.vchannel.C33968a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class MvModel implements Serializable {
    @SerializedName("desc")
    public String desc;
    @SerializedName("extra")
    public String extra;
    @SerializedName("icon_url")
    public UrlModel iconUrl;
    @SerializedName("is_collected")
    public boolean isCollected;
    @SerializedName(C33968a.f42937f)
    public String mvId;
    @SerializedName("name")
    public String name;
    @SerializedName("user_count")
    public Long userCount;

    static {
        Covode.recordClassIndex(3624);
    }
}
