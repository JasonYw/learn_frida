package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class _AuthenticationInfo_ProtoDecoder implements AbstractC10531b<AuthenticationInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14209);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final AuthenticationInfo mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AuthenticationInfo) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static AuthenticationInfo decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AuthenticationInfo) proxy.result;
        }
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        authenticationInfo.levelList = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                if (LIZIZ != 10) {
                                    QV1.LJII(c10532g);
                                } else {
                                    authenticationInfo.accountTypeInfo = _AccountTypeInfo_ProtoDecoder.decodeStatic(c10532g);
                                }
                            } else {
                                authenticationInfo.levelList.add(Integer.valueOf(QV1.LIZIZ(c10532g)));
                            }
                        } else {
                            authenticationInfo.authenticationBadge = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        }
                    } else {
                        authenticationInfo.enterpriseVerifyReason = QV1.LJFF(c10532g);
                    }
                } else {
                    authenticationInfo.customVerify = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return authenticationInfo;
            }
        }
    }
}
