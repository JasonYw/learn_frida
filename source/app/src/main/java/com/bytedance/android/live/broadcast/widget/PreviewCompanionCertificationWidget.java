package com.bytedance.android.live.broadcast.widget;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.p250e.C2826b;
import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6934dq;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C413602Yo;
import p003X.C81918IQm;
import p003X.C86776KHi;
import p003X.C86777KHj;
import p003X.C86780KHm;
import p003X.LK5;
import p003X.View$OnClickListenerC86687KDx;
import p003X.View$OnClickListenerC86689KDz;

/* loaded from: classes5.dex */
public final class PreviewCompanionCertificationWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;

    /* renamed from: LJ */
    public static final TokenCert f25981LJ = TokenCert.Companion.with("bpea-previewcompanioncertificationwidget_clipboard");
    public C2826b LIZJ;
    public long LIZLLL;
    public final Lazy LJFF = LIZ(C86780KHm.class);
    public final Lazy LJI = LIZ(C3199v.class);

    private final C86780KHm LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C86780KHm) (proxy.isSupported ? proxy.result : LIZ(this.LJFF, this, LIZIZ[0]));
    }

    private final C3199v LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJI, this, LIZIZ[1]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewCompanionCertificationWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700809;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a244";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        Covode.recordClassIndex(18452);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewCompanionCertificationWidget.class, "previewCompanionCertificationContext", "getPreviewCompanionCertificationContext()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewCompanionCertificationContext;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewCompanionCertificationWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    /* renamed from: LJ */
    private final void m15873LJ() {
        TextView textView;
        C3199v LIZLLL;
        C2WC<C2918r> m15891LJ;
        Disposable LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && (textView = (TextView) this.contentView.findViewById(2131186720)) != null && (LIZLLL = LIZLLL()) != null && (m15891LJ = LIZLLL.m15891LJ()) != null && (LIZ2 = C413602Yo.LIZ(m15891LJ, new PreviewCompanionCertificationWidget$setDownloadUrl$1(textView))) != null) {
            LIZ(LIZ2);
        }
    }

    public final void LIZIZ() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        C86780KHm LIZJ = LIZJ();
        if (LIZJ != null) {
            disposable = LIZJ.LIZLLL();
        } else {
            disposable = null;
        }
        LJIIL().add(disposable);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onStart() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStart();
        SettingKey<Boolean> settingKey = LiveSettingKeys.PC_LIVE_CERTIFICATION_EXEMPTION_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                C86780KHm LIZJ = LIZJ();
                if (LIZJ != null) {
                    disposable = LIZJ.LIZJ();
                } else {
                    disposable = null;
                }
                LJIIL().add(disposable);
                return;
            }
            return;
        }
        LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        ViewGroup.LayoutParams layoutParams;
        Disposable subscribe;
        Disposable subscribe2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        if (this.contentView == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(2131169182);
        TextView textView = (TextView) this.contentView.findViewById(2131194960);
        if (textView != null && (layoutParams = textView.getLayoutParams()) != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
            C3199v LIZLLL = LIZLLL();
            if (LIZLLL != null) {
                LIZ(C413602Yo.LIZ(LIZLLL.m15891LJ(), new C3288x68c3d3b(this)));
            }
            C86780KHm LIZJ = LIZJ();
            if (LIZJ != null && (subscribe2 = LIZJ.LIZIZ().LIZIZ().subscribe(new C86777KHj(this, viewGroup, layoutParams))) != null) {
                LIZ(subscribe2);
            }
            C86780KHm LIZJ2 = LIZJ();
            if (LIZJ2 != null && (subscribe = LIZJ2.LIZ().LIZIZ().subscribe(new C86776KHi(this, viewGroup, layoutParams))) != null) {
                LIZ(subscribe);
            }
            TextView textView2 = (TextView) this.contentView.findViewById(2131168543);
            if (textView2 != null) {
                textView2.setOnClickListener(new View$OnClickListenerC86689KDz(this));
            }
            TextView textView3 = (TextView) this.contentView.findViewById(2131186713);
            if (textView3 == null) {
                return;
            }
            textView3.setOnClickListener(new View$OnClickListenerC86687KDx(this));
            LIZ(this.LIZLLL);
        }
    }

    private final void LIZ(boolean z) {
        ImageView imageView;
        ImageView imageView2;
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported || (imageView = (ImageView) this.contentView.findViewById(2131181120)) == null || (imageView2 = (ImageView) this.contentView.findViewById(2131181121)) == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        LIZIZ(z);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.contentView.findViewById(2131190972);
        if (constraintLayout == null) {
            return;
        }
        if (!z) {
            i3 = 8;
        }
        constraintLayout.setVisibility(i3);
    }

    private final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        TextView textView = (TextView) this.contentView.findViewById(2131194962);
        TextView textView2 = (TextView) this.contentView.findViewById(2131193798);
        if (textView != null && textView2 != null) {
            if (z) {
                textView.setVisibility(0);
                textView2.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
    }

    public final void LIZ(long j) {
        boolean z;
        TextView textView;
        TextView textView2;
        TextView textView3;
        String LIZ2;
        String LIZ3;
        String LIZ4;
        String LIZ5;
        String LIZ6;
        String LIZ7;
        String LIZ8;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (j != 1 && j != 0) {
            z = false;
        } else {
            z = true;
        }
        LIZ(z);
        TextView textView4 = (TextView) this.contentView.findViewById(2131193796);
        if (textView4 == null || (textView = (TextView) this.contentView.findViewById(2131193797)) == null || (textView2 = (TextView) this.contentView.findViewById(2131193798)) == null || (textView3 = (TextView) this.contentView.findViewById(2131193799)) == null) {
            return;
        }
        if (z) {
            SettingKey<C6934dq> settingKey = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String str = settingKey.getValue().LIZLLL;
            if (str != null && str.length() != 0) {
                SettingKey<C6934dq> settingKey2 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                LIZ5 = settingKey2.getValue().LIZLLL;
            } else {
                LIZ5 = LK5.LIZ(2131587262);
            }
            textView4.setText(LIZ5);
            SettingKey<C6934dq> settingKey3 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            String str2 = settingKey3.getValue().f27242LJ;
            if (str2 != null && str2.length() != 0) {
                SettingKey<C6934dq> settingKey4 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
                Intrinsics.checkNotNullExpressionValue(settingKey4, "");
                LIZ6 = settingKey4.getValue().f27242LJ;
            } else {
                LIZ6 = LK5.LIZ(2131587263);
            }
            textView.setText(LIZ6);
            SettingKey<C6934dq> settingKey5 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
            Intrinsics.checkNotNullExpressionValue(settingKey5, "");
            String str3 = settingKey5.getValue().LJFF;
            if (str3 != null && str3.length() != 0) {
                SettingKey<C6934dq> settingKey6 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
                Intrinsics.checkNotNullExpressionValue(settingKey6, "");
                LIZ7 = settingKey6.getValue().LJFF;
            } else {
                LIZ7 = LK5.LIZ(2131587264);
            }
            textView2.setText(LIZ7);
            SettingKey<C6934dq> settingKey7 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
            Intrinsics.checkNotNullExpressionValue(settingKey7, "");
            String str4 = settingKey7.getValue().LJI;
            if (str4 != null && str4.length() != 0) {
                SettingKey<C6934dq> settingKey8 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
                Intrinsics.checkNotNullExpressionValue(settingKey8, "");
                LIZ8 = settingKey8.getValue().LJI;
            } else {
                LIZ8 = LK5.LIZ(2131587265);
            }
            textView3.setText(LIZ8);
            m15873LJ();
            return;
        }
        SettingKey<C6934dq> settingKey9 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
        Intrinsics.checkNotNullExpressionValue(settingKey9, "");
        String str5 = settingKey9.getValue().LIZ;
        if (str5 != null && str5.length() != 0) {
            SettingKey<C6934dq> settingKey10 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
            Intrinsics.checkNotNullExpressionValue(settingKey10, "");
            LIZ2 = settingKey10.getValue().LIZ;
        } else {
            LIZ2 = LK5.LIZ(2131582645);
        }
        textView4.setText(LIZ2);
        SettingKey<C6934dq> settingKey11 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
        Intrinsics.checkNotNullExpressionValue(settingKey11, "");
        String str6 = settingKey11.getValue().LIZIZ;
        if (str6 != null && str6.length() != 0) {
            SettingKey<C6934dq> settingKey12 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
            Intrinsics.checkNotNullExpressionValue(settingKey12, "");
            LIZ3 = settingKey12.getValue().LIZIZ;
        } else {
            LIZ3 = LK5.LIZ(2131582646);
        }
        textView.setText(LIZ3);
        SettingKey<C6934dq> settingKey13 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
        Intrinsics.checkNotNullExpressionValue(settingKey13, "");
        String str7 = settingKey13.getValue().LIZJ;
        if (str7 != null && str7.length() != 0) {
            SettingKey<C6934dq> settingKey14 = LiveConfigSettingKeys.LIVE_PARTNER_GUIDE_TIP_CONFIG_SETTING_KEY;
            Intrinsics.checkNotNullExpressionValue(settingKey14, "");
            LIZ4 = settingKey14.getValue().LIZJ;
        } else {
            LIZ4 = LK5.LIZ(2131582647);
        }
        textView3.setText(LIZ4);
    }

    public final void LIZ(boolean z, ViewGroup viewGroup, ConstraintLayout.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), viewGroup, layoutParams}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (z) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (layoutParams != null) {
                layoutParams.setMargins(0, (int) C81918IQm.LIZ(this.context, 13.0f), 0, 0);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (layoutParams != null) {
            layoutParams.setMargins(0, 0, 0, 0);
        }
    }
}
