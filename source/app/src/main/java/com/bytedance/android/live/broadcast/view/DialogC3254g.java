package com.bytedance.android.live.broadcast.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.view.DialogC3254g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC425302sG;
import p003X.C106862S5w;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.view.g */
/* loaded from: classes12.dex */
public final class DialogC3254g extends Dialog {
    public static ChangeQuickRedirect LIZ;
    public AbstractC425302sG LIZIZ;
    public View LIZJ;

    static {
        Covode.recordClassIndex(18111);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate(bundle);
        TextView textView = (TextView) this.LIZJ.findViewById(2131181174);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        textView.setText(LK5.LIZ(2131582659));
        View findViewById = this.LIZJ.findViewById(2131181173);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        ((TextView) findViewById).setText(LK5.LIZ(2131582660));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3254g(Context context) {
        super(context, 2131494964);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1354);
        View inflate = LayoutInflater.from(getContext()).inflate(2131698609, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "");
        this.LIZJ = inflate;
        setContentView(this.LIZJ);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        window.getAttributes().gravity = 17;
        setCancelable(false);
        Button button = (Button) this.LIZJ.findViewById(2131181160);
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setText(LK5.LIZ(2131582658));
        button.setOnClickListener(new View.OnClickListener() { // from class: X.2sE
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18112);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                DialogC3254g.this.cancel();
                AbstractC425302sG abstractC425302sG = DialogC3254g.this.LIZIZ;
                if (abstractC425302sG != null) {
                    abstractC425302sG.LIZ();
                }
            }
        });
        Button button2 = (Button) this.LIZJ.findViewById(2131181161);
        Intrinsics.checkNotNullExpressionValue(button2, "");
        button2.setText(LK5.LIZ(2131588032));
        button2.setOnClickListener(new View.OnClickListener() { // from class: X.2sF
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18113);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                DialogC3254g.this.cancel();
                AbstractC425302sG abstractC425302sG = DialogC3254g.this.LIZIZ;
                if (abstractC425302sG != null) {
                    abstractC425302sG.LIZIZ();
                }
            }
        });
        MethodCollector.m14707o(1354);
    }
}
