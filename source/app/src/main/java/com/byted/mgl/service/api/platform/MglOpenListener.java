package com.byted.mgl.service.api.platform;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.core.BdpError;
import com.bytedance.minigame.bdpbase.core.IBdpAppInstance;
import com.bytedance.minigame.bdpbase.core.MglOpenParams;

/* loaded from: classes26.dex */
public interface MglOpenListener {
    static {
        Covode.recordClassIndex(9795);
    }

    void onAppError(BdpError bdpError);

    boolean onAppFallback(String str);

    void onAppFinish(int i);

    void onCustomEvent(String str, Bundle bundle);

    void onLaunchFinish(IBdpAppInstance iBdpAppInstance);

    void onLaunchStart(String str);

    void onLoadPackageSuccess();

    void onMetaReady();

    void onPackageDownloadProgress(int i);

    void onPackageDownloadSuccess();

    void onPackageInstallSuccess();

    MglOpenParams onPluginInstalled(MglOpenParams mglOpenParams);

    void onPrepareLoadPackage();
}
