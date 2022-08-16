package com.bytedance.android.live.base.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class RoomStatusEvent implements Parcelable {
    public static final Parcelable.Creator<RoomStatusEvent> CREATOR = new Parcelable.Creator<RoomStatusEvent>() { // from class: com.bytedance.android.live.base.event.RoomStatusEvent.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(13948);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RoomStatusEvent[] newArray(int i) {
            return new RoomStatusEvent[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.base.event.RoomStatusEvent, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoomStatusEvent createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new RoomStatusEvent(parcel);
        }
    };
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f25728LJ;
    public List<Long> LJFF;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RoomStatusEvent() {
    }

    static {
        Covode.recordClassIndex(13947);
    }

    public RoomStatusEvent(Parcel parcel) {
        boolean z;
        this.LIZIZ = parcel.readLong();
        this.LIZJ = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        this.f25728LJ = parcel.readInt();
        this.LJFF = new ArrayList();
        parcel.readList(this.LJFF, List.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        parcel.writeLong(this.LIZIZ);
        parcel.writeLong(this.LIZJ);
        parcel.writeByte(this.LIZLLL ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25728LJ);
        parcel.writeList(this.LJFF);
    }
}
