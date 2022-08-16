package com.android.ttcjpaysdk.thirdparty.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class FastPayGuideInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean need_guide;
    public String title = "";
    public MoreBean more = new MoreBean();
    public List<GuideBarItem> guide_bar = new ArrayList();
    public Map<String, String> protocol_group_names = new HashMap();
    public List<ProtocolItem> protocol_list = new ArrayList();
    public String button_text = "";
    public String button_text_after_open = "";

    /* loaded from: classes17.dex */
    public static class GuideBarItem implements CJPayObject, Serializable {
        public String title = "";
        public String msg = "";

        static {
            Covode.recordClassIndex(8223);
        }
    }

    /* loaded from: classes17.dex */
    public static class MoreBean implements CJPayObject, Serializable {
        public String title = "";
        public PromotionInfoBean promotion_info = new PromotionInfoBean();
        public DescriptionBean description = new DescriptionBean();

        /* loaded from: classes22.dex */
        public static class DescriptionBean implements CJPayObject, Serializable {
            public String title = "";
            public List<ContentBean> content = new ArrayList();

            /* loaded from: classes22.dex */
            public static class ContentBean implements CJPayObject, Serializable {
                public String summary = "";
                public String description = "";

                static {
                    Covode.recordClassIndex(8226);
                }
            }

            static {
                Covode.recordClassIndex(8225);
            }
        }

        /* loaded from: classes17.dex */
        public static class PromotionInfoBean implements CJPayObject, Serializable {
            public String title = "";
            public String summary = "";
            public String description = "";

            static {
                Covode.recordClassIndex(8227);
            }
        }

        static {
            Covode.recordClassIndex(8224);
        }
    }

    /* loaded from: classes17.dex */
    public static class ProtocolItem implements CJPayObject, Serializable {
        public String group = "";
        public String name = "";
        public String template_url = "";

        static {
            Covode.recordClassIndex(8228);
        }
    }

    static {
        Covode.recordClassIndex(8222);
    }

    public ArrayList<JSONObject> getProtocolJsonListByGroup(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
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
}
