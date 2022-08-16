package androidx.transition;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.ae */
/* loaded from: classes8.dex */
public final class C0429ae {
    public View LIZIZ;
    public final Map<String, Object> LIZ = new HashMap();
    public final ArrayList<Transition> LIZJ = new ArrayList<>();

    static {
        Covode.recordClassIndex(1960);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZ.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.LIZIZ + "\n") + "    values:";
        for (String str2 : this.LIZ.keySet()) {
            str = str + "    " + str2 + ": " + this.LIZ.get(str2) + "\n";
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0429ae) {
            C0429ae c0429ae = (C0429ae) obj;
            if (this.LIZIZ == c0429ae.LIZIZ && this.LIZ.equals(c0429ae.LIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
