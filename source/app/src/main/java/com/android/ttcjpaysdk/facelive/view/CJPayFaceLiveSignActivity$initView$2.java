package com.android.ttcjpaysdk.facelive.view;

import android.app.Activity;
import android.widget.FrameLayout;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.facelive.data.GetTicketResponse;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.AbstractC135515cCE;
import p003X.C106862S5w;
import p003X.C135510cC9;
import p003X.C135520cCJ;
import p003X.C135526cCP;
import p003X.C9H6;
import p003X.RunnableC135532cCV;

/* loaded from: classes17.dex */
public final class CJPayFaceLiveSignActivity$initView$2 extends Lambda implements Function1<ICJPayCallback, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CJPayFaceLiveSignActivity this$0;

    static {
        Covode.recordClassIndex(7423);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFaceLiveSignActivity$initView$2(CJPayFaceLiveSignActivity cJPayFaceLiveSignActivity) {
        super(1);
        this.this$0 = cJPayFaceLiveSignActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ICJPayCallback iCJPayCallback) {
        String str;
        final ICJPayCallback iCJPayCallback2 = iCJPayCallback;
        if (!PatchProxy.proxy(new Object[]{iCJPayCallback2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iCJPayCallback2);
            C135510cC9 c135510cC9 = this.this$0.LIZJ;
            CJPayFaceVerifyInfo cJPayFaceVerifyInfo = this.this$0.LIZLLL;
            if (cJPayFaceVerifyInfo != null) {
                str = cJPayFaceVerifyInfo.face_content;
            } else {
                str = null;
            }
            c135510cC9.LIZ(str, new ICJPayCallback() { // from class: com.android.ttcjpaysdk.facelive.view.CJPayFaceLiveSignActivity$initView$2.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7424);
                }

                @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
                public final void onFailure(JSONObject jSONObject) {
                    String optString;
                    if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(jSONObject);
                    iCJPayCallback2.onResponse(jSONObject);
                    CJPayFaceLiveSignActivity cJPayFaceLiveSignActivity = CJPayFaceLiveSignActivity$initView$2.this.this$0;
                    String optString2 = jSONObject.optString("retMsg");
                    Intrinsics.checkNotNullExpressionValue(optString2, "");
                    if (optString2.length() == 0) {
                        optString = CJPayFaceLiveSignActivity$initView$2.this.this$0.getString(2131558456);
                    } else {
                        optString = jSONObject.optString("retMsg");
                    }
                    CJPayBasicUtils.displayToast(cJPayFaceLiveSignActivity, optString);
                }

                @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
                public final void onResponse(JSONObject jSONObject) {
                    String str2;
                    String optString;
                    FrameLayout frameLayout;
                    GetTicketResponse getTicketResponse;
                    AbstractC135515cCE LIZ2;
                    Activity activity;
                    if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(jSONObject);
                    try {
                        JSONObject optJSONObject = jSONObject.optJSONObject("response");
                        if (optJSONObject != null) {
                            str2 = optJSONObject.optString(C2521l.LJIIJ);
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.areEqual("MP000000", str2)) {
                            if (!PatchProxy.proxy(new Object[0], C135520cCJ.LJIIIZ, C135520cCJ.LIZ, false, 3).isSupported && (getTicketResponse = C135520cCJ.LJFF) != null && (LIZ2 = C135526cCP.LIZIZ.LIZ(getTicketResponse.live_route)) != null) {
                                WeakReference<Activity> weakReference = C135520cCJ.LJI;
                                if (weakReference != null) {
                                    activity = weakReference.get();
                                } else {
                                    activity = null;
                                }
                                LIZ2.LIZ(activity, getTicketResponse);
                            }
                            CJPayFaceLiveSignActivity cJPayFaceLiveSignActivity = CJPayFaceLiveSignActivity$initView$2.this.this$0;
                            CJPayFaceLiveSignActivity cJPayFaceLiveSignActivity2 = CJPayFaceLiveSignActivity$initView$2.this.this$0;
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayFaceLiveSignActivity2}, null, CJPayFaceLiveSignActivity.LIZ, true, 10);
                            if (proxy.isSupported) {
                                frameLayout = (FrameLayout) proxy.result;
                            } else {
                                frameLayout = cJPayFaceLiveSignActivity2.LIZIZ;
                                if (frameLayout == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                            }
                            if (!PatchProxy.proxy(new Object[]{cJPayFaceLiveSignActivity, frameLayout, 500L}, null, C9H6.LIZ, true, 4).isSupported && frameLayout != null) {
                                frameLayout.postDelayed(new RunnableC135532cCV(cJPayFaceLiveSignActivity), 500L);
                                return;
                            }
                            return;
                        }
                        iCJPayCallback2.onResponse(jSONObject);
                        CJPayFaceLiveSignActivity cJPayFaceLiveSignActivity3 = CJPayFaceLiveSignActivity$initView$2.this.this$0;
                        String optString2 = jSONObject.optString("retMsg");
                        Intrinsics.checkNotNullExpressionValue(optString2, "");
                        if (optString2.length() == 0) {
                            optString = CJPayFaceLiveSignActivity$initView$2.this.this$0.getString(2131558456);
                        } else {
                            optString = jSONObject.optString("retMsg");
                        }
                        CJPayBasicUtils.displayToast(cJPayFaceLiveSignActivity3, optString);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
