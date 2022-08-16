package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.L70;

/* loaded from: classes5.dex */
public final class GameDetailContentWidget$closeClickAction$1 extends Lambda implements Function0<Unit> {
    public static final GameDetailContentWidget$closeClickAction$1 INSTANCE = new GameDetailContentWidget$closeClickAction$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16571);
    }

    public GameDetailContentWidget$closeClickAction$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            L70.LIZJ.LIZ();
        }
        return Unit.INSTANCE;
    }
}
