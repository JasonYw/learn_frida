package com.bytedance.android.live.broadcastgame.channel.receiver.helper;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6893co;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.receiver.helper.b */
/* loaded from: classes5.dex */
public final class C3440b implements AbstractC3441c {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public static final long f26043LJ;
    public static final long LJFF;
    public long LIZIZ;
    public long LIZJ = -1;
    public long LIZLLL = -1;

    public C3440b() {
        SettingKey<C6893co> settingKey = LiveConfigSettingKeys.LIVE_GAME_AAM_DELAY_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LIZIZ = settingKey.getValue().LIZLLL;
    }

    static {
        Covode.recordClassIndex(19555);
        SettingKey<C6893co> settingKey = LiveConfigSettingKeys.LIVE_GAME_AAM_DELAY_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        f26043LJ = settingKey.getValue().LIZIZ;
        SettingKey<C6893co> settingKey2 = LiveConfigSettingKeys.LIVE_GAME_AAM_DELAY_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        LJFF = settingKey2.getValue().LIZJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.channel.receiver.helper.AbstractC3441c
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 2).isSupported || j == 0) {
            return;
        }
        this.LIZLLL = j;
        this.LIZJ = System.currentTimeMillis();
    }

    public final long LIZIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (j > 0) {
            long j2 = this.LIZLLL;
            if (j2 > 0 && this.LIZJ > 0) {
                this.LIZIZ = Math.max(LJFF, Math.min(f26043LJ, (j - j2) - (System.currentTimeMillis() - this.LIZJ)));
                return this.LIZIZ;
            }
        }
        return this.LIZIZ;
    }
}
