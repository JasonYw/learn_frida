package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.C4307p;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.k$b;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import p003X.AbstractC80062HhA;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.u */
/* loaded from: classes3.dex */
public final class C4350u extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public DataCenter LIZIZ;
    public AbstractC80062HhA LIZJ;

    /* renamed from: LJ */
    public C4307p f26283LJ;
    public CompositeDisposable LJFF;
    public TextView LJIIJJI;
    public final k$b LJIIL;
    public C5923dp LIZLLL = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0, 3, null);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(PKRecordViewHolder$nonFixWidth$2.INSTANCE);
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(PKRecordViewHolder$minNickWidth$2.INSTANCE);
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(PKRecordViewHolder$btnWidth$2.INSTANCE);
    public final int LJIIIIZZ = LK5.LIZ(4.0f);
    public final int LJIILJJIL = LK5.LIZ(39.0f);
    public final int LJIILL = LK5.LIZ(32.0f);
    public final int LJIIIZ = LK5.LIZ(16.0f);
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(new PKRecordViewHolder$sexWidth$2(this));

    static {
        Covode.recordClassIndex(26134);
    }

    public final int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : ((Number) this.LJIILIIL.mo27335getValue()).intValue();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.f26283LJ = null;
        CompositeDisposable compositeDisposable = this.LJFF;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.LJFF = null;
    }

    public final Triple<String, Integer, Integer> LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (Triple) proxy.result;
        }
        if (i != 1) {
            if (i != 2) {
                return new Triple<>("", Integer.valueOf(this.LJIILJJIL), Integer.valueOf(this.LJIIIIZZ * 2));
            }
            return new Triple<>("好友", Integer.valueOf(this.LJIILL), Integer.valueOf(this.LJIIIIZZ * 3));
        }
        return new Triple<>("已关注", Integer.valueOf(this.LJIILJJIL), Integer.valueOf(this.LJIIIIZZ * 2));
    }

    public final void LIZ(TextView textView, Triple<String, Integer, Integer> triple) {
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{textView, triple}, this, LIZ, false, 7).isSupported && textView != null) {
            String first = triple.getFirst();
            if (first == null || first.length() == 0) {
                i = 4;
            }
            textView.setVisibility(i);
            textView.setText(triple.getFirst());
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = triple.getSecond().intValue();
            textView.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4350u(View view, AbstractC80062HhA abstractC80062HhA, DataCenter dataCenter, k$b k_b) {
        super(view);
        C106862S5w.LIZ(view, abstractC80062HhA);
        this.LJIIL = k_b;
        this.LIZIZ = dataCenter;
        this.LIZJ = abstractC80062HhA;
    }
}
