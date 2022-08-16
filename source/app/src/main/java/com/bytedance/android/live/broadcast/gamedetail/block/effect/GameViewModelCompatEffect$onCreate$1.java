package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89038L6i;
import p003X.C89045L6p;

/* loaded from: classes5.dex */
public final class GameViewModelCompatEffect$onCreate$1 extends Lambda implements Function1<C3101e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89038L6i this$0;

    static {
        Covode.recordClassIndex(16197);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModelCompatEffect$onCreate$1(C89038L6i c89038L6i) {
        super(1);
        this.this$0 = c89038L6i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3101e c3101e) {
        String str;
        C3243u c3243u;
        String str2;
        C3119b c3119b;
        C3243u c3243u2;
        C3119b c3119b2;
        C3119b c3119b3;
        C3119b c3119b4;
        C3243u c3243u3;
        C3101e c3101e2 = c3101e;
        if (!PatchProxy.proxy(new Object[]{c3101e2}, this, changeQuickRedirect, false, 1).isSupported) {
            C2990g LIZLLL = this.this$0.LIZLLL();
            String str3 = null;
            if (c3101e2 != null && (c3119b4 = c3101e2.LIZLLL) != null && (c3243u3 = c3119b4.LIZIZ) != null) {
                str = c3243u3.LIZJ;
            } else {
                str = null;
            }
            LIZLLL.LJFF = str;
            C2990g LIZLLL2 = this.this$0.LIZLLL();
            if (c3101e2 != null && (c3119b3 = c3101e2.LIZLLL) != null) {
                c3243u = c3119b3.LIZIZ;
            } else {
                c3243u = null;
            }
            LIZLLL2.f25812LJ = c3243u;
            C89045L6p m23434LJ = this.this$0.m23434LJ();
            if (c3101e2 != null) {
                str2 = c3101e2.f25877LJ;
            } else {
                str2 = null;
            }
            m23434LJ.f8756LJ = str2;
            if (c3101e2 != null && (c3119b2 = c3101e2.LIZLLL) != null) {
                this.this$0.m23434LJ().LIZIZ().LIZ(c3119b2);
            }
            C89045L6p m23434LJ2 = this.this$0.m23434LJ();
            if (c3101e2 != null && (c3119b = c3101e2.LIZLLL) != null && (c3243u2 = c3119b.LIZIZ) != null) {
                str3 = c3243u2.LIZLLL;
            }
            m23434LJ2.LJI = str3;
        }
        return Unit.INSTANCE;
    }
}
