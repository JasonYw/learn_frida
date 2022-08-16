package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87911KkT;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingManagerV2$useSnapshot$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $result;

    static {
        Covode.recordClassIndex(21585);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingManagerV2$useSnapshot$2(Function1 function1) {
        super(0);
        this.$result = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87911KkT.LIZ(C87911KkT.LIZIZ, "initMountParams upload fail", null, 2, null);
            this.$result.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
