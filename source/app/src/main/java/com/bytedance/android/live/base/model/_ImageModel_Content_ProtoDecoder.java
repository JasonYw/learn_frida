package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _ImageModel_Content_ProtoDecoder implements AbstractC10531b<ImageModel.Content> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13973);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final ImageModel.Content mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ImageModel.Content) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static ImageModel.Content decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ImageModel.Content) proxy.result;
        }
        ImageModel.Content content = new ImageModel.Content();
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
                                content.accessibilityText = QV1.LJFF(c10532g);
                            }
                        } else {
                            content.level = QV1.LIZJ(c10532g);
                        }
                    } else {
                        content.fontColor = QV1.LJFF(c10532g);
                    }
                } else {
                    content.name = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return content;
            }
        }
    }
}
