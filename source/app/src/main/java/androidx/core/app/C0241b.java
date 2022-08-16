package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.util.Pair;
import com.bytedance.covode.number.Covode;
import p003X.C141418djg;

/* renamed from: androidx.core.app.b */
/* loaded from: classes18.dex */
public class C0241b {
    static {
        Covode.recordClassIndex(921);
    }

    public Bundle LIZ() {
        return null;
    }

    public static C0241b LIZ(Activity activity, Pair<View, String>... pairArr) {
        int i = Build.VERSION.SDK_INT;
        android.util.Pair[] pairArr2 = null;
        if (pairArr != null) {
            pairArr2 = new android.util.Pair[pairArr.length];
            for (int i2 = 0; i2 < pairArr.length; i2++) {
                pairArr2[i2] = android.util.Pair.create(pairArr[i2].first, pairArr[i2].second);
            }
        }
        return new C141418djg(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr2));
    }

    public static C0241b LIZ(Activity activity, View view, String str) {
        int i = Build.VERSION.SDK_INT;
        return new C141418djg(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static C0241b LIZ(Context context, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return new C141418djg(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static C0241b LIZIZ(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C141418djg(ActivityOptions.makeClipRevealAnimation(view, 0, 0, i3, i4));
        }
        return new C0241b();
    }

    public static C0241b LIZ(View view, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        return new C141418djg(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }
}
