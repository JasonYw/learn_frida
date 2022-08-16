package com.bytedance.android.live.broadcast.comment;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.L45;
import p003X.L4E;

/* loaded from: classes5.dex */
public final class CommentDetailListDialog$initView$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L4E this$0;

    static {
        Covode.recordClassIndex(15211);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentDetailListDialog$initView$2(L4E l4e) {
        super(0);
        this.this$0 = l4e;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        String str2;
        int i;
        boolean z;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.this$0.LJIIIZ) {
                this.this$0.LJIIIIZZ += (System.currentTimeMillis() - this.this$0.LJII) / 1000;
                this.this$0.LJIIIZ = false;
            }
            L45 l45 = L45.LIZJ;
            C3243u c3243u = this.this$0.LJIIJJI;
            if (c3243u != null) {
                str = c3243u.LIZJ;
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            C3243u c3243u2 = this.this$0.LJIIJJI;
            if (c3243u2 == null || (str2 = c3243u2.LIZLLL) == null) {
                str2 = "";
            }
            String str3 = this.this$0.LJIIL;
            if (str3 == null) {
                str3 = "";
            }
            long j = this.this$0.LJIIIIZZ;
            C2990g c2990g = this.this$0.LJIIJ;
            if (c2990g != null) {
                i = c2990g.LIZJ;
            } else {
                i = 0;
            }
            C2990g c2990g2 = this.this$0.LJIIJ;
            if (c2990g2 != null) {
                z = c2990g2.LIZLLL;
            } else {
                z = false;
            }
            l45.LIZ(valueOf, str2, str3, j, i, z);
            this.this$0.LJIIIIZZ = 0L;
        }
        return Unit.INSTANCE;
    }
}
