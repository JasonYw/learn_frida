package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.LynxUIMethodInvoker;
import p002O.C0002O;

/* renamed from: com.bytedance.android.live.lynx.ui.WebcastImage$$MethodInvoker */
/* loaded from: classes10.dex */
public class WebcastImage$$MethodInvoker implements LynxUIMethodInvoker<WebcastImage> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32391);
    }

    @Override // com.lynx.tasm.behavior.utils.LynxUIMethodInvoker
    public void invoke(WebcastImage webcastImage, String str, ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{webcastImage, str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case -2129856109:
                    if (str.equals("startAnim")) {
                        webcastImage.startAnim();
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        webcastImage.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 194959693:
                    if (str.equals("takeScreenshot")) {
                        webcastImage.takeScreenshot(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        webcastImage.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1714253107:
                    if (str.equals("stopAnim")) {
                        webcastImage.stopAnim();
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        webcastImage.scrollIntoView(readableMap);
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