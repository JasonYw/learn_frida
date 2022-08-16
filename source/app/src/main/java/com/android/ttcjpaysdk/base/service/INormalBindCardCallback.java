package com.android.ttcjpaysdk.base.service;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public interface INormalBindCardCallback {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(6523);
        }

        public static void onBindCardResult(INormalBindCardCallback iNormalBindCardCallback, JSONObject jSONObject) {
        }
    }

    static {
        Covode.recordClassIndex(6521);
    }

    void onBindCardResult(JSONObject jSONObject);

    void onEntranceResult(String str);

    /* loaded from: classes17.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(6522);
        }

        public final boolean isSuccess(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            C106862S5w.LIZ(str);
            return TextUtils.equals("1", str);
        }
    }
}
