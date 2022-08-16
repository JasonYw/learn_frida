package androidx.p009a.p010a;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.AbstractC135052c4l;
import p003X.C133801bkU;
import p003X.C135050c4j;
import p003X.C135051c4k;

/* renamed from: androidx.a.a.a */
/* loaded from: classes17.dex */
public final class C0176a {
    public LayoutInflater LIZ;
    public Handler.Callback LIZLLL = new C135051c4k(this);
    public Handler LIZIZ = new Handler(this.LIZLLL);
    public C135050c4j LIZJ = C135050c4j.LIZ;

    /* renamed from: androidx.a.a.a$b */
    /* loaded from: classes17.dex */
    public static class C0177b {
        public C0176a LIZ;
        public ViewGroup LIZIZ;
        public int LIZJ;
        public View LIZLLL;

        /* renamed from: LJ */
        public AbstractC135052c4l f20216LJ;

        static {
            Covode.recordClassIndex(403);
        }
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(SDKMonitor.SDK_VERSION);
        } else {
            Covode.recordClassIndex(SDKMonitor.SDK_VERSION);
        }
    }

    public C0176a(Context context) {
        this.LIZ = new C133801bkU(context);
    }

    public final void LIZ(int i, ViewGroup viewGroup, AbstractC135052c4l abstractC135052c4l) {
        if (abstractC135052c4l != null) {
            C0177b acquire = this.LIZJ.LIZJ.acquire();
            if (acquire == null) {
                acquire = new C0177b();
            }
            acquire.LIZ = this;
            acquire.LIZJ = i;
            acquire.LIZIZ = viewGroup;
            acquire.f20216LJ = abstractC135052c4l;
            try {
                this.LIZJ.LIZIZ.put(acquire);
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
