package com.bef.effectsdk;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class GPUProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Listener sListener;

    /* loaded from: classes10.dex */
    public interface Listener {
        static {
            Covode.recordClassIndex(9534);
        }

        void onMessageReceived(int i, int i2, int i3, String str);
    }

    static {
        Covode.recordClassIndex(9532);
    }

    public static void destroy() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        MessageCenter.destroy();
        sListener = null;
    }

    public static void init() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        MessageCenter.init();
        MessageCenter.setListener(new MessageCenter.Listener() { // from class: com.bef.effectsdk.GPUProcessor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9533);
            }

            @Override // com.bef.effectsdk.message.MessageCenter.Listener
            public final void onMessageReceived(int i, int i2, int i3, String str) {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 1).isSupported && GPUProcessor.sListener != null) {
                    GPUProcessor.sListener.onMessageReceived(i, i2, i3, str);
                }
            }
        });
    }

    public static void setListener(Listener listener) {
        sListener = listener;
    }
}
