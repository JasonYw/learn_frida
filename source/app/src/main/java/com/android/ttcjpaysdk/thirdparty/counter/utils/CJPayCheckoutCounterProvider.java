package com.android.ttcjpaysdk.thirdparty.counter.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.service.ICJPayCounterService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.counter.data.FastPayGuideInfo;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2311a;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2312d;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2314h;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2315k;
import com.android.ttcjpaysdk.thirdparty.counter.p166c.C2317n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import p003X.AbstractC136945cZI;
import p003X.AbstractC136946cZJ;
import p003X.AbstractC136947cZK;
import p003X.AbstractC136948cZL;
import p003X.AbstractC136951cZO;
import p003X.C116971W2r;
import p003X.C136058cKz;
import p003X.C136373cQ4;
import p003X.C136458cRR;
import p003X.C136759cWI;
import p003X.C136810cX7;
import p003X.C136818cXF;

/* loaded from: classes17.dex */
public class CJPayCheckoutCounterProvider implements ICJPayCounterService {
    public static ChangeQuickRedirect LIZ;
    public ICJPayCounterService.ICJPayCompleteCallBack LIZIZ;
    public CJPayCounterTradeQueryResponseBean LIZJ;
    public C2312d LIZLLL;

    /* renamed from: LJ */
    public C2314h f25520LJ;
    public C2315k LJFF;
    public C2311a LJI;
    public C2317n LJII;
    public String LJIIIIZZ;

    static {
        Covode.recordClassIndex(8299);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.counter";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public int getCompleteRemainTime() {
        if (CJPayCheckoutCounterActivity.LJIIIZ != null) {
            return CJPayCheckoutCounterActivity.LJIIIZ.result_page_show_conf.remain_time;
        }
        return 0;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public int getCompleteShowStyle() {
        if (CJPayCheckoutCounterActivity.LJIIIZ != null) {
            return CJPayCheckoutCounterActivity.LJIIIZ.result_page_show_conf.show_style;
        }
        return 0;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public String getSource() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C136458cRR.LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public void release() {
        this.LIZLLL = null;
        this.f25520LJ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        C2312d.f25514LJ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public boolean isAmountUpgradeGuideFragment(Fragment fragment) {
        return fragment instanceof C2311a;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public boolean isFingerprintGuideFragment(Fragment fragment) {
        return fragment instanceof C2314h;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public boolean isPasswordFreeGuideFragment(Fragment fragment) {
        return fragment instanceof C2315k;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public boolean isResetPwdGuideFragment(Fragment fragment) {
        return fragment instanceof C2317n;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public void setCompleteCallBack(ICJPayCounterService.ICJPayCompleteCallBack iCJPayCompleteCallBack) {
        this.LIZIZ = iCJPayCompleteCallBack;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public void bindTradeQueryData(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C2312d.f25514LJ = (CJPayCounterTradeQueryResponseBean) CJPayJsonParser.fromJson(jSONObject, CJPayCounterTradeQueryResponseBean.class);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public Fragment getAmountUpgradeGuideFragment(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        this.LJI = new C2311a();
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LIZJ;
        if (cJPayCounterTradeQueryResponseBean != null) {
            this.LJI.LIZ(cJPayCounterTradeQueryResponseBean);
            this.LJI.LJIIJJI = jSONObject;
        }
        return this.LJI;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public Fragment getPasswordFreeGuideFragment(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        this.LJFF = new C2315k();
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LIZJ;
        if (cJPayCounterTradeQueryResponseBean != null) {
            this.LJFF.LIZ(cJPayCounterTradeQueryResponseBean);
        }
        C2315k c2315k = this.LJFF;
        c2315k.LJIIJJI = jSONObject;
        return c2315k;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public Fragment getResetPwdGuideFragment(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        this.LJII = new C2317n();
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LIZJ;
        if (cJPayCounterTradeQueryResponseBean != null) {
            C2317n c2317n = this.LJII;
            c2317n.LIZJ = cJPayCounterTradeQueryResponseBean;
            c2317n.LIZLLL = jSONObject;
        }
        return this.LJII;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public void notifyUnionPassEnd(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3).isSupported) {
            return;
        }
        Intent intent = new Intent(context, CJPayCheckoutCounterActivity.class);
        intent.putExtra("param_checkout_counter_union_pass", true);
        C116971W2r.LIZ(context, intent);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public void setSharedParams(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 5).isSupported || map == null) {
            return;
        }
        this.LJIIIIZZ = map.get("pwd");
        C2312d c2312d = this.LIZLLL;
        if (c2312d != null) {
            c2312d.LIZ(map);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    @CJPayModuleEntryReport
    public Fragment getCompleteFragment(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        this.LIZLLL = new C2312d();
        this.LIZLLL.LIZIZ = new AbstractC136946cZJ() { // from class: com.android.ttcjpaysdk.thirdparty.counter.utils.CJPayCheckoutCounterProvider.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8300);
            }

            @Override // p003X.AbstractC136946cZJ
            public final void LIZ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
                if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                CJPayCheckoutCounterProvider cJPayCheckoutCounterProvider = CJPayCheckoutCounterProvider.this;
                cJPayCheckoutCounterProvider.LIZJ = cJPayCounterTradeQueryResponseBean;
                if (cJPayCheckoutCounterProvider.LIZIZ != null) {
                    CJPayCheckoutCounterProvider.this.LIZIZ.showFingerprintGuide();
                }
            }
        };
        this.LIZLLL.LIZJ = new AbstractC136947cZK() { // from class: com.android.ttcjpaysdk.thirdparty.counter.utils.CJPayCheckoutCounterProvider.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8301);
            }

            @Override // p003X.AbstractC136947cZK
            public final void LIZ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
                if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                CJPayCheckoutCounterProvider cJPayCheckoutCounterProvider = CJPayCheckoutCounterProvider.this;
                cJPayCheckoutCounterProvider.LIZJ = cJPayCounterTradeQueryResponseBean;
                if (cJPayCheckoutCounterProvider.LIZIZ != null) {
                    CJPayCheckoutCounterProvider.this.LIZIZ.showPasswordFreeGuide();
                }
            }
        };
        new AbstractC136947cZK() { // from class: com.android.ttcjpaysdk.thirdparty.counter.utils.CJPayCheckoutCounterProvider.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8302);
            }

            @Override // p003X.AbstractC136947cZK
            public final void LIZ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
                if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                CJPayCheckoutCounterProvider cJPayCheckoutCounterProvider = CJPayCheckoutCounterProvider.this;
                cJPayCheckoutCounterProvider.LIZJ = cJPayCounterTradeQueryResponseBean;
                if (cJPayCheckoutCounterProvider.LIZIZ != null) {
                    CJPayCheckoutCounterProvider.this.LIZIZ.showAmountUpgradeGuide();
                }
            }
        };
        this.LIZLLL.LJIILIIL = new AbstractC136945cZI() { // from class: com.android.ttcjpaysdk.thirdparty.counter.utils.CJPayCheckoutCounterProvider.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8303);
            }

            @Override // p003X.AbstractC136945cZI
            public final void LIZ(FastPayGuideInfo fastPayGuideInfo) {
                if (!PatchProxy.proxy(new Object[]{fastPayGuideInfo}, this, LIZ, false, 1).isSupported && CJPayCheckoutCounterProvider.this.LIZIZ != null) {
                    CJPayCheckoutCounterProvider.this.LIZIZ.showFastPayMoreFragment(fastPayGuideInfo);
                }
            }
        };
        this.LIZLLL.LIZLLL = new AbstractC136948cZL() { // from class: com.android.ttcjpaysdk.thirdparty.counter.utils.CJPayCheckoutCounterProvider.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8304);
            }

            @Override // p003X.AbstractC136948cZL
            public final void LIZ(CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
                if (PatchProxy.proxy(new Object[]{cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                CJPayCheckoutCounterProvider cJPayCheckoutCounterProvider = CJPayCheckoutCounterProvider.this;
                cJPayCheckoutCounterProvider.LIZJ = cJPayCounterTradeQueryResponseBean;
                if (cJPayCheckoutCounterProvider.LIZIZ != null) {
                    CJPayCheckoutCounterProvider.this.LIZIZ.showResetPwdGuide();
                }
            }
        };
        this.LIZLLL.LJIIL = new AbstractC136951cZO() { // from class: com.android.ttcjpaysdk.thirdparty.counter.utils.CJPayCheckoutCounterProvider.6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8305);
            }

            @Override // p003X.AbstractC136951cZO
            public final String LIZ() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                if (CJPayCheckoutCounterProvider.this.LIZIZ != null) {
                    return CJPayCheckoutCounterProvider.this.LIZIZ.getCheckList();
                }
                return "";
            }
        };
        C2312d c2312d = this.LIZLLL;
        c2312d.LJFF = jSONObject;
        return c2312d;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    @CJPayModuleEntryReport
    public Fragment getFingerprintGuideFragment(JSONObject jSONObject) {
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        this.f25520LJ = new C2314h();
        this.f25520LJ.LIZIZ(this.LJIIIIZZ);
        if (this.f25520LJ != null && (cJPayCounterTradeQueryResponseBean = this.LIZJ) != null && ((cJPayCounterTradeQueryResponseBean.result_guide_info != null && "bio_guide".equals(this.LIZJ.result_guide_info.guide_type)) || (this.LIZJ.bio_open_guide != null && this.LIZJ.bio_open_guide.show_guide))) {
            this.f25520LJ.LIZ(new C136810cX7(this.LIZJ).LIZ, this.LIZJ);
        }
        C2314h c2314h = this.f25520LJ;
        c2314h.LJFF = jSONObject;
        return c2314h;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public void notifyCheckoutCounterResult(Context context, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{context, bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        Intent intent = new Intent(context, CJPayCheckoutCounterActivity.class);
        intent.putExtra("param_checkout_counter_bind_card", bundle);
        C116971W2r.LIZ(context, intent);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public void setCheckoutResponseBean(JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, jSONObject2}, this, LIZ, false, 13).isSupported) {
            return;
        }
        CJPayCheckoutCounterActivity.LJIIJ = CJPayHostInfo.LIZ(jSONObject2);
        CJPayCheckoutCounterActivity.LJIIIZ = (C136373cQ4) CJPayJsonParser.fromJson(jSONObject, C136373cQ4.class);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    @CJPayModuleEntryReport
    public void startCJPayCheckoutCounterActivity(Context context, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject}, this, LIZ, false, 1).isSupported) {
            return;
        }
        CJPayCheckoutCounterActivity.LJIIJ = CJPayHostInfo.LIZ(jSONObject);
        C116971W2r.LIZ(context, new Intent(context, CJPayCheckoutCounterActivity.class));
        if (context instanceof Activity) {
            C136058cKz.LIZIZ((Activity) context);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    public Fragment getFastPayGuideMoreFragment(JSONObject jSONObject, Serializable serializable) {
        C136759cWI c136759cWI;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, serializable}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{serializable}, null, C136759cWI.LIZ, true, 1);
        if (proxy2.isSupported) {
            c136759cWI = (C136759cWI) proxy2.result;
        } else {
            Bundle bundle = new Bundle();
            c136759cWI = new C136759cWI();
            bundle.putSerializable("guideInfo", serializable);
            c136759cWI.setArguments(bundle);
        }
        c136759cWI.LJIIJJI = jSONObject;
        return c136759cWI;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCounterService
    @CJPayModuleEntryReport
    public Fragment getFingerprintGuideFragment(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, str, jSONObject2}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        C2314h c2314h = new C2314h();
        c2314h.LIZIZ(str);
        if (CJPayJsonParser.fromJson(jSONObject2, C136818cXF.class) != null) {
            c2314h.LIZ(new C136810cX7(this.LIZJ).LIZ, (CJPayCounterTradeQueryResponseBean) null);
        }
        c2314h.LJFF = jSONObject;
        return c2314h;
    }
}
