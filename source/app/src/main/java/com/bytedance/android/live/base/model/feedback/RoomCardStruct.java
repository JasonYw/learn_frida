package com.bytedance.android.live.base.model.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.C65773BxH;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class RoomCardStruct implements Parcelable, C3LJ {
    public static final Parcelable.Creator<RoomCardStruct> CREATOR = new C65773BxH(RoomCardStruct.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isLike;
    @SerializedName(C2521l.LJIIL)
    public Room room;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("title")
    public String title;

    static {
        Covode.recordClassIndex(14045);
    }

    public RoomCardStruct() {
    }

    public RoomCardStruct(Parcel parcel) {
        this.room = (Room) parcel.readParcelable(Room.class.getClassLoader());
        this.title = parcel.readString();
        this.subTitle = parcel.readString();
        this.isLike = parcel.readByte() != 0;
    }

    public RoomCardStruct(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.room = _Room_ProtoDecoder.decodeStatic(c10532g);
            } else if (LIZIZ == 2) {
                this.title = QV1.LJFF(c10532g);
            } else if (LIZIZ != 3) {
                QV1.LJII(c10532g);
            } else {
                this.subTitle = QV1.LJFF(c10532g);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeParcelable(this.room, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeByte(this.isLike ? (byte) 1 : (byte) 0);
    }

    public final boolean isLike() {
        return this.isLike;
    }

    public final void setLike(boolean z) {
        this.isLike = z;
    }
}
