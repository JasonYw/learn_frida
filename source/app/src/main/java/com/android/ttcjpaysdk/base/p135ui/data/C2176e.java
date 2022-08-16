package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.e */
/* loaded from: classes17.dex */
public final class C2176e implements CJPayObject {
    public String title = "";
    public ArrayList<C2177a> content_list = new ArrayList<>();
    public String error_code = "";
    public String error_message = "";

    /* renamed from: com.android.ttcjpaysdk.base.ui.data.e$a */
    /* loaded from: classes17.dex */
    public static class C2177a implements CJPayObject {
        public String sub_title = "";
        public String sub_content = "";

        static {
            Covode.recordClassIndex(6658);
        }
    }

    static {
        Covode.recordClassIndex(6657);
    }
}
