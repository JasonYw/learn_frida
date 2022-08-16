package com.android.ttcjpaysdk.thirdparty.counter.p166c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayCardProtocolBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayResultGuideInfo;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.data.C2343q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC135438cAz;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135269c8G;
import p003X.C135271c8I;
import p003X.C135421cAi;
import p003X.C135453cBE;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.c.k */
/* loaded from: classes17.dex */
public final class C2315k extends AbstractC135438cAz {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public HashMap LJIILL;

    static {
        Covode.recordClassIndex(8197);
    }

    @Override // p003X.AbstractC135438cAz
    public final String LIZLLL() {
        return "open";
    }

    @Override // p003X.AbstractC135438cAz
    public final void LJII() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (hashMap = this.LJIILL) != null) {
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
            LJIIIZ.LIZ();
        }
    }

    @Override // p003X.AbstractC135438cAz
    public final void LIZIZ(C2343q c2343q) {
        C135269c8G c135269c8G;
        if (PatchProxy.proxy(new Object[]{c2343q}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2343q);
        CJPayBasicUtils.displayToast(getActivity(), c2343q.nopwd_open_result, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR);
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
        CJPayBasicUtils.displayToast(getActivity(), c2343q.nopwd_open_result);
        this.LJIIL = false;
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
        C135271c8I c135271c8I = new C135271c8I(findViewById);
        c135271c8I.LJII = this.LJIILJJIL;
        return c135271c8I;
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
        int i;
        boolean z;
        String str;
        String string;
        boolean z2;
        float f;
        String string2;
        JSONObject jSONObject;
        String str2;
        ArrayList<CJPayCardProtocolBean> arrayList;
        CharSequence charSequence;
        String str3;
        if (!PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 1).isSupported && (c135269c8G = this.f17925LJ) != null) {
            if (!(c135269c8G instanceof C135271c8I)) {
                c135269c8G = null;
            }
            C135271c8I c135271c8I = (C135271c8I) c135269c8G;
            if (c135271c8I != null) {
                CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LJFF;
                boolean z3 = this.LIZJ;
                if (this.LIZIZ) {
                    i = 2131561824;
                } else {
                    i = 2131561985;
                }
                if (!PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, c135271c8I, C135271c8I.LIZ, false, 1).isSupported && cJPayCounterTradeQueryResponseBean != null) {
                    CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean = cJPayCounterTradeQueryResponseBean.nopwd_guide_info;
                    CJPayResultGuideInfo cJPayResultGuideInfo = cJPayCounterTradeQueryResponseBean.result_guide_info;
                    if (cJPayResultGuideInfo != null && !TextUtils.isEmpty(cJPayResultGuideInfo.title)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c135271c8I.LJIIJ = z;
                    if (!c135271c8I.LJIIJ && z3) {
                        CJPayBasicUtils.displayToast(c135271c8I.mContext, i);
                    }
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            str = cJPayResultGuideInfo.confirm_btn_desc;
                        }
                        str = null;
                    } else {
                        if (cJPayProtocolGroupContentsBean != null) {
                            str = cJPayProtocolGroupContentsBean.button_text;
                        }
                        str = null;
                    }
                    boolean z4 = !c135271c8I.LJIIJ;
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            string = cJPayResultGuideInfo.cancel_btn_desc;
                        } else {
                            string = null;
                        }
                    } else {
                        Context context = c135271c8I.mContext;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        string = context.getResources().getString(2131561834);
                    }
                    boolean z5 = c135271c8I.LJIIJ;
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            str3 = cJPayResultGuideInfo.cancel_btn_location;
                        } else {
                            str3 = null;
                        }
                        z2 = Intrinsics.areEqual(str3, "right");
                    } else {
                        z2 = true;
                    }
                    if (c135271c8I.LJIIJ) {
                        f = 24.0f;
                    } else {
                        f = 16.0f;
                    }
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            string2 = cJPayResultGuideInfo.header_desc;
                        } else {
                            string2 = null;
                        }
                    } else {
                        Context context2 = c135271c8I.mContext;
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        string2 = context2.getResources().getString(2131561842);
                    }
                    c135271c8I.LIZ(str, 2130840413, z4, string, z5, z2, 2131624854, f, string2, null, false);
                    c135271c8I.LIZIZ(c135271c8I.LJIIJ);
                    TextView textView = c135271c8I.LJIILJJIL;
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            jSONObject = cJPayResultGuideInfo.protocol_group_names;
                        }
                        jSONObject = null;
                    } else {
                        if (cJPayProtocolGroupContentsBean != null) {
                            jSONObject = cJPayProtocolGroupContentsBean.protocol_group_names;
                        }
                        jSONObject = null;
                    }
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            str2 = cJPayResultGuideInfo.guide_message;
                        }
                        str2 = null;
                    } else {
                        if (cJPayProtocolGroupContentsBean != null) {
                            str2 = cJPayProtocolGroupContentsBean.guide_message;
                        }
                        str2 = null;
                    }
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            arrayList = cJPayResultGuideInfo.protocol_list;
                        }
                        arrayList = null;
                    } else {
                        if (cJPayProtocolGroupContentsBean != null) {
                            arrayList = cJPayProtocolGroupContentsBean.protocol_list;
                        }
                        arrayList = null;
                    }
                    c135271c8I.LIZ(textView, jSONObject, str2, arrayList, 13.0f, new Rect(CJPayBasicUtils.dipToPX(c135271c8I.mContext, 16.0f), CJPayBasicUtils.dipToPX(c135271c8I.mContext, 16.0f), CJPayBasicUtils.dipToPX(c135271c8I.mContext, 16.0f), CJPayBasicUtils.dipToPX(c135271c8I.mContext, 16.0f)));
                    c135271c8I.LIZIZ.setVisibility(8);
                    if (c135271c8I.LJIIJ) {
                        if (cJPayResultGuideInfo != null) {
                            c135271c8I.LJIIL.setVisibility(8);
                            c135271c8I.f17918LJ.setText(cJPayResultGuideInfo.header_desc);
                            TextView textView2 = c135271c8I.LJIILIIL;
                            textView2.setText(cJPayResultGuideInfo.title);
                            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                            if (layoutParams != null) {
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                layoutParams2.topMargin = CJPayBasicUtils.dipToPX(textView2.getContext(), 40.0f);
                                textView2.setLayoutParams(layoutParams2);
                                TextView textView3 = c135271c8I.LIZJ;
                                textView3.setVisibility(0);
                                Context context3 = textView3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context3, "");
                                textView3.setTextColor(C116971W2r.LIZ(context3.getResources(), 2131624851));
                                String str4 = cJPayResultGuideInfo.sub_title;
                                Intrinsics.checkNotNullExpressionValue(str4, "");
                                textView3.setText(c135271c8I.LIZ(str4, 2131624865, false));
                                textView3.setTextSize(14.0f);
                                ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
                                if (layoutParams3 != null) {
                                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                                    layoutParams4.topMargin = CJPayBasicUtils.dipToPX(textView3.getContext(), 6.0f);
                                    textView3.setLayoutParams(layoutParams4);
                                    ImageView imageView = c135271c8I.LJIIIZ;
                                    imageView.setVisibility(0);
                                    ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                                    if (layoutParams5 != null) {
                                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                                        layoutParams6.height = (int) (CJPayBasicUtils.getScreenWidth(imageView.getContext()) * 0.48d);
                                        layoutParams6.width = -1;
                                        C2153b.LJI.LIZ().LIZ(cJPayResultGuideInfo.pic_url, new C135421cAi(cJPayResultGuideInfo, c135271c8I));
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        return;
                    }
                    TextView textView4 = c135271c8I.LJIILIIL;
                    if (cJPayProtocolGroupContentsBean != null) {
                        charSequence = cJPayProtocolGroupContentsBean.title;
                    } else {
                        charSequence = null;
                    }
                    textView4.setText(charSequence);
                }
            }
        }
    }
}
