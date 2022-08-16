package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$switchPortraitScreen$1 extends Lambda implements Function1<Animator, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PanelType $fromPanelType;
    public final /* synthetic */ PanelType $toPanelType;
    public final /* synthetic */ FullScreenOpenPanel this$0;

    static {
        Covode.recordClassIndex(20768);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$switchPortraitScreen$1(FullScreenOpenPanel fullScreenOpenPanel, PanelType panelType, PanelType panelType2) {
        super(1);
        this.this$0 = fullScreenOpenPanel;
        this.$toPanelType = panelType;
        this.$fromPanelType = panelType2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Animator animator) {
        if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(animator);
            this.this$0.LJIIIIZZ();
            if (this.$toPanelType == PanelType.PANEL_TYPE_PORTRAIT) {
                this.this$0.LIZIZ(this.$toPanelType);
                this.this$0.LJIIJJI();
            } else {
                if (this.$fromPanelType == PanelType.PANEL_TYPE_PORTRAIT) {
                    this.this$0.m15845LJ(true);
                }
                this.this$0.LIZIZ(this.$toPanelType);
                this.this$0.LIZLLL(true);
            }
            if (this.$fromPanelType != null) {
                this.this$0.LIZJ(this.$toPanelType);
            }
        }
        return Unit.INSTANCE;
    }
}
