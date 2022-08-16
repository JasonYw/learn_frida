package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.AbstractC2891l;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.p1543ui.list.UIList;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.lynx.ui.GamecpUIList */
/* loaded from: classes10.dex */
public final class GamecpUIList extends UIList {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32318);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamecpUIList(LynxContext lynxContext) {
        super(lynxContext);
        C106862S5w.LIZ(lynxContext);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.list.UIList
    public final RecyclerView createRecyclerView(Context context) {
        AbstractC2891l gamePromoteService;
        RecyclerView LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (RecyclerView) proxy.result;
        }
        C106862S5w.LIZ(context);
        IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.getService(IBroadcastService.class);
        if (iBroadcastService == null || (gamePromoteService = iBroadcastService.getGamePromoteService()) == null || (LIZIZ = gamePromoteService.LIZIZ(context)) == null) {
            RecyclerView createRecyclerView = super.createRecyclerView(context);
            Intrinsics.checkNotNullExpressionValue(createRecyclerView, "");
            return createRecyclerView;
        }
        return LIZIZ;
    }
}
