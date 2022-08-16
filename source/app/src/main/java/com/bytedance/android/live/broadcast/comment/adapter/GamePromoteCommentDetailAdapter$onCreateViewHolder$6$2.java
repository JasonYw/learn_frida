package com.bytedance.android.live.broadcast.comment.adapter;

import android.app.Dialog;
import android.view.View;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.L45;
import p003X.L49;

/* loaded from: classes5.dex */
public final class GamePromoteCommentDetailAdapter$onCreateViewHolder$6$2 extends Lambda implements Function2<Dialog, View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L49 this$0;

    static {
        Covode.recordClassIndex(15265);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommentDetailAdapter$onCreateViewHolder$6$2(L49 l49) {
        super(2);
        this.this$0 = l49;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Dialog dialog, View view) {
        String str;
        int i;
        boolean z;
        String str2;
        Dialog dialog2 = dialog;
        if (!PatchProxy.proxy(new Object[]{dialog2, view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(dialog2, view);
            L45 l45 = L45.LIZJ;
            C3243u c3243u = this.this$0.LIZIZ.LIZJ;
            String str3 = "";
            if (c3243u == null || (str = c3243u.LIZJ) == null) {
                str = str3;
            }
            C3243u c3243u2 = this.this$0.LIZIZ.LIZJ;
            if (c3243u2 != null && (str2 = c3243u2.LIZLLL) != null) {
                str3 = str2;
            }
            C2990g c2990g = this.this$0.LIZIZ.LIZIZ;
            if (c2990g != null) {
                i = c2990g.LIZJ;
            } else {
                i = 0;
            }
            C2990g c2990g2 = this.this$0.LIZIZ.LIZIZ;
            if (c2990g2 != null) {
                z = c2990g2.LIZLLL;
            } else {
                z = false;
            }
            l45.LIZ(str, str3, false, i, z);
            C116971W2r.LIZ(dialog2);
        }
        return Unit.INSTANCE;
    }
}
