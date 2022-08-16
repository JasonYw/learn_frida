package com.android.ttcjpaysdk.ttcjpayapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class TTCJPayResult implements Parcelable {
    public static final Parcelable.Creator<TTCJPayResult> CREATOR = new Parcelable.Creator<TTCJPayResult>() { // from class: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult.1
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9311);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public final TTCJPayResult[] mo25302newArray(int i) {
            return new TTCJPayResult[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public final TTCJPayResult mo25301createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TTCJPayResult) proxy.result;
            }
            return new TTCJPayResult(parcel);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, String> mCallBackInfo;
    public volatile int mCode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> getCallBackInfo() {
        return this.mCallBackInfo;
    }

    public int getCode() {
        return this.mCode;
    }

    public TTCJPayResult() {
        this.mCode = 104;
    }

    static {
        Covode.recordClassIndex(9310);
    }

    public void setCallBackInfo(Map<String, String> map) {
        this.mCallBackInfo = map;
    }

    public void setCode(int i) {
        this.mCode = i;
    }

    public TTCJPayResult(Parcel parcel) {
        this.mCode = 104;
        this.mCode = parcel.readInt();
        this.mCallBackInfo = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeInt(this.mCode);
        parcel.writeMap(this.mCallBackInfo);
    }
}
