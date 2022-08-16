package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C86676KDm;
import p003X.C86743KGb;

/* loaded from: classes5.dex */
public final class GameConditionChecker$StickerChecker$handler$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $onSuccess;
    public final /* synthetic */ boolean $soundUsing;

    static {
        Covode.recordClassIndex(19611);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConditionChecker$StickerChecker$handler$1(boolean z, Function1 function1) {
        super(1);
        this.$soundUsing = z;
        this.$onSuccess = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$onSuccess.invoke(new C86743KGb(CollectionsKt__CollectionsKt.arrayListOf(C86676KDm.LIZLLL, C86676KDm.LIZJ), this.$soundUsing));
        }
        return Unit.INSTANCE;
    }
}
