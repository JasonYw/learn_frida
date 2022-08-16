package com.bytedance.android.live.liveinteract.multianchor.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class LinkmicPositionItem implements Parcelable {
    public static final Parcelable.Creator<LinkmicPositionItem> CREATOR = new C65773BxH(LinkmicPositionItem.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("position")
    public int LIZIZ;
    @SerializedName("status")
    public int LIZJ;
    @SerializedName("active_name")
    public String LIZLLL;
    @SerializedName("verify_status")

    /* renamed from: LJ */
    public int f26349LJ;

    static {
        Covode.recordClassIndex(28139);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        parcel.writeInt(this.LIZIZ);
        parcel.writeInt(this.LIZJ);
        parcel.writeString(this.LIZLLL);
        parcel.writeInt(this.f26349LJ);
    }

    public LinkmicPositionItem() {
    }

    /* loaded from: classes3.dex */
    public enum LinkmicPositionStatus {
        NORMAL,
        LOCKED,
        BIDPAID;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LinkmicPositionStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (LinkmicPositionStatus[]) proxy.result;
            }
            return (LinkmicPositionStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(28140);
        }

        public static LinkmicPositionStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (LinkmicPositionStatus) proxy.result;
            }
            return (LinkmicPositionStatus) Enum.valueOf(LinkmicPositionStatus.class, str);
        }
    }

    public LinkmicPositionItem(Parcel parcel) {
        this.LIZIZ = parcel.readInt();
        this.LIZJ = parcel.readInt();
        this.LIZLLL = parcel.readString();
        this.f26349LJ = parcel.readInt();
    }

    public final boolean LIZ(LinkPlayerInfo linkPlayerInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (linkPlayerInfo == null) {
            return false;
        }
        if (this.LIZJ != linkPlayerInfo.LJJJJIZL || !TextUtils.equals(this.LIZLLL, linkPlayerInfo.LJJJJJ) || this.f26349LJ != linkPlayerInfo.LJJJJJL) {
            return true;
        }
        return false;
    }
}
