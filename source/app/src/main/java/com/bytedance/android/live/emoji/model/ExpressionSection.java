package com.bytedance.android.live.emoji.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC91121Lv9;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public abstract class ExpressionSection {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public AbstractC91121Lv9 LIZJ;

    /* loaded from: classes5.dex */
    public enum EnterType {
        CLICK,
        DRAW;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(24865);
        }

        public static EnterType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (EnterType) (proxy.isSupported ? proxy.result : Enum.valueOf(EnterType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnterType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (EnterType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(24864);
    }

    public abstract int LIZ();

    public void LIZ(EnterType enterType) {
        if (PatchProxy.proxy(new Object[]{enterType}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(enterType);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = z;
        if (z) {
            AbstractC91121Lv9 abstractC91121Lv9 = this.LIZJ;
            if (abstractC91121Lv9 != null) {
                abstractC91121Lv9.LIZ();
                return;
            }
            return;
        }
        AbstractC91121Lv9 abstractC91121Lv92 = this.LIZJ;
        if (abstractC91121Lv92 != null) {
            abstractC91121Lv92.LIZIZ();
        }
    }
}
