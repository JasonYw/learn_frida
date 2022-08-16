package com.bytedance.android.annie.lynx;

import com.bytedance.android.annie.scheme.p215vo.BaseHybridParamVo;
import com.bytedance.android.annie.scheme.p215vo.LynxHybridParamVo;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.ViewTreeObserver$OnPreDrawListenerC99719PPd;

/* loaded from: classes7.dex */
public final class LynxComponent$1 extends Lambda implements Function0<String> {
    public final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC99719PPd this$0;

    static {
        Covode.recordClassIndex(10803);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxComponent$1(ViewTreeObserver$OnPreDrawListenerC99719PPd viewTreeObserver$OnPreDrawListenerC99719PPd) {
        super(0);
        this.this$0 = viewTreeObserver$OnPreDrawListenerC99719PPd;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ String mo30099invoke() {
        BaseHybridParamVo baseHybridParamVo;
        String str;
        LynxHybridParamVo lynxHybridParamVo = this.this$0.LJII.LIZIZ;
        if (lynxHybridParamVo == null || (baseHybridParamVo = lynxHybridParamVo.LJIIIZ) == null || (str = baseHybridParamVo.LJJIJIIJIL) == null) {
            return "";
        }
        return str;
    }
}
