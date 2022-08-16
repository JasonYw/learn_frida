package com.bytedance.android.live.effect.sticker.p331ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86772KHe;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.PixelLoopMattingAdapter$setDataList$1 */
/* loaded from: classes5.dex */
public final class PixelLoopMattingAdapter$setDataList$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $autoChoosePos;
    public final /* synthetic */ List $pixelLoopDataList;
    public final /* synthetic */ C86772KHe this$0;

    static {
        Covode.recordClassIndex(24638);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelLoopMattingAdapter$setDataList$1(C86772KHe c86772KHe, List list, int i) {
        super(0);
        this.this$0 = c86772KHe;
        this.$pixelLoopDataList = list;
        this.$autoChoosePos = i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.clear();
            if (this.$pixelLoopDataList != null) {
                this.this$0.LIZIZ.addAll(this.$pixelLoopDataList);
            }
            List list = this.$pixelLoopDataList;
            if (list != null && CollectionsKt___CollectionsKt.getOrNull(list, this.$autoChoosePos) != null) {
                this.this$0.LIZ(this.$autoChoosePos, false);
            }
            this.this$0.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
