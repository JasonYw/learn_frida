package com.bytedance.android.live.core.resources;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _ResourceH265Model_ProtoDecoder implements AbstractC10531b<ResourceH265Model> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23585);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ResourceH265Model mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ResourceH265Model) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ResourceH265Model decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ResourceH265Model) proxy.result;
        }
        ResourceH265Model resourceH265Model = new ResourceH265Model();
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
                                    resourceH265Model.ttmd5 = QV1.LJFF(c10532g);
                                }
                            } else {
                                resourceH265Model.size = QV1.LJFF(c10532g);
                            }
                        } else {
                            resourceH265Model.md5 = QV1.LJFF(c10532g);
                        }
                    } else {
                        resourceH265Model.resourceModel = _ResourceModel_ProtoDecoder.decodeStatic(c10532g);
                    }
                } else {
                    resourceH265Model.resourceUri = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return resourceH265Model;
            }
        }
    }
}
