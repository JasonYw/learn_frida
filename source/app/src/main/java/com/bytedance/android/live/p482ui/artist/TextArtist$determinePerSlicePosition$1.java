package com.bytedance.android.live.p482ui.artist;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C135003c3y;

/* renamed from: com.bytedance.android.live.ui.artist.TextArtist$determinePerSlicePosition$1 */
/* loaded from: classes15.dex */
public final class TextArtist$determinePerSlicePosition$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.FloatRef $drawStartX;
    public final /* synthetic */ Ref.FloatRef $drawStartY;
    public final /* synthetic */ Ref.IntRef $lineStartIndex;
    public final /* synthetic */ C135003c3y this$0;

    static {
        Covode.recordClassIndex(36330);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextArtist$determinePerSlicePosition$1(C135003c3y c135003c3y, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.IntRef intRef) {
        super(1);
        this.this$0 = c135003c3y;
        this.$drawStartX = floatRef;
        this.$drawStartY = floatRef2;
        this.$lineStartIndex = intRef;
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
        this.$drawStartX.element = 0.0f;
        this.$drawStartY.element += this.this$0.LJIJJLI + this.this$0.f17866LJ;
        this.this$0.LIZ(this.$lineStartIndex.element, Math.max(this.$lineStartIndex.element, i - 1));
        this.$lineStartIndex.element = i;
    }
}
