package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p003X.C109391T5d;
import p003X.KM9;

/* loaded from: classes8.dex */
public class ImageModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageModel> CREATOR = new Parcelable.Creator<ImageModel>() { // from class: com.bytedance.android.live.base.model.ImageModel.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(13961);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImageModel[] newArray(int i) {
            return new ImageModel[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.base.model.ImageModel, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImageModel createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new ImageModel(parcel);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avg_color")
    public String avgColor;
    @SerializedName("content")
    public Content content;
    @SerializedName(C109391T5d.LJFF)
    public int height;
    public String iconStub;
    @SerializedName("image_type")
    public int imageType;
    @SerializedName("is_animated")
    public boolean isAnimated;
    public boolean isFeedCandidate;
    public boolean isLoaded;
    public boolean isMonitored;
    public boolean isNinePatch;
    @SerializedName("uri")
    public String mUri;
    @SerializedName("url_list")
    public List<String> mUrls;
    @SerializedName("open_web_url")
    public String schema;
    @SerializedName("width")
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes8.dex */
    public static class Content implements Parcelable, Serializable {
        public static final Parcelable.Creator<Content> CREATOR = new Parcelable.Creator<Content>() { // from class: com.bytedance.android.live.base.model.ImageModel.Content.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(13963);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Content[] newArray(int i) {
                return new Content[i];
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.base.model.ImageModel$Content, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Content createFromParcel(Parcel parcel) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                return new Content(parcel);
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("alternative_text")
        public String accessibilityText;
        @SerializedName("font_color")
        public String fontColor;
        @SerializedName("level")
        public long level;
        @SerializedName("name")
        public String name;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Content() {
        }

        static {
            Covode.recordClassIndex(13962);
        }

        public Content(Parcel parcel) {
            this.name = parcel.readString();
            this.fontColor = parcel.readString();
            this.level = parcel.readLong();
            this.accessibilityText = parcel.readString();
        }

        public static boolean LIZ(Content content) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{content}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (content != null && !TextUtils.isEmpty(content.name) && !TextUtils.isEmpty(content.fontColor)) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            parcel.writeString(this.name);
            parcel.writeString(this.fontColor);
            parcel.writeLong(this.level);
            parcel.writeString(this.accessibilityText);
        }
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    public String getIconStub() {
        return this.iconStub;
    }

    @SerializedName("content")
    public Content getImageContent() {
        return this.content;
    }

    @SerializedName("image_type")
    public int getImageType() {
        return this.imageType;
    }

    @SerializedName("open_web_url")
    public String getSchema() {
        return this.schema;
    }

    @SerializedName("uri")
    public String getUri() {
        return this.mUri;
    }

    @SerializedName("url_list")
    public List<String> getUrls() {
        return this.mUrls;
    }

    public int getWidth() {
        return this.width;
    }

    @SerializedName("is_animated")
    public boolean isAnimated() {
        return this.isAnimated;
    }

    public boolean isFeedCandidate() {
        return this.isFeedCandidate;
    }

    public boolean isLoaded() {
        return this.isLoaded;
    }

    public boolean isMonitored() {
        return this.isMonitored;
    }

    static {
        Covode.recordClassIndex(13960);
    }

    public ImageModel() {
        this.mUrls = new ArrayList();
        this.isNinePatch = false;
    }

    public int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return hash(this.avgColor, this.mUri, this.mUrls, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public boolean isValid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<String> list = this.mUrls;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\"uri\":");
        sb.append(C1394i.f22426f);
        String str = this.mUri;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("\",\"image_type\":\"");
        String str2 = this.schema;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("\",\"url_list\":[");
        List<String> list = this.mUrls;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(C1394i.f22426f);
                sb.append(this.mUrls.get(i));
                sb.append(C1394i.f22426f);
                if (i != size - 1) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    @SerializedName("is_animated")
    public void setAnimated(boolean z) {
        this.isAnimated = z;
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    @SerializedName("content")
    public void setContent(Content content) {
        this.content = content;
    }

    public void setFeedCandidate(boolean z) {
        this.isFeedCandidate = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIconStub(String str) {
        this.iconStub = str;
    }

    @SerializedName("image_type")
    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public void setMonitored(boolean z) {
        this.isMonitored = z;
    }

    @SerializedName("open_web_url")
    public void setSchema(String str) {
        this.schema = str;
    }

    @SerializedName("uri")
    public void setUri(String str) {
        this.mUri = str;
    }

    @SerializedName("url_list")
    public void setUrls(List<String> list) {
        this.mUrls = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static ImageModel fromJson(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        return (ImageModel) GsonProtectorUtils.fromJson(KM9.LIZ(), str, (Class<Object>) ImageModel.class);
    }

    public static ImageModel genBy(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(Collections.singletonList(str));
        return imageModel;
    }

    public static int hash(Object... objArr) {
        int hashCode;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{objArr}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (objArr == null) {
            return 0;
        }
        int i = 1;
        for (Object obj : objArr) {
            int i2 = i * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i = i2 + hashCode;
        }
        return i;
    }

    public static String toJsonString(ImageModel imageModel) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{imageModel}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (imageModel == null) {
            return "";
        }
        return GsonProtectorUtils.toJson(KM9.LIZ(), imageModel);
    }

    public boolean equalsOnlyUri(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return equals(this.mUri, ((ImageModel) obj).mUri);
    }

    public ImageModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.mUrls = new ArrayList();
        boolean z4 = false;
        this.isNinePatch = false;
        this.mUri = parcel.readString();
        this.mUrls = parcel.createStringArrayList();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.schema = parcel.readString();
        this.imageType = parcel.readInt();
        this.content = (Content) parcel.readParcelable(Content.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimated = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isLoaded = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isMonitored = z3;
        this.isFeedCandidate = parcel.readByte() != 0 ? true : z4;
    }

    public static ImageModel fromJson(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        return (ImageModel) GsonProtectorUtils.fromJson(KM9.LIZ(), jSONObject.toString(), (Class<Object>) ImageModel.class);
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ImageModel imageModel = (ImageModel) obj;
            if (this.width == imageModel.width && this.height == imageModel.height && equals(this.avgColor, imageModel.avgColor) && equals(this.mUri, imageModel.mUri) && equals(this.mUrls, imageModel.mUrls)) {
                return true;
            }
        }
        return false;
    }

    public ImageModel(String str, List<String> list) {
        this.mUrls = new ArrayList();
        this.isNinePatch = false;
        this.mUri = str;
        this.mUrls = list;
    }

    public static boolean equals(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        parcel.writeString(this.mUri);
        parcel.writeStringList(this.mUrls);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.schema);
        parcel.writeInt(this.imageType);
        parcel.writeParcelable(this.content, i);
        parcel.writeByte(this.isAnimated ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLoaded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMonitored ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFeedCandidate ? (byte) 1 : (byte) 0);
    }

    public ImageModel(String str, List<String> list, String str2) {
        this.mUrls = new ArrayList();
        this.isNinePatch = false;
        this.mUri = str;
        this.mUrls = list;
        this.schema = str2;
    }
}
