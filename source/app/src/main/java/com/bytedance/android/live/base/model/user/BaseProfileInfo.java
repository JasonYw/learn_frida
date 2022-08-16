package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;

/* loaded from: classes11.dex */
public class BaseProfileInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("age")
    public int age;
    @SerializedName("avatar_large")
    public ImageModel avatarLarge;
    @SerializedName("avatar_medium")
    public ImageModel avatarMedium;
    @SerializedName("avatar_thumb")
    public ImageModel avatarThumb;
    @SerializedName("city")
    public String city;
    @SerializedName("display_id")
    public String displayId;
    @SerializedName("gender")
    public int gender;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public long f25757id;
    @SerializedName("id_str")
    public String idStr;
    @SerializedName("location_city")
    public String locationCity;
    @SerializedName("mystery_man")
    public int mysteryMan;
    @SerializedName("mystery_man_version")
    public int mysteryManVersion;
    @SerializedName("nickname")
    public String nickName;
    @SerializedName("poi_info")
    public ProfilePoiInfo poiInfo;
    @SerializedName("remark_name")
    public String remarkName;
    @SerializedName("school")
    public String school;
    @SerializedName("sec_uid")
    public String secUid;
    @SerializedName("secret")
    public int secret;
    @SerializedName("signature")
    public String signature;

    static {
        Covode.recordClassIndex(14139);
    }

    public boolean isMysteryMan() {
        if (this.mysteryMan == 2) {
            return true;
        }
        return false;
    }

    public String getIdStr() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(this.idStr)) {
            return String.valueOf(this.f25757id);
        }
        return this.idStr;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }
}
