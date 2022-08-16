package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class OpenFeatureListHandler$modifyRecentUsedList$1 extends Lambda implements Function3<String, Long, Map<String, C3380j>, C3380j> {
    public static final OpenFeatureListHandler$modifyRecentUsedList$1 INSTANCE = new OpenFeatureListHandler$modifyRecentUsedList$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21321);
    }

    public OpenFeatureListHandler$modifyRecentUsedList$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ C3380j invoke(String str, Long l, Map<String, C3380j> map) {
        return LIZ(str, l.longValue(), map);
    }

    public final C3380j LIZ(String str, long j, Map<String, C3380j> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), map}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C3380j) proxy.result;
        }
        C106862S5w.LIZ(str, map);
        C3380j c3380j = map.get(str);
        if (c3380j != null) {
            if (c3380j.LJII == j) {
                return c3380j;
            }
            return C3380j.LIZ(c3380j, 0, null, null, null, j, null, null, 111, null);
        }
        return null;
    }
}
