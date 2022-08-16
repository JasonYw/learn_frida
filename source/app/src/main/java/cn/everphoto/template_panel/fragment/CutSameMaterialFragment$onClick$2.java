package cn.everphoto.template_panel.fragment;

import cn.everphoto.template_panel.model.C0790c;
import cn.everphoto.template_panel.viewModel.C0801a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC83316IsY;
import p003X.C83189IqV;
import p003X.C83227Ir7;
import p003X.C83312IsU;
import p003X.C83314IsW;

/* loaded from: classes4.dex */
public final class CutSameMaterialFragment$onClick$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83312IsU this$0;

    static {
        Covode.recordClassIndex(3711);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameMaterialFragment$onClick$2(C83312IsU c83312IsU) {
        super(0);
        this.this$0 = c83312IsU;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Long l;
        C83189IqV c83189IqV;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C0801a LIZJ = this.this$0.LIZJ();
            if (!PatchProxy.proxy(new Object[0], LIZJ, C0801a.LIZ, false, 29).isSupported) {
                ArrayList arrayList = new ArrayList();
                int size = LIZJ.LJI.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(LIZJ.LJI.valueAt(i));
                }
                LIZJ.LJIL.setValue(CollectionsKt___CollectionsKt.toList(arrayList));
                for (MediaItem mediaItem : CollectionsKt___CollectionsKt.toList(arrayList)) {
                    Pair<Integer, MediaItem> LIZ = C83227Ir7.LIZ(LIZJ.LJII, mediaItem);
                    if (LIZ != null && (c83189IqV = LIZJ.LJIILJJIL) != null) {
                        c83189IqV.LIZ(LIZJ.LJII.get(LIZ.getFirst().intValue()));
                    }
                }
                LIZJ.LJI.clear();
            }
            C83314IsW c83314IsW = this.this$0.LIZJ().LJIILIIL;
            if (c83314IsW != null && !PatchProxy.proxy(new Object[0], c83314IsW, C83314IsW.LIZ, false, 9).isSupported) {
                c83314IsW.LIZIZ.LJIIIZ();
            }
            this.this$0.LIZLLL();
            AbstractC83316IsY abstractC83316IsY = this.this$0.LIZJ().LJFF;
            if (abstractC83316IsY != null) {
                C0790c c0790c = this.this$0.LIZIZ().LJIIIIZZ;
                if (c0790c != null) {
                    l = Long.valueOf(c0790c.LIZ());
                } else {
                    l = null;
                }
                abstractC83316IsY.LJIILL(l);
            }
        }
        return Unit.INSTANCE;
    }
}
