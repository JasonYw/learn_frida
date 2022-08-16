package butterknife;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public interface Setter<T extends View, V> {
    static {
        Covode.recordClassIndex(2549);
    }

    void set(T t, V v, int i);
}
