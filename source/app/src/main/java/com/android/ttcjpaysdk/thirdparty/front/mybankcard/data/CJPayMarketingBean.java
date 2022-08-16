package com.android.ttcjpaysdk.thirdparty.front.mybankcard.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJPayMarketingBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CJPayBankActivityInfo bank_card_activity_info;
    public String code;
    public String msg;
    public CJPayPromotionTitleInfo promotion_title_info;

    static {
        Covode.recordClassIndex(8743);
    }

    public CJPayMarketingBean() {
        this(null, null, null, null, 15, null);
    }

    public final boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(this.code, "PP000000");
    }

    public CJPayMarketingBean(String str, String str2, CJPayPromotionTitleInfo cJPayPromotionTitleInfo, CJPayBankActivityInfo cJPayBankActivityInfo) {
        C106862S5w.LIZ(str, str2, cJPayPromotionTitleInfo, cJPayBankActivityInfo);
        this.code = str;
        this.msg = str2;
        this.promotion_title_info = cJPayPromotionTitleInfo;
        this.bank_card_activity_info = cJPayBankActivityInfo;
    }

    public /* synthetic */ CJPayMarketingBean(String str, String str2, CJPayPromotionTitleInfo cJPayPromotionTitleInfo, CJPayBankActivityInfo cJPayBankActivityInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new CJPayPromotionTitleInfo(null, null, false, 7, null) : cJPayPromotionTitleInfo, (i & 8) != 0 ? new CJPayBankActivityInfo(null, null, 3, null) : cJPayBankActivityInfo);
    }
}
