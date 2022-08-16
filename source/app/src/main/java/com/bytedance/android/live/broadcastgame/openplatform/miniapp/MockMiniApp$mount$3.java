package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.bdp.live.livecontainer.miniapp.PageStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class MockMiniApp$mount$3 extends Lambda implements Function2<Boolean, PageStatus, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MockMiniApp this$0;

    static {
        Covode.recordClassIndex(21480);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MockMiniApp$mount$3(MockMiniApp mockMiniApp) {
        super(2);
        this.this$0 = mockMiniApp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, PageStatus pageStatus) {
        PageStatus pageStatus2 = pageStatus;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0), pageStatus2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(pageStatus2);
            this.this$0.LIZ(pageStatus2);
        }
        return Unit.INSTANCE;
    }
}
