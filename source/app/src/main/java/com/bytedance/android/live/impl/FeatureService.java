package com.bytedance.android.live.impl;

import android.os.Build;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveInitSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import p003X.AbstractC99972PYw;
import p003X.C3J9;
import p003X.C436983Qm;
import p003X.C95452Nio;
import p003X.PWW;
import p003X.QMG;
import p003X.QMH;
import p003X.QMJ;

/* loaded from: classes8.dex */
public class FeatureService implements PWW {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24983);
    }

    @Override // p003X.PWW
    public AbstractC99972PYw getFeatureManager() {
        return QMH.LIZLLL;
    }

    public FeatureService() {
        ServiceManager.registerService(PWW.class, this);
    }

    private final void addFeatureInterceptor() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported && LiveInitSettingKeys.get_LIVE_FEATURE_CONFIG().LIZIZ) {
            if (!PatchProxy.proxy(new Object[0], QMJ.LIZJ, QMJ.LIZ, false, 1).isSupported) {
                C95452Nio.m23163LJ().LJJIFFI().addLiveFeatureInterceptor(QMJ.LIZIZ);
            }
        }
    }

    @Override // p003X.PWW
    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        QMH qmh = QMH.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], qmh, QMH.LIZ, false, 11).isSupported) {
            ConcurrentHashMap<String, Object> LIZ = qmh.LIZ();
            LIZ.put("device_score", Float.valueOf(C436983Qm.LIZ(false)));
            LIZ.put("anchor_device_score", Float.valueOf(C436983Qm.LIZ(true)));
            LIZ.put("system_version", Integer.valueOf(Build.VERSION.SDK_INT));
        }
        C3J9.LIZ().post(QMG.LIZIZ);
        addFeatureInterceptor();
    }
}
