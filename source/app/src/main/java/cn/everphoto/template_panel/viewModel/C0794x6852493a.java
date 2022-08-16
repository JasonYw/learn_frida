package cn.everphoto.template_panel.viewModel;

import cn.everphoto.template_panel.model.C0790c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.cut_ui.TextItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C84S;

/* renamed from: cn.everphoto.template_panel.viewModel.CutSameMaterialViewModel$initTextEditManager$$inlined$apply$lambda$1 */
/* loaded from: classes4.dex */
public final class C0794x6852493a extends Lambda implements Function2<String, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C0790c $epTemplateWrapper$inlined;
    public final /* synthetic */ List $list$inlined;
    public final /* synthetic */ C84S $videoPresenter$inlined;
    public final /* synthetic */ C0801a this$0;

    static {
        Covode.recordClassIndex(3831);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794x6852493a(C0801a c0801a, C84S c84s, C0790c c0790c, List list) {
        super(2);
        this.this$0 = c0801a;
        this.$videoPresenter$inlined = c84s;
        this.$epTemplateWrapper$inlined = c0790c;
        this.$list$inlined = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(String str, String str2) {
        String str3 = str2;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{str, str3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str, str3);
            Iterator<TextItem> it = this.this$0.LJIIIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next().getMaterialId(), str)) {
                        if (i != -1) {
                            this.this$0.LJIIIZ.set(i, TextItem.copy$default(this.this$0.LJIIIZ.get(i), 0L, false, null, 0.0d, 0L, str3, 31, null));
                        }
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            this.$videoPresenter$inlined.LIZ(this.this$0.LJIIIZ.get(i));
            this.$videoPresenter$inlined.mo23604LJ();
        }
        return Unit.INSTANCE;
    }
}
