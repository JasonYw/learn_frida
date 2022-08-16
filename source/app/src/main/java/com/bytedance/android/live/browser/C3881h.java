package com.bytedance.android.live.browser;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.container.fragment.C2606a;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.webview.C4056l;
import com.bytedance.android.live.browser.webview.C4057m;
import com.bytedance.android.live.browser.webview.fragment.AbstractC4054j;
import com.bytedance.android.live.browser.webview.fragment.LiveAnnieFragment;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6955ej;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveInitSettingKeys;
import com.bytedance.android.monitor.webview.AbstractC9751b;
import com.bytedance.android.monitorV2.webview.a$a;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC100890PoK;
import p003X.AbstractC90994Lt6;
import p003X.C100933Pp1;
import p003X.C100942PpA;
import p003X.C101018PqO;
import p003X.C101190PtA;
import p003X.C101256PuE;
import p003X.C101257PuF;
import p003X.C101279Pub;
import p003X.C101310Pv6;
import p003X.C101342Pvc;
import p003X.C106862S5w;
import p003X.C147910fQe;
import p003X.C147929fQx;
import p003X.C3JU;
import p003X.C3M9;
import p003X.P32;
import p003X.View$OnClickListenerC101282Pue;

/* renamed from: com.bytedance.android.live.browser.h */
/* loaded from: classes8.dex */
public final class C3881h implements AbstractC3884j {
    public static ChangeQuickRedirect LIZ;
    public AbstractC4051k LIZJ;
    public final Lazy LJFF;
    public final CopyOnWriteArrayList<DialogFragment> LIZLLL = new CopyOnWriteArrayList<>();

    /* renamed from: LJ */
    public final Map<String, AbstractC4054j> f26121LJ = new LinkedHashMap();
    public final TokenCert LIZIZ = TokenCert.Companion.with("bpea-live_webService_request_calendar_permission");

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(22011);
        } else {
            Covode.recordClassIndex(22011);
        }
    }

    public final C4056l LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C4056l) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    /* renamed from: LJ */
    public final C2606a mo15830LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (C2606a) proxy.result;
        }
        return new LiveAnnieFragment();
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        Iterator<DialogFragment> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().dismissAllowingStateLoss();
        }
        this.LIZLLL.clear();
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        C6955ej _livw_webview_monitor_config = LiveInitSettingKeys.get_LIVW_WEBVIEW_MONITOR_CONFIG();
        a$a LIZIZ = C147929fQx.LIZIZ.LIZJ().LIZIZ();
        LIZIZ.LIZ("webcast_cn_container");
        LIZIZ.LIZ(C101256PuE.LIZIZ);
        LIZIZ.LIZ(_livw_webview_monitor_config.LIZ);
        LIZIZ.f28249LJ = LiveInitSettingKeys.get_WEBVIEW_MONITOR_SLARDAR_SWITCH_SET();
        C147929fQx.LIZIZ.LIZJ().LIZ(LIZIZ);
    }

    public C3881h() {
        C100942PpA.LIZ().LIZ().LIZ(this);
        AbstractC4051k abstractC4051k = this.LIZJ;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4051k.LIZ(C101018PqO.LIZIZ).subscribe();
        AbstractC4051k abstractC4051k2 = this.LIZJ;
        if (abstractC4051k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4051k2.LIZ(C101190PtA.LIZIZ).subscribe();
        this.LJFF = LazyKt__LazyJVMKt.lazy(H5Service$webViewConfig$2.INSTANCE);
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        C6955ej _livw_webview_monitor_config = LiveInitSettingKeys.get_LIVW_WEBVIEW_MONITOR_CONFIG();
        AbstractC9751b.C9752a LIZ2 = C147929fQx.LIZIZ.LIZJ().LIZ().LIZ(C101257PuF.LIZIZ);
        LIZ2.LIZ(_livw_webview_monitor_config.LIZ);
        LIZ2.LIZIZ(LiveInitSettingKeys.get_WEBVIEW_MONITOR_SLARDAR_SWITCH_SET());
        LIZ2.LIZ(C147910fQe.LIZ());
        LIZ2.LJIJJ = _livw_webview_monitor_config.LJFF;
        LIZ2.LIZLLL(_livw_webview_monitor_config.LIZLLL);
        LIZ2.m15218LJ(_livw_webview_monitor_config.LJIIIZ);
        C147929fQx.LIZIZ.LIZJ().LIZ(LIZ2);
    }

    public final void LIZIZ(AbstractC4054j abstractC4054j) {
        if (PatchProxy.proxy(new Object[]{abstractC4054j}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4054j);
        this.LIZLLL.remove(abstractC4054j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.P32] */
    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final P32 LIZ(Bundle bundle) {
        View$OnClickListenerC101282Pue view$OnClickListenerC101282Pue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (P32) proxy.result;
        }
        C106862S5w.LIZ(bundle);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{bundle}, null, View$OnClickListenerC101282Pue.LJIL, true, 1);
        if (proxy2.isSupported) {
            view$OnClickListenerC101282Pue = (P32) proxy2.result;
        } else {
            View$OnClickListenerC101282Pue view$OnClickListenerC101282Pue2 = new View$OnClickListenerC101282Pue();
            view$OnClickListenerC101282Pue2.setArguments(bundle);
            view$OnClickListenerC101282Pue = view$OnClickListenerC101282Pue2;
        }
        Intrinsics.checkNotNullExpressionValue(view$OnClickListenerC101282Pue, "");
        return view$OnClickListenerC101282Pue;
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        SettingKey<C4057m> settingKey = AbstractC90994Lt6.LIZLLL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        return settingKey.getValue().LIZ(str);
    }

    public final void LIZJ(AbstractC4054j abstractC4054j) {
        if (PatchProxy.proxy(new Object[]{abstractC4054j}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4054j);
        SettingKey<Integer> settingKey = LiveConfigSettingKeys.HYBRID_DEBOUNCE_SWITCH;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        if (value != null && value.intValue() == 1) {
            for (Map.Entry<String, AbstractC4054j> entry : this.f26121LJ.entrySet()) {
                if (Intrinsics.areEqual(entry.getValue(), abstractC4054j)) {
                    this.f26121LJ.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        String LIZIZ = C101310Pv6.LIZIZ(str);
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        return LIZIZ;
    }

    public final void LIZ(AbstractC4054j abstractC4054j) {
        if (PatchProxy.proxy(new Object[]{abstractC4054j}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4054j);
        this.LIZLLL.add(abstractC4054j);
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final AbstractC100890PoK LIZ(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (AbstractC100890PoK) proxy.result;
        }
        C106862S5w.LIZ(context, str);
        return new C100933Pp1(context, str);
    }

    public final void LIZ(String str, AbstractC4054j abstractC4054j) {
        AbstractC4054j put;
        if (PatchProxy.proxy(new Object[]{str, abstractC4054j}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC4054j);
        SettingKey<Integer> settingKey = LiveConfigSettingKeys.HYBRID_DEBOUNCE_SWITCH;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        if (value != null && value.intValue() == 1 && (put = this.f26121LJ.put(str, abstractC4054j)) != null) {
            put.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final AbstractC13049f.AbstractC13051b LIZ(Context context, PublishSubject<Pair<Integer, int[]>> publishSubject, Fragment fragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, publishSubject, fragment}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (AbstractC13049f.AbstractC13051b) proxy.result;
        }
        C106862S5w.LIZ(context, publishSubject, fragment);
        return new C101342Pvc(this, context, publishSubject, fragment);
    }

    @Override // com.bytedance.android.live.browser.AbstractC3884j
    public final C3JU LIZ(Activity activity, IBrowserService.AbstractC3873d abstractC3873d, C3M9 c3m9, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, abstractC3873d, c3m9, str}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (C3JU) proxy.result;
        }
        C106862S5w.LIZ(activity, str);
        return new C101279Pub(activity, abstractC3873d, c3m9, str);
    }
}
