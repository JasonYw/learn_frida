package com.android.ttcjpaysdk.base.settings.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJPayJhInfoBean implements CJPayObject, Serializable {
    public String jh_app_id;
    public String jh_merchant_id;
    public String source;
    public String tea_sourch_lynx;
    public String tea_sourch_ntv;

    static {
        Covode.recordClassIndex(6568);
    }

    public CJPayJhInfoBean() {
        this(null, null, null, null, null, 31, null);
    }

    public CJPayJhInfoBean(String str, String str2, String str3, String str4, String str5) {
        C106862S5w.LIZ(str, str2, str3, str4, str5);
        this.jh_merchant_id = str;
        this.jh_app_id = str2;
        this.source = str3;
        this.tea_sourch_ntv = str4;
        this.tea_sourch_lynx = str5;
    }

    public /* synthetic */ CJPayJhInfoBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1200003766" : str, (i & 2) != 0 ? "800037665481" : str2, (i & 4) != 0 ? "wallet_bcard_manage_add" : str3, (i & 8) != 0 ? "wallet_bcard_manage_add_ntv" : str4, (i & 16) != 0 ? "wallet_bcard_manage_add_lynx" : str5);
    }
}
