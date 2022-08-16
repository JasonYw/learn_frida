package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayButtonInfo;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class UnionPaySignBean extends CJPayBindCardBaseBean implements CJPayObject, Serializable {
    public CJPayButtonInfo button_info;

    static {
        Covode.recordClassIndex(7335);
    }

    public UnionPaySignBean() {
        this(null, 1, null);
    }

    public UnionPaySignBean(CJPayButtonInfo cJPayButtonInfo) {
        C106862S5w.LIZ(cJPayButtonInfo);
        this.button_info = cJPayButtonInfo;
    }

    public /* synthetic */ UnionPaySignBean(CJPayButtonInfo cJPayButtonInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CJPayButtonInfo() : cJPayButtonInfo);
    }
}
