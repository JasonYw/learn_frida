package com.android.ttcjpaysdk.base.network.p133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.android.ttcjpaysdk.base.network.a.e */
/* loaded from: classes8.dex */
public abstract class AbstractC2160e implements Callback {
    public static ChangeQuickRedirect LJI;

    static {
        Covode.recordClassIndex(6335);
    }

    public abstract void LIZ(AbstractC2161f abstractC2161f);

    public abstract void LIZ(String str, AbstractC2161f abstractC2161f, Response response);

    private AbstractC2161f LIZ(Request request) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{request}, this, LJI, false, 3);
        if (proxy.isSupported) {
            return (AbstractC2161f) proxy.result;
        }
        if (request == null) {
            return null;
        }
        Object tag = request.tag();
        if (!(tag instanceof AbstractC2161f)) {
            return null;
        }
        return (AbstractC2161f) tag;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (PatchProxy.proxy(new Object[]{call, iOException}, this, LJI, false, 2).isSupported) {
            return;
        }
        iOException.printStackTrace();
        LIZ(LIZ(call.request()));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        if (PatchProxy.proxy(new Object[]{call, response}, this, LJI, false, 1).isSupported) {
            return;
        }
        LIZ(response.body().string(), LIZ(response.request()), response);
    }
}
