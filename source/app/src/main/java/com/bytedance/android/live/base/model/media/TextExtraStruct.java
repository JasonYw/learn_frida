package com.bytedance.android.live.base.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class TextExtraStruct implements Parcelable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new Parcelable.Creator<TextExtraStruct>() { // from class: com.bytedance.android.live.base.model.media.TextExtraStruct.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(14089);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextExtraStruct[] newArray(int i) {
            return new TextExtraStruct[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.base.model.media.TextExtraStruct] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextExtraStruct createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new TextExtraStruct(parcel);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("end")
    public int end;
    public transient boolean isAddPosition;
    @SerializedName("start")
    public int start;
    @SerializedName("user_id")
    public long userId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TextExtraStruct() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isAddPosition() {
        return this.isAddPosition;
    }

    static {
        Covode.recordClassIndex(14088);
    }

    public void setAddPosition(boolean z) {
        this.isAddPosition = z;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    public TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeLong(this.userId);
    }
}
