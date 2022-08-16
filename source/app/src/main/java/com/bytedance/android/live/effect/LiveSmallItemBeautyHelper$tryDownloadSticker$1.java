package com.bytedance.android.live.effect;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class LiveSmallItemBeautyHelper$tryDownloadSticker$1 extends Lambda implements Function2<n$b, Sticker, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $uiThread;

    static {
        Covode.recordClassIndex(24281);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSmallItemBeautyHelper$tryDownloadSticker$1(boolean z) {
        super(2);
        this.$uiThread = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(n$b n_b, Sticker sticker) {
        LIZ(n_b, sticker);
        return Unit.INSTANCE;
    }

    public final void LIZ(final n$b n_b, final Sticker sticker) {
        if (PatchProxy.proxy(new Object[]{n_b, sticker}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (this.$uiThread) {
            if (sticker != null) {
                if (n_b != null) {
                    n_b.LIZ(sticker);
                    return;
                }
                return;
            } else if (n_b != null) {
                n_b.LIZ();
                return;
            } else {
                return;
            }
        }
        AndroidSchedulers.mainThread().scheduleDirect(new Runnable() { // from class: com.bytedance.android.live.effect.LiveSmallItemBeautyHelper$tryDownloadSticker$1.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24282);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                Sticker sticker2 = Sticker.this;
                if (sticker2 != null) {
                    n$b n_b2 = n_b;
                    if (n_b2 != null) {
                        n_b2.LIZ(sticker2);
                        return;
                    }
                    return;
                }
                n$b n_b3 = n_b;
                if (n_b3 != null) {
                    n_b3.LIZ();
                }
            }
        });
    }
}
