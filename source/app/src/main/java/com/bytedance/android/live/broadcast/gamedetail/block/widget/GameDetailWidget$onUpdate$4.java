package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.M0Q;

/* loaded from: classes12.dex */
public final class GameDetailWidget$onUpdate$4 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailWidget this$0;

    static {
        Covode.recordClassIndex(16378);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailWidget$onUpdate$4(GameDetailWidget gameDetailWidget) {
        super(1);
        this.this$0 = gameDetailWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            GameDetailWidget gameDetailWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{str2}, gameDetailWidget, GameDetailWidget.LIZ, false, 3).isSupported && str2 != null && (!StringsKt__StringsJVMKt.isBlank(str2))) {
                ImageModel imageModel = new ImageModel();
                imageModel.setUrls(CollectionsKt__CollectionsKt.arrayListOf(str2));
                M0Q.LIZ((HSImageView) gameDetailWidget.contentView.findViewById(2131175900), imageModel);
            }
        }
        return Unit.INSTANCE;
    }
}
