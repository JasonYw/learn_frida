package com.bytedance.android.live.broadcast.widget;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KLB;
import p003X.KLL;
import p003X.KLM;
import p003X.KLN;
import p003X.KLO;
import p003X.KLQ;

/* loaded from: classes5.dex */
public final class PreviewPaidLiveInfoWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewPaidLiveInfoWidget this$0;

    static {
        Covode.recordClassIndex(18627);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPaidLiveInfoWidget$onCreate$1(PreviewPaidLiveInfoWidget previewPaidLiveInfoWidget) {
        super(1);
        this.this$0 = previewPaidLiveInfoWidget;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewPaidLiveInfoWidget$onCreate$1$1 */
    /* loaded from: classes5.dex */
    public static final class C32921 extends Lambda implements Function1<PreviewSourceParam, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ RoomCreateInfo $it;

        static {
            Covode.recordClassIndex(18628);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32921(RoomCreateInfo roomCreateInfo) {
            super(1);
            this.$it = roomCreateInfo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
            KLB klb;
            long j;
            PreviewSourceParam previewSourceParam2 = previewSourceParam;
            if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(previewSourceParam2);
                if (previewSourceParam2.LIZJ() && (klb = this.$it.LJJJJJ) != null) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], klb, KLB.LIZ, false, 3);
                    if (!proxy.isSupported ? !(!(!klb.LIZJ.isEmpty()) || !klb.LIZJ.contains(4)) : ((Boolean) proxy.result).booleanValue()) {
                        ALogger.m15801d(PreviewPaidLiveInfoWidget$onCreate$1.this.this$0.LIZ(), "receive sourceParam for auto sell ticket");
                        String str = previewSourceParam2.ticketId;
                        if (str != null) {
                            j = Long.parseLong(str);
                        } else {
                            j = 0;
                        }
                        PreviewPaidLiveInfoWidget$onCreate$1.this.this$0.LIZ(new KLO(2, null, null, null, null, j, false, null, 0, 478));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        KLB klb;
        MethodCollector.m14708i(1376);
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported && roomCreateInfo2 != null && (klb = roomCreateInfo2.LJJJJJ) != null && klb.LIZ()) {
            ALogger.m15801d(this.this$0.LIZ(), "receive roomCreateInfo, start init");
            PreviewPaidLiveInfoWidget previewPaidLiveInfoWidget = this.this$0;
            previewPaidLiveInfoWidget.LIZLLL = (HSImageView) previewPaidLiveInfoWidget.LIZLLL().findViewById(2131184816);
            PreviewPaidLiveInfoWidget previewPaidLiveInfoWidget2 = this.this$0;
            previewPaidLiveInfoWidget2.LIZJ = (TextView) previewPaidLiveInfoWidget2.LIZLLL().findViewById(2131184818);
            PreviewPaidLiveInfoWidget previewPaidLiveInfoWidget3 = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewPaidLiveInfoWidget3, PreviewPaidLiveInfoWidget.LIZ, false, 7).isSupported) {
                FrameLayout frameLayout = previewPaidLiveInfoWidget3.f25993LJ;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    frameLayout.addView(previewPaidLiveInfoWidget3.LIZJ());
                }
                FrameLayout frameLayout2 = previewPaidLiveInfoWidget3.LJFF;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                    frameLayout2.addView(previewPaidLiveInfoWidget3.m15865LJ());
                }
                FrameLayout frameLayout3 = previewPaidLiveInfoWidget3.LJI;
                if (frameLayout3 != null) {
                    frameLayout3.removeAllViews();
                    frameLayout3.addView(previewPaidLiveInfoWidget3.LIZLLL());
                }
            }
            PreviewPaidLiveInfoWidget previewPaidLiveInfoWidget4 = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewPaidLiveInfoWidget4, PreviewPaidLiveInfoWidget.LIZ, false, 9).isSupported) {
                ALogger.m15801d(previewPaidLiveInfoWidget4.LIZ(), "start register JsEvent");
                Disposable subscribe = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("pay_live_status_transition").observeOn(AndroidSchedulers.mainThread()).subscribe(new KLL(previewPaidLiveInfoWidget4));
                Intrinsics.checkNotNullExpressionValue(subscribe, "");
                previewPaidLiveInfoWidget4.LIZ(subscribe);
                Disposable subscribe2 = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("pay_live_status_update").observeOn(AndroidSchedulers.mainThread()).subscribe(new KLN(previewPaidLiveInfoWidget4));
                Intrinsics.checkNotNullExpressionValue(subscribe2, "");
                previewPaidLiveInfoWidget4.LIZ(subscribe2);
                Disposable subscribe3 = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("onLiveIntroduceTicketChosen").observeOn(AndroidSchedulers.mainThread()).subscribe(new KLM(previewPaidLiveInfoWidget4), KLQ.LIZ);
                Intrinsics.checkNotNullExpressionValue(subscribe3, "");
                previewPaidLiveInfoWidget4.LIZ(subscribe3);
            }
            this.this$0.LIZIZ().LJIJ().LIZ(new C32921(roomCreateInfo2));
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1376);
        return unit;
    }
}
