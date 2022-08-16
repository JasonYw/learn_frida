package com.bytedance.android.live.broadcastgame.common;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.api.interactgame.w$a;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C443303gC;

/* loaded from: classes12.dex */
public final class GameConditionChecker$Chain$process$1 extends Lambda implements Function1<w$a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $ctx;
    public final /* synthetic */ C3384q $gameItem;
    public final /* synthetic */ int $index;
    public final /* synthetic */ List $mutableList;
    public final /* synthetic */ Function1 $onSuccess;
    public final /* synthetic */ boolean $shouldToast;
    public final /* synthetic */ C443303gC this$0;

    static {
        Covode.recordClassIndex(19605);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConditionChecker$Chain$process$1(C443303gC c443303gC, int i, Context context, C3384q c3384q, boolean z, List list, Function1 function1) {
        super(1);
        this.this$0 = c443303gC;
        this.$index = i;
        this.$ctx = context;
        this.$gameItem = c3384q;
        this.$shouldToast = z;
        this.$mutableList = list;
        this.$onSuccess = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(w$a w_a) {
        boolean z;
        if (!PatchProxy.proxy(new Object[]{w_a}, this, changeQuickRedirect, false, 1).isSupported) {
            C443303gC c443303gC = this.this$0;
            int i = this.$index + 1;
            Context context = this.$ctx;
            C3384q c3384q = this.$gameItem;
            if (this.$shouldToast && w_a == null) {
                z = true;
            } else {
                z = false;
            }
            List<w$a> list = this.$mutableList;
            if (w_a != null) {
                list.add(w_a);
            }
            c443303gC.LIZ(i, context, c3384q, z, list, this.$onSuccess);
        }
        return Unit.INSTANCE;
    }
}
