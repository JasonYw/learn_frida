package com.android.ttcjpaysdk.base.settings.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class CJPayLoadingConfig implements CJPayObject, Serializable {
    public boolean is_ecommerce_douyin_loading_auto_close;
    public int loading_time_out;

    static {
        Covode.recordClassIndex(6569);
    }

    public CJPayLoadingConfig() {
        this(0, false, 3, null);
    }

    public CJPayLoadingConfig(int i, boolean z) {
        this.loading_time_out = i;
        this.is_ecommerce_douyin_loading_auto_close = z;
    }

    public /* synthetic */ CJPayLoadingConfig(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 15 : i, (i2 & 2) != 0 ? false : z);
    }
}
