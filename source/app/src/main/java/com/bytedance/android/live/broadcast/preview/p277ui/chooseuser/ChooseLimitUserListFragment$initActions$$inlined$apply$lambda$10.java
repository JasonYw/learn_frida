package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C77294Gdc;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10 extends Lambda implements Function2<List<Object>, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17362);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10(C77294Gdc c77294Gdc) {
        super(2);
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(List<Object> list, Boolean bool) {
        final List<Object> list2 = list;
        final boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{list2, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            ((RecyclerView) this.this$0.LIZ(2131188506)).post(new Runnable() { // from class: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(17363);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10.this.this$0.LIZLLL();
                    if (booleanValue) {
                        ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10.this.this$0.LJI.LIZ();
                    } else {
                        ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10.this.this$0.LJI.LIZIZ();
                    }
                    if (list2 != null) {
                        ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$10.this.this$0.LJI.LIZIZ(list2);
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
