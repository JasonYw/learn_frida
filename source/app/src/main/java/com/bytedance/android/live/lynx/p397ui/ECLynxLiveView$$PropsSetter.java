package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter;

/* renamed from: com.bytedance.android.live.lynx.ui.ECLynxLiveView$$PropsSetter */
/* loaded from: classes19.dex */
public class ECLynxLiveView$$PropsSetter extends LynxUI$$PropsSetter {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32298);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0044, code lost:
        if (r6.equals("liveData") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
        if (r6.equals("objectfit") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0064, code lost:
        if (r6.equals("poster") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0074, code lost:
        if (r6.equals("qualities") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
        if (r6.equals("room-id") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
        if (r6.equals("streamData") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a4, code lost:
        if (r6.equals("volume") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p1543ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setProperty(com.lynx.tasm.behavior.p1543ui.LynxBaseUI r5, java.lang.String r6, com.lynx.tasm.behavior.StylesDiffMap r7) {
        /*
            r4 = this;
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r5
            r1 = 1
            r2[r1] = r6
            r0 = 2
            r2[r0] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.lynx.p397ui.ECLynxLiveView$$PropsSetter.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r0, r3, r1)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L17
            return
        L17:
            r1 = r5
            com.bytedance.android.live.lynx.ui.ECLynxLiveView r1 = (com.bytedance.android.live.lynx.p397ui.ECLynxLiveView) r1
            r0 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1785664369: goto L26;
                case -1489589134: goto L4e;
                case -1247523363: goto L6e;
                case -1195248822: goto L8e;
                case -982450867: goto L5e;
                case -810883302: goto L9e;
                case 3363353: goto L30;
                case 1379844941: goto L7e;
                case 1417199286: goto L3e;
                default: goto L22;
            }
        L22:
            super.setProperty(r5, r6, r7)
            return
        L26:
            java.lang.String r0 = "share-player"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
            r0 = 6
            goto L39
        L30:
            java.lang.String r0 = "mute"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
            r0 = 1
        L39:
            r2 = 0
            switch(r0) {
                case 0: goto L46;
                case 1: goto Laf;
                case 2: goto L56;
                case 3: goto L66;
                case 4: goto L76;
                case 5: goto L86;
                case 6: goto Lc1;
                case 7: goto L96;
                case 8: goto La6;
                default: goto L3d;
            }
        L3d:
            goto L22
        L3e:
            java.lang.String r0 = "liveData"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
        L46:
            java.lang.String r0 = r7.getString(r6)
            r1.setLiveData(r0)
            return
        L4e:
            java.lang.String r0 = "objectfit"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
        L56:
            java.lang.String r0 = r7.getString(r6)
            r1.setObjectfit(r0)
            return
        L5e:
            java.lang.String r0 = "poster"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
        L66:
            java.lang.String r0 = r7.getString(r6)
            r1.setPoster(r0)
            return
        L6e:
            java.lang.String r0 = "qualities"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
        L76:
            java.lang.String r0 = r7.getString(r6)
            r1.setQualities(r0)
            return
        L7e:
            java.lang.String r0 = "room-id"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
        L86:
            java.lang.String r0 = r7.getString(r6)
            r1.setRoomId(r0)
            return
        L8e:
            java.lang.String r0 = "streamData"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
        L96:
            java.lang.String r0 = r7.getString(r6)
            r1.setStreamData(r0)
            return
        L9e:
            java.lang.String r0 = "volume"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
        La6:
            r0 = 0
            float r0 = r7.getFloat(r6, r0)
            r1.setVolume(r0)
            return
        Laf:
            boolean r0 = r7.isNull(r6)
            if (r0 != 0) goto Lbd
            boolean r0 = r7.getBoolean(r6, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        Lbd:
            r1.setMute(r2)
            return
        Lc1:
            boolean r0 = r7.isNull(r6)
            if (r0 != 0) goto Lcf
            boolean r0 = r7.getBoolean(r6, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        Lcf:
            r1.setSharePlayer(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.lynx.p397ui.ECLynxLiveView$$PropsSetter.setProperty(com.lynx.tasm.behavior.ui.LynxBaseUI, java.lang.String, com.lynx.tasm.behavior.StylesDiffMap):void");
    }
}
