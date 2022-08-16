package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.M0Q;

/* loaded from: classes5.dex */
public final class GameOfficialItemWidget$onUpdate$4 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameOfficialItemWidget this$0;

    static {
        Covode.recordClassIndex(16402);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameOfficialItemWidget$onUpdate$4(GameOfficialItemWidget gameOfficialItemWidget) {
        super(1);
        this.this$0 = gameOfficialItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            HSImageView hSImageView = this.this$0.LIZJ;
            ImageModel imageModel = new ImageModel();
            imageModel.setUrls(CollectionsKt__CollectionsKt.mutableListOf(str));
            M0Q.LIZIZ((ImageView) hSImageView, imageModel);
        }
        return Unit.INSTANCE;
    }
}
