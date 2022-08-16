package com.bytedance.android.live.broadcast.widget;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.core.setting.SettingKey;
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
import p003X.C413602Yo;
import p003X.LK5;
import p003X.View$OnClickListenerC86686KDw;

/* loaded from: classes5.dex */
public final class PreviewCompanionDownloadWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final TokenCert LIZLLL = TokenCert.Companion.with("bpea-previewcompaniondownloadwidget_clipboard");
    public TextView LIZJ;

    /* renamed from: LJ */
    public final Lazy f25982LJ = LIZ(C3199v.class);

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewCompanionDownloadWidget";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a133";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        Covode.recordClassIndex(18459);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewCompanionDownloadWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.USE_NEW_LIVE_COMPANION_GUIDE_PAGE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            return 2131700811;
        }
        return 2131700812;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Object LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        if (this.contentView == null) {
            return;
        }
        this.LIZJ = (TextView) this.contentView.findViewById(2131193974);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                LIZ2 = proxy.result;
            } else {
                LIZ2 = LIZ(this.f25982LJ, this, LIZIZ[0]);
            }
            Disposable LIZ3 = C413602Yo.LIZ(((C3199v) LIZ2).m15891LJ(), new PreviewCompanionDownloadWidget$setDownloadUrl$1(this));
            if (LIZ3 != null) {
                LIZ(LIZ3);
            }
        }
        TextView textView = (TextView) this.contentView.findViewById(2131168579);
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC86686KDw(this));
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.USE_NEW_LIVE_COMPANION_GUIDE_PAGE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue() && !PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            TextView textView2 = (TextView) this.contentView.findViewById(2131165273);
            if (textView2 != null) {
                textView2.setText(LK5.LIZ(2131582638));
            }
            ImageView imageView = (ImageView) this.contentView.findViewById(2131179601);
            if (imageView != null) {
                imageView.setImageResource(2130856182);
            }
            ImageView imageView2 = (ImageView) this.contentView.findViewById(2131179602);
            if (imageView2 != null) {
                imageView2.setImageResource(2130856183);
            }
            ImageView imageView3 = (ImageView) this.contentView.findViewById(2131179603);
            if (imageView3 != null) {
                imageView3.setImageResource(2130856184);
            }
        }
    }
}
