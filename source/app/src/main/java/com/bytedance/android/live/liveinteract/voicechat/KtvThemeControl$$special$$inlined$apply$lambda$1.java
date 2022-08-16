package com.bytedance.android.live.liveinteract.voicechat;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.interfaces.DraweeController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C80596Hpm;

/* loaded from: classes3.dex */
public final class KtvThemeControl$$special$$inlined$apply$lambda$1 extends Lambda implements Function2<Integer, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80596Hpm this$0;

    static {
        Covode.recordClassIndex(30808);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvThemeControl$$special$$inlined$apply$lambda$1(C80596Hpm c80596Hpm) {
        super(2);
        this.this$0 = c80596Hpm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        DraweeController controller;
        Animatable animatable;
        DraweeController controller2;
        Animatable animatable2;
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue && (controller = this.this$0.LIZIZ.getController()) != null && (animatable = controller.getAnimatable()) != null && animatable.isRunning() && (controller2 = this.this$0.LIZIZ.getController()) != null && (animatable2 = controller2.getAnimatable()) != null) {
            animatable2.stop();
        }
        return Unit.INSTANCE;
    }
}
