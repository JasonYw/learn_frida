package com.bytedance.android.live.broadcast.gallery.transfer;

import android.content.Context;
import android.graphics.Color;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcast.gallery.view.indicator.NumberIndicator;
import com.bytedance.android.live.broadcast.gallery.view.indicator.TitleIndicator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashSet;
import java.util.Set;
import p003X.AbstractC149403fol;
import p003X.AbstractC149413fox;
import p003X.AbstractC149419fp3;
import p003X.AbstractC149420fp4;
import p003X.AbstractC149421fp5;
import p003X.AbstractC149462fpk;
import p003X.C116971W2r;
import p003X.C149387foV;
import p003X.C149402fok;
import p003X.C149404fom;
import p003X.C149405fon;
import p003X.C149409fot;
import p003X.C149411fov;
import p003X.C149412fow;
import p003X.C149443fpR;
import p003X.Cfor;

/* renamed from: com.bytedance.android.live.broadcast.gallery.transfer.e */
/* loaded from: classes20.dex */
public final class C3023e extends FrameLayout implements AbstractC149421fp5 {
    public static ChangeQuickRedirect LIZ;
    public C149443fpR LIZIZ;
    public BounceBackViewPager LIZJ;
    public AbstractC149413fox LIZLLL;

    /* renamed from: LJ */
    public C149405fon f25834LJ;
    public float LJI;
    public boolean LJII;
    public C149387foV LJIIIIZZ;
    public AbstractC149420fp4 LJIILIIL;
    public Context LJIILL;
    public int LJFF = 1;
    public boolean LJIIIZ = true;
    public ViewPager.OnPageChangeListener LJIIJ = new C149409fot(this);
    public AbstractC149419fp3 LJIIJJI = new C149411fov(this);
    public AbstractC149462fpk LJIIL = new Cfor(this);
    public Set<Integer> LJIILJJIL = new HashSet();

    static {
        Covode.recordClassIndex(15936);
    }

    public final Context getActivityContext() {
        return this.LJIILL;
    }

    public final AbstractC149413fox getTransAdapter() {
        return this.LIZLLL;
    }

    public final C149405fon getTransConfig() {
        return this.f25834LJ;
    }

    public final AbstractC149462fpk getTransListener() {
        return this.LJIIL;
    }

    @Override // p003X.AbstractC149421fp5
    public final C149405fon getTransferConfig() {
        return this.f25834LJ;
    }

    public final ViewPager getViewPager() {
        return this.LIZJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    public final int getCurrentPosition() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZJ.getCurrentItem() % this.f25834LJ.LJIJI;
    }

    public final void LIZ() {
        C149412fow c149412fow;
        ViewGroup viewGroup;
        MethodCollector.m14708i(1258);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1258);
            return;
        }
        this.LJII = false;
        this.LJIILJJIL.clear();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && (c149412fow = this.f25834LJ.LJIIL) != null && !PatchProxy.proxy(new Object[0], c149412fow, C149412fow.LIZ, false, 5).isSupported && c149412fow.LIZIZ != null && (viewGroup = (ViewGroup) c149412fow.LIZIZ.getParent()) != null) {
            viewGroup.removeView(c149412fow.LIZIZ);
        }
        removeAllViews();
        this.LJIILIIL.LIZ();
        MethodCollector.m14707o(1258);
    }

    public final void LIZIZ() {
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            this.LIZLLL = new C149402fok(this, this.f25834LJ.LJIIIIZZ.size(), this.f25834LJ.LIZIZ);
            this.LIZLLL.LIZLLL = this.LJIIJJI;
            this.LIZJ = new BounceBackViewPager(this.LJIILL, null);
            this.LIZJ.setOverScrollMode(2);
            setBackgroundColor(LIZ(255.0f));
            this.LIZJ.setVisibility(4);
            this.LIZJ.setOffscreenPageLimit(this.LJFF + 1);
            this.LIZJ.setAdapter(this.LIZLLL);
            this.LIZJ.setCurrentItem(this.f25834LJ.LIZIZ);
            addView(this.LIZJ, new FrameLayout.LayoutParams(-1, -1));
        }
        int i2 = this.f25834LJ.LIZIZ;
        if (i2 >= 0) {
            i = i2;
        }
        this.LIZIZ = LIZ(i).LIZ(i);
    }

    public final void LIZJ() {
        MethodCollector.m14708i(1260);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            MethodCollector.m14707o(1260);
            return;
        }
        C149412fow c149412fow = this.f25834LJ.LJIIL;
        if (c149412fow != null && (this.f25834LJ.LJIJI > 0 || this.f25834LJ.LJIILJJIL)) {
            if (!PatchProxy.proxy(new Object[]{this, this}, c149412fow, C149412fow.LIZ, false, 1).isSupported) {
                c149412fow.f20034LJ = this;
                c149412fow.LIZIZ = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131699283, (ViewGroup) this, false);
                c149412fow.LIZJ = (NumberIndicator) c149412fow.LIZIZ.findViewById(2131186131);
                c149412fow.LIZLLL = (TitleIndicator) c149412fow.LIZIZ.findViewById(2131186172);
                c149412fow.LIZLLL.setMovementMethod(ScrollingMovementMethod.getInstance());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                addView(c149412fow.LIZIZ, layoutParams);
            }
            BounceBackViewPager bounceBackViewPager = this.LIZJ;
            if (!PatchProxy.proxy(new Object[]{bounceBackViewPager}, c149412fow, C149412fow.LIZ, false, 2).isSupported) {
                c149412fow.LIZIZ.setVisibility(0);
                int i = c149412fow.f20034LJ.getTransferConfig().LJIJI;
                c149412fow.LIZJ.setRealSize(i);
                c149412fow.LIZJ.setViewPager(bounceBackViewPager);
                if (i <= 1) {
                    c149412fow.LIZJ.setVisibility(8);
                } else {
                    c149412fow.LIZJ.setVisibility(0);
                }
                if (c149412fow.LIZLLL != null) {
                    TitleIndicator titleIndicator = c149412fow.LIZLLL;
                    AbstractC149421fp5 abstractC149421fp5 = c149412fow.f20034LJ;
                    if (!PatchProxy.proxy(new Object[]{bounceBackViewPager, abstractC149421fp5}, titleIndicator, TitleIndicator.LIZ, false, 1).isSupported) {
                        titleIndicator.setTextSize(17.0f);
                        titleIndicator.LIZIZ = abstractC149421fp5;
                        if (bounceBackViewPager != null && bounceBackViewPager.getAdapter() != null && titleIndicator.LIZIZ != null) {
                            titleIndicator.setVisibility(0);
                            bounceBackViewPager.removeOnPageChangeListener(titleIndicator.LIZJ);
                            bounceBackViewPager.addOnPageChangeListener(titleIndicator.LIZJ);
                            titleIndicator.LIZJ.onPageSelected(bounceBackViewPager.getCurrentItem());
                        }
                    }
                }
            }
        }
        MethodCollector.m14707o(1260);
    }

    public final void setOnLayoutResetListener(AbstractC149420fp4 abstractC149420fp4) {
        this.LJIILIIL = abstractC149420fp4;
    }

    public C3023e(Context context) {
        super(context);
        MethodCollector.m14708i(1257);
        this.LJIILL = context;
        MethodCollector.m14707o(1257);
    }

    private void LIZJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        int size = i % this.f25834LJ.LJIIIIZZ.size();
        LIZ(size).LIZIZ(size);
    }

    public final int LIZ(float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int i = this.f25834LJ.LIZLLL;
        return Color.argb(Math.round(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C149387foV c149387foV = this.LJIIIIZZ;
        if (c149387foV != null && this.LJIIIZ) {
            c149387foV.LIZ(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final AbstractC149403fol LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (AbstractC149403fol) proxy.result;
        }
        return new C149404fom(this);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C149443fpR c149443fpR;
        C149387foV c149387foV;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent.getPointerCount() == 1 && (c149443fpR = this.LIZIZ) != null && !c149443fpR.LJIIL && !c149443fpR.LJIILIIL && this.LJIIIZ && (c149387foV = this.LJIIIIZZ) != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{motionEvent}, c149387foV, C149387foV.LIZ, false, 1);
            if (proxy2.isSupported) {
                if (((Boolean) proxy2.result).booleanValue()) {
                    return true;
                }
            } else if (motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2 && motionEvent.getRawY() - c149387foV.LIZLLL > c149387foV.f20024LJ) {
                            return true;
                        }
                    } else {
                        c149387foV.LIZLLL = 0.0f;
                    }
                } else {
                    c149387foV.LIZJ = motionEvent.getRawX();
                    c149387foV.LIZLLL = motionEvent.getRawY();
                    if (c149387foV.LIZIZ == null) {
                        c149387foV.LIZIZ = VelocityTracker.obtain();
                    } else {
                        c149387foV.LIZIZ.clear();
                    }
                    c149387foV.LIZIZ.addMovement(motionEvent);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean LIZIZ(int i) {
        C149443fpR c149443fpR;
        C149412fow c149412fow;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJII || ((c149443fpR = this.LIZIZ) != null && c149443fpR.getState() == 2)) {
            return false;
        }
        if (this.f25834LJ.LJIILL != null) {
            this.f25834LJ.LJIILL.LIZ(i);
        }
        if (this.f25834LJ.LJI > 0 && i >= this.f25834LJ.LJI) {
            this.LIZIZ = null;
        } else {
            this.LIZIZ = LIZ(i).LIZJ(i);
        }
        if (this.LIZIZ == null) {
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 14).isSupported) {
                LIZ();
            }
        } else {
            this.LIZJ.setVisibility(4);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && (c149412fow = this.f25834LJ.LJIIL) != null && ((this.f25834LJ.LJIJI >= 2 || this.f25834LJ.LJIILJJIL) && !PatchProxy.proxy(new Object[0], c149412fow, C149412fow.LIZ, false, 3).isSupported && c149412fow.LIZIZ != null)) {
            c149412fow.LIZIZ.setVisibility(8);
        }
        return true;
    }

    public final void LIZ(View view) {
        MethodCollector.m14708i(1259);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(1259);
        } else if (view == null) {
            MethodCollector.m14707o(1259);
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            MethodCollector.m14707o(1259);
        }
    }

    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        int i3 = i - i2;
        int i4 = i2 + i;
        LIZJ(i);
        this.LJIILJJIL.add(Integer.valueOf(i));
        if (i3 >= 0 && !this.LJIILJJIL.contains(Integer.valueOf(i3))) {
            LIZJ(i3);
            this.LJIILJJIL.add(Integer.valueOf(i3));
        }
        if (i4 < this.f25834LJ.LJIIIIZZ.size() && !this.LJIILJJIL.contains(Integer.valueOf(i4))) {
            LIZJ(i4);
            this.LJIILJJIL.add(Integer.valueOf(i4));
        }
    }
}
