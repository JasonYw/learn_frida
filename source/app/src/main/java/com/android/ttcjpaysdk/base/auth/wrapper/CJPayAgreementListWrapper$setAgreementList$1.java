package com.android.ttcjpaysdk.base.auth.wrapper;

import android.view.View;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.auth.p127a.C2122i;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135423cAk;
import p003X.C135507cC6;

/* loaded from: classes17.dex */
public final class CJPayAgreementListWrapper$setAgreementList$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2122i $content;
    public final /* synthetic */ C135423cAk this$0;

    static {
        Covode.recordClassIndex(5952);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayAgreementListWrapper$setAgreementList$1(C135423cAk c135423cAk, C2122i c2122i) {
        super(1);
        this.this$0 = c135423cAk;
        this.$content = c2122i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(this.this$0.mContext);
            h5ParamBuilder.setUrl(this.$content.display_url);
            h5ParamBuilder.setTitle(this.$content.display_desc);
            h5ParamBuilder.setIsTransTitleBar("0");
            h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(C135507cC6.LIZIZ()));
            if (iCJPayH5Service != null) {
                iCJPayH5Service.startH5(h5ParamBuilder);
            }
        }
        return Unit.INSTANCE;
    }
}
