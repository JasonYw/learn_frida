package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.view.CountDownClockView;
import com.bytedance.android.live.liveinteract.view.LiveBiddingInfoView;
import com.bytedance.android.livesdk.chatroom.interact.model.C6062s;
import com.bytedance.android.livesdk.message.model.C9028x;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class LiveBiddingInfoView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public C4378a LIZIZ;
    public C6062s LIZJ;
    public C9028x LIZLLL;

    /* renamed from: LJ */
    public final Observer<Pair<String, String>> f26465LJ = new Observer<Pair<? extends String, ? extends String>>() { // from class: X.4wU
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30742);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Pair<? extends String, ? extends String> pair) {
            Pair<? extends String, ? extends String> pair2 = pair;
            if (!PatchProxy.proxy(new Object[]{pair2}, this, LIZ, false, 1).isSupported && pair2 != null) {
                ((CountDownClockView) LiveBiddingInfoView.this.LIZ(2131168021)).getMinute().setText(pair2.getFirst());
                ((CountDownClockView) LiveBiddingInfoView.this.LIZ(2131168021)).getSecond().setText(pair2.getSecond());
            }
        }
    };
    public final Observer<Pair<Integer, String>> LJFF = new Observer<Pair<? extends Integer, ? extends String>>() { // from class: X.4wV
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30746);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Pair<? extends Integer, ? extends String> pair) {
            Pair<? extends Integer, ? extends String> pair2 = pair;
            if (!PatchProxy.proxy(new Object[]{pair2}, this, LIZ, false, 1).isSupported && pair2 != null) {
                TextView textView = (TextView) LiveBiddingInfoView.this.LIZ(2131168009);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(pair2.getSecond());
            }
        }
    };
    public final Observer<String> LJI = new Observer<String>() { // from class: X.4wX
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30743);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(String str) {
            String str2 = str;
            if (!PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 1).isSupported && str2 != null) {
                TextView textView = (TextView) LiveBiddingInfoView.this.LIZ(2131180938);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(str2);
            }
        }
    };
    public final Observer<Integer> LJII = new Observer<Integer>() { // from class: X.4wW
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30744);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Integer num) {
            String str;
            Integer num2 = num;
            if (!PatchProxy.proxy(new Object[]{num2}, this, LIZ, false, 1).isSupported) {
                TextView textView = (TextView) LiveBiddingInfoView.this.LIZ(2131168019);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (num2 == null || (str = String.valueOf(num2.intValue())) == null) {
                    str = "0";
                }
                textView.setText(str);
            }
        }
    };
    public final Observer<Pair<String, ImageModel>> LJIIIIZZ = new Observer<Pair<? extends String, ? extends ImageModel>>() { // from class: X.5tU
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30745);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Pair<? extends String, ? extends ImageModel> pair) {
            Pair<? extends String, ? extends ImageModel> pair2 = pair;
            if (!PatchProxy.proxy(new Object[]{pair2}, this, LIZ, false, 1).isSupported) {
                if (pair2 == null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) LiveBiddingInfoView.this.LIZ(2131168015);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    constraintLayout.setVisibility(8);
                    return;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) LiveBiddingInfoView.this.LIZ(2131168015);
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(0);
                String first = pair2.getFirst();
                if (first != null) {
                    TextView textView = (TextView) LiveBiddingInfoView.this.LIZ(2131180945);
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    new StringBuilder();
                    textView.setText(C0002O.m25086C(first, "出价"));
                }
                ImageModel second = pair2.getSecond();
                if (second != null) {
                    M0Q.LIZIZ((ImageView) LiveBiddingInfoView.this.LIZ(2131180944), second);
                }
            }
        }
    };
    public HashMap LJIIIZ;

    static {
        Covode.recordClassIndex(30741);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View view = (View) this.LJIIIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C9028x getBidPaidLinkmicBidInfo() {
        return this.LIZLLL;
    }

    public final C6062s getBidPaidLinkmicContent() {
        return this.LIZJ;
    }

    public final C4378a getMViewModel() {
        return this.LIZIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NextLiveData<Pair<String, String>> nextLiveData;
        NextLiveData<Pair<Integer, String>> nextLiveData2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        C4378a c4378a = this.LIZIZ;
        if (c4378a != null && (nextLiveData2 = c4378a.LJIIJ) != null) {
            nextLiveData2.removeObserver(this.LJFF);
        }
        C4378a c4378a2 = this.LIZIZ;
        if (c4378a2 != null && (nextLiveData = c4378a2.LJIILL) != null) {
            nextLiveData.removeObserver(this.f26465LJ);
        }
    }

    public final void setBidPaidLinkmicBidInfo(C9028x c9028x) {
        this.LIZLLL = c9028x;
    }

    public final void setBidPaidLinkmicContent(C6062s c6062s) {
        this.LIZJ = c6062s;
    }

    public final void setMViewModel(C4378a c4378a) {
        this.LIZIZ = c4378a;
    }

    public final void setBidWatting(C6062s c6062s) {
        if (PatchProxy.proxy(new Object[]{c6062s}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6062s);
        this.LIZJ = c6062s;
    }

    public final void setBiddingInfo(C9028x c9028x) {
        if (PatchProxy.proxy(new Object[]{c9028x}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9028x);
        this.LIZLLL = c9028x;
    }

    public final void LIZ(C4378a c4378a) {
        if (PatchProxy.proxy(new Object[]{c4378a}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4378a);
        this.LIZIZ = c4378a;
        c4378a.LJIILL.observeForever(this.f26465LJ, true);
        c4378a.LJIIJ.observeForever(this.LJFF, true);
        c4378a.LJIIIZ.observeForever(this.LJI, true);
        c4378a.LJIIIIZZ.observeForever(this.LJIIIIZZ, true);
        c4378a.LJII.observeForever(this.LJII, true);
    }

    public LiveBiddingInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(2067);
        View.inflate(context, 2131698585, this);
        setBackgroundResource(2130854235);
        MethodCollector.m14707o(2067);
    }
}
