package com.android.ttcjpaysdk.base.gecko;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.ttcjpaysdk.base.gecko.e */
/* loaded from: classes17.dex */
public final class C2131e implements CJPayObject {
    public List<C2132a> custom_config = new ArrayList();
    public List<C2134b> falcon_config = new ArrayList();
    public boolean offline_open;

    /* renamed from: com.android.ttcjpaysdk.base.gecko.e$a */
    /* loaded from: classes17.dex */
    public static class C2132a implements CJPayObject {
        public String asset_path;
        public String channel;
        public boolean custom_open;
        public boolean intercept_html;
        public List<C2133a> html_files = new ArrayList();
        public List<String> host = new ArrayList();

        /* renamed from: com.android.ttcjpaysdk.base.gecko.e$a$a */
        /* loaded from: classes17.dex */
        public static class C2133a implements CJPayObject {
            public String file;
            public String path;

            static {
                Covode.recordClassIndex(6094);
            }
        }

        static {
            Covode.recordClassIndex(6093);
        }
    }

    /* renamed from: com.android.ttcjpaysdk.base.gecko.e$b */
    /* loaded from: classes17.dex */
    public static class C2134b implements CJPayObject {
        public boolean falcon_open;
        public List<String> prefix = new ArrayList();

        static {
            Covode.recordClassIndex(6095);
        }
    }

    static {
        Covode.recordClassIndex(6092);
    }
}
