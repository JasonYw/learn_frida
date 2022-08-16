package com.bytedance.android.live.broadcast.comment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.AudienceGamePromoteCommentApi;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2986b;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.view.C3252c;
import com.bytedance.android.live.broadcast.view.C3253d;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.L4H;
import p003X.L4I;
import p003X.L4O;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class CommentDetailListView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public LoadingStatusView LIZIZ;
    public CommentBar LIZJ;
    public RecyclerView LIZLLL;

    /* renamed from: LJ */
    public L4O f25805LJ;
    public final CompositeDisposable LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public C2990g LJIIJJI;
    public C3243u LJIIL;
    public String LJIILIIL;
    public Function0<Unit> LJIILJJIL;
    public Function0<Unit> LJIILL;
    public int LJIILLIIL;

    static {
        Covode.recordClassIndex(15212);
    }

    public CommentDetailListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentDetailListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C2990g getViewModel() {
        return this.LJIIJJI;
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            LK1.LIZJ(recyclerView);
        }
        LoadingStatusView loadingStatusView = this.LIZIZ;
        if (loadingStatusView != null) {
            LK1.LIZJ(loadingStatusView);
        }
        LoadingStatusView loadingStatusView2 = this.LIZIZ;
        if (loadingStatusView2 != null) {
            loadingStatusView2.LIZIZ();
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            LK1.LIZJ(recyclerView);
        }
        LoadingStatusView loadingStatusView = this.LIZIZ;
        if (loadingStatusView != null) {
            loadingStatusView.LIZ();
        }
        LoadingStatusView loadingStatusView2 = this.LIZIZ;
        if (loadingStatusView2 != null) {
            LK1.LIZ((View) loadingStatusView2);
        }
    }

    public final View getEmptyView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C3252c c3252c = new C3252c(context, null, 0, 6);
        c3252c.setImageLayoutParams(new LinearLayout.LayoutParams(LK5.LIZ(240.0f), LK5.LIZ(160.0f)));
        c3252c.setMsgText(LK5.LIZ(2131583532));
        return c3252c;
    }

    public final View getErrorView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C3253d c3253d = new C3253d(context, null, 0, 6);
        c3253d.setOnRetryClickListener(new CommentDetailListView$getErrorView$1(this));
        c3253d.setImageLayoutParams(new LinearLayout.LayoutParams(LK5.LIZ(240.0f), LK5.LIZ(160.0f)));
        return c3253d;
    }

    public final void setViewModel(C2990g c2990g) {
        this.LJIIJJI = c2990g;
    }

    public final void setOcclusionListener(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        this.LJIILJJIL = function0;
    }

    public final void setOnGoBackClickListener(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        this.LJIILL = function0;
    }

    public final void LIZ(int i) {
        ArrayList<C2985a> arrayList;
        String str;
        Observable<C5176i<C2986b>> observeOn;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!this.LJIIIIZZ) {
            C88440Kt0.LIZ(LK5.LIZ(2131583536));
        } else if (this.LJIIIZ) {
        } else {
            this.LJIIIZ = true;
            ArrayList arrayList2 = new ArrayList();
            if (this.LJII == 0) {
                LIZIZ();
            } else {
                L4O l4o = this.f25805LJ;
                if (l4o != null && (arrayList = l4o.LJIIIZ) != null) {
                    arrayList2.addAll(arrayList);
                }
            }
            AudienceGamePromoteCommentApi audienceGamePromoteCommentApi = (AudienceGamePromoteCommentApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteCommentApi.class);
            C3243u c3243u = this.LJIIL;
            if (c3243u != null) {
                str = c3243u.LIZJ;
            } else {
                str = null;
            }
            Observable<C5176i<C2986b>> commentDetailList = audienceGamePromoteCommentApi.getCommentDetailList(str, i, this.LJIILLIIL, this.LJII);
            if (commentDetailList != null && (observeOn = commentDetailList.observeOn(AndroidSchedulers.mainThread())) != null && (subscribe = observeOn.subscribe(new L4H(this, arrayList2, i), new L4I(this, arrayList2))) != null) {
                QB4.LIZ(subscribe, this.LJFF);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentDetailListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1223);
        this.LJFF = new CompositeDisposable();
        this.LJIILLIIL = 10;
        this.LJIIIIZZ = true;
        this.LJIIJ = true;
        this.LJIILIIL = "";
        this.LJIILJJIL = CommentDetailListView$occlusionListener$1.INSTANCE;
        setOrientation(1);
        addView(C116971W2r.LIZ(LayoutInflater.from(context), 2131698659, (ViewGroup) this, false));
        this.LJIILL = CommentDetailListView$mAction$1.INSTANCE;
        MethodCollector.m14707o(1223);
    }

    public /* synthetic */ CommentDetailListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
