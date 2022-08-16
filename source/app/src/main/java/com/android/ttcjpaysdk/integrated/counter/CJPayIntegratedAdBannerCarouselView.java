package com.android.ttcjpaysdk.integrated.counter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedList;
import java.util.List;
import p003X.AbstractC137400cge;
import p003X.AbstractC137401cgf;
import p003X.C116971W2r;
import p003X.C137399cgd;

/* loaded from: classes17.dex */
public class CJPayIntegratedAdBannerCarouselView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public ViewPager LIZIZ;
    public int LIZJ;
    public LinkedList<String> LIZLLL;

    /* renamed from: LJ */
    public int f25496LJ = 1;
    public Handler LJFF = new Handler();
    public boolean LJI = true;
    public LinearLayout LJII;
    public volatile boolean LJIIIIZZ;
    public AbstractC137400cge LJIIIZ;
    public AbstractC137401cgf LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public List<Integer> LJIILIIL;

    static {
        Covode.recordClassIndex(7490);
    }

    public final void LIZ(int i) {
        boolean z = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJFF.removeCallbacksAndMessages(null);
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131690740, (ViewGroup) this, true);
        this.LIZIZ = (ViewPager) LIZ2.findViewById(2131169626);
        this.LJII = (LinearLayout) LIZ2.findViewById(2131169625);
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ.setAdapter(new C137399cgd(this));
        if (this.LIZJ == 1) {
            this.LIZIZ.setCurrentItem(0);
        } else {
            this.LIZIZ.setCurrentItem(1);
        }
        LIZ(1);
        this.LIZIZ.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.android.ttcjpaysdk.integrated.counter.CJPayIntegratedAdBannerCarouselView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7491);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i) {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported && i == 0) {
                    CJPayIntegratedAdBannerCarouselView.this.LIZIZ.setCurrentItem(CJPayIntegratedAdBannerCarouselView.this.f25496LJ, false);
                    if (CJPayIntegratedAdBannerCarouselView.this.LIZJ > 1 && CJPayIntegratedAdBannerCarouselView.this.LJI) {
                        final CJPayIntegratedAdBannerCarouselView cJPayIntegratedAdBannerCarouselView = CJPayIntegratedAdBannerCarouselView.this;
                        if (!PatchProxy.proxy(new Object[0], cJPayIntegratedAdBannerCarouselView, CJPayIntegratedAdBannerCarouselView.LIZ, false, 9).isSupported) {
                            cJPayIntegratedAdBannerCarouselView.LIZ();
                            cJPayIntegratedAdBannerCarouselView.LJFF.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.integrated.counter.CJPayIntegratedAdBannerCarouselView.2
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(7492);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && CJPayIntegratedAdBannerCarouselView.this.getContext() != null && !((Activity) CJPayIntegratedAdBannerCarouselView.this.getContext()).isFinishing()) {
                                        CJPayIntegratedAdBannerCarouselView.this.f25496LJ++;
                                        CJPayIntegratedAdBannerCarouselView.this.LIZIZ.setCurrentItem(CJPayIntegratedAdBannerCarouselView.this.f25496LJ);
                                    }
                                }
                            }, cJPayIntegratedAdBannerCarouselView.getCurrentAutoPlayTime());
                        }
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                if (CJPayIntegratedAdBannerCarouselView.this.LIZJ == 1) {
                    CJPayIntegratedAdBannerCarouselView.this.f25496LJ = 1;
                } else if (CJPayIntegratedAdBannerCarouselView.this.LIZJ >= 2) {
                    if (i == CJPayIntegratedAdBannerCarouselView.this.LIZLLL.size() - 1) {
                        CJPayIntegratedAdBannerCarouselView.this.f25496LJ = 1;
                    } else if (i == 0) {
                        CJPayIntegratedAdBannerCarouselView cJPayIntegratedAdBannerCarouselView = CJPayIntegratedAdBannerCarouselView.this;
                        cJPayIntegratedAdBannerCarouselView.f25496LJ = cJPayIntegratedAdBannerCarouselView.LIZJ;
                    } else {
                        CJPayIntegratedAdBannerCarouselView.this.f25496LJ = i;
                    }
                    CJPayIntegratedAdBannerCarouselView cJPayIntegratedAdBannerCarouselView2 = CJPayIntegratedAdBannerCarouselView.this;
                    cJPayIntegratedAdBannerCarouselView2.LIZIZ(cJPayIntegratedAdBannerCarouselView2.f25496LJ - 1);
                }
                CJPayIntegratedAdBannerCarouselView.this.LIZ(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported && f != 0.0f && i2 != 0) {
                    CJPayIntegratedAdBannerCarouselView.this.LIZ();
                }
            }
        });
    }

    public int getCurrentAutoPlayTime() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        List<Integer> list = this.LJIILIIL;
        if (list == null) {
            return Constants.ASSEMBLE_PUSH_RETRY_INTERVAL;
        }
        int i = this.f25496LJ;
        if (i - 1 < 0 || i - 1 >= list.size()) {
            return Constants.ASSEMBLE_PUSH_RETRY_INTERVAL;
        }
        return this.LJIILIIL.get(this.f25496LJ - 1).intValue();
    }

    private void LIZLLL() {
        MethodCollector.m14708i(471);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(471);
            return;
        }
        int i = this.LIZJ;
        if (i <= 1) {
            MethodCollector.m14707o(471);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(getContext());
            if (i2 == 0) {
                imageView.setImageResource(2130840329);
            } else {
                imageView.setImageResource(2130840328);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(CJPayBasicUtils.dipToPX(getContext(), 5.0f), 0, CJPayBasicUtils.dipToPX(getContext(), 5.0f), 0);
            this.LJII.addView(imageView, layoutParams);
        }
        MethodCollector.m14707o(471);
    }

    public void setAutoPlay(boolean z) {
        this.LJI = z;
    }

    public void setAutoPlayTimes(List<Integer> list) {
        this.LJIILIIL = list;
    }

    public void setOnItemClickListener(AbstractC137400cge abstractC137400cge) {
        this.LJIIIZ = abstractC137400cge;
    }

    public void setOnItemShowListener(AbstractC137401cgf abstractC137401cgf) {
        this.LJIIJ = abstractC137401cgf;
    }

    public CJPayIntegratedAdBannerCarouselView(Context context) {
        super(context);
        MethodCollector.m14708i(467);
        LIZIZ();
        MethodCollector.m14707o(467);
    }

    public final void LIZIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported && i >= 0 && i < this.LIZJ) {
            int childCount = this.LJII.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ImageView imageView = (ImageView) this.LJII.getChildAt(i2);
                if (i == i2) {
                    imageView.setImageResource(2130840329);
                } else {
                    imageView.setImageResource(2130840328);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJI) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && (Math.abs(motionEvent.getRawX() - this.LJIIJJI) > 100.0f || Math.abs(motionEvent.getRawY() - this.LJIIL) > 100.0f)) {
                        this.LJIIIIZZ = true;
                    }
                } else {
                    this.LJIIJJI = 0.0f;
                    this.LJIIL = 0.0f;
                    boolean z = this.LJIIIIZZ;
                    this.LJIIIIZZ = false;
                }
            } else {
                this.LJIIJJI = motionEvent.getRawX();
                this.LJIIL = motionEvent.getRawY();
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setNetImage(List<String> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported && list != null && list.size() != 0) {
            this.LIZJ = list.size();
            this.LIZLLL = new LinkedList<>();
            int i = this.LIZJ;
            if (i == 1) {
                this.LIZLLL.addAll(list);
                LIZJ();
            } else if (i >= 2) {
                this.LIZLLL.addAll(list);
                this.LIZLLL.addFirst(list.get(list.size() - 1));
                this.LIZLLL.addLast(list.get(0));
                LIZLLL();
                LIZJ();
            }
        }
    }

    public CJPayIntegratedAdBannerCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(468);
        LIZIZ();
        MethodCollector.m14707o(468);
    }

    public CJPayIntegratedAdBannerCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(469);
        LIZIZ();
        MethodCollector.m14707o(469);
    }

    public CJPayIntegratedAdBannerCarouselView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        MethodCollector.m14708i(470);
        LIZIZ();
        MethodCollector.m14707o(470);
    }
}
