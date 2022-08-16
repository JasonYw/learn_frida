package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class StartLiveVisibilityContext$loadMoreAllUserList$1 extends Lambda implements Function2<List<C3195i>, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3209g $currentLoadItem;
    public final /* synthetic */ C3207d this$0;

    static {
        Covode.recordClassIndex(17458);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityContext$loadMoreAllUserList$1(C3207d c3207d, C3209g c3209g) {
        super(2);
        this.this$0 = c3207d;
        this.$currentLoadItem = c3209g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(List<C3195i> list, Boolean bool) {
        Object obj;
        List<C3195i> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2, Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            C3207d c3207d = this.this$0;
            c3207d.LJIIIZ = false;
            if (list2 != null) {
                c3207d.LJI.addAll(list2);
            }
            C3207d c3207d2 = this.this$0;
            c3207d2.LIZIZ(c3207d2.LJI, true);
            String str = this.this$0.LIZJ;
            StringBuilder sb = new StringBuilder("loadMoreAllUserList: mIsRefresh = true ,refresh for ");
            sb.append(this.$currentLoadItem);
            sb.append(" ,result size:");
            if (list2 != null) {
                obj = Integer.valueOf(list2.size());
            } else {
                obj = null;
            }
            sb.append(obj);
            ALogger.m15801d(str, sb.toString());
            if (this.this$0.LJIIIZ()) {
                this.this$0.LIZIZ(0);
                ALogger.m15801d(this.this$0.LIZJ, "loadMoreAllUserList: until now empty, trigger loadMoreAll again");
            }
        }
        return Unit.INSTANCE;
    }
}
