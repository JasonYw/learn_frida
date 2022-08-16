package cn.everphoto.template_panel.fragment;

import cn.everphoto.template_panel.model.C0790c;
import cn.everphoto.template_panel.viewModel.C0803c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC83316IsY;
import p003X.C83339Isv;

/* loaded from: classes4.dex */
public final class CutSameRootFragment$cancelAction$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83339Isv this$0;

    static {
        Covode.recordClassIndex(3715);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameRootFragment$cancelAction$2(C83339Isv c83339Isv) {
        super(0);
        this.this$0 = c83339Isv;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Long l;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC83316IsY abstractC83316IsY = this.this$0.LIZ().f21078LJ;
            Object obj = null;
            if (abstractC83316IsY != null) {
                C0790c c0790c = this.this$0.LIZIZ().LJIIIIZZ;
                if (c0790c != null) {
                    l = Long.valueOf(c0790c.LIZ());
                } else {
                    l = null;
                }
                abstractC83316IsY.LJI(l);
            }
            C83339Isv c83339Isv = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c83339Isv, C83339Isv.LIZ, false, 28).isSupported) {
                C0803c LIZIZ = c83339Isv.LIZIZ();
                Iterator<T> it = LIZIZ.LJIILLIIL.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C0790c) next).LIZ() == LIZIZ.LJFF) {
                        obj = next;
                        break;
                    }
                }
                LIZIZ.LJIIIIZZ = (C0790c) obj;
                if (LIZIZ.LJFF == -1) {
                    LIZIZ.LIZ();
                } else {
                    LIZIZ.LIZ(LIZIZ.LJIIJ, 0);
                }
                if (!PatchProxy.proxy(new Object[0], LIZIZ, C0803c.LIZ, false, 9).isSupported) {
                    LIZIZ.LJJIIJZLJL.setValue(Boolean.TRUE);
                }
            }
            this.this$0.LJII();
        }
        return Unit.INSTANCE;
    }
}
