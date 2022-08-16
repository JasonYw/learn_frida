package com.bytedance.android.live.browser;

import com.bytedance.android.annie.param.C2613i;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostNetwork;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C101338PvY;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class AnnieParamUtil$appendAllFinalParams$4 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2613i $param;

    static {
        Covode.recordClassIndex(21868);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieParamUtil$appendAllFinalParams$4(C2613i c2613i) {
        super(0);
        this.$param = c2613i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        IHostNetwork iHostNetwork;
        Map<String, String> commonParams;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (iHostNetwork = (IHostNetwork) ServiceManager.getService(INetworkService.class)) != null && (commonParams = iHostNetwork.getCommonParams()) != null) {
            C101338PvY c101338PvY = C101338PvY.LIZIZ;
            C2613i c2613i = this.$param;
            if (!PatchProxy.proxy(new Object[]{c2613i, commonParams}, c101338PvY, C101338PvY.LIZ, false, 10).isSupported) {
                String str = commonParams.get("is_android_pad");
                if (str != null) {
                    if (!StringsKt__StringsJVMKt.isBlank(str)) {
                        c2613i.LJJIJIL = Integer.parseInt(str);
                    }
                    if (!PatchProxy.proxy(new Object[]{str}, c2613i, C2613i.LIZ, false, 48).isSupported) {
                        C106862S5w.LIZ(str);
                        c2613i.LJJLIIIJL = str;
                    }
                }
                String str2 = commonParams.get("device_type");
                if (str2 != null && !PatchProxy.proxy(new Object[]{str2}, c2613i, C2613i.LIZ, false, 29).isSupported) {
                    C106862S5w.LIZ(str2);
                    c2613i.LJJJJI = str2;
                }
                String str3 = commonParams.get("os_version");
                if (str3 != null && !PatchProxy.proxy(new Object[]{str3}, c2613i, C2613i.LIZ, false, 22).isSupported) {
                    C106862S5w.LIZ(str3);
                    c2613i.LJJIJLIJ = str3;
                }
                String str4 = commonParams.get("language");
                if (str4 != null && !PatchProxy.proxy(new Object[]{str4}, c2613i, C2613i.LIZ, false, 27).isSupported) {
                    C106862S5w.LIZ(str4);
                    c2613i.LJJJIL = str4;
                }
                String str5 = commonParams.get("openudid");
                if (str5 != null && !PatchProxy.proxy(new Object[]{str5}, c2613i, C2613i.LIZ, false, 20).isSupported) {
                    C106862S5w.LIZ(str5);
                    c2613i.LJIL = str5;
                }
                String str6 = commonParams.get("ac");
                if (str6 != null && !PatchProxy.proxy(new Object[]{str6}, c2613i, C2613i.LIZ, false, 23).isSupported) {
                    C106862S5w.LIZ(str6);
                    c2613i.LJJIL = str6;
                }
                String str7 = commonParams.get("current_network_quality_info");
                if (str7 != null && !PatchProxy.proxy(new Object[]{str7}, c2613i, C2613i.LIZ, false, 24).isSupported) {
                    C106862S5w.LIZ(str7);
                    c2613i.LJJIZ = str7;
                }
            }
            C2613i c2613i2 = this.$param;
            if (!PatchProxy.proxy(new Object[]{c2613i2, commonParams}, null, C101338PvY.LIZ, true, 12).isSupported) {
                String str8 = commonParams.get("device_brand");
                if (str8 != null && !PatchProxy.proxy(new Object[]{str8}, c2613i2, C2613i.LIZ, false, 30).isSupported) {
                    C106862S5w.LIZ(str8);
                    c2613i2.LJJJJJ = str8;
                }
                String str9 = commonParams.get("iid");
                if (str9 != null && !PatchProxy.proxy(new Object[]{str9}, c2613i2, C2613i.LIZ, false, 31).isSupported) {
                    C106862S5w.LIZ(str9);
                    c2613i2.LJJJJJL = str9;
                }
                String str10 = commonParams.get("minor_status");
                if (str10 != null && !PatchProxy.proxy(new Object[]{str10}, c2613i2, C2613i.LIZ, false, 32).isSupported) {
                    C106862S5w.LIZ(str10);
                    c2613i2.LJJJJL = str10;
                }
                String str11 = commonParams.get("os_api");
                if (str11 != null && !PatchProxy.proxy(new Object[]{str11}, c2613i2, C2613i.LIZ, false, 33).isSupported) {
                    C106862S5w.LIZ(str11);
                    c2613i2.LJJJJLI = str11;
                }
                String str12 = commonParams.get("fake_region");
                if (str12 != null && !PatchProxy.proxy(new Object[]{str12}, c2613i2, C2613i.LIZ, false, 34).isSupported) {
                    C106862S5w.LIZ(str12);
                    c2613i2.LJJJJLL = str12;
                }
                String str13 = commonParams.get("host_abi");
                if (str13 != null && !PatchProxy.proxy(new Object[]{str13}, c2613i2, C2613i.LIZ, false, 35).isSupported) {
                    C106862S5w.LIZ(str13);
                    c2613i2.LJJJJZ = str13;
                }
                String str14 = commonParams.get("cpu_support64");
                if (str14 != null && !PatchProxy.proxy(new Object[]{str14}, c2613i2, C2613i.LIZ, false, 36).isSupported) {
                    C106862S5w.LIZ(str14);
                    c2613i2.LJJJJZI = str14;
                }
                String str15 = commonParams.get("resolution");
                if (str15 != null && !PatchProxy.proxy(new Object[]{str15}, c2613i2, C2613i.LIZ, false, 37).isSupported) {
                    C106862S5w.LIZ(str15);
                    c2613i2.LJJJLIIL = str15;
                }
                String str16 = commonParams.get("ts");
                if (str16 != null && !PatchProxy.proxy(new Object[]{str16}, c2613i2, C2613i.LIZ, false, 38).isSupported) {
                    C106862S5w.LIZ(str16);
                    c2613i2.LJJJLL = str16;
                }
                String str17 = commonParams.get("manifest_version_code");
                if (str17 != null && !PatchProxy.proxy(new Object[]{str17}, c2613i2, C2613i.LIZ, false, 39).isSupported) {
                    C106862S5w.LIZ(str17);
                    c2613i2.LJJJLZIJ = str17;
                }
                String str18 = commonParams.get("oaid");
                if (str18 != null && !PatchProxy.proxy(new Object[]{str18}, c2613i2, C2613i.LIZ, false, 40).isSupported) {
                    C106862S5w.LIZ(str18);
                    c2613i2.LJJJZ = str18;
                }
                String str19 = commonParams.get("cdid");
                if (str19 != null && !PatchProxy.proxy(new Object[]{str19}, c2613i2, C2613i.LIZ, false, 41).isSupported) {
                    C106862S5w.LIZ(str19);
                    c2613i2.LJJL = str19;
                }
                String str20 = commonParams.get("app_type");
                if (str20 != null && !PatchProxy.proxy(new Object[]{str20}, c2613i2, C2613i.LIZ, false, 42).isSupported) {
                    C106862S5w.LIZ(str20);
                    c2613i2.LJJLI = str20;
                }
                String str21 = commonParams.get("dpi");
                if (str21 != null && !PatchProxy.proxy(new Object[]{str21}, c2613i2, C2613i.LIZ, false, 43).isSupported) {
                    C106862S5w.LIZ(str21);
                    c2613i2.LJJLIIIIJ = str21;
                }
                String str22 = commonParams.get("effect_channel");
                if (str22 != null && !PatchProxy.proxy(new Object[]{str22}, c2613i2, C2613i.LIZ, false, 44).isSupported) {
                    C106862S5w.LIZ(str22);
                    c2613i2.LJJLIIIJ = str22;
                }
                String str23 = commonParams.get("version_name");
                if (str23 != null && !PatchProxy.proxy(new Object[]{str23}, c2613i2, C2613i.LIZ, false, 45).isSupported) {
                    C106862S5w.LIZ(str23);
                    c2613i2.LJJLIIIJILLIZJL = str23;
                }
                String str24 = commonParams.get("address_book_access");
                if (str24 != null && !PatchProxy.proxy(new Object[]{str24}, c2613i2, C2613i.LIZ, false, 46).isSupported) {
                    C106862S5w.LIZ(str24);
                    c2613i2.LJJLIIIJJI = str24;
                }
                String str25 = commonParams.get("_rticket");
                if (str25 != null && !PatchProxy.proxy(new Object[]{str25}, c2613i2, C2613i.LIZ, false, 47).isSupported) {
                    C106862S5w.LIZ(str25);
                    c2613i2.LJJLIIIJJIZ = str25;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
