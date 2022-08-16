package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.widget.TextView;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2237e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuthActivity$initActions$2 */
/* loaded from: classes17.dex */
public final class TwoElementAuthActivity$initActions$2 extends Lambda implements Function1<TextView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TwoElementAuthActivity this$0;

    static {
        Covode.recordClassIndex(7302);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoElementAuthActivity$initActions$2(TwoElementAuthActivity twoElementAuthActivity) {
        super(1);
        this.this$0 = twoElementAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TextView textView) {
        if (!PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(textView);
            this.this$0.LIZ(true);
            C2237e c2237e = this.this$0.mvpLogger;
            if (c2237e != null) {
                c2237e.LIZ(1);
            }
        }
        return Unit.INSTANCE;
    }
}
