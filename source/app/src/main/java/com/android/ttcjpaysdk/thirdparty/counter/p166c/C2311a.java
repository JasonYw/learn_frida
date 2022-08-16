package com.android.ttcjpaysdk.thirdparty.counter.p166c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.data.C2343q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC135438cAz;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135269c8G;
import p003X.C135377cA0;
import p003X.C135433cAu;
import p003X.C135453cBE;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.c.a */
/* loaded from: classes17.dex */
public final class C2311a extends AbstractC135438cAz {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(8145);
    }

    @Override // p003X.AbstractC135438cAz
    public final String LIZLLL() {
        return "promote_quota";
    }

    @Override // p003X.AbstractC135438cAz
    public final void LJII() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (hashMap = this.LIZIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractC135438cAz, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onDestroyView();
        LJII();
    }

    @Override // p003X.AbstractC135438cAz
    public final void LIZ() {
        C135453cBE LJIIIZ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (LJIIIZ = LJIIIZ()) != null) {
            LJIIIZ.LIZIZ();
        }
    }

    @Override // p003X.AbstractC135438cAz
    public final void LIZIZ(C2343q c2343q) {
        C135269c8G c135269c8G;
        if (PatchProxy.proxy(new Object[]{c2343q}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2343q);
        CJPayBasicUtils.displayToast(getActivity(), c2343q.nopwd_modify_result, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR);
        String str = c2343q.nopwd_button_text;
        if (str != null && str.length() != 0 && (c135269c8G = this.f17925LJ) != null) {
            String str2 = c2343q.nopwd_button_text;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            c135269c8G.LIZ(str2);
        }
    }

    @Override // p003X.AbstractC135438cAz
    public final void LIZJ(C2343q c2343q) {
        if (PatchProxy.proxy(new Object[]{c2343q}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2343q);
        this.LJIIL = false;
        CJPayBasicUtils.displayToast(getActivity(), c2343q.nopwd_modify_result);
        LIZ(2000L);
    }

    @Override // p003X.AbstractC135438cAz
    public final C135269c8G LIZLLL(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C135269c8G) proxy.result;
        }
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131186927);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        C135433cAu c135433cAu = new C135433cAu(findViewById);
        c135433cAu.LJII = this.LJIILJJIL;
        return c135433cAu;
    }

    @Override // p003X.AbstractC135438cAz, com.android.ttcjpaysdk.thirdparty.counter.a$d
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.LIZ(str, str2);
        this.LJIIL = false;
        LIZ(2000L);
    }

    @Override // p003X.AbstractC135438cAz, com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
        C135269c8G c135269c8G;
        CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean;
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 1).isSupported && (c135269c8G = this.f17925LJ) != null) {
            if (!(c135269c8G instanceof C135433cAu)) {
                c135269c8G = null;
            }
            C135433cAu c135433cAu = (C135433cAu) c135269c8G;
            if (c135433cAu != null) {
                CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LJFF;
                if (!PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, c135433cAu, C135433cAu.LIZ, false, 1).isSupported && cJPayCounterTradeQueryResponseBean != null && (cJPayProtocolGroupContentsBean = cJPayCounterTradeQueryResponseBean.nopwd_guide_info) != null) {
                    String str3 = cJPayProtocolGroupContentsBean.button_text;
                    Context context = c135433cAu.mContext;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    String string = context.getResources().getString(2131561834);
                    Context context2 = c135433cAu.mContext;
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    String string2 = context2.getResources().getString(2131561842);
                    Context context3 = c135433cAu.mContext;
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    c135433cAu.LIZ(str3, null, false, string, true, false, 2131624854, 16.0f, string2, context3.getResources().getString(2131561985), false);
                    c135433cAu.LIZIZ(false);
                    c135433cAu.LIZ(c135433cAu.LJIILJJIL, cJPayProtocolGroupContentsBean.protocol_group_names, cJPayProtocolGroupContentsBean.guide_message, cJPayProtocolGroupContentsBean.protocol_list, 12.0f, new Rect(CJPayBasicUtils.dipToPX(c135433cAu.mContext, 16.0f), CJPayBasicUtils.dipToPX(c135433cAu.mContext, 12.0f), CJPayBasicUtils.dipToPX(c135433cAu.mContext, 16.0f), CJPayBasicUtils.dipToPX(c135433cAu.mContext, 16.0f)));
                    c135433cAu.LIZIZ.setVisibility(8);
                    c135433cAu.LJIILIIL.setText(cJPayProtocolGroupContentsBean.title);
                    if (TextUtils.equals(cJPayProtocolGroupContentsBean.guide_style, "UpQuotaV2")) {
                        if (cJPayProtocolGroupContentsBean.sub_guide_desc.size() > 0 && (str2 = cJPayProtocolGroupContentsBean.sub_guide_desc.get(0).desc) != null && str2.length() != 0) {
                            c135433cAu.LIZJ.setTextSize(2, 14.0f);
                            TextView textView = c135433cAu.LIZJ;
                            Context context4 = c135433cAu.mContext;
                            Intrinsics.checkNotNullExpressionValue(context4, "");
                            textView.setTextColor(C116971W2r.LIZ(context4.getResources(), 2131624851));
                            TextView textView2 = c135433cAu.LIZJ;
                            String str4 = cJPayProtocolGroupContentsBean.sub_guide_desc.get(0).desc;
                            Intrinsics.checkNotNullExpressionValue(str4, "");
                            textView2.setText(c135433cAu.LIZ(str4, 2131624864, false));
                            c135433cAu.LIZJ.setVisibility(0);
                        }
                    } else if (cJPayProtocolGroupContentsBean.sub_guide_desc.size() <= 0 || (str = cJPayProtocolGroupContentsBean.sub_guide_desc.get(0).desc) == null || str.length() == 0) {
                    } else {
                        TextView textView3 = c135433cAu.LIZJ;
                        String str5 = cJPayProtocolGroupContentsBean.sub_guide_desc.get(0).desc;
                        Intrinsics.checkNotNullExpressionValue(str5, "");
                        textView3.setText(C135377cA0.LIZ((C135377cA0) c135433cAu, str5, 2131624854, false, 4, (Object) null));
                        c135433cAu.LIZJ.setVisibility(0);
                    }
                }
            }
        }
    }
}
