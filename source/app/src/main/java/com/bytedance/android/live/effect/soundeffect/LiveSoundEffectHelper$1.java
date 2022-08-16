package com.bytedance.android.live.effect.soundeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.KGJ;

/* loaded from: classes5.dex */
public final class LiveSoundEffectHelper$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KGJ this$0;

    static {
        Covode.recordClassIndex(24585);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSoundEffectHelper$1(KGJ kgj) {
        super(1);
        this.this$0 = kgj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && !booleanValue) {
            this.this$0.LIZIZ(false);
        }
        return Unit.INSTANCE;
    }
}
