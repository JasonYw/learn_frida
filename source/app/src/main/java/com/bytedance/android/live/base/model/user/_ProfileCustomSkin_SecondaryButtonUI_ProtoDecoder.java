package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.ProfileCustomSkin;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _ProfileCustomSkin_SecondaryButtonUI_ProtoDecoder implements AbstractC10531b<ProfileCustomSkin.SecondaryButtonUI> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14239);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ProfileCustomSkin.SecondaryButtonUI mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProfileCustomSkin.SecondaryButtonUI) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ProfileCustomSkin.SecondaryButtonUI decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ProfileCustomSkin.SecondaryButtonUI) proxy.result;
        }
        ProfileCustomSkin.SecondaryButtonUI secondaryButtonUI = new ProfileCustomSkin.SecondaryButtonUI();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            QV1.LJII(c10532g);
                        } else {
                            secondaryButtonUI.backgroundColor = QV1.LJFF(c10532g);
                        }
                    } else {
                        secondaryButtonUI.borderColor = QV1.LJFF(c10532g);
                    }
                } else {
                    secondaryButtonUI.iconColor = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return secondaryButtonUI;
            }
        }
    }
}