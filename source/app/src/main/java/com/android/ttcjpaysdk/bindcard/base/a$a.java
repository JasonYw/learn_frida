package com.android.ttcjpaysdk.bindcard.base;

import com.android.ttcjpaysdk.base.p128d.p129b.AbstractC2125c;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayTwoAuthVerifyBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface a$a extends AbstractC2125c {
    static {
        Covode.recordClassIndex(6982);
    }

    void LIZ(CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean, QuickBindCardAdapterBean quickBindCardAdapterBean);

    void LIZ(CJPayTwoAuthVerifyBean cJPayTwoAuthVerifyBean, QuickBindCardAdapterBean quickBindCardAdapterBean, CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean);

    void LIZ(String str, String str2);

    void LIZIZ(CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean, QuickBindCardAdapterBean quickBindCardAdapterBean);

    void LIZIZ(String str, String str2);

    void LIZJ(String str, String str2);
}
