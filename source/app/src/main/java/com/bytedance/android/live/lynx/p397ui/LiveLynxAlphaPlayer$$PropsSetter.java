package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.StylesDiffMap;
import com.lynx.tasm.behavior.p1543ui.LynxBaseUI;
import com.lynx.tasm.behavior.p1543ui.view.UISimpleView$$PropsSetter;

/* renamed from: com.bytedance.android.live.lynx.ui.LiveLynxAlphaPlayer$$PropsSetter */
/* loaded from: classes20.dex */
public class LiveLynxAlphaPlayer$$PropsSetter extends UISimpleView$$PropsSetter {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32327);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p1543ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, StylesDiffMap stylesDiffMap) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI, str, stylesDiffMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        LiveLynxAlphaPlayer liveLynxAlphaPlayer = (LiveLynxAlphaPlayer) lynxBaseUI;
        switch (str.hashCode()) {
            case -2133601602:
                if (str.equals("keep-last-frame")) {
                    liveLynxAlphaPlayer.setKeepLastFrame(stylesDiffMap.getBoolean(str, false));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    liveLynxAlphaPlayer.setPoster(stylesDiffMap.getString(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    liveLynxAlphaPlayer.setSrc(stylesDiffMap.getString(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    liveLynxAlphaPlayer.setLoop(stylesDiffMap.getBoolean(str, false));
                    return;
                }
                break;
            case 838895478:
                if (str.equals("last-frame")) {
                    liveLynxAlphaPlayer.setLastFrame(stylesDiffMap.getString(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    liveLynxAlphaPlayer.setAutoPlay(stylesDiffMap.getBoolean(str, true));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, stylesDiffMap);
    }
}
