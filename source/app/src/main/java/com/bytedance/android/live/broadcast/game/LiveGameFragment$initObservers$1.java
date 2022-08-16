package com.bytedance.android.live.broadcast.game;

import com.bytedance.android.live.base.model.feed.C2827a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.broadcast.api.C2925s;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C100639PkH;
import p003X.C106862S5w;
import p003X.KCE;

/* loaded from: classes8.dex */
public final class LiveGameFragment$initObservers$1 extends Lambda implements Function1<C2925s, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C100639PkH this$0;

    static {
        Covode.recordClassIndex(15972);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameFragment$initObservers$1(C100639PkH c100639PkH) {
        super(1);
        this.this$0 = c100639PkH;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2925s c2925s) {
        Boolean bool;
        C2925s c2925s2;
        List<FeedItem> list;
        C2925s c2925s3 = c2925s;
        if (!PatchProxy.proxy(new Object[]{c2925s3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2925s3);
            C100639PkH c100639PkH = this.this$0;
            c100639PkH.LIZJ = c2925s3;
            C2827a c2827a = c2925s3.LIZJ;
            C2827a c2827a2 = null;
            if (c2827a != null) {
                bool = Boolean.valueOf(c2827a.hasMore);
            } else {
                bool = null;
            }
            if (!PatchProxy.proxy(new Object[]{bool}, c100639PkH, C100639PkH.LIZ, false, 15).isSupported && Intrinsics.areEqual(bool, Boolean.FALSE) && c100639PkH.LJII == 3) {
                KCE.LIZ(2131582749);
            }
            C100639PkH c100639PkH2 = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c100639PkH2, C100639PkH.LIZ, false, 16).isSupported && (c2925s2 = c100639PkH2.LIZJ) != null && (list = c2925s2.LIZIZ) != null && list.size() > 0) {
                C3027d LIZIZ = c100639PkH2.LIZIZ();
                C2925s c2925s4 = c100639PkH2.LIZJ;
                if (c2925s4 != null) {
                    c2827a2 = c2925s4.LIZJ;
                }
                int i = c100639PkH2.LJII;
                int i2 = c100639PkH2.LIZLLL;
                if (!PatchProxy.proxy(new Object[]{list, c2827a2, Integer.valueOf(i), Integer.valueOf(i2)}, LIZIZ, C3027d.LIZ, false, 3).isSupported) {
                    C106862S5w.LIZ(list);
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            LIZIZ.LIZIZ.addAll(list);
                            LIZIZ.notifyItemRangeInserted(LIZIZ.LIZIZ.size() - 1, list.size());
                        }
                    } else {
                        LIZIZ.LIZIZ.clear();
                        LIZIZ.LIZIZ.addAll(list);
                        LIZIZ.notifyDataSetChanged();
                    }
                    LIZIZ.LIZJ = i2;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
