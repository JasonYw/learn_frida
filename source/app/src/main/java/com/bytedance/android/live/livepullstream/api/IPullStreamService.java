package com.bytedance.android.live.livepullstream.api;

import android.content.Context;
import com.bytedance.android.livesdkapi.roomplayer.AbstractC9685d;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC102354QSm;
import p003X.AbstractC408932Gp;
import p003X.PWX;

/* loaded from: classes12.dex */
public interface IPullStreamService extends AbstractC102354QSm {
    static {
        Covode.recordClassIndex(32107);
    }

    PWX getLivePlayerOptimizer();

    AbstractC408932Gp getLiveStatusErrorView(Context context, AbstractC9685d abstractC9685d);

    int loadLibrary(String str);

    void tryInstallPullStreamPlugin();
}
