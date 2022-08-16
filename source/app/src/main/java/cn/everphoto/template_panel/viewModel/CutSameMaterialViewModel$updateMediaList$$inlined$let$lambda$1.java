package cn.everphoto.template_panel.viewModel;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.cut_ui.CutSource;
import com.p1594ss.android.ugc.cut_ui.MediaItem;
import com.p1594ss.android.ugc.cut_ui.player.CutPlayerInterface;
import com.p1594ss.android.ugc.cut_ui.process.C29798a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC83316IsY;
import p003X.BinderC83309IsR;
import p003X.C106862S5w;
import p003X.C83310IsS;

/* loaded from: classes4.dex */
public final class CutSameMaterialViewModel$updateMediaList$$inlined$let$lambda$1 extends Lambda implements Function2<MediaItem, Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Fragment $fragment$inlined;
    public final /* synthetic */ Long $id$inlined;
    public final /* synthetic */ List $list$inlined;
    public final /* synthetic */ RecyclerView $materialList$inlined;
    public final /* synthetic */ C0801a this$0;

    static {
        Covode.recordClassIndex(3845);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameMaterialViewModel$updateMediaList$$inlined$let$lambda$1(C0801a c0801a, List list, Fragment fragment, Long l, RecyclerView recyclerView) {
        super(2);
        this.this$0 = c0801a;
        this.$list$inlined = list;
        this.$fragment$inlined = fragment;
        this.$id$inlined = l;
        this.$materialList$inlined = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(MediaItem mediaItem, Integer num) {
        String str;
        MediaItem mediaItem2 = mediaItem;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{mediaItem2, Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(mediaItem2);
            C0801a c0801a = this.this$0;
            Fragment fragment = this.$fragment$inlined;
            Long l = this.$id$inlined;
            if (!PatchProxy.proxy(new Object[]{fragment, mediaItem2, Integer.valueOf(intValue), l}, c0801a, C0801a.LIZ, false, 23).isSupported) {
                AbstractC83316IsY abstractC83316IsY = c0801a.LJFF;
                if (abstractC83316IsY != null) {
                    abstractC83316IsY.LJIIIIZZ(l);
                }
                Intent intent = new Intent("com.ss.android.ugc.cut_ui.CLIP");
                Context context = fragment.getContext();
                if (context != null) {
                    str = context.getPackageName();
                } else {
                    str = null;
                }
                intent.setPackage(str);
                intent.putExtra("click_pos", intValue + 1);
                intent.addFlags(536870912);
                CutSource cutSource = c0801a.LIZIZ;
                if (cutSource == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                intent.putExtra("arg_cut_source", cutSource);
                Intent intent2 = c0801a.LIZJ;
                if (intent2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                intent.putExtras(intent2);
                new C29798a(new ArrayList(CollectionsKt__CollectionsJVMKt.listOf(mediaItem2)), new ArrayList(c0801a.LJII), null, 4).LIZ(intent);
                Context context2 = fragment.getContext();
                if (context2 != null) {
                    CutPlayerInterface.LIZIZ.LIZ(context2, intent);
                }
                new BinderC83309IsR("CutSameAccess", new C83310IsS(new CutSameMaterialViewModel$launchClip$$inlined$apply$lambda$1(intent, c0801a, fragment, intValue, mediaItem2, l), new CutSameMaterialViewModel$launchClip$$inlined$apply$lambda$2(intent, c0801a, fragment, intValue, mediaItem2, l), new CutSameMaterialViewModel$launchClip$$inlined$apply$lambda$3(intent, c0801a, fragment, intValue, mediaItem2, l), new CutSameMaterialViewModel$launchClip$$inlined$apply$lambda$4(intent, c0801a, fragment, intValue, mediaItem2, l), new CutSameMaterialViewModel$launchClip$$inlined$apply$lambda$5(intent, c0801a, fragment, intValue, mediaItem2, l))).LIZ(intent, "reporter");
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    activity.startActivityForResult(intent, 20012);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
