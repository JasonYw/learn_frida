package com.bytedance.android.live.broadcastgame.effectgame.choosemusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89332LHq;

/* loaded from: classes5.dex */
public final class ChooseMusicAdapter$onBindViewHolder$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89332LHq this$0;

    static {
        Covode.recordClassIndex(19798);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseMusicAdapter$onBindViewHolder$1(C89332LHq c89332LHq) {
        super(0);
        this.this$0 = c89332LHq;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ();
        }
        return Unit.INSTANCE;
    }
}
