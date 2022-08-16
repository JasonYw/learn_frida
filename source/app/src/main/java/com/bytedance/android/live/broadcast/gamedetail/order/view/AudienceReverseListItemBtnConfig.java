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
import p003X.LBK;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudienceReverseListItemBtnConfig implements AbstractC450853sN {
    public static ChangeQuickRedirect LIZ;
    public final State LIZIZ;

    /* loaded from: classes5.dex */
    public enum State {
        IMMEDIATE_RESERVE,
        CANCEL_RESERVE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16538);
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
        Covode.recordClassIndex(16537);
    }

    @Override // p003X.AbstractC450853sN
    public final Drawable LIZLLL(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Drawable) proxy.result;
        }
        C106862S5w.LIZ(context);
        return null;
    }

    public AudienceReverseListItemBtnConfig(State state) {
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
        int i = LBK.LIZ[this.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "已预约";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "预约";
    }

    @Override // p003X.AbstractC450853sN
    public final Drawable LIZIZ(Context context) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Drawable) proxy.result;
        }
        C106862S5w.LIZ(context);
        int i2 = LBK.LIZIZ[this.LIZIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 2130852733;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 2130855107;
        }
        return LK5.LIZJ(i);
    }

    @Override // p003X.AbstractC450853sN
    public final int LIZJ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(context);
        int i = LBK.LIZJ[this.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return LK5.LIZIZ(2131626090);
    }
}
