package com.bytedance.android.live.liveinteract.multianchor.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _ListUserPKContent_ProtoDecoder implements AbstractC10531b<ListUserPKContent> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28153);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ListUserPKContent mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ListUserPKContent) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ListUserPKContent decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ListUserPKContent) proxy.result;
        }
        ListUserPKContent listUserPKContent = new ListUserPKContent();
        long LIZ = c10532g.LIZ();
        while (c10532g.LIZIZ() != -1) {
            QV1.LJII(c10532g);
        }
        c10532g.LIZ(LIZ);
        return listUserPKContent;
    }
}
