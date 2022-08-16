package com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayRealNameAuthService;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardParamsBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayRealNameAuthCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import p003X.C135503cC2;
import p003X.C135876cI3;
import p003X.C135986cJp;

/* loaded from: classes17.dex */
public final class CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C135986cJp $bankCardNumberWrapper$inlined;
    public final /* synthetic */ CJPayCardAddBean $this_apply;
    public final /* synthetic */ C2191b this$0;

    static {
        Covode.recordClassIndex(6768);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1(CJPayCardAddBean cJPayCardAddBean, C2191b c2191b, C135986cJp c135986cJp) {
        super(0);
        this.$this_apply = cJPayCardAddBean;
        this.this$0 = c2191b;
        this.$bankCardNumberWrapper$inlined = c135986cJp;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        ICJPayRealNameAuthService iCJPayRealNameAuthService;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (iCJPayRealNameAuthService = (ICJPayRealNameAuthService) CJPayServiceManager.getInstance().getIService(ICJPayRealNameAuthService.class)) != null) {
            iCJPayRealNameAuthService.startCJPayRealNameByInfo(this.this$0.getContext(), this.$this_apply.busi_authorize_info_str, new TTCJPayRealNameAuthCallback() { // from class: com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6769);
                }

                @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayRealNameAuthCallback
                public final void onAuthResult(TTCJPayRealNameAuthCallback.AuthResult authResult) {
                    String str;
                    if (PatchProxy.proxy(new Object[]{authResult}, this, LIZ, false, 1).isSupported || authResult == null) {
                        return;
                    }
                    int i = C135503cC2.LIZ[authResult.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            CJPayQuickBindCardUtils.LIZ(false);
                            return;
                        }
                        return;
                    }
                    CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.url_params.id_name_mask = CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.busi_authorize_info.busi_auth_info.id_name_mask;
                    CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.url_params.id_code_mask = CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.busi_authorize_info.busi_auth_info.id_code_mask;
                    CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.url_params.id_type = CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.busi_authorize_info.busi_auth_info.id_type;
                    CJPayBindCardParamsBean cJPayBindCardParamsBean = CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.url_params;
                    if (CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.busi_authorize_info.is_authed) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    cJPayBindCardParamsBean.is_authed = str;
                    CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$this_apply.authorizeClicked = true;
                    CJPayQuickBindCardUtils.LIZ(true);
                    if (CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$bankCardNumberWrapper$inlined == null) {
                        return;
                    }
                    CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.$bankCardNumberWrapper$inlined.LIZ(CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1.this.this$0.LIZIZ());
                }
            }, CJPayHostInfo.Companion.LIZIZ(C135876cI3.f17973LJ.LJIIIIZZ()), new JSONArray());
        }
        return Unit.INSTANCE;
    }
}
