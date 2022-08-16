package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.bdp.live.livecontainer.miniapp.C11519i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class MockMiniApp$mount$2 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MockMiniApp this$0;

    static {
        Covode.recordClassIndex(21479);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MockMiniApp$mount$2(MockMiniApp mockMiniApp) {
        super(1);
        this.this$0 = mockMiniApp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C11519i c11519i = this.this$0.LIZLLL;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            if (!PatchProxy.proxy(new Object[]{str2}, c11519i, C11519i.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(str2);
                c11519i.LJI = str2;
            }
            this.this$0.LIZ(false);
        }
        return Unit.INSTANCE;
    }
}
