package butterknife.internal;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes16.dex */
public abstract class DebouncingOnClickListener implements View.OnClickListener {
    public static boolean enabled = true;
    public static final Runnable ENABLE_AGAIN = DebouncingOnClickListener$$Lambda$0.$instance;

    public abstract void doClick(View view);

    static {
        Covode.recordClassIndex(2555);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (enabled) {
            enabled = false;
            view.post(ENABLE_AGAIN);
            doClick(view);
        }
    }
}
