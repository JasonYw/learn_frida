package com.bytedance.android.live.broadcastgame.effectgame;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.KVP;
import p003X.KVQ;

/* loaded from: classes5.dex */
public final class EffectGameEngine$runEffectGame$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectGameEngine this$0;

    static {
        Covode.recordClassIndex(19738);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectGameEngine$runEffectGame$1(EffectGameEngine effectGameEngine) {
        super(0);
        this.this$0 = effectGameEngine;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        KVQ kvq;
        Dialog dialog;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            EffectGameEngine effectGameEngine = this.this$0;
            if (!PatchProxy.proxy(new Object[0], effectGameEngine, EffectGameEngine.LIZ, false, 17).isSupported) {
                StringBuilder sb = new StringBuilder("showChooseMusicView sticker.id: ");
                Sticker sticker = effectGameEngine.LIZJ;
                if (sticker == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                sb.append(sticker.getId());
                ALogger.m15800e("EffectGameEngine", sb.toString());
                KVQ kvq2 = effectGameEngine.f26045LJ;
                if (kvq2 == null || (dialog = kvq2.getDialog()) == null || !dialog.isShowing()) {
                    KVP kvp = KVQ.LJIIIIZZ;
                    long j = effectGameEngine.LJIIIIZZ;
                    Sticker sticker2 = effectGameEngine.LIZJ;
                    if (sticker2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    long id = sticker2.getId();
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{kvp, new Long(j), new Long(id), (byte) 0, 4, null}, null, KVP.LIZ, true, 2);
                    if (proxy.isSupported) {
                        kvq = (KVQ) proxy.result;
                    } else {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{new Long(j), new Long(id), (byte) 1}, kvp, KVP.LIZ, false, 1);
                        if (proxy2.isSupported) {
                            kvq = (KVQ) proxy2.result;
                        } else {
                            kvq = new KVQ();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("key_is_vertical", true);
                            bundle.putLong("key_room_id", j);
                            bundle.putLong("key_effect_id", id);
                            kvq.setArguments(bundle);
                        }
                    }
                    kvq.LJII = effectGameEngine.LJIIL;
                    kvq.show(effectGameEngine.LJIIIZ, "chooseMusicDialogTag");
                    effectGameEngine.f26045LJ = kvq;
                    IInteractGameMonitorService iInteractGameMonitorService = (IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class);
                    C3384q c3384q = effectGameEngine.LIZIZ;
                    if (c3384q == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    iInteractGameMonitorService.logEffectGameMusicShow(0, c3384q);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
