package com.bytedance.android.live.broadcast.preview.p277ui;

import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.p277ui.common.StartLiveVisibilityItemView;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C77749Gkx;
import p003X.C77751Gkz;
import p003X.C88440Kt0;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.StreamAllowlistDialog$mItemClickListener$1 */
/* loaded from: classes3.dex */
public final class StreamAllowlistDialog$mItemClickListener$1 extends Lambda implements Function2<Integer, StartLiveVisibilityItemView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77749Gkx this$0;

    static {
        Covode.recordClassIndex(17339);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamAllowlistDialog$mItemClickListener$1(C77749Gkx c77749Gkx) {
        super(2);
        this.this$0 = c77749Gkx;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.ui.StreamAllowlistDialog$mItemClickListener$1$1 */
    /* loaded from: classes3.dex */
    public static final class C31841 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ int $selectedType;

        static {
            Covode.recordClassIndex(17340);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31841(int i) {
            super(0);
            this.$selectedType = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            C3207d c3207d;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (c3207d = StreamAllowlistDialog$mItemClickListener$1.this.this$0.LJI) != null) {
                Disposable disposable = StreamAllowlistDialog$mItemClickListener$1.this.this$0.LJII;
                if (disposable != null) {
                    disposable.dispose();
                }
                StreamAllowlistDialog$mItemClickListener$1.this.this$0.LJII = null;
                StreamAllowlistDialog$mItemClickListener$1.this.this$0.LJII = c3207d.LJIILIIL().LIZIZ().subscribe(new C77751Gkz(this));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, StartLiveVisibilityItemView startLiveVisibilityItemView) {
        C2WC<Integer> LJJIZ;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), startLiveVisibilityItemView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(startLiveVisibilityItemView);
            this.this$0.LIZIZ(intValue);
            if (intValue != 3) {
                if (5 == intValue && this.this$0.LIZJ) {
                    C88440Kt0.LIZ(2131587896);
                } else {
                    C3199v c3199v = this.this$0.LJFF;
                    if (c3199v != null && (LJJIZ = c3199v.LJJIZ()) != null) {
                        LJJIZ.LIZ(Integer.valueOf(intValue));
                    }
                    this.this$0.dismiss();
                }
            } else {
                this.this$0.LIZ(new C31841(intValue));
            }
        }
        return Unit.INSTANCE;
    }
}
