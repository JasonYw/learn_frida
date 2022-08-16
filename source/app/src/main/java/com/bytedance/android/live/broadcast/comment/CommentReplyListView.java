package com.bytedance.android.live.broadcast.comment;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.comment.data.AudienceGamePromoteCommentApi;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2987d;
import com.bytedance.android.live.broadcast.comment.data.C2989f;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.comment.data.C2993j;
import com.bytedance.android.live.broadcast.comment.data.C2994k;
import com.bytedance.android.live.broadcast.view.CommonTitleView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC100834PnQ;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C88306Kqq;
import p003X.C89135LAb;
import p003X.C89136LAc;
import p003X.C89139LAf;
import p003X.C89151LAr;
import p003X.DialogC89144LAk;
import p003X.L45;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class CommentReplyListView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ;
    public RecyclerView LIZJ;
    public C89135LAb LIZLLL;

    /* renamed from: LJ */
    public View f25806LJ;
    public C2990g LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public final View LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;

    static {
        Covode.recordClassIndex(15232);
    }

    public CommentReplyListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentReplyListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: com.bytedance.android.live.broadcast.comment.CommentReplyListView$5 */
    /* loaded from: classes5.dex */
    public static final class C29825 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(15239);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29825(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                DialogC89144LAk dialogC89144LAk = new DialogC89144LAk(this.$context);
                dialogC89144LAk.LIZ(new C29831(dialogC89144LAk));
                C116971W2r.LIZJ(dialogC89144LAk);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcast.comment.CommentReplyListView$5$1 */
        /* loaded from: classes5.dex */
        public static final class C29831 extends Lambda implements Function1<String, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ DialogC89144LAk $dialog;

            static {
                Covode.recordClassIndex(15240);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29831(DialogC89144LAk dialogC89144LAk) {
                super(1);
                this.$dialog = dialogC89144LAk;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i;
                boolean z;
                C2990g c2990g;
                String str2 = str;
                if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
                    CommentReplyListView commentReplyListView = CommentReplyListView.this;
                    String str3 = "";
                    if (!PatchProxy.proxy(new Object[]{str2}, commentReplyListView, CommentReplyListView.LIZ, false, 13).isSupported && (c2990g = commentReplyListView.LJFF) != null) {
                        Context context = commentReplyListView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, str3);
                        String str4 = commentReplyListView.LJII;
                        String str5 = commentReplyListView.LJI;
                        CommentReplyListView$sendReply$1 commentReplyListView$sendReply$1 = new CommentReplyListView$sendReply$1(commentReplyListView, str2);
                        if (!PatchProxy.proxy(new Object[]{c2990g, context, str4, str2, str5, 1L, null, null, null, commentReplyListView$sendReply$1, 224, null}, null, C2990g.LIZ, true, 8).isSupported) {
                            c2990g.LIZ(context, str4, str2, str5, 1L, "", "", "", commentReplyListView$sendReply$1);
                        }
                    }
                    L45 l45 = L45.LIZJ;
                    String str6 = CommentReplyListView.this.LJII;
                    if (str6 == null) {
                        str6 = str3;
                    }
                    String str7 = CommentReplyListView.this.LJIIIIZZ;
                    if (str7 != null) {
                        str3 = str7;
                    }
                    C2990g c2990g2 = CommentReplyListView.this.LJFF;
                    if (c2990g2 != null) {
                        i = c2990g2.LIZJ;
                    } else {
                        i = 0;
                    }
                    C2990g c2990g3 = CommentReplyListView.this.LJFF;
                    if (c2990g3 != null) {
                        z = c2990g3.LIZLLL;
                    } else {
                        z = false;
                    }
                    l45.LIZ(str6, str3, "first_level", i, z);
                    C116971W2r.LIZ(this.$dialog);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void setOnGoBackClickListener(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        ((CommonTitleView) findViewById(2131192298)).setOnBackClickListener(function0);
    }

    /* renamed from: com.bytedance.android.live.broadcast.comment.CommentReplyListView$2 */
    /* loaded from: classes5.dex */
    public static final class C29782 extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(15235);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29782(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            String str;
            ReplyInputView replyInputView;
            ArrayList<C2987d> arrayList;
            C2987d c2987d;
            C2993j c2993j;
            User user;
            int intValue = num.intValue();
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
                DialogC89144LAk dialogC89144LAk = new DialogC89144LAk(this.$context);
                C89135LAb c89135LAb = CommentReplyListView.this.LIZLLL;
                if (c89135LAb != null && (arrayList = c89135LAb.LIZJ) != null && (c2987d = arrayList.get(intValue)) != null && (c2993j = c2987d.LJIIJ) != null && (user = c2993j.f25813LJ) != null) {
                    str = user.getNickName();
                } else {
                    str = null;
                }
                if (!PatchProxy.proxy(new Object[]{str}, dialogC89144LAk, DialogC89144LAk.LIZ, false, 4).isSupported && (replyInputView = dialogC89144LAk.LIZIZ) != null) {
                    replyInputView.setHintText(LK5.LIZ(2131583555, str));
                }
                dialogC89144LAk.LIZ(new C29791(intValue, dialogC89144LAk));
                C116971W2r.LIZJ(dialogC89144LAk);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcast.comment.CommentReplyListView$2$1 */
        /* loaded from: classes5.dex */
        public static final class C29791 extends Lambda implements Function1<String, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ DialogC89144LAk $dialog;
            public final /* synthetic */ int $position;

            static {
                Covode.recordClassIndex(15236);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29791(int i, DialogC89144LAk dialogC89144LAk) {
                super(1);
                this.$position = i;
                this.$dialog = dialogC89144LAk;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ kotlin.Unit invoke(java.lang.String r23) {
                /*
                    Method dump skipped, instructions count: 209
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.comment.CommentReplyListView.C29782.C29791.invoke(java.lang.Object):java.lang.Object");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.comment.CommentReplyListView$1 */
    /* loaded from: classes5.dex */
    public static final class C29761 extends Lambda implements Function8<Integer, String, Integer, Integer, String, Long, String, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(15233);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29761(Context context) {
            super(8);
            this.$context = context;
        }

        /* renamed from: com.bytedance.android.live.broadcast.comment.CommentReplyListView$1$1 */
        /* loaded from: classes5.dex */
        public static final class C29771 extends Lambda implements Function1<Integer, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(15234);
            }

            public C29771() {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v45, types: [kotlin.Unit, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Integer num) {
                ArrayList<C2987d> arrayList;
                long j;
                C2989f c2989f;
                long j2;
                C2989f c2989f2;
                C2989f c2989f3;
                C2989f c2989f4;
                long j3;
                C2989f c2989f5;
                C2989f c2989f6;
                int intValue = num.intValue();
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C89135LAb c89135LAb = CommentReplyListView.this.LIZLLL;
                if (c89135LAb != null) {
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, c89135LAb, C89135LAb.LIZ, false, 2).isSupported && (arrayList = c89135LAb.LIZJ) != null) {
                        C2987d c2987d = arrayList.get(intValue);
                        Intrinsics.checkNotNullExpressionValue(c2987d, "");
                        C2987d c2987d2 = c2987d;
                        C2987d LIZ = c89135LAb.LIZ(intValue);
                        C2985a c2985a = c2987d2.LIZIZ;
                        long j4 = 0;
                        if (c2985a != null) {
                            C2989f c2989f7 = c2985a.f25808LJ;
                            if (c2989f7 != null) {
                                j = c2989f7.LJIIIZ ^ 1;
                            } else {
                                j = 0;
                            }
                            C2985a c2985a2 = LIZ.LIZIZ;
                            if (c2985a2 != null && (c2989f6 = c2985a2.f25808LJ) != null) {
                                c2989f6.LJIIIZ = j;
                            }
                            C2985a c2985a3 = LIZ.LIZIZ;
                            if (c2985a3 != null && (c2989f3 = c2985a3.f25808LJ) != null && (c2989f3.LJIIIZ & 1) == 1) {
                                C2985a c2985a4 = LIZ.LIZIZ;
                                if (c2985a4 != null && (c2989f4 = c2985a4.f25808LJ) != null) {
                                    C2985a c2985a5 = LIZ.LIZIZ;
                                    if (c2985a5 != null && (c2989f5 = c2985a5.f25808LJ) != null) {
                                        j3 = c2989f5.LJIIIIZZ + 1;
                                    } else {
                                        j3 = 0;
                                    }
                                    c2989f4.LJIIIIZZ = j3;
                                }
                            } else {
                                C2985a c2985a6 = LIZ.LIZIZ;
                                if (c2985a6 != null && (c2989f = c2985a6.f25808LJ) != null) {
                                    C2985a c2985a7 = LIZ.LIZIZ;
                                    if (c2985a7 != null && (c2989f2 = c2985a7.f25808LJ) != null) {
                                        j2 = c2989f2.LJIIIIZZ - 1;
                                    } else {
                                        j2 = 0;
                                    }
                                    c2989f.LJIIIIZZ = j2;
                                }
                            }
                        }
                        C2993j c2993j = c2987d2.LJIIJ;
                        if (c2993j != null) {
                            long j5 = c2993j.LJIIL ^ 1;
                            C2993j c2993j2 = LIZ.LJIIJ;
                            if (c2993j2 != null) {
                                c2993j2.LJIIL = j5;
                            }
                            C2993j c2993j3 = LIZ.LJIIJ;
                            if (c2993j3 != null && (c2993j3.LJIIL & 1) == 1) {
                                C2993j c2993j4 = LIZ.LJIIJ;
                                if (c2993j4 != null) {
                                    C2993j c2993j5 = LIZ.LJIIJ;
                                    if (c2993j5 != null) {
                                        j4 = c2993j5.LJIIJ + 1;
                                    }
                                    c2993j4.LJIIJ = j4;
                                }
                            } else {
                                C2993j c2993j6 = LIZ.LJIIJ;
                                if (c2993j6 != null) {
                                    C2993j c2993j7 = LIZ.LJIIJ;
                                    if (c2993j7 != null) {
                                        j4 = c2993j7.LJIIJ - 1;
                                    }
                                    c2993j6.LJIIJ = j4;
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        arrayList2.remove(intValue);
                        arrayList2.add(intValue, LIZ);
                        c89135LAb.LIZ(arrayList2);
                    }
                    return Unit.INSTANCE;
                }
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function8
        public final /* synthetic */ Unit LIZ(Integer num, String str, Integer num2, Integer num3, String str2, Long l, String str3, String str4) {
            C2990g c2990g;
            int intValue = num.intValue();
            String str5 = str;
            Integer num4 = num2;
            Integer num5 = num3;
            String str6 = str2;
            Long l2 = l;
            String str7 = str3;
            String str8 = str4;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str5, num4, num5, str6, l2, str7, str8}, this, changeQuickRedirect, false, 1).isSupported && (c2990g = CommentReplyListView.this.LJFF) != null) {
                c2990g.LIZ(this.$context, intValue, str5, num4, num5, str6, l2, str7, str8, new C29771());
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.comment.CommentReplyListView$3 */
    /* loaded from: classes5.dex */
    public static final class C29803 extends Lambda implements Function3<Integer, String, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(15237);
        }

        public C29803() {
            super(3);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [byte, boolean] */
        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(Integer num, String str, Boolean bool) {
            C2987d LIZ;
            ArrayList<C2987d> arrayList;
            int intValue = num.intValue();
            String str2 = str;
            ?? booleanValue = bool.booleanValue();
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str2, Byte.valueOf(booleanValue == true ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
                CommentReplyListView commentReplyListView = CommentReplyListView.this;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str2, Byte.valueOf((byte) booleanValue)}, commentReplyListView, CommentReplyListView.LIZ, false, 11).isSupported) {
                    ArrayList arrayList2 = new ArrayList();
                    C89135LAb c89135LAb = commentReplyListView.LIZLLL;
                    if (c89135LAb != null && (arrayList = c89135LAb.LIZJ) != null && (!arrayList.isEmpty())) {
                        arrayList2.addAll(arrayList);
                    }
                    C89135LAb c89135LAb2 = commentReplyListView.LIZLLL;
                    if (c89135LAb2 != null && (LIZ = c89135LAb2.LIZ(intValue)) != null) {
                        arrayList2.remove(intValue);
                        arrayList2.add(intValue, LIZ);
                    }
                    if (booleanValue != 0) {
                        ((C2987d) arrayList2.get(intValue)).LJII = true;
                        C89135LAb c89135LAb3 = commentReplyListView.LIZLLL;
                        if (c89135LAb3 != null) {
                            c89135LAb3.LIZ(arrayList2);
                        }
                        commentReplyListView.LIZ(commentReplyListView.LJII, 2L, commentReplyListView.LJI, str2, intValue);
                    } else {
                        Object obj = arrayList2.get(intValue);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        C2987d c2987d = (C2987d) obj;
                        arrayList2.subList((intValue + 1) - c2987d.LJFF, intValue).clear();
                        c2987d.f25809LJ = true;
                        c2987d.LJFF = c2987d.LJI;
                        C89135LAb c89135LAb4 = commentReplyListView.LIZLLL;
                        if (c89135LAb4 != null) {
                            c89135LAb4.LIZ(arrayList2);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReplyListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextView textView;
        View findViewById;
        TextView textView2;
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1224);
        this.LIZIZ = new CompositeDisposable();
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131699802, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LJIILLIIL = LIZ2;
        this.LJI = "";
        this.LJIIIZ = "";
        this.LJIIZILJ = 10;
        this.LJIJ = 3;
        this.LJIILIIL = true;
        this.f25806LJ = this.LJIILLIIL.findViewById(2131170239);
        View view = this.f25806LJ;
        if (view != null) {
            view.setBackgroundColor(LK5.LIZIZ(2131628628));
        }
        View view2 = this.f25806LJ;
        if (view2 != null && (textView2 = (TextView) view2.findViewById(2131193773)) != null) {
            LK1.LIZ(textView2);
        }
        View view3 = this.f25806LJ;
        if (view3 != null && (findViewById = view3.findViewById(2131196921)) != null) {
            LK1.LIZ(findViewById);
        }
        View view4 = this.f25806LJ;
        if (view4 != null && (textView = (TextView) view4.findViewById(2131193772)) != null) {
            LK1.LIZ(textView);
        }
        View view5 = this.f25806LJ;
        if (view5 != null) {
            view5.setPadding(LK5.LIZ(16.0f), LK5.LIZ(15.0f), LK5.LIZ(16.0f), LK5.LIZ(12.0f));
        }
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setBackgroundColor(LK5.LIZIZ(2131628628));
        this.LIZJ = (RecyclerView) this.LJIILLIIL.findViewById(2131188457);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = this.LIZJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        this.LIZLLL = new C89135LAb(context);
        C89135LAb c89135LAb = this.LIZLLL;
        if (c89135LAb != null) {
            C29761 c29761 = new C29761(context);
            if (!PatchProxy.proxy(new Object[]{c29761}, c89135LAb, C89135LAb.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(c29761);
                c89135LAb.f8781LJ = c29761;
            }
        }
        C89135LAb c89135LAb2 = this.LIZLLL;
        if (c89135LAb2 != null) {
            C29782 c29782 = new C29782(context);
            if (!PatchProxy.proxy(new Object[]{c29782}, c89135LAb2, C89135LAb.LIZ, false, 5).isSupported) {
                C106862S5w.LIZ(c29782);
                c89135LAb2.LJFF = c29782;
            }
        }
        C89135LAb c89135LAb3 = this.LIZLLL;
        if (c89135LAb3 != null) {
            C29803 c29803 = new C29803();
            if (!PatchProxy.proxy(new Object[]{c29803}, c89135LAb3, C89135LAb.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(c29803);
                c89135LAb3.LJI = c29803;
            }
        }
        RecyclerView recyclerView2 = this.LIZJ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LIZLLL);
        }
        RecyclerView recyclerView3 = this.LIZJ;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.live.broadcast.comment.CommentReplyListView.4
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(15238);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void onScrolled(RecyclerView recyclerView4, int i2, int i3) {
                    RecyclerView.LayoutManager mo25799getLayoutManager;
                    ArrayList<C2987d> arrayList;
                    C89135LAb c89135LAb4;
                    ArrayList<C2987d> arrayList2;
                    C2987d c2987d;
                    C89135LAb c89135LAb5;
                    ArrayList<C2987d> arrayList3;
                    C2987d c2987d2;
                    RecyclerView recyclerView5;
                    if (PatchProxy.proxy(new Object[]{recyclerView4, Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(recyclerView4);
                    super.onScrolled(recyclerView4, i2, i3);
                    CommentReplyListView commentReplyListView = CommentReplyListView.this;
                    if (!PatchProxy.proxy(new Object[]{recyclerView4}, commentReplyListView, CommentReplyListView.LIZ, false, 10).isSupported) {
                        RecyclerView recyclerView6 = commentReplyListView.LIZJ;
                        if (recyclerView6 != null && (mo25799getLayoutManager = recyclerView6.mo25799getLayoutManager()) != null) {
                            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) mo25799getLayoutManager;
                            int findLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                            C89135LAb c89135LAb6 = commentReplyListView.LIZLLL;
                            if (c89135LAb6 != null && (arrayList = c89135LAb6.LIZJ) != null && findLastVisibleItemPosition == arrayList.size() - 1 && (c89135LAb4 = commentReplyListView.LIZLLL) != null && (arrayList2 = c89135LAb4.LIZJ) != null && (c2987d = arrayList2.get(findLastVisibleItemPosition)) != null && c2987d.LIZ == 5 && (c89135LAb5 = commentReplyListView.LIZLLL) != null && (arrayList3 = c89135LAb5.LIZJ) != null && (c2987d2 = arrayList3.get(findLastVisibleItemPosition)) != null && c2987d2.LIZLLL && (recyclerView5 = commentReplyListView.LIZJ) != null) {
                                recyclerView5.smoothScrollToPosition(findLastVisibleItemPosition);
                            }
                            if (!recyclerView4.canScrollVertically(1) && commentReplyListView.LJIILIIL) {
                                CommentReplyListView.LIZ(commentReplyListView, commentReplyListView.LJII, 1L, commentReplyListView.LJI, null, 0, 24, null);
                            }
                            View findViewByPosition = linearLayoutManager2.findViewByPosition(1);
                            if (findViewByPosition != null) {
                                if (findViewByPosition.getTop() < 0) {
                                    View view6 = commentReplyListView.f25806LJ;
                                    if (view6 != null) {
                                        LK1.LIZJ(view6);
                                        return;
                                    }
                                    return;
                                }
                                View view7 = commentReplyListView.f25806LJ;
                                if (view7 != null) {
                                    LK1.LIZ(view7);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                    }
                }
            });
        }
        C89135LAb c89135LAb4 = this.LIZLLL;
        if (c89135LAb4 != null) {
            c89135LAb4.LIZ(new ArrayList());
        }
        ((ReplyInputView) findViewById(2131177865)).setOnInputClickListener(new C29825(context));
        MethodCollector.m14707o(1224);
    }

    public /* synthetic */ CommentReplyListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void LIZ(String str, Long l, String str2, String str3, int i) {
        int i2;
        int i3;
        HashMap hashMap;
        C2987d LIZ2;
        Observable<AbstractC100834PnQ<C2994k>> observeOn;
        Observable<AbstractC100834PnQ<C2994k>> doFinally;
        Disposable subscribe;
        ArrayList<C2987d> arrayList;
        if (PatchProxy.proxy(new Object[]{str, l, str2, str3, Integer.valueOf(i)}, this, LIZ, false, 4).isSupported || this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        if ((l == null || ((int) l.longValue()) == 1) && !this.LJIILIIL) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        C89135LAb c89135LAb = this.LIZLLL;
        if (c89135LAb != null && (arrayList = c89135LAb.LIZJ) != null && (!arrayList.isEmpty())) {
            arrayList2.addAll(arrayList);
        }
        AudienceGamePromoteCommentApi audienceGamePromoteCommentApi = (AudienceGamePromoteCommentApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteCommentApi.class);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, l, str2, str3, arrayList2, Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            hashMap = (HashMap) proxy.result;
        } else {
            if (l != null && ((int) l.longValue()) != 1) {
                i2 = this.LJIJ;
                C89135LAb c89135LAb2 = this.LIZLLL;
                if (c89135LAb2 != null && (LIZ2 = c89135LAb2.LIZ(i)) != null) {
                    arrayList2.remove(i);
                    arrayList2.add(i, LIZ2);
                }
                if (((C2987d) arrayList2.get(i)).LJIIIZ) {
                    i2++;
                    if (((C2987d) arrayList2.get(i)).LJFF == ((C2987d) arrayList2.get(i)).LJI) {
                        ((C2987d) arrayList2.get(i)).LJFF = 0;
                    }
                }
                i3 = ((C2987d) arrayList2.get(i)).LJFF;
            } else {
                i2 = this.LJIIZILJ;
                i3 = this.LJIIJJI;
            }
            hashMap = new HashMap();
            hashMap.put("game_id", String.valueOf(str));
            hashMap.put("layer", String.valueOf(l));
            hashMap.put("count", String.valueOf(i2));
            hashMap.put("offset", String.valueOf(i3));
            hashMap.put("eval_id", String.valueOf(str2));
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("reply_to_comment_id", String.valueOf(str3));
            }
        }
        Observable<AbstractC100834PnQ<C2994k>> fetchReplyList = audienceGamePromoteCommentApi.fetchReplyList(hashMap);
        if (fetchReplyList != null && (observeOn = fetchReplyList.observeOn(AndroidSchedulers.mainThread())) != null && (doFinally = observeOn.doFinally(new C89151LAr(this))) != null && (subscribe = doFinally.subscribe(new C89136LAc(this, l, arrayList2, i), new C89139LAf(this, l, arrayList2))) != null) {
            QB4.LIZ(subscribe, this.LIZIZ);
        }
    }

    public static /* synthetic */ void LIZ(CommentReplyListView commentReplyListView, String str, Long l, String str2, String str3, int i, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{commentReplyListView, str, l, str2, null, 0, 24, null}, null, LIZ, true, 5).isSupported) {
            return;
        }
        commentReplyListView.LIZ(str, l, str2, "", -1);
    }
}
