package androidx.p013c.p014a;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.c.a.a$d */
/* loaded from: classes10.dex */
public class a$d {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    static {
        Covode.recordClassIndex(781);
    }

    public final boolean LIZ(int i) {
        int i2;
        int i3 = this.LIZJ;
        if (i3 == 7 || i == 7 || i3 == i || (i2 = this.LIZLLL) == i) {
            return true;
        }
        if ((i3 == 4 || i2 == 4) && i == 3) {
            return true;
        }
        if ((this.LIZJ == 9 || this.LIZLLL == 9) && i == 8) {
            return true;
        }
        if ((this.LIZJ == 12 || this.LIZLLL == 12) && i == 11) {
            return true;
        }
        return false;
    }

    public a$d(String str, int i, int i2) {
        this.LIZIZ = str;
        this.LIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = -1;
    }

    public a$d(String str, int i, int i2, int i3) {
        this.LIZIZ = str;
        this.LIZ = i;
        this.LIZJ = 3;
        this.LIZLLL = 4;
    }
}
