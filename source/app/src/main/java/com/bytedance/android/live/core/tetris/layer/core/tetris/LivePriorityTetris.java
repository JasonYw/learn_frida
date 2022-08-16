package com.bytedance.android.live.core.tetris.layer.core.tetris;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.tetris.priority.C4115c;
import com.bytedance.android.live.core.tetris.layer.core.tetris.priority.PriorityTetris;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public abstract class LivePriorityTetris<T extends AbstractC4092b> extends PriorityTetris<T> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23713);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.tetris.priority.PriorityTetris, com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public static /* synthetic */ Element LIZ(LivePriorityTetris livePriorityTetris, final Class cls, C4115c c4115c, final boolean z, Object[] objArr, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{livePriorityTetris, cls, c4115c, Byte.valueOf(z ? (byte) 1 : (byte) 0), null, Integer.valueOf(i), null}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (Element) proxy.result;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cls, c4115c, Byte.valueOf(z ? (byte) 1 : (byte) 0), null}, livePriorityTetris, LIZ, false, 1);
        if (proxy2.isSupported) {
            return (Element) proxy2.result;
        }
        C106862S5w.LIZ(cls, c4115c);
        return livePriorityTetris.LIZ(new AbstractC4103l() { // from class: X.2Ps
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(23714);
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            public final boolean LIZIZ() {
                return false;
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            public final boolean LIZJ() {
                return false;
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            public final C2M1<? extends AbstractC4092b> LIZLLL() {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy3.isSupported) {
                    return (C2M1) proxy3.result;
                }
                return null;
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            /* renamed from: LJ */
            public final Object[] mo15790LJ() {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
                if (proxy3.isSupported) {
                    return (Object[]) proxy3.result;
                }
                return null;
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            public final boolean LJFF() {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
                if (proxy3.isSupported) {
                    return ((Boolean) proxy3.result).booleanValue();
                }
                return true;
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            public final boolean LIZ() {
                return z;
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            public final Class<? extends Widget> LJI() {
                return cls;
            }

            @Override // com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l
            public final ViewGroup LIZ(Context context) {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 5);
                if (proxy3.isSupported) {
                    return (ViewGroup) proxy3.result;
                }
                C106862S5w.LIZ(context);
                return C411292Pr.LIZ(this, context);
            }
        }, c4115c);
    }
}
