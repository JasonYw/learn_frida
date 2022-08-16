package com.bytedance.android.btm.api.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmExtKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11328);
    }

    public static final JSONObject toJSONObject(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(bundle);
        JSONObject jSONObject = new JSONObject();
        try {
            Set<String> keySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "");
            for (String str : keySet) {
                jSONObject.put(str, bundle.get(str));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static final <K, V> JSONObject toJSONObject(Map<K, ? extends V> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(map);
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
                K key = entry.getKey();
                if (!(key instanceof String)) {
                    key = null;
                }
                String str = (String) key;
                if (str != null) {
                    jSONObject.put(str, entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static final void putBufferBtm(Intent intent, BufferBtm bufferBtm) {
        if (PatchProxy.proxy(new Object[]{intent, bufferBtm}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(intent);
        intent.putExtra("buffer_btm", bufferBtm);
    }

    public static final <T> T safeApply(T t, Function1<? super T, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t, function1}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(function1);
        try {
            function1.invoke(t);
        } catch (Throwable unused) {
        }
        return t;
    }

    public static final Object getFragment(ViewPager viewPager, int i) {
        PagerAdapter adapter;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPager, Integer.valueOf(i)}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(viewPager);
        if (i < 0 || (adapter = viewPager.getAdapter()) == null) {
            return null;
        }
        return adapter.instantiateItem((ViewGroup) viewPager, i);
    }

    public static final String getFragmentBtm(ViewPager viewPager, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPager, Integer.valueOf(i)}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(viewPager);
        Object fragment = getFragment(viewPager, i);
        if (!(fragment instanceof Fragment)) {
            return null;
        }
        return BtmSDK.INSTANCE.getService().findBtmByPage(fragment);
    }

    public static final Bundle putBtmId(Bundle bundle, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle, str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Bundle) proxy.result;
        }
        C106862S5w.LIZ(bundle);
        bundle.putString("btm_id", str);
        return bundle;
    }

    public static final <K, V, T extends Map<K, V>> T putBtmId(T t, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t, str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(t);
        if (str != null) {
            try {
                t.put("btm_id", str);
            } catch (Throwable unused) {
            }
        }
        return t;
    }

    public static final JSONObject putBtmId(JSONObject jSONObject, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(jSONObject);
        jSONObject.put("btm_id", str);
        return jSONObject;
    }

    public static /* synthetic */ Object getFragment$default(ViewPager viewPager, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPager, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return getFragment(viewPager, i);
    }

    public static /* synthetic */ String getFragmentBtm$default(ViewPager viewPager, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPager, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return getFragmentBtm(viewPager, i);
    }
}
