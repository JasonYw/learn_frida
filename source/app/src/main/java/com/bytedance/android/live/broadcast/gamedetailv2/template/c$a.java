package com.bytedance.android.live.broadcast.gamedetailv2.template;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C88992L4o;
import p003X.IQV;
import p003X.L4U;
import p003X.L7T;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class c$a extends L7T<C3119b> {
    public static ChangeQuickRedirect LIZ;
    public final C2990g LIZLLL;

    /* renamed from: LJ */
    public boolean f25890LJ;
    public final CompositeDisposable LJFF;
    public final NestedChildRecyclerView LJI;

    static {
        Covode.recordClassIndex(16705);
    }

    @Override // p003X.L7T
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJFF.dispose();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        C13491f LIZ2 = IQV.LIZ(C2990g.class);
        this.LIZLLL = (C2990g) (!(LIZ2 instanceof C2990g) ? null : LIZ2);
        this.LJFF = new CompositeDisposable();
        View findViewById = view.findViewById(2131188455);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJI = (NestedChildRecyclerView) findViewById;
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(C3119b c3119b) {
        long j;
        List<C2985a> list;
        boolean z;
        C2WC<String> LIZ2;
        Observable<String> LIZIZ;
        Disposable subscribe;
        C2WC<Boolean> LIZJ;
        Boolean LIZ3;
        C3119b c3119b2 = c3119b;
        if (!PatchProxy.proxy(new Object[]{c3119b2}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c3119b2);
            ArrayList arrayList = new ArrayList();
            C2985a c2985a = new C2985a();
            c2985a.LIZ = 4;
            C2988e c2988e = c3119b2.LJII;
            if (c2988e != null) {
                j = c2988e.LIZIZ;
            } else {
                j = 0;
            }
            c2985a.LIZIZ = Long.valueOf(j);
            arrayList.add(c2985a);
            if (c3119b2.LJIIIIZZ.size() > 3) {
                list = c3119b2.LJIIIIZZ.subList(0, 3);
            } else {
                list = c3119b2.LJIIIIZZ;
            }
            arrayList.addAll(list);
            C2985a c2985a2 = new C2985a();
            c2985a2.LIZ = 5;
            arrayList.add(c2985a2);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ4 != null && (LIZJ = LIZ4.LIZJ()) != null && (LIZ3 = LIZJ.LIZ()) != null) {
                z = LIZ3.booleanValue();
            } else {
                z = true;
            }
            L4U l4u = new L4U(context, z, new ArrayList(), Boolean.FALSE, "promote_detail");
            l4u.LIZLLL = this.LIZLLL;
            l4u.LIZ(new CommentTemplate$CommentViewHolder$bindData$1(this, l4u));
            l4u.LIZIZ(new CommentTemplate$CommentViewHolder$bindData$2(this));
            C2990g c2990g = this.LIZLLL;
            if (c2990g != null && (LIZ2 = c2990g.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new C88992L4o(this, l4u))) != null) {
                QB4.LIZ(subscribe, this.LJFF);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view2.getContext());
            linearLayoutManager.setOrientation(1);
            this.LJI.setLayoutManager(linearLayoutManager);
            this.LJI.setAdapter(l4u);
            l4u.LIZIZ(arrayList, c3119b2.LIZIZ);
        }
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(boolean z, C3119b c3119b) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3119b}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c3119b);
        }
    }
}
