package com.bytedance.android.btm.impl;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BtmIdCreator$createBtmIdAcrossProcess$1 extends Lambda implements Function0<Object> {
    public static final BtmIdCreator$createBtmIdAcrossProcess$1 INSTANCE = new BtmIdCreator$createBtmIdAcrossProcess$1();

    static {
        Covode.recordClassIndex(11363);
    }

    public BtmIdCreator$createBtmIdAcrossProcess$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        return "createBtmBeforeAcrossProcess: pre_btm is null";
    }
}
