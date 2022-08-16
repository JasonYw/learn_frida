package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorGameDetailContentWidget$onUpdate$4 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AnchorGameDetailContentWidget this$0;

    static {
        Covode.recordClassIndex(16157);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGameDetailContentWidget$onUpdate$4(AnchorGameDetailContentWidget anchorGameDetailContentWidget) {
        super(1);
        this.this$0 = anchorGameDetailContentWidget;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [byte, boolean] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        ?? booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue == true ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            AnchorGameDetailContentWidget anchorGameDetailContentWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) booleanValue)}, anchorGameDetailContentWidget, AnchorGameDetailContentWidget.LIZ, false, 7).isSupported) {
                if (booleanValue != 0) {
                    anchorGameDetailContentWidget.LIZIZ().LJIIJJI();
                } else {
                    anchorGameDetailContentWidget.LIZIZ().LJIIL();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
