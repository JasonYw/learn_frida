package com.bytedance.android.live.broadcastgame.opengame.service;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.util.LruCache;
import android.view.View;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.C3607p;
import com.bytedance.android.live.broadcastgame.opengame.control.report.a$a;
import com.bytedance.android.live.broadcastgame.opengame.dialog.DialogC3494a;
import com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialog;
import com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag;
import com.bytedance.android.live.broadcastgame.opengame.message.C3519ax;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g;
import com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3718b;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p518ui.DialogC6336gc;
import com.bytedance.android.livesdk.config.C6968ex;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AnonymousClass177;
import p003X.AnonymousClass425;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C387291Vj;
import p003X.C387481Wc;
import p003X.C390501dE;
import p003X.C4574547f;
import p003X.C521876jd;
import p003X.C86932KNi;
import p003X.C87549Ked;
import p003X.C87659KgP;
import p003X.C87771KiD;
import p003X.C87911KkT;
import p003X.C88014Km8;
import p003X.C88019KmD;
import p003X.DialogC88058Kmq;
import p003X.DialogInterface$OnClickListenerC87787KiT;
import p003X.DialogInterface$OnDismissListenerC88015Km9;
import p003X.LK5;
import p003X.RunnableC88012Km6;

/* loaded from: classes5.dex */
public final class ReportService implements a$a, AbstractC3717a, AbstractC3718b {
    public static ChangeQuickRedirect LIZ;
    public WeakReference<OpenGameReportDialog> LIZJ;
    public DialogC6336gc LIZLLL;

    /* renamed from: LJ */
    public RunnableC88012Km6 f26087LJ;
    public final Lazy LJFF;
    public WeakReference<DialogC3494a> LJI;
    public C3682x LJII;
    public final /* synthetic */ C87549Ked LJIIIIZZ = new C87549Ked();
    public final boolean LIZIZ = LJIIIIZZ().LJIIJ;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.ReportService$2 */
    /* loaded from: classes.dex */
    public static final class C37062<T> implements Consumer<Throwable> {
        public static final C37062 LIZ = new C37062();

        static {
            Covode.recordClassIndex(21022);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* bridge */ /* synthetic */ void accept(Throwable th) {
        }
    }

    static {
        Covode.recordClassIndex(21020);
    }

    public final C5923dp LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C5923dp) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.control.report.a$a
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJII() {
    }

    public final C3682x LJIIIIZZ() {
        return this.LJII;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        C387291Vj.LIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.f26087LJ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        C387291Vj.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        C387291Vj.LIZJ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        C387291Vj.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        C387291Vj.m25034LJ(this);
    }

    public final void LIZJ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        hashMap.put("user_id", String.valueOf(LIZ2.getId()));
        hashMap.put("room_id", String.valueOf(LJIIIIZZ().LJIIIIZZ.LIZIZ));
        hashMap.put("program_id", LJIIIIZZ().LJIIIIZZ.LJII);
        hashMap.put("program_name", LJIIIIZZ().LJIIIIZZ.LIZ(this.LIZIZ));
        if (this.LIZIZ) {
            str = "anchor";
        } else {
            str = "user";
        }
        hashMap.put("user_type", str);
        C4574547f.LIZ().LIZ("livesdk_open_platform_report_click", hashMap, new Object[0]);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        C390501dE c390501dE = C390501dE.f263LJ;
        boolean z = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c390501dE, C390501dE.LIZ, false, 2).isSupported) {
            c390501dE.LIZ().clear();
            C390501dE.LIZJ = "";
            C390501dE.LIZLLL = "";
            if (z) {
                SettingKey<C6968ex> settingKey = LiveSettingKeys.LIVE_OPEN_PLATFORM_REPORT_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                i = settingKey.getValue().LIZJ;
            } else {
                SettingKey<C6968ex> settingKey2 = LiveSettingKeys.LIVE_OPEN_PLATFORM_REPORT_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                i = settingKey2.getValue().f27254LJ;
            }
            C390501dE.LIZIZ = new LruCache<>(i);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        DialogC3494a dialogC3494a;
        OpenGameReportDialog openGameReportDialog;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        C390501dE c390501dE = C390501dE.f263LJ;
        if (!PatchProxy.proxy(new Object[0], c390501dE, C390501dE.LIZ, false, 7).isSupported) {
            c390501dE.LIZ().clear();
            C390501dE.LIZJ = "";
            C390501dE.LIZLLL = "";
            C390501dE.LIZIZ.evictAll();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            WeakReference<OpenGameReportDialog> weakReference = this.LIZJ;
            if (weakReference != null && (openGameReportDialog = weakReference.get()) != null) {
                openGameReportDialog.LIZIZ = 3;
                openGameReportDialog.finish();
            }
            WeakReference<DialogC3494a> weakReference2 = this.LJI;
            if (weakReference2 != null && (dialogC3494a = weakReference2.get()) != null) {
                dialogC3494a.LIZIZ = 3;
                if (!PatchProxy.proxy(new Object[0], dialogC3494a, DialogC3494a.LIZ, false, 18).isSupported) {
                    DialogC88058Kmq dialogC88058Kmq = dialogC3494a.LIZJ;
                    if (dialogC88058Kmq != null) {
                        C116971W2r.LIZ(dialogC88058Kmq);
                    }
                    C116971W2r.LIZ(dialogC3494a);
                }
            }
            this.f26087LJ.LIZ();
        }
        DialogC6336gc dialogC6336gc = this.LIZLLL;
        if (dialogC6336gc != null) {
            dialogC6336gc.cancel();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            this.LJIIIIZZ.LIZ();
        }
    }

    public final void LIZ(C521876jd c521876jd) {
        if (PatchProxy.proxy(new Object[]{c521876jd}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZJ();
        if (!PatchProxy.proxy(new Object[]{this, c521876jd, (byte) 0, 2, null}, null, LIZ, true, 3).isSupported) {
            LIZ(c521876jd, false);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.control.report.a$a
    public final void LIZJ(String str) {
        Observable<Bitmap> captureView;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC3659g LIZIZ = LJIIIIZZ().LIZIZ();
        if (LIZIZ != null && (captureView = LIZIZ.captureView()) != null) {
            captureView.subscribe(C387481Wc.LIZIZ, AnonymousClass177.LIZ);
        }
    }

    public ReportService(C3682x c3682x) {
        float f;
        Observable LIZ2;
        Disposable subscribe;
        C106862S5w.LIZ(c3682x);
        this.LJII = c3682x;
        if (this.LIZIZ) {
            SettingKey<C6968ex> settingKey = LiveSettingKeys.LIVE_OPEN_PLATFORM_REPORT_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            f = settingKey.getValue().LIZIZ;
        } else {
            SettingKey<C6968ex> settingKey2 = LiveSettingKeys.LIVE_OPEN_PLATFORM_REPORT_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            f = settingKey2.getValue().LIZLLL;
        }
        RunnableC88012Km6 runnableC88012Km6 = new RunnableC88012Km6(f * 1000.0f);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this}, runnableC88012Km6, RunnableC88012Km6.LIZ, false, 1);
        if (proxy.isSupported) {
            runnableC88012Km6 = (RunnableC88012Km6) proxy.result;
        } else {
            runnableC88012Km6.LIZLLL = new WeakReference<>(this);
        }
        this.f26087LJ = runnableC88012Km6;
        this.LJFF = LazyKt__LazyJVMKt.lazy(new ReportService$roomContext$2(this));
        AbstractC3512ag abstractC3512ag = LJIIIIZZ().LJII;
        if (abstractC3512ag != null && (LIZ2 = abstractC3512ag.LIZ(C3519ax.class)) != null && (subscribe = LIZ2.subscribe(new Consumer<C3519ax>() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.ReportService.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21021);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C3519ax c3519ax) {
                String str;
                String str2;
                String str3;
                C3519ax c3519ax2 = c3519ax;
                if (!PatchProxy.proxy(new Object[]{c3519ax2}, this, LIZ, false, 1).isSupported) {
                    ReportService reportService = ReportService.this;
                    Intrinsics.checkNotNullExpressionValue(c3519ax2, "");
                    if (!PatchProxy.proxy(new Object[]{c3519ax2}, reportService, ReportService.LIZ, false, 19).isSupported) {
                        C390501dE.f263LJ.LIZ(c3519ax2.LIZJ, "violation", ((BootInfoService) reportService.LJIIIIZZ().LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZLLL());
                        if (!(!Intrinsics.areEqual(c3519ax2.LIZIZ, String.valueOf(reportService.LJIIIIZZ().LJIIIIZZ()))) && !(!Intrinsics.areEqual(reportService.LJIIIIZZ().LJIIIIZZ.LJII, c3519ax2.LIZJ))) {
                            C87659KgP.LIZ(reportService.LJIIIIZZ().LJI, "violation", false, false, 6, null);
                            PluginType LJIILJJIL = reportService.LJIIIIZZ().LJIILJJIL();
                            if (LJIILJJIL != null) {
                                C87771KiD.LIZ.LIZ(LJIILJJIL, MapsKt__MapsKt.emptyMap());
                            }
                            if (reportService.LIZLLL == null) {
                                C86932KNi c86932KNi = new C86932KNi(reportService.LJIIIIZZ().LIZLLL, 1);
                                c86932KNi.LIZJ(2131698907);
                                c86932KNi.LIZ(LK5.LIZJ(2130856575), (View.OnClickListener) null);
                                c86932KNi.LIZ(false);
                                c86932KNi.LJFF(17);
                                c86932KNi.LIZIZ(false);
                                c86932KNi.LIZ(LK5.LIZ(2131586720), DialogInterface$OnClickListenerC87787KiT.LIZIZ);
                                reportService.LIZLLL = c86932KNi.LIZ();
                            }
                            DialogC6336gc dialogC6336gc = reportService.LIZLLL;
                            if (dialogC6336gc != null) {
                                if (reportService.LIZIZ) {
                                    str = c3519ax2.f26063LJ;
                                    str2 = c3519ax2.LJFF;
                                } else {
                                    str = c3519ax2.LJI;
                                    str2 = c3519ax2.LJII;
                                }
                                if (!StringsKt__StringsJVMKt.isBlank(str) && !StringsKt__StringsJVMKt.isBlank(str2)) {
                                    dialogC6336gc.LIZ((CharSequence) str);
                                    dialogC6336gc.LIZIZ(str2);
                                    C116971W2r.LIZJ(dialogC6336gc);
                                    int i = c3519ax2.LIZLLL;
                                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, reportService, ReportService.LIZ, false, 20).isSupported) {
                                        HashMap hashMap = new HashMap();
                                        IUser LIZ3 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                                        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                                        hashMap.put("user_id", String.valueOf(LIZ3.getId()));
                                        hashMap.put("room_id", String.valueOf(reportService.LJIIIIZZ().LJIIIIZZ.LIZIZ));
                                        hashMap.put("program_id", reportService.LJIIIIZZ().LJIIIIZZ.LJII);
                                        hashMap.put("program_name", reportService.LJIIIIZZ().LJIIIIZZ.LIZ(reportService.LIZIZ));
                                        boolean z = reportService.LIZIZ;
                                        String str4 = "anchor";
                                        if (z) {
                                            str3 = str4;
                                        } else {
                                            str3 = "user";
                                        }
                                        hashMap.put("user_type", str3);
                                        if (i != 1) {
                                            str4 = "program";
                                        }
                                        hashMap.put("violation", str4);
                                        C4574547f.LIZ().LIZ("livesdk_open_platform_violation_panel_show", hashMap, new Object[0]);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C87911KkT c87911KkT = C87911KkT.LIZIZ;
                        C87911KkT.LIZ(c87911KkT, "showViolateDialog fail current: " + reportService.LJIIIIZZ().LJIIIIZZ() + LoggerUtil.BLANK_TAG + reportService.LJIIIIZZ().LJIIIIZZ.LJII + " received " + c3519ax2.LIZIZ + "  " + c3519ax2.LIZJ, null, 2, null);
                    }
                }
            }
        }, C37062.LIZ)) != null && !PatchProxy.proxy(new Object[]{subscribe}, this, LIZ, false, 29).isSupported) {
            C106862S5w.LIZ(subscribe);
            this.LJIIIIZZ.LIZ(subscribe);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
        WeakReference<a$a> weakReference;
        a$a a_a;
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 9).isSupported || LJIIIIZZ().LJIILJJIL() == PluginType.MINI_APP) {
            return;
        }
        RunnableC88012Km6 runnableC88012Km6 = this.f26087LJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], runnableC88012Km6, RunnableC88012Km6.LIZ, false, 3);
        if (proxy.isSupported) {
            Object obj = proxy.result;
            return;
        }
        Message obtain = Message.obtain(RunnableC88012Km6.LJI, runnableC88012Km6);
        runnableC88012Km6.LIZIZ = System.currentTimeMillis();
        if (runnableC88012Km6.LIZIZ() && (weakReference = runnableC88012Km6.LIZLLL) != null && (a_a = weakReference.get()) != null) {
            a_a.LIZIZ(runnableC88012Km6.f8598LJ);
        }
        RunnableC88012Km6.LJI.sendMessageDelayed(obtain, runnableC88012Km6.LJFF);
        runnableC88012Km6.LIZJ = true;
    }

    public final void LIZ(C521876jd c521876jd, boolean z) {
        Context context;
        if (PatchProxy.proxy(new Object[]{c521876jd, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (LJIIIIZZ().LJIILJJIL() == PluginType.MINI_APP) {
            C88019KmD c88019KmD = OpenGameReportDialog.LJII;
            Context context2 = LJIIIIZZ().LIZLLL;
            C3607p c3607p = LJIIIIZZ().LJIIIIZZ;
            boolean z2 = LJIIIIZZ().LJIIJ;
            ReportService$showReportDialog$1 reportService$showReportDialog$1 = new ReportService$showReportDialog$1(this);
            if (!PatchProxy.proxy(new Object[]{context2, c3607p, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), c521876jd, reportService$showReportDialog$1}, c88019KmD, C88019KmD.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(context2, c3607p, reportService$showReportDialog$1);
                AnonymousClass425.LIZ().registerActivityLifecycleCallbacks(new C88014Km8(reportService$showReportDialog$1));
                Intent intent = new Intent(context2, OpenGameReportDialog.class);
                intent.putExtra("develop", c3607p.LIZJ);
                intent.putExtra("room_id", c3607p.LIZIZ);
                intent.putExtra("is_anchor", z2);
                intent.putExtra("plugin_type", c3607p.LJIILIIL.value);
                intent.putExtra(Constants.APP_ID, c3607p.LJII);
                intent.putExtra("app_name", c3607p.LIZ(z2));
                if (c521876jd != null) {
                    intent.putExtra("mini_app_page_params", new OpenGameReportDialog.InnerPageParams(c521876jd.LIZIZ, c521876jd.LIZJ));
                }
                C116971W2r.LIZ(context2, intent);
                return;
            }
            return;
        }
        if (z) {
            context = LJIIIIZZ().LJIILL();
        } else {
            context = LJIIIIZZ().LIZLLL;
        }
        DialogC3494a dialogC3494a = new DialogC3494a(context, LJIIIIZZ().LJIIIIZZ, this.LIZIZ, z);
        C116971W2r.LIZ(dialogC3494a, new DialogInterface$OnDismissListenerC88015Km9(dialogC3494a, this));
        C116971W2r.LIZJ(dialogC3494a);
        this.LJI = new WeakReference<>(dialogC3494a);
    }
}
