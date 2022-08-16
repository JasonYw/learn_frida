package anetwork.channel.cache;

import com.bytedance.covode.number.Covode;
import p003X.V30;

/* loaded from: classes13.dex */
public class a$a implements Comparable<a$a> {
    public final Cache LIZ;
    public final V30 LIZIZ;
    public final int LIZJ;

    static {
        Covode.recordClassIndex(2435);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(a$a a_a) {
        return this.LIZJ - a_a.LIZJ;
    }

    public a$a(Cache cache, V30 v30, int i) {
        this.LIZ = cache;
        this.LIZIZ = v30;
        this.LIZJ = i;
    }
}
