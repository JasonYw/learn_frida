package com.bytedance.android.live.liveinteract.multianchor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class ListUserLinkmicContent implements Parcelable {
    public static final Parcelable.Creator<ListUserLinkmicContent> CREATOR = new C65773BxH(ListUserLinkmicContent.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("resource_id")
    public long LIZIZ;
    @SerializedName("show_identity")
    public boolean LIZJ;
    @SerializedName("pk_user_role")
    public int LIZLLL;
    @SerializedName("game_name")

    /* renamed from: LJ */
    public String f26351LJ;
    @SerializedName("fan_ticket")
    public String LJFF;

    static {
        Covode.recordClassIndex(28143);
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
        parcel.writeByte(this.LIZJ ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.LIZLLL);
        parcel.writeString(this.f26351LJ);
        parcel.writeString(this.LJFF);
    }

    public ListUserLinkmicContent() {
    }

    public ListUserLinkmicContent(Parcel parcel) {
        boolean z;
        this.LIZIZ = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = z;
        this.LIZLLL = parcel.readInt();
        this.f26351LJ = parcel.readString();
        this.LJFF = parcel.readString();
    }
}
