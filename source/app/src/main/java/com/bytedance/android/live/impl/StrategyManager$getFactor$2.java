package com.bytedance.android.live.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C147430fIu;

/* loaded from: classes25.dex */
public final /* synthetic */ class StrategyManager$getFactor$2 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24986);
    }

    public StrategyManager$getFactor$2(C147430fIu c147430fIu) {
        super(1, c147430fIu, C147430fIu.class, "updateCharacter", "updateCharacter(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            ((C147430fIu) this.receiver).LIZ(str2);
        }
        return Unit.INSTANCE;
    }
}
