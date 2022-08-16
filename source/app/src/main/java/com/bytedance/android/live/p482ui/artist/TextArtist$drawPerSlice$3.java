package com.bytedance.android.live.p482ui.artist;

import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C135003c3y;

/* renamed from: com.bytedance.android.live.ui.artist.TextArtist$drawPerSlice$3 */
/* loaded from: classes10.dex */
public final class TextArtist$drawPerSlice$3 extends Lambda implements Function2<Float, Float, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Canvas $canvas;
    public final /* synthetic */ C135003c3y this$0;

    static {
        Covode.recordClassIndex(36333);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextArtist$drawPerSlice$3(C135003c3y c135003c3y, Canvas canvas) {
        super(2);
        this.this$0 = c135003c3y;
        this.$canvas = canvas;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Float f, Float f2) {
        LIZ(f.floatValue(), f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void LIZ(float f, float f2) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.$canvas.save();
        this.$canvas.translate(f, f2);
        C135003c3y c135003c3y = this.this$0.LJIIZILJ;
        if (c135003c3y != null) {
            c135003c3y.LIZ(this.$canvas, (int) this.this$0.LJIJ.width(), (int) this.this$0.LJIJ.height());
        }
        this.$canvas.restore();
    }
}
