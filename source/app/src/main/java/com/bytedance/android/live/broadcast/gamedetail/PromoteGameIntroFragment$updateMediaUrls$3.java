package com.bytedance.android.live.broadcast.gamedetail;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.L9I;

/* loaded from: classes5.dex */
public final class PromoteGameIntroFragment$updateMediaUrls$3 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L9I this$0;

    static {
        Covode.recordClassIndex(16013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoteGameIntroFragment$updateMediaUrls$3(L9I l9i) {
        super(1);
        this.this$0 = l9i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        RecyclerView recyclerView;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported) {
            L9I l9i = this.this$0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l9i}, null, L9I.LIZ, true, 19);
            if (proxy.isSupported) {
                recyclerView = (RecyclerView) proxy.result;
            } else {
                recyclerView = l9i.f8776LJ;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            }
            recyclerView.post(new Runnable() { // from class: com.bytedance.android.live.broadcast.gamedetail.PromoteGameIntroFragment$updateMediaUrls$3.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16014);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    PromoteGameIntroFragment$updateMediaUrls$3.this.this$0.LIZ();
                }
            });
        }
        return Unit.INSTANCE;
    }
}
