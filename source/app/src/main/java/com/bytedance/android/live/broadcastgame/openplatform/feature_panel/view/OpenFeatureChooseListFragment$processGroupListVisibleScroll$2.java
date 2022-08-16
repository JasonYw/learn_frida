package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C441563dO;
import p003X.C88172Kog;

/* loaded from: classes5.dex */
public final class OpenFeatureChooseListFragment$processGroupListVisibleScroll$2 extends Lambda implements Function2<Integer, Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88172Kog this$0;

    static {
        Covode.recordClassIndex(21371);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFeatureChooseListFragment$processGroupListVisibleScroll$2(C88172Kog c88172Kog) {
        super(2);
        this.this$0 = c88172Kog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Integer num2) {
        LiveData<List<Object>> LJII;
        List<Object> value;
        String str;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue <= 0) {
                intValue = 0;
            }
            AbstractC3775a abstractC3775a = this.this$0.LJIILL;
            if (abstractC3775a != null && (LJII = abstractC3775a.LJII()) != null && (value = LJII.getValue()) != null) {
                while (intValue2 >= intValue && intValue < value.size()) {
                    Object obj = value.get(intValue);
                    if (!(obj instanceof C3355o)) {
                        obj = null;
                    }
                    C3355o c3355o = (C3355o) obj;
                    if (c3355o != null) {
                        C441563dO c441563dO = C441563dO.LIZIZ;
                        boolean z = this.this$0.LJII;
                        C3383p LJFF = c3355o.LJFF.LJFF();
                        if (LJFF == null || (str = LJFF.LJLIIIL) == null) {
                            str = "";
                        }
                        c441563dO.LIZ(z, str, c3355o.LJFF.f26023LJ, InteractID.Companion.LIZ(c3355o.LJFF.LIZLLL), "use_recently", c3355o.LJFF.LJII, c3355o.LJFF.LIZIZ);
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
