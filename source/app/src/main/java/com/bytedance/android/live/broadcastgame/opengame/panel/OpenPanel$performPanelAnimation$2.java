package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenPanel$performPanelAnimation$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $consume;
    public final /* synthetic */ DialogC3611f this$0;

    static {
        Covode.recordClassIndex(20774);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPanel$performPanelAnimation$2(DialogC3611f dialogC3611f, boolean z) {
        super(0);
        this.this$0 = dialogC3611f;
        this.$consume = z;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Window window;
        MethodCollector.m14708i(1464);
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            DialogC3611f dialogC3611f = this.this$0;
            boolean z = this.$consume;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, dialogC3611f, DialogC3611f.LIZ, false, 35).isSupported && (window = dialogC3611f.getWindow()) != null) {
                if (z) {
                    Window window2 = dialogC3611f.getWindow();
                    if (window2 != null) {
                        window2.clearFlags(32);
                    }
                    Window window3 = dialogC3611f.getWindow();
                    if (window3 != null) {
                        window3.clearFlags(8);
                    }
                    dialogC3611f.setCanceledOnTouchOutside(true);
                } else {
                    window.setFlags(32, 32);
                    window.setFlags(8, 8);
                    dialogC3611f.setCanceledOnTouchOutside(false);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1464);
        return unit;
    }
}
