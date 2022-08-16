package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C392771gt;
import p003X.C77294Gdc;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$mClickLogMap$2 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$mClickLogMap$2 extends Lambda implements Function0<Map<String, String>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17376);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$mClickLogMap$2(C77294Gdc c77294Gdc) {
        super(0);
        this.this$0 = c77294Gdc;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<String, String> mo30099invoke() {
        Object valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.m137to(C392771gt.LIZ(0), "0");
        pairArr[1] = TuplesKt.m137to(C392771gt.LIZ(1), "0");
        pairArr[2] = TuplesKt.m137to(C392771gt.LIZ(2), "0");
        pairArr[3] = TuplesKt.m137to(C392771gt.LIZ(3), "0");
        pairArr[4] = TuplesKt.m137to("tag_search", "0");
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this.this$0, C77294Gdc.LIZ, false, 2);
        if (proxy2.isSupported) {
            valueOf = proxy2.result;
        } else {
            valueOf = String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
        }
        pairArr[5] = TuplesKt.m137to("user_id", valueOf);
        pairArr[6] = TuplesKt.m137to("event_page", "live_take_page");
        return MapsKt__MapsKt.mutableMapOf(pairArr);
    }
}
