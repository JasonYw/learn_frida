package com.android.ttcjpaysdk.base.auth.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C135468cBT;

/* loaded from: classes17.dex */
public final /* synthetic */ class CJPayRealNameAuthFragment$setJson$$inlined$with$lambda$2$1 extends FunctionReferenceImpl implements Function2<Boolean, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(5933);
    }

    public CJPayRealNameAuthFragment$setJson$$inlined$with$lambda$2$1(C135468cBT c135468cBT) {
        super(2, c135468cBT, C135468cBT.class, "executeTranslateAnimation", "executeTranslateAnimation(ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Byte.valueOf(booleanValue2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            ((C135468cBT) this.receiver).LIZ(booleanValue, booleanValue2);
        }
        return Unit.INSTANCE;
    }
}
