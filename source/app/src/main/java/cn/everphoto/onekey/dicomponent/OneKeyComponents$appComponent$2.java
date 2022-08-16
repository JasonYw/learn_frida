package cn.everphoto.onekey.dicomponent;

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
import p003X.AbstractC105998RoW;
import p003X.AbstractC106000RoY;
import p003X.AbstractC106009Roh;
import p003X.AbstractC116400Vru;
import p003X.AbstractC85989JuZ;
import p003X.C106004Roc;
import p003X.C116361VrH;
import p003X.C116363VrJ;
import p003X.C116373VrT;
import p003X.C116381Vrb;
import p003X.C116398Vrs;
import p003X.C116399Vrt;
import p003X.C116401Vrv;
import p003X.S9W;

/* loaded from: classes13.dex */
public final class OneKeyComponents$appComponent$2 extends Lambda implements Function0<C07781> {
    public static final OneKeyComponents$appComponent$2 INSTANCE = new OneKeyComponents$appComponent$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3658);
    }

    public OneKeyComponents$appComponent$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, cn.everphoto.onekey.dicomponent.OneKeyComponents$appComponent$2$1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [cn.everphoto.onekey.dicomponent.OneKeyComponents$appComponent$2$1] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C07781 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC85989JuZ abstractC85989JuZ = C106004Roc.LIZ(C106004Roc.LIZJ).LIZ;
        AbstractC116400Vru abstractC116400Vru = C106004Roc.LIZ(C106004Roc.LIZJ).LIZIZ;
        AppDatabase LIZ = AppDatabase.LIZ("onekey");
        Intrinsics.checkExpressionValueIsNotNull(LIZ, "");
        S9W s9w = new S9W(abstractC85989JuZ);
        C116363VrJ c116363VrJ = new C116363VrJ();
        C116373VrT c116373VrT = new C116373VrT(abstractC116400Vru, abstractC116400Vru, C106004Roc.LIZ(C106004Roc.LIZJ).LJFF.LIZLLL());
        C116399Vrt c116399Vrt = new C116399Vrt(s9w, c116363VrJ, c116373VrT);
        AbstractC0776b LIZ2 = C116401Vrv.LIZJ.LIZ();
        C116361VrH c116361VrH = new C116361VrH(LIZ, LIZ2);
        return new AbstractC106000RoY(s9w, new C116381Vrb(s9w, c116363VrJ, c116373VrT, new C116398Vrs(CollectionsKt__CollectionsKt.arrayListOf("Intelligent_Template"), c116361VrH, null), LIZ2, c116361VrH), LIZ, c116361VrH) { // from class: cn.everphoto.onekey.dicomponent.OneKeyComponents$appComponent$2.1
            public final /* synthetic */ AbstractC105998RoW LIZIZ;
            public final /* synthetic */ AbstractC0770c LIZJ;

            static {
                Covode.recordClassIndex(3659);
            }

            @Override // p003X.AbstractC106000RoY
            public final AbstractC106009Roh LIZ() {
                return AbstractC106009Roh.this;
            }

            @Override // p003X.AbstractC106000RoY
            public final AbstractC105998RoW LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZIZ = r3;
                this.LIZJ = c116361VrH;
            }
        };
    }
}
