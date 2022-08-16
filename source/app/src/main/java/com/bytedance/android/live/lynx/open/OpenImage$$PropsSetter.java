package com.bytedance.android.live.lynx.open;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.StylesDiffMap;
import com.lynx.tasm.behavior.p1543ui.LynxBaseUI;
import com.lynx.tasm.p1544ui.image.UIImage$$PropsSetter;

/* loaded from: classes10.dex */
public class OpenImage$$PropsSetter extends UIImage$$PropsSetter {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32253);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage$$PropsSetter, com.lynx.tasm.behavior.p1543ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, StylesDiffMap stylesDiffMap) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI, str, stylesDiffMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        OpenImage openImage = (OpenImage) lynxBaseUI;
        if (str.hashCode() == 371164613 && str.equals("fade-duration")) {
            openImage.setFadeDuration(stylesDiffMap.getInt(str, 0));
        } else {
            super.setProperty(lynxBaseUI, str, stylesDiffMap);
        }
    }
}
