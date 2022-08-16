package com.bytedance.android.live.base.model.follow;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _ScheduledLiveItem_ProtoDecoder implements AbstractC10531b<ScheduledLiveItem> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14050);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ScheduledLiveItem mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ScheduledLiveItem) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ScheduledLiveItem decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ScheduledLiveItem) proxy.result;
        }
        ScheduledLiveItem scheduledLiveItem = new ScheduledLiveItem();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        scheduledLiveItem.userId = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        scheduledLiveItem.nextScheduledTime = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        scheduledLiveItem.lastFinishTime = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        scheduledLiveItem.avatar = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 5:
                        scheduledLiveItem.nickName = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        scheduledLiveItem.secUid = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        scheduledLiveItem.scheduledText = QV1.LJFF(c10532g);
                        break;
                    case 8:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 9:
                        scheduledLiveItem.announcementContent = QV1.LJFF(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return scheduledLiveItem;
            }
        }
    }
}
