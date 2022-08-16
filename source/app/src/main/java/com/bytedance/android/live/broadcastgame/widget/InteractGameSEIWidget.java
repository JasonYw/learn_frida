package com.bytedance.android.live.broadcastgame.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameSEIWidget;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C35F;
import p003X.KWG;

/* loaded from: classes5.dex */
public final class InteractGameSEIWidget extends IInteractGameSEIWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public static final KWG LIZLLL = new KWG((byte) 0);
    public AbstractC5436a LIZJ;

    static {
        Covode.recordClassIndex(21822);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a188";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameSEIWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.LIZJ = null;
    }

    public InteractGameSEIWidget(AbstractC5436a abstractC5436a) {
        this.LIZJ = abstractC5436a;
    }

    public final void LIZ(boolean z) {
        C35F LIZ;
        C2WC<Boolean> LIZIZ2;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 4).isSupported && (LIZ = C35F.LIZJ.LIZ()) != null && (LIZIZ2 = LIZ.LIZIZ()) != null && LIZIZ2.LIZ().booleanValue() != z) {
            LIZIZ2.LIZ(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x003c, code lost:
        if (r9 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LIZ(org.json.JSONObject r9) {
        /*
            r8 = this;
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r4 = 0
            r2[r4] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.widget.InteractGameSEIWidget.LIZIZ
            r0 = 3
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1a:
            java.lang.String r3 = "extra"
            if (r9 == 0) goto L3a
            org.json.JSONObject r1 = r9.optJSONObject(r3)
            if (r1 == 0) goto L3b
            java.lang.String r0 = "iid"
            int r2 = r1.optInt(r0)
        L2a:
            org.json.JSONObject r1 = r9.optJSONObject(r3)
            if (r1 == 0) goto L3f
            java.lang.String r0 = "list"
            org.json.JSONArray r7 = r1.optJSONArray(r0)
        L36:
            if (r2 != 0) goto L41
            if (r7 != 0) goto L41
        L3a:
            return r5
        L3b:
            r2 = 0
            if (r9 == 0) goto L3f
            goto L2a
        L3f:
            r7 = 0
            goto L36
        L41:
            com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.EffectGame
            int r0 = r0.value
            if (r2 != r0) goto L88
            if (r7 == 0) goto L88
            r6 = 2
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r4] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2[r5] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.widget.InteractGameSEIWidget.LIZIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r5) goto L88
        L69:
            return r5
        L6a:
            int r0 = r7.length()
            if (r0 == 0) goto L88
            int r3 = r7.length()
            r2 = 0
        L75:
            if (r2 >= r3) goto L88
            java.lang.Object r1 = r7.get(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L69
            int r2 = r2 + 1
            goto L75
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.widget.InteractGameSEIWidget.LIZ(org.json.JSONObject):boolean");
    }
}
