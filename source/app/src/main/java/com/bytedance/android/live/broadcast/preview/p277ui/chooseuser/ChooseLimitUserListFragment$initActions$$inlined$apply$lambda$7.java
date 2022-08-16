package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3209g;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C77294Gdc;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7 extends Lambda implements Function2<List<Object>, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3207d $this_apply;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17369);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7(C3207d c3207d, C77294Gdc c77294Gdc) {
        super(2);
        this.$this_apply = c3207d;
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(List<Object> list, Boolean bool) {
        final List<Object> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2, Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZLLL();
            ((RecyclerView) this.this$0.LIZ(2131188506)).post(new Runnable() { // from class: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(17370);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    if (list2 != null) {
                        ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.LJI.LIZ(list2);
                        if (list2.isEmpty() && ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.LIZLLL != 0) {
                            ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.m23820LJ();
                        }
                    }
                    if (ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.LIZLLL == 0) {
                        if (ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.$this_apply.LJIIIZ()) {
                            C3207d c3207d = ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.$this_apply;
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c3207d, C3207d.LIZ, false, 23);
                            if (!proxy.isSupported ? c3207d.LJIIJJI == ((C3209g) CollectionsKt___CollectionsKt.last((List<? extends Object>) c3207d.LJIIIIZZ)).LIZIZ : ((Boolean) proxy.result).booleanValue()) {
                                ALogger.m15801d(ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.LIZIZ, "refresh ALL empty");
                                ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.m23820LJ();
                                return;
                            }
                        }
                        ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.LIZLLL();
                        return;
                    }
                    List list3 = list2;
                    if (list3 != null && list3.isEmpty()) {
                        ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.m23820LJ();
                    } else {
                        ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$7.this.this$0.LIZLLL();
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
