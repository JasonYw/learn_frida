package com.bytedance.android.live.broadcast.floatview;

import android.view.View;
import com.bytedance.android.livesdk.message.model.AbstractC9021r;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.L05;

/* renamed from: com.bytedance.android.live.broadcast.floatview.b */
/* loaded from: classes5.dex */
public abstract class AbstractC3013b<M extends AbstractC9021r, D extends L05<M>> {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;

    static {
        Covode.recordClassIndex(15877);
    }

    public abstract void LIZ(View view);

    public abstract boolean LIZ(D d);

    public abstract long LIZIZ();

    public final View LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = this.LIZIZ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }

    public AbstractC3013b(View view) {
        C106862S5w.LIZ(view);
        this.LIZIZ = view;
        LIZ(view);
    }
}
