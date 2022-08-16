package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class PreviewAudioInteractModeViewModel$4 extends Lambda implements Function2<AudioInteractMode, AudioInteractMode, AudioInteractMode> {
    public static final PreviewAudioInteractModeViewModel$4 INSTANCE = new PreviewAudioInteractModeViewModel$4();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18121);
    }

    public PreviewAudioInteractModeViewModel$4() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.broadcast.model.AudioInteractMode, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ AudioInteractMode invoke(AudioInteractMode audioInteractMode, AudioInteractMode audioInteractMode2) {
        AudioInteractMode audioInteractMode3 = audioInteractMode2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{audioInteractMode, audioInteractMode3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(audioInteractMode, audioInteractMode3);
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJJLIL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(Integer.valueOf(audioInteractMode3.f25910id));
        return audioInteractMode3;
    }
}
