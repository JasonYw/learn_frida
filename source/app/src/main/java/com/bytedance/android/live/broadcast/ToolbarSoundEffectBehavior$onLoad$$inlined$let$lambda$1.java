package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.effect.soundeffect.SoundRepelContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KGQ;

/* loaded from: classes5.dex */
public final class ToolbarSoundEffectBehavior$onLoad$$inlined$let$lambda$1 extends Lambda implements Function1<SoundRepelContext.SoundEffectState, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KGQ this$0;

    static {
        Covode.recordClassIndex(14304);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarSoundEffectBehavior$onLoad$$inlined$let$lambda$1(KGQ kgq) {
        super(1);
        this.this$0 = kgq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(SoundRepelContext.SoundEffectState soundEffectState) {
        SoundRepelContext.SoundEffectState soundEffectState2 = soundEffectState;
        if (!PatchProxy.proxy(new Object[]{soundEffectState2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(soundEffectState2);
            this.this$0.LJFF = soundEffectState2;
        }
        return Unit.INSTANCE;
    }
}
