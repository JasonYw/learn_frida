package com.bytedance.android.live.broadcast.banner.view;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.uikit.viewpager.SSViewPager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AutoScrollViewPager extends SSViewPager implements WeakHandler.IHandler {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZLLL;
    public boolean LIZIZ = true;
    public int LIZJ = PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;

    /* renamed from: LJ */
    public final WeakHandler f25784LJ = new WeakHandler(Looper.getMainLooper(), this);

    static {
        Covode.recordClassIndex(14651);
    }

    public final boolean getMIsAutoScrolling() {
        return this.LIZLLL;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LIZIZ) {
            this.LIZLLL = false;
        }
        this.f25784LJ.removeCallbacksAndMessages(null);
    }

    public final void setAutoEnable(boolean z) {
        this.LIZIZ = z;
    }

    public final void setAutoScrollInterval(int i) {
        this.LIZJ = i;
    }

    public final void setMIsAutoScrolling(boolean z) {
        this.LIZLLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollViewPager(Context context) {
        super(context);
        C106862S5w.LIZ(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(motionEvent);
        if (this.LIZIZ) {
            if (motionEvent.getAction() == 0) {
                this.f25784LJ.removeCallbacksAndMessages(null);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f25784LJ.sendEmptyMessageDelayed(1000, this.LIZJ);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        PagerAdapter adapter;
        int count;
        if (PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(message);
        if (this.LIZIZ && (adapter = getAdapter()) != null && (count = adapter.getCount()) > 1 && message.what == 1000 && getCurrentItem() + 1 < count) {
            setCurrentItem(getCurrentItem() + 1, true);
            this.f25784LJ.sendEmptyMessageDelayed(1000, this.LIZJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context, attributeSet);
    }
}
