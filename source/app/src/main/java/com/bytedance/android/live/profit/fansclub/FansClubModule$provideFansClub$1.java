package com.bytedance.android.live.profit.fansclub;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.bytedance.android.annie.api.AnnieHelper;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.profit.fansclub.AbstractC5268p;
import com.bytedance.android.live.profit.fansclub.AbstractC5272q;
import com.bytedance.android.live.profit.fansclub.FansClubEntranceParams;
import com.bytedance.android.live.profit.fansclub.panel.AbstractC5270g;
import com.bytedance.android.live.profit.fansclub.panel.C5269c;
import com.bytedance.android.live.profit.fansclub.panel.FansClubPanelTypes;
import com.bytedance.android.live.profit.fansclub.panel.p412a.a$b;
import com.bytedance.android.live.profit.fansclub.widget.C5276b;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.C5927dv;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.android.livesdkapi.depend.model.live.abs.AbstractC9489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.json.JSONObject;
import p003X.AbstractC134584bxD;
import p003X.AbstractC412992Wf;
import p003X.AbstractC458264Ai;
import p003X.C106862S5w;
import p003X.C4306532d;
import p003X.C458214Ad;
import p003X.C458274Aj;
import p003X.C458284Ak;
import p003X.C458314An;
import p003X.C458354Ar;
import p003X.C4AX;
import p003X.C4AY;

/* loaded from: classes12.dex */
public final class FansClubModule$provideFansClub$1 extends Lambda implements Function0<AbstractC5267o> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DataCenter $dataCenter;
    public final /* synthetic */ C5923dp $roomContext;
    public final /* synthetic */ AbstractC134584bxD $roomData;
    public final /* synthetic */ C5263h this$0;

    static {
        Covode.recordClassIndex(33265);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubModule$provideFansClub$1(C5263h c5263h, AbstractC134584bxD abstractC134584bxD, C5923dp c5923dp, Context context, DataCenter dataCenter) {
        super(0);
        this.this$0 = c5263h;
        this.$roomData = abstractC134584bxD;
        this.$roomContext = c5923dp;
        this.$context = context;
        this.$dataCenter = dataCenter;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, com.bytedance.android.live.profit.fansclub.o] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC5267o mo30099invoke() {
        Object LIZ;
        Map linkedHashMap;
        Map<String, String> LJFF;
        String jSONObject;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C458314An c458314An = new C458314An();
        final C458354Ar c458354Ar = new C458354Ar(this.$roomData);
        C5257d c5257d = new C5257d(this.$roomContext, c458354Ar);
        final C458284Ak c458284Ak = new C458284Ak(this.$roomContext, c458354Ar, this.$context);
        C458214Ad c458214Ad = new C458214Ad(c458284Ak);
        C5276b c5276b = new C5276b(this.$roomContext.LJJIJL());
        c458314An.LJIILIIL().LIZIZ(c458354Ar);
        c458314An.LJIILJJIL().LIZIZ(c5257d);
        c458314An.LJIILL().LIZIZ(c458214Ad);
        c458314An.LJIILLIIL().LIZIZ(c5276b);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c458314An, C458314An.LIZ, false, 22);
        if (proxy2.isSupported) {
            LIZ = proxy2.result;
        } else {
            LIZ = c458314An.LIZLLL.LIZ(c458314An, C458314An.LIZIZ[12]);
        }
        ((AbstractC412992Wf) LIZ).LIZIZ(c458284Ak);
        final Context context = this.$context;
        if (!PatchProxy.proxy(new Object[]{context, c458214Ad}, null, C458274Aj.LIZ, true, 1).isSupported) {
            C106862S5w.LIZ(context, c458214Ad);
            c458214Ad.LIZ(new AbstractC458264Ai<a$b>(context) { // from class: X.4AZ
                public static ChangeQuickRedirect LIZ;
                public final Context LIZIZ;

                static {
                    Covode.recordClassIndex(33305);
                }

                {
                    C106862S5w.LIZ(context);
                    this.LIZIZ = context;
                }

                @Override // p003X.AbstractC458264Ai
                public final boolean LIZ(int i, FansClubEntranceParams fansClubEntranceParams) {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams}, this, LIZ, false, 1);
                    if (proxy3.isSupported) {
                        return ((Boolean) proxy3.result).booleanValue();
                    }
                    C106862S5w.LIZ(fansClubEntranceParams);
                    if (i != FansClubPanelTypes.Lynx.ordinal() && i != FansClubPanelTypes.Web.ordinal()) {
                        return false;
                    }
                    return true;
                }

                @Override // p003X.AbstractC458264Ai
                public final /* synthetic */ a$b LIZIZ(int i, FansClubEntranceParams fansClubEntranceParams) {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams}, this, LIZ, false, 2);
                    if (proxy3.isSupported) {
                        return (a$b) proxy3.result;
                    }
                    C106862S5w.LIZ(fansClubEntranceParams);
                    return new a$b();
                }

                @Override // p003X.AbstractC458264Ai
                public final /* synthetic */ AbstractC5268p LIZ(int i, FansClubEntranceParams fansClubEntranceParams, a$b a_b) {
                    a$b a_b2 = a_b;
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams, a_b2}, this, LIZ, false, 3);
                    if (proxy3.isSupported) {
                        return (AbstractC5268p) proxy3.result;
                    }
                    C106862S5w.LIZ(fansClubEntranceParams, a_b2);
                    if (i == FansClubPanelTypes.Lynx.ordinal()) {
                        return new AbstractC5268p(this.LIZIZ, a_b2.LIZIZ.LIZ()) { // from class: X.3Fg
                            public static ChangeQuickRedirect LIZ;
                            public final Context LIZIZ;
                            public final Uri LIZJ;

                            static {
                                Covode.recordClassIndex(33306);
                            }

                            @Override // com.bytedance.android.live.profit.fansclub.AbstractC5268p
                            public final void LIZ() {
                                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !PatchProxy.proxy(new Object[]{this, null, 1, null}, null, C434053Ff.LIZ, true, 1).isSupported) {
                                    LIZ(null);
                                }
                            }

                            @Override // com.bytedance.android.live.profit.fansclub.AbstractC5268p
                            public final void LIZ(Function1<? super Uri, ? extends Uri> function1) {
                                Uri uri;
                                Uri uri2;
                                if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 2).isSupported) {
                                    return;
                                }
                                if (!this.LIZJ.getQueryParameterNames().contains(C109391T5d.LJFF)) {
                                    uri = this.LIZJ.buildUpon().appendQueryParameter(C109391T5d.LJFF, "500").build();
                                    Intrinsics.checkNotNullExpressionValue(uri, "");
                                } else {
                                    uri = this.LIZJ;
                                }
                                if (function1 == null || (uri2 = function1.invoke(uri)) == null) {
                                    uri2 = uri;
                                }
                                ((IBrowserService) ServiceManager.getService(IBrowserService.class)).showHybridDialog(this.LIZIZ, uri2, null);
                            }

                            {
                                C106862S5w.LIZ(r1, r2);
                                this.LIZIZ = r1;
                                this.LIZJ = r2;
                            }
                        };
                    }
                    if (i == FansClubPanelTypes.Web.ordinal()) {
                        Context context2 = this.LIZIZ;
                        Uri build = AnnieHelper.createH5SchemeByUrl(a_b2.LIZJ.toString()).buildUpon().appendQueryParameter("type", "popup").appendQueryParameter("gravity", "bottom").build();
                        Intrinsics.checkNotNullExpressionValue(build, "");
                        return new AbstractC5268p(context2, build) { // from class: X.3Fg
                            public static ChangeQuickRedirect LIZ;
                            public final Context LIZIZ;
                            public final Uri LIZJ;

                            static {
                                Covode.recordClassIndex(33306);
                            }

                            @Override // com.bytedance.android.live.profit.fansclub.AbstractC5268p
                            public final void LIZ() {
                                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !PatchProxy.proxy(new Object[]{this, null, 1, null}, null, C434053Ff.LIZ, true, 1).isSupported) {
                                    LIZ(null);
                                }
                            }

                            @Override // com.bytedance.android.live.profit.fansclub.AbstractC5268p
                            public final void LIZ(Function1<? super Uri, ? extends Uri> function1) {
                                Uri uri;
                                Uri uri2;
                                if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 2).isSupported) {
                                    return;
                                }
                                if (!this.LIZJ.getQueryParameterNames().contains(C109391T5d.LJFF)) {
                                    uri = this.LIZJ.buildUpon().appendQueryParameter(C109391T5d.LJFF, "500").build();
                                    Intrinsics.checkNotNullExpressionValue(uri, "");
                                } else {
                                    uri = this.LIZJ;
                                }
                                if (function1 == null || (uri2 = function1.invoke(uri)) == null) {
                                    uri2 = uri;
                                }
                                ((IBrowserService) ServiceManager.getService(IBrowserService.class)).showHybridDialog(this.LIZIZ, uri2, null);
                            }

                            {
                                C106862S5w.LIZ(context2, build);
                                this.LIZIZ = context2;
                                this.LIZJ = build;
                            }
                        };
                    }
                    return null;
                }
            });
        }
        final C5923dp c5923dp = this.$roomContext;
        final Context context2 = this.$context;
        C5263h c5263h = this.this$0;
        DataCenter dataCenter = this.$dataCenter;
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{dataCenter}, c5263h, C5263h.LIZ, false, 3);
        if (proxy3.isSupported) {
            linkedHashMap = (Map) proxy3.result;
        } else {
            linkedHashMap = new LinkedHashMap();
            if (!C4306532d.LIZLLL(dataCenter) && !C4306532d.LIZIZ(dataCenter)) {
                jSONObject = "";
            } else {
                if (C4306532d.LIZIZ(dataCenter)) {
                    LJFF = C4306532d.LIZJ(dataCenter);
                    Intrinsics.checkNotNullExpressionValue(LJFF, "");
                } else {
                    LJFF = C4306532d.LJFF(dataCenter);
                    Intrinsics.checkNotNullExpressionValue(LJFF, "");
                }
                jSONObject = new JSONObject(LJFF).toString();
            }
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            linkedHashMap.put("live_ad", jSONObject);
        }
        AbstractC9489d LIZ2 = this.this$0.LIZ(this.$dataCenter);
        if (!PatchProxy.proxy(new Object[]{c458214Ad, c458354Ar, c458284Ak, c5923dp, context2, linkedHashMap, LIZ2}, null, C458274Aj.LIZ, true, 2).isSupported) {
            C106862S5w.LIZ(c458214Ad, c458354Ar, c458284Ak, c5923dp, context2, linkedHashMap);
            c458214Ad.LIZ(new AbstractC5270g(c458354Ar, c458284Ak) { // from class: X.4Ae
                public static ChangeQuickRedirect LIZ;
                public final AbstractC5272q LIZIZ;
                public final C458284Ak LIZJ;

                static {
                    Covode.recordClassIndex(33316);
                }

                {
                    C106862S5w.LIZ(c458354Ar, c458284Ak);
                    this.LIZIZ = c458354Ar;
                    this.LIZJ = c458284Ak;
                }

                @Override // com.bytedance.android.live.profit.fansclub.panel.AbstractC5270g
                public final <P extends C5269c> void LIZ(int i, FansClubEntranceParams fansClubEntranceParams, P p) {
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams, p}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(fansClubEntranceParams, p);
                    if (fansClubEntranceParams.LIZ == FansClubEntranceParams.Page.Default && (p instanceof a$b)) {
                        a$b a_b = (a$b) p;
                        Uri parse = Uri.parse(this.LIZIZ.LIZ().LIZ());
                        Intrinsics.checkNotNullExpressionValue(parse, "");
                        a_b.LIZIZ(new C9303cy(parse));
                        Uri LIZ3 = this.LIZJ.LIZ(fansClubEntranceParams.LIZ);
                        if (LIZ3 != null) {
                            a_b.LIZ(new C9303cy(LIZ3));
                        }
                    }
                }
            });
            c458214Ad.LIZ(new AbstractC5270g(c458284Ak) { // from class: X.4Ac
                public static ChangeQuickRedirect LIZ;
                public final C458284Ak LIZIZ;

                static {
                    Covode.recordClassIndex(33323);
                }

                {
                    C106862S5w.LIZ(c458284Ak);
                    this.LIZIZ = c458284Ak;
                }

                @Override // com.bytedance.android.live.profit.fansclub.panel.AbstractC5270g
                public final <P extends C5269c> void LIZ(int i, FansClubEntranceParams fansClubEntranceParams, P p) {
                    Uri LIZ3;
                    String value;
                    boolean z = false;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams, p}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(fansClubEntranceParams, p);
                    if (fansClubEntranceParams.LIZ == FansClubEntranceParams.Page.SendGiftJoin && (p instanceof a$b)) {
                        if (i == FansClubPanelTypes.Web.ordinal()) {
                            PatchProxyResult proxy4 = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
                            if (proxy4.isSupported) {
                                z = ((Boolean) proxy4.result).booleanValue();
                            } else {
                                C5927dv LIZ4 = C5927dv.LJII.LIZ();
                                if (LIZ4 != null) {
                                    z = LIZ4.LJIL();
                                }
                            }
                            if (z) {
                                SettingKey<String> settingKey = LiveConfigSettingKeys.VS_SEND_GIFT_FAIL_DIALOG_URL;
                                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                                value = settingKey.getValue();
                            } else {
                                SettingKey<String> settingKey2 = LiveConfigSettingKeys.SEND_GIFT_FAIL_DIALOG_URL;
                                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                                value = settingKey2.getValue();
                            }
                            a$b a_b = (a$b) p;
                            if (value == null) {
                                value = "";
                            }
                            Uri parse = Uri.parse(value);
                            Intrinsics.checkNotNullExpressionValue(parse, "");
                            a_b.LIZIZ(new C9303cy(parse));
                        } else if (i == FansClubPanelTypes.Lynx.ordinal() && (LIZ3 = this.LIZIZ.LIZ(fansClubEntranceParams.LIZ)) != null) {
                            ((a$b) p).LIZ(new C9303cy(LIZ3));
                        }
                    }
                }
            });
            c458214Ad.LIZ(new AbstractC5270g() { // from class: X.4Ab
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33315);
                }

                @Override // com.bytedance.android.live.profit.fansclub.panel.AbstractC5270g
                public final <P extends C5269c> void LIZ(int i, FansClubEntranceParams fansClubEntranceParams, P p) {
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams, p}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(fansClubEntranceParams, p);
                    if (fansClubEntranceParams.LIZ == FansClubEntranceParams.Page.AutoReactivate && (p instanceof a$b) && i == FansClubPanelTypes.Web.ordinal()) {
                        SettingKey<String> settingKey = LiveSettingKeys.LIVE_FANS_LIGHT_PAGE_URL;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        String value = settingKey.getValue();
                        a$b a_b = (a$b) p;
                        if (value == null) {
                            value = "";
                        }
                        a_b.LIZIZ(new C9303cy(value));
                    }
                }
            });
            c458214Ad.LIZ(new C4AX(c5923dp, c458354Ar, linkedHashMap));
            c458214Ad.LIZ(new C4AY(LIZ2, c5923dp));
            SettingKey<Boolean> settingKey = LiveSettingKeys.FANS_CLUB_PANEL_FILTER_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                c458214Ad.LIZ(new AbstractC5270g(c5923dp, context2) { // from class: X.4Af
                    public static ChangeQuickRedirect LIZ;
                    public final C5923dp LIZIZ;
                    public final Context LIZJ;

                    static {
                        Covode.recordClassIndex(33317);
                    }

                    {
                        C106862S5w.LIZ(c5923dp, context2);
                        this.LIZIZ = c5923dp;
                        this.LIZJ = context2;
                    }

                    @Override // com.bytedance.android.live.profit.fansclub.panel.AbstractC5270g
                    public final <P extends C5269c> void LIZ(int i, FansClubEntranceParams fansClubEntranceParams, P p) {
                        C9303cy c9303cy;
                        AbstractC458254Ah abstractC458254Ah;
                        Pair pair;
                        Integer intOrNull;
                        Integer intOrNull2;
                        boolean z = true;
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams, p}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(fansClubEntranceParams, p);
                        FansClubEntranceParams.Page page = fansClubEntranceParams.LIZ;
                        if (page != FansClubEntranceParams.Page.Default && page != FansClubEntranceParams.Page.AutoReactivate) {
                            return;
                        }
                        Uri uri = Uri.EMPTY;
                        Intrinsics.checkNotNullExpressionValue(uri, "");
                        new C9303cy(uri);
                        if (p instanceof a$b) {
                            if (i == FansClubPanelTypes.Lynx.ordinal()) {
                                a$b a_b = (a$b) p;
                                c9303cy = a_b.LIZ();
                                final C9303cy LIZ3 = a_b.LIZ();
                                abstractC458254Ah = new AbstractC458254Ah(this, LIZ3) { // from class: X.4Ag
                                    public static ChangeQuickRedirect LIZ;
                                    public final C9303cy LIZIZ;

                                    static {
                                        Covode.recordClassIndex(33318);
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ() {
                                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("is_already_adaptation_ui", "1");
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZLLL(int i2) {
                                        if (PatchProxy.proxy(new Object[]{0}, this, LIZ, false, 7).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("bundle_web_view_background_color", "0");
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("width", String.valueOf(i2));
                                        this.LIZIZ.LIZ("horizontal_width", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZIZ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ(C109391T5d.LJFF, String.valueOf(i2));
                                        this.LIZIZ.LIZ("horizontal_height", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZJ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 3).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("margin", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    /* renamed from: LJ */
                                    public final void mo24860LJ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 9).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("pull_down_height", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZIZ(boolean z2) {
                                        String str;
                                        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
                                            return;
                                        }
                                        C9303cy c9303cy2 = this.LIZIZ;
                                        if (z2) {
                                            str = "1";
                                        } else {
                                            str = "0";
                                        }
                                        c9303cy2.LIZ("landscape_custom_height", str);
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZJ(boolean z2) {
                                        String str;
                                        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
                                            return;
                                        }
                                        C9303cy c9303cy2 = this.LIZIZ;
                                        if (z2) {
                                            str = "1";
                                        } else {
                                            str = "0";
                                        }
                                        c9303cy2.LIZ("pull_down_close", str);
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ(boolean z2) {
                                        if (PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 4).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("show_dim", "0");
                                    }

                                    {
                                        C106862S5w.LIZ(LIZ3);
                                        this.LIZIZ = LIZ3;
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ(int i2, int i3, int i4, int i5) {
                                        if (PatchProxy.proxy(new Object[]{8, 8, Integer.valueOf(i4), Integer.valueOf(i5)}, this, LIZ, false, 5).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("radius", "8");
                                    }
                                };
                            } else if (i == FansClubPanelTypes.Web.ordinal()) {
                                a$b a_b2 = (a$b) p;
                                c9303cy = a_b2.LIZJ;
                                final C9303cy c9303cy2 = a_b2.LIZJ;
                                abstractC458254Ah = new AbstractC458254Ah(this, c9303cy2) { // from class: X.4Ag
                                    public static ChangeQuickRedirect LIZ;
                                    public final C9303cy LIZIZ;

                                    static {
                                        Covode.recordClassIndex(33318);
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ() {
                                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("is_already_adaptation_ui", "1");
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZLLL(int i2) {
                                        if (PatchProxy.proxy(new Object[]{0}, this, LIZ, false, 7).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("bundle_web_view_background_color", "0");
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("width", String.valueOf(i2));
                                        this.LIZIZ.LIZ("horizontal_width", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZIZ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ(C109391T5d.LJFF, String.valueOf(i2));
                                        this.LIZIZ.LIZ("horizontal_height", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZJ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 3).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("margin", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    /* renamed from: LJ */
                                    public final void mo24860LJ(int i2) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 9).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("pull_down_height", String.valueOf(i2));
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZIZ(boolean z2) {
                                        String str;
                                        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
                                            return;
                                        }
                                        C9303cy c9303cy22 = this.LIZIZ;
                                        if (z2) {
                                            str = "1";
                                        } else {
                                            str = "0";
                                        }
                                        c9303cy22.LIZ("landscape_custom_height", str);
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZJ(boolean z2) {
                                        String str;
                                        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
                                            return;
                                        }
                                        C9303cy c9303cy22 = this.LIZIZ;
                                        if (z2) {
                                            str = "1";
                                        } else {
                                            str = "0";
                                        }
                                        c9303cy22.LIZ("pull_down_close", str);
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ(boolean z2) {
                                        if (PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 4).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("show_dim", "0");
                                    }

                                    {
                                        C106862S5w.LIZ(c9303cy2);
                                        this.LIZIZ = c9303cy2;
                                    }

                                    @Override // p003X.AbstractC458254Ah
                                    public final void LIZ(int i2, int i3, int i4, int i5) {
                                        if (PatchProxy.proxy(new Object[]{8, 8, Integer.valueOf(i4), Integer.valueOf(i5)}, this, LIZ, false, 5).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ("radius", "8");
                                    }
                                };
                            } else {
                                return;
                            }
                            if (abstractC458254Ah != null) {
                                PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{c9303cy}, this, LIZ, false, 2);
                                if (proxy4.isSupported) {
                                    pair = (Pair) proxy4.result;
                                } else {
                                    Resources resources = this.LIZJ.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "");
                                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                                    int i2 = (int) (displayMetrics.widthPixels / displayMetrics.density);
                                    int i3 = (int) (displayMetrics.heightPixels / displayMetrics.density);
                                    if (this.LIZIZ.LIZJ().LIZ().booleanValue()) {
                                        double d = (i3 * 1.0f) / i2;
                                        if (d >= 0.85d && d <= 1.15d) {
                                            i2 = (int) (i2 * 0.66d);
                                        }
                                        if (C47A.LIZLLL()) {
                                            i3 = 700;
                                        } else {
                                            i3 = (int) (i2 * 1.31f);
                                        }
                                    } else {
                                        i2 = C81918IQm.LIZIZ(this.LIZJ, C81918IQm.LIZIZ(this.LIZJ));
                                    }
                                    pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
                                }
                                int intValue = ((Number) pair.component1()).intValue();
                                int intValue2 = ((Number) pair.component2()).intValue();
                                abstractC458254Ah.LIZ(intValue);
                                abstractC458254Ah.LIZIZ(intValue2);
                                abstractC458254Ah.LIZJ(0);
                                abstractC458254Ah.LIZ(false);
                                if (this.LIZIZ.LIZJ().LIZ().booleanValue()) {
                                    abstractC458254Ah.LIZ(8, 8, 0, 0);
                                    abstractC458254Ah.LIZIZ(false);
                                } else {
                                    abstractC458254Ah.LIZ(8, 8, 8, 8);
                                    abstractC458254Ah.LIZIZ(true);
                                    if (fansClubEntranceParams.LIZ == FansClubEntranceParams.Page.AutoReactivate) {
                                        abstractC458254Ah.LIZJ(8);
                                    }
                                }
                                abstractC458254Ah.LIZLLL(0);
                                String LIZ4 = c9303cy.LIZ("pull_down_close");
                                if (LIZ4 != null && (intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(LIZ4)) != null) {
                                    if (intOrNull2.intValue() != 1) {
                                        z = false;
                                    }
                                    abstractC458254Ah.LIZJ(z);
                                }
                                String LIZ5 = c9303cy.LIZ("pull_down_height");
                                if (LIZ5 != null && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(LIZ5)) != null) {
                                    abstractC458254Ah.mo24860LJ(intOrNull.intValue());
                                }
                                abstractC458254Ah.LIZ();
                            }
                        }
                    }
                });
                c458214Ad.LIZ(new AbstractC5270g(context2) { // from class: X.4Aa
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(33322);
                    }

                    {
                        C106862S5w.LIZ(context2);
                    }

                    @Override // com.bytedance.android.live.profit.fansclub.panel.AbstractC5270g
                    public final <P extends C5269c> void LIZ(int i, FansClubEntranceParams fansClubEntranceParams, P p) {
                        C9303cy LIZ3;
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), fansClubEntranceParams, p}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(fansClubEntranceParams, p);
                        if (fansClubEntranceParams.LIZ == FansClubEntranceParams.Page.SendGiftJoin && (p instanceof a$b)) {
                            a$b a_b = (a$b) p;
                            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), a_b}, this, LIZ, false, 2).isSupported) {
                                if (i == FansClubPanelTypes.Web.ordinal()) {
                                    LIZ3 = a_b.LIZJ;
                                } else if (i != FansClubPanelTypes.Lynx.ordinal()) {
                                    return;
                                } else {
                                    LIZ3 = a_b.LIZ();
                                }
                                if (LIZ3 != null) {
                                    LIZ3.LIZ("width", "280");
                                    LIZ3.LIZ(C109391T5d.LJFF, "294");
                                    LIZ3.LIZ("radius", "2");
                                    LIZ3.LIZ("margin", "2");
                                    LIZ3.LIZ("gravity", "17");
                                }
                            }
                        }
                    }
                });
            }
        }
        return c458314An;
    }
}
