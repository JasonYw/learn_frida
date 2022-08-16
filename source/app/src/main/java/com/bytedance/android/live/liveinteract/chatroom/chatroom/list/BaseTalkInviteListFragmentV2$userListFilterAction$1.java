package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78119Gqv;
import p003X.AbstractC78986HBs;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragmentV2$userListFilterAction$1 extends Lambda implements Function1<Long, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC78119Gqv this$0;

    static {
        Covode.recordClassIndex(26162);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragmentV2$userListFilterAction$1(AbstractC78119Gqv abstractC78119Gqv) {
        super(1);
        this.this$0 = abstractC78119Gqv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Long l) {
        List<LinkPlayerInfo> LIZJ;
        long longValue = l.longValue();
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            AbstractC78986HBs<LinkPlayerInfo> LJIIJ = this.this$0.LJIIJ();
            if (LJIIJ != null && (LIZJ = LJIIJ.LIZJ()) != null) {
                if (!(LIZJ instanceof Collection) || !LIZJ.isEmpty()) {
                    for (LinkPlayerInfo linkPlayerInfo : LIZJ) {
                        Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                        User LIZ = linkPlayerInfo.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        if (LIZ.getId() == longValue) {
                            break;
                        }
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
