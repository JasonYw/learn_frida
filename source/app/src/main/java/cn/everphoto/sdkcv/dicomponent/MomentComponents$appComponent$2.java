package cn.everphoto.sdkcv.dicomponent;

import cn.everphoto.core.cvinfo.cache.AbstractC0770c;
import cn.everphoto.core.cvinfo.cache.AppDatabase;
import cn.everphoto.core.localmedia.AbstractC0776b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC116400Vru;
import p003X.AbstractC116417VsB;
import p003X.AbstractC116419VsD;
import p003X.AbstractC116420VsE;
import p003X.C106007Rof;
import p003X.C106862S5w;
import p003X.C116350Vr6;
import p003X.C116361VrH;
import p003X.C116366VrM;
import p003X.C116398Vrs;
import p003X.C116399Vrt;
import p003X.C116401Vrv;
import p003X.C116402Vrw;
import p003X.C116404Vry;
import p003X.C116406Vs0;
import p003X.C116407Vs1;
import p003X.C116408Vs2;
import p003X.C116409Vs3;
import p003X.C116414Vs8;
import p003X.C116416VsA;
import p003X.C116462Vsu;
import p003X.RunnableC116413Vs7;
import p003X.S9B;
import p003X.S9D;
import p003X.S9X;

/* loaded from: classes13.dex */
public final class MomentComponents$appComponent$2 extends Lambda implements Function0<C07801> {
    public static final MomentComponents$appComponent$2 INSTANCE = new MomentComponents$appComponent$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3677);
    }

    public MomentComponents$appComponent$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [cn.everphoto.sdkcv.dicomponent.MomentComponents$appComponent$2$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [cn.everphoto.sdkcv.dicomponent.MomentComponents$appComponent$2$1] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C07801 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        S9B s9b = C116409Vs3.LIZ(C116409Vs3.LIZJ).f14242LJ;
        if (s9b == null) {
            s9b = new C116416VsA();
        }
        float[] fArr = C116409Vs3.LIZ(C116409Vs3.LIZJ).LIZJ;
        S9D s9d = C116409Vs3.LIZ(C116409Vs3.LIZJ).LIZIZ;
        AbstractC116400Vru abstractC116400Vru = C116409Vs3.LIZ(C116409Vs3.LIZJ).LIZLLL;
        AbstractC116420VsE abstractC116420VsE = C116409Vs3.LIZ(C116409Vs3.LIZJ).LJFF;
        AppDatabase LIZ = AppDatabase.LIZ("moment");
        Intrinsics.checkExpressionValueIsNotNull(LIZ, "");
        C116401Vrv.LIZJ.LIZ(new C116366VrM(abstractC116400Vru, LIZ, false));
        C116401Vrv c116401Vrv = C116401Vrv.LIZJ;
        AbstractC116419VsD abstractC116419VsD = C116409Vs3.LIZ(C116409Vs3.LIZJ).LIZ;
        if (!PatchProxy.proxy(new Object[]{abstractC116419VsD}, c116401Vrv, C116401Vrv.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(abstractC116419VsD);
            C116401Vrv.LIZIZ = abstractC116419VsD;
        }
        Integer.valueOf(-1);
        AbstractC0776b LIZ2 = C116401Vrv.LIZJ.LIZ();
        C116361VrH c116361VrH = new C116361VrH(LIZ, LIZ2);
        Object obj = new Object();
        S9X s9x = new S9X(s9d, fArr, obj);
        C116406Vs0 c116406Vs0 = new C116406Vs0(s9d, s9b, abstractC116400Vru, abstractC116400Vru, obj);
        C116407Vs1 c116407Vs1 = new C116407Vs1(abstractC116400Vru, abstractC116400Vru, abstractC116400Vru, s9d, obj);
        C116399Vrt c116399Vrt = new C116399Vrt(s9x, c116406Vs0, c116407Vs1);
        C116350Vr6 c116350Vr6 = new C116350Vr6(LIZ);
        C116398Vrs c116398Vrs = new C116398Vrs(CollectionsKt__CollectionsKt.arrayListOf("Moment"), c116361VrH, abstractC116420VsE);
        C116414Vs8 c116414Vs8 = new C116414Vs8(c116399Vrt, c116361VrH, LIZ2);
        C116404Vry c116404Vry = new C116404Vry(s9x, LIZ2, c116361VrH, c116398Vrs, s9b);
        C116402Vrw c116402Vrw = new C116402Vrw(s9x, c116406Vs0, c116350Vr6, c116361VrH, c116404Vry, LIZ2, c116398Vrs);
        C116408Vs2 c116408Vs2 = new C116408Vs2(c116350Vr6, c116361VrH, c116407Vs1);
        if (!PatchProxy.proxy(new Object[0], c116414Vs8, C116414Vs8.LIZ, false, 1).isSupported) {
            C116462Vsu.LIZ(C106007Rof.LIZ(), new RunnableC116413Vs7(c116414Vs8));
        }
        return new AbstractC116417VsB(c116414Vs8, c116404Vry, c116406Vs0, c116402Vrw, c116408Vs2, LIZ2, s9x, c116361VrH, c116350Vr6, LIZ) { // from class: cn.everphoto.sdkcv.dicomponent.MomentComponents$appComponent$2.1
            public final /* synthetic */ AbstractC0770c LIZ;

            static {
                Covode.recordClassIndex(3678);
            }

            @Override // p003X.AbstractC116417VsB
            public final AbstractC0770c LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = c116361VrH;
            }
        };
    }
}
