package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PreviewCompanionPermissionWidget$onCreate$$inlined$let$lambda$3 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCompanionPermissionWidget this$0;

    static {
        Covode.recordClassIndex(18467);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCompanionPermissionWidget$onCreate$$inlined$let$lambda$3(PreviewCompanionPermissionWidget previewCompanionPermissionWidget) {
        super(1);
        this.this$0 = previewCompanionPermissionWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue != 3 && intValue != 2) {
                if (intValue == 99) {
                    TextView textView = this.this$0.LIZJ;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    TextView textView2 = this.this$0.LIZJ;
                    if (textView2 != null) {
                        textView2.setEnabled(true);
                    }
                    TextView textView3 = this.this$0.LIZJ;
                    if (textView3 != null) {
                        textView3.setClickable(true);
                    }
                } else if (intValue != 1 && intValue != 4 && intValue != 0) {
                    TextView textView4 = this.this$0.LIZJ;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                } else {
                    TextView textView5 = this.this$0.LIZJ;
                    if (textView5 != null) {
                        textView5.setVisibility(8);
                    }
                }
            } else {
                TextView textView6 = this.this$0.LIZJ;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                TextView textView7 = this.this$0.LIZJ;
                if (textView7 != null) {
                    textView7.setEnabled(false);
                }
                TextView textView8 = this.this$0.LIZJ;
                if (textView8 != null) {
                    textView8.setClickable(false);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
