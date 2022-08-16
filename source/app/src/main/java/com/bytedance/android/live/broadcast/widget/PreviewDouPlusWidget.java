package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.log.s$a;
import com.bytedance.android.livesdk.widget.DialogC9362aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C30I;
import p003X.C30K;
import p003X.C3VF;
import p003X.C81280I1y;
import p003X.KK6;

@AbstractC445813kF(LIZ = "DOU_PLUS")
/* loaded from: classes12.dex */
public final class PreviewDouPlusWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LIZLLL;

    /* renamed from: LJ */
    public DialogC9362aa f25985LJ;
    public final int LIZIZ = 2;
    public DouPlusEntry LIZJ = DouPlusEntry.LIZ();
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(PreviewDouPlusWidget$curUserId$2.INSTANCE);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(new PreviewDouPlusWidget$dotView$2(this));
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(new PreviewDouPlusWidget$iconView$2(this));
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(new PreviewDouPlusWidget$iconText$2(this));

    static {
        Covode.recordClassIndex(18495);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewDouPlusWidget";
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (String) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final View LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (View) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final ImageView LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (ImageView) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    /* renamed from: LJ */
    public final TextView m15871LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a226";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 19).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJFF() {
        View LIZJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && (LIZJ = LIZJ()) != null) {
            LIZJ.setVisibility(4);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131698441;
        }
        return 2131698440;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C3VF user;
        Single<IUser> LJIIIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        LJIILL();
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null && (LJIIIZ = user.LJIIIZ()) != null) {
            LJIIIZ.subscribe(new C81280I1y());
        }
        ((ImageView) this.contentView.findViewById(2131172749)).setImageResource(2130855487);
        C30I c30i = (C30I) ServiceManager.getService(C30I.class);
        if (c30i == null) {
            return;
        }
        int LJFF = c30i.LJFF();
        if (LJFF != 0) {
            ((ImageView) this.contentView.findViewById(2131172749)).setImageResource(LJFF);
        }
        IService service = ServiceManager.getService(IUserService.class);
        Intrinsics.checkNotNull(service);
        IUser LIZ2 = ((IUserService) service).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        c30i.LIZ(LIZ2.getSecUid(), 0L, "live_before", new C30K<DouPlusEntry>() { // from class: X.35Y
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18496);
            }

            @Override // p003X.C30K
            public final /* synthetic */ void onChanged(DouPlusEntry douPlusEntry) {
                DouPlusEntry douPlusEntry2 = douPlusEntry;
                if (!PatchProxy.proxy(new Object[]{douPlusEntry2}, this, LIZ, false, 1).isSupported && douPlusEntry2 != null) {
                    PreviewDouPlusWidget previewDouPlusWidget = PreviewDouPlusWidget.this;
                    previewDouPlusWidget.LIZJ = douPlusEntry2;
                    previewDouPlusWidget.LJIIJJI().LJIIIIZZ().LIZ(PreviewDouPlusWidget.this.LIZJ);
                    if (PreviewDouPlusWidget.this.isViewValid()) {
                        PreviewDouPlusWidget.this.LJIIJJI().LJI().LIZ().hasLastRoomInfo();
                        if (PreviewDouPlusWidget.this.LIZJ.hasDouPlusEntry) {
                            PreviewDouPlusWidget.this.LJIILJJIL();
                        } else {
                            PreviewDouPlusWidget.this.LJIILL();
                        }
                        PreviewDouPlusWidget previewDouPlusWidget2 = PreviewDouPlusWidget.this;
                        if (!PatchProxy.proxy(new Object[0], previewDouPlusWidget2, PreviewDouPlusWidget.LIZ, false, 12).isSupported) {
                            ViewGroup viewGroup = previewDouPlusWidget2.containerView;
                            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                            if (viewGroup.getVisibility() == 0) {
                                IService service2 = ServiceManager.getService(C30I.class);
                                Intrinsics.checkNotNull(service2);
                                s$a LIZ3 = s$a.LIZ().LIZ("entrance_type", "live_before").LIZ("pay_mode", "dou_not_iap");
                                IService service3 = ServiceManager.getService(IUserService.class);
                                Intrinsics.checkNotNull(service3);
                                ((C30I) service2).LIZ(false, "show_dou_plus", "", LIZ3.LIZ("anchor_id", String.valueOf(((IUserService) service3).user().LIZIZ())).LIZ("target_step", "1").LIZ("dou_plus_medium", "live_before").LIZ("serving_type", "my_group").LIZ("dou_plus_entrance_type", "1").LIZ("dou_plus_entrance_level", "1").LIZ("dou_plus_referer", "live_before").LIZ("order_type", "live").LIZIZ);
                            }
                        }
                    }
                }
            }
        });
        LIZJ(new PreviewDouPlusWidget$onCreate$2(this));
        Disposable subscribe = LJIIJJI().LJI().LIZIZ().subscribe(new Consumer<PermissionResult>() { // from class: X.35c
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18497);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(PermissionResult permissionResult) {
                PermissionResult permissionResult2 = permissionResult;
                if (!PatchProxy.proxy(new Object[]{permissionResult2}, this, LIZ, false, 1).isSupported) {
                    PreviewDouPlusWidget.this.LIZ(!permissionResult2.hasLastRoomInfo());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        Disposable subscribe2 = LJIIJJI().m15893LJ().LIZIZ().subscribe(new Consumer<PreviewStatusInfo>() { // from class: X.35Z
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18498);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(PreviewStatusInfo previewStatusInfo) {
                int i;
                C30I c30i2;
                Long l;
                C3VF user2;
                PreviewStatusInfo previewStatusInfo2 = previewStatusInfo;
                Integer num = 0;
                if (!PatchProxy.proxy(new Object[]{previewStatusInfo2}, this, LIZ, false, 1).isSupported) {
                    PreviewDouPlusWidget previewDouPlusWidget = PreviewDouPlusWidget.this;
                    int LIZ3 = previewStatusInfo2.LIZ();
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZ3)}, previewDouPlusWidget, PreviewDouPlusWidget.LIZ, false, 8).isSupported) {
                        C30I c30i3 = (C30I) ServiceManager.getService(C30I.class);
                        if (previewDouPlusWidget.LJIILIIL() == 0) {
                            if (previewDouPlusWidget.LIZLLL != 1 && LIZ3 == 1) {
                                ImageView LIZLLL = previewDouPlusWidget.LIZLLL();
                                if (LIZLLL != null) {
                                    LIZLLL.setImageResource(2130855489);
                                }
                                TextView m15871LJ = previewDouPlusWidget.m15871LJ();
                                if (m15871LJ != null) {
                                    m15871LJ.setText(2131586100);
                                }
                                if (!PatchProxy.proxy(new Object[0], previewDouPlusWidget, PreviewDouPlusWidget.LIZ, false, 14).isSupported) {
                                    C87308Kak<HashMap<String, Integer>> c87308Kak = AbstractC80293Hkt.f7209eY;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                                    Integer num2 = c87308Kak.LIZ().get(previewDouPlusWidget.LIZIZ());
                                    if (num2 == null) {
                                        num2 = num;
                                    }
                                    if (Intrinsics.compare(num2.intValue(), previewDouPlusWidget.LIZIZ) < 0) {
                                        if (!PatchProxy.proxy(new Object[0], previewDouPlusWidget, PreviewDouPlusWidget.LIZ, false, 15).isSupported) {
                                            C87308Kak<HashMap<String, Integer>> c87308Kak2 = AbstractC80293Hkt.f7209eY;
                                            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                                            Integer num3 = c87308Kak2.LIZ().get(previewDouPlusWidget.LIZIZ());
                                            if (num3 != null) {
                                                num = num3;
                                            }
                                            Intrinsics.checkNotNullExpressionValue(num, "");
                                            int intValue = num.intValue();
                                            C87308Kak<HashMap<String, Integer>> c87308Kak3 = AbstractC80293Hkt.f7209eY;
                                            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                                            HashMap<String, Integer> LIZ4 = c87308Kak3.LIZ();
                                            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                                            LIZ4.put(previewDouPlusWidget.LIZIZ(), Integer.valueOf(intValue + 1));
                                            View LIZJ = previewDouPlusWidget.LIZJ();
                                            if (LIZJ != null) {
                                                LIZJ.setVisibility(0);
                                            }
                                        }
                                    } else {
                                        previewDouPlusWidget.LJFF();
                                    }
                                }
                                if (!PatchProxy.proxy(new Object[0], previewDouPlusWidget, PreviewDouPlusWidget.LIZ, false, 9).isSupported && (c30i2 = (C30I) ServiceManager.getService(C30I.class)) != null) {
                                    s$a LIZ5 = s$a.LIZ().LIZ("entrance_type", "live_before").LIZ("pay_mode", "dou_not_iap").LIZ("serving_type", "my_group").LIZ("room_id", "");
                                    IUserService iUserService2 = (IUserService) ServiceManager.getService(IUserService.class);
                                    if (iUserService2 != null && (user2 = iUserService2.user()) != null) {
                                        l = Long.valueOf(user2.LIZIZ());
                                    } else {
                                        l = null;
                                    }
                                    c30i2.LIZ(false, "show_live_shop_promote", "", LIZ5.LIZ("anchor_id", String.valueOf(l)).LIZ("enter_from", "live").LIZIZ);
                                }
                            } else if (previewDouPlusWidget.LIZLLL == 1 && LIZ3 != 1) {
                                ImageView LIZLLL2 = previewDouPlusWidget.LIZLLL();
                                if (LIZLLL2 != null) {
                                    if (c30i3 != null && c30i3.LJFF() != 0) {
                                        i = c30i3.LJFF();
                                    } else {
                                        i = 2130855487;
                                    }
                                    LIZLLL2.setImageResource(i);
                                }
                                TextView m15871LJ2 = previewDouPlusWidget.m15871LJ();
                                if (m15871LJ2 != null) {
                                    m15871LJ2.setText(2131586099);
                                }
                                previewDouPlusWidget.LJFF();
                            }
                        }
                    }
                    PreviewDouPlusWidget.this.LIZLLL = previewStatusInfo2.LIZ();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe2, "");
        LIZ(subscribe2);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        int i = !z ? 1 : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("entrance_type", "live_before");
            if (i == 0) {
                jSONObject.put("error_status", 10000);
                jSONObject.put(PushMessageHelper.ERROR_MESSAGE, "用户未开播过");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ((C30I) ServiceManager.getService(C30I.class)).LIZ("douplus_live_entry", i, jSONObject);
    }
}
