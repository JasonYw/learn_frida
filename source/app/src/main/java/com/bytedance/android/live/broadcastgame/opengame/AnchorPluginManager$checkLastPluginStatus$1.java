package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.live.broadcastgame.opengame.message.C3510ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AnchorPluginManager$checkLastPluginStatus$1 extends Lambda implements Function3<Long, Long, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $copy;

    static {
        Covode.recordClassIndex(19885);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorPluginManager$checkLastPluginStatus$1(Ref.ObjectRef objectRef) {
        super(3);
        this.$copy = objectRef;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.bytedance.android.live.broadcastgame.opengame.message.ac] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(Long l, Long l2, String str) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{new Long(longValue), new Long(longValue2), str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            this.$copy.element = new C3510ac(str2, longValue, -1L, longValue2, 2L);
        }
        return Unit.INSTANCE;
    }
}
