package com.bytedance.android.live.lynx.p397ui.p398vs;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.StylesDiffMap;
import com.lynx.tasm.behavior.p1543ui.LynxBaseUI;
import com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter;

/* renamed from: com.bytedance.android.live.lynx.ui.vs.VSLynxVideoView$$PropsSetter */
/* loaded from: classes10.dex */
public class VSLynxVideoView$$PropsSetter extends LynxUI$$PropsSetter {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32402);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, StylesDiffMap stylesDiffMap) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI, str, stylesDiffMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        VSLynxVideoView vSLynxVideoView = (VSLynxVideoView) lynxBaseUI;
        switch (str.hashCode()) {
            case -1544438277:
                if (str.equals("episode")) {
                    vSLynxVideoView.setEpisode(stylesDiffMap.getString(str));
                    return;
                }
                break;
            case -1489589134:
                if (str.equals("objectfit")) {
                    vSLynxVideoView.setObjectFit(stylesDiffMap.getString(str));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    vSLynxVideoView.setPoster(stylesDiffMap.getString(str));
                    return;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    vSLynxVideoView.setLoop(stylesDiffMap.getBoolean(str, false));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    vSLynxVideoView.setMuted(stylesDiffMap.getBoolean(str, false));
                    return;
                }
                break;
            case 810277771:
                if (str.equals("startposition")) {
                    vSLynxVideoView.setStartPosition(stylesDiffMap.getInt(str, 0));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    vSLynxVideoView.setAutoPlay(stylesDiffMap.getBoolean(str, false));
                    return;
                }
                break;
            case 2019384140:
                if (str.equals("logextra")) {
                    vSLynxVideoView.setLogExtra(stylesDiffMap.getMap(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, stylesDiffMap);
    }
}
