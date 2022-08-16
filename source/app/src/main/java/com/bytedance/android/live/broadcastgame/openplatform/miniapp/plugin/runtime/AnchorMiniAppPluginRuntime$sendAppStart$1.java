package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3387w;
import com.bytedance.android.live.broadcastgame.api.model.z$c;
import com.bytedance.android.live.broadcastgame.network.BroadcastGameApi;
import com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87170KWm;
import p003X.C100839PnV;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C442103eG;
import p003X.C449833qj;
import p003X.C82036IVa;
import p003X.C87609Kfb;
import p003X.C87616Kfi;
import p003X.C87618Kfk;
import p003X.C87626Kfs;
import p003X.C87632Kfy;
import p003X.C91301Ly3;
import p003X.KYP;

/* loaded from: classes5.dex */
public final class AnchorMiniAppPluginRuntime$sendAppStart$1 extends Lambda implements Function2<Boolean, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $onError;
    public final /* synthetic */ Function0 $onSuccess;
    public final /* synthetic */ C87626Kfs this$0;

    static {
        Covode.recordClassIndex(21767);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniAppPluginRuntime$sendAppStart$1(C87626Kfs c87626Kfs, Function0 function0, Function1 function1) {
        super(2);
        this.this$0 = c87626Kfs;
        this.$onSuccess = function0;
        this.$onError = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, String str) {
        z$c z_c;
        String str2;
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
                C87626Kfs c87626Kfs = this.this$0;
                C442103eG LIZ3 = C442103eG.LIZJ.LIZ();
                if (LIZ3 == null || (LJIIJJI = LIZ3.LJIIJJI()) == null || (str2 = LJIIJJI.LIZ()) == null) {
                    str2 = "";
                }
                c87626Kfs.LIZJ = str2;
                KYP.LIZIZ.LIZ(this.this$0.LIZJ);
                C87626Kfs c87626Kfs2 = this.this$0;
                if (!PatchProxy.proxy(new Object[0], c87626Kfs2, C87626Kfs.LIZ, false, 15).isSupported) {
                    c87626Kfs2.LIZIZ = System.currentTimeMillis();
                    KYP.LIZIZ.LIZJ(c87626Kfs2.LIZIZ);
                    BroadcastGameApi LIZ4 = C82036IVa.LIZIZ.LIZ();
                    C3383p LJFF = c87626Kfs2.LJIILLIIL().LJFF();
                    if (LJFF != null) {
                        j = LJFF.LIZLLL;
                    } else {
                        j = 0;
                    }
                    long j2 = c87626Kfs2.LJIILJJIL;
                    if (C87609Kfb.LIZIZ(c87626Kfs2.LJIILJJIL().LJIIL)) {
                        str3 = "";
                    } else {
                        str3 = "2";
                    }
                    Observable<C5176i<C3387w>> notifyServerGameStart = LIZ4.notifyServerGameStart(j, j2, str3, c87626Kfs2.LIZIZ);
                    C449833qj LIZ5 = C100839PnV.LIZ(3);
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    Disposable subscribe = C91301Ly3.LIZ(notifyServerGameStart, LIZ5).subscribe(new C87616Kfi(c87626Kfs2), new C87618Kfk(c87626Kfs2));
                    Intrinsics.checkNotNullExpressionValue(subscribe, "");
                    c87626Kfs2.LIZ(subscribe);
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
