package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudienceGameDetailInfoWidget$onUpdate$8 extends Lambda implements Function1<List<? extends String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceGameDetailInfoWidget this$0;

    static {
        Covode.recordClassIndex(16337);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameDetailInfoWidget$onUpdate$8(AudienceGameDetailInfoWidget audienceGameDetailInfoWidget) {
        super(1);
        this.this$0 = audienceGameDetailInfoWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends String> list) {
        MethodCollector.m14708i(1268);
        List<? extends String> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list2);
            this.this$0.LIZJ();
            for (String str : list2) {
                TextView textView = new TextView(new ContextThemeWrapper(this.this$0.context, 2131494880));
                textView.setText(str);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.rightMargin = LK5.LIZ(5.0f);
                FlowLayout flowLayout = this.this$0.LJI;
                if (flowLayout != null) {
                    flowLayout.addView(textView, marginLayoutParams);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1268);
        return unit;
    }
}
