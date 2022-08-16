package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewLiveInfoLocationWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.p518ui.LiveSwitchButton;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC144461eWt;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C134215brD;
import p003X.C134528bwJ;
import p003X.C134529bwK;
import p003X.C144451eWj;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C442853fT;
import p003X.C442873fV;
import p003X.C4574547f;
import p003X.C87308Kak;
import p003X.KK0;
import p003X.RunnableC442543ey;
import p003X.RunnableC442563f0;

/* loaded from: classes12.dex */
public final class PreviewLiveInfoLocationWidget extends AbsRecyclablePreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;
    public static final /* synthetic */ KProperty[] LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public C134215brD LJIILIIL;
    public final Lazy LJIIJJI = LIZ(C3199v.class);
    public String LJIIL = "";
    public final TokenCert LJIILJJIL = TokenCert.Companion.with("bpea-live_start_live_show_location_live_info");

    private final C3199v LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIJJI, this, LJI[0]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLiveInfoLocationWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698458;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 9).isSupported) {
            return;
        }
        super.onStop();
        C134215brD c134215brD = this.LJIILIIL;
        if (c134215brD != null) {
            c134215brD.LIZLLL();
        }
    }

    static {
        Covode.recordClassIndex(18550);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewLiveInfoLocationWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LJI = new KProperty[]{propertyReference1Impl};
        CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 7});
    }

    /* renamed from: LJ */
    private final void m15867LJ() {
        LiveMode liveMode;
        C2WC<LiveMode> LIZ;
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 13).isSupported) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setMessage(2131587155);
        builder.setNegativeButton(2131582393, new DialogInterface.OnClickListener() { // from class: X.3ei
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18560);
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LiveMode liveMode2;
                C2WC<LiveMode> LIZ2;
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                Pair[] pairArr = new Pair[2];
                C442853fT c442853fT = C442873fV.LIZ;
                C3180k LIZIZ = PreviewLiveInfoLocationWidget.this.LIZIZ();
                if (LIZIZ != null && (LIZ2 = LIZIZ.LIZ()) != null) {
                    liveMode2 = LIZ2.LIZ();
                } else {
                    liveMode2 = null;
                }
                pairArr[0] = TuplesKt.m137to("live_type", c442853fT.LIZ(liveMode2));
                pairArr[1] = TuplesKt.m137to("button", "keep_on");
                C4574547f.LIZ().LIZ("location_cancel_page_button_click", MapsKt__MapsKt.mapOf(pairArr), new Object[0]);
            }
        });
        builder.setPositiveButton(2131582651, new DialogInterface.OnClickListener() { // from class: X.3el
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18561);
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LiveMode liveMode2;
                C2WC<LiveMode> LIZ2;
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                PreviewLiveInfoLocationWidget.this.LIZ(false);
                PreviewLiveInfoLocationWidget.this.LIZJ(false);
                PreviewLiveInfoLocationWidget.this.LIZLLL(true);
                Pair[] pairArr = new Pair[2];
                C442853fT c442853fT = C442873fV.LIZ;
                C3180k LIZIZ = PreviewLiveInfoLocationWidget.this.LIZIZ();
                if (LIZIZ != null && (LIZ2 = LIZIZ.LIZ()) != null) {
                    liveMode2 = LIZ2.LIZ();
                } else {
                    liveMode2 = null;
                }
                pairArr[0] = TuplesKt.m137to("live_type", c442853fT.LIZ(liveMode2));
                pairArr[1] = TuplesKt.m137to("button", "off");
                C4574547f.LIZ().LIZ("location_cancel_page_button_click", MapsKt__MapsKt.mapOf(pairArr), new Object[0]);
                C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJJLIIIJJIZ;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(0);
            }
        });
        builder.show();
        C442853fT c442853fT = C442873fV.LIZ;
        C3180k LIZIZ = LIZIZ();
        if (LIZIZ != null && (LIZ = LIZIZ.LIZ()) != null) {
            liveMode = LIZ.LIZ();
        } else {
            liveMode = null;
        }
        C4574547f.LIZ().LIZ("location_cancel_page_show", MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("live_type", c442853fT.LIZ(liveMode))), new Object[0]);
    }

    private final void LJFF() {
        IUser iUser;
        String str;
        C3VF user;
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 14).isSupported) {
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            iUser = user.LIZ();
        } else {
            iUser = null;
        }
        C4574547f LIZ = C4574547f.LIZ();
        Pair[] pairArr = new Pair[2];
        if (iUser == null || (str = String.valueOf(iUser.getId())) == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.m137to("anchor_id", str);
        pairArr[1] = TuplesKt.m137to("room_id", "");
        Map mapOf = MapsKt__MapsKt.mapOf(pairArr);
        C8668v c8668v = new C8668v();
        c8668v.LIZ("live_take_page");
        LIZ.LIZ("livesdk_location_open_tip_click", mapOf, c8668v);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (!PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 10).isSupported && LJIILIIL() != 0) {
            LIZJ();
        }
    }

    public final void LIZ(final boolean z) {
        LiveSwitchButton liveSwitchButton;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJFF, false, 2).isSupported) {
            return;
        }
        this.LJII = z;
        View view = this.contentView;
        if (view != null && (liveSwitchButton = (LiveSwitchButton) view.findViewById(2131182170)) != null) {
            liveSwitchButton.post(new Runnable() { // from class: X.3ex
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18551);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    View view2;
                    LiveSwitchButton liveSwitchButton2;
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (view2 = PreviewLiveInfoLocationWidget.this.contentView) != null && (liveSwitchButton2 = (LiveSwitchButton) view2.findViewById(2131182170)) != null) {
                        liveSwitchButton2.setChecked(z);
                    }
                }
            });
        }
    }

    public final void LIZLLL(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJFF, false, 12).isSupported) {
            return;
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LJJLIIIJJI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(Boolean.valueOf(z));
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJFF, false, 6).isSupported) {
            return;
        }
        if (z) {
            if (C144451eWj.LIZ(this.context, "android.permission.ACCESS_FINE_LOCATION")) {
                LIZ(true);
                LIZJ(true);
                LIZLLL(false);
                return;
            }
            IService service = ServiceManager.getService(IUserService.class);
            Intrinsics.checkNotNull(service);
            KK0.LIZ(((IUserService) service).user().LIZIZ());
            Context context = this.context;
            if (context != null) {
                C134528bwJ LIZ = C134529bwK.LIZ((Activity) context);
                LIZ.LIZ(RunnableC442563f0.LIZIZ);
                LIZ.LIZIZ(RunnableC442543ey.LIZIZ);
                LIZ.LIZ(new AbstractC144461eWt() { // from class: X.3eq
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18559);
                    }

                    @Override // p003X.AbstractC144461eWt
                    public final void LIZ(String... strArr) {
                        if (PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ((Object) strArr);
                        PreviewLiveInfoLocationWidget.this.LIZ(true);
                        PreviewLiveInfoLocationWidget.this.LIZJ(true);
                        PreviewLiveInfoLocationWidget.this.LIZLLL(false);
                        IService service2 = ServiceManager.getService(IUserService.class);
                        Intrinsics.checkNotNull(service2);
                        KK0.LIZIZ(((IUserService) service2).user().LIZIZ());
                    }

                    @Override // p003X.AbstractC144461eWt
                    public final void LIZIZ(String... strArr) {
                        if (PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ((Object) strArr);
                        IService service2 = ServiceManager.getService(IUserService.class);
                        Intrinsics.checkNotNull(service2);
                        KK0.LIZJ(((IUserService) service2).user().LIZIZ());
                    }
                }, this.LJIILJJIL, "android.permission.ACCESS_FINE_LOCATION");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        m15867LJ();
    }

    public final void LIZJ(boolean z) {
        C2WC<Boolean> LJFF2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJFF, false, 11).isSupported) {
            return;
        }
        if (z) {
            View view = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            TextView textView = (TextView) view.findViewById(2131193255);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(this.LJIIL);
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJJLIIIJ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(1);
            if (this.LJIILIIL != null) {
                LJFF();
            }
            ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).justReportRoomEvent(9, 0L, 13, "");
        } else {
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            TextView textView2 = (TextView) view2.findViewById(2131193255);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView2.setText(context.getResources().getString(2131587775));
            C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.LJJLIIIJ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(0);
        }
        C3199v LIZLLL = LIZLLL();
        if (LIZLLL != null && (LJFF2 = LIZLLL.LJFF()) != null) {
            LJFF2.LIZ(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onInit(java.lang.Object[] r8) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewLiveInfoLocationWidget.onInit(java.lang.Object[]):void");
    }
}
