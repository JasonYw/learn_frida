package androidx.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.AbstractC0435c;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC109227SzV;

/* loaded from: classes10.dex */
public class AudioAttributesCompat implements AbstractC0435c {
    public static final SparseIntArray LIZIZ;
    public AbstractC109227SzV LIZ;

    public int hashCode() {
        return this.LIZ.hashCode();
    }

    public String toString() {
        return this.LIZ.toString();
    }

    static {
        Covode.recordClassIndex(1449);
        SparseIntArray sparseIntArray = new SparseIntArray();
        LIZIZ = sparseIntArray;
        sparseIntArray.put(5, 1);
        LIZIZ.put(6, 2);
        LIZIZ.put(7, 2);
        LIZIZ.put(8, 1);
        LIZIZ.put(9, 1);
        LIZIZ.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AbstractC109227SzV abstractC109227SzV = this.LIZ;
        if (abstractC109227SzV == null) {
            if (audioAttributesCompat.LIZ != null) {
                return false;
            }
            return true;
        }
        return abstractC109227SzV.equals(audioAttributesCompat.LIZ);
    }
}
