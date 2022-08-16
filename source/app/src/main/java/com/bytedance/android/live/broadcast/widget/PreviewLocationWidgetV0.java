package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C2WC;
import p003X.C87308Kak;

/* loaded from: classes12.dex */
public final class PreviewLocationWidgetV0 extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25991LJ = LIZ(C3199v.class);
    public String LJFF = "";

    static {
        Covode.recordClassIndex(18588);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewLocationWidgetV0.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    private final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.f25991LJ, this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLocationWidgetV0";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698462;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            r9 = this;
            r6 = 0
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.PreviewLocationWidgetV0.LIZ
            r0 = 2
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r9, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            super.onCreate()
            java.lang.Class<com.bytedance.android.livehostapi.foundation.IHostContext> r0 = com.bytedance.android.livehostapi.foundation.IHostContext.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            com.bytedance.android.livehostapi.foundation.IHostContext r0 = (com.bytedance.android.livehostapi.foundation.IHostContext) r0
            com.bytedance.android.livehostapi.foundation.depend.h r8 = r0.getCurrentLocation()
            r7 = 2131582740(0x7f0d5f14, float:1.8791482E38)
            r5 = 1
            if (r8 == 0) goto L3c
            java.lang.String r0 = r8.LIZIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != r5) goto Lc9
            android.content.Context r0 = r9.context
            java.lang.String r0 = r0.getString(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
        L3a:
            r9.LJFF = r0
        L3c:
            java.lang.String r0 = r9.LJFF
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4f
            android.content.Context r0 = r9.context
            java.lang.String r0 = r0.getString(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r9.LJFF = r0
        L4f:
            java.lang.Class<com.bytedance.android.live.user.IUserService> r0 = com.bytedance.android.live.user.IUserService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.user.IUserService r0 = (com.bytedance.android.live.user.IUserService) r0
            if (r0 == 0) goto Lc7
            X.3VF r0 = r0.user()
            if (r0 == 0) goto Lc7
            com.bytedance.android.live.base.model.user.IUser r1 = r0.LIZ()
        L63:
            boolean r0 = r1 instanceof com.bytedance.android.live.base.model.user.User
            if (r0 == 0) goto L6f
            int r0 = r1.getSecret()
            if (r0 != r5) goto L6f
            r9.LIZLLL = r5
        L6f:
            r9.LIZJ = r6
            android.content.Context r1 = r9.context
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = p003X.C144451eWj.LIZ(r1, r0)
            if (r0 == 0) goto Lc3
            X.Kak<java.lang.Integer> r0 = p003X.AbstractC80293Hkt.LJJLIIIJ
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Object r0 = r0.LIZ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lc3
            int r0 = r0.intValue()
            if (r0 != r5) goto Lc3
            boolean r0 = r9.LIZLLL
            if (r0 != 0) goto Lbf
            r9.LIZ(r5)
            r9.LIZJ = r5
        L9b:
            boolean r0 = r9.LIZLLL
            if (r0 == 0) goto Lb4
            android.view.View r1 = r9.contentView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
        La9:
            android.view.View r1 = r9.contentView
            X.3eo r0 = new X.3eo
            r0.<init>(r9)
            r1.setOnClickListener(r0)
            return
        Lb4:
            android.view.View r1 = r9.contentView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            goto La9
        Lbf:
            r9.LIZ(r6)
            goto L9b
        Lc3:
            r9.LIZ(r6)
            goto L9b
        Lc7:
            r1 = 0
            goto L63
        Lc9:
            if (r0 != 0) goto Ldf
            android.content.Context r3 = r9.context
            r2 = 2131583163(0x7f0d60bb, float:1.879234E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = r8.LIZIZ
            r1[r6] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            goto L3a
        Ldf:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewLocationWidgetV0.onCreate():void");
    }

    public final void LIZ(boolean z) {
        C2WC<Boolean> LJFF;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (z) {
            View view = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            TextView textView = (TextView) view.findViewById(2131193255);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(this.LJFF);
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            ((ImageView) view2.findViewById(2131182169)).setBackgroundResource(2130855485);
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJJLIIIJ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(1);
        } else {
            View view3 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            TextView textView2 = (TextView) view3.findViewById(2131193255);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView2.setText(context.getResources().getString(2131583162));
            View view4 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            ((ImageView) view4.findViewById(2131182169)).setBackgroundResource(2130855486);
            C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.LJJLIIIJ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(0);
        }
        C3199v LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null && (LJFF = LIZIZ2.LJFF()) != null) {
            LJFF.LIZ(Boolean.valueOf(z));
        }
    }
}
