package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KUB;

/* loaded from: classes12.dex */
public final class GameConditionChecker$StickerChecker$handler$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $conditionOne;
    public final /* synthetic */ boolean $conditionTwo;
    public final /* synthetic */ C3384q $gameItem;

    static {
        Covode.recordClassIndex(19612);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConditionChecker$StickerChecker$handler$2(C3384q c3384q, boolean z, boolean z2) {
        super(0);
        this.$gameItem = c3384q;
        this.$conditionOne = z;
        this.$conditionTwo = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            IInteractGameMonitorService iInteractGameMonitorService = (IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class);
            C3384q c3384q = this.$gameItem;
            if (this.$conditionOne) {
                str = "104";
            } else if (this.$conditionTwo) {
                str = "105";
            } else {
                str = "118";
            }
            KUB.LIZ(iInteractGameMonitorService, 1, c3384q, str, (String) null, (String) null, 24, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
