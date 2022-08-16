package com.bytedance.android.live.effect.sticker.p331ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KHN;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.LiveStickerComposerDialogV2$onActivityResult$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C4210xf66087d0 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $imageUri$inlined;
    public final /* synthetic */ KHN this$0;

    static {
        Covode.recordClassIndex(24634);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4210xf66087d0(KHN khn, String str) {
        super(1);
        this.this$0 = khn;
        this.$imageUri$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            KHN.LIZIZ(this.this$0).LIZ(str2, str2);
        }
        return Unit.INSTANCE;
    }
}
