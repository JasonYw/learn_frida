package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.widget.UrgeBubbleWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.QB4;

/* loaded from: classes12.dex */
public final class UrgeBubbleWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UrgeBubbleWidget this$0;

    static {
        Covode.recordClassIndex(18854);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrgeBubbleWidget$onCreate$1(UrgeBubbleWidget urgeBubbleWidget) {
        super(1);
        this.this$0 = urgeBubbleWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            final UrgeBubbleWidget urgeBubbleWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, urgeBubbleWidget, UrgeBubbleWidget.LIZ, false, 2).isSupported) {
                if (roomCreateInfo2 != null && roomCreateInfo2.LJJJ > 0 && roomCreateInfo2.LJJIZ > 0) {
                    if (!urgeBubbleWidget.LIZLLL) {
                        TextView textView = urgeBubbleWidget.LIZIZ;
                        if (textView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        textView.setText(String.valueOf(roomCreateInfo2.LJJIZ));
                        TextView textView2 = urgeBubbleWidget.LIZJ;
                        if (textView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        textView2.setText(urgeBubbleWidget.context.getString(2131588159, Long.valueOf(roomCreateInfo2.LJJJ)));
                        View view = urgeBubbleWidget.contentView;
                        Intrinsics.checkNotNullExpressionValue(view, "");
                        view.setVisibility(0);
                        Observable<Long> timer = Observable.timer(5L, TimeUnit.SECONDS);
                        Intrinsics.checkNotNullExpressionValue(timer, "");
                        Disposable subscribe = QB4.LIZIZ(timer).subscribe(new Consumer<Long>() { // from class: X.2sQ
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(18853);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(Long l) {
                                if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
                                    View view2 = UrgeBubbleWidget.this.contentView;
                                    Intrinsics.checkNotNullExpressionValue(view2, "");
                                    view2.setVisibility(8);
                                    UrgeBubbleWidget.this.LIZLLL = true;
                                }
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(subscribe, "");
                        urgeBubbleWidget.LIZ(subscribe);
                        C4574547f.LIZ().LIZ("livesdk_update_reward_shoot_page_show", MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ())), TuplesKt.m137to("rewarded_money", String.valueOf(roomCreateInfo2.LJJIZ)), TuplesKt.m137to("rewarded_fans", String.valueOf(roomCreateInfo2.LJJJ))), new Object[0]);
                    }
                } else {
                    View view2 = urgeBubbleWidget.contentView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    view2.setVisibility(8);
                    urgeBubbleWidget.LIZLLL = false;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
