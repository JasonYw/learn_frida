package com.bytedance.android.live.misc;

import com.bytedance.android.livesdk.init.EffectUpdateTask;
import com.bytedance.android.livesdk.init.GeckoInitTask;
import com.bytedance.android.livesdk.init.I18nInitTask;
import com.bytedance.android.livesdk.init.IMProxyInitTask;
import com.bytedance.android.livesdk.init.InternalServiceInitTask;
import com.bytedance.android.livesdk.init.LightenInitTask;
import com.bytedance.android.livesdk.init.LynxInitTask;
import com.bytedance.android.livesdk.init.MessageZstdInitTask;
import com.bytedance.android.livesdk.init.MonitorInitTask;
import com.bytedance.android.livesdk.init.ProtoDecoderInjectTask;
import com.bytedance.android.livesdk.init.TaskManagerInitTask;
import com.bytedance.android.livesdk.init.UplinkInitTask;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C88355Krd;

/* loaded from: classes5.dex */
public class LiveTask$$livesdk {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32519);
    }

    public static void registerTask() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        C88355Krd.LIZ().LIZ(6, new GeckoInitTask());
        C88355Krd.LIZ().LIZ(10, new LynxInitTask());
        C88355Krd.LIZ().LIZ(2, new InternalServiceInitTask());
        C88355Krd.LIZ().LIZ(4, new TaskManagerInitTask());
        C88355Krd.LIZ().LIZ(7, new ProtoDecoderInjectTask());
        C88355Krd.LIZ().LIZ(8, new LightenInitTask());
        C88355Krd.LIZ().LIZ(3, new MonitorInitTask());
        C88355Krd.LIZ().LIZ(1, new I18nInitTask());
        C88355Krd.LIZ().LIZ(11, new MessageZstdInitTask());
        C88355Krd.LIZ().LIZ(12, new EffectUpdateTask());
        C88355Krd.LIZ().LIZ(13, new IMProxyInitTask());
        C88355Krd.LIZ().LIZ(14, new UplinkInitTask());
    }
}
