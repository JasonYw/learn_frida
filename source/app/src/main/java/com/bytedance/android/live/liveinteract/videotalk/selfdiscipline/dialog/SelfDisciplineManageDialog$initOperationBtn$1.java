package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.p357f.AbstractC4411b;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.C4949a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.DialogC448093nv;

/* loaded from: classes12.dex */
public final class SelfDisciplineManageDialog$initOperationBtn$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448093nv this$0;

    static {
        Covode.recordClassIndex(30404);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineManageDialog$initOperationBtn$1(DialogC448093nv dialogC448093nv) {
        super(1);
        this.this$0 = dialogC448093nv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        CharSequence charSequence;
        View view2 = view;
        int i = 1;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            if (view2.isSelected()) {
                if (this.this$0.LIZIZ) {
                    i = 3;
                }
                AbstractC4411b LIZJ = C4949a.f26454LJ.LIZJ();
                if (LIZJ != null) {
                    TextView textView = (TextView) this.this$0.findViewById(2131195291);
                    if (textView != null) {
                        charSequence = textView.getText();
                    } else {
                        charSequence = null;
                    }
                    LIZJ.LIZ(i, String.valueOf(charSequence));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
