package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AudienceBottomBarWidget$onUpdate$6 extends Lambda implements Function1<C3119b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3083c $props;
    public final /* synthetic */ AudienceBottomBarWidget this$0;

    static {
        Covode.recordClassIndex(16323);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceBottomBarWidget$onUpdate$6(AudienceBottomBarWidget audienceBottomBarWidget, C3083c c3083c) {
        super(1);
        this.this$0 = audienceBottomBarWidget;
        this.$props = c3083c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3119b c3119b) {
        C3119b c3119b2 = c3119b;
        if (!PatchProxy.proxy(new Object[]{c3119b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3119b2);
            if (this.$props.LIZJ == 1) {
                this.this$0.LIZ(c3119b2, this.$props.f25868LJ);
            }
        }
        return Unit.INSTANCE;
    }
}
