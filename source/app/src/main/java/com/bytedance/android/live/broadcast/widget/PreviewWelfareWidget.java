package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.broadcast.api.model.WelfarePermissionInfo;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.utils.WelfareAppLogger$sendAnchorWelfareFrequencyEvent$1;
import com.bytedance.android.live.broadcast.widget.PreviewWelfareWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.uicomponent.p867a.C10559a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C34H;
import p003X.C35G;
import p003X.C35K;
import p003X.C382711Dt;
import p003X.C3VF;
import p003X.C413602Yo;
import p003X.C415682ck;
import p003X.C442873fV;
import p003X.C4574547f;

@AbstractC445813kF(LIZ = "WELFARE")
/* loaded from: classes12.dex */
public final class PreviewWelfareWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public TextView LIZJ;
    public final Lazy LIZLLL = LIZ(C3199v.class);

    static {
        Covode.recordClassIndex(18759);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewWelfareWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewWelfareWidget";
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LIZLLL, this, LIZIZ[0]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698452;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onDestroy();
    }

    public final void LIZJ() {
        WelfarePermissionInfo welfarePermissionInfo;
        String str;
        C3VF user;
        String valueOf;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && (welfarePermissionInfo = LJIIJJI().LJI().LIZ().welfarePermissionInfo) != null && welfarePermissionInfo.available) {
            Boolean LIZ2 = C415682ck.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.booleanValue() && (str = welfarePermissionInfo.settingPageUrl) != null && str.length() != 0) {
                Uri parse = Uri.parse(welfarePermissionInfo.settingPageUrl);
                String queryParameter = parse.getQueryParameter(PushConstants.WEB_URL);
                if (queryParameter != null && queryParameter.length() != 0) {
                    String str2 = "0";
                    Uri.Builder appendQueryParameter = Uri.parse(queryParameter).buildUpon().appendQueryParameter("is_living", str2);
                    IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                    if (iUserService != null && (user = iUserService.user()) != null && (valueOf = String.valueOf(user.LIZIZ())) != null) {
                        str2 = valueOf;
                    }
                    String uri = appendQueryParameter.appendQueryParameter("anchor_id", str2).appendQueryParameter("live_type", C442873fV.LIZ.LIZ(LJIIJJI().LIZ().LIZ())).build().toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    parse = C382711Dt.LIZ(parse, PushConstants.WEB_URL, uri);
                }
                ILiveActionHandler iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class);
                if (iLiveActionHandler != null) {
                    iLiveActionHandler.handle(this.context, parse);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        IBrowserService iBrowserService;
        Observable<Unit> registerExternalMethodFactory;
        AbstractC81278I1w abstractC81278I1w;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        this.LIZJ = (TextView) this.contentView.findViewById(2131195139);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            C34H.LIZIZ.LIZ(LJIIJJI().LIZ().LIZ());
            C413602Yo.LIZ(LJIIJJI().LIZ(), PreviewWelfareWidget$addLogFilter$1.INSTANCE);
            C4574547f.LIZ().LIZ(LIZ(), C34H.LIZIZ);
        }
        C413602Yo.LIZ(LJIIJJI().LJI(), new PreviewWelfareWidget$onCreate$1(this));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (iBrowserService = (IBrowserService) ServiceManager.getService(IBrowserService.class)) != null && (registerExternalMethodFactory = iBrowserService.registerExternalMethodFactory(new C35K(this))) != null && (abstractC81278I1w = (AbstractC81278I1w) registerExternalMethodFactory.m151as(autoDispose())) != null) {
            abstractC81278I1w.LIZ();
        }
        LIZJ(new PreviewWelfareWidget$onCreate$2(this));
        LIZ(C413602Yo.LIZ(LIZIZ().LJJJIL(), new PreviewWelfareWidget$onCreate$3(this)));
        Disposable subscribe = LJIIJJI().m15893LJ().LIZIZ().subscribe(new Consumer<PreviewStatusInfo>() { // from class: X.35P
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18760);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(PreviewStatusInfo previewStatusInfo) {
                PreviewStatusInfo previewStatusInfo2 = previewStatusInfo;
                if (!PatchProxy.proxy(new Object[]{previewStatusInfo2}, this, LIZ, false, 1).isSupported) {
                    int LIZ2 = previewStatusInfo2.LIZ();
                    if (LIZ2 != 0 && LIZ2 != 4) {
                        ViewGroup viewGroup = PreviewWelfareWidget.this.containerView;
                        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                        viewGroup.setAlpha(0.5f);
                        return;
                    }
                    ViewGroup viewGroup2 = PreviewWelfareWidget.this.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                    viewGroup2.setAlpha(1.0f);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }

    public final JSONObject LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{0}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C2521l.LJIIJ, 0);
        return jSONObject;
    }

    public final void LIZ(C10559a c10559a) {
        if (!PatchProxy.proxy(new Object[]{c10559a}, this, LIZ, false, 7).isSupported && c10559a.LIZIZ > 0) {
            LIZIZ().LJJJJJL().LIZ(Long.valueOf(c10559a.LIZIZ));
            long j = c10559a.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{new Long(j)}, null, C35G.LIZ, true, 5).isSupported) {
                C35G.LIZIZ.LIZ("livesdk_anchor_welfare_frequency", new WelfareAppLogger$sendAnchorWelfareFrequencyEvent$1(j));
            }
        }
    }
}
