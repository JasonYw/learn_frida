package com.bytedance.android.live.liveinteract.plantform.utils;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.link.C7017b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C419722jG;
import p003X.C536537Hj;

/* loaded from: classes12.dex */
public final class IMStreamInfoSender$internalTask$2 extends Lambda implements Function0<Disposable> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C419722jG this$0;

    static {
        Covode.recordClassIndex(29498);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMStreamInfoSender$internalTask$2(C419722jG c419722jG) {
        super(0);
        this.this$0 = c419722jG;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [io.reactivex.disposables.Disposable, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Disposable mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        SettingKey<C7017b> settingKey = LiveConfigSettingKeys.LIVE_STREAM_INFO_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Observable<Long> observeOn = C536537Hj.LIZ(0L, settingKey.getValue().LIZJ, TimeUnit.SECONDS).observeOn(Schedulers.m138io());
        final C48281 c48281 = new C48281(this.this$0);
        return observeOn.subscribe(new Consumer() { // from class: X.2U8
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(29549);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
            }
        });
    }

    /* renamed from: com.bytedance.android.live.liveinteract.plantform.utils.IMStreamInfoSender$internalTask$2$1 */
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class C48281 extends FunctionReferenceImpl implements Function1<Long, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29499);
        }

        public C48281(C419722jG c419722jG) {
            super(1, c419722jG, C419722jG.class, "consumeInfo", "consumeInfo(J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l) {
            long longValue = l.longValue();
            if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
                ((C419722jG) this.receiver).LIZ(longValue);
            }
            return Unit.INSTANCE;
        }
    }
}
