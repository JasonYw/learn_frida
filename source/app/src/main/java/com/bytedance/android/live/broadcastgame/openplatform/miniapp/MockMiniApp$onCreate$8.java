package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.bdp.live.livecontainer.miniapp.PageStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MockMiniApp$onCreate$8 extends Lambda implements Function1<C3800g, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MockMiniApp this$0;

    static {
        Covode.recordClassIndex(21484);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MockMiniApp$onCreate$8(MockMiniApp mockMiniApp) {
        super(1);
        this.this$0 = mockMiniApp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3800g c3800g) {
        C3800g c3800g2 = c3800g;
        if (!PatchProxy.proxy(new Object[]{c3800g2}, this, changeQuickRedirect, false, 1).isSupported) {
            String str = c3800g2.LIZIZ;
            int hashCode = str.hashCode();
            if (hashCode != -604633664) {
                if (hashCode == -159005542 && str.equals("update_anchor_btn_state")) {
                    this.this$0.LIZ(PageStatus.valueOf(c3800g2.LIZJ));
                    this.this$0.LIZ();
                }
            } else if (str.equals("kill_app")) {
                this.this$0.finish();
            }
        }
        return Unit.INSTANCE;
    }
}
