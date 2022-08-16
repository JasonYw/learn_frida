package com.bytedance.android.live.core.utils.fresco;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class TagCompat {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23948);
    }

    public static Object LIZ(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return LIZ(view, "DraweeHolder");
    }

    /* loaded from: classes5.dex */
    public static class TagMap extends HashMap<String, Object> {
        static {
            Covode.recordClassIndex(23949);
        }

        public TagMap(String str, Object obj) {
            put(str, obj);
        }

        public /* synthetic */ TagMap(String str, Object obj, byte b) {
            this(str, obj);
        }
    }

    public static Object LIZ(View view, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return LIZIZ(view, str, null);
    }

    public static void LIZ(View view, Object obj) {
        if (PatchProxy.proxy(new Object[]{view, obj}, null, LIZ, true, 1).isSupported) {
            return;
        }
        LIZ(view, "DraweeHolder", obj);
    }

    public static Object LIZIZ(View view, String str, Object obj) {
        Object obj2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str, null}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (view != null) {
            Object tag = view.getTag();
            if ((tag instanceof TagMap) && (obj2 = ((TagMap) tag).get(str)) != null) {
                return obj2;
            }
        }
        return null;
    }

    public static boolean LIZ(View view, String str, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str, obj}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZ(view, str, obj, true);
    }

    public static boolean LIZ(View view, String str, Object obj, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str, obj, (byte) 1}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Object tag = view.getTag();
        if (tag instanceof TagMap) {
            ((TagMap) tag).put(str, obj);
            return true;
        }
        view.setTag(new TagMap(str, obj, (byte) 0));
        return true;
    }
}
