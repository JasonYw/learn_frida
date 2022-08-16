package com.bef.effectsdk.text;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class FontCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Hashtable<String, Typeface> fontCache = new Hashtable<>();
    public static LinkedList<String> lruQueue = new LinkedList<>();

    static {
        Covode.recordClassIndex(9579);
    }

    public static synchronized Typeface getFromFile(String str, String str2) {
        synchronized (FontCache.class) {
            MethodCollector.m14708i(690);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                Typeface typeface = (Typeface) proxy.result;
                MethodCollector.m14707o(690);
                return typeface;
            }
            String m25084C = C0002O.m25084C("FILE_", str, "_", str2);
            Typeface typeface2 = fontCache.get(m25084C);
            if (typeface2 == null) {
                try {
                    typeface2 = C116971W2r.LIZJ(new File(str, str2));
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(m25084C, typeface2);
                    lruQueue.addFirst(m25084C);
                } catch (Exception unused) {
                    MethodCollector.m14707o(690);
                    return null;
                }
            } else {
                lruQueue.remove(m25084C);
                lruQueue.addFirst(m25084C);
            }
            MethodCollector.m14707o(690);
            return typeface2;
        }
    }

    public static synchronized Typeface getFromSystem(String str, int i) {
        synchronized (FontCache.class) {
            MethodCollector.m14708i(691);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                Typeface typeface = (Typeface) proxy.result;
                MethodCollector.m14707o(691);
                return typeface;
            }
            String str2 = "SYSTEM_" + str + "_" + i;
            Typeface typeface2 = fontCache.get(str2);
            if (typeface2 == null) {
                try {
                    typeface2 = Typeface.create(str, i);
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(str2, typeface2);
                    lruQueue.addFirst(str2);
                } catch (Exception unused) {
                    MethodCollector.m14707o(691);
                    return null;
                }
            } else {
                lruQueue.remove(str2);
                lruQueue.addFirst(str2);
            }
            MethodCollector.m14707o(691);
            return typeface2;
        }
    }
}
