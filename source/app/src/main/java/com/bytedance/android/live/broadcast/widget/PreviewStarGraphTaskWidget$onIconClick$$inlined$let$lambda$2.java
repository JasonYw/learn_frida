package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PreviewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $cb$inlined;
    public final /* synthetic */ PreviewStarGraphTaskWidget this$0;

    static {
        Covode.recordClassIndex(18695);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewStarGraphTaskWidget$onIconClick$$inlined$let$lambda$2(PreviewStarGraphTaskWidget previewStarGraphTaskWidget, Function1 function1) {
        super(0);
        this.this$0 = previewStarGraphTaskWidget;
        this.$cb$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$cb$inlined.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
