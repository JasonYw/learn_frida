package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C80643HqX;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoCameraRoomWindowManager$onEmptyStubClick$2 */
/* loaded from: classes3.dex */
public final class VideoCameraRoomWindowManager$onEmptyStubClick$2 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80643HqX this$0;

    static {
        Covode.recordClassIndex(30454);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCameraRoomWindowManager$onEmptyStubClick$2(C80643HqX c80643HqX) {
        super(1);
        this.this$0 = c80643HqX;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        Integer num2 = num;
        if (!PatchProxy.proxy(new Object[]{num2}, this, changeQuickRedirect, false, 1).isSupported && num2 != null) {
            this.this$0.LIZ(num2.intValue());
        }
        return Unit.INSTANCE;
    }
}
