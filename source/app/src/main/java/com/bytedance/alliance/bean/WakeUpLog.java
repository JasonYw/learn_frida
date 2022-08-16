package com.bytedance.alliance.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;

/* loaded from: classes2.dex */
public class WakeUpLog implements Parcelable {
    public static final Parcelable.Creator<WakeUpLog> CREATOR = new Parcelable.Creator<WakeUpLog>() { // from class: com.bytedance.alliance.bean.WakeUpLog.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(9922);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WakeUpLog[] newArray(int i) {
            return new WakeUpLog[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.alliance.bean.WakeUpLog, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WakeUpLog createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new WakeUpLog(parcel);
        }
    };
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25591LJ;
    public String LJFF;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WakeUpLog() {
    }

    static {
        Covode.recordClassIndex(9921);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25080C("WakeUpLog:{wakeMethod:", this.LIZIZ, ",packageName:", this.LIZJ, ",partnerName:", this.LIZLLL, ",sessionId:", this.f25591LJ, ",componentName:", this.LJFF, "}");
    }

    public WakeUpLog(Parcel parcel) {
        this.LIZIZ = parcel.readString();
        this.LIZJ = parcel.readString();
        this.LIZLLL = parcel.readString();
        this.f25591LJ = parcel.readString();
        this.LJFF = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        parcel.writeString(this.LIZIZ);
        parcel.writeString(this.LIZJ);
        parcel.writeString(this.LIZLLL);
        parcel.writeString(this.f25591LJ);
        parcel.writeString(this.LJFF);
    }
}
