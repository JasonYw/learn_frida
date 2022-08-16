package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C436463Om;
import p003X.C442873fV;
import p003X.C4574547f;
import p003X.C87308Kak;

/* loaded from: classes12.dex */
public final class PreviewReverseCameraWidget$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewReverseCameraWidget this$0;

    static {
        Covode.recordClassIndex(18638);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewReverseCameraWidget$onCreate$1(PreviewReverseCameraWidget previewReverseCameraWidget) {
        super(1);
        this.this$0 = previewReverseCameraWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LIZIZ) {
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setDuration(300L);
                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                View view2 = this.this$0.contentView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                ((ImageView) view2.findViewById(2131168945)).startAnimation(rotateAnimation);
                int intValue = 1 - this.this$0.LJIIJJI().LJII().LIZ().intValue();
                this.this$0.LJIIJJI().LJII().LIZ(Integer.valueOf(intValue));
                C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJII;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZIZ(Integer.valueOf(intValue));
                this.this$0.LIZ(intValue);
                C436463Om c436463Om = C436463Om.LIZIZ;
                LiveMode LIZ = this.this$0.LJIIJJI().LIZ().LIZ();
                if (!PatchProxy.proxy(new Object[]{LIZ}, c436463Om, C436463Om.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(LIZ);
                    long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
                    C4574547f LIZ2 = C4574547f.LIZ();
                    HashMap hashMap = new HashMap();
                    hashMap.put("action_type", "click");
                    hashMap.put("live_type", C442873fV.LIZ.LIZIZ(LIZ));
                    hashMap.put("user_id", String.valueOf(LIZIZ));
                    LIZ2.LIZJ("livesdk_camera_switch", hashMap, Reflection.getOrCreateKotlinClass(C8668v.class));
                }
                ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).monitorPerformance("camera");
            }
        }
        return Unit.INSTANCE;
    }
}
