package com.bytedance.android.live.broadcastgame.opengame.runtime;

import android.view.View;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.service.CommercialService;
import com.bytedance.android.live.broadcastgame.opengame.view.C3731ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87953Kl9;
import p003X.C106862S5w;
import p003X.C87993Kln;

/* loaded from: classes5.dex */
public final class LiveBasePluginWithPanel$initPanelAndHide$3 extends Lambda implements Function1<AbstractC3609d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC87953Kl9 this$0;

    static {
        Covode.recordClassIndex(20841);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBasePluginWithPanel$initPanelAndHide$3(AbstractC87953Kl9 abstractC87953Kl9) {
        super(1);
        this.this$0 = abstractC87953Kl9;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LiveBasePluginWithPanel$initPanelAndHide$3$2 */
    /* loaded from: classes5.dex */
    public static final class C36202 extends Lambda implements Function1<C3731ad, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ AbstractC3609d $this_withPanel;

        static {
            Covode.recordClassIndex(20843);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36202(AbstractC3609d abstractC3609d) {
            super(1);
            this.$this_withPanel = abstractC3609d;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3731ad c3731ad) {
            C3731ad c3731ad2 = c3731ad;
            if (!PatchProxy.proxy(new Object[]{c3731ad2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3731ad2);
                if (LiveBasePluginWithPanel$initPanelAndHide$3.this.this$0.getCommercialService().LIZJ()) {
                    AbstractC3609d abstractC3609d = this.$this_withPanel;
                    c3731ad2.LIZLLL = abstractC3609d;
                    abstractC3609d.addTopMessageView(c3731ad2);
                    this.$this_withPanel.LIZIZ(8);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3609d abstractC3609d) {
        AbstractC3609d abstractC3609d2 = abstractC3609d;
        if (!PatchProxy.proxy(new Object[]{abstractC3609d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3609d2);
            this.this$0.onPanelCreate(abstractC3609d2);
            abstractC3609d2.LIZ(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcastgame.opengame.runtime.LiveBasePluginWithPanel$initPanelAndHide$3.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(20842);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LiveBasePluginWithPanel$initPanelAndHide$3.this.this$0.pluginContext.LJI.LJII();
                }
            });
            abstractC3609d2.registerListener(this.this$0.pluginContext);
            abstractC3609d2.LJFF();
            abstractC3609d2.addTopRightBtnView(new C87993Kln(this.this$0.pluginContext, abstractC3609d2.LJIIJ()));
            CommercialService commercialService = this.this$0.getCommercialService();
            C36202 c36202 = new C36202(abstractC3609d2);
            if (!PatchProxy.proxy(new Object[]{c36202}, commercialService, CommercialService.LIZ, false, 12).isSupported) {
                C106862S5w.LIZ(c36202);
                commercialService.LJIIIZ = c36202;
            }
        }
        return Unit.INSTANCE;
    }
}
