package com.bytedance.android.live.broadcastgame.effectgame.base;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87119KUn;

/* loaded from: classes5.dex */
public final class SafeThreadEffectFetchCallBackDelegate$onProgress$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $percentage;
    public final /* synthetic */ long $size;
    public final /* synthetic */ Sticker $sticker;
    public final /* synthetic */ int $type;
    public final /* synthetic */ C87119KUn this$0;

    static {
        Covode.recordClassIndex(19758);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeThreadEffectFetchCallBackDelegate$onProgress$1(C87119KUn c87119KUn, int i, int i2, long j, Sticker sticker) {
        super(0);
        this.this$0 = c87119KUn;
        this.$type = i;
        this.$percentage = i2;
        this.$size = j;
        this.$sticker = sticker;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZ(this.$type, this.$percentage, this.$size, this.$sticker);
        }
        return Unit.INSTANCE;
    }
}
