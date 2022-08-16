package com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC394861kG;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.ui.PkSwitchScrollLayout */
/* loaded from: classes.dex */
public class PkSwitchScrollLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public AbstractC394861kG f26295LJ;

    static {
        Covode.recordClassIndex(26421);
    }

    public void setNeedIntercept(boolean z) {
        this.LIZLLL = z;
    }

    public void setScrollListener(AbstractC394861kG abstractC394861kG) {
        this.f26295LJ = abstractC394861kG;
    }

    public PkSwitchScrollLayout(Context context) {
        super(context);
        MethodCollector.m14708i(1771);
        MethodCollector.m14707o(1771);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LIZLLL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.LIZIZ - motionEvent.getY() <= 0.0f) {
                        z = false;
                    }
                    this.LIZJ = z;
                }
                return this.LIZJ;
            }
        } else {
            this.LIZIZ = motionEvent.getY();
        }
        this.LIZJ = false;
        return this.LIZJ;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.LIZIZ - motionEvent.getY() > 10.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LIZJ = z;
                    if (this.LIZJ) {
                        this.LIZJ = false;
                    }
                }
                return true;
            }
        } else {
            this.LIZIZ = motionEvent.getY();
        }
        this.LIZJ = false;
        return true;
    }

    public PkSwitchScrollLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1772);
        MethodCollector.m14707o(1772);
    }

    public PkSwitchScrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1773);
        MethodCollector.m14707o(1773);
    }
}
