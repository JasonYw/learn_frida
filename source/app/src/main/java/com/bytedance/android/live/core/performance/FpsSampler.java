package com.bytedance.android.live.core.performance;

import android.view.Choreographer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import p003X.AbstractC4569445g;

/* loaded from: classes5.dex */
public class FpsSampler extends BaseSampler<Double> implements Choreographer.FrameCallback, AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;
    public Choreographer LJI;
    public boolean LJIIIIZZ;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public int LJII = -1;

    static {
        Covode.recordClassIndex(23528);
    }

    @Override // com.bytedance.android.live.core.performance.BaseSampler, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LJFF, false, 3).isSupported || this.LJIIIIZZ) {
            return;
        }
        if (this.LJIIIZ == -1) {
            this.LJIIIZ = j;
        } else {
            this.LJII++;
        }
        this.LJIIJ = j;
        this.LJI.postFrameCallback(this);
    }

    @Override // com.bytedance.android.live.core.performance.BaseSampler
    public final void LIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LJFF, false, 2).isSupported) {
            return;
        }
        long j = this.LJIIJ;
        long j2 = this.LJIIIZ;
        if (j != j2) {
            double d = (this.LJII * 1.0E9d) / (j - j2);
            if (d != 0.0d) {
                LIZ((FpsSampler) Double.valueOf(d));
            }
        }
        super.LIZ(hashMap);
        this.LJIIIIZZ = true;
        this.LJI.removeFrameCallback(this);
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJII = 0;
    }

    public FpsSampler(Choreographer choreographer, int i, int i2) {
        super(i, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR);
        this.LJI = choreographer;
    }
}
