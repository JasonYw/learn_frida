package androidx.media;

import androidx.versionedparcelable.AbstractC0434a;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC109227SzV;

/* loaded from: classes10.dex */
public final class AudioAttributesCompatParcelizer {
    static {
        Covode.recordClassIndex(1450);
    }

    public static AudioAttributesCompat read(AbstractC0434a abstractC0434a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.LIZ = (AbstractC109227SzV) abstractC0434a.LIZIZ((AbstractC0434a) audioAttributesCompat.LIZ, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0434a abstractC0434a) {
        abstractC0434a.LIZ(audioAttributesCompat.LIZ, 1);
    }
}
