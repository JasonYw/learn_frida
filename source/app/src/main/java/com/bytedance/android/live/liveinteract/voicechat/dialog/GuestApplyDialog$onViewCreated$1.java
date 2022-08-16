package com.bytedance.android.live.liveinteract.voicechat.dialog;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.plantform.model.C4824t;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78538Gxg;
import p003X.C79007HCn;

/* loaded from: classes3.dex */
public final class GuestApplyDialog$onViewCreated$1 extends Lambda implements Function1<C4824t, Integer> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5011d this$0;

    static {
        Covode.recordClassIndex(30978);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestApplyDialog$onViewCreated$1(C5011d c5011d) {
        super(1);
        this.this$0 = c5011d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Integer invoke(C4824t c4824t) {
        int i;
        List<C4824t> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4824t}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            i = ((Integer) proxy.result).intValue();
        } else {
            C106862S5w.LIZ(c4824t);
            ArrayList arrayList = new ArrayList();
            C5012e LIZIZ = this.this$0.LIZIZ();
            if (LIZIZ != null && (list = LIZIZ.LJII) != null) {
                for (Object obj : list) {
                    arrayList.add(obj);
                }
            }
            if (C78538Gxg.LIZ(this.this$0.LIZIZ) && this.this$0.LIZLLL()) {
                ALogger.m15797i("GuestApplyDialog", "Turn on the paid mode, hit the paid increase price experiment, turn on the increase price, there is a current user in the waiting list, no need to add any more");
            } else {
                C79007HCn LJII = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                C4824t c4824t2 = LJII.LJJIII;
                if (c4824t2 != null) {
                    long j = c4824t2.LJIJJLI;
                    if (j != 0) {
                        int size = arrayList.size();
                        int i2 = (int) (j - 1);
                        if (i2 >= 0 && size > i2) {
                            C4824t c4824t3 = new C4824t();
                            c4824t3.LJIJJLI = -1L;
                            arrayList.add(i2, c4824t3);
                        }
                    }
                }
            }
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next(), c4824t)) {
                        i = i3 + 1;
                        break;
                    }
                    i3++;
                } else {
                    i = 0;
                    break;
                }
            }
        }
        return Integer.valueOf(i);
    }
}
