package com.bytedance.android.live.base.model.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.C65773BxH;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class Option implements Parcelable, C3LJ {
    public static final Parcelable.Creator<Option> CREATOR = new C65773BxH(Option.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("key")
    public String key;
    @SerializedName("negative")
    public Boolean negative;
    @SerializedName("sub_question_id")
    public Long question;
    @SerializedName("text")
    public String text;
    @SerializedName("toast_text")
    public String toastText;

    static {
        Covode.recordClassIndex(14043);
    }

    public Option() {
    }

    public Option(Parcel parcel) {
        this.key = parcel.readString();
        this.text = parcel.readString();
        if (parcel.readByte() == 0) {
            this.question = null;
        } else {
            this.question = Long.valueOf(parcel.readLong());
        }
        if (parcel.readByte() == 0) {
            this.negative = null;
        } else {
            this.negative = Boolean.valueOf(parcel.readByte() != 0);
        }
        this.toastText = parcel.readString();
    }

    public Option(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.key = QV1.LJFF(c10532g);
            } else if (LIZIZ == 2) {
                this.text = QV1.LJFF(c10532g);
            } else if (LIZIZ == 3) {
                this.question = Long.valueOf(QV1.LIZJ(c10532g));
            } else if (LIZIZ == 4) {
                this.negative = Boolean.valueOf(QV1.LIZ(c10532g));
            } else if (LIZIZ != 5) {
                QV1.LJII(c10532g);
            } else {
                this.toastText = QV1.LJFF(c10532g);
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
        parcel.writeString(this.key);
        parcel.writeString(this.text);
        if (this.question == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.question.longValue());
        }
        if (this.negative == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeByte(this.negative.booleanValue() ? (byte) 1 : (byte) 0);
        }
        parcel.writeString(this.toastText);
    }
}
