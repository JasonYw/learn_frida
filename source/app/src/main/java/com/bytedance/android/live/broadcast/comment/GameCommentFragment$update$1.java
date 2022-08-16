package com.bytedance.android.live.broadcast.comment;

import android.content.Context;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import p003X.C88975L3x;

/* loaded from: classes5.dex */
public final class GameCommentFragment$update$1 extends Lambda implements Function5<Integer, String, Integer, Integer, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2990g $viewModel;
    public final /* synthetic */ C88975L3x this$0;

    static {
        Covode.recordClassIndex(15247);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentFragment$update$1(C88975L3x c88975L3x, C2990g c2990g) {
        super(5);
        this.this$0 = c88975L3x;
        this.$viewModel = c2990g;
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* synthetic */ Unit invoke(Integer num, String str, Integer num2, Integer num3, String str2) {
        Context context;
        int intValue = num.intValue();
        String str3 = str;
        Integer num4 = num2;
        Integer num5 = num3;
        String str4 = str2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str3, num4, num5, str4}, this, changeQuickRedirect, false, 1).isSupported && (context = this.this$0.getContext()) != null) {
            C2990g.LIZ(this.$viewModel, context, intValue, str3, num4, num5, str4, null, null, null, new GameCommentFragment$update$1$$special$$inlined$let$lambda$1(this, intValue, str3, num4, num5, str4), 448, null);
        }
        return Unit.INSTANCE;
    }
}
