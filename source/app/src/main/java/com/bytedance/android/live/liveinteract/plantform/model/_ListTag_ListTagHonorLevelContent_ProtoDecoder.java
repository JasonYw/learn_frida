package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.liveinteract.plantform.model.ListTag;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _ListTag_ListTagHonorLevelContent_ProtoDecoder implements AbstractC10531b<ListTag.ListTagHonorLevelContent> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29419);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ListTag.ListTagHonorLevelContent mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ListTag.ListTagHonorLevelContent) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ListTag.ListTagHonorLevelContent decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ListTag.ListTagHonorLevelContent) proxy.result;
        }
        ListTag.ListTagHonorLevelContent listTagHonorLevelContent = new ListTag.ListTagHonorLevelContent();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    listTagHonorLevelContent.LIZIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return listTagHonorLevelContent;
            }
        }
    }
}
