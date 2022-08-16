package com.bytedance.android.live.liveinteract.multianchor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class ListUserLinkmicAudienceContent implements Parcelable {
    public static final Parcelable.Creator<ListUserLinkmicAudienceContent> CREATOR = new C65773BxH(ListUserLinkmicAudienceContent.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("fan_ticket")
    public long LIZIZ;
    @SerializedName("fan_ticket_fuzzy_str")
    public String LIZJ;
    @SerializedName("fan_ticket_real_str")
    public String LIZLLL;
    @SerializedName("rank_contributor_ids")

    /* renamed from: LJ */
    public List<Long> f26350LJ;
    @SerializedName("host_permission")
    public boolean LJFF;
    @SerializedName("client_version")
    public long LJI;
    @SerializedName(Constants.APP_ID)
    public long LJII;
    @SerializedName("device_platform")
    public String LJIIIIZZ;
    @SerializedName("in_waiting_list")
    public boolean LJIIIZ;
    @SerializedName("extra")
    public String LJIIJ;
    @SerializedName("join_channel_time")
    public long LJIIJJI;
    @SerializedName("expected_leave_time")
    public long LJIIL;
    @SerializedName("current_time")
    public long LJIILIIL;
    @SerializedName("is_enlarged")
    public boolean LJIILJJIL;
    @SerializedName("list_user_role")
    public int LJIILL;
    @SerializedName("mic_dress")
    public MicDress LJIILLIIL;
    @SerializedName("paid_count")
    public long LJIIZILJ;
    @SerializedName("is_anonymous")
    public boolean LJIJ;
    @SerializedName("self_discipline_duration")
    public long LJIJI;

    static {
        Covode.recordClassIndex(28142);
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
        parcel.writeString(this.LIZJ);
        parcel.writeString(this.LIZLLL);
        parcel.writeList(this.f26350LJ);
        parcel.writeByte(this.LJFF ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.LJI);
        parcel.writeLong(this.LJII);
        parcel.writeString(this.LJIIIIZZ);
        parcel.writeByte(this.LJIIIZ ? (byte) 1 : (byte) 0);
        parcel.writeString(this.LJIIJ);
        parcel.writeLong(this.LJIIJJI);
        parcel.writeLong(this.LJIIL);
        parcel.writeLong(this.LJIILIIL);
        parcel.writeByte(this.LJIILJJIL ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.LJIILL);
        parcel.writeParcelable(this.LJIILLIIL, i);
        parcel.writeLong(this.LJIIZILJ);
        parcel.writeByte(this.LJIJ ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.LJIJI);
    }

    public ListUserLinkmicAudienceContent() {
    }

    public ListUserLinkmicAudienceContent(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.LIZIZ = parcel.readLong();
        this.LIZJ = parcel.readString();
        this.LIZLLL = parcel.readString();
        this.f26350LJ = parcel.readArrayList(ListUserLinkmicAudienceContent.class.getClassLoader());
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        this.LJI = parcel.readLong();
        this.LJII = parcel.readLong();
        this.LJIIIIZZ = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIZ = z2;
        this.LJIIJ = parcel.readString();
        this.LJIIJJI = parcel.readLong();
        this.LJIIL = parcel.readLong();
        this.LJIILIIL = parcel.readLong();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJIILJJIL = z3;
        this.LJIILL = parcel.readInt();
        this.LJIILLIIL = (MicDress) parcel.readParcelable(MicDress.class.getClassLoader());
        this.LJIIZILJ = parcel.readLong();
        this.LJIJ = parcel.readByte() == 0 ? false : z4;
        this.LJIJI = parcel.readLong();
    }
}
