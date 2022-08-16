package com.bytedance.android.live.base.model.user;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _BroadcastConfig_ProtoDecoder implements AbstractC10531b<BroadcastConfig> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14214);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final BroadcastConfig mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (BroadcastConfig) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static BroadcastConfig decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (BroadcastConfig) proxy.result;
        }
        BroadcastConfig broadcastConfig = new BroadcastConfig();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        broadcastConfig.scheduledMasterSwitch = QV1.LIZIZ(c10532g);
                        break;
                    case 2:
                        broadcastConfig.scheduledProfileSwitch = QV1.LIZIZ(c10532g);
                        break;
                    case 3:
                        broadcastConfig.scheduledTime = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        broadcastConfig.scheduledDays = QV1.LIZIZ(c10532g);
                        break;
                    case 5:
                        broadcastConfig.scheduledTimeText = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        broadcastConfig.scheduledNoticeSwitchDisplay = QV1.LIZIZ(c10532g);
                        break;
                    case 7:
                        broadcastConfig.scheduledNoticeSwitch = QV1.LIZIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return broadcastConfig;
            }
        }
    }
}
