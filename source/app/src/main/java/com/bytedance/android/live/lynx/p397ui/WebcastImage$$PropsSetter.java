package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.StylesDiffMap;
import com.lynx.tasm.behavior.p1543ui.LynxBaseUI;
import com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter;

/* renamed from: com.bytedance.android.live.lynx.ui.WebcastImage$$PropsSetter */
/* loaded from: classes10.dex */
public class WebcastImage$$PropsSetter extends LynxUI$$PropsSetter {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32392);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, StylesDiffMap stylesDiffMap) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI, str, stylesDiffMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        WebcastImage webcastImage = (WebcastImage) lynxBaseUI;
        int hashCode = str.hashCode();
        if (hashCode != 114148) {
            if (hashCode != 371164613) {
                if (hashCode == 1615004818 && str.equals("auto-play")) {
                    webcastImage.setAutoPlay(stylesDiffMap.getBoolean(str, false));
                    return;
                }
            } else if (str.equals("fade-duration")) {
                webcastImage.setFadeDuration(stylesDiffMap.getInt(str, 0));
                return;
            }
        } else if (str.equals("src")) {
            webcastImage.setSrc(stylesDiffMap.getString(str));
            return;
        }
        super.setProperty(lynxBaseUI, str, stylesDiffMap);
    }
}
