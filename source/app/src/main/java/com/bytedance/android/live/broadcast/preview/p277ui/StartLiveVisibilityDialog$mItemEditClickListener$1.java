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
import p003X.C77741Gkp;
import p003X.C77745Gkt;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.StartLiveVisibilityDialog$mItemEditClickListener$1 */
/* loaded from: classes3.dex */
public final class StartLiveVisibilityDialog$mItemEditClickListener$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77741Gkp this$0;

    static {
        Covode.recordClassIndex(17330);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityDialog$mItemEditClickListener$1(C77741Gkp c77741Gkp) {
        super(1);
        this.this$0 = c77741Gkp;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.ui.StartLiveVisibilityDialog$mItemEditClickListener$1$1 */
    /* loaded from: classes3.dex */
    public static final class C31831 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ int $selectedType;

        static {
            Covode.recordClassIndex(17331);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31831(int i) {
            super(0);
            this.$selectedType = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            C3207d c3207d;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (c3207d = StartLiveVisibilityDialog$mItemEditClickListener$1.this.this$0.f6444LJ) != null) {
                Disposable disposable = StartLiveVisibilityDialog$mItemEditClickListener$1.this.this$0.LIZIZ;
                if (disposable != null) {
                    disposable.dispose();
                }
                StartLiveVisibilityDialog$mItemEditClickListener$1.this.this$0.LIZIZ = null;
                StartLiveVisibilityDialog$mItemEditClickListener$1.this.this$0.LIZIZ = c3207d.LJIILIIL().LIZIZ().subscribe(new C77745Gkt(this));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(intValue, new C31831(intValue));
        }
        return Unit.INSTANCE;
    }
}
