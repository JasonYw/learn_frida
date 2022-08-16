package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.RetainInfoSp */
/* loaded from: classes17.dex */
public final class RetainInfoSp implements CJPayObject, Serializable {
    public String hashedTradeNo;
    public String position;
    public String retain_type;

    static {
        Covode.recordClassIndex(6649);
    }

    public RetainInfoSp() {
        this(null, null, null, 7, null);
    }

    public RetainInfoSp(String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.hashedTradeNo = str;
        this.retain_type = str2;
        this.position = str3;
    }

    public /* synthetic */ RetainInfoSp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
