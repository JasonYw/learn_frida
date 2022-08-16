package com.bytedance.android.live.broadcast.widget;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostBusiness;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livehostapi.foundation.depend.C5828h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C144451eWj;
import p003X.C413602Yo;
import p003X.C87308Kak;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PreviewAddPoiWidgetV1 extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public Dialog LIZJ;
    public final Lazy LIZLLL = LIZ(C3199v.class);

    /* renamed from: LJ */
    public final Lazy f25977LJ = LazyKt__LazyJVMKt.lazy(PreviewAddPoiWidgetV1$defaultText$2.INSTANCE);

    static {
        Covode.recordClassIndex(18404);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewAddPoiWidgetV1.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLocationWidgetV1";
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LIZLLL, this, LIZIZ[0]));
    }

    public final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (String) (proxy.isSupported ? proxy.result : this.f25977LJ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698472;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a174";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onResume();
    }

    public final String LIZLLL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        IService service = ServiceManager.getService(IHostContext.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C5828h currentLocation = ((IHostContext) service).getCurrentLocation();
        if (currentLocation != null && (str = currentLocation.LIZIZ) != null && str.length() > 0) {
            new StringBuilder();
            String m25086C = C0002O.m25086C(str, " | ");
            if (m25086C != null) {
                return m25086C;
            }
        }
        return "";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        if (!PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 6).isSupported) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LJJLIIIJJI;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.FALSE);
        }
        C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LJJLIIIIJ;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        c87308Kak2.LIZ(Boolean.FALSE);
        ((IHostBusiness) ServiceManager.getService(IHostBusiness.class)).resetPoiMemoryPoiDetailData();
        if (C144451eWj.LIZ(this.context, "android.permission.ACCESS_FINE_LOCATION")) {
            C87308Kak<Integer> c87308Kak3 = AbstractC80293Hkt.LJJLIIIJ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
            Integer LIZ2 = c87308Kak3.LIZ();
            if (LIZ2 != null && LIZ2.intValue() == 1) {
                new StringBuilder();
                String m25086C = C0002O.m25086C(LIZLLL(), LK5.LIZ(2131583164));
                View view = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                TextView textView = (TextView) view.findViewById(2131185910);
                if (textView != null) {
                    textView.setText(m25086C);
                }
                this.containerView.setOnClickListener(new View.OnClickListener() { // from class: X.3fF
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18405);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
                    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.fragment.app.DialogFragment] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onClick(android.view.View r9) {
                        /*
                            Method dump skipped, instructions count: 238
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p003X.View$OnClickListenerC442713fF.onClick(android.view.View):void");
                    }
                });
                C413602Yo.LIZ(LIZIZ().LJIILIIL(), new PreviewAddPoiWidgetV1$onCreate$2(this));
            }
        }
        View view2 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        TextView textView2 = (TextView) view2.findViewById(2131185910);
        if (textView2 != null) {
            textView2.setText(LIZJ());
        }
        this.containerView.setOnClickListener(new View.OnClickListener() { // from class: X.3fF
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18405);
            }

            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r9) {
                /*
                    Method dump skipped, instructions count: 238
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p003X.View$OnClickListenerC442713fF.onClick(android.view.View):void");
            }
        });
        C413602Yo.LIZ(LIZIZ().LJIILIIL(), new PreviewAddPoiWidgetV1$onCreate$2(this));
    }
}
