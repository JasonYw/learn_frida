package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.AbstractC0434a;
import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public class IconCompatParcelizer {
    static {
        Covode.recordClassIndex(985);
    }

    public static IconCompat read(AbstractC0434a abstractC0434a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.mType = abstractC0434a.LIZIZ(iconCompat.mType, 1);
        iconCompat.mData = abstractC0434a.LIZIZ(iconCompat.mData, 2);
        iconCompat.mParcelable = abstractC0434a.LIZIZ((AbstractC0434a) iconCompat.mParcelable, 3);
        iconCompat.mInt1 = abstractC0434a.LIZIZ(iconCompat.mInt1, 4);
        iconCompat.mInt2 = abstractC0434a.LIZIZ(iconCompat.mInt2, 5);
        iconCompat.mTintList = (ColorStateList) abstractC0434a.LIZIZ((AbstractC0434a) iconCompat.mTintList, 6);
        iconCompat.mTintModeStr = abstractC0434a.LIZIZ(iconCompat.mTintModeStr, 7);
        iconCompat.onPostParceling();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0434a abstractC0434a) {
        iconCompat.onPreParceling(false);
        if (-1 != iconCompat.mType) {
            abstractC0434a.LIZ(iconCompat.mType, 1);
        }
        if (iconCompat.mData != null) {
            abstractC0434a.LIZ(iconCompat.mData, 2);
        }
        if (iconCompat.mParcelable != null) {
            abstractC0434a.LIZ(iconCompat.mParcelable, 3);
        }
        if (iconCompat.mInt1 != 0) {
            abstractC0434a.LIZ(iconCompat.mInt1, 4);
        }
        if (iconCompat.mInt2 != 0) {
            abstractC0434a.LIZ(iconCompat.mInt2, 5);
        }
        if (iconCompat.mTintList != null) {
            abstractC0434a.LIZ(iconCompat.mTintList, 6);
        }
        if (iconCompat.mTintModeStr != null) {
            abstractC0434a.LIZ(iconCompat.mTintModeStr, 7);
        }
    }
}
