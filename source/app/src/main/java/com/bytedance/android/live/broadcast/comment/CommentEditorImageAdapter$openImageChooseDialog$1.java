package com.bytedance.android.live.broadcast.comment;

import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.LG5;

/* loaded from: classes5.dex */
public final class CommentEditorImageAdapter$openImageChooseDialog$1 extends Lambda implements Function1<ArrayList<C2917q>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LG5 this$0;

    static {
        Covode.recordClassIndex(15226);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentEditorImageAdapter$openImageChooseDialog$1(LG5 lg5) {
        super(1);
        this.this$0 = lg5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ArrayList<C2917q> arrayList) {
        ArrayList<C2917q> arrayList2 = arrayList;
        if (!PatchProxy.proxy(new Object[]{arrayList2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(arrayList2);
            this.this$0.LIZ(arrayList2);
        }
        return Unit.INSTANCE;
    }
}
