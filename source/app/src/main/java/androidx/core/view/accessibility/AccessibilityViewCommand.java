package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface AccessibilityViewCommand {
    static {
        Covode.recordClassIndex(1124);
    }

    boolean perform(View view, CommandArguments commandArguments);

    /* loaded from: classes17.dex */
    public static abstract class CommandArguments {
        public Bundle mBundle;

        static {
            Covode.recordClassIndex(1125);
        }

        public void setBundle(Bundle bundle) {
            this.mBundle = bundle;
        }
    }
}
