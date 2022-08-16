package com.android.ttcjpaysdk.base.p135ui.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayProtocolGroupContentsBean */
/* loaded from: classes17.dex */
public class CJPayProtocolGroupContentsBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean is_checked;
    public boolean is_show_button;
    public boolean need_guide;
    public transient JSONObject protocol_group_names;
    public int quota;
    public String status = "";
    public String code = "";
    public String msg = "";
    public String guide_message = "";
    public String title = "";
    public String secure_tip = "";
    public String button_text = "";
    public ArrayList<CJPayCardProtocolBean> protocol_list = new ArrayList<>();
    public ArrayList<C2175d> sub_guide_desc = new ArrayList<>();
    public String guide_type = "";
    public String guide_style = "";
    public String protocol_check_box = "1";

    static {
        Covode.recordClassIndex(6642);
    }

    public int getPswdQuota() {
        int i = this.quota;
        if (i > 0) {
            return i / 100;
        }
        return 0;
    }

    public boolean isNeedCheckBox() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "1".equals(this.protocol_check_box);
    }

    public ArrayList<CJPayProtocolGroupBean> getProtocolGroupBeanList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
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

    public String getPswdGuideType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.need_guide) {
            if ("upgrade".equals(this.guide_type)) {
                return "promote_quota";
            }
            return "open";
        }
        return "";
    }

    public boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.equals("MP000000", this.code) && !TextUtils.equals("CD000000", this.code)) {
            return false;
        }
        return true;
    }

    public ArrayList<JSONObject> getProtocolJsonListByGroup(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        try {
            if (this.protocol_list != null && this.protocol_list.size() > 0) {
                for (int i = 0; i < this.protocol_list.size(); i++) {
                    if (str.equals(this.protocol_list.get(i).group)) {
                        arrayList.add(CJPayJsonParser.toJsonObject(this.protocol_list.get(i)));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public ArrayList<CJPayCardProtocolBean> getProtocolListByGroup(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        ArrayList<CJPayCardProtocolBean> arrayList = new ArrayList<>();
        ArrayList<CJPayCardProtocolBean> arrayList2 = this.protocol_list;
        if (arrayList2 != null && arrayList2.size() > 0) {
            for (int i = 0; i < this.protocol_list.size(); i++) {
                if (str.equals(this.protocol_list.get(i).group)) {
                    arrayList.add(this.protocol_list.get(i));
                }
            }
        }
        return arrayList;
    }
}
