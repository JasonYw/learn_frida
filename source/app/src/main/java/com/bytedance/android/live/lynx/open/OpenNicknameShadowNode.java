package com.bytedance.android.live.lynx.open;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;

/* loaded from: classes10.dex */
public final class OpenNicknameShadowNode extends TextShadowNode {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32271);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final boolean isBoringSpan() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r0 == null) goto L20;
     */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void appendText(android.text.SpannableStringBuilder r5, com.lynx.tasm.behavior.shadow.text.RawTextShadowNode r6) {
        /*
            r4 = this;
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r5
            r1 = 1
            r3[r1] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.lynx.open.OpenNicknameShadowNode.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r0, r2, r1)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L14
            return
        L14:
            if (r6 == 0) goto L3d
            java.lang.String r0 = r6.getText()
            if (r0 == 0) goto L3d
            java.lang.Class<com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService> r0 = com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService.class
            com.bytedance.android.live.base.IService r2 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService r2 = (com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService) r2
            java.lang.String r1 = ""
            if (r2 == 0) goto L37
            if (r6 == 0) goto L30
            java.lang.String r0 = r6.getText()
            if (r0 != 0) goto L31
        L30:
            r0 = r1
        L31:
            java.lang.String r0 = r2.decryptUserInfo(r0)
            if (r0 != 0) goto L38
        L37:
            r0 = r1
        L38:
            if (r5 == 0) goto L3d
            r5.append(r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.lynx.open.OpenNicknameShadowNode.appendText(android.text.SpannableStringBuilder, com.lynx.tasm.behavior.shadow.text.RawTextShadowNode):void");
    }
}
