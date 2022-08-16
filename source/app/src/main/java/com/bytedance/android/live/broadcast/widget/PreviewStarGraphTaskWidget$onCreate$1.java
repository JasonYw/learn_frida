package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcast.viewmodel.C3260j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4574547f;

/* loaded from: classes3.dex */
public final class PreviewStarGraphTaskWidget$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewStarGraphTaskWidget this$0;

    static {
        Covode.recordClassIndex(18692);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewStarGraphTaskWidget$onCreate$1(PreviewStarGraphTaskWidget previewStarGraphTaskWidget) {
        super(1);
        this.this$0 = previewStarGraphTaskWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LIZIZ(false);
            this.this$0.LIZLLL(new C33011());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewStarGraphTaskWidget$onCreate$1$1 */
    /* loaded from: classes3.dex */
    public static final class C33011 extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(18693);
        }

        public C33011() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            String str;
            boolean booleanValue = bool.booleanValue();
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue) {
                C4574547f LIZ = C4574547f.LIZ();
                Map<String, String> m15861LJ = PreviewStarGraphTaskWidget$onCreate$1.this.this$0.m15861LJ();
                if (Intrinsics.areEqual(PreviewStarGraphTaskWidget$onCreate$1.this.this$0.LIZIZ().LJFF.getValue(), Boolean.TRUE)) {
                    str = "1";
                } else {
                    str = "0";
                }
                m15861LJ.put("is_yellow_point", str);
                LIZ.LIZ("livesdk_xingtu_icon_click", m15861LJ, new Object[0]);
                C3260j LIZIZ = PreviewStarGraphTaskWidget$onCreate$1.this.this$0.LIZIZ();
                Context context = PreviewStarGraphTaskWidget$onCreate$1.this.this$0.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                LIZIZ.LIZ(context, PreviewStarGraphTaskWidget$onCreate$1.this.this$0.LIZJ(), true);
            }
            return Unit.INSTANCE;
        }
    }
}
