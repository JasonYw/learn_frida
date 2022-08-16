package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AudienceOrderGameInfoItemWidget$onUpdate$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceOrderGameInfoItemWidget this$0;

    static {
        Covode.recordClassIndex(16355);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceOrderGameInfoItemWidget$onUpdate$2(AudienceOrderGameInfoItemWidget audienceOrderGameInfoItemWidget) {
        super(1);
        this.this$0 = audienceOrderGameInfoItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                this.this$0.LIZJ().LJIIJJI();
            } else {
                this.this$0.LIZJ().LJIIL();
            }
        }
        return Unit.INSTANCE;
    }
}
