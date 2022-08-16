package com.android.ttcjpaysdk.bdpay.bindcard.normal.bean;

import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayCardProtocolBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBankInfoBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardBaseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayCardInfoBean extends CJPayBindCardBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient JSONObject protocol_group_names;
    public CJPayBankInfoBean bank_info = new CJPayBankInfoBean();
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public boolean isOCRCardNo = false;
    public String guide_message = "";
    public ArrayList<CJPayCardProtocolBean> card_protocol_list = new ArrayList<>();
    public String protocol_check_box = "1";

    static {
        Covode.recordClassIndex(6758);
    }

    public boolean isNeedCheckBox() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "1".equals(this.protocol_check_box);
    }

    public ArrayList<CJPayProtocolGroupBean> getCardProtocolGroupBeanList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        ArrayList<CJPayProtocolGroupBean> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.protocol_group_names;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    CJPayProtocolGroupBean cJPayProtocolGroupBean = new CJPayProtocolGroupBean();
                    String next = keys.next();
                    String string = this.protocol_group_names.getString(next);
                    cJPayProtocolGroupBean.groupName = next;
                    cJPayProtocolGroupBean.groupDesc = string;
                    arrayList.add(cJPayProtocolGroupBean);
                } catch (JSONException unused) {
                }
            }
        }
        return arrayList;
    }

    public ArrayList<CJPayCardProtocolBean> getCardProtocolListByGroup(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        ArrayList<CJPayCardProtocolBean> arrayList = new ArrayList<>();
        ArrayList<CJPayCardProtocolBean> arrayList2 = this.card_protocol_list;
        if (arrayList2 != null && arrayList2.size() > 0) {
            for (int i = 0; i < this.card_protocol_list.size(); i++) {
                if (str.equals(this.card_protocol_list.get(i).group)) {
                    arrayList.add(this.card_protocol_list.get(i));
                }
            }
        }
        return arrayList;
    }
}
