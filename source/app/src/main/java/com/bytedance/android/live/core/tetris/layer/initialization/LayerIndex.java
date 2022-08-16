package com.bytedance.android.live.core.tetris.layer.initialization;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum LayerIndex {
    INDEX_SERVICE(-1),
    INDEX_0(0),
    INDEX_1(1),
    INDEX_2(2),
    INDEX_3(3),
    INDEX_4(4),
    INDEX_5(5),
    INDEX_6(6),
    INDEX_7(7),
    INDEX_8(8),
    INDEX_9(9),
    INDEX_10(10),
    INDEX_11(11),
    INDEX_UNKNOWN(100);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int index;

    public static LayerIndex valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        return (LayerIndex) (proxy.isSupported ? proxy.result : Enum.valueOf(LayerIndex.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LayerIndex[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        return (LayerIndex[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    @Override // java.lang.Enum
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return String.valueOf(this.index);
    }

    static {
        Covode.recordClassIndex(23729);
    }

    LayerIndex(int i) {
        this.index = i;
    }
}
