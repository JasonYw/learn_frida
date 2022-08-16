package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewLocationWidget;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livehostapi.foundation.depend.C5828h;
import com.bytedance.android.livesdk.common.g$a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC144461eWt;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C116971W2r;
import p003X.C134528bwJ;
import p003X.C134529bwK;
import p003X.C134543bwY;
import p003X.C144451eWj;
import p003X.C148062fT6;
import p003X.C2WC;
import p003X.C3807916j;
import p003X.C39E;
import p003X.C442653f9;
import p003X.C442853fT;
import p003X.C442873fV;
import p003X.C4574547f;
import p003X.C86748KGg;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.DialogC138347cw3;
import p003X.KDS;
import p003X.KK0;
import p003X.RunnableC442603f4;
import p003X.RunnableC442633f7;

/* loaded from: classes12.dex */
public final class PreviewLocationWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f25990LJ;
    public Disposable LJFF;
    public final Lazy LJI = LIZ(C3199v.class);
    public String LIZJ = "";
    public final TokenCert LJIIL = TokenCert.Companion.with("bpea-live_start_live_show_location");

    static {
        Covode.recordClassIndex(18573);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewLocationWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    private final C3199v LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJI, this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLocationWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698461;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a174";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
        Disposable disposable2 = this.LJFF;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJFF) != null) {
            disposable.dispose();
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported || this.context == null) {
            return;
        }
        if (this.LIZLLL) {
            C88440Kt0.LIZ(2131587160);
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        List<Number> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2131587773, 2131583971});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        for (Number number : listOf) {
            arrayList.add(new g$a(number.intValue(), false, 0, 6));
        }
        C116971W2r.LIZJ(new C39E(context, 2131586194, arrayList, CollectionsKt__CollectionsKt.listOf((Object[]) new PopupMenu.OnMenuItemClickListener[]{new PopupMenu.OnMenuItemClickListener() { // from class: X.3f5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18586);
            }

            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{menuItem}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                PreviewLocationWidget previewLocationWidget = PreviewLocationWidget.this;
                if (!PatchProxy.proxy(new Object[0], previewLocationWidget, PreviewLocationWidget.LIZ, false, 6).isSupported) {
                    previewLocationWidget.LIZ(true);
                }
                return true;
            }
        }, new PopupMenu.OnMenuItemClickListener() { // from class: X.3f6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18587);
            }

            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{menuItem}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                PreviewLocationWidget previewLocationWidget = PreviewLocationWidget.this;
                if (!PatchProxy.proxy(new Object[0], previewLocationWidget, PreviewLocationWidget.LIZ, false, 5).isSupported) {
                    previewLocationWidget.LIZ(false);
                }
                return true;
            }
        }}), 0, null, 48));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewLocationWidget.onCreate():void");
    }

    public final void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LJJLIIIJJI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(Boolean.valueOf(z));
    }

    public final void LIZ(IUser iUser) {
        if (PatchProxy.proxy(new Object[]{iUser}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (!this.f25990LJ) {
            if (iUser instanceof User) {
                ((KDS) ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(((User) iUser).getId()).observeOn(AndroidSchedulers.mainThread()).m149as(C148062fT6.LIZ(this))).LIZ(new Consumer<C5171b<User, User.C2848a>>() { // from class: X.3f1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18574);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(C5171b<User, User.C2848a> c5171b) {
                        C5171b<User, User.C2848a> c5171b2 = c5171b;
                        if (!PatchProxy.proxy(new Object[]{c5171b2}, this, LIZ, false, 1).isSupported) {
                            User user = c5171b2.LIZJ;
                            Intrinsics.checkNotNullExpressionValue(user, "");
                            if (user.getSecret() == 1) {
                                PreviewLocationWidget previewLocationWidget = PreviewLocationWidget.this;
                                previewLocationWidget.LIZLLL = true;
                                if (previewLocationWidget.LIZLLL) {
                                    View view = PreviewLocationWidget.this.contentView;
                                    Intrinsics.checkNotNullExpressionValue(view, "");
                                    view.setAlpha(0.5f);
                                } else {
                                    View view2 = PreviewLocationWidget.this.contentView;
                                    Intrinsics.checkNotNullExpressionValue(view2, "");
                                    view2.setAlpha(1.0f);
                                }
                            }
                            PreviewLocationWidget previewLocationWidget2 = PreviewLocationWidget.this;
                            previewLocationWidget2.f25990LJ = true;
                            previewLocationWidget2.LIZIZ();
                        }
                    }
                }, C3807916j.LIZ);
                return;
            }
            return;
        }
        LIZIZ();
    }

    public final void LIZ(boolean z) {
        LiveMode liveMode;
        C2WC<LiveMode> LIZ2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (z) {
            if (C144451eWj.LIZ(this.context, "android.permission.ACCESS_FINE_LOCATION")) {
                LIZIZ(true);
                LIZJ(false);
                return;
            }
            IService service = ServiceManager.getService(IUserService.class);
            Intrinsics.checkNotNull(service);
            KK0.LIZ(((IUserService) service).user().LIZIZ());
            Context context = this.context;
            if (context != null) {
                C134528bwJ LIZ3 = C134529bwK.LIZ((Activity) context);
                LIZ3.LIZ(RunnableC442633f7.LIZIZ);
                LIZ3.LIZIZ(RunnableC442603f4.LIZIZ);
                LIZ3.LIZ(new AbstractC144461eWt() { // from class: X.3er
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18582);
                    }

                    @Override // p003X.AbstractC144461eWt
                    public final void LIZ(String... strArr) {
                        if (PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ((Object) strArr);
                        PreviewLocationWidget.this.LIZIZ(true);
                        PreviewLocationWidget.this.LIZJ(false);
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
                }, this.LJIIL, "android.permission.ACCESS_FINE_LOCATION");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        } else if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            DialogC138347cw3.LIZ(C442653f9.LIZ);
            C134543bwY c134543bwY = new C134543bwY(this.context);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{2131587155}, c134543bwY, C134543bwY.LIZ, false, 2);
            if (proxy.isSupported) {
                c134543bwY = (C134543bwY) proxy.result;
            } else {
                c134543bwY.LIZIZ.LJIIIIZZ = c134543bwY.LIZIZ.LIZIZ.getText(2131587155);
            }
            C134543bwY LIZ4 = c134543bwY.LIZ(2131582393, new DialogInterface.OnClickListener() { // from class: X.3ej
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18584);
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LiveMode liveMode2;
                    C2WC<LiveMode> LIZ5;
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                    Pair[] pairArr = new Pair[2];
                    C442853fT c442853fT = C442873fV.LIZ;
                    C3180k LJIIJJI = PreviewLocationWidget.this.LJIIJJI();
                    if (LJIIJJI != null && (LIZ5 = LJIIJJI.LIZ()) != null) {
                        liveMode2 = LIZ5.LIZ();
                    } else {
                        liveMode2 = null;
                    }
                    pairArr[0] = TuplesKt.m137to("live_type", c442853fT.LIZ(liveMode2));
                    pairArr[1] = TuplesKt.m137to("button", "keep_on");
                    C4574547f.LIZ().LIZ("location_cancel_page_button_click", MapsKt__MapsKt.mapOf(pairArr), new Object[0]);
                }
            });
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3ek
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18585);
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LiveMode liveMode2;
                    C2WC<LiveMode> LIZ5;
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                    PreviewLocationWidget.this.LIZIZ(false);
                    PreviewLocationWidget.this.LIZJ(true);
                    Pair[] pairArr = new Pair[2];
                    C442853fT c442853fT = C442873fV.LIZ;
                    C3180k LJIIJJI = PreviewLocationWidget.this.LJIIJJI();
                    if (LJIIJJI != null && (LIZ5 = LJIIJJI.LIZ()) != null) {
                        liveMode2 = LIZ5.LIZ();
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
            };
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{2131582651, onClickListener}, LIZ4, C134543bwY.LIZ, false, 4);
            if (proxy2.isSupported) {
                LIZ4 = (C134543bwY) proxy2.result;
            } else {
                LIZ4.LIZIZ.LJIIIZ = LIZ4.LIZIZ.LIZIZ.getText(2131582651);
                LIZ4.LIZIZ.LJIIJ = onClickListener;
            }
            LIZ4.LIZIZ();
            C442853fT c442853fT = C442873fV.LIZ;
            C3180k LJIIJJI = LJIIJJI();
            if (LJIIJJI != null && (LIZ2 = LJIIJJI.LIZ()) != null) {
                liveMode = LIZ2.LIZ();
            } else {
                liveMode = null;
            }
            C4574547f.LIZ().LIZ("location_cancel_page_show", MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("live_type", c442853fT.LIZ(liveMode))), new Object[0]);
        }
    }

    public final void LIZIZ(boolean z) {
        C2WC<Boolean> LJFF;
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (z) {
            if (C144451eWj.LIZ(this.context, "android.permission.ACCESS_FINE_LOCATION")) {
                IService service = ServiceManager.getService(IHostContext.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                C5828h currentLocation = ((IHostContext) service).getCurrentLocation();
                if (currentLocation == null || (str = currentLocation.LIZIZ) == null) {
                    str = "";
                }
                this.LIZJ = str;
                if (this.LIZJ.length() == 0) {
                    C86748KGg.LIZ("ttlive_guide_location", null, null, "preview", 6, null).LIZ(1).LIZ().LIZ();
                }
            }
            if (TextUtils.isEmpty(this.LIZJ)) {
                String string = this.context.getString(2131587773);
                Intrinsics.checkNotNullExpressionValue(string, "");
                this.LIZJ = string;
            }
            View view = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            TextView textView = (TextView) view.findViewById(2131193255);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(this.LIZJ);
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJJLIIIJ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(1);
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById = view2.findViewById(2131182162);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            findViewById.setVisibility(8);
            ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).justReportRoomEvent(9, 0L, 13, "");
        } else {
            View view3 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            TextView textView2 = (TextView) view3.findViewById(2131193255);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView2.setText(context.getResources().getString(2131587775));
            C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.LJJLIIIJ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(0);
            View view4 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            View findViewById2 = view4.findViewById(2131182162);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            findViewById2.setVisibility(0);
        }
        C3199v LIZJ = LIZJ();
        if (LIZJ != null && (LJFF = LIZJ.LJFF()) != null) {
            LJFF.LIZ(Boolean.valueOf(z));
        }
    }
}
