package com.bytedance.android.live.liveinteract.multianchor.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.plantform.model.MicPosTagInfo;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _AnchorLinkUser_ProtoDecoder implements AbstractC10531b<AnchorLinkUser> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28147);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final AnchorLinkUser mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AnchorLinkUser) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static AnchorLinkUser decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AnchorLinkUser) proxy.result;
        }
        AnchorLinkUser anchorLinkUser = new AnchorLinkUser();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 15) {
                    if (LIZIZ != 200) {
                        switch (LIZIZ) {
                            case 1:
                                anchorLinkUser.LIZIZ = _User_ProtoDecoder.decodeStatic(c10532g);
                                continue;
                            case 2:
                                anchorLinkUser.LIZJ = QV1.LIZJ(c10532g);
                                continue;
                            case 3:
                                anchorLinkUser.LIZLLL = QV1.LJFF(c10532g);
                                continue;
                            case 4:
                                anchorLinkUser.f26348LJ = QV1.LIZIZ(c10532g);
                                continue;
                            case 5:
                                anchorLinkUser.LJFF = QV1.LIZIZ(c10532g);
                                continue;
                            case 6:
                                anchorLinkUser.LJI = QV1.LIZIZ(c10532g);
                                continue;
                            case 7:
                                anchorLinkUser.LJII = QV1.LIZIZ(c10532g);
                                continue;
                            case 8:
                                anchorLinkUser.LJIIIIZZ = QV1.LIZJ(c10532g);
                                continue;
                            case 9:
                                anchorLinkUser.LJIIIZ = QV1.LIZJ(c10532g);
                                continue;
                            case 10:
                                anchorLinkUser.LJIIJ = QV1.LIZIZ(c10532g);
                                continue;
                            case 11:
                                anchorLinkUser.LJIJI = _ListUserContent_ProtoDecoder.decodeStatic(c10532g);
                                continue;
                            case 12:
                                anchorLinkUser.LJIIJJI = (int) QV1.LIZJ(c10532g);
                                continue;
                            case 13:
                                anchorLinkUser.LJIIL = (int) QV1.LIZJ(c10532g);
                                continue;
                            default:
                                QV1.LJII(c10532g);
                                continue;
                        }
                    } else {
                        anchorLinkUser.LJIJ = QV1.LJFF(c10532g);
                    }
                } else {
                    anchorLinkUser.LJIJJ = new MicPosTagInfo(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return anchorLinkUser;
            }
        }
    }
}
