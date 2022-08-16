package com.bytedance.android.live.lynx.p397ui.p398vs;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.LynxUIMethodInvoker;
import p002O.C0002O;

/* renamed from: com.bytedance.android.live.lynx.ui.vs.VSLynxVideoView$$MethodInvoker */
/* loaded from: classes10.dex */
public class VSLynxVideoView$$MethodInvoker implements LynxUIMethodInvoker<VSLynxVideoView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32401);
    }

    @Override // com.lynx.tasm.behavior.utils.LynxUIMethodInvoker
    public void invoke(VSLynxVideoView vSLynxVideoView, String str, ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{vSLynxVideoView, str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case -858075181:
                    if (str.equals("enterRoom")) {
                        vSLynxVideoView.enterRoom();
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        vSLynxVideoView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3363353:
                    if (str.equals("mute")) {
                        vSLynxVideoView.mute(readableMap);
                        return;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        vSLynxVideoView.play();
                        return;
                    }
                    break;
                case 3526264:
                    if (str.equals("seek")) {
                        vSLynxVideoView.seek(readableMap);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        vSLynxVideoView.pause();
                        return;
                    }
                    break;
                case 194959693:
                    if (str.equals("takeScreenshot")) {
                        vSLynxVideoView.takeScreenshot(readableMap, callback);
                        return;
                    }
                    break;
                case 1352944342:
                    if (str.equals("finishedPay")) {
                        vSLynxVideoView.finishedPay();
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        vSLynxVideoView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        vSLynxVideoView.scrollIntoView(readableMap);
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
