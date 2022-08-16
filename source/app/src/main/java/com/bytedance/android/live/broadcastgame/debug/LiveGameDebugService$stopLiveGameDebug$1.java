package com.bytedance.android.live.broadcastgame.debug;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class LiveGameDebugService$stopLiveGameDebug$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LiveGameDebugService this$0;

    static {
        Covode.recordClassIndex(19699);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDebugService$stopLiveGameDebug$1(LiveGameDebugService liveGameDebugService) {
        super(0);
        this.this$0 = liveGameDebugService;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        ViewGroup viewGroup;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            WeakReference<ViewGroup> weakReference = this.this$0.containerView;
            if (weakReference != null && (viewGroup = weakReference.get()) != null) {
                viewGroup.setVisibility(8);
            }
            this.this$0.containerViewVisible = false;
        }
        return Unit.INSTANCE;
    }
}
