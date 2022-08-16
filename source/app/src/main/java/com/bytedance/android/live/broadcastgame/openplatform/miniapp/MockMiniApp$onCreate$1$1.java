package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.bdp.live.livecontainer.miniapp.PageStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC87894KkC;

/* loaded from: classes5.dex */
public final class MockMiniApp$onCreate$1$1 extends Lambda implements Function2<Boolean, PageStatus, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC87894KkC this$0;

    static {
        Covode.recordClassIndex(21481);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MockMiniApp$onCreate$1$1(View$OnClickListenerC87894KkC view$OnClickListenerC87894KkC) {
        super(2);
        this.this$0 = view$OnClickListenerC87894KkC;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, PageStatus pageStatus) {
        PageStatus pageStatus2 = pageStatus;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0), pageStatus2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(pageStatus2);
            this.this$0.LIZIZ.LIZ(pageStatus2);
        }
        return Unit.INSTANCE;
    }
}
