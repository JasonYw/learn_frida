package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import com.bytedance.android.livesdk.chatroom.p518ui.SSGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88172Kog;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view.OpenFeatureChooseListFragment$initGroupListView$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3769x5253ef55 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SSGridLayoutManager $lm$inlined;
    public final /* synthetic */ C88172Kog this$0;

    static {
        Covode.recordClassIndex(21365);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3769x5253ef55(C88172Kog c88172Kog, SSGridLayoutManager sSGridLayoutManager) {
        super(0);
        this.this$0 = c88172Kog;
        this.$lm$inlined = sSGridLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(this.$lm$inlined);
        }
        return Unit.INSTANCE;
    }
}
