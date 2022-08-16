package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class EffectSDKBuildConfig {
    public static int ENABLE_LENS;
    public static int ENABLE_SPEECH_ASR;
    public static int ENABLE_SPEECH_CAPT;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static int ENABLE_IES_APPLOGGER = 1;
    public static int ENABLE_AUDIO_EFFECT = 1;
    public static int ENABLE_FFMPEG = 1;
    public static int ENABLE_BORINGSSL = 1;
    public static int ENABLE_JAZZ = 1;
    public static int ENABLE_VC0 = 1;
    public static int ENABLE_BYTEBENCH = 1;

    static {
        Covode.recordClassIndex(9512);
    }

    public static List<String> getEffectLibs() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        if (ENABLE_BYTEBENCH == 1) {
            arrayList.add("bytebench");
        }
        if (ENABLE_BORINGSSL == 1 || ENABLE_FFMPEG == 1) {
            arrayList.add("ttcrypto");
            arrayList.add("ttboringssl");
        }
        if (ENABLE_FFMPEG == 1) {
            arrayList.add("ttffmpeg");
        }
        if (ENABLE_IES_APPLOGGER == 1) {
            arrayList.add("iesapplogger");
        }
        arrayList.add("bytenn");
        if (ENABLE_AUDIO_EFFECT == 1) {
            arrayList.add("audioeffect");
        }
        if (ENABLE_SPEECH_CAPT == 1 || ENABLE_SPEECH_ASR == 1) {
            arrayList.add("speechsdk");
        }
        arrayList.add("gaia_lib");
        arrayList.add("AGFX");
        if (ENABLE_LENS == 1) {
            arrayList.add("lens");
        }
        if (ENABLE_JAZZ == 1) {
            arrayList.add("napi");
            arrayList.add("quick");
            arrayList.add("jazz");
        }
        if (ENABLE_VC0 == 1) {
            arrayList.add("bytevc0");
        }
        arrayList.add("effect");
        return arrayList;
    }
}
