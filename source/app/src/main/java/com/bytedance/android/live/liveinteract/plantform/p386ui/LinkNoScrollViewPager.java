package com.bytedance.android.live.liveinteract.plantform.p386ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.ui.LinkNoScrollViewPager */
/* loaded from: classes3.dex */
public class LinkNoScrollViewPager extends ViewPager {
    public static ChangeQuickRedirect LIZ;
    public AbstractC4827a LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: com.bytedance.android.live.liveinteract.plantform.ui.LinkNoScrollViewPager$a */
    /* loaded from: classes3.dex */
    public interface AbstractC4827a {
        static {
            Covode.recordClassIndex(29497);
        }

        boolean LJIIJ();
    }

    static {
        Covode.recordClassIndex(29496);
        LinkNoScrollViewPager.class.getSimpleName();
    }

    public LinkNoScrollViewPager(Context context) {
        super(context);
    }

    public void setScrollEnable(AbstractC4827a abstractC4827a) {
        this.LIZIZ = abstractC4827a;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4827a abstractC4827a = this.LIZIZ;
        if (abstractC4827a != null && !abstractC4827a.LJIIJ()) {
            return true;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4827a abstractC4827a = this.LIZIZ;
        if (abstractC4827a != null && !abstractC4827a.LJIIJ()) {
            return false;
        }
        super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
                if (!proxy2.isSupported) {
                }
                this.LIZJ = (int) motionEvent.getX();
                this.LIZLLL = (int) motionEvent.getY();
                return z;
            }
        } else {
            this.LIZJ = (int) motionEvent.getX();
            this.LIZLLL = (int) motionEvent.getY();
        }
        z = false;
        this.LIZJ = (int) motionEvent.getX();
        this.LIZLLL = (int) motionEvent.getY();
        return z;
    }

    public LinkNoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
