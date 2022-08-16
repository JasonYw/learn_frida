package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.ObservableEmitter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class MessageVersionAdapter$sendSeiV2Format$1$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ObservableEmitter $emitter;

    static {
        Covode.recordClassIndex(19376);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageVersionAdapter$sendSeiV2Format$1$1(ObservableEmitter observableEmitter) {
        super(1);
        this.$emitter = observableEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            this.$emitter.onNext(str);
            this.$emitter.onComplete();
        }
        return Unit.INSTANCE;
    }
}
