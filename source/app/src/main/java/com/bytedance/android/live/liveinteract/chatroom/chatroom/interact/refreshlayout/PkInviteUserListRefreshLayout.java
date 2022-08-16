package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC145638epy;
import p003X.animation.Animation$AnimationListenerC145637epx;

/* loaded from: classes19.dex */
public class PkInviteUserListRefreshLayout extends ViewGroup {
    public static ChangeQuickRedirect LIZ;
    public static final int[] LJIL = {16842766};
    public View LIZIZ;
    public int LIZJ;
    public AbstractC145638epy LIZLLL;

    /* renamed from: LJ */
    public int f26273LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public final DecelerateInterpolator LJIIIZ;
    public int LJIIJ;
    public STATUS LJIIJJI;
    public boolean LJIIL;
    public final Animation LJIILIIL;
    public final Animation.AnimationListener LJIILJJIL;
    public final Animation.AnimationListener LJIILL;
    public int LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;
    public View LJJ;
    public boolean LJJI;
    public RecyclerView LJJIFFI;
    public View LJJII;
    public final Animation LJJIII;
    public final Runnable LJJIIJ;
    public final Runnable LJJIIJZLJL;
    public final Runnable LJJIIZ;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* loaded from: classes19.dex */
    public enum STATUS {
        NORMAL,
        LOOSEN,
        REFRESHING;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static STATUS[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (STATUS[]) proxy.result;
            }
            return (STATUS[]) values().clone();
        }

        static {
            Covode.recordClassIndex(26001);
        }

        public static STATUS valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (STATUS) proxy.result;
            }
            return (STATUS) Enum.valueOf(STATUS.class, str);
        }
    }

    static {
        Covode.recordClassIndex(25992);
        SwipeRefreshLayout.class.getSimpleName();
    }

    private void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        removeCallbacks(this.LJJIIZ);
        postDelayed(this.LJJIIZ, 300L);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LJJIIJ.run();
    }

    private boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJJIFFI != null && !m15756LJ()) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        return ViewCompat.canScrollVertically(this.LIZIZ, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        removeCallbacks(this.LJJIIZ);
        removeCallbacks(this.LJJIIJ);
        removeCallbacks(this.LJJIIJZLJL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        removeCallbacks(this.LJJIIJ);
        removeCallbacks(this.LJJIIZ);
        removeCallbacks(this.LJJIIJZLJL);
    }

    /* renamed from: LJ */
    private boolean m15756LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        RecyclerView recyclerView = this.LJJIFFI;
        if (recyclerView == null || !(recyclerView.mo25799getLayoutManager() instanceof LinearLayoutManager)) {
            return true;
        }
        if (((LinearLayoutManager) this.LJJIFFI.mo25799getLayoutManager()).findFirstVisibleItemPosition() != 0 || this.LJJIFFI.getChildAt(0).getY() != 0.0f) {
            return false;
        }
        View view = this.LJJII;
        if (view != null && view.getY() < 0.0f) {
            return false;
        }
        return true;
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        if (this.LIZIZ == null) {
            if (getChildCount() > 2 && !isInEditMode()) {
                throw new IllegalStateException("SwipeRefreshLayout can only host two children");
            }
            this.LIZIZ = getChildAt(1);
            this.LIZIZ.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.8
                static {
                    Covode.recordClassIndex(26000);
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return PkInviteUserListRefreshLayout.this.LJIIL;
                }
            });
            this.LIZJ = this.LIZIZ.getTop() + getPaddingTop();
        }
        if (this.LJIIZILJ == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.LJIIZILJ = (int) Math.min(((View) getParent()).getHeight() * 0.6f, getResources().getDisplayMetrics().density * 120.0f);
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        removeCallbacks(this.LJJIIZ);
        this.LJJIIJZLJL.run();
        setRefreshing(true);
        this.LJIIL = true;
        AbstractC145638epy abstractC145638epy = this.LIZLLL;
        if (abstractC145638epy != null) {
            abstractC145638epy.LIZIZ();
        }
    }

    public void setFirstView(View view) {
        this.LJJII = view;
    }

    public void setOnRefreshListener(AbstractC145638epy abstractC145638epy) {
        this.LIZLLL = abstractC145638epy;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.LJJIFFI = recyclerView;
    }

    public void setmIsDisable(boolean z) {
        this.LJJI = z;
    }

    public PkInviteUserListRefreshLayout(Context context) {
        this(context, null);
    }

    public void setRefreshing(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported && this.LJFF != z) {
            LIZJ();
            this.LJFF = z;
        }
    }

    private void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        int top = this.LIZIZ.getTop();
        float f = i;
        float f2 = this.LJIIZILJ;
        if (f > f2) {
            i = ((int) f2) + (((int) (f - f2)) / 2);
        } else if (i < 0) {
            i = 0;
        }
        setTargetOffsetTopAndBottom(i - top);
    }

    public void setTargetOffsetTopAndBottom(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LIZIZ.offsetTopAndBottom(i);
        this.LJJ.offsetTopAndBottom(i);
        this.LJII = this.LIZIZ.getTop();
        invalidate();
    }

    private void LIZ(MotionEvent motionEvent) {
        int i = 1;
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 18).isSupported) {
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.LJIJJLI) {
            if (actionIndex != 0) {
                i = 0;
            }
            this.LJIJI = MotionEventCompat.getY(motionEvent, i);
            this.LJIJJLI = MotionEventCompat.getPointerId(motionEvent, i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJJI) {
            return false;
        }
        LIZJ();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.LJIIIIZZ && actionMasked == 0) {
            this.LJIIIIZZ = false;
        }
        if (isEnabled() && !this.LJIIIIZZ && !LIZLLL()) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                LIZ(motionEvent);
                            }
                        }
                    } else {
                        int i = this.LJIJJLI;
                        if (i == -1 || (findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i)) < 0) {
                            return false;
                        }
                        float y = MotionEventCompat.getY(motionEvent, findPointerIndex);
                        if (y - this.LJIJ > this.LJIILLIIL) {
                            this.LJIJI = y;
                            this.LJIJJ = true;
                        }
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                this.LJIJJ = false;
                this.LJIJJLI = -1;
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                float y2 = motionEvent.getY();
                this.LJIJ = y2;
                this.LJIJI = y2;
                this.LJIJJLI = MotionEventCompat.getPointerId(motionEvent, 0);
                this.LJIJJ = false;
            }
            if (this.LJIJJ && m15756LJ()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJJI) {
            return true;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.LJIIIIZZ && actionMasked == 0) {
            this.LJIIIIZZ = false;
        }
        if (!isEnabled() || this.LJIIIIZZ || LIZLLL()) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                LIZ(motionEvent);
                            }
                        } else {
                            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                            this.LJIJI = MotionEventCompat.getY(motionEvent, actionIndex);
                            this.LJIJJLI = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                            return true;
                        }
                    } else {
                        LJFF();
                        this.LJIJJ = false;
                        this.LJIJJLI = -1;
                        return false;
                    }
                } else {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.LJIJJLI);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y = MotionEventCompat.getY(motionEvent, findPointerIndex);
                    float f = y - this.LJIJ;
                    if (!this.LJIJJ && f > this.LJIILLIIL) {
                        this.LJIJJ = true;
                    }
                    if (this.LJIJJ) {
                        AbstractC145638epy abstractC145638epy = this.LIZLLL;
                        if (abstractC145638epy != null) {
                            abstractC145638epy.LIZ();
                        }
                        if (f > this.LJIIZILJ) {
                            if (this.LJIIJJI == STATUS.NORMAL) {
                                this.LJIIJJI = STATUS.LOOSEN;
                            }
                            LIZ((int) f);
                        } else {
                            if (this.LJIIJJI == STATUS.LOOSEN) {
                                this.LJIIJJI = STATUS.NORMAL;
                            }
                            LIZ((int) f);
                            if (this.LJIJI > y && this.LIZIZ.getTop() == getPaddingTop()) {
                                removeCallbacks(this.LJJIIZ);
                            }
                        }
                        this.LJIJI = y;
                        return true;
                    }
                }
                return true;
            }
            if (this.LJIIJJI == STATUS.LOOSEN) {
                LIZ();
            } else {
                LJFF();
            }
            this.LJIJJ = false;
            this.LJIJJLI = -1;
            return false;
        }
        float y2 = motionEvent.getY();
        this.LJIJ = y2;
        this.LJIJI = y2;
        this.LJIJJLI = MotionEventCompat.getPointerId(motionEvent, 0);
        this.LJIJJ = false;
        return true;
    }

    public PkInviteUserListRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1757);
        this.LJIIZILJ = -1.0f;
        this.LJIJJLI = -1;
        this.LJIIJJI = STATUS.NORMAL;
        this.LJJIII = new Animation() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(25993);
            }

            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (PatchProxy.proxy(new Object[]{Float.valueOf(f), transformation}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (PkInviteUserListRefreshLayout.this.f26273LJ != PkInviteUserListRefreshLayout.this.LIZJ) {
                    i = ((int) ((PkInviteUserListRefreshLayout.this.LIZJ - PkInviteUserListRefreshLayout.this.f26273LJ) * f)) + PkInviteUserListRefreshLayout.this.f26273LJ;
                } else {
                    i = 0;
                }
                int top = i - PkInviteUserListRefreshLayout.this.LIZIZ.getTop();
                int top2 = PkInviteUserListRefreshLayout.this.LIZIZ.getTop();
                if (top + top2 < 0) {
                    top = 0 - top2;
                }
                PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
            }
        };
        this.LJIILIIL = new Animation() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(25994);
            }

            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (PatchProxy.proxy(new Object[]{Float.valueOf(f), transformation}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (PkInviteUserListRefreshLayout.this.f26273LJ != PkInviteUserListRefreshLayout.this.LJIIJ) {
                    i = ((int) ((PkInviteUserListRefreshLayout.this.LJIIJ - PkInviteUserListRefreshLayout.this.f26273LJ) * f)) + PkInviteUserListRefreshLayout.this.f26273LJ;
                } else {
                    i = 0;
                }
                int top = i - PkInviteUserListRefreshLayout.this.LIZIZ.getTop();
                int top2 = PkInviteUserListRefreshLayout.this.LIZIZ.getTop();
                if (top + top2 < 0) {
                    top = 0 - top2;
                }
                PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
            }
        };
        this.LJIILJJIL = new animation.Animation$AnimationListenerC145637epx() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(25995);
            }

            @Override // p003X.animation.Animation$AnimationListenerC145637epx, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.proxy(new Object[]{animation}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
                pkInviteUserListRefreshLayout.LJII = 0;
                pkInviteUserListRefreshLayout.LJIIJJI = STATUS.NORMAL;
                PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout2 = PkInviteUserListRefreshLayout.this;
                pkInviteUserListRefreshLayout2.LJIIL = false;
                pkInviteUserListRefreshLayout2.LIZLLL.LIZJ();
            }
        };
        this.LJIILL = new animation.Animation$AnimationListenerC145637epx() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.4
            static {
                Covode.recordClassIndex(25996);
            }

            @Override // p003X.animation.Animation$AnimationListenerC145637epx, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
                pkInviteUserListRefreshLayout.LJII = pkInviteUserListRefreshLayout.LJIIJ;
                PkInviteUserListRefreshLayout.this.LJIIJJI = STATUS.REFRESHING;
            }
        };
        this.LJJIIJ = new Runnable() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(25997);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
                pkInviteUserListRefreshLayout.LJIIIIZZ = true;
                pkInviteUserListRefreshLayout.LIZ(pkInviteUserListRefreshLayout.LJII + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.LJIILJJIL);
            }
        };
        this.LJJIIJZLJL = new Runnable() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(25998);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
                pkInviteUserListRefreshLayout.LJIIIIZZ = true;
                int paddingTop = pkInviteUserListRefreshLayout.LJII + PkInviteUserListRefreshLayout.this.getPaddingTop();
                Animation.AnimationListener animationListener = PkInviteUserListRefreshLayout.this.LJIILL;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(paddingTop), animationListener}, pkInviteUserListRefreshLayout, PkInviteUserListRefreshLayout.LIZ, false, 4).isSupported) {
                    pkInviteUserListRefreshLayout.f26273LJ = paddingTop;
                    pkInviteUserListRefreshLayout.LJIILIIL.reset();
                    pkInviteUserListRefreshLayout.LJIILIIL.setDuration(pkInviteUserListRefreshLayout.LJI);
                    pkInviteUserListRefreshLayout.LJIILIIL.setAnimationListener(animationListener);
                    pkInviteUserListRefreshLayout.LJIILIIL.setInterpolator(pkInviteUserListRefreshLayout.LJIIIZ);
                    if (pkInviteUserListRefreshLayout.LIZIZ != null) {
                        pkInviteUserListRefreshLayout.LIZIZ.startAnimation(pkInviteUserListRefreshLayout.LJIILIIL);
                    }
                }
            }
        };
        this.LJJIIZ = new Runnable() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout.7
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(25999);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
                pkInviteUserListRefreshLayout.LJIIIIZZ = true;
                pkInviteUserListRefreshLayout.LIZ(pkInviteUserListRefreshLayout.LJII + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.LJIILJJIL);
            }
        };
        this.LJIILLIIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJI = getResources().getInteger(17694721);
        this.LJIIIZ = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LJIL);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        MethodCollector.m14707o(1757);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1758);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 8).isSupported) {
            MethodCollector.m14707o(1758);
            return;
        }
        super.onMeasure(i, i2);
        if (getChildCount() > 1) {
            if (getChildCount() > 2 && !isInEditMode()) {
                IllegalStateException illegalStateException = new IllegalStateException("SwipeRefreshLayout can only host two children");
                MethodCollector.m14707o(1758);
                throw illegalStateException;
            }
            if (this.LJJ == null) {
                this.LJJ = getChildAt(0);
                measureChild(this.LJJ, i, i2);
                this.LJIIJ = this.LJJ.getMeasuredHeight();
                this.LJIIZILJ = this.LJIIJ;
            }
            getChildAt(1).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            MethodCollector.m14707o(1758);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("SwipeRefreshLayout must have the headerview and contentview");
        MethodCollector.m14707o(1758);
        throw illegalStateException2;
    }

    public final void LIZ(int i, Animation.AnimationListener animationListener) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), animationListener}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.f26273LJ = i;
        this.LJJIII.reset();
        this.LJJIII.setDuration(this.LJI);
        this.LJJIII.setAnimationListener(animationListener);
        this.LJJIII.setInterpolator(this.LJIIIZ);
        this.LIZIZ.startAnimation(this.LJJIII);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0 && getChildCount() != 1) {
            View childAt = getChildAt(1);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.LJII + getPaddingTop();
            int paddingLeft2 = ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft;
            childAt.layout(paddingLeft, paddingTop, paddingLeft2, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            this.LJJ.layout(paddingLeft, paddingTop - this.LJIIJ, paddingLeft2, paddingTop);
        }
    }
}
