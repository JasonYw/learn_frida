package com.bytedance.android.live.base.model.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.C65773BxH;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class FeedbackCard implements Parcelable, C3LJ {
    public static final Parcelable.Creator<FeedbackCard> CREATOR = new C65773BxH(FeedbackCard.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    public int backToLeaveRoomAction;
    @SerializedName("bgm")
    public ImageModel bgm;
    @SerializedName("condition")
    public Condition condition;
    @SerializedName("feedback_id")
    public Long feedbackId;
    @SerializedName("feedback_type")
    public Integer feedbackType;
    public boolean fromPreview;
    public Integer index;
    @SerializedName("inflow_feedback_type")
    public Integer inflowFeedbackType;
    public boolean isSlideUpToLeaveRoom;
    public final List<RoomCardStruct> likedRooms;
    @SerializedName("negative_text")
    public String negativeText;
    @SerializedName("question")
    public List<Question> question;
    @SerializedName("room_data")
    public Room room;
    @SerializedName("room_id")
    public Long roomId;
    public FeedbackStatus status;
    @SerializedName("title")
    public String title;

    /* loaded from: classes12.dex */
    public enum FeedbackStatus implements Parcelable {
        DEFAULT,
        SHOWING,
        SHOWN,
        COMPLETE;
        
        public static final Parcelable.Creator<FeedbackStatus> CREATOR = new C65773BxH(FeedbackStatus.class);
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(14042);
        }

        FeedbackStatus(Parcel parcel) {
        }

        public static FeedbackStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (FeedbackStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(FeedbackStatus.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FeedbackStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (FeedbackStatus[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
        }
    }

    static {
        Covode.recordClassIndex(14041);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        parcel.writeString(this.title);
        if (this.feedbackId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.feedbackId.longValue());
        }
        parcel.writeTypedList(this.question);
        parcel.writeParcelable(this.condition, i);
        if (this.roomId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.roomId.longValue());
        }
        parcel.writeParcelable(this.room, i);
        parcel.writeString(this.negativeText);
        parcel.writeParcelable(this.bgm, i);
        if (this.feedbackType == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.feedbackType.intValue());
        }
        if (this.inflowFeedbackType == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.inflowFeedbackType.intValue());
        }
        parcel.writeTypedList(this.likedRooms);
        if (this.index == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.index.intValue());
        }
        parcel.writeParcelable(this.status, i);
        parcel.writeInt(this.backToLeaveRoomAction);
        parcel.writeByte(this.isSlideUpToLeaveRoom ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fromPreview ? (byte) 1 : (byte) 0);
    }

    public final int getBackToLeaveRoomAction() {
        return this.backToLeaveRoomAction;
    }

    public final boolean getFromPreview() {
        return this.fromPreview;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final List<RoomCardStruct> getLikedRooms() {
        return this.likedRooms;
    }

    public final FeedbackStatus getStatus() {
        return this.status;
    }

    public final boolean isSlideUpToLeaveRoom() {
        return this.isSlideUpToLeaveRoom;
    }

    public FeedbackCard() {
        this.feedbackType = 1;
        this.inflowFeedbackType = 1;
        this.likedRooms = new ArrayList();
        this.status = FeedbackStatus.DEFAULT;
        this.backToLeaveRoomAction = -1;
        this.isSlideUpToLeaveRoom = true;
    }

    public final boolean canShowDirectly() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (FeedbackStatus.DEFAULT.compareTo(this.status) >= 0 || this.status.compareTo(FeedbackStatus.COMPLETE) >= 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder("{roomId:");
        sb.append(this.roomId);
        sb.append(',');
        sb.append("condition:");
        Condition condition = this.condition;
        if (condition != null) {
            str = condition.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final String getLogInfo() {
        ArrayList arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Question> list = this.question;
        if (list != null) {
            for (Question question : list) {
                String str = question.questionKey + '_' + question.questionText;
                List<Option> list2 = question.options;
                if (list2 != null) {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (Option option : list2) {
                        arrayList.add(option.key + '_' + option.text);
                    }
                } else {
                    arrayList = new ArrayList();
                }
                linkedHashMap.put(str, arrayList);
            }
        }
        return linkedHashMap.toString();
    }

    public final void setBackToLeaveRoomAction(int i) {
        this.backToLeaveRoomAction = i;
    }

    public final void setFromPreview(boolean z) {
        this.fromPreview = z;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setSlideUpToLeaveRoom(boolean z) {
        this.isSlideUpToLeaveRoom = z;
    }

    public final void updateFeedbackStatus(FeedbackStatus feedbackStatus) {
        if (PatchProxy.proxy(new Object[]{feedbackStatus}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(feedbackStatus);
        this.status = feedbackStatus;
    }

    public FeedbackCard(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.feedbackType = 1;
        this.inflowFeedbackType = 1;
        this.likedRooms = new ArrayList();
        this.status = FeedbackStatus.DEFAULT;
        this.backToLeaveRoomAction = -1;
        this.isSlideUpToLeaveRoom = true;
        this.title = parcel.readString();
        if (parcel.readByte() == 0) {
            this.feedbackId = null;
        } else {
            this.feedbackId = Long.valueOf(parcel.readLong());
        }
        this.question = parcel.createTypedArrayList(Question.CREATOR);
        this.condition = (Condition) parcel.readParcelable(Condition.class.getClassLoader());
        if (parcel.readByte() == 0) {
            this.roomId = null;
        } else {
            this.roomId = Long.valueOf(parcel.readLong());
        }
        this.room = (Room) parcel.readParcelable(Room.class.getClassLoader());
        this.negativeText = parcel.readString();
        this.bgm = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        if (parcel.readByte() == 0) {
            this.feedbackType = null;
        } else {
            this.feedbackType = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.inflowFeedbackType = null;
        } else {
            this.inflowFeedbackType = Integer.valueOf(parcel.readInt());
        }
        this.likedRooms = parcel.createTypedArrayList(RoomCardStruct.CREATOR);
        if (parcel.readByte() == 0) {
            this.index = null;
        } else {
            this.index = Integer.valueOf(parcel.readInt());
        }
        this.status = (FeedbackStatus) parcel.readParcelable(FeedbackStatus.class.getClassLoader());
        this.backToLeaveRoomAction = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSlideUpToLeaveRoom = z;
        this.fromPreview = parcel.readByte() == 0 ? false : z2;
    }

    public FeedbackCard(C10532g c10532g) {
        this.question = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.title = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.feedbackId = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 3:
                        this.question.add(new Question(c10532g));
                        break;
                    case 4:
                        this.condition = new Condition(c10532g);
                        break;
                    case 5:
                        this.roomId = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 6:
                        this.room = _Room_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 7:
                        this.negativeText = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        this.bgm = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 9:
                        this.feedbackType = Integer.valueOf(QV1.LIZIZ(c10532g));
                        break;
                    case 10:
                        this.inflowFeedbackType = Integer.valueOf(QV1.LIZIZ(c10532g));
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                this.question.isEmpty();
                if (this.feedbackType == null) {
                    this.feedbackType = 1;
                }
                if (this.inflowFeedbackType == null) {
                    this.inflowFeedbackType = 1;
                }
                this.likedRooms = new ArrayList();
                this.status = FeedbackStatus.DEFAULT;
                this.backToLeaveRoomAction = -1;
                this.isSlideUpToLeaveRoom = true;
                return;
            }
        }
    }
}
