package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class PlayerInfoListData implements Parcelable {
    public static final Parcelable.Creator<PlayerInfoListData> CREATOR = new C65773BxH(PlayerInfoListData.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("user")
    public List<LinkPlayerInfo> LIZIZ;
    @SerializedName("locked_positions")
    public List<LinkmicPositionItem> LIZJ;
    @SerializedName("has_more")
    public boolean LIZLLL;
    @SerializedName("total_count")

    /* renamed from: LJ */
    public int f26418LJ;
    @SerializedName("next_cursor")
    public String LJFF;
    @SerializedName("now")
    public long LJI;
    @SerializedName("sort_strategy")
    public int LJII;
    @SerializedName("pre_link_users")
    public List<AnchorLinkUser> LJIIIIZZ;
    @SerializedName("show_paid_linkmic_guide")
    public boolean LJIIIZ;
    @SerializedName("has_prepare_apply")
    public boolean LJIIJ;

    static {
        Covode.recordClassIndex(29410);
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
        parcel.writeTypedList(this.LIZIZ);
        parcel.writeTypedList(this.LIZJ);
        parcel.writeByte(this.LIZLLL ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f26418LJ);
        parcel.writeString(this.LJFF);
        parcel.writeLong(this.LJI);
        parcel.writeInt(this.LJII);
        parcel.writeTypedList(this.LJIIIIZZ);
        parcel.writeByte(this.LJIIIZ ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LJIIJ ? (byte) 1 : (byte) 0);
    }

    public PlayerInfoListData() {
        this.LJII = 40;
    }

    public PlayerInfoListData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.LJII = 40;
        this.LIZIZ = parcel.createTypedArrayList(LinkPlayerInfo.CREATOR);
        this.LIZJ = parcel.createTypedArrayList(LinkmicPositionItem.CREATOR);
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        this.f26418LJ = parcel.readInt();
        this.LJFF = parcel.readString();
        this.LJI = parcel.readLong();
        this.LJII = parcel.readInt();
        this.LJIIIIZZ = parcel.createTypedArrayList(AnchorLinkUser.CREATOR);
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIZ = z2;
        this.LJIIJ = parcel.readByte() == 0 ? false : z3;
    }
}
