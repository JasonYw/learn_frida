package com.bytedance.android.live.emoji.widget.board;

import android.text.TextUtils;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.emoji.api.p332a.AbstractC4230a;
import com.bytedance.android.live.emoji.model.ExpressionSection;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C91122LvA;
import p003X.C91123LvB;

/* loaded from: classes5.dex */
public final class ExpressionBoard$bindSections$2 extends Lambda implements Function2<Integer, ExpressionSection, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C91122LvA this$0;

    static {
        Covode.recordClassIndex(24895);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionBoard$bindSections$2(C91122LvA c91122LvA) {
        super(2);
        this.this$0 = c91122LvA;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, ExpressionSection expressionSection) {
        String str;
        AbstractC4230a LIZ;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), expressionSection}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(expressionSection);
            Object tag = this.this$0.getTag();
            String str2 = null;
            if (tag != null) {
                str = tag.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (LIZ = this.this$0.LJIIIIZZ.LIZ().LIZ()) != null) {
                String LIZJ = this.this$0.LIZJ.LJII.get(intValue).LIZJ();
                Object tag2 = this.this$0.getTag();
                if (tag2 != null) {
                    str2 = tag2.toString();
                }
                LIZ.LIZ(LIZJ, str2);
            }
            C91123LvB c91123LvB = this.this$0.LIZJ;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, c91123LvB, C91123LvB.LIZ, false, 14).isSupported) {
                ViewPager viewPager = c91123LvB.LJIIIZ;
                Integer num2 = c91123LvB.f9098LJ.get(intValue);
                Intrinsics.checkNotNullExpressionValue(num2, "");
                viewPager.setCurrentItem(num2.intValue(), false);
            }
        }
        return Unit.INSTANCE;
    }
}
