package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p003X.C3LJ;
import p003X.C65773BxH;
import p003X.C78661Gzf;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class MicPosTagInfo implements Parcelable, C3LJ, Serializable {
    public static final Parcelable.Creator<MicPosTagInfo> CREATOR = new C65773BxH(MicPosTagInfo.class);
    public static final C78661Gzf Companion = new C78661Gzf((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final long serialVersionUID = 0;
    @SerializedName("bg_color_value")
    public String bgColor;
    @SerializedName("tag_name")
    public String positionTagName;
    @SerializedName("tag_type")
    public long tagType;
    @SerializedName("text_color_value")
    public String textColor;

    static {
        Covode.recordClassIndex(29408);
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
        parcel.writeLong(this.tagType);
        parcel.writeString(this.positionTagName);
        parcel.writeString(this.textColor);
        parcel.writeString(this.bgColor);
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getPositionTagName() {
        return this.positionTagName;
    }

    public final long getTagType() {
        return this.tagType;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public MicPosTagInfo() {
        this.positionTagName = "";
        this.textColor = "";
        this.bgColor = "";
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setPositionTagName(String str) {
        this.positionTagName = str;
    }

    public final void setTagType(long j) {
        this.tagType = j;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public MicPosTagInfo(Parcel parcel) {
        this.positionTagName = "";
        this.textColor = "";
        this.bgColor = "";
        this.tagType = parcel.readLong();
        this.positionTagName = parcel.readString();
        this.textColor = parcel.readString();
        this.bgColor = parcel.readString();
    }

    public MicPosTagInfo(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        if (LIZIZ != 4) {
                            QV1.LJII(c10532g);
                        } else {
                            this.bgColor = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.textColor = QV1.LJFF(c10532g);
                    }
                } else {
                    this.positionTagName = QV1.LJFF(c10532g);
                }
            } else {
                this.tagType = QV1.LIZIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.positionTagName == null) {
            this.positionTagName = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
    }
}
