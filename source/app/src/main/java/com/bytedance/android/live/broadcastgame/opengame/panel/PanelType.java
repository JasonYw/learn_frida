package com.bytedance.android.live.broadcastgame.opengame.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C88013Km7;
import p003X.C88018KmC;
import p003X.LK5;

/* loaded from: classes5.dex */
public enum PanelType {
    PANEL_TYPE_X_SCREEN_LOW("xscreen_low", LK5.LIZJ(), (int) ((LK5.LIZJ() * 0.736d) + LK5.LIZ(68.0f))),
    PANEL_TYPE_PORTRAIT("portrait", LK5.LIZJ(), LK5.LIZIZ()),
    PANEL_TYPE_X_SCREEN("xscreen", LK5.LIZJ(), C88018KmC.LIZIZ.LIZ()),
    PANEL_TYPE_LANDSCAPE("landscape", LK5.LIZIZ(), LK5.LIZJ());
    
    public static final C88013Km7 Companion = new C88013Km7((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public int height;
    public final String type;
    public int width;

    public static PanelType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (PanelType) (proxy.isSupported ? proxy.result : Enum.valueOf(PanelType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PanelType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (PanelType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(20778);
    }

    public final void LIZ(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    PanelType(String str, int i, int i2) {
        this.type = str;
        this.width = i;
        this.height = i2;
    }
}
