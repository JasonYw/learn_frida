package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C109344T3i;

/* renamed from: com.bytedance.android.live.lynx.ui.GamecpExposeView$1 */
/* loaded from: classes10.dex */
public final class GamecpExposeView$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C109344T3i this$0;

    static {
        Covode.recordClassIndex(32317);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamecpExposeView$1(C109344T3i c109344T3i) {
        super(2);
        this.this$0 = c109344T3i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Float f) {
        boolean booleanValue = bool.booleanValue();
        float floatValue = f.floatValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Float.valueOf(floatValue)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue && !this.this$0.appearListener.onViewAppear(floatValue)) {
            this.this$0.detachViewAppearObserver();
        }
        return Unit.INSTANCE;
    }
}
