package androidx.recyclerview.widget;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class a$b {
    public int LIZ;
    public int LIZIZ;
    public Object LIZJ;
    public int LIZLLL;

    static {
        Covode.recordClassIndex(1742);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.LIZIZ);
        sb.append("c:");
        sb.append(this.LIZLLL);
        sb.append(",p:");
        sb.append(this.LIZJ);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a$b a_b = (a$b) obj;
        int i = this.LIZ;
        if (i != a_b.LIZ) {
            return false;
        }
        if (i == 8 && Math.abs(this.LIZLLL - this.LIZIZ) == 1 && this.LIZLLL == a_b.LIZIZ && this.LIZIZ == a_b.LIZLLL) {
            return true;
        }
        if (this.LIZLLL != a_b.LIZLLL || this.LIZIZ != a_b.LIZIZ) {
            return false;
        }
        Object obj2 = this.LIZJ;
        if (obj2 != null) {
            if (!obj2.equals(a_b.LIZJ)) {
                return false;
            }
        } else if (a_b.LIZJ != null) {
            return false;
        }
        return true;
    }

    public a$b(int i, int i2, int i3, Object obj) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LIZJ = obj;
    }
}
