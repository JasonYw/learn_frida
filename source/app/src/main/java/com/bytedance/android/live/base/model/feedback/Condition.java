package com.bytedance.android.live.base.model.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.C65773BxH;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class Condition implements Parcelable, C3LJ {
    public static final Parcelable.Creator<Condition> CREATOR = new C65773BxH(Condition.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action_ids")
    public List<Long> actionIds;
    @SerializedName("action_type")
    public Long actionType;
    @SerializedName("from_time")
    public Long fromTime;
    @SerializedName("preview_time")
    public long previewTime;
    @SerializedName("to_time")
    public Long toTime;

    static {
        Covode.recordClassIndex(14040);
    }

    public Condition() {
    }

    public Condition(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.fromTime = null;
        } else {
            this.fromTime = Long.valueOf(parcel.readLong());
        }
        if (parcel.readByte() == 0) {
            this.toTime = null;
        } else {
            this.toTime = Long.valueOf(parcel.readLong());
        }
        this.actionIds = parcel.readArrayList(Condition.class.getClassLoader());
        if (parcel.readByte() == 0) {
            this.actionType = null;
        } else {
            this.actionType = Long.valueOf(parcel.readLong());
        }
        this.previewTime = parcel.readLong();
    }

    public Condition(C10532g c10532g) {
        this.actionIds = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                this.actionIds.isEmpty();
                return;
            } else if (LIZIZ == 1) {
                this.fromTime = Long.valueOf(QV1.LIZJ(c10532g));
            } else if (LIZIZ == 2) {
                this.toTime = Long.valueOf(QV1.LIZJ(c10532g));
            } else if (LIZIZ == 3) {
                this.actionIds.add(Long.valueOf(QV1.LIZJ(c10532g)));
            } else if (LIZIZ != 4) {
                QV1.LJII(c10532g);
            } else {
                this.actionType = Long.valueOf(QV1.LIZJ(c10532g));
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        if (this.fromTime == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.fromTime.longValue());
        }
        if (this.toTime == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.toTime.longValue());
        }
        parcel.writeList(this.actionIds);
        if (this.actionType == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.actionType.longValue());
        }
        parcel.writeLong(this.previewTime);
    }

    public final String toString() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append("fromTime:");
        sb.append(this.fromTime);
        sb.append(',');
        sb.append("toTime:");
        sb.append(this.toTime);
        sb.append(',');
        sb.append("actionIds:");
        List<Long> list = this.actionIds;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(',');
        sb.append("actionType:");
        sb.append(this.actionType);
        sb.append("}");
        return sb.toString();
    }
}
