package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;
import p003X.View$OnClickListenerC77355Geb;

/* loaded from: classes3.dex */
public final class LinkRoomFightSettingFragment$onViewCreated$4$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC77355Geb this$0;

    static {
        Covode.recordClassIndex(27696);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSettingFragment$onViewCreated$4$1(View$OnClickListenerC77355Geb view$OnClickListenerC77355Geb) {
        super(1);
        this.this$0 = view$OnClickListenerC77355Geb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            TextView textView = (TextView) this.this$0.LIZIZ.LIZ(2131194136);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(LK5.LIZ(2131585015, Integer.valueOf(intValue / 60)));
        }
        return Unit.INSTANCE;
    }
}
