package com.bytedance.android.live.browser.webview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.browser.webview.SSWebView;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.AbstractC101216Pta;
import p003X.AbstractC4561842i;
import p003X.C140565dVp;
import p003X.C147929fQx;
import p003X.C98175Old;

/* loaded from: classes8.dex */
public class RoundRectWebView extends SSWebView implements AbstractC4561842i {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean clampedY = true;
    public boolean enableTouchEventCheck;
    public boolean enableTouchEventSpeedCheck;
    public ViewParent interceptParent;
    public boolean needCleanRadius;
    public Paint paint;
    public Path path;
    public float radius;
    public float radiusBottomLeft;
    public float radiusBottomRight;
    public float radiusTopLeft;
    public float radiusTopRight;
    public RectF rect;
    public AbstractC101216Pta scrollChangeListener;
    public float velocityThreshold;
    public VelocityTracker velocityTracker;

    static {
        Covode.recordClassIndex(23243);
    }

    public static /* synthetic */ void access$000(SSWebView sSWebView, String str) {
        if (PatchProxy.proxy(new Object[]{sSWebView, str}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        super.loadUrl(str);
    }

    public static /* synthetic */ void access$001(SSWebView sSWebView, String str, Map map) {
        if (PatchProxy.proxy(new Object[]{sSWebView, str, map}, null, changeQuickRedirect, true, 6).isSupported) {
            return;
        }
        super.loadUrl(str, map);
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundRectWebView__onDetachedFromWindow$___twin___ */
    public void m15814x7e41ad9e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.live.browser.webview.SSWebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        m15813xa4c121d7(this);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C147929fQx.LIZIZ.LIZJ().mo21319LJ(this);
        super.destroy();
    }

    @Override // com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public void goBack() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C147929fQx.LIZIZ.LIZJ().LIZLLL(this);
        super.goBack();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        C147929fQx.LIZIZ.LIZJ().LJFF(this);
    }

    @Override // com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public void reload() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C147929fQx.LIZIZ.LIZJ().LIZJ(this);
        super.reload();
    }

    @Override // com.bytedance.android.live.browser.webview.SSWebView
    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        super.init();
        this.path = new Path();
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(0);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        C147929fQx.LIZIZ.LIZJ().LIZ(this);
        C147929fQx.LIZIZ.LIZJ().LIZ(this, "use_new_container", "0");
    }

    public void setOnScrollChangeListener(AbstractC101216Pta abstractC101216Pta) {
        this.scrollChangeListener = abstractC101216Pta;
    }

    public RoundRectWebView(Context context) {
        super(context);
    }

    public void setEnableTouchEventCheck(boolean z) {
        this.enableTouchEventCheck = z;
        if (z) {
            this.clampedY = true;
        }
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundRectWebView_com_ss_android_ugc_aweme_security_web_WebviewLancet_onDetachedFromWindow */
    public static void m15813xa4c121d7(RoundRectWebView roundRectWebView) {
        if (PatchProxy.proxy(new Object[]{roundRectWebView}, null, changeQuickRedirect, true, 19).isSupported) {
            return;
        }
        C98175Old.LIZJ.removePageContainer(roundRectWebView);
        roundRectWebView.m15814x7e41ad9e();
    }

    @Override // com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public void loadUrl(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C147929fQx.LIZIZ.LIZJ().LIZ(this, str);
        m15816xbdad593b(this, str);
    }

    public void setRadius(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        this.radius = f;
        this.needCleanRadius = true;
        invalidate();
    }

    private ViewParent findViewParentIfNeeds(View view) {
        ViewParent parent;
        while (true) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 18);
            if (proxy.isSupported) {
                return (ViewParent) proxy.result;
            }
            ViewParent viewParent = this.interceptParent;
            if (viewParent != null) {
                return viewParent;
            }
            parent = view.getParent();
            if (parent == null) {
                return null;
            }
            if ((parent instanceof CoordinatorLayout) || (parent instanceof ViewPager) || (parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof LiveVerticalViewPager) || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return parent;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.enableTouchEventCheck && motionEvent.getAction() == 0 && !this.clampedY) {
            this.interceptParent = findViewParentIfNeeds(this);
            ViewParent viewParent = this.interceptParent;
            if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r1 != 3) goto L29;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r3 = 0
            r4[r3] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.browser.webview.view.RoundRectWebView.changeQuickRedirect
            r0 = 15
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r4, r5, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            boolean r0 = r5.enableTouchEventSpeedCheck
            if (r0 == 0) goto L2d
            int r1 = r6.getAction()
            if (r1 == 0) goto L77
            if (r1 == r2) goto L6a
            r0 = 2
            if (r1 == r0) goto L32
            r0 = 3
            if (r1 == r0) goto L6a
        L2d:
            boolean r0 = super.dispatchTouchEvent(r6)
            return r0
        L32:
            android.view.VelocityTracker r0 = r5.velocityTracker
            r0.addMovement(r6)
            android.view.VelocityTracker r1 = r5.velocityTracker
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            android.view.VelocityTracker r0 = r5.velocityTracker
            float r0 = r0.getYVelocity()
            float r1 = java.lang.Math.abs(r0)
            float r0 = r5.velocityThreshold
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5c
            android.view.ViewParent r0 = r5.findViewParentIfNeeds(r5)
            r5.interceptParent = r0
            android.view.ViewParent r0 = r5.interceptParent
            if (r0 == 0) goto L2d
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L2d
        L5c:
            android.view.ViewParent r0 = r5.findViewParentIfNeeds(r5)
            r5.interceptParent = r0
            android.view.ViewParent r0 = r5.interceptParent
            if (r0 == 0) goto L2d
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L2d
        L6a:
            android.view.VelocityTracker r0 = r5.velocityTracker
            if (r0 == 0) goto L2d
            r0.clear()
            android.view.VelocityTracker r0 = r5.velocityTracker
            r0.recycle()
            goto L2d
        L77:
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.velocityTracker = r0
            android.view.ViewParent r0 = r5.findViewParentIfNeeds(r5)
            r5.interceptParent = r0
            android.view.ViewParent r0 = r5.interceptParent
            if (r0 == 0) goto L2d
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.browser.webview.view.RoundRectWebView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        super.onDraw(canvas);
        if (this.radius != 0.0f) {
            this.rect.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            Path path = this.path;
            RectF rectF = this.rect;
            float f = this.radius;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        } else if (this.radiusTopLeft == 0.0f && this.radiusTopRight == 0.0f && this.radiusBottomRight == 0.0f && this.radiusBottomLeft == 0.0f) {
            if (this.needCleanRadius) {
                this.rect.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
                this.path.reset();
                this.path.setFillType(Path.FillType.INVERSE_WINDING);
                this.path.addRoundRect(this.rect, 0.0f, 0.0f, Path.Direction.CW);
                canvas.drawPath(this.path, this.paint);
            }
        } else {
            this.rect.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            float f2 = this.radiusTopLeft;
            float f3 = this.radiusTopRight;
            float f4 = this.radiusBottomRight;
            float f5 = this.radiusBottomLeft;
            this.path.addRoundRect(this.rect, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        }
    }

    @Override // p003X.AbstractC4561842i
    public void setEnableTouchEventSpeedCheck(boolean z, float f) {
        this.enableTouchEventSpeedCheck = z;
        this.velocityThreshold = f;
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: INVOKESPECIAL_com_bytedance_android_live_browser_webview_view_RoundRectWebView_com_ss_android_ugc_aweme_security_web_WebviewLancet_loadUrl */
    public static void m15816xbdad593b(SSWebView sSWebView, String str) {
        if (PatchProxy.proxy(new Object[]{sSWebView, str}, null, changeQuickRedirect, true, 4).isSupported) {
            return;
        }
        String LIZ = C140565dVp.LIZIZ.LIZ(str, "get", sSWebView);
        if (!TextUtils.isEmpty(LIZ)) {
            str = LIZ;
        }
        access$000(sSWebView, str);
    }

    @Override // com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C147929fQx.LIZIZ.LIZJ().LIZ(this, str);
        m15815xbdad593b(this, str, map);
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: INVOKESPECIAL_com_bytedance_android_live_browser_webview_view_RoundRectWebView_com_ss_android_ugc_aweme_security_web_WebviewLancet_loadUrl */
    public static void m15815xbdad593b(SSWebView sSWebView, String str, Map map) {
        if (PatchProxy.proxy(new Object[]{sSWebView, str, map}, null, changeQuickRedirect, true, 7).isSupported) {
            return;
        }
        String LIZ = C140565dVp.LIZIZ.LIZ(str, "get", sSWebView);
        if (!TextUtils.isEmpty(LIZ)) {
            str = LIZ;
        }
        access$001(sSWebView, str, map);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        this.radius = 0.0f;
        this.radiusTopLeft = f;
        this.radiusTopRight = f2;
        this.radiusBottomRight = f3;
        this.radiusBottomLeft = f4;
        this.needCleanRadius = true;
        invalidate();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        if (this.enableTouchEventCheck) {
            if (i2 == 0) {
                this.clampedY = true;
                ViewParent findViewParentIfNeeds = findViewParentIfNeeds(this);
                if (findViewParentIfNeeds != null) {
                    findViewParentIfNeeds.requestDisallowInterceptTouchEvent(false);
                }
            } else {
                this.clampedY = false;
            }
        }
        AbstractC101216Pta abstractC101216Pta = this.scrollChangeListener;
        if (abstractC101216Pta != null) {
            abstractC101216Pta.LIZ(this, i, i2, i3, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }
}
