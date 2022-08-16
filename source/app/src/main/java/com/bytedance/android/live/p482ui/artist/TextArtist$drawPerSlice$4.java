package com.bytedance.android.live.p482ui.artist;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import p003X.C135003c3y;

/* renamed from: com.bytedance.android.live.ui.artist.TextArtist$drawPerSlice$4 */
/* loaded from: classes17.dex */
public final class TextArtist$drawPerSlice$4 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $areaWidth;
    public final /* synthetic */ TextArtist$drawPerSlice$3 $drawEllipsis$3;
    public final /* synthetic */ TextArtist$drawPerSlice$2 $drawNormalLine$2;
    public final /* synthetic */ TextArtist$drawPerSlice$1 $drawSlice$1;
    public final /* synthetic */ C135003c3y this$0;

    static {
        Covode.recordClassIndex(36334);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextArtist$drawPerSlice$4(C135003c3y c135003c3y, int i, TextArtist$drawPerSlice$2 textArtist$drawPerSlice$2, TextArtist$drawPerSlice$3 textArtist$drawPerSlice$3, TextArtist$drawPerSlice$1 textArtist$drawPerSlice$1) {
        super(1);
        this.this$0 = c135003c3y;
        this.$areaWidth = i;
        this.$drawNormalLine$2 = textArtist$drawPerSlice$2;
        this.$drawEllipsis$3 = textArtist$drawPerSlice$3;
        this.$drawSlice$1 = textArtist$drawPerSlice$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        LIZ(num.intValue());
        return Unit.INSTANCE;
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        IntRange intRange = this.this$0.LJIILIIL.get(i);
        Intrinsics.checkNotNullExpressionValue(intRange, "");
        IntRange intRange2 = intRange;
        float width = this.this$0.LJIJ.width();
        float f = this.this$0.LJIIJJI[intRange2.getLast()] + this.this$0.LJIIJ[intRange2.getLast()];
        if (width < this.$areaWidth - f) {
            this.$drawNormalLine$2.LIZ(i);
            this.$drawEllipsis$3.LIZ(f, this.this$0.LJIIL[intRange2.getLast()] - (-this.this$0.LJIJI.top));
            return;
        }
        int first = intRange2.getFirst();
        int last = intRange2.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            float f2 = this.this$0.LJIIJJI[first];
            if (this.this$0.LJIIJ[first] + f2 + width >= this.$areaWidth) {
                this.$drawEllipsis$3.LIZ(f2, this.this$0.LJIIL[first] - (-this.this$0.LJIJI.top));
                return;
            }
            this.$drawSlice$1.LIZ(first);
            if (first != last) {
                first++;
            } else {
                return;
            }
        }
    }
}
