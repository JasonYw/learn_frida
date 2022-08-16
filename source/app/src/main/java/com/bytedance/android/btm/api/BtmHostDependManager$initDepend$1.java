package com.bytedance.android.btm.api;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BtmHostDependManager$initDepend$1 extends Lambda implements Function0<Object> {
    public static final BtmHostDependManager$initDepend$1 INSTANCE = new BtmHostDependManager$initDepend$1();

    static {
        Covode.recordClassIndex(11270);
    }

    public BtmHostDependManager$initDepend$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        return "BtmSDK init parameter error";
    }
}
