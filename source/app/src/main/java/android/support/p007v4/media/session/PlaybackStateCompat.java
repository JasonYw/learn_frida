package android.support.p007v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p003X.C141253dh0;
import p003X.C141254dh1;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes18.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.1
        static {
            Covode.recordClassIndex(221);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    };
    public final long mActions;
    public final long mActiveItemId;
    public final long mBufferedPosition;
    public List<CustomAction> mCustomActions;
    public final int mErrorCode;
    public final CharSequence mErrorMessage;
    public final Bundle mExtras;
    public final long mPosition;
    public final float mSpeed;
    public final int mState;
    public Object mStateObj;
    public final long mUpdateTime;

    public static int toKeyCode(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long getActions() {
        return this.mActions;
    }

    public final long getActiveQueueItemId() {
        return this.mActiveItemId;
    }

    public final long getBufferedPosition() {
        return this.mBufferedPosition;
    }

    public final List<CustomAction> getCustomActions() {
        return this.mCustomActions;
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    public final CharSequence getErrorMessage() {
        return this.mErrorMessage;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }

    public final long getLastPositionUpdateTime() {
        return this.mUpdateTime;
    }

    public final float getPlaybackSpeed() {
        return this.mSpeed;
    }

    public final long getPosition() {
        return this.mPosition;
    }

    public final int getState() {
        return this.mState;
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Builder */
    /* loaded from: classes18.dex */
    public static final class Builder {
        public long mActions;
        public long mActiveItemId;
        public long mBufferedPosition;
        public final List<CustomAction> mCustomActions;
        public int mErrorCode;
        public CharSequence mErrorMessage;
        public Bundle mExtras;
        public long mPosition;
        public float mRate;
        public int mState;
        public long mUpdateTime;

        static {
            Covode.recordClassIndex(222);
        }

        public Builder() {
            this.mCustomActions = new ArrayList();
            this.mActiveItemId = -1L;
        }

        public final PlaybackStateCompat build() {
            return new PlaybackStateCompat(this.mState, this.mPosition, this.mBufferedPosition, this.mRate, this.mActions, this.mErrorCode, this.mErrorMessage, this.mUpdateTime, this.mCustomActions, this.mActiveItemId, this.mExtras);
        }

        public final Builder setActions(long j) {
            this.mActions = j;
            return this;
        }

        public final Builder setActiveQueueItemId(long j) {
            this.mActiveItemId = j;
            return this;
        }

        public final Builder setBufferedPosition(long j) {
            this.mBufferedPosition = j;
            return this;
        }

        public final Builder setErrorMessage(CharSequence charSequence) {
            this.mErrorMessage = charSequence;
            return this;
        }

        public final Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public final Builder addCustomAction(CustomAction customAction) {
            if (customAction != null) {
                this.mCustomActions.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        public Builder(PlaybackStateCompat playbackStateCompat) {
            this.mCustomActions = new ArrayList();
            this.mActiveItemId = -1L;
            this.mState = playbackStateCompat.mState;
            this.mPosition = playbackStateCompat.mPosition;
            this.mRate = playbackStateCompat.mSpeed;
            this.mUpdateTime = playbackStateCompat.mUpdateTime;
            this.mBufferedPosition = playbackStateCompat.mBufferedPosition;
            this.mActions = playbackStateCompat.mActions;
            this.mErrorCode = playbackStateCompat.mErrorCode;
            this.mErrorMessage = playbackStateCompat.mErrorMessage;
            if (playbackStateCompat.mCustomActions != null) {
                this.mCustomActions.addAll(playbackStateCompat.mCustomActions);
            }
            this.mActiveItemId = playbackStateCompat.mActiveItemId;
            this.mExtras = playbackStateCompat.mExtras;
        }

        public final Builder setErrorMessage(int i, CharSequence charSequence) {
            this.mErrorCode = i;
            this.mErrorMessage = charSequence;
            return this;
        }

        public final Builder setState(int i, long j, float f) {
            setState(i, j, f, SystemClock.elapsedRealtime());
            return this;
        }

        public final Builder addCustomAction(String str, String str2, int i) {
            addCustomAction(new CustomAction(str, str2, i, null));
            return this;
        }

        public final Builder setState(int i, long j, float f, long j2) {
            this.mState = i;
            this.mPosition = j;
            this.mUpdateTime = j2;
            this.mRate = f;
            return this;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes18.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
            static {
                Covode.recordClassIndex(224);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        };
        public final String LIZ;
        public final CharSequence LIZIZ;
        public final int LIZJ;
        public final Bundle LIZLLL;

        /* renamed from: LJ */
        public Object f20194LJ;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(223);
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.LIZIZ) + ", mIcon=" + this.LIZJ + ", mExtras=" + this.LIZLLL;
        }

        public CustomAction(Parcel parcel) {
            this.LIZ = parcel.readString();
            this.LIZIZ = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.LIZJ = parcel.readInt();
            this.LIZLLL = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.LIZ);
            TextUtils.writeToParcel(this.LIZIZ, parcel, i);
            parcel.writeInt(this.LIZJ);
            parcel.writeBundle(this.LIZLLL);
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.LIZ = str;
            this.LIZIZ = charSequence;
            this.LIZJ = i;
            this.LIZLLL = bundle;
        }
    }

    static {
        Covode.recordClassIndex(220);
    }

    public final String toString() {
        return "PlaybackState {state=" + this.mState + ", position=" + this.mPosition + ", buffered position=" + this.mBufferedPosition + ", speed=" + this.mSpeed + ", updated=" + this.mUpdateTime + ", actions=" + this.mActions + ", error code=" + this.mErrorCode + ", error message=" + this.mErrorMessage + ", custom actions=" + this.mCustomActions + ", active item id=" + this.mActiveItemId + "}";
    }

    public final Object getPlaybackState() {
        Object obj;
        if (this.mStateObj == null) {
            int i = Build.VERSION.SDK_INT;
            ArrayList arrayList = null;
            List<CustomAction> list = this.mCustomActions;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (CustomAction customAction : this.mCustomActions) {
                    if (customAction.f20194LJ == null) {
                        int i2 = Build.VERSION.SDK_INT;
                        String str = customAction.LIZ;
                        CharSequence charSequence = customAction.LIZIZ;
                        int i3 = customAction.LIZJ;
                        Bundle bundle = customAction.LIZLLL;
                        PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i3);
                        builder.setExtras(bundle);
                        customAction.f20194LJ = builder.build();
                        obj = customAction.f20194LJ;
                    } else {
                        obj = customAction.f20194LJ;
                    }
                    arrayList.add(obj);
                }
            }
            if (Build.VERSION.SDK_INT >= 22) {
                this.mStateObj = C141253dh0.LIZ(this.mState, this.mPosition, this.mBufferedPosition, this.mSpeed, this.mActions, this.mErrorMessage, this.mUpdateTime, arrayList, this.mActiveItemId, this.mExtras);
            } else {
                this.mStateObj = C141254dh1.LIZ(this.mState, this.mPosition, this.mBufferedPosition, this.mSpeed, this.mActions, this.mErrorMessage, this.mUpdateTime, arrayList, this.mActiveItemId);
            }
        }
        return this.mStateObj;
    }

    public final long getCurrentPosition(Long l) {
        long elapsedRealtime;
        long j = this.mPosition;
        float f = this.mSpeed;
        if (l != null) {
            elapsedRealtime = l.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - this.mUpdateTime;
        }
        return Math.max(0L, j + (f * ((float) elapsedRealtime)));
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.mState = parcel.readInt();
        this.mPosition = parcel.readLong();
        this.mSpeed = parcel.readFloat();
        this.mUpdateTime = parcel.readLong();
        this.mBufferedPosition = parcel.readLong();
        this.mActions = parcel.readLong();
        this.mErrorMessage = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.mActiveItemId = parcel.readLong();
        this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.mErrorCode = parcel.readInt();
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction2 : customActions) {
                if (customAction2 != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    PlaybackState.CustomAction customAction3 = customAction2;
                    customAction = new CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), customAction3.getExtras());
                    customAction.f20194LJ = customAction2;
                } else {
                    customAction = null;
                }
                arrayList.add(customAction);
            }
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.mStateObj = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mPosition);
        parcel.writeFloat(this.mSpeed);
        parcel.writeLong(this.mUpdateTime);
        parcel.writeLong(this.mBufferedPosition);
        parcel.writeLong(this.mActions);
        TextUtils.writeToParcel(this.mErrorMessage, parcel, i);
        parcel.writeTypedList(this.mCustomActions);
        parcel.writeLong(this.mActiveItemId);
        parcel.writeBundle(this.mExtras);
        parcel.writeInt(this.mErrorCode);
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.mState = i;
        this.mPosition = j;
        this.mBufferedPosition = j2;
        this.mSpeed = f;
        this.mActions = j3;
        this.mErrorCode = i2;
        this.mErrorMessage = charSequence;
        this.mUpdateTime = j4;
        this.mCustomActions = new ArrayList(list);
        this.mActiveItemId = j5;
        this.mExtras = bundle;
    }
}
