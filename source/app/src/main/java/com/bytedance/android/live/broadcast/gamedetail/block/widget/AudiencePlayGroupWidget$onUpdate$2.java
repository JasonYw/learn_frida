package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.Button;
import com.bytedance.android.live.broadcast.gamedetail.order.model.GroupJoinStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.L6D;

/* loaded from: classes5.dex */
public final class AudiencePlayGroupWidget$onUpdate$2 extends Lambda implements Function1<GroupJoinStatus, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3085f $props;
    public final /* synthetic */ AudiencePlayGroupWidget this$0;

    static {
        Covode.recordClassIndex(16362);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePlayGroupWidget$onUpdate$2(AudiencePlayGroupWidget audiencePlayGroupWidget, C3085f c3085f) {
        super(1);
        this.this$0 = audiencePlayGroupWidget;
        this.$props = c3085f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(GroupJoinStatus groupJoinStatus) {
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{groupJoinStatus}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(groupJoinStatus);
            AudiencePlayGroupWidget audiencePlayGroupWidget = this.this$0;
            C3085f c3085f = this.$props;
            if (!PatchProxy.proxy(new Object[]{c3085f}, audiencePlayGroupWidget, AudiencePlayGroupWidget.LIZ, false, 4).isSupported) {
                Button button = audiencePlayGroupWidget.LIZIZ;
                if (button != null) {
                    button.setText(c3085f.LJIIIIZZ.des);
                }
                Button button2 = audiencePlayGroupWidget.LIZIZ;
                if (button2 != null) {
                    button2.setOnClickListener(new L6D(audiencePlayGroupWidget, c3085f));
                }
                Button button3 = audiencePlayGroupWidget.LIZIZ;
                if (button3 != null) {
                    if (c3085f.LJIIIIZZ != GroupJoinStatus.NOT_APPLY && c3085f.LJIIIIZZ != GroupJoinStatus.APPLY_TO_JOIN && c3085f.LJIIIIZZ != GroupJoinStatus.JOIN_NOW && c3085f.LJIIIIZZ != GroupJoinStatus.VIEW_CONDITIONS && c3085f.LJIIIIZZ != GroupJoinStatus.APLLYING) {
                        z = false;
                    }
                    button3.setEnabled(z);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
