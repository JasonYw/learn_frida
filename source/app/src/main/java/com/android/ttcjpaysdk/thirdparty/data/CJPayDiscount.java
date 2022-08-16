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

/* loaded from: classes13.dex */
public class CJPayDiscount implements Parcelable, CJPayObject, Serializable {
    public static final Parcelable.Creator<CJPayDiscount> CREATOR = new Parcelable.Creator<CJPayDiscount>() { // from class: com.android.ttcjpaysdk.thirdparty.data.CJPayDiscount.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(8331);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CJPayDiscount[] newArray(int i) {
            return new CJPayDiscount[i];
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.thirdparty.data.CJPayDiscount, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CJPayDiscount createFromParcel(Parcel parcel) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new CJPayDiscount(parcel);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String discount_abstract;
    public long discount_amount;
    public long discount_begin_time;
    public long discount_end_time;
    public String discount_exts;
    public String discount_id;
    public String discount_name;
    public String discount_rule_desc;
    public String discount_type;
    public String enable_overlap;
    public boolean isChecked;
    public long max_deduction_amount;
    public String merchant_id;
    public long min_payed_amount;
    public String msg;
    public long reached_amount;
    public String status;
    public String uid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(8330);
    }

    public CJPayDiscount() {
        this.merchant_id = "";
        this.discount_id = "";
        this.status = "";
        this.msg = "";
        this.uid = "";
        this.discount_name = "";
        this.discount_type = "";
        this.discount_rule_desc = "";
        this.enable_overlap = "";
        this.discount_abstract = "";
        this.discount_exts = "";
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("merchant_id", this.merchant_id);
            jSONObject.put("discount_id", this.discount_id);
            jSONObject.put("discount_amount", this.discount_amount);
            jSONObject.put("status", this.status);
            jSONObject.put("msg", this.msg);
            jSONObject.put("uid", this.uid);
            jSONObject.put("discount_name", this.discount_name);
            jSONObject.put("discount_type", this.discount_type);
            jSONObject.put("discount_begin_time", this.discount_begin_time);
            jSONObject.put("discount_end_time", this.discount_end_time);
            jSONObject.put("discount_rule_desc", this.discount_rule_desc);
            jSONObject.put("enable_overlap", this.enable_overlap);
            jSONObject.put("discount_abstract", this.discount_abstract);
            jSONObject.put("discount_exts", this.discount_exts);
            jSONObject.put("reached_amount", this.reached_amount);
            jSONObject.put("min_payed_amount", this.min_payed_amount);
            jSONObject.put("max_deduction_amount", this.max_deduction_amount);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toJsonString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("merchant_id", this.merchant_id);
            jSONObject.put("discount_id", this.discount_id);
            jSONObject.put("discount_amount", this.discount_amount);
            jSONObject.put("status", this.status);
            jSONObject.put("msg", this.msg);
            jSONObject.put("uid", this.uid);
            jSONObject.put("discount_name", this.discount_name);
            jSONObject.put("discount_type", this.discount_type);
            jSONObject.put("discount_begin_time", this.discount_begin_time);
            jSONObject.put("discount_end_time", this.discount_end_time);
            jSONObject.put("discount_rule_desc", this.discount_rule_desc);
            jSONObject.put("enable_overlap", this.enable_overlap);
            jSONObject.put("discount_abstract", this.discount_abstract);
            jSONObject.put("discount_exts", this.discount_exts);
            jSONObject.put("reached_amount", this.reached_amount);
            jSONObject.put("min_payed_amount", this.min_payed_amount);
            jSONObject.put("max_deduction_amount", this.max_deduction_amount);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public CJPayDiscount(Parcel parcel) {
        this.merchant_id = "";
        this.discount_id = "";
        this.status = "";
        this.msg = "";
        this.uid = "";
        this.discount_name = "";
        this.discount_type = "";
        this.discount_rule_desc = "";
        this.enable_overlap = "";
        this.discount_abstract = "";
        this.discount_exts = "";
        this.merchant_id = parcel.readString();
        this.discount_id = parcel.readString();
        this.discount_amount = parcel.readLong();
        this.status = parcel.readString();
        this.msg = parcel.readString();
        this.uid = parcel.readString();
        this.discount_name = parcel.readString();
        this.discount_type = parcel.readString();
        this.discount_begin_time = parcel.readLong();
        this.discount_end_time = parcel.readLong();
        this.discount_rule_desc = parcel.readString();
        this.enable_overlap = parcel.readString();
        this.discount_abstract = parcel.readString();
        this.discount_exts = parcel.readString();
        this.reached_amount = parcel.readLong();
        this.min_payed_amount = parcel.readLong();
        this.max_deduction_amount = parcel.readLong();
        this.isChecked = parcel.readInt() != 1 ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        parcel.writeString(this.merchant_id);
        parcel.writeString(this.discount_id);
        parcel.writeLong(this.discount_amount);
        parcel.writeString(this.status);
        parcel.writeString(this.msg);
        parcel.writeString(this.uid);
        parcel.writeString(this.discount_name);
        parcel.writeString(this.discount_type);
        parcel.writeLong(this.discount_begin_time);
        parcel.writeLong(this.discount_end_time);
        parcel.writeString(this.discount_rule_desc);
        parcel.writeString(this.enable_overlap);
        parcel.writeString(this.discount_abstract);
        parcel.writeString(this.discount_exts);
        parcel.writeLong(this.reached_amount);
        parcel.writeLong(this.min_payed_amount);
        parcel.writeLong(this.max_deduction_amount);
        parcel.writeInt(this.isChecked ? 1 : 0);
    }
}
