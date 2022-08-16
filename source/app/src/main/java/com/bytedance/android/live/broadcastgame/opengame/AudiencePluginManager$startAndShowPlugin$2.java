package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.live.broadcastgame.api.openplatform.C3399e;
import com.bytedance.android.live.broadcastgame.opengame.message.C3516am;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.C87720KhO;
import p003X.C87733Khb;
import p003X.C87911KkT;
import p003X.DialogC87772KiE;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$startAndShowPlugin$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $appId;
    public final /* synthetic */ C3399e.C3400a $selfStarGameParam;
    public final /* synthetic */ Map $showParams;
    public final /* synthetic */ C87733Khb this$0;

    static {
        Covode.recordClassIndex(19902);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$startAndShowPlugin$2(C87733Khb c87733Khb, C3399e.C3400a c3400a, String str, Map map) {
        super(0);
        this.this$0 = c87733Khb;
        this.$selfStarGameParam = c3400a;
        this.$appId = str;
        this.$showParams = map;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        LIZ();
        return Unit.INSTANCE;
    }

    public final void LIZ() {
        String str;
        String str2;
        C3607p LJIIJ;
        String str3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        Map<String, String> map = this.this$0.LIZJ.LIZJ;
        C3399e.C3400a c3400a = this.$selfStarGameParam;
        String str4 = null;
        if (c3400a != null) {
            str = c3400a.LIZJ;
        } else {
            str = null;
        }
        C3399e.C3400a c3400a2 = this.$selfStarGameParam;
        if (c3400a2 != null) {
            str2 = c3400a2.LJII;
        } else {
            str2 = null;
        }
        map.put(str, str2);
        AbstractC3664m abstractC3664m = this.this$0.LJII;
        if (abstractC3664m != null && (LJIIJ = abstractC3664m.LJIIJ()) != null && LJIIJ.LJIIJ != null) {
            String str5 = this.$appId;
            C3399e.C3400a c3400a3 = this.$selfStarGameParam;
            if (c3400a3 != null) {
                str3 = c3400a3.LIZJ;
            } else {
                str3 = null;
            }
            if (Intrinsics.areEqual(str5, str3)) {
                this.this$0.LIZIZ(this.$appId, this.$showParams);
                return;
            }
        }
        C3399e.C3400a c3400a4 = this.$selfStarGameParam;
        if (c3400a4 != null) {
            if (!c3400a4.LJI) {
                C3516am c3516am = this.this$0.LIZLLL;
                if (c3516am != null) {
                    str4 = c3516am.LJI;
                }
                if (!Intrinsics.areEqual(str4, c3400a4.LIZJ)) {
                    C116971W2r.LIZJ(new DialogC87772KiE(this.this$0.LJIIL));
                    return;
                }
            }
            this.this$0.LIZ(new C3516am(c3400a4.LIZ, c3400a4.LIZIZ, 0L, 0L, c3400a4.LIZJ, c3400a4.LIZLLL, c3400a4.f26030LJ, null, 0L, null, c3400a4.LJFF, false, null, 0, 0, false, false, 3, null, 0, null, null, 4062092));
        }
        C87911KkT.LIZIZ.LIZ(C87720KhO.LIZ(), "startFromSelf");
    }
}
