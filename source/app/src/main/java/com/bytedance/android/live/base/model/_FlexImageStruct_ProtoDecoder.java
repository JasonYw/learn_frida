package com.bytedance.android.live.base.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _FlexImageStruct_ProtoDecoder implements AbstractC10531b<FlexImageStruct> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13972);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final FlexImageStruct mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (FlexImageStruct) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static FlexImageStruct decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (FlexImageStruct) proxy.result;
        }
        FlexImageStruct flexImageStruct = new FlexImageStruct();
        flexImageStruct.flexSetting = new ArrayList();
        flexImageStruct.urlList = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            QV1.LJII(c10532g);
                        } else {
                            flexImageStruct.flexSetting.add(Long.valueOf(QV1.LIZJ(c10532g)));
                        }
                    } else {
                        flexImageStruct.uri = QV1.LJFF(c10532g);
                    }
                } else {
                    flexImageStruct.urlList.add(QV1.LJFF(c10532g));
                }
            } else {
                c10532g.LIZ(LIZ);
                return flexImageStruct;
            }
        }
    }
}
