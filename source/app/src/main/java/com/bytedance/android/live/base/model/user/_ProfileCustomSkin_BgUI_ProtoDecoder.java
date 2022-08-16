package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._FlexImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.ProfileCustomSkin;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _ProfileCustomSkin_BgUI_ProtoDecoder implements AbstractC10531b<ProfileCustomSkin.BgUI> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14235);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ProfileCustomSkin.BgUI mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProfileCustomSkin.BgUI) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ProfileCustomSkin.BgUI decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ProfileCustomSkin.BgUI) proxy.result;
        }
        ProfileCustomSkin.BgUI bgUI = new ProfileCustomSkin.BgUI();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                if (LIZIZ != 5) {
                                    QV1.LJII(c10532g);
                                } else {
                                    bgUI.dividerColor = QV1.LJFF(c10532g);
                                }
                            } else {
                                bgUI.bgColor = _ProfileCustomSkin_GradientColor_ProtoDecoder.decodeStatic(c10532g);
                            }
                        } else {
                            bgUI.rightBottomImage = _FlexImageModel_ProtoDecoder.decodeStatic(c10532g);
                        }
                    } else {
                        bgUI.topBorder = _FlexImageModel_ProtoDecoder.decodeStatic(c10532g);
                    }
                } else {
                    bgUI.cardBg = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return bgUI;
            }
        }
    }
}
