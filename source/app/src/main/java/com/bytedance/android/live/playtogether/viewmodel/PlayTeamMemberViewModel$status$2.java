package com.bytedance.android.live.playtogether.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PlayTeamMemberViewModel$status$2 extends Lambda implements Function0<MutableLiveData<Integer>> {
    public static final PlayTeamMemberViewModel$status$2 INSTANCE = new PlayTeamMemberViewModel$status$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33187);
    }

    public PlayTeamMemberViewModel$status$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.MutableLiveData<java.lang.Integer>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ MutableLiveData<Integer> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new MutableLiveData<>();
    }
}
