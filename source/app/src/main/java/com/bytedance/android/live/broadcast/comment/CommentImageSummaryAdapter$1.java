package com.bytedance.android.live.broadcast.comment;

import com.bytedance.android.live.broadcast.gallery.transfer.DialogInterface$OnKeyListenerC3024g;
import com.bytedance.android.live.broadcast.gallery.transfer.d$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C149406foo;
import p003X.C88995L4r;

/* loaded from: classes20.dex */
public final class CommentImageSummaryAdapter$1 extends Lambda implements Function1<Integer, DialogInterface$OnKeyListenerC3024g> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88995L4r this$0;

    static {
        Covode.recordClassIndex(15228);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentImageSummaryAdapter$1(C88995L4r c88995L4r) {
        super(1);
        this.this$0 = c88995L4r;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.android.live.broadcast.gallery.transfer.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ DialogInterface$OnKeyListenerC3024g invoke(Integer num) {
        int intValue = num.intValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.this$0.LIZLLL.invoke(Integer.valueOf(intValue), Boolean.TRUE);
        return C149406foo.LIZ(C149406foo.LIZIZ, this.this$0.f8742LJ, intValue, this.this$0.LIZIZ.size(), this.this$0.LIZIZ, null, null, null, new d$b() { // from class: com.bytedance.android.live.broadcast.comment.CommentImageSummaryAdapter$1.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(15229);
            }

            @Override // com.bytedance.android.live.broadcast.gallery.transfer.d$b
            public final void LIZ(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                CommentImageSummaryAdapter$1.this.this$0.LIZLLL.invoke(Integer.valueOf(i), Boolean.FALSE);
            }
        }, null, true, false, null, null, 7536, null);
    }
}
