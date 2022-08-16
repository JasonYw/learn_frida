package android.support.p007v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p003X.C144177eSJ;
import p003X.C144182eSO;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes19.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        static {
            Covode.recordClassIndex(157);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel) {
            int i = Build.VERSION.SDK_INT;
            return MediaDescriptionCompat.LIZ(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    };
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final CharSequence LIZJ;
    public final CharSequence LIZLLL;

    /* renamed from: LJ */
    public final Bitmap f20191LJ;
    public final Uri LJFF;
    public final Bundle LJI;
    public final Uri LJII;
    public Object LJIIIIZZ;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(156);
    }

    public final String toString() {
        return ((Object) this.LIZIZ) + ", " + ((Object) this.LIZJ) + ", " + ((Object) this.LIZLLL);
    }

    public final Object LIZ() {
        if (this.LJIIIIZZ == null) {
            int i = Build.VERSION.SDK_INT;
            Object LIZ = C144177eSJ.LIZ();
            C144177eSJ.LIZ(LIZ, this.LIZ);
            C144177eSJ.LIZ(LIZ, this.LIZIZ);
            C144177eSJ.LIZIZ(LIZ, this.LIZJ);
            C144177eSJ.LIZJ(LIZ, this.LIZLLL);
            C144177eSJ.LIZ(LIZ, this.f20191LJ);
            C144177eSJ.LIZ(LIZ, this.LJFF);
            Bundle bundle = this.LJI;
            if (Build.VERSION.SDK_INT < 23 && this.LJII != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.LJII);
            }
            C144177eSJ.LIZ(LIZ, bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                C144182eSO.LIZ(LIZ, this.LJII);
            }
            this.LJIIIIZZ = C144177eSJ.LIZ(LIZ);
            return this.LJIIIIZZ;
        }
        return this.LJIIIIZZ;
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.LIZ = parcel.readString();
        this.LIZIZ = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LIZJ = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LIZLLL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f20191LJ = (Bitmap) parcel.readParcelable(classLoader);
        this.LJFF = (Uri) parcel.readParcelable(classLoader);
        this.LJI = parcel.readBundle(classLoader);
        this.LJII = (Uri) parcel.readParcelable(classLoader);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p007v4.media.MediaDescriptionCompat LIZ(java.lang.Object r8) {
        /*
            r7 = 0
            if (r8 == 0) goto L66
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            X.eSI r6 = new X.eSI
            r6.<init>()
            java.lang.String r0 = p003X.C144178eSK.LIZ(r8)
            r6.LIZ(r0)
            java.lang.CharSequence r0 = p003X.C144178eSK.LIZIZ(r8)
            r6.LIZ(r0)
            java.lang.CharSequence r0 = p003X.C144178eSK.LIZJ(r8)
            r6.LIZIZ(r0)
            java.lang.CharSequence r0 = p003X.C144178eSK.LIZLLL(r8)
            r6.LIZJ(r0)
            android.graphics.Bitmap r0 = p003X.C144178eSK.m21470LJ(r8)
            r6.LIZ(r0)
            android.net.Uri r0 = p003X.C144178eSK.LJFF(r8)
            r6.LIZ(r0)
            android.os.Bundle r5 = p003X.C144178eSK.LJI(r8)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r5 == 0) goto L7c
            android.support.p007v4.media.session.MediaSessionCompat.ensureClassLoader(r5)
            android.os.Parcelable r3 = r5.getParcelable(r4)
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L7d
            java.lang.String r2 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L75
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L75
        L58:
            r6.LIZ(r7)
            if (r3 == 0) goto L67
            r6.LIZIZ(r3)
        L60:
            android.support.v4.media.MediaDescriptionCompat r7 = r6.LIZ()
            r7.LJIIIIZZ = r8
        L66:
            return r7
        L67:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L60
            android.net.Uri r0 = p003X.C144181eSN.LIZ(r8)
            r6.LIZIZ(r0)
            goto L60
        L75:
            r5.remove(r4)
            r5.remove(r2)
            goto L7d
        L7c:
            r3 = r7
        L7d:
            r7 = r5
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.MediaDescriptionCompat.LIZ(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        ((MediaDescription) LIZ()).writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.LIZ = str;
        this.LIZIZ = charSequence;
        this.LIZJ = charSequence2;
        this.LIZLLL = charSequence3;
        this.f20191LJ = bitmap;
        this.LJFF = uri;
        this.LJI = bundle;
        this.LJII = uri2;
    }
}
