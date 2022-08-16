package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.widget.C3315bi;
import com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.log.s$a;
import com.bytedance.android.livesdk.widget.DialogC9362aa;
import com.bytedance.android.livesdkapi.business.AbstractC9431d;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2VQ;
import p003X.C30I;
import p003X.C3VF;
import p003X.C4314435e;
import p003X.C4574547f;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;

/* loaded from: classes12.dex */
public final class PreviewDouPlusWidget$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewDouPlusWidget this$0;

    static {
        Covode.recordClassIndex(18506);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewDouPlusWidget$onCreate$2(PreviewDouPlusWidget previewDouPlusWidget) {
        super(1);
        this.this$0 = previewDouPlusWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [X.35d, com.bytedance.android.livesdkapi.business.d] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        Long l;
        C30I c30i;
        C3VF user;
        Observable<C3315bi> qianChuanSchema;
        long j;
        C3VF user2;
        C3VF user3;
        IUser LIZ;
        Integer valueOf;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user3 = iUserService.user()) != null && (LIZ = user3.LIZ()) != null && (valueOf = Integer.valueOf(LIZ.getSecret())) != null && valueOf.intValue() == 1) {
                C88440Kt0.LIZ(2131582388);
            } else {
                if (!PatchProxy.proxy(new Object[0], this.this$0, PreviewDouPlusWidget.LIZ, false, 11).isSupported) {
                    IUserService iUserService2 = (IUserService) ServiceManager.getService(IUserService.class);
                    if (iUserService2 != null && (user2 = iUserService2.user()) != null) {
                        j = user2.LIZIZ();
                    } else {
                        j = 0;
                    }
                    C4574547f.LIZ().LIZ("livesdk_anchor_douplus_click", MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchor_id", String.valueOf(j)), TuplesKt.m137to("event_page", "live_take_page")), new Object[0]);
                }
                final PreviewDouPlusWidget previewDouPlusWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewDouPlusWidget, PreviewDouPlusWidget.LIZ, false, 13).isSupported && previewDouPlusWidget.isViewValid()) {
                    IService service = ServiceManager.getService(IUserService.class);
                    Intrinsics.checkNotNull(service);
                    IUser LIZ2 = ((IUserService) service).user().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    String secUid = LIZ2.getSecUid();
                    IService service2 = ServiceManager.getService(C30I.class);
                    Intrinsics.checkNotNull(service2);
                    s$a LIZ3 = s$a.LIZ().LIZ("entrance_type", "live_before").LIZ("pay_mode", "dou_not_iap");
                    IService service3 = ServiceManager.getService(IUserService.class);
                    Intrinsics.checkNotNull(service3);
                    IUser LIZ4 = ((IUserService) service3).user().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    ((C30I) service2).LIZ(false, "click_dou_plus", "", LIZ3.LIZ("anchor_id", String.valueOf(LIZ4.getId())).LIZ("target_step", "1").LIZ("dou_plus_medium", "live_before").LIZ("serving_type", "my_group").LIZ("dou_plus_entrance_type", "1").LIZ("dou_plus_entrance_level", "1").LIZ("dou_plus_referer", "live_before").LIZ("order_type", "live").LIZIZ);
                    final ?? r8 = new AbstractC9431d() { // from class: X.35d
                        static {
                            Covode.recordClassIndex(18503);
                        }

                        @Override // com.bytedance.android.livesdkapi.business.AbstractC9431d
                        public final void LIZ() {
                        }

                        @Override // com.bytedance.android.livesdkapi.business.AbstractC9431d
                        public final void LIZIZ() {
                        }
                    };
                    final HashMap hashMap = new HashMap();
                    hashMap.put("is_live", "0");
                    Intrinsics.checkNotNullExpressionValue(secUid, "");
                    hashMap.put("sec_anchor_id", secUid);
                    hashMap.put("live_type", C2VQ.LIZ(previewDouPlusWidget.LJIIJJI().LIZ().LIZ()));
                    if (previewDouPlusWidget.LIZLLL == 1) {
                        hashMap.put("scene", "qianchuan");
                        if (previewDouPlusWidget.f25985LJ == null && previewDouPlusWidget.context != null) {
                            Context context = previewDouPlusWidget.context;
                            if (context != null) {
                                previewDouPlusWidget.f25985LJ = new DialogC9362aa((Activity) context);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                            }
                        }
                        DialogC9362aa dialogC9362aa = previewDouPlusWidget.f25985LJ;
                        if (dialogC9362aa != null) {
                            C116971W2r.LIZJ(dialogC9362aa);
                        }
                        QianChuanApi qianChuanApi = (QianChuanApi) C88306Kqq.LIZ().LIZ(QianChuanApi.class);
                        l = null;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{qianChuanApi, 0, null, 0, null, 15, null}, null, C4314435e.LIZ, true, 1);
                        if (proxy.isSupported) {
                            qianChuanSchema = (Observable) proxy.result;
                        } else {
                            IUser LIZ5 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                            String secUid2 = LIZ5.getSecUid();
                            Intrinsics.checkNotNullExpressionValue(secUid2, "");
                            qianChuanSchema = qianChuanApi.getQianChuanSchema(2, "111", 2, secUid2);
                        }
                        Disposable subscribe = qianChuanSchema.subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<C3315bi>() { // from class: X.35a
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(18500);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(C3315bi c3315bi) {
                                C3315bi c3315bi2 = c3315bi;
                                if (!PatchProxy.proxy(new Object[]{c3315bi2}, this, LIZ, false, 1).isSupported) {
                                    DialogC9362aa dialogC9362aa2 = PreviewDouPlusWidget.this.f25985LJ;
                                    if (dialogC9362aa2 != null) {
                                        C116971W2r.LIZ(dialogC9362aa2);
                                    }
                                    if (c3315bi2.LIZLLL == 0 && c3315bi2.LIZIZ.length() > 0) {
                                        Uri.Builder buildUpon = Uri.parse(c3315bi2.LIZIZ).buildUpon();
                                        buildUpon.appendQueryParameter("utm_source", "qianchuan-origin-entrance").appendQueryParameter("utm_medium", "douyin").appendQueryParameter("utm_campaign", "dou-live-kaibo");
                                        C30I c30i2 = (C30I) ServiceManager.getService(C30I.class);
                                        if (c30i2 != null) {
                                            c30i2.LIZ(PreviewDouPlusWidget.this.context, hashMap, buildUpon.toString(), r8);
                                            return;
                                        }
                                        return;
                                    }
                                    C88440Kt0.LIZ(2131583889);
                                }
                            }
                        }, new Consumer<Throwable>() { // from class: X.35b
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(18502);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(Throwable th) {
                                if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                                    DialogC9362aa dialogC9362aa2 = PreviewDouPlusWidget.this.f25985LJ;
                                    if (dialogC9362aa2 != null) {
                                        C116971W2r.LIZ(dialogC9362aa2);
                                    }
                                    C88440Kt0.LIZ(2131583889);
                                }
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(subscribe, "");
                        previewDouPlusWidget.LIZ(subscribe);
                    } else {
                        l = null;
                        hashMap.put("scene", "dou_plus");
                        Uri.Builder buildUpon = Uri.parse(previewDouPlusWidget.LIZJ.douPlusEntry).buildUpon();
                        buildUpon.appendQueryParameter("dou_plus_source", "douyin").appendQueryParameter("dou_plus_sub_source", "origin_entrance").appendQueryParameter("dou_plus_medium", "live_before").appendQueryParameter("serving_type", "my_group").appendQueryParameter("dou_plus_entrance_type", "1").appendQueryParameter("dou_plus_entrance_level", "1").appendQueryParameter("dou_plus_referer", "live_before").appendQueryParameter("order_type", "live").appendQueryParameter("target_step", "1");
                        C30I c30i2 = (C30I) ServiceManager.getService(C30I.class);
                        if (c30i2 != 0) {
                            c30i2.LIZ(previewDouPlusWidget.context, hashMap, buildUpon.toString(), (AbstractC9431d) r8);
                        }
                        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).monitorPerformance("dou_plus");
                    }
                } else {
                    l = null;
                }
                if (this.this$0.LIZLLL == 1) {
                    this.this$0.LJFF();
                    PreviewDouPlusWidget previewDouPlusWidget2 = this.this$0;
                    if (!PatchProxy.proxy(new Object[0], previewDouPlusWidget2, PreviewDouPlusWidget.LIZ, false, 17).isSupported) {
                        C87308Kak<HashMap<String, Integer>> c87308Kak = AbstractC80293Hkt.f7209eY;
                        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                        HashMap<String, Integer> LIZ6 = c87308Kak.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                        LIZ6.put(previewDouPlusWidget2.LIZIZ(), Integer.valueOf(previewDouPlusWidget2.LIZIZ));
                    }
                    if (!PatchProxy.proxy(new Object[0], this.this$0, PreviewDouPlusWidget.LIZ, false, 10).isSupported && (c30i = (C30I) ServiceManager.getService(C30I.class)) != null) {
                        s$a LIZ7 = s$a.LIZ().LIZ("entrance_type", "live_before").LIZ("pay_mode", "dou_not_iap").LIZ("serving_type", "my_group").LIZ("room_id", "");
                        IUserService iUserService3 = (IUserService) ServiceManager.getService(IUserService.class);
                        if (iUserService3 != null && (user = iUserService3.user()) != null) {
                            l = Long.valueOf(user.LIZIZ());
                        }
                        c30i.LIZ(false, "click_live_shop_promote", "", LIZ7.LIZ("anchor_id", String.valueOf(l)).LIZ("enter_from", "live").LIZIZ);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
