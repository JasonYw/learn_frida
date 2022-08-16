package com.bytedance.android.live.broadcastgame;

import com.bytedance.android.live.broadcastgame.api.interactgame.m$b;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AnchorGameStatusDispatcher$dispatcherGameStop$1 extends Lambda implements Function1<m$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3384q $game;

    static {
        Covode.recordClassIndex(18991);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGameStatusDispatcher$dispatcherGameStop$1(C3384q c3384q) {
        super(1);
        this.$game = c3384q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(m$b m_b) {
        m$b m_b2 = m_b;
        if (!PatchProxy.proxy(new Object[]{m_b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(m_b2);
            m_b2.LIZIZ(this.$game);
        }
        return Unit.INSTANCE;
    }
}
