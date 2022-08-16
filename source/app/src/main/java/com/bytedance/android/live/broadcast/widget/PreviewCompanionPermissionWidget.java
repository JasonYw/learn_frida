package com.bytedance.android.live.broadcast.widget;

import android.app.Dialog;
import android.net.Uri;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.p250e.C2825a;
import com.bytedance.android.live.base.model.p250e.C2826b;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.AbstractC88358Krg;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C382711Dt;
import p003X.C413602Yo;
import p003X.C414192aL;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C78330GuK;
import p003X.C86780KHm;
import p003X.C86783KHp;
import p003X.C86784KHq;
import p003X.C86785KHr;
import p003X.KN8;

/* loaded from: classes5.dex */
public final class PreviewCompanionPermissionWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public TextView LIZJ;
    public C2826b LIZLLL;

    /* renamed from: LJ */
    public C2825a f25983LJ;
    public AbstractC88358Krg LJFF;
    public final Lazy LJI = LIZ(C86780KHm.class);
    public final Lazy LJIIL = LIZ(C3199v.class);
    public final Lazy LJIILIIL = C77347GeT.LIZ(new PreviewCompanionPermissionWidget$progressDialog$2(this));

    static {
        Covode.recordClassIndex(18462);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewCompanionPermissionWidget.class, "previewCompanionCertificationContext", "getPreviewCompanionCertificationContext()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewCompanionCertificationContext;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewCompanionPermissionWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    /* renamed from: LJ */
    private final C86780KHm m15872LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C86780KHm) (proxy.isSupported ? proxy.result : LIZ(this.LJI, this, LIZIZ[0]));
    }

    private final C3199v LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIL, this, LIZIZ[1]));
    }

    private final Dialog LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (Dialog) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewCompanionPermissionWidget";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZIZ() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        C86780KHm m15872LJ = m15872LJ();
        if (m15872LJ != null) {
            disposable = m15872LJ.LIZLLL();
        } else {
            disposable = null;
        }
        LJIIL().add(disposable);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        Dialog LJI = LJI();
        Intrinsics.checkNotNullExpressionValue(LJI, "");
        if (LJI.isShowing()) {
            C116971W2r.LIZ(LJI());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.USE_NEW_LIVE_COMPANION_GUIDE_PAGE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            return 2131700807;
        }
        return 2131700808;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            Dialog LJI = LJI();
            Intrinsics.checkNotNullExpressionValue(LJI, "");
            if (!LJI.isShowing()) {
                C116971W2r.LIZIZ(LJI());
            }
        }
        ((AbstractC81278I1w) KN8.LIZJ().LIZ().LIZ().getPCLivePermissionStatus("pc_live").observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(new C86785KHr(this), new C78330GuK(this));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onStart() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStart();
        SettingKey<Boolean> settingKey = LiveSettingKeys.USE_NEW_LIVE_COMPANION_GUIDE_PAGE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.PC_LIVE_CERTIFICATION_EXEMPTION_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value2 = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            if (value2.booleanValue()) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                    C86780KHm m15872LJ = m15872LJ();
                    if (m15872LJ != null) {
                        disposable = m15872LJ.LIZJ();
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
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Disposable subscribe;
        Disposable subscribe2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onCreate();
        if (this.contentView == null) {
            return;
        }
        C86780KHm m15872LJ = m15872LJ();
        if (m15872LJ != null && (subscribe2 = m15872LJ.LIZIZ().LIZIZ().subscribe(new C86783KHp(this))) != null) {
            LIZ(subscribe2);
        }
        C86780KHm m15872LJ2 = m15872LJ();
        if (m15872LJ2 != null && (subscribe = m15872LJ2.LIZ().LIZIZ().subscribe(new C86784KHq(this))) != null) {
            LIZ(subscribe);
        }
        this.LIZJ = (TextView) this.contentView.findViewById(2131168442);
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setOnClickListener(C414192aL.LIZ(0L, new PreviewCompanionPermissionWidget$onCreate$3(this), 1, null));
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.USE_NEW_LIVE_COMPANION_GUIDE_PAGE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C3199v LJFF = LJFF();
            if (LJFF != null) {
                LIZ(C413602Yo.LIZ(LJFF.LJJJJIZL(), new PreviewCompanionPermissionWidget$onCreate$$inlined$let$lambda$3(this)));
            }
            C3199v LJFF2 = LJFF();
            if (LJFF2 != null) {
                LIZ(C413602Yo.LIZ(LJFF2.LJJJJJ(), new PreviewCompanionPermissionWidget$onCreate$$inlined$let$lambda$4(this)));
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 10).isSupported && liveMode != null && liveMode == LiveMode.THIRD_PARTY && (textView = this.LIZJ) != null && textView.getVisibility() == 0) {
            C4574547f LIZ2 = C4574547f.LIZ();
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "third_party");
            LIZ2.LIZ("livesdk_live_application_show", hashMap, new Object[0]);
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        SettingKey<String> settingKey = LiveConfigSettingKeys.APPLY_LIVE_PERMISSION_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String value = settingKey.getValue();
        if (value != null && value.length() != 0) {
            String uri = Uri.parse(Uri.parse(value).getQueryParameter(PushConstants.WEB_URL)).buildUpon().appendQueryParameter("scene", "pc_live").appendQueryParameter("apply_status", String.valueOf(i)).appendQueryParameter("enter_from", "live_take_page").build().toString();
            Uri parse = Uri.parse(value);
            Intrinsics.checkNotNullExpressionValue(parse, "");
            String uri2 = C382711Dt.LIZ(parse, PushConstants.WEB_URL, uri).toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "");
            ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.context, uri2);
        }
    }
}
