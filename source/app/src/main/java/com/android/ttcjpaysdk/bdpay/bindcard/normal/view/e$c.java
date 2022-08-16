package com.android.ttcjpaysdk.bdpay.bindcard.normal.view;

import android.app.Activity;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.p128d.p129b.AbstractC2125c;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface e$c extends AbstractC2125c {
    static {
        Covode.recordClassIndex(6978);
    }

    String LIZ(String str, String str2);

    void LIZ(Activity activity, ICJPayNormalBindCardService.SourceType sourceType, boolean z);

    void LIZ(Activity activity, String str);

    void LIZ(Activity activity, JSONObject jSONObject);

    void LIZ(BaseActivity baseActivity, JSONObject jSONObject, NormalBindCardBean normalBindCardBean);

    void LIZ(CJPayCardAddBean cJPayCardAddBean);

    void LIZ(String str, String str2, String str3);
}
