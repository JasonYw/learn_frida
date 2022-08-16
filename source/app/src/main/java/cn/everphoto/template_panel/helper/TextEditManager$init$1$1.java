package cn.everphoto.template_panel.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.cut_ui_impl.textedit.C29826b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C83382Itc;

/* loaded from: classes4.dex */
public final class TextEditManager$init$1$1 extends Lambda implements Function1<C29826b, Unit> {
    public static final TextEditManager$init$1$1 INSTANCE = new TextEditManager$init$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3794);
    }

    public TextEditManager$init$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C29826b c29826b) {
        C29826b c29826b2 = c29826b;
        if (!PatchProxy.proxy(new Object[]{c29826b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c29826b2);
            c29826b2.LJIIIIZZ = C83382Itc.f7789LJ;
            c29826b2.LJII = C83382Itc.LIZLLL;
            c29826b2.f39842LJ = C83382Itc.LJII;
            c29826b2.LJFF = C83382Itc.LJII;
            c29826b2.LJI = C83382Itc.LJIIIIZZ * 2.0f;
        }
        return Unit.INSTANCE;
    }
}
