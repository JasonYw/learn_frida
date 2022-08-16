package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class Author implements Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new C65773BxH(Author.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("video_total_count")
    public long LIZIZ;
    @SerializedName("video_total_play_count")
    public long LIZJ;
    @SerializedName("video_total_share_count")
    public long LIZLLL;
    @SerializedName("video_total_series_count")

    /* renamed from: LJ */
    public long f25756LJ;
    @SerializedName("variety_show_play_count")
    public long LJFF;
    @SerializedName("video_total_favorite_count")
    public long LJI;

    static {
        Covode.recordClassIndex(14137);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        parcel.writeLong(this.LIZIZ);
        parcel.writeLong(this.LIZJ);
        parcel.writeLong(this.LIZLLL);
        parcel.writeLong(this.f25756LJ);
        parcel.writeLong(this.LJFF);
        parcel.writeLong(this.LJI);
    }

    public Author() {
    }

    public Author(Parcel parcel) {
        this.LIZIZ = parcel.readLong();
        this.LIZJ = parcel.readLong();
        this.LIZLLL = parcel.readLong();
        this.f25756LJ = parcel.readLong();
        this.LJFF = parcel.readLong();
        this.LJI = parcel.readLong();
    }
}
