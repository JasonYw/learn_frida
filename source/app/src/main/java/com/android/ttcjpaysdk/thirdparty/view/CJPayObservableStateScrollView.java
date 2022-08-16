package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC130369ar0;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes16.dex */
public class CJPayObservableStateScrollView extends ScrollView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public AbstractC130369ar0 f25546LJ;
    public boolean LIZIZ = true;
    public final Handler LJFF = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayObservableStateScrollView.1
        public static ChangeQuickRedirect LIZ;
        public int LIZJ = Integer.MIN_VALUE;

        static {
            Covode.recordClassIndex(9225);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (message.what != 1) {
                return false;
            }
            int scrollY = CJPayObservableStateScrollView.this.getScrollY();
            if (!CJPayObservableStateScrollView.this.LIZJ && this.LIZJ == scrollY) {
                this.LIZJ = Integer.MIN_VALUE;
                CJPayObservableStateScrollView.this.setScrollState(0);
                return true;
            }
            this.LIZJ = scrollY;
            CJPayObservableStateScrollView.this.LIZ();
            return true;
        }
    });

    static {
        Covode.recordClassIndex(9224);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJFF.removeMessages(1);
        this.LJFF.sendEmptyMessageDelayed(1, 80L);
    }

    public void setEnableScrolling(boolean z) {
        this.LIZIZ = z;
    }

    public void setOnScrollListener(AbstractC130369ar0 abstractC130369ar0) {
        this.f25546LJ = abstractC130369ar0;
    }

    public CJPayObservableStateScrollView(Context context) {
        super(context);
        MethodCollector.m14708i(565);
        MethodCollector.m14707o(565);
    }

    public void setScrollState(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported && this.LIZLLL != i) {
            this.LIZLLL = i;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LIZIZ) {
            return false;
        }
        if (!PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 5).isSupported && motionEvent.getAction() == 0) {
            this.LIZJ = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, motionEvent}, null, LIZ, true, 8);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (C140192dPo.LIZ("dispatchScrollViewTouchEvent")) {
            C140181dPd.LJFF();
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 10);
        if (proxy3.isSupported) {
            return ((Boolean) proxy3.result).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LIZIZ) {
            return false;
        }
        if (!PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 6).isSupported && ((action = motionEvent.getAction()) == 1 || action == 3)) {
            this.LIZJ = false;
            LIZ();
        }
        return super.onTouchEvent(motionEvent);
    }

    public CJPayObservableStateScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(566);
        MethodCollector.m14707o(566);
    }

    public CJPayObservableStateScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(567);
        MethodCollector.m14707o(567);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LIZJ) {
            setScrollState(1);
        } else {
            setScrollState(2);
            LIZ();
        }
        AbstractC130369ar0 abstractC130369ar0 = this.f25546LJ;
        if (abstractC130369ar0 != null) {
            abstractC130369ar0.LIZ(this, this.LIZJ, i, i2, i3, i4);
        }
    }
}
