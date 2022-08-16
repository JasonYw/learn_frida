package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC89041L6l;

/* loaded from: classes5.dex */
public final class AnchorFollowOfficialEffect$receiveAction$followOrNot$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC89041L6l $curState;
    public final /* synthetic */ Function1 $setState;

    static {
        Covode.recordClassIndex(16179);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorFollowOfficialEffect$receiveAction$followOrNot$1(AbstractC89041L6l abstractC89041L6l, Function1 function1) {
        super(1);
        this.$curState = abstractC89041L6l;
        this.$setState = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        C3098a c3098a;
        List<C3108d> list;
        C3108d c3108d;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && (c3098a = (C3098a) this.$curState.LIZIZ()) != null) {
            C3036d c3036d = c3098a.LIZLLL;
            if (c3036d != null && (list = c3036d.LJIJ) != null && (c3108d = (C3108d) CollectionsKt___CollectionsKt.getOrNull(list, 0)) != null) {
                c3108d.LJII = booleanValue;
            }
            this.$setState.invoke(c3098a);
        }
        return Unit.INSTANCE;
    }
}
