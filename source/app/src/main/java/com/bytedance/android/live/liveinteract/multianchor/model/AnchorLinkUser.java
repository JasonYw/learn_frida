package com.bytedance.android.live.liveinteract.multianchor.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.MicPosTagInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9531aq;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9536f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class AnchorLinkUser implements Parcelable, r$c {
    public static final Parcelable.Creator<AnchorLinkUser> CREATOR = new C65773BxH(AnchorLinkUser.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("user")
    public User LIZIZ;
    @SerializedName("linkmic_id")
    public long LIZJ;
    @SerializedName("linkmic_id_str")
    public String LIZLLL;
    @SerializedName("link_status")

    /* renamed from: LJ */
    public int f26348LJ;
    @SerializedName("link_type")
    public int LJFF;
    @SerializedName("user_position")
    public int LJI;
    @SerializedName("silence_status")
    public int LJII;
    @SerializedName("modify_time")
    public long LJIIIIZZ;
    @SerializedName("linker_id")
    public long LJIIIZ;
    @SerializedName("role_type")
    public int LJIIJ;
    @SerializedName("mc_status")
    public int LJIIJJI;
    @SerializedName("is_background")
    public int LJIIL;
    public transient int LJIILIIL;
    public transient C9531aq LJIILJJIL;
    public transient C9536f LJIILL;
    public transient boolean LJIILLIIL;
    public transient boolean LJIIZILJ;
    @SerializedName("extra")
    public String LJIJ;
    @SerializedName("content")
    public ListUserContent LJIJI;
    @SerializedName("mic_pos_tag_info")
    public MicPosTagInfo LJIJJ;
    public transient C4534a LJIJJLI;

    static {
        Covode.recordClassIndex(28138);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        parcel.writeParcelable(this.LIZIZ, i);
        parcel.writeLong(this.LIZJ);
        parcel.writeString(this.LIZLLL);
        parcel.writeInt(this.f26348LJ);
        parcel.writeInt(this.LJFF);
        parcel.writeInt(this.LJI);
        parcel.writeInt(this.LJII);
        parcel.writeLong(this.LJIIIIZZ);
        parcel.writeLong(this.LJIIIZ);
        parcel.writeInt(this.LJIIJ);
        parcel.writeInt(this.LJIIJJI);
        parcel.writeInt(this.LJIIL);
        parcel.writeString(this.LJIJ);
        parcel.writeParcelable(this.LJIJI, i);
        parcel.writeParcelable(this.LJIJJ, i);
    }

    public AnchorLinkUser() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.r$c
    public final User LIZ() {
        return this.LIZIZ;
    }

    public final int LIZJ() {
        ListUserContent listUserContent = this.LJIJI;
        if (listUserContent != null && listUserContent.LIZJ != null) {
            return this.LJIJI.LIZJ.LIZLLL;
        }
        return 0;
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(this.LIZLLL)) {
            return String.valueOf(this.LIZJ);
        }
        return this.LIZLLL;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "AnchorLinkUser{mLinkmicId=" + this.LIZJ + ", mLinkmicIdStr='" + this.LIZLLL + "', mRoleType=" + this.LJIIJ + ", isBackground=" + this.LJIIL + '}';
    }

    public AnchorLinkUser(Parcel parcel) {
        this.LIZIZ = (User) parcel.readParcelable(User.class.getClassLoader());
        this.LIZJ = parcel.readLong();
        this.LIZLLL = parcel.readString();
        this.f26348LJ = parcel.readInt();
        this.LJFF = parcel.readInt();
        this.LJI = parcel.readInt();
        this.LJII = parcel.readInt();
        this.LJIIIIZZ = parcel.readLong();
        this.LJIIIZ = parcel.readLong();
        this.LJIIJ = parcel.readInt();
        this.LJIIJJI = parcel.readInt();
        this.LJIIL = parcel.readInt();
        this.LJIJ = parcel.readString();
        this.LJIJI = (ListUserContent) parcel.readParcelable(ListUserContent.class.getClassLoader());
        this.LJIJJ = (MicPosTagInfo) parcel.readParcelable(MicPosTagInfo.class.getClassLoader());
    }
}
