package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import android.content.Context;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.L4U;

/* loaded from: classes5.dex */
public final class GameDetailCommentWidget$onUpdate$2 extends Lambda implements Function1<List<? extends C2985a>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3138a $props;
    public final /* synthetic */ GameDetailCommentWidget this$0;

    static {
        Covode.recordClassIndex(16739);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailCommentWidget$onUpdate$2(GameDetailCommentWidget gameDetailCommentWidget, C3138a c3138a) {
        super(1);
        this.this$0 = gameDetailCommentWidget;
        this.$props = c3138a;
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailCommentWidget$onUpdate$2$2 */
    /* loaded from: classes5.dex */
    public static final class C31342 extends Lambda implements Function1<Boolean, Unit> {
        static {
            Covode.recordClassIndex(16742);
        }

        public C31342() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            GameDetailCommentWidget$onUpdate$2.this.this$0.f25899LJ = bool.booleanValue();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailCommentWidget$onUpdate$2$1 */
    /* loaded from: classes5.dex */
    public static final class C31321 extends Lambda implements Function5<Integer, String, Integer, Integer, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ L4U $mAdapter;

        static {
            Covode.recordClassIndex(16740);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31321(L4U l4u) {
            super(5);
            this.$mAdapter = l4u;
        }

        /* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailCommentWidget$onUpdate$2$1$1 */
        /* loaded from: classes5.dex */
        public static final class C31331 extends Lambda implements Function1<Integer, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(16741);
            }

            public C31331() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Integer num) {
                int intValue = num.intValue();
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
                    C31321.this.$mAdapter.LIZ(intValue);
                }
                return Unit.INSTANCE;
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
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str3, num4, num5, str4}, this, changeQuickRedirect, false, 1).isSupported && (c2990g = GameDetailCommentWidget$onUpdate$2.this.this$0.LIZLLL) != null) {
                Context context = GameDetailCommentWidget$onUpdate$2.this.this$0.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                C2990g.LIZ(c2990g, context, intValue, str3, num4, num5, str4, null, null, null, new C31331(), 448, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(java.util.List<? extends com.bytedance.android.live.broadcast.comment.data.C2985a> r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailCommentWidget$onUpdate$2.invoke(java.lang.Object):java.lang.Object");
    }
}
