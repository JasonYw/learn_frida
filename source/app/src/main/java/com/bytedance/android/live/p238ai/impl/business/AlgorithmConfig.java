package com.bytedance.android.live.p238ai.impl.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: com.bytedance.android.live.ai.impl.business.AlgorithmConfig */
/* loaded from: classes8.dex */
public final class AlgorithmConfig {
    public static final AlgorithmConfig INSTANCE = new AlgorithmConfig();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13853);
    }

    public final List<String> getPackageList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"aweme_live_super_resolution", "aweme_live_game_predict", "aweme_live_resolution", "aweme_live_quit_predict", "aweme_live_drawer_predict_6"});
    }
}
