package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class FlexImageStruct implements Parcelable {
    public static final Parcelable.Creator<FlexImageStruct> CREATOR = new Parcelable.Creator<FlexImageStruct>() { // from class: com.bytedance.android.live.base.model.FlexImageStruct.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(13959);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FlexImageStruct[] newArray(int i) {
            return new FlexImageStruct[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.base.model.FlexImageStruct] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FlexImageStruct createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new FlexImageStruct(parcel);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("flex_setting")
    public List<Long> flexSetting;
    @SerializedName("uri")
    public String uri;
    @SerializedName("url_list")
    public List<String> urlList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FlexImageStruct() {
    }

    public List<Long> getFlexSetting() {
        return this.flexSetting;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    static {
        Covode.recordClassIndex(13958);
    }

    public FlexImageStruct(Parcel parcel) {
        this.urlList = parcel.createStringArrayList();
        this.uri = parcel.readString();
        this.flexSetting = new ArrayList();
        parcel.readList(this.flexSetting, Long.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeStringList(this.urlList);
        parcel.writeString(this.uri);
        parcel.writeList(this.flexSetting);
    }
}
