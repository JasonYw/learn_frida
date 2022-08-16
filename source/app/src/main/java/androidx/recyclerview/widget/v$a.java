package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p003X.T5W;
import p003X.T5X;

/* loaded from: classes20.dex */
public class v$a {
    public static T5X<v$a> LIZLLL = new T5W(20);
    public int LIZ;
    public RecyclerView.ItemAnimator.C0376c LIZIZ;
    public RecyclerView.ItemAnimator.C0376c LIZJ;

    static {
        Covode.recordClassIndex(1802);
    }

    public static v$a LIZ() {
        v$a acquire = LIZLLL.acquire();
        if (acquire == null) {
            return new v$a();
        }
        return acquire;
    }

    public static void LIZ(v$a v_a) {
        v_a.LIZ = 0;
        v_a.LIZIZ = null;
        v_a.LIZJ = null;
        LIZLLL.release(v_a);
    }
}
