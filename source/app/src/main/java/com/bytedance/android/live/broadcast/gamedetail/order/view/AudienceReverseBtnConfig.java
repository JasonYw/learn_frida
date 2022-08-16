package com.bytedance.android.live.broadcast.gamedetail.order.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.NoWhenBranchMatchedException;
import p003X.AbstractC450853sN;
import p003X.C106862S5w;
import p003X.LBJ;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudienceReverseBtnConfig implements AbstractC450853sN {
    public static ChangeQuickRedirect LIZ;
    public final State LIZIZ;

    /* loaded from: classes5.dex */
    public enum State {
        IMMEDIATE_RESERVE,
        IMMEDIATE_RESERVE_HAS_PACKAGE,
        CANCEL_RESERVE,
        CANCEL_RESERVE_CARD;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16536);
        }

        public static State valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (State) (proxy.isSupported ? proxy.result : Enum.valueOf(State.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static State[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (State[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(16535);
    }

    public AudienceReverseBtnConfig(State state) {
        C106862S5w.LIZ(state);
        this.LIZIZ = state;
    }

    @Override // p003X.AbstractC450853sN
    public final String LIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(context);
        int i = LBJ.LIZ[this.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return "已预约";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "立即预约";
    }

    @Override // p003X.AbstractC450853sN
    public final Drawable LIZLLL(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Drawable) proxy.result;
        }
        C106862S5w.LIZ(context);
        if (LBJ.LIZLLL[this.LIZIZ.ordinal()] != 1) {
            return null;
        }
        return LK5.LIZJ(2130856313);
    }

    @Override // p003X.AbstractC450853sN
    public final Drawable LIZIZ(Context context) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Drawable) proxy.result;
        }
        C106862S5w.LIZ(context);
        int i2 = LBJ.LIZIZ[this.LIZIZ.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    i = 2130852755;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 2130852746;
            }
        } else {
            i = 2130852731;
        }
        return LK5.LIZJ(i);
    }

    @Override // p003X.AbstractC450853sN
    public final int LIZJ(Context context) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(context);
        int i2 = LBJ.LIZJ[this.LIZIZ.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2131624626;
        } else {
            i = 2131626090;
        }
        return LK5.LIZIZ(i);
    }
}
