package com.bytedance.android.live.core.resources;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.List;
import p003X.KM9;

/* loaded from: classes5.dex */
public class AssetsModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("describe")
    public String describe;
    @SerializedName("download_type")
    public int downloadType;
    @SerializedName("format_265_resource")
    public ResourceH265Model h265ResourceModel;
    @SerializedName("format_265_super_resource")
    public ResourceH265SuperModel h265SuperResourceModel;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public long f26179id;
    @SerializedName("loki_extra")
    public String lokiExtra;
    @Expose(deserialize = false, serialize = false)
    public C4085a lokiExtraEntity;
    @SerializedName("lynx_schema")
    public String lynxSchema;
    @SerializedName("md5")
    public String md5;
    @SerializedName("model_requirements")
    public List<String> modelRequirements;
    @SerializedName("name")
    public String name;
    @SerializedName("resource_url")
    public C4086b resourceModel;
    @SerializedName("resource_type")
    public int resourceType;
    @SerializedName("resource_uri")
    public String resourceUri;
    @SerializedName("size")
    public long size;

    static {
        Covode.recordClassIndex(23581);
    }

    public String getDescribe() {
        return this.describe;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public long getId() {
        return this.f26179id;
    }

    public String getMD5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public C4086b getResourceModel() {
        return this.resourceModel;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public long getSize() {
        return this.size;
    }

    public C4085a getLokiExtraModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C4085a) proxy.result;
        }
        C4085a c4085a = this.lokiExtraEntity;
        if (c4085a != null) {
            return c4085a;
        }
        if (!TextUtils.isEmpty(this.lokiExtra)) {
            this.lokiExtraEntity = (C4085a) GsonProtectorUtils.fromJson(KM9.LIZ(), this.lokiExtra, (Class<Object>) C4085a.class);
        }
        return this.lokiExtraEntity;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        long j = this.f26179id;
        int i8 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = (i8 + i) * 31;
        String str2 = this.describe;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        String str3 = this.md5;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (((i10 + i3) * 31) + this.resourceType) * 31;
        String str4 = this.resourceUri;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        C4086b c4086b = this.resourceModel;
        if (c4086b != null) {
            i5 = c4086b.hashCode();
        } else {
            i5 = 0;
        }
        long j2 = this.size;
        int i13 = (((((i12 + i5) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.downloadType) * 31;
        ResourceH265Model resourceH265Model = this.h265ResourceModel;
        if (resourceH265Model != null) {
            i6 = resourceH265Model.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        ResourceH265SuperModel resourceH265SuperModel = this.h265SuperResourceModel;
        if (resourceH265SuperModel != null) {
            i7 = resourceH265SuperModel.hashCode();
        }
        return i14 + i7;
    }

    @SerializedName("describe")
    public void setDescribe(String str) {
        this.describe = str;
    }

    @SerializedName("download_type")
    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    @SerializedName("format_265_resource")
    public void setH265ResourceModel(ResourceH265Model resourceH265Model) {
        this.h265ResourceModel = resourceH265Model;
    }

    @SerializedName(C33968a.f42937f)
    public void setId(long j) {
        this.f26179id = j;
    }

    @SerializedName("loki_extra")
    public void setLokiExtra(String str) {
        this.lokiExtra = str;
    }

    @SerializedName("md5")
    public void setMD5(String str) {
        this.md5 = str;
    }

    @SerializedName("name")
    public void setName(String str) {
        this.name = str;
    }

    @SerializedName("resource_url")
    public void setResourceModel(C4086b c4086b) {
        this.resourceModel = c4086b;
    }

    @SerializedName("resource_type")
    public void setResourceType(int i) {
        this.resourceType = i;
    }

    @SerializedName("resource_uri")
    public void setResourceUri(String str) {
        this.resourceUri = str;
    }

    @SerializedName("size")
    public void setSize(long j) {
        this.size = j;
    }

    public boolean isMd5Matched(String str) {
        ResourceH265Model resourceH265Model;
        ResourceH265SuperModel resourceH265SuperModel;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.equals(str, this.md5) || (((resourceH265Model = this.h265ResourceModel) != null && TextUtils.equals(str, resourceH265Model.md5)) || ((resourceH265SuperModel = this.h265SuperResourceModel) != null && TextUtils.equals(str, resourceH265SuperModel.md5)))) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (obj == null || !(obj instanceof AssetsModel)) {
            return false;
        }
        AssetsModel assetsModel = (AssetsModel) obj;
        if (this.f26179id != assetsModel.f26179id || !this.md5.equals(assetsModel.getMD5())) {
            return false;
        }
        ResourceH265Model resourceH265Model = this.h265ResourceModel;
        if (resourceH265Model != null && assetsModel.h265ResourceModel != null && !TextUtils.equals(resourceH265Model.md5, assetsModel.h265ResourceModel.md5)) {
            return false;
        }
        ResourceH265SuperModel resourceH265SuperModel = this.h265SuperResourceModel;
        if (resourceH265SuperModel == null || assetsModel.h265SuperResourceModel == null || TextUtils.equals(resourceH265SuperModel.getMd5(), assetsModel.h265SuperResourceModel.getMd5())) {
            return true;
        }
        return false;
    }
}
