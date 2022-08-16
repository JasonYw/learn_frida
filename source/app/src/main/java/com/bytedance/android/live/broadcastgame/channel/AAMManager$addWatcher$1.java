package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.channel.AAMManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class AAMManager$addWatcher$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AAMManager.AbstractC3405a $watcher;
    public final /* synthetic */ AAMManager this$0;

    static {
        Covode.recordClassIndex(19315);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAMManager$addWatcher$1(AAMManager aAMManager, AAMManager.AbstractC3405a abstractC3405a) {
        super(0);
        this.this$0 = aAMManager;
        this.$watcher = abstractC3405a;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ().add(this.$watcher);
        }
        return Unit.INSTANCE;
    }
}
