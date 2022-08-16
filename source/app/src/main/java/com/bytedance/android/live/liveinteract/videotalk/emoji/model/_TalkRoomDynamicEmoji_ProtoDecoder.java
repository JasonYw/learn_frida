package com.bytedance.android.live.liveinteract.videotalk.emoji.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _TalkRoomDynamicEmoji_ProtoDecoder implements AbstractC10531b<C4929c> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30237);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C4929c mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C4929c) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C4929c decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C4929c) proxy.result;
        }
        C4929c c4929c = new C4929c();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c4929c.LIZJ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        c4929c.f26444LJ = QV1.LIZ(c10532g);
                        break;
                    case 3:
                        c4929c.LJFF = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 4:
                        c4929c.LJI = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 5:
                        c4929c.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        c4929c.LJII = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        c4929c.LJIIIIZZ = QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        c4929c.LJIIIZ = QV1.LIZIZ(c10532g);
                        break;
                    case 9:
                        c4929c.LJIIJJI = _TalkRoomEmojiPermission_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 10:
                        c4929c.LJIIJ = QV1.LJFF(c10532g);
                        break;
                    case 11:
                        c4929c.LJIILIIL = _TalkRoomInteractEmoji_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 12:
                        c4929c.LJIIL = QV1.LIZIZ(c10532g);
                        break;
                    case 13:
                        c4929c.LJIILJJIL = _TalkRoomDigitAvatarEmoji_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 14:
                        c4929c.LJIILL = QV1.LIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c4929c;
            }
        }
    }
}
