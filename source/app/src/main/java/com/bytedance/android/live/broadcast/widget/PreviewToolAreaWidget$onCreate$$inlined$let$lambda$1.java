package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C86996KPu;

/* loaded from: classes5.dex */
public final class PreviewToolAreaWidget$onCreate$$inlined$let$lambda$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewToolAreaWidget this$0;

    static {
        Covode.recordClassIndex(18739);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewToolAreaWidget$onCreate$$inlined$let$lambda$1(PreviewToolAreaWidget previewToolAreaWidget) {
        super(1);
        this.this$0 = previewToolAreaWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        RecyclerView recyclerView;
        ViewGroup.LayoutParams layoutParams;
        int intValue = num.intValue();
        boolean z = true;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (C86996KPu.LIZ()) {
                PreviewToolAreaWidget previewToolAreaWidget = this.this$0;
                if (intValue <= 0) {
                    intValue = 1;
                } else if (intValue >= 5) {
                    intValue = 5;
                }
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, previewToolAreaWidget, PreviewToolAreaWidget.LIZ, false, 16).isSupported) {
                    if (previewToolAreaWidget.LJIIL || intValue < 5) {
                        View view = previewToolAreaWidget.contentView;
                        if (view != null && (recyclerView = (RecyclerView) view.findViewById(2131188586)) != null && (layoutParams = recyclerView.getLayoutParams()) != null) {
                            layoutParams.width = (previewToolAreaWidget.LIZJ() * intValue) + (previewToolAreaWidget.LJIILIIL * intValue);
                        }
                        GridLayoutManager gridLayoutManager = previewToolAreaWidget.LJI;
                        if (gridLayoutManager != null) {
                            gridLayoutManager.setSpanCount(intValue);
                        }
                    }
                    if (intValue >= 5) {
                        z = false;
                    }
                    previewToolAreaWidget.LJIIL = z;
                }
            } else {
                FlexboxLayoutManager flexboxLayoutManager = this.this$0.LJFF;
                if (flexboxLayoutManager != null) {
                    if (intValue < 5) {
                        i = 2;
                    }
                    flexboxLayoutManager.m15879LJ(i);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
