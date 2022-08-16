package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4266a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.view.C4985a;
import com.bytedance.android.livesdk.chatroom.interact.model.C6062s;
import com.bytedance.android.livesdk.message.model.BidPaidLinkmicStatus;
import com.bytedance.android.livesdk.message.model.C9028x;
import com.bytedance.android.livesdk.message.model.C9030z;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C78519GxN;
import p003X.C78523GxR;
import p003X.C78524GxS;
import p003X.C78525GxT;
import p003X.C78526GxU;
import p003X.C87010KQi;
import p003X.RunnableC78522GxQ;

/* renamed from: com.bytedance.android.live.liveinteract.view.a */
/* loaded from: classes3.dex */
public final class C4985a extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public long LIZJ;
    public final C4378a LJIIJJI;
    public final Function2<Boolean, Integer, Unit> LJIIL;
    public HashMap LJIILIIL;
    public final CompositeDisposable LJFF = new CompositeDisposable();
    public final Observer<Pair<String, String>> LJI = new Observer<Pair<? extends String, ? extends String>>() { // from class: X.924
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30788);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Pair<? extends String, ? extends String> pair) {
            String str;
            String str2;
            Pair<? extends String, ? extends String> pair2 = pair;
            if (!PatchProxy.proxy(new Object[]{pair2}, this, LIZ, false, 1).isSupported) {
                TextView textView = (TextView) C4985a.this.LIZ(2131167990);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                StringBuilder sb = new StringBuilder();
                if (pair2 == null || (str = pair2.getFirst()) == null) {
                    str = "00";
                }
                sb.append(str);
                sb.append(LoggerUtil.TWO_POINT_TAG);
                if (pair2 == null || (str2 = pair2.getSecond()) == null) {
                    str2 = "00";
                }
                sb.append(str2);
                textView.setText(sb.toString());
            }
        }
    };
    public final Observer<C6062s> LJII = new C78526GxU(this);
    public final Observer<BidPaidLinkmicStatus> LJIIIIZZ = new C78524GxS(this);
    public CompositeDisposable LIZLLL = new CompositeDisposable();

    /* renamed from: LJ */
    public CompositeDisposable f26470LJ = new CompositeDisposable();
    public final Observer<C9030z> LJIIIZ = new C78523GxR(this);
    public final Observer<C9028x> LJIIJ = new C78525GxT(this);

    static {
        Covode.recordClassIndex(30781);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new HashMap();
        }
        View view = (View) this.LJIILIIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIILIIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Function2<Boolean, Integer, Unit> getBidDealCb() {
        return this.LJIIL;
    }

    public final C4378a getBidVm() {
        return this.LJIIJJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.LJFF.add(C87010KQi.LIZ().LIZ(C4266a.class).subscribe(new C78519GxN(this)));
        this.LIZIZ = 0;
        LIZ();
        this.LJIIJJI.LJIJJLI.observeForever(this.LJIIJ, true);
        this.LJIIJJI.LJIJI.observeForever(this.LJIIIZ, true);
        this.LJIIJJI.LJIILL.observeForever(this.LJI, true);
        this.LJIIJJI.LJIJ.observeForever(this.LJII, true);
        this.LJIIJJI.LJIIZILJ.observeForever(this.LJIIIIZZ, true);
        post(new RunnableC78522GxQ(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.LJFF.dispose();
        this.f26470LJ.dispose();
        this.LIZLLL.dispose();
        this.LJIIJJI.LJIILL.removeObserver(this.LJI);
        this.LJIIJJI.LJIJJLI.removeObserver(this.LJIIJ);
        this.LJIIJJI.LJIJ.removeObserver(this.LJII);
        this.LJIIJJI.LJIIZILJ.removeObserver(this.LJIIIIZZ);
    }

    public final void LIZ() {
        long j;
        Long l;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        TextView textView = (TextView) LIZ(2131186196);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText("起拍价");
        TextView textView2 = (TextView) LIZ(2131186203);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setText("竞拍中");
        TextView textView3 = (TextView) LIZ(2131168003);
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        C6062s value = this.LJIIJJI.LJIJ.getValue();
        if (value != null && (l = value.LIZJ) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        textView3.setText(String.valueOf(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4985a(Context context, C4378a c4378a, Function2<? super Boolean, ? super Integer, Unit> function2) {
        super(context, null);
        C106862S5w.LIZ(c4378a);
        MethodCollector.m14708i(2071);
        this.LJIIJJI = c4378a;
        this.LJIIL = function2;
        View.inflate(context, 2131699967, this);
        MethodCollector.m14707o(2071);
    }
}
