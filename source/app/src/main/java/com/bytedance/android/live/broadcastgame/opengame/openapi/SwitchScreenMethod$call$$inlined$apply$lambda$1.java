package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13052h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C81918IQm;
import p003X.C87657KgN;

/* loaded from: classes5.dex */
public final class SwitchScreenMethod$call$$inlined$apply$lambda$1 extends Lambda implements Function1<PanelType, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C13052h $context$inlined;
    public final /* synthetic */ PanelType $screenType$inlined;
    public final /* synthetic */ C87657KgN this$0;

    static {
        Covode.recordClassIndex(20526);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchScreenMethod$call$$inlined$apply$lambda$1(C87657KgN c87657KgN, PanelType panelType, C13052h c13052h) {
        super(1);
        this.this$0 = c87657KgN;
        this.$screenType$inlined = panelType;
        this.$context$inlined = c13052h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PanelType panelType) {
        PanelType panelType2 = panelType;
        if (!PatchProxy.proxy(new Object[]{panelType2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(panelType2);
            this.this$0.LIZ(new JSONObject().put("screenWidth", C81918IQm.LIZIZ(this.$context$inlined.LIZIZ, panelType2.width)).put("screenHeight", C81918IQm.LIZIZ(this.$context$inlined.LIZIZ, panelType2.height)));
        }
        return Unit.INSTANCE;
    }
}
