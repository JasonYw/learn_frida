package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C88962L3k;
import p003X.C89119L9l;

/* loaded from: classes5.dex */
public final class AudienceBottomBarWidget$onUpdate$4 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceBottomBarWidget this$0;

    static {
        Covode.recordClassIndex(16321);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceBottomBarWidget$onUpdate$4(AudienceBottomBarWidget audienceBottomBarWidget) {
        super(1);
        this.this$0 = audienceBottomBarWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        PureWidget<?> pureWidget = this.this$0.LIZLLL;
                        if (pureWidget != null) {
                            pureWidget.LJIIJJI();
                        }
                        C89119L9l c89119L9l = this.this$0.LIZIZ;
                        if (c89119L9l != null) {
                            c89119L9l.setVisibility(8);
                        }
                        C88962L3k c88962L3k = this.this$0.LIZJ;
                        if (c88962L3k != null) {
                            c88962L3k.setVisibility(8);
                        }
                    }
                } else {
                    PureWidget<?> pureWidget2 = this.this$0.LIZLLL;
                    if (pureWidget2 != null) {
                        pureWidget2.LJIIL();
                    }
                    C89119L9l c89119L9l2 = this.this$0.LIZIZ;
                    if (c89119L9l2 != null) {
                        c89119L9l2.setVisibility(8);
                    }
                    C88962L3k c88962L3k2 = this.this$0.LIZJ;
                    if (c88962L3k2 != null) {
                        c88962L3k2.setVisibility(0);
                    }
                }
            } else {
                PureWidget<?> pureWidget3 = this.this$0.LIZLLL;
                if (pureWidget3 != null) {
                    pureWidget3.LJIIL();
                }
                C89119L9l c89119L9l3 = this.this$0.LIZIZ;
                if (c89119L9l3 != null) {
                    c89119L9l3.setVisibility(0);
                }
                C88962L3k c88962L3k3 = this.this$0.LIZJ;
                if (c88962L3k3 != null) {
                    c88962L3k3.setVisibility(8);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
