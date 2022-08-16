package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GamePromoteCommentViewModel$uploadImage$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2990g this$0;

    static {
        Covode.recordClassIndex(15315);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommentViewModel$uploadImage$3(C2990g c2990g) {
        super(0);
        this.this$0 = c2990g;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C2990g c2990g = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c2990g, C2990g.LIZ, false, 15).isSupported) {
                c2990g.LIZIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
