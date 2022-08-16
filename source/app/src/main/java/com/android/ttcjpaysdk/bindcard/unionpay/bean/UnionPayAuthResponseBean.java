package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import androidx.core.view.MotionEventCompat;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class UnionPayAuthResponseBean extends CJPayBindCardBaseBean implements CJPayObject, Serializable {
    public UnionPayAuthBean union_pay_authorization;

    static {
        Covode.recordClassIndex(7330);
    }

    public UnionPayAuthResponseBean() {
        this(null, 1, null);
    }

    public UnionPayAuthResponseBean(UnionPayAuthBean unionPayAuthBean) {
        C106862S5w.LIZ(unionPayAuthBean);
        this.union_pay_authorization = unionPayAuthBean;
    }

    public /* synthetic */ UnionPayAuthResponseBean(UnionPayAuthBean unionPayAuthBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UnionPayAuthBean(null, null, null, null, null, null, null, null, MotionEventCompat.ACTION_MASK, null) : unionPayAuthBean);
    }
}
