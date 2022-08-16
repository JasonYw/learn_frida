package com.bytedance.android.live.liveinteract.multianchor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class MicDress implements Parcelable {
    public static final Parcelable.Creator<MicDress> CREATOR = new C65773BxH(MicDress.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("voice_wave")
    public VoiceWave LIZIZ;

    static {
        Covode.recordClassIndex(28145);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        parcel.writeParcelable(this.LIZIZ, i);
    }

    /* loaded from: classes3.dex */
    public static class VoiceWave implements Parcelable {
        public static final Parcelable.Creator<VoiceWave> CREATOR = new C65773BxH(VoiceWave.class);
        public static ChangeQuickRedirect LIZ;
        @SerializedName("dress_id")
        public String LIZIZ;
        @SerializedName("low_img")
        public ImageModel LIZJ;
        @SerializedName("medium_img")
        public ImageModel LIZLLL;
        @SerializedName("high_img")

        /* renamed from: LJ */
        public ImageModel f26352LJ;

        static {
            Covode.recordClassIndex(28146);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                return;
            }
            parcel.writeString(this.LIZIZ);
            parcel.writeParcelable(this.LIZJ, i);
            parcel.writeParcelable(this.LIZLLL, i);
            parcel.writeParcelable(this.f26352LJ, i);
        }

        public VoiceWave() {
        }

        public final ImageModel LIZ(int i) {
            if (i == 1) {
                return this.LIZJ;
            }
            if (i == 2) {
                return this.LIZLLL;
            }
            return this.f26352LJ;
        }

        public VoiceWave(Parcel parcel) {
            this.LIZIZ = parcel.readString();
            this.LIZJ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.LIZLLL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.f26352LJ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        }
    }

    public MicDress() {
    }

    public MicDress(Parcel parcel) {
        this.LIZIZ = (VoiceWave) parcel.readParcelable(VoiceWave.class.getClassLoader());
    }
}
