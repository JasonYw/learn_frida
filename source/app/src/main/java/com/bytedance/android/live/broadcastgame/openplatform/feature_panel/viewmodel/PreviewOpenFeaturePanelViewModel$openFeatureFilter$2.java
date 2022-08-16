package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.p283b.a$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88220KpS;
import p003X.C106862S5w;
import p003X.C88218KpQ;

/* loaded from: classes5.dex */
public final class PreviewOpenFeaturePanelViewModel$openFeatureFilter$2 extends Lambda implements Function0<C37741> {
    public static final PreviewOpenFeaturePanelViewModel$openFeatureFilter$2 INSTANCE = new PreviewOpenFeaturePanelViewModel$openFeatureFilter$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21452);
    }

    public PreviewOpenFeaturePanelViewModel$openFeatureFilter$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.PreviewOpenFeaturePanelViewModel$openFeatureFilter$2$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.PreviewOpenFeaturePanelViewModel$openFeatureFilter$2$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C37741 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new AbstractC88220KpS<C3380j, a$b>() { // from class: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.PreviewOpenFeaturePanelViewModel$openFeatureFilter$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(21453);
            }

            @Override // p003X.AbstractC88220KpS
            public final List<C3380j> LIZ(List<? extends C3380j> list) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return (List) proxy2.result;
                }
                C106862S5w.LIZ(list);
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{this, list}, null, C88218KpQ.LIZ, true, 2);
                if (proxy3.isSupported) {
                    return (List) proxy3.result;
                }
                C106862S5w.LIZ(list);
                return list;
            }
        };
    }
}
