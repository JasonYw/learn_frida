package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.widget.PreviewSettingWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C422102n6;
import p003X.C87308Kak;
import p003X.KK6;

/* loaded from: classes12.dex */
public final class PreviewSettingWidget$onCreate$4 extends Lambda implements Function1<PermissionResult, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSettingWidget this$0;

    static {
        Covode.recordClassIndex(18674);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSettingWidget$onCreate$4(PreviewSettingWidget previewSettingWidget) {
        super(1);
        this.this$0 = previewSettingWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PermissionResult permissionResult) {
        final PreviewSettingWidget previewSettingWidget;
        C87308Kak<Boolean> c87308Kak;
        Boolean LIZ;
        Boolean LIZ2;
        PermissionResult permissionResult2 = permissionResult;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{permissionResult2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(permissionResult2);
            if (permissionResult2.broadcastConfig != null) {
                this.this$0.f25997LJ = true;
            }
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_BUBBLE_REMOVE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                PreviewSettingWidget previewSettingWidget2 = this.this$0;
                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLLZLL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                Boolean LIZ3 = c87308Kak2.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (!LIZ3.booleanValue()) {
                    C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.LLLLZLLIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                    Boolean LIZ4 = c87308Kak3.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    if (!LIZ4.booleanValue()) {
                        z = false;
                    }
                }
                previewSettingWidget2.LJFF = z;
                if (!this.this$0.LJFF && !this.this$0.f25997LJ && !C422102n6.LIZIZ() && !this.this$0.m15862LJ()) {
                    this.this$0.LJIILL();
                } else {
                    this.this$0.LIZLLL();
                    this.this$0.LJIILJJIL();
                }
            } else {
                C87308Kak<Boolean> c87308Kak4 = AbstractC80293Hkt.LLLLZLL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
                Boolean LIZ5 = c87308Kak4.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                if (LIZ5.booleanValue()) {
                    C87308Kak<Boolean> c87308Kak5 = AbstractC80293Hkt.LLLLZLLIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak5, "");
                    Boolean LIZ6 = c87308Kak5.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                    if (LIZ6.booleanValue()) {
                        this.this$0.LIZJ().setText(2131587676);
                        this.this$0.LJFF = true;
                        previewSettingWidget = this.this$0;
                        if (!PatchProxy.proxy(new Object[0], previewSettingWidget, PreviewSettingWidget.LIZ, false, 17).isSupported && (KK6.LIZ() || !UIUtils.isViewVisible(previewSettingWidget.containerView) || !UIUtils.isViewVisible(previewSettingWidget.LIZJ()))) {
                            c87308Kak = AbstractC80293Hkt.f7141dJ;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                            if (c87308Kak.LIZ().booleanValue() && previewSettingWidget.LJFF) {
                                previewSettingWidget.LIZJ().setText(2131587678);
                                C87308Kak<Boolean> c87308Kak6 = AbstractC80293Hkt.f7141dJ;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak6, "");
                                c87308Kak6.LIZ(Boolean.TRUE);
                                previewSettingWidget.LJFF();
                            } else {
                                C87308Kak<Boolean> c87308Kak7 = AbstractC80293Hkt.f7261l;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak7, "");
                                LIZ = c87308Kak7.LIZ();
                                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                                if ((LIZ.booleanValue() || !previewSettingWidget.LJFF) && !C422102n6.LJI()) {
                                    C87308Kak<Boolean> c87308Kak8 = AbstractC80293Hkt.f7264o;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak8, "");
                                    LIZ2 = c87308Kak8.LIZ();
                                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                                    if (!LIZ2.booleanValue() && previewSettingWidget.f25997LJ) {
                                        previewSettingWidget.LIZJ = 1;
                                        previewSettingWidget.LIZJ().setText(2131583309);
                                        previewSettingWidget.LIZJ().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.3Ow
                                            public static ChangeQuickRedirect LIZ;

                                            static {
                                                Covode.recordClassIndex(18665);
                                            }

                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z2) {
                                                if (!PatchProxy.proxy(new Object[]{view, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported && !z2) {
                                                    PreviewSettingWidget.this.LJI();
                                                    TextView LIZJ = PreviewSettingWidget.this.LIZJ();
                                                    Intrinsics.checkNotNullExpressionValue(LIZJ, "");
                                                    LIZJ.setOnFocusChangeListener(null);
                                                }
                                            }
                                        });
                                        previewSettingWidget.LIZJ().post(new Runnable() { // from class: X.3Ox
                                            public static ChangeQuickRedirect LIZ;

                                            static {
                                                Covode.recordClassIndex(18666);
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                    return;
                                                }
                                                PreviewSettingWidget.this.LIZJ().requestFocus();
                                            }
                                        });
                                        previewSettingWidget.LJFF();
                                        C87308Kak<Boolean> c87308Kak9 = AbstractC80293Hkt.f7264o;
                                        Intrinsics.checkNotNullExpressionValue(c87308Kak9, "");
                                        c87308Kak9.LIZ(Boolean.FALSE);
                                    } else {
                                        UIUtils.setViewVisibility(previewSettingWidget.LIZJ(), 8);
                                    }
                                } else {
                                    if (C422102n6.LJI()) {
                                        C87308Kak<Boolean> c87308Kak10 = AbstractC80293Hkt.f7261l;
                                        Intrinsics.checkNotNullExpressionValue(c87308Kak10, "");
                                        Boolean LIZ7 = c87308Kak10.LIZ();
                                        Intrinsics.checkNotNullExpressionValue(LIZ7, "");
                                        if (LIZ7.booleanValue() && previewSettingWidget.LJFF) {
                                            previewSettingWidget.LIZJ().setText(2131581870);
                                        } else {
                                            previewSettingWidget.LIZJ().setText(2131581871);
                                        }
                                        if (!PatchProxy.proxy(new Object[0], null, C422102n6.LIZ, true, 10).isSupported) {
                                            AbstractC80293Hkt.f7041bP.LIZ(Boolean.TRUE);
                                        }
                                    }
                                    previewSettingWidget.LJFF();
                                }
                            }
                        }
                        this.this$0.LIZLLL();
                        this.this$0.LJIILJJIL();
                    }
                }
                C87308Kak<Boolean> c87308Kak11 = AbstractC80293Hkt.LLLLZLL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak11, "");
                Boolean LIZ8 = c87308Kak11.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ8, "");
                if (LIZ8.booleanValue()) {
                    this.this$0.LIZJ().setText(2131587679);
                    this.this$0.LJFF = true;
                } else {
                    C87308Kak<Boolean> c87308Kak12 = AbstractC80293Hkt.LLLLZLLIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak12, "");
                    Boolean LIZ9 = c87308Kak12.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ9, "");
                    if (LIZ9.booleanValue()) {
                        this.this$0.LIZJ().setText(2131587677);
                        this.this$0.LJFF = true;
                    } else if (this.this$0.f25997LJ) {
                        this.this$0.LIZJ().setText(2131583309);
                    } else if (!C422102n6.LIZIZ() && !this.this$0.m15862LJ()) {
                        this.this$0.LJIILL();
                    }
                }
                previewSettingWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewSettingWidget, PreviewSettingWidget.LIZ, false, 17).isSupported) {
                    c87308Kak = AbstractC80293Hkt.f7141dJ;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    if (c87308Kak.LIZ().booleanValue()) {
                    }
                    C87308Kak<Boolean> c87308Kak72 = AbstractC80293Hkt.f7261l;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak72, "");
                    LIZ = c87308Kak72.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    if (LIZ.booleanValue()) {
                    }
                    C87308Kak<Boolean> c87308Kak82 = AbstractC80293Hkt.f7264o;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak82, "");
                    LIZ2 = c87308Kak82.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    if (!LIZ2.booleanValue()) {
                    }
                    UIUtils.setViewVisibility(previewSettingWidget.LIZJ(), 8);
                }
                this.this$0.LIZLLL();
                this.this$0.LJIILJJIL();
            }
        }
        return Unit.INSTANCE;
    }
}
