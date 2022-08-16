package cn.everphoto.template_panel.viewModel;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.cut_ui.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC83316IsY;

/* loaded from: classes4.dex */
public final class CutSameMaterialViewModel$launchClip$$inlined$apply$lambda$5 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Fragment $fragment$inlined;
    public final /* synthetic */ Long $id$inlined;
    public final /* synthetic */ MediaItem $item$inlined;
    public final /* synthetic */ int $pos$inlined;
    public final /* synthetic */ Intent $this_apply$inlined;
    public final /* synthetic */ C0801a this$0;

    static {
        Covode.recordClassIndex(3842);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameMaterialViewModel$launchClip$$inlined$apply$lambda$5(Intent intent, C0801a c0801a, Fragment fragment, int i, MediaItem mediaItem, Long l) {
        super(0);
        this.$this_apply$inlined = intent;
        this.this$0 = c0801a;
        this.$fragment$inlined = fragment;
        this.$pos$inlined = i;
        this.$item$inlined = mediaItem;
        this.$id$inlined = l;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        AbstractC83316IsY abstractC83316IsY;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (abstractC83316IsY = this.this$0.LJFF) != null) {
            abstractC83316IsY.LJIILIIL(this.$id$inlined);
        }
        return Unit.INSTANCE;
    }
}
