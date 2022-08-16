package com.android.ttcjpaysdk.integrated.counter.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class UserAgreement implements Parcelable, CJPayObject, Serializable {
    public static final Parcelable.Creator<UserAgreement> CREATOR = new Parcelable.Creator<UserAgreement>() { // from class: com.android.ttcjpaysdk.integrated.counter.data.UserAgreement.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(7573);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserAgreement[] newArray(int i) {
            return new UserAgreement[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.android.ttcjpaysdk.integrated.counter.data.UserAgreement] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserAgreement createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new UserAgreement(parcel);
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
        Covode.recordClassIndex(7572);
    }

    public UserAgreement() {
        this.content_url = "";
        this.title = "";
    }

    public void appendFrenchQuotes() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && !TextUtils.isEmpty(this.title)) {
            this.title = String.format("《%s》", this.title);
        }
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
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

    public UserAgreement(Parcel parcel) {
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

    public UserAgreement(JSONObject jSONObject) {
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
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        parcel.writeString(this.content_url);
        parcel.writeByte(this.default_choose ? (byte) 1 : (byte) 0);
        parcel.writeString(this.title);
    }
}
