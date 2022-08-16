package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78156GrW;
import p003X.AbstractC78986HBs;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragment$userListFilterAction$1 extends Lambda implements Function1<Long, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC78156GrW this$0;

    static {
        Covode.recordClassIndex(26159);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragment$userListFilterAction$1(AbstractC78156GrW abstractC78156GrW) {
        super(1);
        this.this$0 = abstractC78156GrW;
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
            AbstractC78986HBs<LinkPlayerInfo> LJIIJJI = this.this$0.LJIIJJI();
            if (LJIIJJI != null && (LIZJ = LJIIJJI.LIZJ()) != null && (!(LIZJ instanceof Collection) || !LIZJ.isEmpty())) {
                Iterator<T> it = LIZJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) it.next();
                    Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                    User LIZ = linkPlayerInfo.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    if (LIZ.getId() == longValue) {
                        z = false;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
