package com.bytedance.android.live.base.model.user;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class _ProfileSetting_ProtoDecoder implements AbstractC10531b<ProfileSetting> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14247);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ProfileSetting mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ProfileSetting) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ProfileSetting decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ProfileSetting) proxy.result;
        }
        ProfileSetting profileSetting = new ProfileSetting();
        profileSetting.styleTemplates = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        profileSetting.styleTemplates.add(_ProfileStyleTemplate_ProtoDecoder.decodeStatic(c10532g));
                    }
                } else {
                    profileSetting.showSetting = QV1.LIZJ(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return profileSetting;
            }
        }
    }
}
