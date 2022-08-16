package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.StylesDiffMap;
import com.lynx.tasm.behavior.p1543ui.LynxBaseUI;
import com.lynx.tasm.p1544ui.image.UIImage$$PropsSetter;

/* renamed from: com.bytedance.android.live.lynx.ui.EcomCustomUIImage$$PropsSetter */
/* loaded from: classes10.dex */
public class EcomCustomUIImage$$PropsSetter extends UIImage$$PropsSetter {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32315);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage$$PropsSetter, com.lynx.tasm.behavior.p1543ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, StylesDiffMap stylesDiffMap) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI, str, stylesDiffMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        EcomCustomUIImage ecomCustomUIImage = (EcomCustomUIImage) lynxBaseUI;
        if (str.hashCode() == 371164613 && str.equals("fade-duration")) {
            ecomCustomUIImage.setFadeDuration(stylesDiffMap.getInt(str, 0));
        } else {
            super.setProperty(lynxBaseUI, str, stylesDiffMap);
        }
    }
}
