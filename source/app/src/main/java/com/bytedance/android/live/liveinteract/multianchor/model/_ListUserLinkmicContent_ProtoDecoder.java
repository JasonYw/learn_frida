package com.bytedance.android.live.liveinteract.multianchor.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _ListUserLinkmicContent_ProtoDecoder implements AbstractC10531b<ListUserLinkmicContent> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28152);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ListUserLinkmicContent mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ListUserLinkmicContent) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ListUserLinkmicContent decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ListUserLinkmicContent) proxy.result;
        }
        ListUserLinkmicContent listUserLinkmicContent = new ListUserLinkmicContent();
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
                                    listUserLinkmicContent.LJFF = QV1.LJFF(c10532g);
                                }
                            } else {
                                listUserLinkmicContent.f26351LJ = QV1.LJFF(c10532g);
                            }
                        } else {
                            listUserLinkmicContent.LIZLLL = QV1.LIZIZ(c10532g);
                        }
                    } else {
                        listUserLinkmicContent.LIZJ = QV1.LIZ(c10532g);
                    }
                } else {
                    listUserLinkmicContent.LIZIZ = QV1.LIZJ(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return listUserLinkmicContent;
            }
        }
    }
}
