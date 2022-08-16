package androidx.core.util;

import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.N8G;

/* loaded from: classes17.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    static {
        Covode.recordClassIndex(1049);
    }

    public int hashCode() {
        int hashCode;
        F f = this.first;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.second;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return C0002O.m25083C("Pair{", String.valueOf(this.first), " ", String.valueOf(this.second), "}");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!N8G.LIZ(pair.first, this.first) || !N8G.LIZ(pair.second, this.second)) {
            return false;
        }
        return true;
    }

    public Pair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public static <A, B> Pair<A, B> create(A a, B b) {
        return new Pair<>(a, b);
    }
}
