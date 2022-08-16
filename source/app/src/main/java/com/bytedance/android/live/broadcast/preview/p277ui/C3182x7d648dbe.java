package com.bytedance.android.live.broadcast.preview.p277ui;

import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.C77742Gkq;
import p003X.C77755Gl3;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.StartLiveVisibilityDialog$mItemClickListener$1$needShowLimitDialog$1 */
/* loaded from: classes3.dex */
public final class C3182x7d648dbe extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $selectedType;
    public final /* synthetic */ StartLiveVisibilityDialog$mItemClickListener$1 this$0;

    static {
        Covode.recordClassIndex(17328);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3182x7d648dbe(StartLiveVisibilityDialog$mItemClickListener$1 startLiveVisibilityDialog$mItemClickListener$1, int i) {
        super(0);
        this.this$0 = startLiveVisibilityDialog$mItemClickListener$1;
        this.$selectedType = i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C3207d c3207d = this.this$0.this$0.f6444LJ;
            if (c3207d != null) {
                Disposable disposable = this.this$0.this$0.LIZIZ;
                if (disposable != null) {
                    disposable.dispose();
                }
                this.this$0.this$0.LIZIZ = null;
                this.this$0.this$0.LIZIZ = c3207d.LJIILIIL().LIZIZ().subscribe(new C77742Gkq(this));
            }
            C4574547f.LIZ().LIZ("livesdk_live_visible_range_setting_click", MapsKt__MapsKt.mapOf(TuplesKt.m137to("user_id", this.this$0.this$0.m23815LJ()), TuplesKt.m137to("event_page", "live_take_page"), TuplesKt.m137to("action_type", C77755Gl3.LIZIZ.LIZ(Integer.valueOf(this.$selectedType), this.this$0.this$0.LJFF))), new Object[0]);
            if (-2 == this.$selectedType) {
                this.this$0.this$0.dismiss();
            }
        }
        return Unit.INSTANCE;
    }
}
