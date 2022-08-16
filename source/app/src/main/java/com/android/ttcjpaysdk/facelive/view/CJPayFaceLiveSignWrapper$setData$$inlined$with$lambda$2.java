package com.android.ttcjpaysdk.facelive.view;

import android.widget.CheckBox;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135389cAC;
import p003X.C135522cCL;

/* loaded from: classes17.dex */
public final class CJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C135389cAC this$0;

    static {
        Covode.recordClassIndex(7425);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2(C135389cAC c135389cAC) {
        super(0);
        this.this$0 = c135389cAC;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Function1<? super ICJPayCallback, Unit> function1;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            CheckBox checkBox = this.this$0.LIZLLL.getCheckBox();
            Intrinsics.checkNotNullExpressionValue(checkBox, "");
            if (!checkBox.isChecked()) {
                if (!C135389cAC.LIZ(this.this$0).isShown()) {
                    C135389cAC.LIZ(this.this$0).setVisibility(0);
                    this.this$0.mRootView.postDelayed(this.this$0.LJI, JsBridgeDelegate.GET_URL_OUT_TIME);
                }
                C135522cCL.LIZLLL.LIZ(this.this$0.mContext, "wallet_alivecheck_firstasignment_guide_next_click", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("agreement_state", "0")));
            } else {
                this.this$0.f17920LJ.LIZIZ();
                C135389cAC c135389cAC = this.this$0;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c135389cAC}, null, C135389cAC.LIZ, true, 4);
                if (proxy.isSupported) {
                    function1 = (Function1) proxy.result;
                } else {
                    function1 = c135389cAC.LJII;
                    if (function1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
                function1.invoke(new ICJPayCallback() { // from class: com.android.ttcjpaysdk.facelive.view.CJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(7426);
                    }

                    @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
                    public final void onFailure(JSONObject jSONObject) {
                        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(jSONObject);
                        CJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2.this.this$0.f17920LJ.LIZ();
                    }

                    @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
                    public final void onResponse(JSONObject jSONObject) {
                        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(jSONObject);
                        CJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2.this.this$0.f17920LJ.LIZ();
                    }
                });
                C135522cCL.LIZLLL.LIZ(this.this$0.mContext, "wallet_alivecheck_firstasignment_guide_next_click", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("agreement_state", "1")));
            }
        }
        return Unit.INSTANCE;
    }
}
