package com.android.ttcjpaysdk.thirdparty.counter.p166c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayResultGuideInfo;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.a$b;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2323c;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135444cB5;
import p003X.C135445cB6;
import p003X.C135447cB8;
import p003X.C135449cBA;
import p003X.RunnableC135443cB4;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.c.g */
/* loaded from: classes17.dex */
public final class C2313g extends CJPayBaseFragment implements a$b {
    public static ChangeQuickRedirect LIZ;
    public CJPayCounterTradeQueryResponseBean LIZIZ;
    public C135444cB5 LIZJ;

    /* renamed from: LJ */
    public C135449cBA f25515LJ;
    public JSONObject LJFF;
    public HashMap LJIILJJIL;
    public boolean LIZLLL = true;
    public String LJIIJ = "";
    public final String LJIIJJI = "default_byte_pay_guide";
    public final String LJIIL = "default_credit_pay_guide";
    public final C135447cB8 LJIILIIL = new C135447cB8(this);

    static {
        Covode.recordClassIndex(8175);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690605;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && (hashMap = this.LJIILJJIL) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        C135444cB5 c135444cB5;
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 3).isSupported && (c135444cB5 = this.LIZJ) != null) {
            c135444cB5.LJII = this.LJIILIIL;
            c135444cB5.LIZ();
        }
    }

    private final void LIZ(long j) {
        C135444cB5 c135444cB5;
        View view;
        if (!PatchProxy.proxy(new Object[]{2000L}, this, LIZ, false, 14).isSupported && (c135444cB5 = this.LIZJ) != null && (view = c135444cB5.mRootView) != null) {
            view.postDelayed(new RunnableC135443cB4(this), 2000L);
        }
    }

    private final JSONObject LIZ(JSONObject jSONObject) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            if (Intrinsics.areEqual(this.LJIIJ, this.LJIIJJI)) {
                str = "dou_pay";
            } else {
                str = "credit_pay";
            }
            jSONObject.put("open_method", str);
            if (this.LJFF != null) {
                JSONObject jSONObject2 = this.LJFF;
                Intrinsics.checkNotNull(jSONObject2);
                Iterator<String> keys = jSONObject2.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject3 = this.LJFF;
                    Intrinsics.checkNotNull(jSONObject3);
                    jSONObject.put(next, jSONObject3.get(next));
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject);
        try {
            jSONObject.put("button_name", str);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_cashier_priority_method_page_click", jSONObject);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            C2118a.LIZ().LIZ("wallet_cashier_priority_method_page_imp", jSONObject);
        }
        View findViewById = view.findViewById(2131169843);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZJ = new C135444cB5(findViewById);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$b
    public final void LIZ(C2323c c2323c) {
        String str;
        if (PatchProxy.proxy(new Object[]{c2323c}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (c2323c != null && Intrinsics.areEqual("MP000000", c2323c.code)) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
                this.LIZLLL = false;
                C135444cB5 c135444cB5 = this.LIZJ;
                if (c135444cB5 != null) {
                    String LIZ2 = LIZ(getContext(), 2131561822);
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    c135444cB5.LIZ(LIZ2);
                }
                C135444cB5 c135444cB52 = this.LIZJ;
                if (c135444cB52 != null) {
                    c135444cB52.LIZ(false);
                }
                String str2 = this.LJIIJ;
                if (Intrinsics.areEqual(str2, this.LJIIJJI)) {
                    CJPayBasicUtils.displayToast(getActivity(), LIZ(getContext(), 2131561598));
                } else if (Intrinsics.areEqual(str2, this.LJIIL)) {
                    CJPayBasicUtils.displayToast(getActivity(), LIZ(getContext(), 2131561581));
                }
                LIZ("1", "", "");
                LIZ(2000L);
                return;
            }
            return;
        }
        String str3 = null;
        if (c2323c != null) {
            str = c2323c.code;
            str3 = c2323c.msg;
        } else {
            str = null;
        }
        LIZIZ(str, str3);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$b
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZIZ(str, str2);
    }

    private final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LIZLLL = false;
        C135444cB5 c135444cB5 = this.LIZJ;
        if (c135444cB5 != null) {
            c135444cB5.LIZ(false);
        }
        CJPayBasicUtils.displayToast(getActivity(), LIZ(getContext(), 2131561821));
        LIZ("0", str, str2);
        LIZ(2000L);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        C135444cB5 c135444cB5;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        String string;
        TextView textView;
        TextView textView2;
        if (!PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 2).isSupported && (c135444cB5 = this.LIZJ) != null) {
            CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, c135444cB5, C135444cB5.LIZ, false, 1).isSupported && cJPayCounterTradeQueryResponseBean != null) {
                CJPayResultGuideInfo cJPayResultGuideInfo = cJPayCounterTradeQueryResponseBean.result_guide_info;
                ImageView imageView = c135444cB5.LJIIIZ;
                if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = (int) (CJPayBasicUtils.getScreenWidth(c135444cB5.mContext) * 0.48d);
                    layoutParams2.width = -1;
                    if (cJPayResultGuideInfo != null) {
                        String str = cJPayResultGuideInfo.confirm_btn_desc;
                        String str2 = cJPayResultGuideInfo.header_desc;
                        if (str2 != null && str2.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            string = cJPayResultGuideInfo.header_desc;
                        } else {
                            Context context = c135444cB5.mContext;
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            string = context.getResources().getString(2131561840);
                        }
                        c135444cB5.LIZ(str, 2130840413, true, "", false, true, 2131624854, 20.0f, null, string, false);
                        Context context2 = c135444cB5.mContext;
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        Drawable drawable = context2.getResources().getDrawable(2130840244);
                        Intrinsics.checkNotNullExpressionValue(drawable, "");
                        c135444cB5.LIZ(drawable);
                        String str3 = cJPayResultGuideInfo.pic_url;
                        if (str3 != null && str3.length() > 0) {
                            C2153b.LJI.LIZ().LIZ(str3, new C135445cB6(c135444cB5));
                        }
                        String str4 = cJPayResultGuideInfo.title;
                        if (str4 != null && str4.length() > 0 && (textView2 = c135444cB5.LIZIZ) != null) {
                            textView2.setText(str4);
                            textView2.setTextSize(2, 22.0f);
                            textView2.setVisibility(0);
                        }
                        String str5 = cJPayResultGuideInfo.sub_title;
                        if (str5 != null && str5.length() > 0 && (textView = c135444cB5.LIZJ) != null) {
                            textView.setText(str5);
                            textView.setTextSize(2, 14.0f);
                            textView.setText(c135444cB5.LIZ(str5, 2131624851, false));
                            textView.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
    }

    private final void LIZ(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 12).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject);
        try {
            jSONObject.put("open_source", "支付后");
            jSONObject.put("result", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("error_code", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put(PushMessageHelper.ERROR_MESSAGE, str3);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_priority_method_result", jSONObject);
    }
}
