package androidx.appcompat.widget;

import android.content.pm.ResolveInfo;
import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;

/* loaded from: classes17.dex */
public final class c$a implements Comparable<c$a> {
    public final ResolveInfo LIZ;
    public float LIZIZ;

    static {
        Covode.recordClassIndex(711);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ) + 31;
    }

    public final String toString() {
        return "[resolveInfo:" + this.LIZ.toString() + "; weight:" + new BigDecimal(this.LIZIZ) + "]";
    }

    public c$a(ResolveInfo resolveInfo) {
        this.LIZ = resolveInfo;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(c$a c_a) {
        return Float.floatToIntBits(c_a.LIZIZ) - Float.floatToIntBits(this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.LIZIZ) == Float.floatToIntBits(((c$a) obj).LIZIZ)) {
            return true;
        }
        return false;
    }
}
