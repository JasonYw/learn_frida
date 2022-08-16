package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.C0849j;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.d */
/* loaded from: classes19.dex */
public final class C0850d {
    public final List<C0849j> LIZ;
    public final double LIZIZ;
    public final String LIZJ;
    public final char LIZLLL;

    /* renamed from: LJ */
    public final String f21089LJ;

    static {
        Covode.recordClassIndex(4124);
    }

    public final int hashCode() {
        return LIZ(this.LIZLLL, this.f21089LJ, this.LIZJ);
    }

    public static int LIZ(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C0850d(List<C0849j> list, char c, double d, double d2, String str, String str2) {
        this.LIZ = list;
        this.LIZLLL = c;
        this.LIZIZ = d2;
        this.LIZJ = str;
        this.f21089LJ = str2;
    }
}
