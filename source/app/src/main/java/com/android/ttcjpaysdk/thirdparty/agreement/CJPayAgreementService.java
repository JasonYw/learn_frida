package com.android.ttcjpaysdk.thirdparty.agreement;

import android.content.Context;
import android.content.Intent;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayCardProtocolBean;
import com.android.ttcjpaysdk.base.service.ICJPayAgreementCallback;
import com.android.ttcjpaysdk.base.service.ICJPayAgreementService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.thirdparty.agreement.activity.CJPayAgreementActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p003X.C116971W2r;

/* loaded from: classes17.dex */
public class CJPayAgreementService implements ICJPayAgreementService {
    public static ChangeQuickRedirect LIZ;
    public static ICJPayAgreementCallback LIZIZ;

    static {
        Covode.recordClassIndex(7932);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.agreement";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayAgreementService
    @CJPayModuleEntryReport
    public void startCJPayAgreementActivity(Context context, ArrayList<JSONObject> arrayList, boolean z, ICJPayAgreementCallback iCJPayAgreementCallback) {
        int i;
        if (PatchProxy.proxy(new Object[]{context, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0), iCJPayAgreementCallback}, this, LIZ, false, 1).isSupported || context == null) {
            return;
        }
        LIZIZ = iCJPayAgreementCallback;
        if (arrayList.size() > 1) {
            i = 0;
        } else {
            i = 1;
        }
        startCJPayAgreementActivity(context, arrayList, i, z, iCJPayAgreementCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayAgreementService
    @CJPayModuleEntryReport
    public void startCJPayAgreementActivity(Context context, ArrayList<JSONObject> arrayList, int i, boolean z, ICJPayAgreementCallback iCJPayAgreementCallback) {
        Intent intent;
        if (PatchProxy.proxy(new Object[]{context, arrayList, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), iCJPayAgreementCallback}, this, LIZ, false, 2).isSupported || context == null) {
            return;
        }
        LIZIZ = iCJPayAgreementCallback;
        ArrayList arrayList2 = new ArrayList();
        Iterator<JSONObject> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(CJPayJsonParser.fromJson(it.next(), CJPayCardProtocolBean.class));
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), arrayList2, (byte) 0, (byte) 0, (byte) 1, (byte) 0, Byte.valueOf((byte) z)}, null, CJPayAgreementActivity.LIZ, true, 21);
        if (proxy.isSupported) {
            intent = (Intent) proxy.result;
        } else {
            intent = new Intent(context, CJPayAgreementActivity.class);
            intent.putExtra("CJPayKeyAgreementTypeParams", i);
            intent.putExtra("CJPayKeyAgreementDataParams", arrayList2);
            intent.putExtra("CJPayKeyShowNextBtnParams", false);
            intent.putExtra("CJPayKeyShowNextBtnInDetailPageParams", false);
            intent.putExtra("CJPayKeyShowWithAnimationParams", true);
            intent.putExtra("CJPayKeyAgreementIsOutsideEnableParams", false);
            intent.putExtra("CJPayKeyAgreementIsBackCloseParams", z);
        }
        C116971W2r.LIZ(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayAgreementService
    @CJPayModuleEntryReport
    public void startCJPayAgreementActivityWithHeight(Context context, ArrayList<JSONObject> arrayList, int i, boolean z, ICJPayAgreementCallback iCJPayAgreementCallback) {
        int i2;
        Intent intent;
        if (PatchProxy.proxy(new Object[]{context, arrayList, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), iCJPayAgreementCallback}, this, LIZ, false, 3).isSupported || context == null) {
            return;
        }
        LIZIZ = iCJPayAgreementCallback;
        if (arrayList.size() > 1) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<JSONObject> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(CJPayJsonParser.fromJson(it.next(), CJPayCardProtocolBean.class));
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i2), arrayList2, Integer.valueOf(i), (byte) 0, (byte) 0, (byte) 1, (byte) 0, Byte.valueOf((byte) z)}, null, CJPayAgreementActivity.LIZ, true, 22);
        if (proxy.isSupported) {
            intent = (Intent) proxy.result;
        } else {
            intent = new Intent(context, CJPayAgreementActivity.class);
            intent.putExtra("CJPayKeyAgreementTypeParams", i2);
            intent.putExtra("CJPayKeyAgreementDataParams", arrayList2);
            intent.putExtra("CJPayKeyAgreementHeight", i);
            intent.putExtra("CJPayKeyShowNextBtnParams", false);
            intent.putExtra("CJPayKeyShowNextBtnInDetailPageParams", false);
            intent.putExtra("CJPayKeyShowWithAnimationParams", true);
            intent.putExtra("CJPayKeyAgreementIsOutsideEnableParams", false);
            intent.putExtra("CJPayKeyAgreementIsBackCloseParams", z);
        }
        C116971W2r.LIZ(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayAgreementService
    @CJPayModuleEntryReport
    public void startCJPayAgreementActivityWithHeight(Context context, ArrayList<JSONObject> arrayList, int i, boolean z, boolean z2, ICJPayAgreementCallback iCJPayAgreementCallback) {
        int i2;
        Intent intent;
        if (PatchProxy.proxy(new Object[]{context, arrayList, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), iCJPayAgreementCallback}, this, LIZ, false, 4).isSupported || context == null) {
            return;
        }
        LIZIZ = iCJPayAgreementCallback;
        if (arrayList.size() > 1) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<JSONObject> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(CJPayJsonParser.fromJson(it.next(), CJPayCardProtocolBean.class));
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i2), arrayList2, Integer.valueOf(i), (byte) 0, (byte) 0, (byte) 1, (byte) 0, Byte.valueOf((byte) z2), Byte.valueOf((byte) z)}, null, CJPayAgreementActivity.LIZ, true, 23);
        if (proxy.isSupported) {
            intent = (Intent) proxy.result;
        } else {
            intent = new Intent(context, CJPayAgreementActivity.class);
            intent.putExtra("CJPayKeyAgreementTypeParams", i2);
            intent.putExtra("CJPayKeyAgreementDataParams", arrayList2);
            intent.putExtra("CJPayKeyAgreementHeight", i);
            intent.putExtra("CJPayKeyShowNextBtnParams", false);
            intent.putExtra("CJPayKeyShowNextBtnInDetailPageParams", false);
            intent.putExtra("CJPayKeyShowWithAnimationParams", true);
            intent.putExtra("CJPayKeyAgreementIsOutsideEnableParams", false);
            intent.putExtra("CJPayKeyAgreementIsBackCloseParams", z2);
            intent.putExtra("CJPayKeyAgreementIsShowBgMaskParams", z);
        }
        C116971W2r.LIZ(context, intent);
    }
}
