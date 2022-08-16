package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87551Kef;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class BaseOpenMethod$fail$1 extends Lambda implements Function2<Integer, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC87551Kef this$0;

    static {
        Covode.recordClassIndex(20504);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOpenMethod$fail$1(AbstractC87551Kef abstractC87551Kef) {
        super(2);
        this.this$0 = abstractC87551Kef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, String str) {
        int intValue = num.intValue();
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            AbstractC87551Kef.LIZ(this.this$0, intValue, str2, null, null, 12, null);
        }
        return Unit.INSTANCE;
    }
}
