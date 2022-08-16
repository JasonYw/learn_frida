package com.android.ttcjpaysdk.bindcard.unionpay;

import android.app.Activity;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.service.ICJPayServiceCallBack;
import com.android.ttcjpaysdk.base.service.IUnionPayBindCardService;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p145b.C2252a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135692cF5;
import p003X.C135701cFE;
import p003X.C135704cFH;
import p003X.C135754cG5;
import p003X.C135876cI3;

/* loaded from: classes17.dex */
public final class UnionPayBindCardProvider implements IUnionPayBindCardService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7309);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.bindcard.unionpay";
    }

    @Override // com.android.ttcjpaysdk.base.service.IUnionPayBindCardService
    public final void startUnionPayBindCard(Activity activity, ICJPayServiceCallBack iCJPayServiceCallBack) {
        String str;
        if (PatchProxy.proxy(new Object[]{activity, iCJPayServiceCallBack}, this, LIZ, false, 1).isSupported) {
            return;
        }
        CJPayCardAddBean cJPayCardAddBean = C135876cI3.LIZJ;
        if (cJPayCardAddBean == null || (str = cJPayCardAddBean.union_pay_sign_info) == null) {
            str = "";
        }
        UnionPaySignInfo unionPaySignInfo = (UnionPaySignInfo) CJPayJsonParser.fromJson(str, UnionPaySignInfo.class);
        if (unionPaySignInfo == null) {
            return;
        }
        unionPaySignInfo.signOrderNo = C135876cI3.LJIIJJI();
        C135704cFH.LIZ(true);
        C2248a.LJFF.LIZ().LIZ(activity, unionPaySignInfo, 1006, iCJPayServiceCallBack);
    }

    @Override // com.android.ttcjpaysdk.base.service.IUnionPayBindCardService
    public final void handleUnionPayFaceCheck(Activity activity, JSONObject jSONObject, ICJPayServiceCallBack iCJPayServiceCallBack) {
        if (PatchProxy.proxy(new Object[]{activity, jSONObject, iCJPayServiceCallBack}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C2248a.LJFF.LIZ().LIZ(activity, (C135754cG5) CJPayJsonParser.fromJson(jSONObject, C135754cG5.class), iCJPayServiceCallBack);
    }

    @Override // com.android.ttcjpaysdk.base.service.IUnionPayBindCardService
    public final void createUnionPaySignOrder(Activity activity, boolean z, boolean z2, String str, String str2, ICJPayServiceCallBack iCJPayServiceCallBack) {
        String str3;
        if (PatchProxy.proxy(new Object[]{activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, str2, iCJPayServiceCallBack}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (activity == null) {
            return;
        }
        C135704cFH.LIZ(z2);
        Pair[] pairArr = new Pair[3];
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        pairArr[0] = TuplesKt.m137to("is_agreed_authoration", str3);
        pairArr[1] = TuplesKt.m137to("trade_scene", "pay");
        pairArr[2] = TuplesKt.m137to("out_trade_no", str);
        HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(pairArr);
        C2248a LIZ2 = C2248a.LJFF.LIZ();
        if (!PatchProxy.proxy(new Object[]{activity, hashMapOf, str2, iCJPayServiceCallBack}, LIZ2, C2248a.LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(activity, hashMapOf, str2);
            C135692cF5 LIZ3 = LIZ2.LIZ();
            if (LIZ3 != null && !PatchProxy.proxy(new Object[]{activity, hashMapOf, str2, iCJPayServiceCallBack}, LIZ3, C135692cF5.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(activity, hashMapOf, str2);
                C2208b c2208b = (C2208b) LIZ3.mModel;
                if (c2208b != null) {
                    C135701cFE c135701cFE = new C135701cFE(LIZ3, activity, str2, iCJPayServiceCallBack);
                    if (!PatchProxy.proxy(new Object[]{hashMapOf, c135701cFE}, c2208b, C2252a.LIZIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(hashMapOf, c135701cFE);
                        c2208b.LIZ(new JSONObject(hashMapOf), "bytepay.member_product.create_union_pay_sign_order", (String) null, (String) null, true, (AbstractC137673cl3) c135701cFE);
                    }
                }
            }
        }
    }
}
