package com.bytedance.android.live.broadcast.promotelist;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.L3N;
import p003X.L9Y;

/* loaded from: classes5.dex */
public final class PromoteListAdapter$onBindViewHolder$6 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $addFoot;
    public final /* synthetic */ L9Y this$0;

    static {
        Covode.recordClassIndex(17516);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoteListAdapter$onBindViewHolder$6(L9Y l9y, Function1 function1) {
        super(1);
        this.this$0 = l9y;
        this.$addFoot = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            this.$addFoot.invoke(new L3N(this.this$0.LIZIZ, str2, null, null, 12));
        }
        return Unit.INSTANCE;
    }
}
