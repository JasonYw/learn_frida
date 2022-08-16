package com.bytedance.android.live.base.model.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.C65773BxH;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class Question implements Parcelable, C3LJ {
    public static final Parcelable.Creator<Question> CREATOR = new C65773BxH(Question.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("options")
    public List<Option> options;
    @SerializedName("question_id")
    public Long questionId;
    @SerializedName("question_key")
    public String questionKey;
    @SerializedName("question_text")
    public String questionText;
    @SerializedName("room_cards")
    public List<RoomCardStruct> rooms;
    @SerializedName("type")
    public Long type;

    static {
        Covode.recordClassIndex(14044);
    }

    public Question() {
    }

    public Question(Parcel parcel) {
        this.questionKey = parcel.readString();
        this.questionText = parcel.readString();
        if (parcel.readByte() == 0) {
            this.type = null;
        } else {
            this.type = Long.valueOf(parcel.readLong());
        }
        this.options = parcel.createTypedArrayList(Option.CREATOR);
        if (parcel.readByte() == 0) {
            this.questionId = null;
        } else {
            this.questionId = Long.valueOf(parcel.readLong());
        }
        this.rooms = parcel.createTypedArrayList(RoomCardStruct.CREATOR);
    }

    public Question(C10532g c10532g) {
        List list;
        Parcelable roomCardStruct;
        this.options = new ArrayList();
        this.rooms = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                this.options.isEmpty();
                this.rooms.isEmpty();
                return;
            }
            switch (LIZIZ) {
                case 1:
                    this.questionKey = QV1.LJFF(c10532g);
                    continue;
                case 2:
                    this.questionText = QV1.LJFF(c10532g);
                    continue;
                case 3:
                    this.type = Long.valueOf(QV1.LIZJ(c10532g));
                    continue;
                case 4:
                    list = this.options;
                    roomCardStruct = new Option(c10532g);
                    break;
                case 5:
                    this.questionId = Long.valueOf(QV1.LIZJ(c10532g));
                    continue;
                case 6:
                    list = this.rooms;
                    roomCardStruct = new RoomCardStruct(c10532g);
                    break;
                default:
                    QV1.LJII(c10532g);
                    continue;
            }
            list.add(roomCardStruct);
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
        parcel.writeString(this.questionKey);
        parcel.writeString(this.questionText);
        if (this.type == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.type.longValue());
        }
        parcel.writeTypedList(this.options);
        if (this.questionId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.questionId.longValue());
        }
        parcel.writeTypedList(this.rooms);
    }
}
