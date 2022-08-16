package com.bytedance.android.live.liveinteract.linkroomfight.p364ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.H57;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.ui.LinkRoomFightViewManager$showResultAnimation$2$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class LinkRoomFightViewManager$showResultAnimation$2$onFinalImageSet$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H57 this$0;

    static {
        Covode.recordClassIndex(27784);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightViewManager$showResultAnimation$2$onFinalImageSet$1(H57 h57) {
        super(0);
        this.this$0 = h57;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LJFF.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
