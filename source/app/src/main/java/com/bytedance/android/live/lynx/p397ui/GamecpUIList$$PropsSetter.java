package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.StylesDiffMap;
import com.lynx.tasm.behavior.p1543ui.LynxBaseUI;
import com.lynx.tasm.behavior.p1543ui.list.UIList$$PropsSetter;

/* renamed from: com.bytedance.android.live.lynx.ui.GamecpUIList$$PropsSetter */
/* loaded from: classes10.dex */
public class GamecpUIList$$PropsSetter extends UIList$$PropsSetter {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32320);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.list.UIList$$PropsSetter, com.lynx.tasm.behavior.p1543ui.list.AbsLynxList$$PropsSetter, com.lynx.tasm.behavior.p1543ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p1543ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, StylesDiffMap stylesDiffMap) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI, str, stylesDiffMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        super.setProperty(lynxBaseUI, str, stylesDiffMap);
    }
}