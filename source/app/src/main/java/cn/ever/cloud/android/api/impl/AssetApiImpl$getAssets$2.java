package cn.ever.cloud.android.api.impl;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.android.entity.Asset;
import cn.ever.cloud.android.entity.AssetQuery;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.utils.MeasureKt;
import cn.ever.cloud.utils.MeasureReport;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.AssetApiImpl$getAssets$2", m135f = "AssetApiImpl.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_TILT}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AssetApiImpl$getAssets$2 extends SuspendLambda implements Function1<Continuation<? super PageData<Asset>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AssetQuery $assetQuery;
    public int label;
    public final /* synthetic */ AssetApiImpl this$0;

    static {
        Covode.recordClassIndex(2777);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetApiImpl$getAssets$2(AssetApiImpl assetApiImpl, AssetQuery assetQuery, Continuation continuation) {
        super(1, continuation);
        this.this$0 = assetApiImpl;
        this.$assetQuery = assetQuery;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AssetApiImpl$getAssets$2(this.this$0, this.$assetQuery, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PageData<Asset>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: cn.ever.cloud.android.api.impl.AssetApiImpl$getAssets$2$2 */
    /* loaded from: classes23.dex */
    public static final class C06882 extends Lambda implements Function1<MeasureReport, Unit> {
        public static final C06882 INSTANCE = new C06882();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2779);
        }

        public C06882() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(MeasureReport measureReport) {
            invoke2(measureReport);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MeasureReport measureReport) {
            if (PatchProxy.proxy(new Object[]{measureReport}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(measureReport);
            MonitorKit.INSTANCE.assetService("fetchAssets", Long.valueOf(measureReport.getDurationMs()));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C06871 c06871 = new C06871(null);
            C06882 c06882 = C06882.INSTANCE;
            this.label = 1;
            obj = MeasureKt.measureTimeForMonitor("fetchAssets", null, c06871, c06882, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.AssetApiImpl$getAssets$2$1", m135f = "AssetApiImpl.kt", m134i = {}, m133l = {}, m132m = "invokeSuspend", m131n = {}, m130s = {})
    /* renamed from: cn.ever.cloud.android.api.impl.AssetApiImpl$getAssets$2$1 */
    /* loaded from: classes23.dex */
    public static final class C06871 extends SuspendLambda implements Function1<Continuation<? super PageData<Asset>>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int label;

        static {
            Covode.recordClassIndex(2778);
        }

        public C06871(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Continuation) proxy.result;
            }
            C106862S5w.LIZ(continuation);
            return new C06871(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PageData<Asset>> continuation) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
            return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return AssetApiImpl$getAssets$2.this.this$0.client.fetchAssets(AssetApiImpl$getAssets$2.this.$assetQuery.getAlbumId(), AssetApiImpl$getAssets$2.this.$assetQuery.getPageParams().getCursor(), AssetApiImpl$getAssets$2.this.$assetQuery.getPageParams().getCount());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
