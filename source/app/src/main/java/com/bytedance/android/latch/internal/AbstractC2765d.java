package com.bytedance.android.latch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.subjects.MaybeSubject;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.latch.internal.d */
/* loaded from: classes7.dex */
public abstract class AbstractC2765d {
    public static ChangeQuickRedirect LIZ;
    public final ConcurrentHashMap<String, MaybeSubject<JSONObject>> LIZIZ = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(13736);
    }

    public final MaybeSubject<JSONObject> LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (MaybeSubject) proxy.result;
        }
        C106862S5w.LIZ(str);
        MaybeSubject<JSONObject> maybeSubject = this.LIZIZ.get(str);
        if (maybeSubject != null) {
            return maybeSubject;
        }
        throw new IllegalArgumentException(C0002O.m25086C("failed to find call with __callback_id: ", str).toString());
    }
}
