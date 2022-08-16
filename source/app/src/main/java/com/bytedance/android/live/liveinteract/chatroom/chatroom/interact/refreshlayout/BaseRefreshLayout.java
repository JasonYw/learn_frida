package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.refreshlayout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC145634epu;
import p003X.C106862S5w;
import p003X.C145626epm;
import p003X.C145627epn;
import p003X.C145628epo;
import p003X.C145630epq;
import p003X.RunnableC145625epl;
import p003X.RunnableC145629epp;
import p003X.RunnableC145631epr;
import p003X.View$OnTouchListenerC145633ept;

/* loaded from: classes19.dex */
public final class BaseRefreshLayout extends ViewGroup {
    public static ChangeQuickRedirect LIZ;
    public static final long LJJIIZ = 300;
    public static final float LJJIIZI = 2.0f;
    public static final float LJJIJ = 0.6f;
    public static final int LJJIJIIJI = 120;
    public static final int LJJIJIIJIL = -1;
    public static final int[] LJJIJIL = {16842766};
    public View LIZIZ;
    public int LIZJ;
    public AbstractC145634epu LIZLLL;

    /* renamed from: LJ */
    public int f26272LJ;
    public boolean LJFF;
    public final int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public final DecelerateInterpolator LJIIIZ;
    public int LJIIJ;
    public STATUS LJIIJJI;
    public boolean LJIIL;
    public final C145626epm LJIILIIL;
    public final C145628epo LJIILJJIL;
    public final C145630epq LJIILL;
    public final int LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;
    public View LJIL;
    public boolean LJJ;
    public float LJJI;
    public float LJJIFFI;
    public final C145627epn LJJII;
    public final Runnable LJJIII;
    public final Runnable LJJIIJ;
    public final Runnable LJJIIJZLJL;

    /* loaded from: classes19.dex */
    public enum STATUS {
        NORMAL,
        LOOSEN,
        REFRESHING;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(25981);
        }

        public static STATUS valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (STATUS) (proxy.isSupported ? proxy.result : Enum.valueOf(STATUS.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static STATUS[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (STATUS[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    public BaseRefreshLayout(Context context) {
        this(context, null, 2, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        removeCallbacks(this.LJJIIJZLJL);
        postDelayed(this.LJJIIJZLJL, LJJIIZ);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJJIII.run();
    }

    static {
        Covode.recordClassIndex(25980);
        SwipeRefreshLayout.class.getSimpleName();
    }

    private boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        View view = this.LIZIZ;
        Intrinsics.checkNotNull(view);
        return ViewCompat.canScrollVertically(view, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        removeCallbacks(this.LJJIIJZLJL);
        removeCallbacks(this.LJJIII);
        removeCallbacks(this.LJJIIJ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        removeCallbacks(this.LJJIII);
        removeCallbacks(this.LJJIIJZLJL);
        removeCallbacks(this.LJJIIJ);
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        if (this.LIZIZ == null) {
            if (getChildCount() > 2 && !isInEditMode()) {
                throw new IllegalStateException("SwipeRefreshLayout can only host two children".toString());
            }
            this.LIZIZ = getChildAt(1);
            View view = this.LIZIZ;
            Intrinsics.checkNotNull(view);
            view.setOnTouchListener(new View$OnTouchListenerC145633ept(this));
            View view2 = this.LIZIZ;
            Intrinsics.checkNotNull(view2);
            this.LIZJ = view2.getTop() + getPaddingTop();
        }
        if (this.LJIIZILJ == -1.0f && getParent() != null) {
            ViewParent parent = getParent();
            if (parent != null) {
                if (((View) parent).getHeight() > 0) {
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        this.LJIIZILJ = (int) Math.min(((View) parent2).getHeight() * LJJIJ, LJJIJIIJI * displayMetrics.density);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public final void setmIsDisable(boolean z) {
        this.LJJ = z;
    }

    public final void setOnRefreshListener(AbstractC145634epu abstractC145634epu) {
        if (PatchProxy.proxy(new Object[]{abstractC145634epu}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC145634epu);
        this.LIZLLL = abstractC145634epu;
    }

    public final void setRefreshing(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported && this.LJFF != z) {
            LIZIZ();
            this.LJFF = z;
        }
    }

    private final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        View view = this.LIZIZ;
        Intrinsics.checkNotNull(view);
        int top = view.getTop();
        float f = i;
        float f2 = this.LJIIZILJ;
        if (f > f2) {
            i = ((int) f2) + (((int) (f - f2)) / 2);
        } else if (i < 0) {
            i = 0;
        }
        setTargetOffsetTopAndBottom(i - top);
    }

    public final void setTargetOffsetTopAndBottom(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        View view = this.LIZIZ;
        Intrinsics.checkNotNull(view);
        view.offsetTopAndBottom(i);
        View view2 = this.LJIL;
        Intrinsics.checkNotNull(view2);
        view2.offsetTopAndBottom(i);
        View view3 = this.LIZIZ;
        Intrinsics.checkNotNull(view3);
        this.LJII = view3.getTop();
        invalidate();
    }

    private final void LIZ(MotionEvent motionEvent) {
        int i = 1;
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 20).isSupported) {
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
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(motionEvent);
        if (this.LJJ) {
            return false;
        }
        LIZIZ();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.LJIIIIZZ && actionMasked == 0) {
            this.LJIIIIZZ = false;
        }
        if (!isEnabled() || this.LJIIIIZZ || LIZJ()) {
            return false;
        }
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
                    if (i == LJJIJIIJIL || (findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i)) < 0) {
                        return false;
                    }
                    float y = MotionEventCompat.getY(motionEvent, findPointerIndex);
                    MotionEventCompat.getX(motionEvent, findPointerIndex);
                    if (y - this.LJIJ > this.LJIILLIIL) {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 12);
                        if (!proxy2.isSupported ? Math.abs(motionEvent.getX() - this.LJJI) < Math.abs(motionEvent.getY() - this.LJJIFFI) : ((Boolean) proxy2.result).booleanValue()) {
                            this.LJIJI = y;
                            this.LJIJJ = true;
                        }
                    }
                }
            }
            this.LJIJJ = false;
            this.LJIJJLI = LJJIJIIJIL;
        } else {
            this.LJIJ = motionEvent.getY();
            this.LJIJI = this.LJIJ;
            motionEvent.getX();
            this.LJIJJLI = MotionEventCompat.getPointerId(motionEvent, 0);
            this.LJIJJ = false;
            this.LJJI = motionEvent.getX();
            this.LJJIFFI = motionEvent.getY();
        }
        this.LJJI = motionEvent.getX();
        this.LJJIFFI = motionEvent.getY();
        return this.LJIJJ;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(motionEvent);
        if (this.LJJ) {
            return true;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.LJIIIIZZ && actionMasked == 0) {
            this.LJIIIIZZ = false;
        }
        if (!isEnabled() || this.LJIIIIZZ || LIZJ()) {
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
                        LIZLLL();
                        this.LJIJJ = false;
                        this.LJIJJLI = LJJIJIIJIL;
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
                        AbstractC145634epu abstractC145634epu = this.LIZLLL;
                        if (abstractC145634epu != null) {
                            Intrinsics.checkNotNull(abstractC145634epu);
                            abstractC145634epu.LIZ();
                        }
                        if (f > this.LJIIZILJ) {
                            if (this.LJIIJJI == STATUS.NORMAL) {
                                this.LJIIJJI = STATUS.LOOSEN;
                                AbstractC145634epu abstractC145634epu2 = this.LIZLLL;
                                if (abstractC145634epu2 != null) {
                                    Intrinsics.checkNotNull(abstractC145634epu2);
                                }
                            }
                            LIZ((int) f);
                        } else {
                            if (this.LJIIJJI == STATUS.LOOSEN) {
                                this.LJIIJJI = STATUS.NORMAL;
                            }
                            LIZ((int) f);
                            if (this.LJIJI > y) {
                                View view = this.LIZIZ;
                                Intrinsics.checkNotNull(view);
                                if (view.getTop() == getPaddingTop()) {
                                    removeCallbacks(this.LJJIIJZLJL);
                                }
                            }
                        }
                        this.LJIJI = y;
                        return true;
                    }
                }
                return true;
            }
            if (this.LJIIJJI == STATUS.LOOSEN) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
                    removeCallbacks(this.LJJIIJZLJL);
                    this.LJJIIJ.run();
                    setRefreshing(true);
                    this.LJIIL = true;
                    AbstractC145634epu abstractC145634epu3 = this.LIZLLL;
                    if (abstractC145634epu3 != null) {
                        Intrinsics.checkNotNull(abstractC145634epu3);
                        abstractC145634epu3.LIZIZ();
                    }
                }
            } else {
                LIZLLL();
            }
            this.LJIJJ = false;
            this.LJIJJLI = LJJIJIIJIL;
            return false;
        }
        this.LJIJ = motionEvent.getY();
        this.LJIJI = this.LJIJ;
        this.LJIJJLI = MotionEventCompat.getPointerId(motionEvent, 0);
        this.LJIJJ = false;
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1756);
        BaseRefreshLayout.class.getSimpleName();
        this.LJIIZILJ = -1.0f;
        this.LJIJJLI = LJJIJIIJIL;
        this.LJIIJJI = STATUS.NORMAL;
        this.LJJII = new C145627epn(this);
        this.LJIILIIL = new C145626epm(this);
        this.LJIILJJIL = new C145628epo(this);
        this.LJIILL = new C145630epq(this);
        this.LJJIII = new RunnableC145631epr(this);
        this.LJJIIJ = new RunnableC145625epl(this);
        this.LJJIIJZLJL = new RunnableC145629epp(this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "");
        this.LJIILLIIL = viewConfiguration.getScaledTouchSlop();
        this.LJI = getResources().getInteger(17694721);
        this.LJIIIZ = new DecelerateInterpolator(LJJIIZI);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LJJIJIL);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        MethodCollector.m14707o(1756);
    }

    public final void LIZ(int i, Animation.AnimationListener animationListener) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), animationListener}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.f26272LJ = i;
        this.LJJII.reset();
        this.LJJII.setDuration(this.LJI);
        this.LJJII.setAnimationListener(animationListener);
        this.LJJII.setInterpolator(this.LJIIIZ);
        View view = this.LIZIZ;
        Intrinsics.checkNotNull(view);
        view.startAnimation(this.LJJII);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1755);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 9).isSupported) {
            MethodCollector.m14707o(1755);
            return;
        }
        super.onMeasure(i, i2);
        if (getChildCount() > 1) {
            if (getChildCount() > 2 && !isInEditMode()) {
                IllegalStateException illegalStateException = new IllegalStateException("SwipeRefreshLayout can only host two children".toString());
                MethodCollector.m14707o(1755);
                throw illegalStateException;
            }
            if (this.LJIL == null) {
                this.LJIL = getChildAt(0);
                measureChild(this.LJIL, i, i2);
                View view = this.LJIL;
                Intrinsics.checkNotNull(view);
                this.LJIIJ = view.getMeasuredHeight();
                this.LJIIZILJ = this.LJIIJ;
            }
            getChildAt(1).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            MethodCollector.m14707o(1755);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("SwipeRefreshLayout must have the headerview and contentview".toString());
        MethodCollector.m14707o(1755);
        throw illegalStateException2;
    }

    public /* synthetic */ BaseRefreshLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 8).isSupported) {
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
            View view = this.LJIL;
            Intrinsics.checkNotNull(view);
            view.layout(paddingLeft, paddingTop - this.LJIIJ, paddingLeft2, paddingTop);
        }
    }
}
