package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class EdgeEffectCompat {
    public EdgeEffect mEdgeEffect;

    static {
        Covode.recordClassIndex(1165);
    }

    public final void finish() {
        this.mEdgeEffect.finish();
    }

    public final boolean isFinished() {
        return this.mEdgeEffect.isFinished();
    }

    public final boolean onRelease() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    public final boolean draw(Canvas canvas) {
        return this.mEdgeEffect.draw(canvas);
    }

    public final boolean onAbsorb(int i) {
        this.mEdgeEffect.onAbsorb(i);
        return true;
    }

    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = new EdgeEffect(context);
    }

    public final boolean onPull(float f) {
        this.mEdgeEffect.onPull(f);
        return true;
    }

    public final void setSize(int i, int i2) {
        this.mEdgeEffect.setSize(i, i2);
    }

    public final boolean onPull(float f, float f2) {
        onPull(this.mEdgeEffect, f, f2);
        return true;
    }

    public static void onPull(EdgeEffect edgeEffect, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        edgeEffect.onPull(f, f2);
    }
}
