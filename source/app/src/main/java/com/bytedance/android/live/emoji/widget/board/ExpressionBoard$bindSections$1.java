package com.bytedance.android.live.emoji.widget.board;

import com.bytedance.android.live.emoji.model.AbstractC4233e;
import com.bytedance.android.live.emoji.model.ExpressionSection;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C91118Lv6;
import p003X.C91122LvA;

/* loaded from: classes5.dex */
public final class ExpressionBoard$bindSections$1 extends Lambda implements Function3<Integer, Integer, AbstractC4233e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C91122LvA this$0;

    static {
        Covode.recordClassIndex(24894);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionBoard$bindSections$1(C91122LvA c91122LvA) {
        super(3);
        this.this$0 = c91122LvA;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(Integer num, Integer num2, AbstractC4233e abstractC4233e) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), Integer.valueOf(num2.intValue()), abstractC4233e}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC4233e);
            if (this.this$0.getSelfIsVisibility()) {
                if (intValue == 0) {
                    this.this$0.LIZIZ.scrollToPositionWithOffset(0, 0);
                } else {
                    this.this$0.LIZIZ.scrollToPosition(intValue);
                }
                this.this$0.LJIIIZ = intValue;
            }
            C91118Lv6 c91118Lv6 = this.this$0.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, c91118Lv6, C91118Lv6.LIZ, false, 5).isSupported && c91118Lv6.LIZJ != intValue) {
                c91118Lv6.LIZLLL.remove(Integer.valueOf(c91118Lv6.LIZJ));
                c$a c_a = (c$a) c91118Lv6.f9095LJ.findViewHolderForLayoutPosition(c91118Lv6.LIZJ);
                if (c_a != null) {
                    c_a.LIZ(false);
                } else {
                    c91118Lv6.notifyItemChanged(c91118Lv6.LIZJ, c91118Lv6.LJFF.get(c91118Lv6.LIZJ));
                }
                c91118Lv6.LIZ(c91118Lv6.LIZJ);
                c91118Lv6.LIZLLL.add(Integer.valueOf(intValue));
                c91118Lv6.notifyItemChanged(intValue, c91118Lv6.LJFF.get(intValue));
                c91118Lv6.LIZJ = intValue;
                Function2<? super Integer, ? super ExpressionSection, Unit> function2 = c91118Lv6.LIZIZ;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(c91118Lv6.LIZJ), c91118Lv6.LJFF.get(c91118Lv6.LIZJ));
                }
                c91118Lv6.LIZ(c91118Lv6.LIZJ, ExpressionSection.EnterType.DRAW);
            }
            this.this$0.LJII = intValue;
        }
        return Unit.INSTANCE;
    }
}
