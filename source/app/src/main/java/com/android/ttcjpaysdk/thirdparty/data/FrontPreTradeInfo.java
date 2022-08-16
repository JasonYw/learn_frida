package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class FrontPreTradeInfo implements CJPayObject, Serializable {
    public String code;
    public String msg;
    public PreTradeInfo pre_trade_info;

    static {
        Covode.recordClassIndex(8373);
    }

    public FrontPreTradeInfo() {
        this(null, null, null, 7, null);
    }

    public FrontPreTradeInfo(String str, String str2, PreTradeInfo preTradeInfo) {
        C106862S5w.LIZ(str, str2, preTradeInfo);
        this.code = str;
        this.msg = str2;
        this.pre_trade_info = preTradeInfo;
    }

    public /* synthetic */ FrontPreTradeInfo(String str, String str2, PreTradeInfo preTradeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new PreTradeInfo(null, null, null, null, null, null, 63, null) : preTradeInfo);
    }
}
