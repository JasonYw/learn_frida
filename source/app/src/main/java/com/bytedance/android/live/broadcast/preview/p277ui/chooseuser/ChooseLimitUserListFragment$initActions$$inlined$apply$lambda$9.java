package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77293Gdb;
import p003X.C77294Gdc;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$9 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$9 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17372);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$9(C77294Gdc c77294Gdc) {
        super(0);
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((RecyclerView) this.this$0.LIZ(2131188506)).post(new Runnable() { // from class: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$9.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(17373);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C77293Gdb c77293Gdb = ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$9.this.this$0.LJI;
                    if (!PatchProxy.proxy(new Object[0], c77293Gdb, C77293Gdb.LIZ, false, 9).isSupported) {
                        c77293Gdb.LIZLLL.LIZ = 0;
                        c77293Gdb.LIZLLL();
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
