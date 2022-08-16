package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.random.Random;

/* loaded from: classes23.dex */
public final class IdGenerator {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final IdGenerator INSTANCE = new IdGenerator();
    public static final AtomicLong idCounter = new AtomicLong(0);

    static {
        Covode.recordClassIndex(3428);
    }

    private final long genInc() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return idCounter.getAndAdd(1L);
    }

    private final long genRandom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return Random.Default.nextLong(4611686018427387904L, Long.MAX_VALUE);
    }

    public final long gen(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (i != 0) {
            if (i == 1) {
                return genInc();
            }
            throw new IllegalArgumentException("unsupported mode:" + i);
        }
        return genRandom();
    }

    public static /* synthetic */ long gen$default(IdGenerator idGenerator, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{idGenerator, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return idGenerator.gen(i);
    }
}
