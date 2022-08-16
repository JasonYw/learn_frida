package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;
import p003X.Q06;

/* loaded from: classes8.dex */
public final class DialogMethod$showConfirmDialog$$inlined$apply$lambda$1 extends Lambda implements Function2<DialogInterface, Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $dismissFunc$inlined;
    public final /* synthetic */ aw$a $params$inlined;
    public final /* synthetic */ Q06 this$0;

    static {
        Covode.recordClassIndex(22585);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogMethod$showConfirmDialog$$inlined$apply$lambda$1(Q06 q06, aw$a aw_a, Ref.ObjectRef objectRef) {
        super(2);
        this.this$0 = q06;
        this.$params$inlined = aw_a;
        this.$dismissFunc$inlined = objectRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(DialogInterface dialogInterface, Integer num) {
        if (!PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(dialogInterface);
            this.this$0.finishWithResult(new aw$b(1, "right"));
            ((Function0) this.$dismissFunc$inlined.element).mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
