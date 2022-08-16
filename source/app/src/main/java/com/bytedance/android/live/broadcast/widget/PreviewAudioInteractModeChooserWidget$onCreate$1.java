package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.broadcast.widget.PreviewAudioInteractModeChooserWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C86871KKz;
import p003X.C91301Ly3;
import p003X.C91513M3n;
import p003X.KL0;
import p003X.KL1;
import p003X.KL2;

/* loaded from: classes5.dex */
public final class PreviewAudioInteractModeChooserWidget$onCreate$1 extends Lambda implements Function1<C3258d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewAudioInteractModeChooserWidget this$0;

    static {
        Covode.recordClassIndex(18423);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAudioInteractModeChooserWidget$onCreate$1(PreviewAudioInteractModeChooserWidget previewAudioInteractModeChooserWidget) {
        super(1);
        this.this$0 = previewAudioInteractModeChooserWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3258d c3258d) {
        final C3258d c3258d2 = c3258d;
        if (!PatchProxy.proxy(new Object[]{c3258d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3258d2);
            View view = this.this$0.contentView;
            if (view != null) {
                view.post(new Runnable() { // from class: com.bytedance.android.live.broadcast.widget.PreviewAudioInteractModeChooserWidget$onCreate$1.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18424);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj;
                        int i = 1373;
                        MethodCollector.m14708i(1373);
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            MethodCollector.m14707o(1373);
                            return;
                        }
                        final PreviewAudioInteractModeChooserWidget previewAudioInteractModeChooserWidget = PreviewAudioInteractModeChooserWidget$onCreate$1.this.this$0;
                        final C3258d c3258d3 = c3258d2;
                        if (!PatchProxy.proxy(new Object[]{c3258d3}, previewAudioInteractModeChooserWidget, PreviewAudioInteractModeChooserWidget.LIZ, false, 4).isSupported && previewAudioInteractModeChooserWidget.isViewValid()) {
                            List<AudioInteractMode> list = c3258d3.LIZ;
                            ArrayList arrayList = new ArrayList();
                            for (AudioInteractMode audioInteractMode : list) {
                                KL2 kl2 = PreviewAudioInteractModeChooserWidget.LIZLLL;
                                Context context = previewAudioInteractModeChooserWidget.context;
                                Intrinsics.checkNotNullExpressionValue(context, "");
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, audioInteractMode}, kl2, KL2.LIZ, false, 1);
                                if (proxy.isSupported) {
                                    obj = proxy.result;
                                    if (obj != null) {
                                        arrayList.add(obj);
                                    }
                                } else {
                                    PreviewAudioInteractModeChooserWidget.C3286b c3286b = PreviewAudioInteractModeChooserWidget.LIZJ.get(audioInteractMode);
                                    if (c3286b != null) {
                                        obj = new KL0(context, audioInteractMode, c3286b);
                                        arrayList.add(obj);
                                    }
                                }
                            }
                            ArrayList<KL0> arrayList2 = arrayList;
                            final PreviewAudioInteractModeChooserWidget$initView$getTabLP$1 previewAudioInteractModeChooserWidget$initView$getTabLP$1 = new PreviewAudioInteractModeChooserWidget$initView$getTabLP$1(arrayList2);
                            final LinearLayout linearLayout = (LinearLayout) previewAudioInteractModeChooserWidget.contentView.findViewById(2131180866);
                            for (final KL0 kl0 : arrayList2) {
                                kl0.LIZIZ.setOnClickListener(new View.OnClickListener(previewAudioInteractModeChooserWidget, c3258d3, linearLayout, previewAudioInteractModeChooserWidget$initView$getTabLP$1) { // from class: X.3Um
                                    public static ChangeQuickRedirect LIZ;
                                    public final /* synthetic */ PreviewAudioInteractModeChooserWidget LIZJ;
                                    public final /* synthetic */ C3258d LIZLLL;

                                    static {
                                        Covode.recordClassIndex(18419);
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        long j;
                                        C3VF user;
                                        if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        this.LIZLLL.LIZIZ.LIZ(KL0.this.LIZLLL);
                                        PreviewAudioInteractModeChooserWidget previewAudioInteractModeChooserWidget2 = this.LIZJ;
                                        if (!PatchProxy.proxy(new Object[0], previewAudioInteractModeChooserWidget2, PreviewAudioInteractModeChooserWidget.LIZ, false, 5).isSupported) {
                                            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                                            if (iUserService != null && (user = iUserService.user()) != null) {
                                                j = user.LIZIZ();
                                            } else {
                                                j = 0;
                                            }
                                            C4574547f.LIZ().LIZ("livesdk_takepage_play_icon_click", MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchor_id", String.valueOf(j)), TuplesKt.m137to("live_type", C442873fV.LIZ.LIZ(previewAudioInteractModeChooserWidget2.LJIIJJI().LIZ().LIZ()))), new Object[0]);
                                        }
                                    }
                                });
                                View view2 = kl0.LIZIZ;
                                View view3 = previewAudioInteractModeChooserWidget.contentView;
                                Intrinsics.checkNotNullExpressionValue(view3, "");
                                linearLayout.addView(view2, previewAudioInteractModeChooserWidget$initView$getTabLP$1.invoke(Integer.valueOf(view3.getWidth())));
                            }
                            Disposable subscribe = C91301Ly3.LIZIZ(C91513M3n.LIZIZ(c3258d3.LIZIZ)).subscribe(new C86871KKz(arrayList2));
                            Intrinsics.checkNotNullExpressionValue(subscribe, "");
                            previewAudioInteractModeChooserWidget.LIZ(subscribe);
                            View view4 = previewAudioInteractModeChooserWidget.contentView;
                            Intrinsics.checkNotNullExpressionValue(view4, "");
                            view4.getViewTreeObserver().addOnGlobalLayoutListener(new KL1(previewAudioInteractModeChooserWidget, arrayList2, previewAudioInteractModeChooserWidget$initView$getTabLP$1));
                            i = 1373;
                        }
                        MethodCollector.m14707o(i);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
