package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.android.live.broadcast.api.model.C2919v;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.room.AbstractC5503n;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p1594ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C86738KFw;
import p003X.C86816KIw;
import p003X.KD4;
import p003X.KD5;
import p003X.KD6;

/* loaded from: classes5.dex */
public final class PreviewStickerWidget$getStickerFromSourceParam$1 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewStickerWidget this$0;

    static {
        Covode.recordClassIndex(18710);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewStickerWidget$getStickerFromSourceParam$1(PreviewStickerWidget previewStickerWidget) {
        super(1);
        this.this$0 = previewStickerWidget;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewStickerWidget$getStickerFromSourceParam$1$1 */
    /* loaded from: classes5.dex */
    public static final class C33021 implements IFetchEffectListener {
        public static ChangeQuickRedirect LIZ;
        public final KD5 LIZIZ = new KD5(this);

        static {
            Covode.recordClassIndex(18711);
        }

        @Override // com.p1594ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        public C33021() {
        }

        @Override // com.p1594ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            if (!PatchProxy.proxy(new Object[]{effect2}, this, LIZ, false, 2).isSupported) {
                PreviewStickerWidget previewStickerWidget = PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0;
                Disposable subscribe = C86738KFw.LIZ(effect2).subscribe(new KD4(this, effect2), new KD6(this, effect2));
                Intrinsics.checkNotNullExpressionValue(subscribe, "");
                previewStickerWidget.LIZ(subscribe);
            }
        }

        public final void LIZ(Sticker sticker) {
            if (PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 1).isSupported) {
                return;
            }
            if (PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0.isViewValid) {
                ALogger.m15801d(PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0.LIZ(), "start add sticker from sourceParam");
                PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0.LJIIJJI().LIZLLL().LIZ(sticker);
                AbstractC5503n hostStickerViewService = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).hostStickerViewService();
                if (hostStickerViewService != null) {
                    Context context = PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0.context;
                    if (context != null) {
                        hostStickerViewService.LIZ((AppCompatActivity) context, sticker, PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0.m15860LJ(), true, true);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
                }
                return;
            }
            ALogger.m15800e(PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0.LIZ(), "widget invalid,skip add sticker from sourceParam");
        }

        @Override // com.p1594ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            if (PatchProxy.proxy(new Object[]{effect, exceptionResult}, this, LIZ, false, 3).isSupported) {
                return;
            }
            C106862S5w.LIZ(exceptionResult);
            String LIZ2 = PreviewStickerWidget$getStickerFromSourceParam$1.this.this$0.LIZ();
            ALogger.m15799e(LIZ2, "sync effect error for [" + effect + LoggerUtil.M_RIGHT_TAG, exceptionResult.getException());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        boolean z;
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            C2919v LIZ = previewSourceParam2.LIZ();
            String LIZ2 = this.this$0.LIZ();
            ALogger.m15795w(LIZ2, "getPayload:" + LIZ);
            String str = "";
            if (previewSourceParam2.stickerId != null) {
                String str2 = previewSourceParam2.stickerId;
                if (str2 != null) {
                    str = str2;
                }
                String LIZ3 = this.this$0.LIZ();
                ALogger.m15795w(LIZ3, "get stickerId:" + str + " from sourceParam");
            }
            if (LIZ != null) {
                String LIZ4 = C86816KIw.LIZ(LIZ);
                if (LIZ4.length() > 0) {
                    PreviewStickerWidget previewStickerWidget = this.this$0;
                    if (Intrinsics.areEqual(previewSourceParam2.stickerTaskOptional, Boolean.FALSE) && str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    previewStickerWidget.LJIILL = z;
                    String LIZ5 = this.this$0.LIZ();
                    ALogger.m15795w(LIZ5, "get task_id " + LIZ4 + " from sourceParam , needShowToast = " + this.this$0.LJIILL);
                }
            }
            if (str.length() > 0) {
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ().LIZ(str, new C33021());
            } else {
                ALogger.m15800e(this.this$0.LIZ(), "stickerID null, skip");
            }
        }
        return Unit.INSTANCE;
    }
}
