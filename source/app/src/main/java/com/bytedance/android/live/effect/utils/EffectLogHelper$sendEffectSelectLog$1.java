package com.bytedance.android.live.effect.utils;

import com.bytedance.covode.number.Covode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class EffectLogHelper$sendEffectSelectLog$1 extends Lambda implements Function2<Boolean, Boolean, Unit> {
    public static final EffectLogHelper$sendEffectSelectLog$1 INSTANCE = new EffectLogHelper$sendEffectSelectLog$1();

    static {
        Covode.recordClassIndex(24773);
    }

    public EffectLogHelper$sendEffectSelectLog$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        bool.booleanValue();
        bool2.booleanValue();
        return Unit.INSTANCE;
    }
}
