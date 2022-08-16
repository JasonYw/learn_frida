package com.bytedance.android.live.base.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _ImageModel_ProtoDecoder implements AbstractC10531b<ImageModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13974);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ImageModel mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ImageModel decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.mUrls = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        imageModel.mUrls.add(QV1.LJFF(c10532g));
                        break;
                    case 2:
                        imageModel.mUri = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        imageModel.height = (int) QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        imageModel.width = (int) QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        imageModel.avgColor = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        imageModel.imageType = QV1.LIZIZ(c10532g);
                        break;
                    case 7:
                        imageModel.schema = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        imageModel.content = _ImageModel_Content_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 9:
                        imageModel.isAnimated = QV1.LIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return imageModel;
            }
        }
    }
}
