package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.LynxUIMethodInvoker;
import p002O.C0002O;

/* renamed from: com.bytedance.android.live.lynx.ui.LiveLynxAlphaPlayer$$MethodInvoker */
/* loaded from: classes10.dex */
public class LiveLynxAlphaPlayer$$MethodInvoker implements LynxUIMethodInvoker<LiveLynxAlphaPlayer> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32326);
    }

    @Override // com.lynx.tasm.behavior.utils.LynxUIMethodInvoker
    public void invoke(LiveLynxAlphaPlayer liveLynxAlphaPlayer, String str, ReadableMap readableMap, Callback callback) {
        if (PatchProxy.proxy(new Object[]{liveLynxAlphaPlayer, str, readableMap, callback}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case -1073342556:
                    if (str.equals("isPlaying")) {
                        liveLynxAlphaPlayer.isPlaying(readableMap, callback);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        liveLynxAlphaPlayer.resume(readableMap, callback);
                        return;
                    }
                    break;
                case -407658560:
                    if (str.equals("unsubscribeUpdateEvent")) {
                        liveLynxAlphaPlayer.unsubscribeUpdateEvent(readableMap, callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        liveLynxAlphaPlayer.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        liveLynxAlphaPlayer.play(readableMap, callback);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        liveLynxAlphaPlayer.stop(readableMap, callback);
                        return;
                    }
                    break;
                case 47962023:
                    if (str.equals("subscribeUpdateEvent")) {
                        liveLynxAlphaPlayer.subscribeUpdateEvent(readableMap, callback);
                        return;
                    }
                    break;
                case 85887754:
                    if (str.equals("getDuration")) {
                        liveLynxAlphaPlayer.getDuration(readableMap, callback);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        liveLynxAlphaPlayer.pause(readableMap, callback);
                        return;
                    }
                    break;
                case 194959693:
                    if (str.equals("takeScreenshot")) {
                        liveLynxAlphaPlayer.takeScreenshot(readableMap, callback);
                        return;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        liveLynxAlphaPlayer.release(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        liveLynxAlphaPlayer.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        liveLynxAlphaPlayer.scrollIntoView(readableMap);
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
