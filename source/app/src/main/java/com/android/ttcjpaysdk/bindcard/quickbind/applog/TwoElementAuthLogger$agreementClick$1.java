package com.android.ttcjpaysdk.bindcard.quickbind.applog;

import com.android.ttcjpaysdk.base.p135ui.data.CJPayCardProtocolBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class TwoElementAuthLogger$agreementClick$1 extends Lambda implements Function1<CJPayCardProtocolBean, CharSequence> {
    public static final TwoElementAuthLogger$agreementClick$1 INSTANCE = new TwoElementAuthLogger$agreementClick$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(7228);
    }

    public TwoElementAuthLogger$agreementClick$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ CharSequence invoke(CJPayCardProtocolBean cJPayCardProtocolBean) {
        CJPayCardProtocolBean cJPayCardProtocolBean2 = cJPayCardProtocolBean;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayCardProtocolBean2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        String str = cJPayCardProtocolBean2.name;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
