package com.bytedance.android.live.broadcast.comment;

import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LG5;

/* loaded from: classes5.dex */
public final class CommentEditorImageAdapter$onResult$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LG5 this$0;

    static {
        Covode.recordClassIndex(15225);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentEditorImageAdapter$onResult$1(LG5 lg5) {
        super(0);
        this.this$0 = lg5;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        ArrayList<C2917q> arrayList;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            LG5 lg5 = this.this$0;
            if (!PatchProxy.proxy(new Object[0], lg5, LG5.LIZ, false, 9).isSupported) {
                C2990g c2990g = lg5.LIZJ;
                if (c2990g != null) {
                    arrayList = c2990g.LJI;
                } else {
                    arrayList = null;
                }
                lg5.LIZ((List<? extends C2917q>) arrayList);
            }
        }
        return Unit.INSTANCE;
    }
}
