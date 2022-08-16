package com.bytedance.android.live.broadcast.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class Challenge implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cha_name")
    public String challengeName;
    @SerializedName("cid")
    public String cid;
    public String creationId;
    public boolean isCategoryBind;
    @SerializedName("is_commerce")
    public boolean isCommerce;
    public boolean isCustom;
    public boolean isRecommend;
    public boolean recommendAutoCancel;
    public String source;
    @SerializedName("sticker_id")
    public String stickerId;
    @SerializedName("type")
    public int type;
    @SerializedName("user_count")
    public int userCount;
    @SerializedName("view_count")
    public long viewCount;

    static {
        Covode.recordClassIndex(16981);
    }

    public int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.cid.hashCode();
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ((obj instanceof Challenge) && TextUtils.equals(((Challenge) obj).cid, this.cid)) {
            return true;
        }
        return false;
    }

    public Challenge(String str, String str2) {
        this.viewCount = -1L;
        this.source = "";
        this.cid = str;
        this.challengeName = str2;
    }

    public Challenge(String str, String str2, String str3) {
        this.viewCount = -1L;
        this.source = "";
        this.cid = str;
        this.challengeName = str2;
        this.source = str3;
    }
}
