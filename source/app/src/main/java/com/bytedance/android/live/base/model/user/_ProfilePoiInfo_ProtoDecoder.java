package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _ProfilePoiInfo_ProtoDecoder implements AbstractC10531b<ProfilePoiInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14246);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ProfilePoiInfo mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProfilePoiInfo) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ProfilePoiInfo decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ProfilePoiInfo) proxy.result;
        }
        ProfilePoiInfo profilePoiInfo = new ProfilePoiInfo();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        profilePoiInfo.poiPermission = QV1.LIZ(c10532g);
                        break;
                    case 2:
                        profilePoiInfo.poiId = QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        profilePoiInfo.poiName = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        profilePoiInfo.poiIdStr = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        profilePoiInfo.content = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        profilePoiInfo.city = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        profilePoiInfo.icon = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 8:
                        profilePoiInfo.jumpSchema = QV1.LJFF(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return profilePoiInfo;
            }
        }
    }
}
