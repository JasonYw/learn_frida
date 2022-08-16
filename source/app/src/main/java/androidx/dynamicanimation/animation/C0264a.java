package androidx.dynamicanimation.animation;

import android.os.Build;
import androidx.collection.SimpleArrayMap;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p003X.AbstractC146780f8Q;
import p003X.C146761f87;
import p003X.C146763f89;

/* renamed from: androidx.dynamicanimation.animation.a */
/* loaded from: classes19.dex */
public final class C0264a {
    public static final ThreadLocal<C0264a> LIZ = new ThreadLocal<>();
    public AbstractC146780f8Q LIZLLL;
    public final SimpleArrayMap<AbstractC0265b, Long> LIZIZ = new SimpleArrayMap<>();
    public final ArrayList<AbstractC0265b> LIZJ = new ArrayList<>();
    public final C146761f87 LJI = new C146761f87(this);

    /* renamed from: LJ */
    public long f20256LJ = 0;
    public boolean LJFF = false;

    /* renamed from: androidx.dynamicanimation.animation.a$b */
    /* loaded from: classes19.dex */
    public interface AbstractC0265b {
        static {
            Covode.recordClassIndex(1239);
        }

        boolean doAnimationFrame(long j);
    }

    static {
        Covode.recordClassIndex(1237);
    }

    public static C0264a LIZ() {
        if (LIZ.get() == null) {
            LIZ.set(new C0264a());
        }
        return LIZ.get();
    }

    public final AbstractC146780f8Q LIZIZ() {
        if (this.LIZLLL == null) {
            int i = Build.VERSION.SDK_INT;
            this.LIZLLL = new C146763f89(this.LJI);
        }
        return this.LIZLLL;
    }
}
