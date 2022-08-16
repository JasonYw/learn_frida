package com.bytedance.alliance.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes2.dex */
public class PassData implements Parcelable {
    public static final Parcelable.Creator<PassData> CREATOR = new Parcelable.Creator<PassData>() { // from class: com.bytedance.alliance.bean.PassData.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(9920);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PassData[] newArray(int i) {
            return new PassData[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.alliance.bean.PassData, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PassData createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new PassData(parcel);
        }
    };
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25590LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PassData() {
    }

    static {
        Covode.recordClassIndex(9919);
    }

    public PassData(Parcel parcel) {
        boolean z;
        this.LIZIZ = parcel.readString();
        this.LIZJ = parcel.readString();
        this.LIZLLL = parcel.readString();
        this.f25590LJ = parcel.readString();
        this.LJFF = parcel.readString();
        this.LJI = parcel.readString();
        this.LJII = parcel.readString();
        this.LJIIIIZZ = parcel.readString();
        this.LJIIIZ = parcel.readString();
        this.LJIIJ = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJJI = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        parcel.writeString(this.LIZIZ);
        parcel.writeString(this.LIZJ);
        parcel.writeString(this.LIZLLL);
        parcel.writeString(this.f25590LJ);
        parcel.writeString(this.LJFF);
        parcel.writeString(this.LJI);
        parcel.writeString(this.LJII);
        parcel.writeString(this.LJIIIIZZ);
        parcel.writeString(this.LJIIIZ);
        parcel.writeString(this.LJIIJ);
        parcel.writeByte(this.LJIIJJI ? (byte) 1 : (byte) 0);
    }
}
