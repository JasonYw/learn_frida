package com.android.ttcjpaysdk.bindcard.base;

import com.android.ttcjpaysdk.base.p128d.p129b.AbstractC2125c;
import com.android.ttcjpaysdk.bindcard.base.bean.C2215c;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface a$e extends AbstractC2125c {
    static {
        Covode.recordClassIndex(6986);
    }

    void onVerifyPwdFail(String str, String str2);

    void onVerifyPwdSuccess(C2215c c2215c);
}
