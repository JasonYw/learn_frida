package com.bytedance.android.live.browser.webview;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C101310Pv6;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.webview.m */
/* loaded from: classes5.dex */
public final class C4057m {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("show_confirm")
    public boolean LIZIZ = true;
    @SerializedName("white_list")
    public List<String> LIZJ;

    static {
        Covode.recordClassIndex(23227);
    }

    public final boolean LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        if (!this.LIZIZ) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Uri parse = Uri.parse(str);
        List<String> list = this.LIZJ;
        if (list != null) {
            for (String str2 : list) {
                Intrinsics.checkNotNullExpressionValue(parse, "");
                C101310Pv6.LIZ(parse.getHost(), str2);
            }
        }
        return true;
    }
}
