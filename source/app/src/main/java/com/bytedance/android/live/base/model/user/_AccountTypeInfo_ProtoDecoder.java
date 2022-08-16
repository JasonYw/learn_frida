package com.bytedance.android.live.base.model.user;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class _AccountTypeInfo_ProtoDecoder implements AbstractC10531b<AccountTypeInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14199);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final AccountTypeInfo mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AccountTypeInfo) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static AccountTypeInfo decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AccountTypeInfo) proxy.result;
        }
        AccountTypeInfo accountTypeInfo = new AccountTypeInfo();
        accountTypeInfo.typeMap = new HashMap();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    long LIZ2 = c10532g.LIZ();
                    Long l = null;
                    Boolean bool = null;
                    while (true) {
                        int LIZIZ2 = c10532g.LIZIZ();
                        if (LIZIZ2 == -1) {
                            break;
                        } else if (LIZIZ2 != 1) {
                            if (LIZIZ2 == 2) {
                                bool = Boolean.valueOf(QV1.LIZ(c10532g));
                            }
                        } else {
                            l = Long.valueOf(QV1.LIZJ(c10532g));
                        }
                    }
                    c10532g.LIZ(LIZ2);
                    if (l != null) {
                        if (bool != null) {
                            accountTypeInfo.typeMap.put(l, bool);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c10532g.LIZ(LIZ);
                return accountTypeInfo;
            }
        }
    }
}
