package com.bytedance.android.live.broadcastgame.debug;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class LiveGameDebugService$setDebugContainer$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ViewGroup $containerView;
    public final /* synthetic */ WidgetManager $manager;
    public final /* synthetic */ LiveGameDebugService this$0;

    static {
        Covode.recordClassIndex(19697);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDebugService$setDebugContainer$1(LiveGameDebugService liveGameDebugService, ViewGroup viewGroup, WidgetManager widgetManager) {
        super(0);
        this.this$0 = liveGameDebugService;
        this.$containerView = viewGroup;
        this.$manager = widgetManager;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        ViewGroup viewGroup;
        int i = 0;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (viewGroup = this.$containerView) != null) {
            this.$manager.load(viewGroup, (Widget) new LiveGameDebugWidget(), true);
            if (!this.this$0.containerViewVisible) {
                i = 8;
            }
            viewGroup.setVisibility(i);
            this.this$0.containerView = new WeakReference<>(this.$containerView);
        }
        return Unit.INSTANCE;
    }
}
