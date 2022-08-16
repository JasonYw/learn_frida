package com.bytedance.android.live.broadcast.bgbroadcast.game.gesture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.bgbroadcast.game.sensor_data.model.DataType;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.KPE;

/* loaded from: classes5.dex */
public class TouchDetectLayout extends FrameLayout {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(14773);
    }

    public TouchDetectLayout(Context context) {
        super(context);
        MethodCollector.m14708i(1198);
        MethodCollector.m14707o(1198);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LiveConfigSettingKeys.LIVE_SAMPLE_DATA_CONFIG.getValue().getEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        KPE.f8458LJ.LIZ(DataType.TYPE_TOUCH_EVENT, Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), null);
        return super.onTouchEvent(motionEvent);
    }

    public TouchDetectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1199);
        MethodCollector.m14707o(1199);
    }

    public TouchDetectLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1200);
        MethodCollector.m14707o(1200);
    }
}
