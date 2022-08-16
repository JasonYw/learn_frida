package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3387w;
import com.bytedance.android.live.broadcastgame.api.model.z$c;
import com.bytedance.android.live.broadcastgame.network.BroadcastGameApi;
import com.bytedance.android.live.broadcastgame.opengame.message.AnchorGameMessageChannel$sendSeiHeartBeatMessage$1;
import com.bytedance.android.live.broadcastgame.opengame.message.C3520d;
import com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.AbstractC87170KWm;
import p003X.C100839PnV;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C442103eG;
import p003X.C449833qj;
import p003X.C82036IVa;
import p003X.C87609Kfb;
import p003X.C87615Kfh;
import p003X.C87617Kfj;
import p003X.C87625Kfr;
import p003X.C87632Kfy;
import p003X.C91301Ly3;
import p003X.KYP;

/* loaded from: classes5.dex */
public final class AnchorPluginRuntime$sendAppStart$1 extends Lambda implements Function2<Boolean, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $onError;
    public final /* synthetic */ Function0 $onSuccess;
    public final /* synthetic */ C87625Kfr this$0;

    static {
        Covode.recordClassIndex(20831);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorPluginRuntime$sendAppStart$1(C87625Kfr c87625Kfr, Function0 function0, Function1 function1) {
        super(2);
        this.this$0 = c87625Kfr;
        this.$onSuccess = function0;
        this.$onError = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, String str) {
        z$c z_c;
        String str2;
        C3520d c3520d;
        long j;
        String str3;
        C2WC<String> LJIIJJI;
        C2WD<z$c> LJJI;
        C2WD<z$c> LJJI2;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                C442103eG LIZ = C442103eG.LIZJ.LIZ();
                if (LIZ != null && (LJJI2 = LIZ.LJJI()) != null) {
                    z_c = LJJI2.LIZ();
                } else {
                    z_c = null;
                }
                if (z_c instanceof C87632Kfy) {
                    ((C87632Kfy) z_c).LIZJ = true;
                } else {
                    z_c = new C87632Kfy(false, false, true, 3);
                }
                AbstractC87170KWm LIZ2 = AbstractC87170KWm.LJI.LIZ();
                if (LIZ2 != null && (LJJI = LIZ2.LJJI()) != null) {
                    LJJI.LIZ(z_c);
                }
                C87625Kfr c87625Kfr = this.this$0;
                C442103eG LIZ3 = C442103eG.LIZJ.LIZ();
                if (LIZ3 == null || (LJIIJJI = LIZ3.LJIIJJI()) == null || (str2 = LJIIJJI.LIZ()) == null) {
                    str2 = "";
                }
                c87625Kfr.LIZLLL = str2;
                C87625Kfr c87625Kfr2 = this.this$0;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c87625Kfr2}, null, C87625Kfr.LIZ, true, 18);
                if (proxy.isSupported) {
                    c3520d = (C3520d) proxy.result;
                } else {
                    c3520d = c87625Kfr2.LIZIZ;
                    if (c3520d == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
                C3383p LJFF = this.this$0.LJIILLIIL().LJFF();
                long j2 = 0;
                if (LJFF != null) {
                    j = LJFF.LIZLLL;
                } else {
                    j = 0;
                }
                Integer valueOf = Integer.valueOf(this.this$0.LJIILLIIL().f26027LJ);
                if (!PatchProxy.proxy(new Object[]{new Long(j), valueOf}, c3520d, C3520d.LIZ, false, 9).isSupported) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Constants.APP_ID, c3520d.LJI);
                    jSONObject.put(C33968a.f42937f, j);
                    c3520d.LIZ().LIZ(1000L, new AnchorGameMessageChannel$sendSeiHeartBeatMessage$1(c3520d, jSONObject, valueOf));
                }
                KYP.LIZIZ.LIZ(this.this$0.LIZLLL);
                C87625Kfr c87625Kfr3 = this.this$0;
                if (!PatchProxy.proxy(new Object[0], c87625Kfr3, C87625Kfr.LIZ, false, 16).isSupported) {
                    c87625Kfr3.LIZJ = System.currentTimeMillis();
                    KYP.LIZIZ.LIZJ(c87625Kfr3.LIZJ);
                    BroadcastGameApi LIZ4 = C82036IVa.LIZIZ.LIZ();
                    C3383p LJFF2 = c87625Kfr3.LJIILLIIL().LJFF();
                    if (LJFF2 != null) {
                        j2 = LJFF2.LIZLLL;
                    }
                    long j3 = c87625Kfr3.LJIILL;
                    if (C87609Kfb.LIZIZ(c87625Kfr3.LJIILJJIL().LJIIL)) {
                        str3 = "";
                    } else {
                        str3 = "2";
                    }
                    Observable<C5176i<C3387w>> notifyServerGameStart = LIZ4.notifyServerGameStart(j2, j3, str3, c87625Kfr3.LIZJ);
                    C449833qj LIZ5 = C100839PnV.LIZ(3);
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    Disposable subscribe = C91301Ly3.LIZ(notifyServerGameStart, LIZ5).subscribe(new C87615Kfh(c87625Kfr3), new C87617Kfj(c87625Kfr3));
                    Intrinsics.checkNotNullExpressionValue(subscribe, "");
                    c87625Kfr3.LIZ(subscribe);
                }
                this.this$0.LJIILIIL().LIZ();
                this.$onSuccess.mo30099invoke();
                OpenPlatformMonitorService.LIZIZ((OpenPlatformMonitorService) this.this$0.LJIILIIL().LIZ((Class<AbstractC3719c>) OpenPlatformMonitorService.class), 0, null, null, 6, null);
            } else {
                this.this$0.LJIILIIL().LIZJ();
                this.$onError.invoke(str);
                OpenPlatformMonitorService.LIZIZ((OpenPlatformMonitorService) this.this$0.LJIILIIL().LIZ((Class<AbstractC3719c>) OpenPlatformMonitorService.class), 1, null, null, 6, null);
            }
        }
        return Unit.INSTANCE;
    }
}
