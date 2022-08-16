package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.google.gson.JsonElement;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class GsonList$subList$1 extends Lambda implements Function2<Integer, JsonElement, Boolean> {
    public final /* synthetic */ int $fromIndex;
    public final /* synthetic */ int $toIndex;

    static {
        Covode.recordClassIndex(21895);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GsonList$subList$1(int i, int i2) {
        super(2);
        this.$fromIndex = i;
        this.$toIndex = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Boolean invoke(Integer num, JsonElement jsonElement) {
        boolean z;
        int intValue = num.intValue();
        int i = this.$toIndex;
        if (this.$fromIndex <= intValue && i > intValue) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
