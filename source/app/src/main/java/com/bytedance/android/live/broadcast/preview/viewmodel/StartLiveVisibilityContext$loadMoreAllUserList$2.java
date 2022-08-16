package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3192d;
import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class StartLiveVisibilityContext$loadMoreAllUserList$2 extends Lambda implements Function2<List<C3195i>, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3209g $currentLoadItem;
    public final /* synthetic */ int $currentLoadItemIndex;
    public final /* synthetic */ int $currentLoadItemListSize;
    public final /* synthetic */ C3207d this$0;

    static {
        Covode.recordClassIndex(17459);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityContext$loadMoreAllUserList$2(C3207d c3207d, C3209g c3209g, int i, int i2) {
        super(2);
        this.this$0 = c3207d;
        this.$currentLoadItem = c3209g;
        this.$currentLoadItemIndex = i;
        this.$currentLoadItemListSize = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(List<C3195i> list, Boolean bool) {
        List<C3195i> list2 = list;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{list2, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (list2 != null) {
                this.this$0.LJI.addAll(list2);
                String str = this.this$0.LIZJ;
                ALogger.m15801d(str, "loadMoreAllUserList: loadMore for " + this.$currentLoadItem + " success--size:" + list2.size());
            }
            if (this.$currentLoadItemIndex == this.$currentLoadItemListSize - 1) {
                this.this$0.LIZ(booleanValue);
                C3207d c3207d = this.this$0;
                c3207d.LIZIZ(c3207d.LJI, booleanValue);
                if (!booleanValue && this.this$0.LJIIIZ()) {
                    C3207d c3207d2 = this.this$0;
                    c3207d2.LIZ((List) c3207d2.LJI, false);
                    ALogger.m15801d(this.this$0.LIZJ, "loadMoreAllUserList: show ALLLLLL Empty");
                }
            } else {
                this.this$0.LIZ(true);
                if (!booleanValue) {
                    C3209g c3209g = this.this$0.LJIIIIZZ.get(this.$currentLoadItemIndex + 1);
                    Long mo30099invoke = c3209g.f25925LJ.mo30099invoke();
                    if (mo30099invoke != null) {
                        long longValue = mo30099invoke.longValue();
                        String str2 = this.this$0.LIZJ;
                        ALogger.m15801d(str2, "refreshAllUserList: getCount for " + c3209g + " :[" + longValue + LoggerUtil.M_RIGHT_TAG);
                        if (longValue != 0) {
                            List<Object> list3 = this.this$0.LJI;
                            String LIZ = LK5.LIZ(c3209g.LJFF, c3209g.f25925LJ.mo30099invoke());
                            Intrinsics.checkNotNullExpressionValue(LIZ, "");
                            list3.add(new C3192d(LIZ));
                        }
                    }
                    this.this$0.LIZ(c3209g.LIZIZ);
                    C3207d c3207d3 = this.this$0;
                    c3207d3.LJIIIZ = true;
                    if (c3207d3.LJIIIZ()) {
                        this.this$0.LIZIZ(0);
                        ALogger.m15801d(this.this$0.LIZJ, "loadMoreAllUserList: until now empty, trigger loadMoreAll again");
                    }
                }
                C3207d c3207d4 = this.this$0;
                c3207d4.LIZIZ(c3207d4.LJI, true);
            }
        }
        return Unit.INSTANCE;
    }
}
