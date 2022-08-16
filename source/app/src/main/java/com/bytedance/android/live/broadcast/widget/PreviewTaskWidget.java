package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.annie.api.AnnieHelper;
import com.bytedance.android.annie.api.container.HybridDialog;
import com.bytedance.android.live.broadcast.api.BroadcastUserApi;
import com.bytedance.android.live.broadcast.model.C3156b;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewTaskWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.network.response.C5175h;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.util.url.UrlBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.utility.SharedPrefHelper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C422362nW;
import p003X.C425332sJ;
import p003X.C77347GeT;

@AbstractC445813kF(LIZ = "TASK")
/* loaded from: classes12.dex */
public final class PreviewTaskWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public HybridDialog f25999LJ;
    public final Lazy LJFF = C77347GeT.LIZ(PreviewTaskWidget$spHelper$2.INSTANCE);
    public final Lazy LIZIZ = C77347GeT.LIZ(PreviewTaskWidget$anchorId$2.INSTANCE);
    public List<C3156b> LIZJ = CollectionsKt__CollectionsKt.emptyList();
    public List<C3156b> LIZLLL = CollectionsKt__CollectionsKt.emptyList();
    public final Lazy LJI = C77347GeT.LIZ(new PreviewTaskWidget$redDotView$2(this));

    static {
        Covode.recordClassIndex(18718);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewTaskWidget";
    }

    public final SharedPrefHelper LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (SharedPrefHelper) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final View LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (View) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700860;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onCreate();
        this.containerView.setOnClickListener(new View.OnClickListener() { // from class: X.2iz
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18721);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity;
                boolean z;
                Object mo27335getValue;
                HybridDialog hybridDialog;
                Dialog dialog;
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                PreviewTaskWidget previewTaskWidget = PreviewTaskWidget.this;
                if (!PatchProxy.proxy(new Object[0], previewTaskWidget, PreviewTaskWidget.LIZ, false, 7).isSupported) {
                    previewTaskWidget.LIZIZ().LIZ();
                    for (C3156b c3156b : previewTaskWidget.LIZLLL) {
                        previewTaskWidget.LIZIZ().LIZ(String.valueOf(c3156b.LIZIZ), (Object) c3156b.LIZLLL);
                    }
                    previewTaskWidget.LIZIZ().LIZIZ();
                }
                SettingKey<String> settingKey = LiveConfigSettingKeys.BROADCAST_TASK_LIST_URL;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                UrlBuilder urlBuilder = new UrlBuilder(settingKey.getValue());
                urlBuilder.addParam("enter_from", "live_takepage");
                WeakReference<Activity> LIZJ = LHQ.LIZJ();
                if (LIZJ != null) {
                    activity = LIZJ.get();
                } else {
                    activity = null;
                }
                if (!(activity instanceof FragmentActivity)) {
                    activity = null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                if (fragmentActivity != null) {
                    if (PreviewTaskWidget.this.f25999LJ != null && (hybridDialog = PreviewTaskWidget.this.f25999LJ) != null && hybridDialog.getDialog() != null) {
                        HybridDialog hybridDialog2 = PreviewTaskWidget.this.f25999LJ;
                        if (hybridDialog2 != null) {
                            dialog = hybridDialog2.getDialog();
                        } else {
                            dialog = null;
                        }
                        Intrinsics.checkNotNull(dialog);
                        if (dialog.isShowing()) {
                            HybridDialog hybridDialog3 = PreviewTaskWidget.this.f25999LJ;
                            if (hybridDialog3 != null) {
                                hybridDialog3.dismissAllowingStateLoss();
                            }
                            PreviewTaskWidget.this.f25999LJ = null;
                        }
                    }
                    String build = urlBuilder.build();
                    Intrinsics.checkNotNullExpressionValue(build, "");
                    Uri build2 = AnnieHelper.createH5SchemeByUrl(build).buildUpon().appendQueryParameter("type", "popup").appendQueryParameter("gravity", "bottom").build();
                    Intrinsics.checkNotNullExpressionValue(build2, "");
                    PreviewTaskWidget.this.f25999LJ = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).showHybridDialog(fragmentActivity, build2, null);
                }
                PreviewTaskWidget previewTaskWidget2 = PreviewTaskWidget.this;
                if (!PatchProxy.proxy(new Object[]{"click"}, previewTaskWidget2, PreviewTaskWidget.LIZ, false, 9).isSupported) {
                    String m25086C = C0002O.m25086C("livesdk_mission_icon_", "click");
                    View LIZJ2 = previewTaskWidget2.LIZJ();
                    Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
                    if (LIZJ2.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(previewTaskWidget2.LIZJ, Constants.ACCEPT_TIME_SEPARATOR_SP, "[", "]", 0, null, null, 56, null);
                    C4574547f LIZ2 = C4574547f.LIZ();
                    Pair[] pairArr = new Pair[3];
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], previewTaskWidget2, PreviewTaskWidget.LIZ, false, 2);
                    if (proxy.isSupported) {
                        mo27335getValue = proxy.result;
                    } else {
                        mo27335getValue = previewTaskWidget2.LIZIZ.mo27335getValue();
                    }
                    pairArr[0] = TuplesKt.m137to("anchor_id", mo27335getValue);
                    pairArr[1] = TuplesKt.m137to("is_yellow_dot", LK1.LIZ(z));
                    pairArr[2] = TuplesKt.m137to(PushConstants.TASK_ID, joinToString$default);
                    LIZ2.LIZJ(m25086C, MapsKt__MapsKt.mapOf(pairArr), new Object[0]);
                }
                View LIZJ3 = PreviewTaskWidget.this.LIZJ();
                Intrinsics.checkNotNullExpressionValue(LIZJ3, "");
                LK1.LIZ(LIZJ3);
            }
        });
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            LJIIL().add(((BroadcastUserApi) C425332sJ.LIZIZ.LIZ(BroadcastUserApi.class)).getUserTasks(MapsKt__MapsKt.mapOf(TuplesKt.m137to("appId", String.valueOf(((IHostContext) ServiceManager.getService(IHostContext.class)).appId())), TuplesKt.m137to("liveId", "1"), TuplesKt.m137to("targetType", PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START), TuplesKt.m137to("triggerTask", "1"))).subscribe(new Consumer<C5175h<C3156b>>() { // from class: X.2sH
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18719);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5175h<C3156b> c5175h) {
                    List<C3156b> list;
                    C5175h<C3156b> c5175h2 = c5175h;
                    if (PatchProxy.proxy(new Object[]{c5175h2}, this, LIZ, false, 1).isSupported || (list = c5175h2.LIZIZ) == null) {
                        return;
                    }
                    PreviewTaskWidget previewTaskWidget = PreviewTaskWidget.this;
                    if (!PatchProxy.proxy(new Object[]{"fetch", list}, previewTaskWidget, PreviewTaskWidget.LIZ, false, 8).isSupported) {
                        String LIZ2 = previewTaskWidget.LIZ();
                        new StringBuilder();
                        ALogger.m15801d(LIZ2, C0002O.m25085C("fetch", ": ", CollectionsKt___CollectionsKt.joinToString$default(list, null, "[", "]", 0, null, null, 57, null)));
                    }
                }
            }, C422362nW.LIZIZ));
        }
    }
}
