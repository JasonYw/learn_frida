package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC445813kF;
import p003X.RunnableC86987KPl;
import p003X.RunnableC86988KPm;

/* renamed from: com.bytedance.android.live.broadcast.widget.PreviewToolAreaWidget$initAllWidgetList$$inlined$forEach$lambda$1 */
/* loaded from: classes5.dex */
public final class C3303xe7721dc7 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC445813kF $ani$inlined;
    public final /* synthetic */ Map.Entry $entry$inlined;
    public final /* synthetic */ C3316bs $tmpItem;
    public final /* synthetic */ PreviewToolAreaWidget this$0;

    static {
        Covode.recordClassIndex(18734);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3303xe7721dc7(C3316bs c3316bs, Map.Entry entry, AbstractC445813kF abstractC445813kF, PreviewToolAreaWidget previewToolAreaWidget) {
        super(1);
        this.$tmpItem = c3316bs;
        this.$entry$inlined = entry;
        this.$ani$inlined = abstractC445813kF;
        this.this$0 = previewToolAreaWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue != 0) {
                if (intValue == 8) {
                    PreviewToolAreaWidget previewToolAreaWidget = this.this$0;
                    C3316bs c3316bs = this.$tmpItem;
                    if (!PatchProxy.proxy(new Object[]{c3316bs}, previewToolAreaWidget, PreviewToolAreaWidget.LIZ, false, 12).isSupported) {
                        if (!previewToolAreaWidget.LIZJ.contains(c3316bs)) {
                            String LIZ = previewToolAreaWidget.LIZ();
                            ALogger.m15801d(LIZ, "widget:" + c3316bs.LIZLLL + " not in list,skip handleGone;LiveMode:" + previewToolAreaWidget.LJIIJJI().LIZ().LIZ().name() + ",isOldAnchor:" + previewToolAreaWidget.LIZIZ() + '}');
                        } else {
                            Integer num2 = previewToolAreaWidget.LIZLLL.get(c3316bs);
                            if (num2 != null) {
                                i = num2.intValue();
                            }
                            int i2 = i - 1;
                            previewToolAreaWidget.LIZLLL.put(c3316bs, Integer.valueOf(i2));
                            String LIZ2 = previewToolAreaWidget.LIZ();
                            ALogger.m15800e(LIZ2, "widget:" + c3316bs.LIZLLL + "'s container set gone (ﾉ｀□´)ﾉ⌒ ╧╧ ,now count: " + i2);
                            View view = previewToolAreaWidget.contentView;
                            Intrinsics.checkNotNullExpressionValue(view, "");
                            RecyclerView recyclerView = (RecyclerView) view.findViewById(2131188586);
                            if (recyclerView != null && !previewToolAreaWidget.f26000LJ) {
                                previewToolAreaWidget.f26000LJ = true;
                                recyclerView.post(new RunnableC86987KPl(previewToolAreaWidget));
                            }
                        }
                    }
                }
            } else {
                PreviewToolAreaWidget previewToolAreaWidget2 = this.this$0;
                C3316bs c3316bs2 = this.$tmpItem;
                if (!PatchProxy.proxy(new Object[]{c3316bs2}, previewToolAreaWidget2, PreviewToolAreaWidget.LIZ, false, 13).isSupported) {
                    if (!previewToolAreaWidget2.LIZJ.contains(c3316bs2)) {
                        String LIZ3 = previewToolAreaWidget2.LIZ();
                        ALogger.m15801d(LIZ3, "widget:" + c3316bs2.LIZLLL + " not in list,skip handleVisible;LiveMode:" + previewToolAreaWidget2.LJIIJJI().LIZ().LIZ().name() + ",isOldAnchor:" + previewToolAreaWidget2.LIZIZ() + '}');
                    } else {
                        Integer num3 = previewToolAreaWidget2.LIZLLL.get(c3316bs2);
                        if (num3 != null) {
                            i = num3.intValue();
                        }
                        int i3 = i + 1;
                        previewToolAreaWidget2.LIZLLL.put(c3316bs2, Integer.valueOf(i3));
                        String LIZ4 = previewToolAreaWidget2.LIZ();
                        ALogger.m15795w(LIZ4, "widget:" + c3316bs2.LIZLLL + "'s container set visible, ┬─┬ ノ('-'ノ) ,now count: " + i3);
                        View view2 = previewToolAreaWidget2.contentView;
                        Intrinsics.checkNotNullExpressionValue(view2, "");
                        RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(2131188586);
                        if (recyclerView2 != null && !previewToolAreaWidget2.f26000LJ) {
                            previewToolAreaWidget2.f26000LJ = true;
                            recyclerView2.post(new RunnableC86988KPm(previewToolAreaWidget2));
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
