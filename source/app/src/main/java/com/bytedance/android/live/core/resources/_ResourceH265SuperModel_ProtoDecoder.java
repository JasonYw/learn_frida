package com.bytedance.android.live.core.resources;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _ResourceH265SuperModel_ProtoDecoder implements AbstractC10531b<ResourceH265SuperModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23586);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ResourceH265SuperModel mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ResourceH265SuperModel) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ResourceH265SuperModel decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ResourceH265SuperModel) proxy.result;
        }
        ResourceH265SuperModel resourceH265SuperModel = new ResourceH265SuperModel();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            QV1.LJII(c10532g);
                        } else {
                            resourceH265SuperModel.md5 = QV1.LJFF(c10532g);
                        }
                    } else {
                        resourceH265SuperModel.resourceModel = _ResourceModel_ProtoDecoder.decodeStatic(c10532g);
                    }
                } else {
                    resourceH265SuperModel.resourceUri = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return resourceH265SuperModel;
            }
        }
    }
}
