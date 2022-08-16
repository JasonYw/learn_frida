package com.bytedance.android.live.broadcast.download;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcast.api.gamepromote.C2888a;
import com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C89121L9n;
import p003X.C89246LEi;
import p003X.C89247LEj;
import p003X.C89248LEk;
import p003X.C89249LEl;
import p003X.C89258LEu;
import p003X.C89259LEv;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class PromoteCardDownloadView extends DownloadView implements AbstractC4569445g {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25816LJ;
    public final TextView LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final TextView LJIIJ;
    public Disposable LJIIJJI;
    public boolean LJIIL;
    public final View LJIILIIL;
    public final View LJIILJJIL;
    public final View LJIILL;
    public final View LJIILLIIL;
    public ObjectAnimator LJIIZILJ;
    public ObjectAnimator LJIJ;
    public ObjectAnimator LJIJI;
    public ObjectAnimator LJIJJ;
    public ObjectAnimator LJIJJLI;
    public ObjectAnimator LJIL;
    public ObjectAnimator LJJ;
    public AnimatorSet LJJI;
    public ObjectAnimator LJJIFFI;
    public ObjectAnimator LJJII;
    public ObjectAnimator LJJIII;
    public ObjectAnimator LJJIIJ;
    public ObjectAnimator LJJIIJZLJL;
    public ObjectAnimator LJJIIZ;
    public ObjectAnimator LJJIIZI;
    public boolean LJJIJ;

    static {
        Covode.recordClassIndex(15528);
    }

    public PromoteCardDownloadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PromoteCardDownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZJ(int i) {
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView
    public final int getLayoutId() {
        return 2131700131;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f25816LJ, false, 20).isSupported && event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 6).isSupported) {
            return;
        }
        super.LIZIZ();
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 7).isSupported) {
            return;
        }
        super.LIZJ();
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 8).isSupported) {
            return;
        }
        super.LIZLLL();
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    /* renamed from: LJ */
    public final void mo15904LJ() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 9).isSupported) {
            return;
        }
        super.mo15904LJ();
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 17).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        LJII();
    }

    private final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 10).isSupported) {
            return;
        }
        LK1.LIZ(this.LJIILJJIL);
        LK1.LIZ(this.LJIIJ);
        LK1.LIZ(this.LJIIIIZZ);
        LK1.LIZ(this.LJIIIZ);
    }

    private final void LJIIJ() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 13).isSupported) {
            return;
        }
        Disposable disposable2 = this.LJIIJJI;
        if ((disposable2 == null || !disposable2.isDisposed()) && (disposable = this.LJIIJJI) != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 2).isSupported) {
            return;
        }
        setText(LK5.LIZ(getReadyText()));
        AbstractC2889a mListener = getMListener();
        if (mListener != null) {
            mListener.LIZ();
        }
        this.LJJIJ = true;
        LK1.LIZJ(this.LJIILIIL);
        TextView downloadTv = getDownloadTv();
        if (downloadTv != null) {
            downloadTv.setBackgroundResource(getReadyBg());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        TextView downloadTv;
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 1).isSupported) {
            return;
        }
        C2888a dataContext = getDataContext();
        Boolean bool = null;
        String str = null;
        if (dataContext != null) {
            C3002c mDownloadInfo = getMDownloadInfo();
            if (mDownloadInfo != null) {
                str = mDownloadInfo.LJIIJ;
            }
            bool = dataContext.LIZ(str);
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && (downloadTv = getDownloadTv()) != null) {
            downloadTv.setText(LK5.LIZ(2131587253));
        }
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 12).isSupported) {
            return;
        }
        LJIIJ();
        ObjectAnimator objectAnimator = this.LJIIZILJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LJIJ;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.LJIJI;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        ObjectAnimator objectAnimator4 = this.LJIJJ;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        ObjectAnimator objectAnimator5 = this.LJIJJLI;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        ObjectAnimator objectAnimator6 = this.LJIL;
        if (objectAnimator6 != null) {
            objectAnimator6.cancel();
        }
        ObjectAnimator objectAnimator7 = this.LJJ;
        if (objectAnimator7 != null) {
            objectAnimator7.cancel();
        }
        ObjectAnimator objectAnimator8 = this.LJJIFFI;
        if (objectAnimator8 != null) {
            objectAnimator8.cancel();
        }
        ObjectAnimator objectAnimator9 = this.LJJII;
        if (objectAnimator9 != null) {
            objectAnimator9.cancel();
        }
        ObjectAnimator objectAnimator10 = this.LJJIII;
        if (objectAnimator10 != null) {
            objectAnimator10.cancel();
        }
        ObjectAnimator objectAnimator11 = this.LJJIIJ;
        if (objectAnimator11 != null) {
            objectAnimator11.cancel();
        }
        ObjectAnimator objectAnimator12 = this.LJJIIJZLJL;
        if (objectAnimator12 != null) {
            objectAnimator12.cancel();
        }
        ObjectAnimator objectAnimator13 = this.LJJIIZ;
        if (objectAnimator13 != null) {
            objectAnimator13.cancel();
        }
        ObjectAnimator objectAnimator14 = this.LJJIIZI;
        if (objectAnimator14 != null) {
            objectAnimator14.cancel();
        }
        AnimatorSet animatorSet = this.LJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, f25816LJ, false, 16).isSupported) {
            return;
        }
        this.LJIILJJIL.setAlpha(1.0f);
        LK1.LIZJ(this.LJIILJJIL);
        this.LJFF.setAlpha(1.0f);
        LK1.LIZJ(this.LJFF);
        LK1.LIZ(this.LJIIIIZZ);
        this.LJIIIIZZ.setAlpha(1.0f);
        LK1.LIZ(this.LJIILL);
        LK1.LIZ(this.LJIIIZ);
        LK1.LIZ(this.LJIIJ);
        LK1.LIZ(this.LJII);
        LK1.LIZ(this.LJI);
        this.LJIILIIL.setAlpha(1.0f);
    }

    public final void setPlayNumShow(boolean z) {
        this.LJIIL = z;
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f25816LJ, false, 5).isSupported) {
            return;
        }
        super.LIZ(i);
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f25816LJ, false, 4).isSupported) {
            return;
        }
        super.LIZIZ(i);
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZ(C89121L9n c89121L9n) {
        if (PatchProxy.proxy(new Object[]{c89121L9n}, this, f25816LJ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c89121L9n);
        super.LIZ(c89121L9n);
        LJIIJ();
        if (this.LJJIJ) {
            ObjectAnimator objectAnimator = this.LJIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = this.LJIIZILJ;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimator3 = this.LJJIFFI;
            if (objectAnimator3 != null) {
                objectAnimator3.cancel();
            }
            AnimatorSet animatorSet = this.LJJI;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LJII.setBackgroundResource(2130855107);
            ObjectAnimator objectAnimator4 = this.LJJIIZI;
            if (objectAnimator4 != null) {
                objectAnimator4.start();
            }
            LK1.LIZ(this.LJIILL);
            ProgressBar downloadPb = getDownloadPb();
            if (downloadPb != null) {
                LK1.LIZ(downloadPb);
            }
            ObjectAnimator objectAnimator5 = this.LJJII;
            if (objectAnimator5 != null) {
                objectAnimator5.setStartDelay(200L);
            }
            ObjectAnimator objectAnimator6 = this.LJJII;
            if (objectAnimator6 != null) {
                objectAnimator6.start();
            }
            ObjectAnimator objectAnimator7 = this.LJIJJLI;
            if (objectAnimator7 != null) {
                objectAnimator7.start();
            }
            ObjectAnimator objectAnimator8 = this.LJIJ;
            if (objectAnimator8 != null) {
                objectAnimator8.start();
            }
            ObjectAnimator objectAnimator9 = this.LJJIIJ;
            if (objectAnimator9 != null) {
                objectAnimator9.start();
            }
            ObjectAnimator objectAnimator10 = this.LJJIIJZLJL;
            if (objectAnimator10 != null) {
                objectAnimator10.start();
            }
            ObjectAnimator objectAnimator11 = this.LJJIIZ;
            if (objectAnimator11 != null) {
                objectAnimator11.start();
            }
            this.LJJIJ = false;
            return;
        }
        this.LJJIJ = false;
        LJIIIZ();
    }

    public final void LIZ(boolean z) {
        Integer downloadStatus;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f25816LJ, false, 14).isSupported || (downloadStatus = getDownloadStatus()) == null || downloadStatus.intValue() != 0) {
            return;
        }
        if (z) {
            LJIIIIZZ();
            LK1.LIZJ(this.LJIIIIZZ);
            ObjectAnimator objectAnimator = this.LJIL;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            ObjectAnimator objectAnimator2 = this.LJIJI;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
            ObjectAnimator objectAnimator3 = this.LJJIFFI;
            if (objectAnimator3 != null) {
                objectAnimator3.setStartDelay(550L);
            }
            ObjectAnimator objectAnimator4 = this.LJJIFFI;
            if (objectAnimator4 != null) {
                objectAnimator4.start();
            }
            ObjectAnimator objectAnimator5 = this.LJIIZILJ;
            if (objectAnimator5 != null) {
                objectAnimator5.setStartDelay(550L);
            }
            ObjectAnimator objectAnimator6 = this.LJIIZILJ;
            if (objectAnimator6 != null) {
                objectAnimator6.start();
            }
            AnimatorSet animatorSet = this.LJJI;
            if (animatorSet != null) {
                animatorSet.setStartDelay(550L);
            }
            AnimatorSet animatorSet2 = this.LJJI;
            if (animatorSet2 != null) {
                animatorSet2.start();
                return;
            }
            return;
        }
        LK1.LIZJ(this.LJIILL);
        ObjectAnimator objectAnimator7 = this.LJJ;
        if (objectAnimator7 != null) {
            objectAnimator7.start();
        }
        ObjectAnimator objectAnimator8 = this.LJIJJ;
        if (objectAnimator8 != null) {
            objectAnimator8.start();
        }
        ObjectAnimator objectAnimator9 = this.LJJIII;
        if (objectAnimator9 != null) {
            objectAnimator9.setStartDelay(300L);
        }
        ObjectAnimator objectAnimator10 = this.LJJIII;
        if (objectAnimator10 != null) {
            objectAnimator10.start();
        }
        LK1.LIZ(this.LJIIIIZZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoteCardDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        ProgressBar downloadPb = getDownloadPb();
        if (downloadPb != null) {
            downloadPb.setProgressDrawable(LK5.LIZJ(2130857757));
        }
        setReadyText(2131582103);
        setInstalledText(2131582107);
        View findViewById = findViewById(2131172867);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJIILIIL = findViewById;
        View findViewById2 = findViewById(2131193967);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJIILJJIL = findViewById2;
        View findViewById3 = findViewById(2131193966);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJFF = (TextView) findViewById3;
        Intrinsics.checkNotNullExpressionValue(findViewById(2131196375), "");
        View findViewById4 = findViewById(2131170277);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJIIIIZZ = findViewById4;
        View findViewById5 = findViewById(2131170278);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJIILL = findViewById5;
        View findViewById6 = findViewById(2131193969);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = findViewById6;
        View findViewById7 = findViewById(2131193968);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJII = findViewById7;
        View findViewById8 = findViewById(2131196395);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIILLIIL = findViewById8;
        View findViewById9 = findViewById(2131194887);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIJ = (TextView) findViewById9;
        View findViewById10 = findViewById(2131172868);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIIZ = findViewById10;
        if (!PatchProxy.proxy(new Object[0], this, f25816LJ, false, 15).isSupported) {
            this.LJJIIZI = ObjectAnimator.ofFloat(this.LJI, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimator = this.LJJIIZI;
            if (objectAnimator != null) {
                objectAnimator.setDuration(250L);
            }
            this.LJJ = ObjectAnimator.ofFloat(this.LJIILL, "translationX", LK5.LIZJ(76.0f), -LK5.LIZJ(28.0f));
            ObjectAnimator objectAnimator2 = this.LJJ;
            if (objectAnimator2 != null) {
                objectAnimator2.setDuration(821L);
            }
            this.LJIJI = ObjectAnimator.ofFloat(this.LJIILLIIL, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimator3 = this.LJIJI;
            if (objectAnimator3 != null) {
                objectAnimator3.setDuration(125L);
            }
            this.LJIJJ = ObjectAnimator.ofFloat(this.LJIILIIL, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimator4 = this.LJIJJ;
            if (objectAnimator4 != null) {
                objectAnimator4.setDuration(125L);
            }
            this.LJIL = ObjectAnimator.ofFloat(this.LJIIIIZZ, "translationX", -LK5.LIZJ(104.0f), 0.0f);
            ObjectAnimator objectAnimator5 = this.LJIL;
            if (objectAnimator5 != null) {
                objectAnimator5.setDuration(821L);
            }
            ObjectAnimator objectAnimator6 = this.LJIL;
            if (objectAnimator6 != null) {
                objectAnimator6.addListener(new C89247LEj(this));
            }
            this.LJIJJLI = ObjectAnimator.ofFloat(this.LJIIIIZZ, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimator7 = this.LJIJJLI;
            if (objectAnimator7 != null) {
                objectAnimator7.setDuration(250L);
            }
            ObjectAnimator objectAnimator8 = this.LJIJJLI;
            if (objectAnimator8 != null) {
                objectAnimator8.addListener(new C89258LEu(this));
            }
            this.LJJIFFI = ObjectAnimator.ofFloat(this.LJIIIZ, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimator9 = this.LJJIFFI;
            if (objectAnimator9 != null) {
                objectAnimator9.setDuration(250L);
            }
            ObjectAnimator objectAnimator10 = this.LJJIFFI;
            if (objectAnimator10 != null) {
                objectAnimator10.addListener(new C89259LEv(this));
            }
            this.LJIJ = ObjectAnimator.ofFloat(this.LJIIJ, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimator11 = this.LJIJ;
            if (objectAnimator11 != null) {
                objectAnimator11.setDuration(250L);
            }
            this.LJIIZILJ = ObjectAnimator.ofFloat(this.LJIIJ, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimator12 = this.LJIIZILJ;
            if (objectAnimator12 != null) {
                objectAnimator12.setDuration(250L);
            }
            ObjectAnimator objectAnimator13 = this.LJIIZILJ;
            if (objectAnimator13 != null) {
                objectAnimator13.addListener(new C89248LEk(this));
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", 0.0f, -LK5.LIZJ(2.0f));
            ofFloat.setDuration(150L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", -LK5.LIZJ(2.0f), 0.0f);
            ofFloat2.setDuration(150L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", 0.0f, LK5.LIZJ(2.0f));
            ofFloat3.setDuration(150L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", LK5.LIZJ(2.0f), 0.0f);
            ofFloat4.setDuration(150L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", 0.0f, -LK5.LIZJ(2.0f));
            ofFloat5.setDuration(150L);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", -LK5.LIZJ(2.0f), 0.0f);
            ofFloat6.setDuration(150L);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", 0.0f, LK5.LIZJ(2.0f));
            ofFloat7.setDuration(150L);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", LK5.LIZJ(2.0f), 0.0f);
            ofFloat8.setDuration(150L);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", 0.0f, -LK5.LIZJ(2.0f));
            ofFloat9.setDuration(150L);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.LJIILIIL, "translationY", -LK5.LIZJ(2.0f), 0.0f);
            ofFloat10.setDuration(150L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10);
            this.LJJI = animatorSet;
            this.LJJIII = ObjectAnimator.ofFloat(this.LJI, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimator14 = this.LJJIII;
            if (objectAnimator14 != null) {
                objectAnimator14.setDuration(250L);
            }
            ObjectAnimator objectAnimator15 = this.LJJIII;
            if (objectAnimator15 != null) {
                objectAnimator15.addListener(new C89249LEl(this));
            }
            this.LJJII = ObjectAnimator.ofFloat(getDownloadPb(), "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimator16 = this.LJJII;
            if (objectAnimator16 != null) {
                objectAnimator16.setDuration(250L);
            }
            ObjectAnimator objectAnimator17 = this.LJJII;
            if (objectAnimator17 != null) {
                objectAnimator17.addListener(new C89246LEi(this));
            }
            this.LJJIIJ = ObjectAnimator.ofFloat(this.LJIIIZ, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimator18 = this.LJJIIJ;
            if (objectAnimator18 != null) {
                objectAnimator18.setDuration(250L);
            }
            this.LJJIIJZLJL = ObjectAnimator.ofFloat(this.LJIILJJIL, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimator19 = this.LJJIIJZLJL;
            if (objectAnimator19 != null) {
                objectAnimator19.setDuration(250L);
            }
            this.LJJIIZ = ObjectAnimator.ofFloat(getDownloadTv(), "alpha", 1.0f, 0.0f, 1.0f);
            ObjectAnimator objectAnimator20 = this.LJJIIZ;
            if (objectAnimator20 != null) {
                objectAnimator20.setDuration(400L);
            }
        }
    }

    public /* synthetic */ PromoteCardDownloadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
