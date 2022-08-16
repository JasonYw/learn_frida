package com.bytedance.android.live.broadcast.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.api.model.C2902ak;
import com.bytedance.android.live.broadcast.api.model.C2907c;
import com.bytedance.android.live.broadcast.api.model.C2912i;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3260j;
import com.bytedance.android.live.browser.jsbridge.event.C3948ai;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC76988GWw;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C77947Go9;
import p003X.C87010KQi;
import p003X.DialogInterface$OnClickListenerC77945Go7;
import p003X.DialogInterface$OnClickListenerC77946Go8;
import p003X.KM9;
import p003X.RunnableC77948GoA;

@AbstractC445813kF(LIZ = "STAR_GRAPH_TASK")
/* loaded from: classes3.dex */
public final class PreviewStarGraphTaskWidget extends AbsPreviewWidget implements AbstractC76988GWw, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(PreviewStarGraphTaskWidget$viewModel$2.INSTANCE);
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new PreviewStarGraphTaskWidget$redDotView$2(this));

    static {
        Covode.recordClassIndex(18682);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewStarGraphTaskWidget";
    }

    public final C3260j LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3260j) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698478;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C3199v LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C3199v) proxy.result;
        }
        return (C3199v) LIZ(C3199v.class).mo27335getValue();
    }

    public final long LIZJ() {
        C3VF user;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            return user.LIZIZ();
        }
        return -1L;
    }

    /* renamed from: LJ */
    public final Map<String, String> m15861LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", String.valueOf(LIZJ()));
        return linkedHashMap;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onCreate();
        LIZ(Intrinsics.areEqual(LIZIZ().LIZLLL.getValue(), Boolean.TRUE));
        LIZJ(new PreviewStarGraphTaskWidget$onCreate$1(this));
    }

    public PreviewStarGraphTaskWidget() {
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ(C3948ai.class).m151as(autoDispose())).LIZ(new Consumer<C3948ai>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewStarGraphTaskWidget.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18683);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C3948ai c3948ai) {
                C3948ai c3948ai2 = c3948ai;
                if (!PatchProxy.proxy(new Object[]{c3948ai2}, this, LIZ, false, 1).isSupported) {
                    PreviewStarGraphTaskWidget.this.LIZLLL().LJJIJLIJ().LIZ(new C3199v.C3200b(true, c3948ai2.LIZIZ));
                }
            }
        }, new Consumer<Throwable>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewStarGraphTaskWidget.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18684);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Throwable th) {
                if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                    String LIZ2 = PreviewStarGraphTaskWidget.this.LIZ();
                    ALogger.m15800e(LIZ2, "subscribe SetStarGraphTaskEvent error: " + th);
                }
            }
        });
        LIZIZ().LIZIZ.observe(this, new Observer<C2912i>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewStarGraphTaskWidget.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18685);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(C2912i c2912i) {
                C2907c LIZ2;
                C2912i c2912i2 = c2912i;
                if (!PatchProxy.proxy(new Object[]{c2912i2}, this, LIZ, false, 1).isSupported && c2912i2 != null && (LIZ2 = c2912i2.LIZ()) != null) {
                    List list = ArraysKt___ArraysKt.toList(new String[]{"commerce", "star_order_id", LIZ2.LIZIZ});
                    C2WC<C3199v.C3200b> LJJIJLIJ = PreviewStarGraphTaskWidget.this.LIZLLL().LJJIJLIJ();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("payload", "[" + GsonProtectorUtils.toJson(KM9.LIZIZ(), list) + LoggerUtil.M_RIGHT_TAG);
                    LJJIJLIJ.LIZ(new C3199v.C3200b(false, linkedHashMap));
                }
            }
        });
        LIZIZ().LIZLLL.observe(this, new Observer<Boolean>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewStarGraphTaskWidget.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18686);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(Boolean bool) {
                if (!PatchProxy.proxy(new Object[]{bool}, this, LIZ, false, 1).isSupported) {
                    PreviewStarGraphTaskWidget.this.LIZ(Intrinsics.areEqual(bool, Boolean.TRUE));
                }
            }
        });
        LIZIZ().LJFF.observe(this, new Observer<Boolean>() { // from class: com.bytedance.android.live.broadcast.widget.PreviewStarGraphTaskWidget.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18687);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(Boolean bool) {
                if (!PatchProxy.proxy(new Object[]{bool}, this, LIZ, false, 1).isSupported) {
                    PreviewStarGraphTaskWidget.this.LIZIZ(Intrinsics.areEqual(bool, Boolean.TRUE));
                }
            }
        });
        LIZIZ().LJI.observe(this, new C33006());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        if (liveMode == LiveMode.SCREEN_RECORD) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PREVIEW_STAR_TASK_ENTER_POINT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LIZIZ().LIZ(LIZJ());
            }
        }
    }

    @Override // p003X.AbstractC76988GWw
    public final void LIZIZ(Function1<? super Boolean, Unit> function1) {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        C2WC<LiveMode> c2wc = LIZLLL().LIZJ;
        if (c2wc != null) {
            liveMode = c2wc.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.SCREEN_RECORD) {
            LIZLLL(function1);
        } else {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewStarGraphTaskWidget$6 */
    /* loaded from: classes3.dex */
    public static final class C33006<T> implements Observer<String> {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(18688);
        }

        public C33006() {
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(String str) {
            String str2 = str;
            if (!PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 1).isSupported && str2 != null && !TextUtils.isEmpty(str2)) {
                PreviewStarGraphTaskWidget.this.LJIIJJI().LJIILIIL().LIZ(new C2902ak("STAR_GRAPH_TASK", true, str2));
                ViewGroup viewGroup = PreviewStarGraphTaskWidget.this.containerView;
                if (viewGroup != null) {
                    viewGroup.postDelayed(new RunnableC77948GoA(this, str2), LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME);
                }
                PreviewStarGraphTaskWidget.this.LIZIZ().LIZ(PreviewStarGraphTaskWidget.this.LIZJ(), 3, CollectionsKt__CollectionsKt.emptyList());
            }
        }
    }

    public final void LIZ(boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (z) {
            C4574547f LIZ2 = C4574547f.LIZ();
            Map<String, String> m15861LJ = m15861LJ();
            if (Intrinsics.areEqual(LIZIZ().LJFF.getValue(), Boolean.TRUE)) {
                str = "1";
            } else {
                str = "0";
            }
            m15861LJ.put("is_yellow_point", str);
            LIZ2.LIZ("livesdk_xingtu_icon_show", m15861LJ, new Object[0]);
            if (LJIIJJI().LIZ().LIZ() == LiveMode.SCREEN_RECORD) {
                LJIILJJIL();
                return;
            }
        }
        LJIILL();
    }

    public final void LIZIZ(boolean z) {
        Object mo27335getValue;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = this.LIZLLL.mo27335getValue();
        }
        View view = (View) mo27335getValue;
        Intrinsics.checkNotNullExpressionValue(view, "");
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void LIZLLL(Function1<? super Boolean, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C2912i value = LIZIZ().LIZIZ.getValue();
        if (value != null) {
            if (value.LIZIZ != 0 && !this.LIZJ) {
                C77947Go9 c77947Go9 = value.LIZJ;
                PreviewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$1 previewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$1 = new PreviewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$1(this, function1);
                PreviewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$2 previewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$2 = new PreviewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$2(this, function1);
                if (!PatchProxy.proxy(new Object[]{c77947Go9, previewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$1, previewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$2}, this, LIZ, false, 10).isSupported) {
                    this.LIZJ = true;
                    C4574547f.LIZ().LIZ("livesdk_xingtu_open_panel_show", m15861LJ(), new Object[0]);
                    v$a v_a = new v$a(getContext(), 4);
                    v_a.LIZ(false);
                    v_a.LIZIZ(c77947Go9.LIZJ);
                    v_a.LIZIZ(0, c77947Go9.LIZLLL, new DialogInterface$OnClickListenerC77945Go7(this, previewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$1)).LIZIZ(1, c77947Go9.f6465LJ, new DialogInterface$OnClickListenerC77946Go8(this, previewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$2)).LIZJ();
                    LIZIZ().LIZ(LIZJ(), 1, CollectionsKt__CollectionsKt.emptyList());
                    return;
                }
                return;
            }
            function1.invoke(Boolean.TRUE);
            return;
        }
        function1.invoke(Boolean.TRUE);
    }
}
