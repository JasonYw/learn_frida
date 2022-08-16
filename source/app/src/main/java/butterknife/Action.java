package butterknife;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface Action<T extends View> {
    static {
        Covode.recordClassIndex(2516);
    }

    void apply(T t, int i);
}
