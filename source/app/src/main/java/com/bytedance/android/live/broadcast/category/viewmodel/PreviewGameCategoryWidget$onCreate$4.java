package com.bytedance.android.live.broadcast.category.viewmodel;

import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PreviewGameCategoryWidget$onCreate$4 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewGameCategoryWidget this$0;

    static {
        Covode.recordClassIndex(15182);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewGameCategoryWidget$onCreate$4(PreviewGameCategoryWidget previewGameCategoryWidget) {
        super(0);
        this.this$0 = previewGameCategoryWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ().LJIJ().LIZ(new C29691());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget$onCreate$4$1 */
    /* loaded from: classes5.dex */
    public static final class C29691 extends Lambda implements Function1<PreviewSourceParam, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(15183);
        }

        public C29691() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
            PreviewSourceParam previewSourceParam2 = previewSourceParam;
            if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(previewSourceParam2);
                CategoryNode categoryNode = previewSourceParam2.liveGameCategory;
                if (categoryNode != null) {
                    PreviewGameCategoryWidget$onCreate$4.this.this$0.LIZ(categoryNode);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
