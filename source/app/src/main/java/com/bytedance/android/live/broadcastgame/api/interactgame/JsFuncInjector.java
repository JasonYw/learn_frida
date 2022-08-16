package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public interface JsFuncInjector {
    static {
        Covode.recordClassIndex(19108);
    }

    void LIZ();

    void LIZ(int i);

    void LIZ(C3383p c3383p);

    void LIZ(boolean z, Type type);

    void LIZJ();

    /* loaded from: classes5.dex */
    public enum Type {
        WMINI(-2),
        EFFECT(-3),
        LYNX_PANEL(-1),
        EFFECT_PANEL(-4);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Type) (proxy.isSupported ? proxy.result : Enum.valueOf(Type.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Type[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(19109);
        }

        Type(int i) {
            this.value = i;
        }
    }
}
