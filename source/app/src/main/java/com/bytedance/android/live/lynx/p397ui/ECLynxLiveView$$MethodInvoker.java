package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.LynxUIMethodInvoker;
import p002O.C0002O;

/* renamed from: com.bytedance.android.live.lynx.ui.ECLynxLiveView$$MethodInvoker */
/* loaded from: classes10.dex */
public class ECLynxLiveView$$MethodInvoker implements LynxUIMethodInvoker<ECLynxLiveView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32297);
    }

    @Override // com.lynx.tasm.behavior.utils.LynxUIMethodInvoker
    public void invoke(ECLynxLiveView eCLynxLiveView, String str, ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{eCLynxLiveView, str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case -858075181:
                    if (str.equals("enterRoom")) {
                        eCLynxLiveView.enterRoom(readableMap);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        eCLynxLiveView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        eCLynxLiveView.play(readableMap);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        eCLynxLiveView.stop(readableMap);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        eCLynxLiveView.pause(readableMap);
                        return;
                    }
                    break;
                case 194959693:
                    if (str.equals("takeScreenshot")) {
                        eCLynxLiveView.takeScreenshot(readableMap, callback);
                        return;
                    }
                    break;
                case 851129563:
                    if (str.equals("sharePlayerToInner")) {
                        eCLynxLiveView.sharePlayerToInner();
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        eCLynxLiveView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        eCLynxLiveView.scrollIntoView(readableMap);
                        return;
                    }
                    break;
            }
            callback.invoke(3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(C0002O.m25084C("invokeMethod error: ", str, "\n", e.toString()));
        }
    }
}
