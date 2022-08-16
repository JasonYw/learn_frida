package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80636HqQ;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.BaseEqualTalkRoomWindowManager$onEmptyStubClick$1 */
/* loaded from: classes3.dex */
public final class BaseEqualTalkRoomWindowManager$onEmptyStubClick$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $position;
    public final /* synthetic */ AbstractC80636HqQ this$0;

    static {
        Covode.recordClassIndex(30434);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEqualTalkRoomWindowManager$onEmptyStubClick$1(AbstractC80636HqQ abstractC80636HqQ, int i) {
        super(1);
        this.this$0 = abstractC80636HqQ;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        Integer num2 = num;
        if (!PatchProxy.proxy(new Object[]{num2}, this, changeQuickRedirect, false, 1).isSupported && num2 != null) {
            num2.intValue();
            this.this$0.LIZJ(this.$position);
        }
        return Unit.INSTANCE;
    }
}
