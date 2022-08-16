package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.model.C4534a;
import com.bytedance.android.live.liveinteract.multianchor.model.MicDress;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9531aq;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9536f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class LinkPlayerInfo implements Parcelable, r$c, Cloneable {
    public static final Parcelable.Creator<LinkPlayerInfo> CREATOR = new C65773BxH(LinkPlayerInfo.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("fan_ticket")
    public long LIZIZ;
    public transient String LIZJ;
    @SerializedName("user")
    public User LIZLLL;
    @SerializedName("invitor")

    /* renamed from: LJ */
    public User f26415LJ;
    @SerializedName("modify_time")
    public long LJFF;
    @SerializedName("link_status")
    public int LJI;
    @SerializedName("link_type")
    public int LJII;
    @SerializedName("role_type")
    public int LJIIIIZZ;
    @SerializedName("payed_money")
    public int LJIIIZ;
    @SerializedName("link_duration")
    public int LJIIJ;
    @SerializedName("user_position")
    public int LJIIJJI;
    @SerializedName("silence_status")
    public int LJIIL;
    @SerializedName("linkmic_id_str")
    public String LJIILIIL;
    @SerializedName("location")
    public String LJIILJJIL;
    @SerializedName("user_relation_type")
    public long LJIILL;
    @SerializedName("modify_time_in_nano")
    public long LJIILLIIL;
    @SerializedName("host_permission")
    public boolean LJIIZILJ;
    @SerializedName("song_list")
    public List<KtvMusic> LJIJ;
    @SerializedName("is_active")
    public boolean LJIJI;
    @SerializedName("last_active_time_ms")
    public long LJIJJ;
    @SerializedName("last_invited_time_ms")
    public long LJIJJLI;
    @SerializedName("is_add_price")
    public boolean LJIL;
    @SerializedName("add_price_time_ms")
    public long LJJ;
    @SerializedName("join_teamfight_info")
    public TeamFightJoinTeamInfo LJJI;
    @SerializedName("list_user_type")
    public int LJJIFFI;
    @SerializedName("list_user_from_type")
    public int LJJII;
    @SerializedName("waiting_list_user_info")
    public WaitingListUserInfo LJJIII;
    @SerializedName("mc_status")
    public int LJJIIJ;
    @SerializedName("invite_list_user_info")
    public InviteListUserInfo LJJIIJZLJL;
    @SerializedName("linked_list_user_info")
    public LinkedListUserInfo LJJIIZ;
    @SerializedName("tags")
    public List<ListTag> LJJIIZI;
    @SerializedName("list_user_role")
    public int LJJIJ;
    @SerializedName("fuzzy_fan_ticket")
    public String LJJIJIIJI;
    @SerializedName("mic_pos_tag_info")
    public MicPosTagInfo LJJIJIIJIL;
    public transient boolean LJJIJIL;
    public MicDress LJJIJL;
    public long LJJIJLIJ;
    public long LJJIL;
    public Boolean LJJIZ;
    public transient boolean LJJJ;
    @SerializedName("is_enlarged")
    public boolean LJJJI;
    @SerializedName("is_anonymous")
    public boolean LJJJIL;
    public transient int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public transient String LJJJJJ;
    public transient int LJJJJJL;
    public transient boolean LJJJJL;
    public transient boolean LJJJJLI;
    public transient boolean LJJJJLL;
    public transient boolean LJJJJZ;
    public transient int LJJJJZI;
    @SerializedName("apply_type")
    public int LJJJLIIL;
    public transient C9531aq LJJJLL;
    public transient C9536f LJJJLZIJ;
    public transient boolean LJJJZ;
    public transient boolean LJJL;
    public transient boolean LJJLI;
    public transient boolean LJJLIIIIJ;
    public transient String LJJLIIIJ;
    @SerializedName("client_version")
    public long LJJLIIIJILLIZJL;
    @SerializedName(Constants.APP_ID)
    public long LJJLIIIJJI;
    @SerializedName("device_platform")
    public String LJJLIIIJJIZ;
    @SerializedName("rank")
    public long LJJLIIIJL;

    static {
        Covode.recordClassIndex(29398);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        parcel.writeLong(this.LIZIZ);
        parcel.writeParcelable(this.LIZLLL, i);
        parcel.writeParcelable(this.f26415LJ, i);
        parcel.writeLong(this.LJFF);
        parcel.writeInt(this.LJI);
        parcel.writeInt(this.LJII);
        parcel.writeInt(this.LJIIIIZZ);
        parcel.writeInt(this.LJIIIZ);
        parcel.writeInt(this.LJIIJ);
        parcel.writeInt(this.LJIIJJI);
        parcel.writeInt(this.LJIIL);
        parcel.writeString(this.LJIILIIL);
        parcel.writeString(this.LJIILJJIL);
        parcel.writeLong(this.LJIILL);
        parcel.writeLong(this.LJIILLIIL);
        parcel.writeByte(this.LJIIZILJ ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.LJIJ);
        parcel.writeByte(this.LJIJI ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.LJIJJ);
        parcel.writeLong(this.LJIJJLI);
        parcel.writeByte(this.LJIL ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.LJJ);
        parcel.writeParcelable(this.LJJI, i);
        parcel.writeInt(this.LJJIFFI);
        parcel.writeInt(this.LJJII);
        parcel.writeParcelable(this.LJJIII, i);
        parcel.writeInt(this.LJJIIJ);
        parcel.writeParcelable(this.LJJIIJZLJL, i);
        parcel.writeParcelable(this.LJJIIZ, i);
        parcel.writeTypedList(this.LJJIIZI);
        parcel.writeInt(this.LJJIJ);
        parcel.writeString(this.LJJIJIIJI);
        parcel.writeParcelable(this.LJJIJIIJIL, i);
        parcel.writeParcelable(this.LJJIJL, i);
        parcel.writeLong(this.LJJIJLIJ);
        parcel.writeLong(this.LJJIL);
        if (this.LJJIZ == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeByte(this.LJJIZ.booleanValue() ? (byte) 1 : (byte) 0);
        }
        parcel.writeByte(this.LJJJI ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LJJJIL ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.LJJJJI);
        parcel.writeInt(this.LJJJJIZL);
        parcel.writeInt(this.LJJJLIIL);
        parcel.writeLong(this.LJJLIIIJILLIZJL);
        parcel.writeLong(this.LJJLIIIJJI);
        parcel.writeString(this.LJJLIIIJJIZ);
        parcel.writeLong(this.LJJLIIIJL);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.r$c
    public final User LIZ() {
        return this.LIZLLL;
    }

    /* renamed from: LJ */
    public final int m15703LJ() {
        return this.LJII;
    }

    public final boolean LIZJ() {
        if (this.LJJJJ > 0) {
            return true;
        }
        return false;
    }

    public final String LIZLLL() {
        String str = this.LJIILIIL;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean LIZIZ() {
        MicDress micDress = this.LJJIJL;
        if (micDress != null && micDress.LIZIZ != null) {
            return true;
        }
        return false;
    }

    public final long LJI() {
        LinkedListUserInfo linkedListUserInfo = this.LJJIIZ;
        if (linkedListUserInfo != null) {
            return linkedListUserInfo.joinChannelTime;
        }
        return 0L;
    }

    public final long LJII() {
        LinkedListUserInfo linkedListUserInfo = this.LJJIIZ;
        if (linkedListUserInfo != null) {
            return linkedListUserInfo.expectLeaveTime;
        }
        return 0L;
    }

    public final long LJIIIIZZ() {
        LinkedListUserInfo linkedListUserInfo = this.LJJIIZ;
        if (linkedListUserInfo != null) {
            return linkedListUserInfo.currentTime;
        }
        return 0L;
    }

    /* loaded from: classes3.dex */
    public enum McStatus {
        UNKNOWN,
        KTV_HOST;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static McStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (McStatus[]) proxy.result;
            }
            return (McStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(29399);
        }

        public static McStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (McStatus) proxy.result;
            }
            return (McStatus) Enum.valueOf(McStatus.class, str);
        }
    }

    public LinkPlayerInfo() {
        this.LIZJ = "0";
        this.LJIJJ = -1L;
        this.LJIJJLI = -1L;
        this.LJJIZ = Boolean.FALSE;
        this.LJJLIIIJL = 0L;
    }

    public final String LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        User user = this.LIZLLL;
        if (user != null) {
            return user.getRelationship();
        }
        return "null";
    }

    public final String LJIIJJI() {
        long j = this.LJJLIIIJL;
        if (j == 1) {
            return "top1";
        }
        if (j == 2) {
            return "top2";
        }
        if (j == 3) {
            return "top3";
        }
        return "null";
    }

    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJJIIJ != McStatus.KTV_HOST.ordinal()) {
            return false;
        }
        return true;
    }

    public final Long LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        MicPosTagInfo micPosTagInfo = this.LJJIJIIJIL;
        if (micPosTagInfo == null) {
            return 0L;
        }
        return Long.valueOf(micPosTagInfo.getTagType());
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LinkPlayerInfo{mInteractIdStr='" + this.LJIILIIL + "'position='" + this.LJIIJJI + "'}";
    }

    public final LinkPlayerInfo LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (LinkPlayerInfo) proxy.result;
        }
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LIZIZ = this.LIZIZ;
        linkPlayerInfo.LIZJ = this.LIZJ;
        linkPlayerInfo.LJIILIIL = this.LJIILIIL;
        linkPlayerInfo.LIZLLL = LIZ();
        linkPlayerInfo.LJFF = this.LJFF;
        linkPlayerInfo.LJI = this.LJI;
        linkPlayerInfo.LJII = m15703LJ();
        linkPlayerInfo.LJIIIIZZ = this.LJIIIIZZ;
        linkPlayerInfo.LJJIJ = this.LJJIJ;
        linkPlayerInfo.LJIIIZ = this.LJIIIZ;
        linkPlayerInfo.LJIIJ = this.LJIIJ;
        linkPlayerInfo.LJIIJJI = this.LJIIJJI;
        linkPlayerInfo.LJIIL = this.LJIIL;
        linkPlayerInfo.LJIILJJIL = this.LJIILJJIL;
        linkPlayerInfo.LJIILLIIL = this.LJIILLIIL;
        linkPlayerInfo.LJJJJ = this.LJJJJ;
        linkPlayerInfo.LJJJJLI = this.LJJJJLI;
        linkPlayerInfo.LJJJJLL = this.LJJJJLL;
        linkPlayerInfo.LJJJJZ = this.LJJJJZ;
        linkPlayerInfo.LJIIZILJ = this.LJIIZILJ;
        linkPlayerInfo.LJJJJI = this.LJJJJI;
        linkPlayerInfo.LJJLIIIJ = this.LJJLIIIJ;
        linkPlayerInfo.LJJLIIIJILLIZJL = this.LJJLIIIJILLIZJL;
        linkPlayerInfo.LJJLIIIJJI = this.LJJLIIIJJI;
        linkPlayerInfo.LJJLIIIJJIZ = this.LJJLIIIJJIZ;
        linkPlayerInfo.LJJJJZI = this.LJJJJZI;
        linkPlayerInfo.LJJIIZ = this.LJJIIZ;
        linkPlayerInfo.LJJJ = this.LJJJ;
        linkPlayerInfo.LJJJLL = this.LJJJLL;
        linkPlayerInfo.LJJJLZIJ = this.LJJJLZIJ;
        linkPlayerInfo.LJJJZ = this.LJJJZ;
        linkPlayerInfo.LJJL = this.LJJL;
        linkPlayerInfo.LJJIJL = this.LJJIJL;
        linkPlayerInfo.LJJJI = this.LJJJI;
        linkPlayerInfo.LJJIL = this.LJJIL;
        linkPlayerInfo.LJJIII = this.LJJIII;
        linkPlayerInfo.LJJLIIIJL = this.LJJLIIIJL;
        linkPlayerInfo.LJJIJLIJ = this.LJJIJLIJ;
        linkPlayerInfo.LJJLIIIIJ = this.LJJLIIIIJ;
        linkPlayerInfo.LJJJIL = this.LJJJIL;
        linkPlayerInfo.LJJIJIIJIL = this.LJJIJIIJIL;
        return linkPlayerInfo;
    }

    public static String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str != null) {
            if (str.length() <= 6) {
                return str;
            }
            return ((Object) str.subSequence(0, 5)) + "...";
        }
        return "";
    }

    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        if (!PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 1).isSupported && linkPlayerInfo != null && this.LIZLLL.getId() == linkPlayerInfo.LIZLLL.getId()) {
            long j = linkPlayerInfo.LIZIZ;
            if (j > this.LIZIZ) {
                this.LIZIZ = j;
            }
            this.LIZLLL = linkPlayerInfo.LIZLLL;
            long j2 = linkPlayerInfo.LJFF;
            if (j2 > this.LJFF) {
                this.LJFF = j2;
            }
            this.LJI = linkPlayerInfo.LJI;
            this.LJII = linkPlayerInfo.LJII;
            this.LJIIIIZZ = linkPlayerInfo.LJIIIIZZ;
            this.LJJIJ = linkPlayerInfo.LJJIJ;
            this.LJIIIZ = linkPlayerInfo.LJIIIZ;
            this.LJJIJLIJ = linkPlayerInfo.LJJIJLIJ;
            this.LJJIIZ = linkPlayerInfo.LJJIIZ;
            this.LJJIJL = linkPlayerInfo.LJJIJL;
            this.LJJJI = linkPlayerInfo.LJJJI;
            this.LJJIL = linkPlayerInfo.LJJIL;
            this.LJJIII = linkPlayerInfo.LJJIII;
            this.LJJLIIIJL = linkPlayerInfo.LJJLIIIJL;
            this.LJIIL = linkPlayerInfo.LJIIL;
            this.LJJLIIIIJ = linkPlayerInfo.LJJLIIIIJ;
        }
    }

    public LinkPlayerInfo(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean valueOf;
        boolean z5;
        this.LIZJ = "0";
        this.LJIJJ = -1L;
        this.LJIJJLI = -1L;
        this.LJJIZ = Boolean.FALSE;
        this.LJJLIIIJL = 0L;
        this.LIZIZ = parcel.readLong();
        this.LIZLLL = (User) parcel.readParcelable(User.class.getClassLoader());
        this.f26415LJ = (User) parcel.readParcelable(User.class.getClassLoader());
        this.LJFF = parcel.readLong();
        this.LJI = parcel.readInt();
        this.LJII = parcel.readInt();
        this.LJIIIIZZ = parcel.readInt();
        this.LJIIIZ = parcel.readInt();
        this.LJIIJ = parcel.readInt();
        this.LJIIJJI = parcel.readInt();
        this.LJIIL = parcel.readInt();
        this.LJIILIIL = parcel.readString();
        this.LJIILJJIL = parcel.readString();
        this.LJIILL = parcel.readLong();
        this.LJIILLIIL = parcel.readLong();
        boolean z6 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIZILJ = z;
        this.LJIJ = parcel.createTypedArrayList(KtvMusic.CREATOR);
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIJI = z2;
        this.LJIJJ = parcel.readLong();
        this.LJIJJLI = parcel.readLong();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJIL = z3;
        this.LJJ = parcel.readLong();
        this.LJJI = (TeamFightJoinTeamInfo) parcel.readParcelable(TeamFightJoinTeamInfo.class.getClassLoader());
        this.LJJIFFI = parcel.readInt();
        this.LJJII = parcel.readInt();
        this.LJJIII = (WaitingListUserInfo) parcel.readParcelable(WaitingListUserInfo.class.getClassLoader());
        this.LJJIIJ = parcel.readInt();
        this.LJJIIJZLJL = (InviteListUserInfo) parcel.readParcelable(InviteListUserInfo.class.getClassLoader());
        this.LJJIIZ = (LinkedListUserInfo) parcel.readParcelable(LinkedListUserInfo.class.getClassLoader());
        this.LJJIIZI = parcel.createTypedArrayList(ListTag.CREATOR);
        this.LJJIJ = parcel.readInt();
        this.LJJIJIIJI = parcel.readString();
        this.LJJIJIIJIL = (MicPosTagInfo) parcel.readParcelable(MicPosTagInfo.class.getClassLoader());
        this.LJJIJL = (MicDress) parcel.readParcelable(MicDress.class.getClassLoader());
        this.LJJIJLIJ = parcel.readLong();
        this.LJJIL = parcel.readLong();
        if (parcel.readByte() == 0) {
            valueOf = null;
        } else {
            if (parcel.readByte() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            valueOf = Boolean.valueOf(z4);
        }
        this.LJJIZ = valueOf;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.LJJJI = z5;
        this.LJJJIL = parcel.readByte() == 0 ? false : z6;
        this.LJJJJI = parcel.readInt();
        this.LJJJJIZL = parcel.readInt();
        this.LJJJLIIL = parcel.readInt();
        this.LJJLIIIJILLIZJL = parcel.readLong();
        this.LJJLIIIJJI = parcel.readLong();
        this.LJJLIIIJJIZ = parcel.readString();
        this.LJJLIIIJL = parcel.readLong();
    }

    public final void LIZ(AnchorLinkUser anchorLinkUser, C4534a c4534a) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[]{anchorLinkUser, c4534a}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZLLL = anchorLinkUser.LIZIZ;
        this.LJIILIIL = anchorLinkUser.LIZLLL;
        this.LJI = anchorLinkUser.f26348LJ;
        this.LJIIJJI = anchorLinkUser.LJI;
        this.LJIIL = anchorLinkUser.LJII;
        this.LJFF = anchorLinkUser.LJIIIIZZ;
        this.LJIIIIZZ = anchorLinkUser.LJIIJ;
        this.LJII = anchorLinkUser.LJFF;
        if (anchorLinkUser.LJIIL == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJ = z;
        if (anchorLinkUser.LJIJI != null && anchorLinkUser.LJIJI.LIZLLL != null && anchorLinkUser.LJIJI.LIZLLL.LJIILJJIL) {
            z2 = true;
        }
        this.LJJJI = z2;
        if (anchorLinkUser.LJIJI != null && anchorLinkUser.LJIJI.LIZLLL != null) {
            this.LJJIL = anchorLinkUser.LJIJI.LIZLLL.LJIJI;
        }
        if (c4534a != null) {
            this.LIZIZ = c4534a.LIZIZ;
            this.LJJIJ = c4534a.LJIIIZ;
            this.LJJIIZ = LinkedListUserInfo.copy(c4534a.LJI, c4534a.LJII, c4534a.LJIIIIZZ);
        }
    }
}
