package com.bytedance.android.live.base.model.user;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _BaseProfileInfo_ProtoDecoder implements AbstractC10531b<BaseProfileInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14212);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final BaseProfileInfo mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (BaseProfileInfo) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static BaseProfileInfo decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (BaseProfileInfo) proxy.result;
        }
        BaseProfileInfo baseProfileInfo = new BaseProfileInfo();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        baseProfileInfo.f25757id = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        baseProfileInfo.idStr = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        baseProfileInfo.secUid = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        baseProfileInfo.displayId = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        baseProfileInfo.nickName = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        baseProfileInfo.gender = QV1.LIZIZ(c10532g);
                        break;
                    case 7:
                        baseProfileInfo.signature = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        baseProfileInfo.avatarThumb = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 9:
                        baseProfileInfo.avatarMedium = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 10:
                        baseProfileInfo.avatarLarge = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 11:
                        baseProfileInfo.city = QV1.LJFF(c10532g);
                        break;
                    case 12:
                        baseProfileInfo.poiInfo = _ProfilePoiInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 13:
                        baseProfileInfo.secret = QV1.LIZIZ(c10532g);
                        break;
                    case 14:
                        baseProfileInfo.remarkName = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        baseProfileInfo.age = QV1.LIZIZ(c10532g);
                        break;
                    case 16:
                        baseProfileInfo.school = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        baseProfileInfo.locationCity = QV1.LJFF(c10532g);
                        break;
                    case 18:
                        baseProfileInfo.mysteryMan = QV1.LIZIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return baseProfileInfo;
            }
        }
    }
}
