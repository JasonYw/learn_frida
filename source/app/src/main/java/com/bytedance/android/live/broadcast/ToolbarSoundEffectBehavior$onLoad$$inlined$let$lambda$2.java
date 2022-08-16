package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.effect.soundeffect.SoundRepelContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C79169HIt;
import p003X.KGQ;

/* loaded from: classes5.dex */
public final class ToolbarSoundEffectBehavior$onLoad$$inlined$let$lambda$2 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KGQ this$0;

    static {
        Covode.recordClassIndex(14305);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarSoundEffectBehavior$onLoad$$inlined$let$lambda$2(KGQ kgq) {
        super(1);
        this.this$0 = kgq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        SoundRepelContext.SoundEffectState soundEffectState;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            KGQ kgq = this.this$0;
            if (C79169HIt.LIZIZ(intValue, 1)) {
                soundEffectState = SoundRepelContext.SoundEffectState.DISABLE_CAUSE_KTV;
            } else {
                soundEffectState = SoundRepelContext.SoundEffectState.ENABLE;
            }
            kgq.LJFF = soundEffectState;
        }
        return Unit.INSTANCE;
    }
}
