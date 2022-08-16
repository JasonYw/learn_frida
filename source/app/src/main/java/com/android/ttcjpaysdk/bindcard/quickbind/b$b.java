package com.android.ttcjpaysdk.bindcard.quickbind;

import com.android.ttcjpaysdk.base.p128d.p129b.AbstractC2125c;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsSignBean;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayQuickBindSmsBean;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface b$b extends AbstractC2125c {
    static {
        Covode.recordClassIndex(7236);
    }

    void LIZ(CJPaySmsSignBean cJPaySmsSignBean);

    void LIZ(CJPayQuickBindSmsBean cJPayQuickBindSmsBean);

    void LIZ(String str, String str2);

    void LIZIZ(String str, String str2);
}
