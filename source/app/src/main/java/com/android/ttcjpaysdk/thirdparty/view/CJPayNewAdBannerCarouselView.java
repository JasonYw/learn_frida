package com.android.ttcjpaysdk.thirdparty.view;

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
import p003X.AbstractC136347cPe;
import p003X.AbstractC136348cPf;
import p003X.C116971W2r;
import p003X.C136352cPj;

/* loaded from: classes17.dex */
public class CJPayNewAdBannerCarouselView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public ViewPager LIZIZ;
    public int LIZJ;
    public LinkedList<String> LIZLLL;
    public LinearLayout LJI;
    public volatile boolean LJII;
    public AbstractC136347cPe LJIIIIZZ;
    public AbstractC136348cPf LJIIIZ;
    public float LJIIJJI;
    public float LJIIL;
    public List<Integer> LJIILIIL;

    /* renamed from: LJ */
    public int f25544LJ = 1;
    public Handler LJIIJ = new Handler();
    public boolean LJFF = true;

    static {
        Covode.recordClassIndex(9212);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJFF = false;
        LIZLLL();
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIIJ.removeCallbacksAndMessages(null);
    }

    /* renamed from: LJ */
    private void m16026LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131690714, (ViewGroup) this, true);
        this.LIZIZ = (ViewPager) LIZ2.findViewById(2131169626);
        this.LJI = (LinearLayout) LIZ2.findViewById(2131169625);
    }

    private void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ.setAdapter(new C136352cPj(this));
        if (this.LIZJ == 1) {
            this.LIZIZ.setCurrentItem(0);
        } else {
            this.LIZIZ.setCurrentItem(1);
        }
        LIZ(1);
        this.LIZIZ.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayNewAdBannerCarouselView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9213);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i) {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported && i == 0) {
                    CJPayNewAdBannerCarouselView.this.LIZIZ.setCurrentItem(CJPayNewAdBannerCarouselView.this.f25544LJ, false);
                    if (CJPayNewAdBannerCarouselView.this.LIZJ > 1 && CJPayNewAdBannerCarouselView.this.LJFF) {
                        CJPayNewAdBannerCarouselView.this.LIZJ();
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                if (CJPayNewAdBannerCarouselView.this.LIZJ == 1) {
                    CJPayNewAdBannerCarouselView.this.f25544LJ = 1;
                } else if (CJPayNewAdBannerCarouselView.this.LIZJ >= 2) {
                    if (i == CJPayNewAdBannerCarouselView.this.LIZLLL.size() - 1) {
                        CJPayNewAdBannerCarouselView.this.f25544LJ = 1;
                    } else if (i == 0) {
                        CJPayNewAdBannerCarouselView cJPayNewAdBannerCarouselView = CJPayNewAdBannerCarouselView.this;
                        cJPayNewAdBannerCarouselView.f25544LJ = cJPayNewAdBannerCarouselView.LIZJ;
                    } else {
                        CJPayNewAdBannerCarouselView.this.f25544LJ = i;
                    }
                    CJPayNewAdBannerCarouselView cJPayNewAdBannerCarouselView2 = CJPayNewAdBannerCarouselView.this;
                    cJPayNewAdBannerCarouselView2.LIZIZ(cJPayNewAdBannerCarouselView2.f25544LJ - 1);
                }
                CJPayNewAdBannerCarouselView.this.LIZ(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported && f != 0.0f && i2 != 0) {
                    CJPayNewAdBannerCarouselView.this.LIZLLL();
                }
            }
        });
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZIZ();
        this.LJFF = true;
        if (this.LIZJ > 1 && this.LJFF) {
            LIZJ();
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        LIZLLL();
        this.LJIIJ.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayNewAdBannerCarouselView.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9214);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && CJPayNewAdBannerCarouselView.this.getContext() != null && !((Activity) CJPayNewAdBannerCarouselView.this.getContext()).isFinishing()) {
                    CJPayNewAdBannerCarouselView.this.f25544LJ++;
                    CJPayNewAdBannerCarouselView.this.LIZIZ.setCurrentItem(CJPayNewAdBannerCarouselView.this.f25544LJ);
                }
            }
        }, getCurrentAutoPlayTime());
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
        int i = this.f25544LJ;
        if (i - 1 < 0 || i - 1 >= list.size()) {
            return Constants.ASSEMBLE_PUSH_RETRY_INTERVAL;
        }
        return this.LJIILIIL.get(this.f25544LJ - 1).intValue();
    }

    private void LJI() {
        MethodCollector.m14708i(564);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(564);
            return;
        }
        int i = this.LIZJ;
        if (i <= 1) {
            MethodCollector.m14707o(564);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(getContext());
            if (i2 == 0) {
                imageView.setImageResource(2130840207);
            } else {
                imageView.setImageResource(2130840206);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(CJPayBasicUtils.dipToPX(getContext(), 5.0f), 0, CJPayBasicUtils.dipToPX(getContext(), 5.0f), 0);
            this.LJI.addView(imageView, layoutParams);
        }
        MethodCollector.m14707o(564);
    }

    public void setAutoPlay(boolean z) {
        this.LJFF = z;
    }

    public void setAutoPlayTimes(List<Integer> list) {
        this.LJIILIIL = list;
    }

    public void setOnItemClickListener(AbstractC136347cPe abstractC136347cPe) {
        this.LJIIIIZZ = abstractC136347cPe;
    }

    public void setOnItemShowListener(AbstractC136348cPf abstractC136348cPf) {
        this.LJIIIZ = abstractC136348cPf;
    }

    public CJPayNewAdBannerCarouselView(Context context) {
        super(context);
        MethodCollector.m14708i(560);
        m16026LJ();
        MethodCollector.m14707o(560);
    }

    public final void LIZ(int i) {
        AbstractC136348cPf abstractC136348cPf;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported && (abstractC136348cPf = this.LJIIIZ) != null) {
            abstractC136348cPf.LIZ(i);
        }
    }

    public final void LIZIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported && i >= 0 && i < this.LIZJ) {
            int childCount = this.LJI.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ImageView imageView = (ImageView) this.LJI.getChildAt(i2);
                if (i == i2) {
                    imageView.setImageResource(2130840207);
                } else {
                    imageView.setImageResource(2130840206);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC136347cPe abstractC136347cPe;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJFF) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && (Math.abs(motionEvent.getRawX() - this.LJIIJJI) > 100.0f || Math.abs(motionEvent.getRawY() - this.LJIIL) > 100.0f)) {
                        this.LJII = true;
                    }
                } else {
                    this.LJIIJJI = 0.0f;
                    this.LJIIL = 0.0f;
                    if (!this.LJII && (abstractC136347cPe = this.LJIIIIZZ) != null) {
                        abstractC136347cPe.LIZ(this.f25544LJ);
                    }
                    this.LJII = false;
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
                LJFF();
            } else if (i >= 2) {
                this.LIZLLL.addAll(list);
                this.LIZLLL.addFirst(list.get(list.size() - 1));
                this.LIZLLL.addLast(list.get(0));
                LJI();
                LJFF();
            }
        }
    }

    public CJPayNewAdBannerCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(561);
        m16026LJ();
        MethodCollector.m14707o(561);
    }

    public CJPayNewAdBannerCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(562);
        m16026LJ();
        MethodCollector.m14707o(562);
    }

    public CJPayNewAdBannerCarouselView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        MethodCollector.m14708i(563);
        m16026LJ();
        MethodCollector.m14707o(563);
    }
}
