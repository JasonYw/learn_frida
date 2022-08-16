package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes12.dex */
public final class PreviewWelfareWidget$onCreate$3 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewWelfareWidget this$0;

    static {
        Covode.recordClassIndex(18777);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewWelfareWidget$onCreate$3(PreviewWelfareWidget previewWelfareWidget) {
        super(1);
        this.this$0 = previewWelfareWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            PreviewStatusInfo LIZ = this.this$0.LJIIJJI().m15893LJ().LIZ();
            LIZ.welfareProjectId = longValue;
            this.this$0.LJIIJJI().m15893LJ().LIZ(LIZ);
            if (longValue > 0) {
                TextView textView = this.this$0.LIZJ;
                if (textView != null) {
                    LK1.LIZJ(textView);
                }
            } else {
                TextView textView2 = this.this$0.LIZJ;
                if (textView2 != null) {
                    LK1.LIZ(textView2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
