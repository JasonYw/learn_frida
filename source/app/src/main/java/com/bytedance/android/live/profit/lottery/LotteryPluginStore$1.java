package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class LotteryPluginStore$1 extends Lambda implements Function1<C5342y, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5341v this$0;

    static {
        Covode.recordClassIndex(33425);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryPluginStore$1(C5341v c5341v) {
        super(1);
        this.this$0 = c5341v;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5342y c5342y) {
        C5342y c5342y2 = c5342y;
        if (!PatchProxy.proxy(new Object[]{c5342y2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5342y2);
            c5342y2.LJIIJ = new C52981(this.this$0);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.LotteryPluginStore$1$1 */
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class C52981 extends FunctionReferenceImpl implements Function1<C5330h, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(33426);
        }

        public C52981(C5341v c5341v) {
            super(1, c5341v, C5341v.class, "interceptNewLottery", "interceptNewLottery(Lcom/bytedance/android/live/profit/lottery/Lottery;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(C5330h c5330h) {
            C5330h c5330h2 = c5330h;
            boolean z = true;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5330h2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                z = ((Boolean) proxy.result).booleanValue();
            } else {
                C106862S5w.LIZ(c5330h2);
                C5341v c5341v = (C5341v) this.receiver;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c5330h2}, c5341v, C5341v.LIZ, false, 4);
                if (proxy2.isSupported) {
                    z = ((Boolean) proxy2.result).booleanValue();
                } else {
                    Collection<AbstractC5326d> values = c5341v.LIZIZ.values();
                    if (!(values instanceof Collection) || !values.isEmpty()) {
                        for (AbstractC5326d abstractC5326d : values) {
                            if (abstractC5326d.LIZ(c5330h2)) {
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
}
