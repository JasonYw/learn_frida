package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C86850KKe;
import p003X.KLK;

/* loaded from: classes5.dex */
public final class PreviewLiveDesireWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewLiveDesireWidget this$0;

    static {
        Covode.recordClassIndex(18545);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewLiveDesireWidget$onCreate$1(PreviewLiveDesireWidget previewLiveDesireWidget) {
        super(1);
        this.this$0 = previewLiveDesireWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        C86850KKe c86850KKe;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported && roomCreateInfo2 != null && (c86850KKe = roomCreateInfo2.LJJJJLI) != null && c86850KKe.LIZ) {
            this.this$0.LJIILJJIL();
            PreviewLiveDesireWidget previewLiveDesireWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewLiveDesireWidget, PreviewLiveDesireWidget.LIZ, false, 6).isSupported) {
                ALogger.m15801d(previewLiveDesireWidget.LIZ(), "start register JsEvent");
                Disposable subscribe = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("desire_status_transition").observeOn(AndroidSchedulers.mainThread()).subscribe(new KLK(previewLiveDesireWidget));
                Intrinsics.checkNotNullExpressionValue(subscribe, "");
                previewLiveDesireWidget.LIZ(subscribe);
            }
            this.this$0.contentView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcast.widget.PreviewLiveDesireWidget$onCreate$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18546);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    PreviewLiveDesireWidget previewLiveDesireWidget2 = PreviewLiveDesireWidget$onCreate$1.this.this$0;
                    if (!PatchProxy.proxy(new Object[0], previewLiveDesireWidget2, PreviewLiveDesireWidget.LIZ, false, 5).isSupported) {
                        ILiveActionHandler iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class);
                        if (iLiveActionHandler != null) {
                            iLiveActionHandler.handle(previewLiveDesireWidget2.context, previewLiveDesireWidget2.LIZIZ());
                        }
                        String LIZ2 = previewLiveDesireWidget2.LIZ();
                        ALogger.m15801d(LIZ2, "openPanel: previewDesireSchema=[" + previewLiveDesireWidget2.LIZIZ() + LoggerUtil.M_RIGHT_TAG);
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
