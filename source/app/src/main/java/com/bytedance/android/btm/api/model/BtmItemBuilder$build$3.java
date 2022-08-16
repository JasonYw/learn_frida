package com.bytedance.android.btm.api.model;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BtmItemBuilder$build$3 extends Lambda implements Function0<Object> {
    public static final BtmItemBuilder$build$3 INSTANCE = new BtmItemBuilder$build$3();

    static {
        Covode.recordClassIndex(11319);
    }

    public BtmItemBuilder$build$3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        return "BtmItem.withView/withBtmPage/withPageFinder must be called";
    }
}
