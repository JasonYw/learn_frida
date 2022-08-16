package com.bytedance.android.btm.api.model;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BtmItemBuilder$build$1 extends Lambda implements Function0<Object> {
    public static final BtmItemBuilder$build$1 INSTANCE = new BtmItemBuilder$build$1();

    static {
        Covode.recordClassIndex(11317);
    }

    public BtmItemBuilder$build$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        return "BtmItem.btm must not empty";
    }
}
