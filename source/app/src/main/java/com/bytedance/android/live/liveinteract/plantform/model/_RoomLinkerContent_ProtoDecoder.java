package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.live.liveinteract.multianchor.model._AnchorLinkUser_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _RoomLinkerContent_ProtoDecoder implements AbstractC10531b<RoomLinkerContent> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29421);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final RoomLinkerContent mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (RoomLinkerContent) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static RoomLinkerContent decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (RoomLinkerContent) proxy.result;
        }
        RoomLinkerContent roomLinkerContent = new RoomLinkerContent();
        roomLinkerContent.linkedUsers = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                QV1.LJII(c10532g);
                            } else {
                                roomLinkerContent.isGuestAnchorBackground = (int) QV1.LIZJ(c10532g);
                            }
                        } else {
                            roomLinkerContent.anchorId = QV1.LIZJ(c10532g);
                        }
                    } else {
                        roomLinkerContent.roomLinkSilenceStatus = QV1.LIZIZ(c10532g);
                    }
                } else {
                    roomLinkerContent.linkedUsers.add(_AnchorLinkUser_ProtoDecoder.decodeStatic(c10532g));
                }
            } else {
                c10532g.LIZ(LIZ);
                return roomLinkerContent;
            }
        }
    }
}
