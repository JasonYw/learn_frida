package com.bytedance.android.live.broadcast.widget;

import android.view.MotionEvent;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3175a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C423722pi;
import p003X.C86991KPp;

/* loaded from: classes5.dex */
public final class PreviewToolAreaWidget$initAllWidgetList$1$1$2 extends Lambda implements Function1<MotionEvent, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3316bs $tmpItem;

    static {
        Covode.recordClassIndex(18735);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewToolAreaWidget$initAllWidgetList$1$1$2(C3316bs c3316bs) {
        super(1);
        this.$tmpItem = c3316bs;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(MotionEvent motionEvent) {
        String str;
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.proxy(new Object[]{motionEvent2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(motionEvent2);
            if (motionEvent2.getAction() == 0) {
                String str2 = this.$tmpItem.LIZLLL;
                AbstractC3175a abstractC3175a = this.$tmpItem.LIZIZ;
                if (abstractC3175a == null || (str = abstractC3175a.LIZ()) == null) {
                    str = "widget为空";
                }
                C86991KPp.LIZ(str2, str);
                C423722pi.LIZIZ.LIZ(this.$tmpItem.LIZLLL);
            }
        }
        return Unit.INSTANCE;
    }
}
