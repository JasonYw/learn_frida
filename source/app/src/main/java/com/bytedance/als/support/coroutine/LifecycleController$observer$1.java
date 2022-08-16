package com.bytedance.als.support.coroutine;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import p003X.C106862S5w;
import p003X.C144370eVQ;
import p003X.C144371eVR;

/* loaded from: classes19.dex */
public final class LifecycleController$observer$1 implements LifecycleEventObserver {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ C144371eVR LIZIZ;
    public final /* synthetic */ Job LIZJ;

    static {
        Covode.recordClassIndex(10071);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(lifecycleOwner, event);
        Lifecycle mo29786getLifecycle = lifecycleOwner.mo29786getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(mo29786getLifecycle, "");
        if (mo29786getLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            C144371eVR c144371eVR = this.LIZIZ;
            Job.DefaultImpls.cancel$default(this.LIZJ, null, 1, null);
            if (!PatchProxy.proxy(new Object[0], c144371eVR, C144371eVR.LIZ, false, 2).isSupported) {
                c144371eVR.LIZJ.removeObserver(c144371eVR.LIZIZ);
                C144370eVQ c144370eVQ = c144371eVR.f19183LJ;
                if (!PatchProxy.proxy(new Object[0], c144370eVQ, C144370eVQ.LIZ, false, 2).isSupported) {
                    c144370eVQ.LIZJ = true;
                    c144370eVQ.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        Lifecycle mo29786getLifecycle2 = lifecycleOwner.mo29786getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(mo29786getLifecycle2, "");
        if (mo29786getLifecycle2.getCurrentState().compareTo(this.LIZIZ.LIZLLL) < 0) {
            this.LIZIZ.f19183LJ.LIZIZ = true;
            return;
        }
        C144370eVQ c144370eVQ2 = this.LIZIZ.f19183LJ;
        if (!PatchProxy.proxy(new Object[0], c144370eVQ2, C144370eVQ.LIZ, false, 1).isSupported && c144370eVQ2.LIZIZ) {
            if (!c144370eVQ2.LIZJ) {
                c144370eVQ2.LIZIZ = false;
                c144370eVQ2.LIZ();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
