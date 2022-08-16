package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class FrontSubPayTypeInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean choose;
    public boolean home_page_show;
    public int index;
    public String sub_pay_type = "";
    public String sub_pay_type_num = "";
    public String status = "";
    public String icon_url = "";
    public String title = "";
    public String sub_title = "";
    public String msg = "";
    public String mark = "";
    public String identity_verify_way = "";
    public FrontPayTypeData pay_type_data = new FrontPayTypeData();

    static {
        Covode.recordClassIndex(8374);
    }

    public boolean isEnable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.status.equals("1");
    }
}
