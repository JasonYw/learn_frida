package com.bytedance.android.live.player.api;

import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Constructor;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public final class LivePlayer {
    public static ChangeQuickRedirect LIZ;
    public static final LivePlayer LIZIZ = new LivePlayer();
    public static ILivePlayerService LIZJ;

    static {
        Covode.recordClassIndex(32830);
    }

    @JvmStatic
    public static final ILivePlayerService playerService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (ILivePlayerService) proxy.result;
        }
        if (LIZJ == null) {
            LIZJ = (ILivePlayerService) LIZIZ.LIZ("com.bytedance.android.livesdk.player.LivePlayerService");
        }
        ILivePlayerService iLivePlayerService = LIZJ;
        Intrinsics.checkNotNull(iLivePlayerService);
        return iLivePlayerService;
    }

    private final <T> T LIZ(String str) {
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        try {
            Class LIZ2 = C116971W2r.LIZ(str);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{LIZ2}, this, LIZ, false, 3);
            if (proxy2.isSupported) {
                return (T) proxy2.result;
            }
            Constructor<?>[] declaredConstructors = LIZ2.getDeclaredConstructors();
            if (declaredConstructors != null && declaredConstructors.length != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Constructor<?> constructor = declaredConstructors[0];
                Intrinsics.checkNotNullExpressionValue(constructor, "");
                constructor.setAccessible(true);
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length != 0) {
                    throw new ClassNotFoundException("not found " + LIZ2.getSimpleName());
                }
                return (T) constructor.newInstance(new Object[0]);
            }
            throw new IllegalArgumentException(("Can't get even one available constructor for " + LIZ2).toString());
        } catch (Exception unused) {
            return null;
        }
    }
}
