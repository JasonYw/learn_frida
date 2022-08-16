package androidx.appcompat.widget;

import android.content.ComponentName;
import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;

/* loaded from: classes17.dex */
public final class c$c {
    public final ComponentName LIZ;
    public final long LIZIZ;
    public final float LIZJ;

    static {
        Covode.recordClassIndex(713);
    }

    public final int hashCode() {
        int hashCode;
        ComponentName componentName = this.LIZ;
        if (componentName == null) {
            hashCode = 0;
        } else {
            hashCode = componentName.hashCode();
        }
        long j = this.LIZIZ;
        return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public final String toString() {
        return "[; activity:" + this.LIZ + "; time:" + this.LIZIZ + "; weight:" + new BigDecimal(this.LIZJ) + "]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c$c c_c = (c$c) obj;
        ComponentName componentName = this.LIZ;
        if (componentName == null) {
            if (c_c.LIZ != null) {
                return false;
            }
        } else if (!componentName.equals(c_c.LIZ)) {
            return false;
        }
        if (this.LIZIZ == c_c.LIZIZ && Float.floatToIntBits(this.LIZJ) == Float.floatToIntBits(c_c.LIZJ)) {
            return true;
        }
        return false;
    }

    public c$c(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
    }

    public c$c(ComponentName componentName, long j, float f) {
        this.LIZ = componentName;
        this.LIZIZ = j;
        this.LIZJ = f;
    }
}
