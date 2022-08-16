package com.bytedance.android.live.playtogether.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PlayTogetherInvitedViewModel$audiences$2 extends Lambda implements Function0<MutableLiveData<List<? extends C5244c>>> {
    public static final PlayTogetherInvitedViewModel$audiences$2 INSTANCE = new PlayTogetherInvitedViewModel$audiences$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33188);
    }

    public PlayTogetherInvitedViewModel$audiences$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.lifecycle.MutableLiveData<java.util.List<? extends com.bytedance.android.live.playtogether.viewmodel.c>>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ MutableLiveData<List<? extends C5244c>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new MutableLiveData<>();
    }
}
