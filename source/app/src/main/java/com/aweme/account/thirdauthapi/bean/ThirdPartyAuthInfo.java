package com.aweme.account.thirdauthapi.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes13.dex */
public class ThirdPartyAuthInfo implements Parcelable {
    public static final Parcelable.Creator<ThirdPartyAuthInfo> CREATOR = new Parcelable.Creator<ThirdPartyAuthInfo>() { // from class: com.aweme.account.thirdauthapi.bean.ThirdPartyAuthInfo.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(9355);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ThirdPartyAuthInfo[] newArray(int i) {
            return new ThirdPartyAuthInfo[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.aweme.account.thirdauthapi.bean.ThirdPartyAuthInfo, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ThirdPartyAuthInfo createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new ThirdPartyAuthInfo(parcel);
        }
    };
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public long LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25553LJ;
    public String LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(9354);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "ThirdPartyAuthInfo{token='" + this.LIZIZ + "', expires=" + this.LIZJ + ", uid='" + this.LIZLLL + "', code='" + this.f25553LJ + "', secret='" + this.LJFF + "', verifyType=" + this.LJI + ", verifyTicket='" + this.LJII + "', platform='" + this.LJIIIIZZ + "', profileKey='" + this.LJIIIZ + "'}";
    }

    public ThirdPartyAuthInfo(Parcel parcel) {
        this.LJI = -1;
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LIZIZ = parcel.readString();
        this.LIZJ = parcel.readLong();
        this.LIZLLL = parcel.readString();
        this.f25553LJ = parcel.readString();
        this.LJFF = parcel.readString();
        this.LJI = parcel.readInt();
        this.LJII = parcel.readString();
        this.LJIIIIZZ = parcel.readString();
        this.LJIIIZ = parcel.readString();
        this.LJIIJ = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        parcel.writeString(this.LIZIZ);
        parcel.writeLong(this.LIZJ);
        parcel.writeString(this.LIZLLL);
        parcel.writeString(this.f25553LJ);
        parcel.writeString(this.LJFF);
        parcel.writeInt(this.LJI);
        parcel.writeString(this.LJII);
        parcel.writeString(this.LJIIIIZZ);
        parcel.writeString(this.LJIIIZ);
        parcel.writeString(this.LJIIJ);
    }

    public ThirdPartyAuthInfo(String str, long j, String str2, String str3, String str4, String str5) {
        this.LJI = -1;
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.f25553LJ = str3;
        this.LJFF = str4;
        this.LJIIJ = str5;
    }

    public /* synthetic */ ThirdPartyAuthInfo(String str, long j, String str2, String str3, String str4, String str5, byte b) {
        this(str, j, str2, str3, str4, str5);
    }
}
