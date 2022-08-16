package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87911KkT;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$onShow$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Map $showParams;
    public final /* synthetic */ SonicGamePlugin this$0;

    static {
        Covode.recordClassIndex(21112);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$onShow$1(SonicGamePlugin sonicGamePlugin, Map map) {
        super(0);
        this.this$0 = sonicGamePlugin;
        this.$showParams = map;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87911KkT.LIZ(C87911KkT.LIZIZ, "make a new one FullScreenOpenPanel", null, 2, null);
            this.this$0.initPanelAndHide();
            this.this$0.LIZLLL();
            this.this$0.onShow(this.$showParams);
        }
        return Unit.INSTANCE;
    }
}
