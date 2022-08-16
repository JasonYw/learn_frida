package com.bytedance.android.live.broadcast.gamedetailv2.pageview;

import android.content.Context;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.L4U;
import p003X.L5E;

/* loaded from: classes5.dex */
public final class GameCommentPageView$initRecyclerView$2 extends Lambda implements Function5<Integer, String, Integer, Integer, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L5E this$0;

    static {
        Covode.recordClassIndex(16662);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentPageView$initRecyclerView$2(L5E l5e) {
        super(5);
        this.this$0 = l5e;
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.pageview.GameCommentPageView$initRecyclerView$2$1 */
    /* loaded from: classes5.dex */
    public static final class C31241 extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16663);
        }

        public C31241() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.Unit, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            int intValue = num.intValue();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            L4U l4u = GameCommentPageView$initRecyclerView$2.this.this$0.LJFF;
            if (l4u != null) {
                l4u.LIZ(intValue);
                return Unit.INSTANCE;
            }
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ Unit invoke(Integer num, String str, Integer num2, Integer num3, String str2) {
        C2990g c2990g;
        int intValue = num.intValue();
        String str3 = str;
        Integer num4 = num2;
        Integer num5 = num3;
        String str4 = str2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str3, num4, num5, str4}, this, changeQuickRedirect, false, 1).isSupported && (c2990g = this.this$0.LIZLLL) != null) {
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C2990g.LIZ(c2990g, context, intValue, str3, num4, num5, str4, null, null, null, new C31241(), 448, null);
        }
        return Unit.INSTANCE;
    }
}
