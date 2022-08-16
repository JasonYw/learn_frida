package com.bytedance.android.live.effect.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.EnumMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C86691KEb;
import p003X.C86726KFk;

/* loaded from: classes5.dex */
public final class LiveEffectContextFactory {
    public static ChangeQuickRedirect LIZ;
    public static final LiveEffectContextFactory LIZIZ = new LiveEffectContextFactory();
    public static final Map<Type, C4173o> LIZJ = new EnumMap(Type.class);
    public static final Map<Type, AbstractC4169j> LIZLLL = new EnumMap(Type.class);

    /* renamed from: LJ */
    public static final Map<Type, AbstractC4172k> f26210LJ = new EnumMap(Type.class);

    static {
        Covode.recordClassIndex(24293);
    }

    /* loaded from: classes5.dex */
    public enum Type {
        DEFAULT("live_composer.db", null),
        LINK("live_composer_link.db", "tt_live_sdk_effect_link"),
        GIFT("live_composer_gift.db", "ttlive_sdk_effect_gift"),
        DIGIT_AVATAR("live_composer_digit_avatar.db", "ttlive_sdk_effect_digit_avatar");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String dbName;
        public final String spName;

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
            Covode.recordClassIndex(24294);
        }

        Type(String str, String str2) {
            this.dbName = str;
            this.spName = str2;
        }
    }

    public final C4173o LIZ(Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C4173o) proxy.result;
        }
        C106862S5w.LIZ(type);
        if (!LIZJ.containsKey(type) || LIZJ.get(type) == null) {
            LIZJ.put(type, new C4173o(type));
        }
        C4173o c4173o = LIZJ.get(type);
        Intrinsics.checkNotNull(c4173o);
        return c4173o;
    }

    public final AbstractC4169j LIZIZ(Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC4169j) proxy.result;
        }
        C106862S5w.LIZ(type);
        if (!LIZLLL.containsKey(type) || LIZLLL.get(type) == null) {
            LIZLLL.put(type, new C86726KFk(type));
        }
        AbstractC4169j abstractC4169j = LIZLLL.get(type);
        Intrinsics.checkNotNull(abstractC4169j);
        return abstractC4169j;
    }

    public final AbstractC4172k LIZJ(Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC4172k) proxy.result;
        }
        C106862S5w.LIZ(type);
        if (!f26210LJ.containsKey(type) || f26210LJ.get(type) == null) {
            f26210LJ.put(type, new C86691KEb(type));
        }
        AbstractC4172k abstractC4172k = f26210LJ.get(type);
        Intrinsics.checkNotNull(abstractC4172k);
        return abstractC4172k;
    }
}
