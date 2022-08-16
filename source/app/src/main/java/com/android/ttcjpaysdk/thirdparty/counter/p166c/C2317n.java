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
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayResultGuideInfo;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.a$e;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2325e;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135458cBJ;
import p003X.C135460cBL;
import p003X.C135461cBM;
import p003X.C135462cBN;
import p003X.C135463cBO;
import p003X.RunnableC135459cBK;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.c.n */
/* loaded from: classes17.dex */
public final class C2317n extends CJPayBaseFragment implements a$e {
    public static ChangeQuickRedirect LIZ;
    public C135460cBL LIZIZ;
    public CJPayCounterTradeQueryResponseBean LIZJ;
    public JSONObject LIZLLL;

    /* renamed from: LJ */
    public C135462cBN f25518LJ;
    public boolean LJFF = true;
    public final C135458cBJ LJIIJ = new C135458cBJ(this);
    public final C135463cBO LJIIJJI = new C135463cBO(this);
    public HashMap LJIIL;

    static {
        Covode.recordClassIndex(8206);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690640;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onDestroyView();
        EventManager.INSTANCE.unregister(this.LJIIJJI);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && (hashMap = this.LJIIL) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        C135460cBL c135460cBL;
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 3).isSupported && (c135460cBL = this.LIZIZ) != null) {
            c135460cBL.LJII = this.LJIIJ;
            c135460cBL.LIZ();
        }
    }

    public final void LIZ(long j) {
        C135460cBL c135460cBL;
        View view;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 10).isSupported && (c135460cBL = this.LIZIZ) != null && (view = c135460cBL.mRootView) != null) {
            view.postDelayed(new RunnableC135459cBK(this), j);
        }
    }

    private final JSONObject LIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            jSONObject.put("modify_source", "刷脸支付后");
            if (this.LIZLLL != null) {
                JSONObject jSONObject2 = this.LIZLLL;
                Intrinsics.checkNotNull(jSONObject2);
                Iterator<String> keys = jSONObject2.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject3 = this.LIZLLL;
                    Intrinsics.checkNotNull(jSONObject3);
                    jSONObject.put(next, jSONObject3.get(next));
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject);
        try {
            jSONObject.put("button_name", str);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_modify_password_new_click", jSONObject);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            C2118a.LIZ().LIZ("wallet_modify_password_guide_imp", jSONObject);
        }
        View findViewById = view.findViewById(2131169843);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = new C135460cBL(findViewById);
        EventManager.INSTANCE.register(this.LJIIJJI);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$e
    public final void LIZ(C2325e c2325e) {
        String str;
        if (PatchProxy.proxy(new Object[]{c2325e}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (c2325e != null && Intrinsics.areEqual("CD000000", c2325e.code)) {
            if (!PatchProxy.proxy(new Object[]{c2325e}, this, LIZ, false, 8).isSupported) {
                this.LJFF = false;
                if (c2325e.jump_url.length() > 0) {
                    String str2 = c2325e.jump_url;
                    C2118a LIZ2 = C2118a.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    if (LIZ2.f25443LJ != null) {
                        C2118a LIZ3 = C2118a.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                        LIZ3.f25443LJ.openScheme(getContext(), str2);
                        return;
                    }
                    C2118a LIZ4 = C2118a.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    if (LIZ4.LIZLLL == null) {
                        return;
                    }
                    C2118a LIZ5 = C2118a.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    LIZ5.LIZLLL.openScheme(str2);
                    return;
                }
                CJPayBasicUtils.displayToast(getActivity(), getString(2131561785));
                LIZ(2000L);
                return;
            }
            return;
        }
        String str3 = null;
        if (c2325e != null) {
            str = c2325e.code;
            str3 = c2325e.msg;
        } else {
            str = null;
        }
        LIZIZ(str, str3);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.counter.a$e
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
        this.LJFF = false;
        C135460cBL c135460cBL = this.LIZIZ;
        if (c135460cBL != null) {
            c135460cBL.LIZ(false);
        }
        CJPayBasicUtils.displayToast(getActivity(), getString(2131561785));
        LIZ(2000L);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        C135460cBL c135460cBL;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        boolean z2;
        String string;
        TextView textView;
        TextView textView2;
        if (!PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 2).isSupported && (c135460cBL = this.LIZIZ) != null) {
            CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LIZJ;
            if (!PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, c135460cBL, C135460cBL.LIZ, false, 1).isSupported && cJPayCounterTradeQueryResponseBean != null) {
                CJPayResultGuideInfo cJPayResultGuideInfo = cJPayCounterTradeQueryResponseBean.result_guide_info;
                ImageView imageView = c135460cBL.LJIIIZ;
                if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = (int) (CJPayBasicUtils.getScreenWidth(c135460cBL.mContext) * 0.48d);
                    layoutParams2.width = -1;
                    if (cJPayResultGuideInfo != null) {
                        String str = cJPayResultGuideInfo.confirm_btn_desc;
                        String str2 = cJPayResultGuideInfo.cancel_btn_desc;
                        if (str2 != null && str2.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        String str3 = cJPayResultGuideInfo.cancel_btn_desc;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = cJPayResultGuideInfo.cancel_btn_desc;
                        if (str4 != null && str4.length() != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        boolean z3 = !z2;
                        boolean areEqual = Intrinsics.areEqual(cJPayResultGuideInfo.cancel_btn_location, "right");
                        String str5 = cJPayResultGuideInfo.header_desc;
                        if (str5 != null && str5.length() != 0) {
                            string = cJPayResultGuideInfo.header_desc;
                        } else {
                            Context context = c135460cBL.mContext;
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            string = context.getResources().getString(2131561840);
                        }
                        c135460cBL.LIZ(str, 2130840413, z, str3, z3, areEqual, 2131624854, 20.0f, null, string, false);
                        Context context2 = c135460cBL.mContext;
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        Drawable drawable = context2.getResources().getDrawable(2130840244);
                        Intrinsics.checkNotNullExpressionValue(drawable, "");
                        c135460cBL.LIZ(drawable);
                        String str6 = cJPayResultGuideInfo.pic_url;
                        if (str6 != null && str6.length() > 0) {
                            C2153b.LJI.LIZ().LIZ(str6, new C135461cBM(c135460cBL));
                        }
                        String str7 = cJPayResultGuideInfo.title;
                        if (str7 != null && str7.length() > 0 && (textView2 = c135460cBL.LIZIZ) != null) {
                            textView2.setText(str7);
                            textView2.setTextSize(2, 22.0f);
                            textView2.setVisibility(0);
                        }
                        String str8 = cJPayResultGuideInfo.sub_title;
                        if (str8 != null && str8.length() > 0 && (textView = c135460cBL.LIZJ) != null) {
                            textView.setText(str8);
                            textView.setTextSize(2, 14.0f);
                            textView.setText(c135460cBL.LIZ(str8, 2131624851, false));
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
}
