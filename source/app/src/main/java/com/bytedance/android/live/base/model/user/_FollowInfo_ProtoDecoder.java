package com.bytedance.android.live.base.model.user;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _FollowInfo_ProtoDecoder implements AbstractC10531b<FollowInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14220);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final FollowInfo mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (FollowInfo) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static FollowInfo decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (FollowInfo) proxy.result;
        }
        FollowInfo followInfo = new FollowInfo();
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
                                    followInfo.remarkName = QV1.LJFF(c10532g);
                                }
                            } else {
                                followInfo.pushStatus = QV1.LIZJ(c10532g);
                            }
                        } else {
                            followInfo.followStatus = QV1.LIZJ(c10532g);
                        }
                    } else {
                        followInfo.followerCount = QV1.LIZJ(c10532g);
                    }
                } else {
                    followInfo.followingCount = QV1.LIZJ(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return followInfo;
            }
        }
    }
}
