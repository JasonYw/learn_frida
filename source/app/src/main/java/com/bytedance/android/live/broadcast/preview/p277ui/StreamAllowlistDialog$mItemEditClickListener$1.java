package com.bytedance.android.live.broadcast.preview.p277ui;

import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C77749Gkx;
import p003X.C77752Gl0;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.StreamAllowlistDialog$mItemEditClickListener$1 */
/* loaded from: classes3.dex */
public final class StreamAllowlistDialog$mItemEditClickListener$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77749Gkx this$0;

    static {
        Covode.recordClassIndex(17342);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamAllowlistDialog$mItemEditClickListener$1(C77749Gkx c77749Gkx) {
        super(1);
        this.this$0 = c77749Gkx;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.ui.StreamAllowlistDialog$mItemEditClickListener$1$1 */
    /* loaded from: classes3.dex */
    public static final class C31851 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ int $selectedType;

        static {
            Covode.recordClassIndex(17343);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31851(int i) {
            super(0);
            this.$selectedType = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            C3207d c3207d;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (c3207d = StreamAllowlistDialog$mItemEditClickListener$1.this.this$0.LJI) != null) {
                Disposable disposable = StreamAllowlistDialog$mItemEditClickListener$1.this.this$0.LJII;
                if (disposable != null) {
                    disposable.dispose();
                }
                StreamAllowlistDialog$mItemEditClickListener$1.this.this$0.LJII = null;
                StreamAllowlistDialog$mItemEditClickListener$1.this.this$0.LJII = c3207d.LJIILIIL().LIZIZ().subscribe(new C77752Gl0(this));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ(intValue);
            this.this$0.LIZ(new C31851(intValue));
        }
        return Unit.INSTANCE;
    }
}
