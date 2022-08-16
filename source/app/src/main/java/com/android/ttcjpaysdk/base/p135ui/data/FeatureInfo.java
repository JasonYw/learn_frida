package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.FeatureInfo */
/* loaded from: classes17.dex */
public final class FeatureInfo implements CJPayObject, Serializable {
    public String button;
    public String choice_button;
    public String msg;

    static {
        Covode.recordClassIndex(6647);
    }

    public FeatureInfo() {
        this(null, null, null, 7, null);
    }

    public FeatureInfo(String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.msg = str;
        this.button = str2;
        this.choice_button = str3;
    }

    public /* synthetic */ FeatureInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
