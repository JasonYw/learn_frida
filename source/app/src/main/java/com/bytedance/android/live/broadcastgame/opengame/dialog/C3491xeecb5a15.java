package com.bytedance.android.live.broadcastgame.opengame.dialog;

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
import kotlin.jvm.internal.Lambda;
import p003X.C88055Kmn;
import p003X.LK5;
import p003X.View$OnClickListenerC88057Kmp;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialog$requestData$1$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3491xeecb5a15 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $it;
    public final /* synthetic */ C88055Kmn this$0;

    static {
        Covode.recordClassIndex(20139);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3491xeecb5a15(List list, C88055Kmn c88055Kmn) {
        super(0);
        this.$it = list;
        this.this$0 = c88055Kmn;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        int LIZ;
        int LIZ2;
        MethodCollector.m14708i(1444);
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            OpenGameReportDialog openGameReportDialog = this.this$0.LIZIZ;
            List list = this.$it;
            if (!PatchProxy.proxy(new Object[]{list}, openGameReportDialog, OpenGameReportDialog.LIZ, false, 16).isSupported) {
                ((GridLayout) openGameReportDialog.LIZ(2131166277)).removeAllViews();
                if (list != null && !list.isEmpty()) {
                    int LIZJ = (LK5.LIZJ() - LK5.LIZ(48.0f)) / 3;
                    int size = (list.size() - 1) - (((list.size() - 1) % 3) + 1);
                    View$OnClickListenerC88057Kmp view$OnClickListenerC88057Kmp = new View$OnClickListenerC88057Kmp(openGameReportDialog);
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
                        layoutParams.width = LIZJ;
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
                        TextView textView = new TextView(openGameReportDialog);
                        textView.setTextSize(1, 12.0f);
                        textView.setGravity(17);
                        textView.setSingleLine(true);
                        textView.setTextColor(LK5.LIZIZ(2131626090));
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setPadding(12, textView.getPaddingTop(), 12, textView.getPaddingBottom());
                        textView.setText(c3592a.LIZIZ);
                        textView.setTag(2131166277, c3592a);
                        textView.setOnClickListener(view$OnClickListenerC88057Kmp);
                        textView.setBackground(openGameReportDialog.getResources().getDrawable(2130855179));
                        ((GridLayout) openGameReportDialog.LIZ(2131166277)).addView(textView, layoutParams);
                        i = i2;
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1444);
        return unit;
    }
}
