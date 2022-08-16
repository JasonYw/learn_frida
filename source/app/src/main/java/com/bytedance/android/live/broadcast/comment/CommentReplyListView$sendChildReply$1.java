package com.bytedance.android.live.broadcast.comment;

import android.text.TextUtils;
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

/* loaded from: classes5.dex */
public final class CommentReplyListView$sendChildReply$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $content;
    public final /* synthetic */ C2993j $info;
    public final /* synthetic */ int $position;
    public final /* synthetic */ String $replyId;
    public final /* synthetic */ CommentReplyListView this$0;

    static {
        Covode.recordClassIndex(15244);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReplyListView$sendChildReply$1(CommentReplyListView commentReplyListView, String str, String str2, C2993j c2993j, int i) {
        super(1);
        this.this$0 = commentReplyListView;
        this.$content = str;
        this.$replyId = str2;
        this.$info = c2993j;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        ArrayList<C2987d> arrayList;
        String str2;
        C2993j c2993j;
        IUser iUser;
        C3VF user;
        String str3 = str;
        if (!PatchProxy.proxy(new Object[]{str3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str3);
            if (!TextUtils.isEmpty(str3)) {
                C2987d c2987d = new C2987d();
                c2987d.LIZ = 2;
                c2987d.LJIIJ = new C2993j();
                C2993j c2993j2 = c2987d.LJIIJ;
                if (c2993j2 != null) {
                    c2993j2.LIZ = str3;
                }
                C2993j c2993j3 = c2987d.LJIIJ;
                if (c2993j3 != null) {
                    c2993j3.LIZLLL = 2L;
                }
                C2993j c2993j4 = c2987d.LJIIJ;
                if (c2993j4 != null) {
                    c2993j4.LIZJ = this.this$0.LJII;
                }
                C2993j c2993j5 = c2987d.LJIIJ;
                if (c2993j5 != null) {
                    c2993j5.LJIIIIZZ = this.$content;
                }
                C2993j c2993j6 = c2987d.LJIIJ;
                if (c2993j6 != null) {
                    c2993j6.LJIIIZ = System.currentTimeMillis() / 1000;
                }
                C2993j c2993j7 = c2987d.LJIIJ;
                User user2 = null;
                if (c2993j7 != null) {
                    IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                    if (iUserService != null && (user = iUserService.user()) != null) {
                        iUser = user.LIZ();
                    } else {
                        iUser = null;
                    }
                    if (!(iUser instanceof User)) {
                        iUser = null;
                    }
                    c2993j7.f25813LJ = (User) iUser;
                }
                C2993j c2993j8 = c2987d.LJIIJ;
                if (c2993j8 != null) {
                    c2993j8.LIZIZ = this.this$0.LJI;
                }
                C2993j c2993j9 = c2987d.LJIIJ;
                if (c2993j9 != null) {
                    String str4 = this.$replyId;
                    if (str4 == null) {
                        str4 = "";
                    }
                    c2993j9.LJFF = str4;
                }
                C2993j c2993j10 = this.$info;
                if (c2993j10 != null && ((int) c2993j10.LIZLLL) == 2 && (c2993j = c2987d.LJIIJ) != null) {
                    C2993j c2993j11 = this.$info;
                    if (c2993j11 != null) {
                        user2 = c2993j11.f25813LJ;
                    }
                    c2993j.LJI = user2;
                }
                C2993j c2993j12 = c2987d.LJIIJ;
                if (c2993j12 != null) {
                    C2993j c2993j13 = this.$info;
                    if (c2993j13 == null || (str2 = c2993j13.LIZ) == null) {
                        str2 = "";
                    }
                    c2993j12.LJII = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                C89135LAb c89135LAb = this.this$0.LIZLLL;
                if (c89135LAb != null && (arrayList = c89135LAb.LIZJ) != null && (!arrayList.isEmpty())) {
                    arrayList2.addAll(arrayList);
                }
                int i = this.$position + 1;
                int size = arrayList2.size() - 1;
                if (i <= size) {
                    while (((C2987d) arrayList2.get(i)).LIZ != 4 && ((C2987d) arrayList2.get(i)).LIZ != 1 && ((C2987d) arrayList2.get(i)).LIZ != 5) {
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                    ((C2987d) arrayList2.get(i)).LJIIIZ = true;
                    ((C2987d) arrayList2.get(i)).LJFF++;
                    arrayList2.add(i, c2987d);
                }
                C89135LAb c89135LAb2 = this.this$0.LIZLLL;
                if (c89135LAb2 != null) {
                    c89135LAb2.LIZ(arrayList2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
