package com.android.ttcjpaysdk.thirdparty.front.mybankcard.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJPayPromotionTitleInfo implements CJPayObject, Serializable {
    public boolean if_show_sub_title;
    public String main_title;
    public String sub_title;

    static {
        Covode.recordClassIndex(8746);
    }

    public CJPayPromotionTitleInfo() {
        this(null, null, false, 7, null);
    }

    public CJPayPromotionTitleInfo(String str, String str2, boolean z) {
        C106862S5w.LIZ(str, str2);
        this.main_title = str;
        this.sub_title = str2;
        this.if_show_sub_title = z;
    }

    public /* synthetic */ CJPayPromotionTitleInfo(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
