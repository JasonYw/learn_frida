package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.widget.C3319r;
import com.bytedance.android.live.broadcast.widget.PreviewGroupPurchaseWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C148062fT6;
import p003X.C88306Kqq;
import p003X.KLD;
import p003X.KLR;
import p003X.KLS;
import p003X.KLT;

/* loaded from: classes5.dex */
public final class PreviewGroupPurchaseWidget$onCreate$1 extends Lambda implements Function1<PermissionResult, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewGroupPurchaseWidget this$0;

    static {
        Covode.recordClassIndex(18537);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewGroupPurchaseWidget$onCreate$1(PreviewGroupPurchaseWidget previewGroupPurchaseWidget) {
        super(1);
        this.this$0 = previewGroupPurchaseWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PermissionResult permissionResult) {
        Observable<C3319r> selectedCard;
        PermissionResult permissionResult2 = permissionResult;
        if (!PatchProxy.proxy(new Object[]{permissionResult2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(permissionResult2);
            if (permissionResult2.shouldShowGroupPurchaseEntry()) {
                this.this$0.LJIILJJIL();
                final PreviewGroupPurchaseWidget previewGroupPurchaseWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewGroupPurchaseWidget, PreviewGroupPurchaseWidget.LIZ, false, 13).isSupported) {
                    GroupPurchaseApi groupPurchaseApi = (GroupPurchaseApi) C88306Kqq.LIZ().LIZ(GroupPurchaseApi.class);
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{groupPurchaseApi, 0, 0, 0, 7, null}, null, KLT.LIZ, true, 1);
                    if (proxy.isSupported) {
                        selectedCard = (Observable) proxy.result;
                    } else {
                        selectedCard = groupPurchaseApi.getSelectedCard(0, 0, 0);
                    }
                    selectedCard.subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<C3319r>() { // from class: X.11e
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18532);
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final /* synthetic */ void accept(C3319r c3319r) {
                            C3319r c3319r2 = c3319r;
                            int i = 0;
                            if (!PatchProxy.proxy(new Object[]{c3319r2}, this, LIZ, false, 1).isSupported) {
                                PreviewGroupPurchaseWidget previewGroupPurchaseWidget2 = PreviewGroupPurchaseWidget.this;
                                List<Object> list = c3319r2.LIZLLL;
                                if (list != null) {
                                    i = list.size();
                                }
                                previewGroupPurchaseWidget2.LIZ(i);
                            }
                        }
                    }, new Consumer<Throwable>() { // from class: X.11f
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18533);
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final /* synthetic */ void accept(Throwable th) {
                            if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                                PreviewGroupPurchaseWidget.this.LIZ(0);
                            }
                        }
                    }, KLS.LIZ);
                }
                PreviewGroupPurchaseWidget previewGroupPurchaseWidget2 = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewGroupPurchaseWidget2, PreviewGroupPurchaseWidget.LIZ, false, 12).isSupported) {
                    Disposable subscribe = previewGroupPurchaseWidget2.LJIIJJI().m15893LJ().LIZIZ().subscribe(new KLD(previewGroupPurchaseWidget2));
                    Intrinsics.checkNotNullExpressionValue(subscribe, "");
                    previewGroupPurchaseWidget2.LIZ(subscribe);
                }
                PreviewGroupPurchaseWidget previewGroupPurchaseWidget3 = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewGroupPurchaseWidget3, PreviewGroupPurchaseWidget.LIZ, false, 11).isSupported) {
                    ((AbstractC81278I1w) ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("local_life_update_goods_count").observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(previewGroupPurchaseWidget3))).LIZ(new KLR(previewGroupPurchaseWidget3));
                }
            } else {
                this.this$0.LJIILL();
            }
        }
        return Unit.INSTANCE;
    }
}
