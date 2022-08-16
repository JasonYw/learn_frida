package cn.everphoto.template_panel.fragment;

import android.content.Context;
import cn.everphoto.template_panel.viewModel.C0801a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.BinderC83340Isw;
import p003X.C106862S5w;
import p003X.C115734VhA;
import p003X.C83168IqA;
import p003X.C83171IqD;
import p003X.C83177IqJ;
import p003X.C83214Iqu;

/* renamed from: cn.everphoto.template_panel.fragment.CutSameTemplateFragment$downloadTemplate$1$onPreSuccess$$inlined$apply$lambda$1 */
/* loaded from: classes4.dex */
public final class C0783x7f3ef0e5 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ArrayList $mediaItemList$inlined;
    public final /* synthetic */ ArrayList $textItemList$inlined;
    public final /* synthetic */ C0801a $this_apply;
    public final /* synthetic */ BinderC83340Isw this$0;

    static {
        Covode.recordClassIndex(3723);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0783x7f3ef0e5(C0801a c0801a, BinderC83340Isw binderC83340Isw, ArrayList arrayList, ArrayList arrayList2) {
        super(0);
        this.$this_apply = c0801a;
        this.this$0 = binderC83340Isw;
        this.$mediaItemList$inlined = arrayList;
        this.$textItemList$inlined = arrayList2;
    }

    /* renamed from: cn.everphoto.template_panel.fragment.CutSameTemplateFragment$downloadTemplate$1$onPreSuccess$$inlined$apply$lambda$1$1 */
    /* loaded from: classes4.dex */
    public static final class C07841 extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3724);
        }

        public C07841() {
            super(1);
        }

        /* renamed from: cn.everphoto.template_panel.fragment.CutSameTemplateFragment$downloadTemplate$1$onPreSuccess$$inlined$apply$lambda$1$1$1 */
        /* loaded from: classes4.dex */
        public static final class C07851 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ int $it;

            static {
                Covode.recordClassIndex(3725);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07851(int i) {
                super(0);
                this.$it = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    C0783x7f3ef0e5.this.this$0.LIZIZ.m23602LJ().LIZIZ(((this.$it * 5) / 100) + 90);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            int intValue = num.intValue();
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
                C115734VhA.LIZIZ(0L, new C07851(intValue), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C0801a c0801a = this.$this_apply;
            Context requireContext = this.this$0.LIZIZ.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "");
            long j = this.this$0.LIZLLL;
            C07841 c07841 = new C07841();
            if (!PatchProxy.proxy(new Object[]{requireContext, new Long(j), c07841}, c0801a, C0801a.LIZ, false, 30).isSupported) {
                C106862S5w.LIZ(requireContext, c07841);
                C83171IqD.LIZIZ.LIZ(requireContext);
                C83177IqJ c83177IqJ = C83177IqJ.LIZJ;
                List<MediaItem> list = c0801a.LJII;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (MediaItem mediaItem : list) {
                    arrayList.add(Boolean.valueOf(mediaItem.LJI));
                }
                ArrayList arrayList2 = arrayList;
                List<MediaItem> list2 = c0801a.LJII;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (MediaItem mediaItem2 : list2) {
                    arrayList3.add(C83168IqA.LIZ(mediaItem2));
                }
                c83177IqJ.LIZ(requireContext, arrayList2, arrayList3, new C83214Iqu(c0801a, c07841, j));
            }
        }
        return Unit.INSTANCE;
    }
}
