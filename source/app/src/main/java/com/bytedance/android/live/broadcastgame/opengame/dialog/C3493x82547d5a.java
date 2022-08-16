package com.bytedance.android.live.broadcastgame.opengame.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.widget.GridLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcastgame.opengame.network.C3591r;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88054Kmm;
import p003X.LK1;
import p003X.LK5;
import p003X.View$OnClickListenerC88053Kml;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialogV1$requestData$1$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3493x82547d5a extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $it;
    public final /* synthetic */ C88054Kmm this$0;

    static {
        Covode.recordClassIndex(20146);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3493x82547d5a(List list, C88054Kmm c88054Kmm) {
        super(0);
        this.$it = list;
        this.this$0 = c88054Kmm;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        int LIZJ;
        int LIZ;
        int LIZ2;
        MethodCollector.m14708i(1445);
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            DialogC3494a dialogC3494a = this.this$0.LIZIZ;
            List list = this.$it;
            if (!PatchProxy.proxy(new Object[]{list}, dialogC3494a, DialogC3494a.LIZ, false, 20).isSupported) {
                ((GridLayout) dialogC3494a.findViewById(2131166277)).removeAllViews();
                if (list != null && !list.isEmpty()) {
                    if (dialogC3494a.LJIIIIZZ) {
                        LIZJ = LK1.LIZLLL(395);
                    } else {
                        LIZJ = LK5.LIZJ();
                    }
                    int LIZLLL = (LIZJ - LK1.LIZLLL(48)) / 3;
                    int size = (list.size() - 1) - (((list.size() - 1) % 3) + 1);
                    View$OnClickListenerC88053Kml view$OnClickListenerC88053Kml = new View$OnClickListenerC88053Kml(dialogC3494a);
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        C3591r.C3592a c3592a = (C3591r.C3592a) obj;
                        int i3 = i % 3;
                        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                        layoutParams.height = LK5.LIZ(30.0f);
                        layoutParams.width = LIZLLL;
                        if (i3 == 2) {
                            LIZ = 0;
                        } else {
                            LIZ = LK5.LIZ(8.0f);
                        }
                        layoutParams.rightMargin = LIZ;
                        if (i >= size) {
                            LIZ2 = 0;
                        } else {
                            LIZ2 = LK5.LIZ(8.0f);
                        }
                        layoutParams.bottomMargin = LIZ2;
                        TextView textView = new TextView(dialogC3494a.getContext());
                        textView.setTextSize(1, 12.0f);
                        textView.setGravity(17);
                        textView.setSingleLine(true);
                        textView.setTextColor(LK5.LIZIZ(2131626090));
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setPadding(12, textView.getPaddingTop(), 12, textView.getPaddingBottom());
                        textView.setText(c3592a.LIZIZ);
                        textView.setTag(2131166277, c3592a);
                        textView.setOnClickListener(view$OnClickListenerC88053Kml);
                        Context context = dialogC3494a.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        textView.setBackground(context.getResources().getDrawable(2130855179));
                        ((GridLayout) dialogC3494a.findViewById(2131166277)).addView(textView, layoutParams);
                        i = i2;
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1445);
        return unit;
    }
}
