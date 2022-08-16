package com.bytedance.android.live.broadcast.preview.p277ui;

import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.p277ui.common.StartLiveVisibilityItemView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C4574547f;
import p003X.C77741Gkp;
import p003X.C77755Gl3;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.StartLiveVisibilityDialog$mItemClickListener$1 */
/* loaded from: classes3.dex */
public final class StartLiveVisibilityDialog$mItemClickListener$1 extends Lambda implements Function2<Integer, StartLiveVisibilityItemView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77741Gkp this$0;

    static {
        Covode.recordClassIndex(17327);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityDialog$mItemClickListener$1(C77741Gkp c77741Gkp) {
        super(2);
        this.this$0 = c77741Gkp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, StartLiveVisibilityItemView startLiveVisibilityItemView) {
        Integer num2;
        C2WC<Integer> LJJIZ;
        C2WC<Integer> LJJIZ2;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), startLiveVisibilityItemView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(startLiveVisibilityItemView);
            if (!this.this$0.LIZ(intValue, new C3182x7d648dbe(this, intValue))) {
                C3199v c3199v = this.this$0.LIZLLL;
                if (c3199v != null && (LJJIZ2 = c3199v.LJJIZ()) != null) {
                    LJJIZ2.LIZ(Integer.valueOf(intValue));
                }
                C4574547f LIZ = C4574547f.LIZ();
                Pair[] pairArr = new Pair[3];
                pairArr[0] = TuplesKt.m137to("user_id", this.this$0.m23815LJ());
                pairArr[1] = TuplesKt.m137to("event_page", "live_take_page");
                C77755Gl3 c77755Gl3 = C77755Gl3.LIZIZ;
                C3199v c3199v2 = this.this$0.LIZLLL;
                if (c3199v2 != null && (LJJIZ = c3199v2.LJJIZ()) != null) {
                    num2 = LJJIZ.LIZ();
                } else {
                    num2 = null;
                }
                pairArr[2] = TuplesKt.m137to("action_type", c77755Gl3.LIZ(num2, this.this$0.LJFF));
                LIZ.LIZ("livesdk_live_visible_range_setting_click", MapsKt__MapsKt.mapOf(pairArr), new Object[0]);
                this.this$0.dismiss();
            }
        }
        return Unit.INSTANCE;
    }
}
