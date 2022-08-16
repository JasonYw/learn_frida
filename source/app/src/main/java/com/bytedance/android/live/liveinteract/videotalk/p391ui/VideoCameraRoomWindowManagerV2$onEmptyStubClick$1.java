package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoCameraRoomWindowManagerV2$onEmptyStubClick$1 */
/* loaded from: classes3.dex */
public final class VideoCameraRoomWindowManagerV2$onEmptyStubClick$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4966r this$0;

    static {
        Covode.recordClassIndex(30457);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCameraRoomWindowManagerV2$onEmptyStubClick$1(C4966r c4966r) {
        super(1);
        this.this$0 = c4966r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        Integer num2 = num;
        if (!PatchProxy.proxy(new Object[]{num2}, this, changeQuickRedirect, false, 1).isSupported && num2 != null) {
            this.this$0.LIZJ(num2.intValue());
        }
        return Unit.INSTANCE;
    }
}
