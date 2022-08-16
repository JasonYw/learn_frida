package com.bytedance.android.live.broadcast.comment;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.comment.data.C2987d;
import com.bytedance.android.live.broadcast.comment.data.C2993j;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C3VF;
import p003X.C89135LAb;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class CommentReplyListView$sendReply$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $content;
    public final /* synthetic */ CommentReplyListView this$0;

    static {
        Covode.recordClassIndex(15245);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReplyListView$sendReply$1(CommentReplyListView commentReplyListView, String str) {
        super(1);
        this.this$0 = commentReplyListView;
        this.$content = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        boolean z;
        TextView textView;
        C2987d LIZ;
        ArrayList<C2987d> arrayList;
        IUser iUser;
        C3VF user;
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            if (!TextUtils.isEmpty(str2)) {
                C2987d c2987d = new C2987d();
                c2987d.LIZ = 1;
                c2987d.LJIIJ = new C2993j();
                C2993j c2993j = c2987d.LJIIJ;
                if (c2993j != null) {
                    c2993j.LIZ = str2;
                }
                C2993j c2993j2 = c2987d.LJIIJ;
                if (c2993j2 != null) {
                    c2993j2.LIZLLL = 1L;
                }
                C2993j c2993j3 = c2987d.LJIIJ;
                if (c2993j3 != null) {
                    c2993j3.LIZJ = this.this$0.LJII;
                }
                C2993j c2993j4 = c2987d.LJIIJ;
                if (c2993j4 != null) {
                    c2993j4.LJIIIIZZ = this.$content;
                }
                C2993j c2993j5 = c2987d.LJIIJ;
                if (c2993j5 != null) {
                    c2993j5.LJIIIZ = System.currentTimeMillis() / 1000;
                }
                C2993j c2993j6 = c2987d.LJIIJ;
                if (c2993j6 != null) {
                    IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                    if (iUserService != null && (user = iUserService.user()) != null) {
                        iUser = user.LIZ();
                    } else {
                        iUser = null;
                    }
                    if (!(iUser instanceof User)) {
                        iUser = null;
                    }
                    c2993j6.f25813LJ = (User) iUser;
                }
                C2993j c2993j7 = c2987d.LJIIJ;
                if (c2993j7 != null) {
                    c2993j7.LIZIZ = this.this$0.LJI;
                }
                ArrayList arrayList2 = new ArrayList();
                C89135LAb c89135LAb = this.this$0.LIZLLL;
                if (c89135LAb != null && (arrayList = c89135LAb.LIZJ) != null && (!arrayList.isEmpty())) {
                    arrayList2.addAll(arrayList);
                }
                if (((C2987d) arrayList2.get(1)).LIZ == 3) {
                    z = true;
                } else {
                    z = false;
                }
                C2987d c2987d2 = new C2987d();
                c2987d2.LIZ = 3;
                this.this$0.LJIIL++;
                c2987d2.LIZJ = this.this$0.LJIIL;
                if (!z) {
                    int size = arrayList2.size() - 1;
                    C89135LAb c89135LAb2 = this.this$0.LIZLLL;
                    if (c89135LAb2 != null && (LIZ = c89135LAb2.LIZ(size)) != null) {
                        LIZ.LJIIIIZZ = true;
                        arrayList2.remove(size);
                        arrayList2.add(size, LIZ);
                    }
                    arrayList2.add(1, c2987d2);
                } else {
                    arrayList2.set(1, c2987d2);
                }
                View view = this.this$0.f25806LJ;
                if (view != null && (textView = (TextView) view.findViewById(2131193779)) != null) {
                    textView.setText(LK5.LIZ(2131583556, Long.valueOf(c2987d2.LIZJ)));
                }
                arrayList2.add(2, c2987d);
                C89135LAb c89135LAb3 = this.this$0.LIZLLL;
                if (c89135LAb3 != null) {
                    c89135LAb3.LIZ(arrayList2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
