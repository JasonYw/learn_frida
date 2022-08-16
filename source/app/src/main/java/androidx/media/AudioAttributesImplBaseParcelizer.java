package androidx.media;

import androidx.versionedparcelable.AbstractC0434a;
import com.bytedance.covode.number.Covode;
import p003X.C109228SzW;

/* loaded from: classes10.dex */
public final class AudioAttributesImplBaseParcelizer {
    static {
        Covode.recordClassIndex(1452);
    }

    public static C109228SzW read(AbstractC0434a abstractC0434a) {
        C109228SzW c109228SzW = new C109228SzW();
        c109228SzW.LIZ = abstractC0434a.LIZIZ(c109228SzW.LIZ, 1);
        c109228SzW.LIZIZ = abstractC0434a.LIZIZ(c109228SzW.LIZIZ, 2);
        c109228SzW.LIZJ = abstractC0434a.LIZIZ(c109228SzW.LIZJ, 3);
        c109228SzW.LIZLLL = abstractC0434a.LIZIZ(c109228SzW.LIZLLL, 4);
        return c109228SzW;
    }

    public static void write(C109228SzW c109228SzW, AbstractC0434a abstractC0434a) {
        abstractC0434a.LIZ(c109228SzW.LIZ, 1);
        abstractC0434a.LIZ(c109228SzW.LIZIZ, 2);
        abstractC0434a.LIZ(c109228SzW.LIZJ, 3);
        abstractC0434a.LIZ(c109228SzW.LIZLLL, 4);
    }
}
