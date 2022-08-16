package com.bytedance.android.live.broadcast.preview;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class StartLiveViewModel$liveBroadcastParams$2 extends Lambda implements Function0<MutableLiveData<HashMap<String, String>>> {
    public static final StartLiveViewModel$liveBroadcastParams$2 INSTANCE = new StartLiveViewModel$liveBroadcastParams$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17194);
    }

    public StartLiveViewModel$liveBroadcastParams$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ MutableLiveData<HashMap<String, String>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        MutableLiveData<HashMap<String, String>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new HashMap<>());
        return mutableLiveData;
    }
}
