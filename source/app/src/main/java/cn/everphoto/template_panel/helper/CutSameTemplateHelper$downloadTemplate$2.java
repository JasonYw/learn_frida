package cn.everphoto.template_panel.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.cut_ui.CutSource;
import com.p1594ss.android.ugc.cut_ui.p2814a.AbstractC29794a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractBinderC83198Iqe;
import p003X.AbstractC83194Iqa;
import p003X.C83227Ir7;

/* loaded from: classes4.dex */
public final class CutSameTemplateHelper$downloadTemplate$2 extends Lambda implements Function1<AbstractC29794a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CutSource $cutSource;
    public final /* synthetic */ AbstractBinderC83198Iqe $listener;
    public final /* synthetic */ String $md5;

    static {
        Covode.recordClassIndex(3793);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateHelper$downloadTemplate$2(CutSource cutSource, String str, AbstractBinderC83198Iqe abstractBinderC83198Iqe) {
        super(1);
        this.$cutSource = cutSource;
        this.$md5 = str;
        this.$listener = abstractBinderC83198Iqe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC29794a abstractC29794a) {
        AbstractC83194Iqa abstractC83194Iqa;
        MethodCollector.m14708i(258);
        AbstractC29794a abstractC29794a2 = abstractC29794a;
        if (!PatchProxy.proxy(new Object[]{abstractC29794a2}, this, changeQuickRedirect, false, 1).isSupported) {
            if (abstractC29794a2 != null) {
                abstractC29794a2.LIZ();
                abstractC83194Iqa = abstractC29794a2.LIZ(this.$cutSource, this.$md5);
                if (abstractC83194Iqa != null) {
                    abstractC83194Iqa.LIZ(this.$listener);
                    abstractC83194Iqa.LIZ();
                    C83227Ir7.LIZIZ = abstractC83194Iqa;
                }
            }
            abstractC83194Iqa = null;
            C83227Ir7.LIZIZ = abstractC83194Iqa;
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(258);
        return unit;
    }
}
