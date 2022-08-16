package com.bytedance.android.live.liveinteract.voicechat.match;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.model.C6192s;
import com.bytedance.android.livesdk.config.C6885cg;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C78867H7d;

/* loaded from: classes3.dex */
public final class ChatMatchDialog$onViewCreated$$inlined$let$lambda$2$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C6192s $matchData;
    public final /* synthetic */ C78867H7d this$0;

    static {
        Covode.recordClassIndex(31459);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMatchDialog$onViewCreated$$inlined$let$lambda$2$1(C78867H7d c78867H7d, C6192s c6192s) {
        super(0);
        this.this$0 = c78867H7d;
        this.$matchData = c6192s;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            SettingKey<C6885cg> settingKey = LiveSettingKeys.FASTMATCH_OPTIMIZE_V2_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().LIZIZ()) {
                this.this$0.LIZIZ.LIZIZ(this.$matchData);
            } else {
                this.this$0.LIZIZ.LIZ(this.$matchData);
            }
        }
        return Unit.INSTANCE;
    }
}
