package com.bytedance.android.live.lynx.open;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.LynxUIMethodInvoker;
import p002O.C0002O;

/* loaded from: classes10.dex */
public class OpenImage$$MethodInvoker implements LynxUIMethodInvoker<OpenImage> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32252);
    }

    @Override // com.lynx.tasm.behavior.utils.LynxUIMethodInvoker
    public void invoke(OpenImage openImage, String str, ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{openImage, str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        openImage.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 194959693:
                    if (str.equals("takeScreenshot")) {
                        openImage.takeScreenshot(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        openImage.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        openImage.scrollIntoView(readableMap);
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
