package com.bytedance.android.live.core.resources;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _AssetsModel_ProtoDecoder implements AbstractC10531b<AssetsModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23584);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final AssetsModel mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AssetsModel) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static AssetsModel decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AssetsModel) proxy.result;
        }
        AssetsModel assetsModel = new AssetsModel();
        assetsModel.modelRequirements = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        switch (LIZIZ) {
                            case 4:
                                assetsModel.resourceModel = _ResourceModel_ProtoDecoder.decodeStatic(c10532g);
                                continue;
                            case 5:
                                assetsModel.describe = QV1.LJFF(c10532g);
                                continue;
                            case 6:
                                assetsModel.f26179id = QV1.LIZJ(c10532g);
                                continue;
                            case 7:
                                assetsModel.resourceType = QV1.LIZIZ(c10532g);
                                continue;
                            case 8:
                                assetsModel.md5 = QV1.LJFF(c10532g);
                                continue;
                            case 9:
                                assetsModel.size = QV1.LIZJ(c10532g);
                                continue;
                            case 10:
                                assetsModel.lokiExtra = QV1.LJFF(c10532g);
                                continue;
                            default:
                                switch (LIZIZ) {
                                    case 26:
                                        assetsModel.downloadType = QV1.LIZIZ(c10532g);
                                        continue;
                                    case 27:
                                        assetsModel.modelRequirements.add(QV1.LJFF(c10532g));
                                        continue;
                                    case 28:
                                        assetsModel.h265ResourceModel = _ResourceH265Model_ProtoDecoder.decodeStatic(c10532g);
                                        continue;
                                    case 29:
                                        assetsModel.lynxSchema = QV1.LJFF(c10532g);
                                        continue;
                                    case 30:
                                        assetsModel.h265SuperResourceModel = _ResourceH265SuperModel_ProtoDecoder.decodeStatic(c10532g);
                                        continue;
                                        continue;
                                    default:
                                        QV1.LJII(c10532g);
                                        continue;
                                }
                        }
                    } else {
                        assetsModel.resourceUri = QV1.LJFF(c10532g);
                    }
                } else {
                    assetsModel.name = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return assetsModel;
            }
        }
    }
}
