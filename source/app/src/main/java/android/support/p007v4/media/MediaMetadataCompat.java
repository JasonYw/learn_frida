package android.support.p007v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C144176eSI;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* loaded from: classes19.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final ArrayMap<String, Integer> METADATA_KEYS_TYPE;
    public final Bundle mBundle;
    public MediaDescriptionCompat mDescription;
    public Object mMetadataObj;
    public static final String[] PREFERRED_DESCRIPTION_ORDER = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    public static final String[] PREFERRED_BITMAP_ORDER = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    public static final String[] PREFERRED_URI_ORDER = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.1
        static {
            Covode.recordClassIndex(160);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$Builder */
    /* loaded from: classes16.dex */
    public static final class Builder {
        public final Bundle mBundle;

        static {
            Covode.recordClassIndex(161);
        }

        public final MediaMetadataCompat build() {
            return new MediaMetadataCompat(this.mBundle);
        }

        public Builder() {
            this.mBundle = new Bundle();
        }

        public Builder(MediaMetadataCompat mediaMetadataCompat) {
            this.mBundle = new Bundle(mediaMetadataCompat.mBundle);
            MediaSessionCompat.ensureClassLoader(this.mBundle);
        }

        public Builder(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.mBundle.keySet()) {
                Object obj = this.mBundle.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        putBitmap(str, scaleBitmap(bitmap, i));
                    }
                }
            }
        }

        private Bitmap scaleBitmap(Bitmap bitmap, int i) {
            float f = i;
            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
            return C116971W2r.LIZ(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }

        public final Builder putBitmap(String str, Bitmap bitmap) {
            if (MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadataCompat.METADATA_KEYS_TYPE.get(str).intValue() != 2) {
                throw new IllegalArgumentException(C0002O.m25085C("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.mBundle.putParcelable(str, bitmap);
            return this;
        }

        public final Builder putLong(String str, long j) {
            if (MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadataCompat.METADATA_KEYS_TYPE.get(str).intValue() != 0) {
                throw new IllegalArgumentException(C0002O.m25085C("The ", str, " key cannot be used to put a long"));
            }
            this.mBundle.putLong(str, j);
            return this;
        }

        public final Builder putString(String str, String str2) {
            if (MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadataCompat.METADATA_KEYS_TYPE.get(str).intValue() != 1) {
                throw new IllegalArgumentException(C0002O.m25085C("The ", str, " key cannot be used to put a String"));
            }
            this.mBundle.putCharSequence(str, str2);
            return this;
        }

        public final Builder putText(String str, CharSequence charSequence) {
            if (MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadataCompat.METADATA_KEYS_TYPE.get(str).intValue() != 1) {
                throw new IllegalArgumentException(C0002O.m25085C("The ", str, " key cannot be used to put a CharSequence"));
            }
            this.mBundle.putCharSequence(str, charSequence);
            return this;
        }

        public final Builder putRating(String str, RatingCompat ratingCompat) {
            Object obj;
            if (MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(str) && MediaMetadataCompat.METADATA_KEYS_TYPE.get(str).intValue() != 3) {
                throw new IllegalArgumentException(C0002O.m25085C("The ", str, " key cannot be used to put a Rating"));
            }
            Bundle bundle = this.mBundle;
            if (ratingCompat.LIZJ == null) {
                if (ratingCompat.LIZ()) {
                    float f = -1.0f;
                    boolean z = false;
                    switch (ratingCompat.LIZ) {
                        case 1:
                            if (ratingCompat.LIZ == 1 && ratingCompat.LIZIZ == 1.0f) {
                                z = true;
                            }
                            ratingCompat.LIZJ = Rating.newHeartRating(z);
                            break;
                        case 2:
                            if (ratingCompat.LIZ == 2 && ratingCompat.LIZIZ == 1.0f) {
                                z = true;
                            }
                            ratingCompat.LIZJ = Rating.newThumbRating(z);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            int i = ratingCompat.LIZ;
                            int i2 = ratingCompat.LIZ;
                            if ((i2 == 3 || i2 == 4 || i2 == 5) && ratingCompat.LIZ()) {
                                f = ratingCompat.LIZIZ;
                            }
                            ratingCompat.LIZJ = Rating.newStarRating(i, f);
                            break;
                        case 6:
                            if (ratingCompat.LIZ == 6 && ratingCompat.LIZ()) {
                                f = ratingCompat.LIZIZ;
                            }
                            ratingCompat.LIZJ = Rating.newPercentageRating(f);
                            break;
                        default:
                            obj = null;
                            break;
                    }
                    bundle.putParcelable(str, (Parcelable) obj);
                    return this;
                }
                ratingCompat.LIZJ = Rating.newUnratedRating(ratingCompat.LIZ);
            }
            obj = ratingCompat.LIZJ;
            bundle.putParcelable(str, (Parcelable) obj);
            return this;
        }
    }

    public final Bundle getBundle() {
        return new Bundle(this.mBundle);
    }

    public final Set<String> keySet() {
        return this.mBundle.keySet();
    }

    public final int size() {
        return this.mBundle.size();
    }

    public final Object getMediaMetadata() {
        if (this.mMetadataObj == null) {
            int i = Build.VERSION.SDK_INT;
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.mMetadataObj = MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.mMetadataObj;
    }

    public final MediaDescriptionCompat getDescription() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String string = getString("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence text = getText("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(text)) {
            charSequenceArr[0] = text;
            charSequenceArr[1] = getText("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = getText("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            int i = 0;
            int i2 = 0;
            do {
                String[] strArr = PREFERRED_DESCRIPTION_ORDER;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence text2 = getText(strArr[i2]);
                if (!TextUtils.isEmpty(text2)) {
                    charSequenceArr[i] = text2;
                    i++;
                }
                i2 = i3;
            } while (i < 3);
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = PREFERRED_BITMAP_ORDER;
            uri = null;
            if (i4 < strArr2.length) {
                bitmap = getBitmap(strArr2[i4]);
                if (bitmap != null) {
                    break;
                }
                i4++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = PREFERRED_URI_ORDER;
            if (i5 < strArr3.length) {
                String string2 = getString(strArr3[i5]);
                if (!TextUtils.isEmpty(string2)) {
                    uri2 = Uri.parse(string2);
                    break;
                }
                i5++;
            } else {
                uri2 = null;
                break;
            }
        }
        String string3 = getString("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(string3)) {
            uri = Uri.parse(string3);
        }
        C144176eSI c144176eSI = new C144176eSI();
        c144176eSI.LIZ(string);
        c144176eSI.LIZ(charSequenceArr[0]);
        c144176eSI.LIZIZ(charSequenceArr[1]);
        c144176eSI.LIZJ(charSequenceArr[2]);
        c144176eSI.LIZ(bitmap);
        c144176eSI.LIZ(uri2);
        c144176eSI.LIZIZ(uri);
        Bundle bundle = new Bundle();
        if (this.mBundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", getLong("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.mBundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", getLong("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            c144176eSI.LIZ(bundle);
        }
        this.mDescription = c144176eSI.LIZ();
        return this.mDescription;
    }

    static {
        Covode.recordClassIndex(159);
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        METADATA_KEYS_TYPE = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.ARTIST", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.DURATION", 0);
        METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.AUTHOR", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.WRITER", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.COMPOSER", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.COMPILATION", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.DATE", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.YEAR", 0);
        METADATA_KEYS_TYPE.put("android.media.metadata.GENRE", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.TRACK_NUMBER", 0);
        METADATA_KEYS_TYPE.put("android.media.metadata.NUM_TRACKS", 0);
        METADATA_KEYS_TYPE.put("android.media.metadata.DISC_NUMBER", 0);
        METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ARTIST", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.ART", 2);
        METADATA_KEYS_TYPE.put("android.media.metadata.ART_URI", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART", 2);
        METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART_URI", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.USER_RATING", 3);
        METADATA_KEYS_TYPE.put("android.media.metadata.RATING", 3);
        METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_TITLE", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON", 2);
        METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_ID", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_URI", 1);
        METADATA_KEYS_TYPE.put("android.media.metadata.ADVERTISEMENT", 0);
        METADATA_KEYS_TYPE.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public final boolean containsKey(String str) {
        return this.mBundle.containsKey(str);
    }

    public final CharSequence getText(String str) {
        return this.mBundle.getCharSequence(str);
    }

    public MediaMetadataCompat(Bundle bundle) {
        this.mBundle = new Bundle(bundle);
        MediaSessionCompat.ensureClassLoader(this.mBundle);
    }

    public final Bitmap getBitmap(String str) {
        try {
            return (Bitmap) this.mBundle.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final long getLong(String str) {
        return this.mBundle.getLong(str, 0L);
    }

    public final String getString(String str) {
        CharSequence charSequence = this.mBundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.mBundle = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final RatingCompat getRating(String str) {
        try {
            int i = Build.VERSION.SDK_INT;
            return RatingCompat.LIZ(this.mBundle.getParcelable(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static MediaMetadataCompat fromMediaMetadata(Object obj) {
        if (obj != null) {
            int i = Build.VERSION.SDK_INT;
            Parcel obtain = Parcel.obtain();
            ((MediaMetadata) obj).writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.mMetadataObj = obj;
            return createFromParcel;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mBundle);
    }
}
