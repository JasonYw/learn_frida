package com.byted.mgl.service.util.privacy;

import com.byted.mgl.service.api.internal.AMglInvCallerService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.bdpbase.manager.BdpManager;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* loaded from: classes26.dex */
public final class PrivacyTokenUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final PrivacyTokenUtil INSTANCE = new PrivacyTokenUtil();
    public static final HashMap<String, String> mTokenMap = new HashMap<>();
    public static final Lazy mTokenMedia$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenMedia$2.INSTANCE);
    public static final Lazy mTokenAudio$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenAudio$2.INSTANCE);
    public static final Lazy mTokenCamera$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenCamera$2.INSTANCE);
    public static final Lazy mTokenClipboard$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenClipboard$2.INSTANCE);
    public static final Lazy mTokenDevice$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenDevice$2.INSTANCE);
    public static final Lazy mTokenLocation$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenLocation$2.INSTANCE);
    public static final Lazy mTokenPermit$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenPermit$2.INSTANCE);
    public static final Lazy mTokenInstaller$delegate = LazyKt__LazyJVMKt.lazy(PrivacyTokenUtil$mTokenInstaller$2.INSTANCE);

    private final String getMTokenAudio() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return (String) (proxy.isSupported ? proxy.result : mTokenAudio$delegate.mo27335getValue());
    }

    private final String getMTokenCamera() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return (String) (proxy.isSupported ? proxy.result : mTokenCamera$delegate.mo27335getValue());
    }

    private final String getMTokenClipboard() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return (String) (proxy.isSupported ? proxy.result : mTokenClipboard$delegate.mo27335getValue());
    }

    private final String getMTokenDevice() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        return (String) (proxy.isSupported ? proxy.result : mTokenDevice$delegate.mo27335getValue());
    }

    private final String getMTokenInstaller() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        return (String) (proxy.isSupported ? proxy.result : mTokenInstaller$delegate.mo27335getValue());
    }

    private final String getMTokenLocation() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        return (String) (proxy.isSupported ? proxy.result : mTokenLocation$delegate.mo27335getValue());
    }

    private final String getMTokenMedia() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (String) (proxy.isSupported ? proxy.result : mTokenMedia$delegate.mo27335getValue());
    }

    private final String getMTokenPermit() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        return (String) (proxy.isSupported ? proxy.result : mTokenPermit$delegate.mo27335getValue());
    }

    static {
        Covode.recordClassIndex(9824);
    }

    public final String getAudioToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenAudio();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenAudio();
        }
        return tokenFromMap;
    }

    public final String getCameraToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenCamera();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenCamera();
        }
        return tokenFromMap;
    }

    public final String getClipboardToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenClipboard();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenClipboard();
        }
        return tokenFromMap;
    }

    public final String getDevInfoToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenDevice();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenDevice();
        }
        return tokenFromMap;
    }

    public final String getInstallerToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenInstaller();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenInstaller();
        }
        return tokenFromMap;
    }

    public final String getLocToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenLocation();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenLocation();
        }
        return tokenFromMap;
    }

    public final String getMediaToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenMedia();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenMedia();
        }
        return tokenFromMap;
    }

    public final String getPermitToken(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return getMTokenPermit();
        }
        String tokenFromMap = getTokenFromMap(str);
        if (tokenFromMap == null) {
            return getMTokenPermit();
        }
        return tokenFromMap;
    }

    private final String getTokenFromMap(String str) {
        MethodCollector.m14708i(849);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            String str2 = (String) proxy.result;
            MethodCollector.m14707o(849);
            return str2;
        } else if (!mTokenMap.isEmpty()) {
            String str3 = mTokenMap.get(str);
            MethodCollector.m14707o(849);
            return str3;
        } else {
            synchronized (this) {
                try {
                    if (!mTokenMap.isEmpty()) {
                        String str4 = mTokenMap.get(str);
                        MethodCollector.m14707o(849);
                        return str4;
                    }
                    JSONObject settings = ((AMglInvCallerService) BdpManager.getInst().getService(AMglInvCallerService.class)).getSettings("mgl_privacy_token_map");
                    if (settings != null) {
                        Iterator<String> keys = settings.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Intrinsics.checkExpressionValueIsNotNull(next, "");
                            String str5 = next;
                            String optString = settings.optString(str5);
                            Intrinsics.checkExpressionValueIsNotNull(optString, "");
                            if (!StringsKt__StringsJVMKt.isBlank(optString)) {
                                mTokenMap.put(str5, optString);
                            }
                        }
                    }
                    String str6 = mTokenMap.get(str);
                    MethodCollector.m14707o(849);
                    return str6;
                } catch (Throwable th) {
                    MethodCollector.m14707o(849);
                    throw th;
                }
            }
        }
    }
}
