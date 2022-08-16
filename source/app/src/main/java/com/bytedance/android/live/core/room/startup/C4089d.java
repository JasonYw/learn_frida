package com.bytedance.android.live.core.room.startup;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C116971W2r;
import p003X.GQX;
import p003X.RejectedExecutionHandlerC76763GOf;

/* renamed from: com.bytedance.android.live.core.room.startup.d */
/* loaded from: classes2.dex */
public final class C4089d {
    public static final int LJFF;
    public static final int LJI;
    public static final int LJII;
    public ThreadPoolExecutor LIZ;
    public ExecutorService LIZIZ;

    /* renamed from: LJ */
    public final RejectedExecutionHandler f26183LJ = RejectedExecutionHandlerC76763GOf.LIZIZ;
    public static final GQX LIZLLL = new GQX((byte) 0);
    public static final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(ExecutorManager$Companion$instance$2.INSTANCE);

    static {
        Covode.recordClassIndex(23599);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        LJFF = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        LJI = max;
        LJII = (max * 2) + 1;
    }

    public C4089d() {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(LJI, LJII, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), Executors.defaultThreadFactory(), this.f26183LJ);
        C116971W2r.LIZ((ThreadPoolExecutor) pThreadPoolExecutor, true);
        this.LIZ = pThreadPoolExecutor;
        ExecutorService LIZIZ = C116971W2r.LIZIZ(Executors.defaultThreadFactory());
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        this.LIZIZ = LIZIZ;
    }
}
