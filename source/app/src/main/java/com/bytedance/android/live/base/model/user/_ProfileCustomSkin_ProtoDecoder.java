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
public final class _ProfileCustomSkin_ProtoDecoder implements AbstractC10531b<ProfileCustomSkin> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14238);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ProfileCustomSkin mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProfileCustomSkin) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ProfileCustomSkin decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ProfileCustomSkin) proxy.result;
        }
        ProfileCustomSkin profileCustomSkin = new ProfileCustomSkin();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    switch (LIZIZ) {
                        case MotionEventCompat.AXIS_HAT_X /* 15 */:
                            profileCustomSkin.bgSkin = _ProfileCustomSkin_BgUI_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 16:
                            profileCustomSkin.secondaryButtonSkin = _ProfileCustomSkin_SecondaryButtonUI_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                            profileCustomSkin.nickNameColor = _ProfileCustomSkin_GradientColor_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case 18:
                            profileCustomSkin.tagSkin = _ProfileCustomSkin_TagUI_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                            profileCustomSkin.followInfoColor = QV1.LJFF(c10532g);
                            continue;
                        case 20:
                            profileCustomSkin.signatureColor = QV1.LJFF(c10532g);
                            continue;
                        case 21:
                            profileCustomSkin.honorWallSkin = _ProfileCustomSkin_HonorWallUI_ProtoDecoder.decodeStatic(c10532g);
                            continue;
                        case MotionEventCompat.AXIS_GAS /* 22 */:
                            profileCustomSkin.avatarBorderDressId = QV1.LJFF(c10532g);
                            continue;
                        default:
                            QV1.LJII(c10532g);
                            continue;
                    }
                } else {
                    profileCustomSkin.avatarBorder = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return profileCustomSkin;
            }
        }
    }
}
