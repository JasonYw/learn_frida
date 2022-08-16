package com.bytedance.android.live.p482ui.artist;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import p003X.C135003c3y;
import p003X.C135004c3z;

/* renamed from: com.bytedance.android.live.ui.artist.TextArtist$drawPerSlice$1 */
/* loaded from: classes17.dex */
public final class TextArtist$drawPerSlice$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Canvas $canvas;
    public final /* synthetic */ Ref.IntRef $charIndex;
    public final /* synthetic */ float $offsetY;
    public final /* synthetic */ Ref.ObjectRef $rocketClickableSpanRange;
    public final /* synthetic */ Ref.IntRef $rocketClickableSpanRangeIndex;
    public final /* synthetic */ C135003c3y this$0;

    static {
        Covode.recordClassIndex(36331);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextArtist$drawPerSlice$1(C135003c3y c135003c3y, float f, Canvas canvas, Ref.IntRef intRef, Ref.ObjectRef objectRef, Ref.IntRef intRef2) {
        super(1);
        this.this$0 = c135003c3y;
        this.$offsetY = f;
        this.$canvas = canvas;
        this.$charIndex = intRef;
        this.$rocketClickableSpanRange = objectRef;
        this.$rocketClickableSpanRangeIndex = intRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        LIZ(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i) {
        CharacterStyle characterStyle;
        int i2;
        T t;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        Object obj = this.this$0.LIZIZ.get(i);
        float f = this.this$0.LJIIJJI[i];
        float f2 = this.this$0.LJIIL[i];
        if (obj instanceof C135004c3z) {
            float f3 = this.$offsetY + f2;
            C135004c3z c135004c3z = (C135004c3z) obj;
            c135004c3z.LIZLLL.draw(this.$canvas, c135004c3z.LIZIZ, c135004c3z.LIZIZ(), c135004c3z.LIZJ(), f, (int) Math.max(0.0f, f2 - f3), (int) f2, (int) f3, this.this$0.LJJ);
            this.this$0.LJJ.getFontMetricsInt(this.this$0.LJIJJ);
            this.this$0.LJJ.LIZIZ = this.this$0.LJIJJ;
            this.$charIndex.element += c135004c3z.LIZ();
        } else {
            String obj2 = obj.toString();
            IntRange intRange = (IntRange) this.$rocketClickableSpanRange.element;
            if (intRange != null && intRange.contains(this.$charIndex.element)) {
                this.this$0.LJJI.set((TextPaint) this.this$0.LJJ);
                List<CharacterStyle> list = this.this$0.LIZJ;
                if (list != null && (characterStyle = list.get(this.$rocketClickableSpanRangeIndex.element)) != null) {
                    characterStyle.updateDrawState(this.this$0.LJJI);
                }
                this.$canvas.drawText(obj2, f, f2, this.this$0.LJJI);
            } else {
                this.$canvas.drawText(obj2, f, f2, this.this$0.LJJ);
            }
            this.$charIndex.element += obj2.length();
        }
        int i3 = this.$charIndex.element;
        IntRange intRange2 = (IntRange) this.$rocketClickableSpanRange.element;
        if (intRange2 != null) {
            i2 = intRange2.mo30427getEndInclusive().intValue();
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (i3 > i2) {
            this.$rocketClickableSpanRangeIndex.element++;
            Ref.ObjectRef objectRef = this.$rocketClickableSpanRange;
            if (this.this$0.LIZLLL.size() > this.$rocketClickableSpanRangeIndex.element) {
                t = this.this$0.LIZLLL.get(this.$rocketClickableSpanRangeIndex.element);
            } else {
                t = 0;
            }
            objectRef.element = t;
        }
    }
}
