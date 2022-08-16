package com.bytedance.android.btm.impl.event;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BtmEventParamFiller$generateBtmParams$2 extends Lambda implements Function0<Object> {
    public static final BtmEventParamFiller$generateBtmParams$2 INSTANCE = new BtmEventParamFiller$generateBtmParams$2();

    static {
        Covode.recordClassIndex(11395);
    }

    public BtmEventParamFiller$generateBtmParams$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        return "fillJSON: btm is null";
    }
}
