package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.LynxUIMethodInvoker;
import p002O.C0002O;

/* renamed from: com.bytedance.android.live.lynx.ui.GamecpUIList$$MethodInvoker */
/* loaded from: classes10.dex */
public class GamecpUIList$$MethodInvoker implements LynxUIMethodInvoker<GamecpUIList> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32319);
    }

    @Override // com.lynx.tasm.behavior.utils.LynxUIMethodInvoker
    public void invoke(GamecpUIList gamecpUIList, String str, ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{gamecpUIList, str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case -980170895:
                    if (str.equals("scrollToPosition")) {
                        gamecpUIList.scrollToPosition(readableMap, callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        gamecpUIList.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 194959693:
                    if (str.equals("takeScreenshot")) {
                        gamecpUIList.takeScreenshot(readableMap, callback);
                        return;
                    }
                    break;
                case 1363070069:
                    if (str.equals("getVisibleCells")) {
                        gamecpUIList.getVisibleCells(callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        gamecpUIList.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        gamecpUIList.scrollIntoView(readableMap);
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
