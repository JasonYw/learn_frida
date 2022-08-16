package com.bef.effectsdk.message;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes26.dex */
public class ResourceMonitor implements MessageInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Listener mListener;

    /* loaded from: classes26.dex */
    public interface Listener {
        static {
            Covode.recordClassIndex(9578);
        }

        void onResourceLoadFinish(String str, boolean z);
    }

    static {
        Covode.recordClassIndex(9577);
    }

    @Override // com.bef.effectsdk.message.MessageInterceptor
    public void destroy() {
        this.mListener = null;
    }

    public void reset() {
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    @Override // com.bef.effectsdk.message.MessageInterceptor
    public boolean intercept(Message message) {
        Listener listener;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (17 != message.what) {
            return false;
        }
        String str = (String) message.obj;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int i = message.arg1;
        if (i != 3) {
            if (i == 4 && (listener = this.mListener) != null) {
                listener.onResourceLoadFinish(str, false);
            }
        } else {
            Listener listener2 = this.mListener;
            if (listener2 != null) {
                listener2.onResourceLoadFinish(str, true);
                return true;
            }
        }
        return true;
    }
}
