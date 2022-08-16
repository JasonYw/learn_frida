package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C441563dO;
import p003X.C88172Kog;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view.OpenFeatureChooseListFragment$processTabListVisibleScroll$$inlined$let$lambda$2 */
/* loaded from: classes5.dex */
public final class C3771x3165f55f extends Lambda implements Function2<Integer, Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinearLayoutManager $layoutManager$inlined;
    public final /* synthetic */ int $position$inlined;
    public final /* synthetic */ C88172Kog this$0;

    static {
        Covode.recordClassIndex(21373);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3771x3165f55f(C88172Kog c88172Kog, int i, LinearLayoutManager linearLayoutManager) {
        super(2);
        this.this$0 = c88172Kog;
        this.$position$inlined = i;
        this.$layoutManager$inlined = linearLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Integer num2) {
        LiveData<Triple<List<String>, List<List<C3355o>>, Boolean>> LJIIIIZZ;
        Triple<List<String>, List<List<C3355o>>, Boolean> value;
        List<List<C3355o>> second;
        List<C3355o> list;
        String str;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue <= 0) {
                intValue = 0;
            }
            AbstractC3775a abstractC3775a = this.this$0.LJIILL;
            if (abstractC3775a != null && (LJIIIIZZ = abstractC3775a.LJIIIIZZ()) != null && (value = LJIIIIZZ.getValue()) != null && (second = value.getSecond()) != null && (list = second.get(this.$position$inlined)) != null) {
                while (intValue2 >= intValue && intValue < list.size()) {
                    C3355o c3355o = list.get(intValue);
                    if (!(c3355o instanceof C3355o)) {
                        c3355o = null;
                    }
                    C3355o c3355o2 = c3355o;
                    if (c3355o2 != null) {
                        C441563dO c441563dO = C441563dO.LIZIZ;
                        boolean z = this.this$0.LJII;
                        C3383p LJFF = c3355o2.LJFF.LJFF();
                        if (LJFF == null || (str = LJFF.LJLIIIL) == null) {
                            str = "";
                        }
                        c441563dO.LIZ(z, str, c3355o2.LJFF.f26023LJ, InteractID.Companion.LIZ(c3355o2.LJFF.LIZLLL), "tab", c3355o2.LJFF.LJII, c3355o2.LJFF.LIZIZ);
                    }
                    intValue++;
                    if (intValue < 0) {
                        break;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
