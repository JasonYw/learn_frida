package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AudienceGameDetailInfoWidget$onUpdate$6 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceGameDetailInfoWidget this$0;

    static {
        Covode.recordClassIndex(16335);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameDetailInfoWidget$onUpdate$6(AudienceGameDetailInfoWidget audienceGameDetailInfoWidget) {
        super(1);
        this.this$0 = audienceGameDetailInfoWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        TextView textView;
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            if ((true ^ StringsKt__StringsJVMKt.isBlank(str2)) && str2 != null && (textView = this.this$0.LJFF) != null) {
                textView.setText(str2);
            }
        }
        return Unit.INSTANCE;
    }
}
