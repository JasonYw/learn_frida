package com.android.ttcjpaysdk.thirdparty.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayUserAgreement implements Parcelable, CJPayObject, Serializable {
    public static final Parcelable.Creator<CJPayUserAgreement> CREATOR = new Parcelable.Creator<CJPayUserAgreement>() { // from class: com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(8365);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CJPayUserAgreement[] newArray(int i) {
            return new CJPayUserAgreement[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CJPayUserAgreement createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new CJPayUserAgreement(parcel);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String content_url;
    public boolean default_choose;
    public String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(8364);
    }

    public CJPayUserAgreement() {
        this.content_url = "";
        this.title = "";
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content_url", this.content_url);
            jSONObject.put("default_choose", this.default_choose);
            jSONObject.put("title", this.title);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public CJPayUserAgreement(Parcel parcel) {
        boolean z;
        this.content_url = "";
        this.title = "";
        this.content_url = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.default_choose = z;
        this.title = parcel.readString();
    }

    public CJPayUserAgreement(JSONObject jSONObject) {
        this.content_url = "";
        this.title = "";
        if (jSONObject != null) {
            this.content_url = jSONObject.optString("content_url");
            this.default_choose = jSONObject.optBoolean("default_choose");
            this.title = jSONObject.optString("title");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeString(this.content_url);
        parcel.writeByte(this.default_choose ? (byte) 1 : (byte) 0);
        parcel.writeString(this.title);
    }
}
