package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC0434a;
import com.bytedance.covode.number.Covode;
import p003X.C109226SzU;

/* loaded from: classes10.dex */
public final class AudioAttributesImplApi21Parcelizer {
    static {
        Covode.recordClassIndex(1451);
    }

    public static C109226SzU read(AbstractC0434a abstractC0434a) {
        C109226SzU c109226SzU = new C109226SzU();
        c109226SzU.LIZ = (AudioAttributes) abstractC0434a.LIZIZ((AbstractC0434a) c109226SzU.LIZ, 1);
        c109226SzU.LIZIZ = abstractC0434a.LIZIZ(c109226SzU.LIZIZ, 2);
        return c109226SzU;
    }

    public static void write(C109226SzU c109226SzU, AbstractC0434a abstractC0434a) {
        abstractC0434a.LIZ(c109226SzU.LIZ, 1);
        abstractC0434a.LIZ(c109226SzU.LIZIZ, 2);
    }
}
