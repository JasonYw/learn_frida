package com.byted.mgl.service.api.optimize.cpu;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.service.IBdpService;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public interface IMglOptimizeCpuService extends IBdpService {
    static {
        Covode.recordClassIndex(9793);
    }

    void bindBigCore();

    void initCpuSetter(Context context, boolean z, ExecutorService executorService);

    void resetCoreBind();
}
