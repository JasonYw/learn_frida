package com.bytedance.android.annie.card.web;

import com.bytedance.android.annie.scheme.p215vo.BaseHybridParamVo;
import com.bytedance.android.annie.scheme.p215vo.WebHybridParamVo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C99718PPc;
import p003X.POY;

/* loaded from: classes7.dex */
public final class WebComponent$useForest$2 extends Lambda implements Function0<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C99718PPc this$0;

    static {
        Covode.recordClassIndex(10691);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebComponent$useForest$2(C99718PPc c99718PPc) {
        super(0);
        this.this$0 = c99718PPc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        String str;
        boolean LIZ;
        BaseHybridParamVo baseHybridParamVo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Boolean) proxy.result).booleanValue();
        } else {
            WebHybridParamVo webHybridParamVo = this.this$0.LJIIIZ.LIZJ;
            if (webHybridParamVo != null && (baseHybridParamVo = webHybridParamVo.LJIIJ) != null) {
                str = baseHybridParamVo.LJJIJIIJIL;
            } else {
                str = null;
            }
            LIZ = POY.LIZ(str);
        }
        return Boolean.valueOf(LIZ);
    }
}
