package com.bytedance.android.live.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C147430fIu;

/* loaded from: classes25.dex */
public final /* synthetic */ class StrategyManager$getFactor$1 extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24985);
    }

    public StrategyManager$getFactor$1(C147430fIu c147430fIu) {
        super(1, c147430fIu, C147430fIu.class, "updateCharacter", "updateCharacter(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list2);
            ((C147430fIu) this.receiver).LIZ((List<String>) list2);
        }
        return Unit.INSTANCE;
    }
}
