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

/* renamed from: com.bytedance.android.live.ui.artist.TextArtist$drawPerSlice$2 */
/* loaded from: classes17.dex */
public final class TextArtist$drawPerSlice$2 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TextArtist$drawPerSlice$1 $drawSlice$1;
    public final /* synthetic */ C135003c3y this$0;

    static {
        Covode.recordClassIndex(36332);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextArtist$drawPerSlice$2(C135003c3y c135003c3y, TextArtist$drawPerSlice$1 textArtist$drawPerSlice$1) {
        super(1);
        this.this$0 = c135003c3y;
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
        int first = intRange2.getFirst();
        int last = intRange2.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            this.$drawSlice$1.LIZ(first);
            if (first != last) {
                first++;
            } else {
                return;
            }
        }
    }
}
