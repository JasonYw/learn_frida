package com.bytedance.android.live.broadcast.playrank;

import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.DialogC89209LCx;

/* loaded from: classes5.dex */
public final class PlayerRankSettingDialog$initView$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC89209LCx this$0;

    static {
        Covode.recordClassIndex(17074);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerRankSettingDialog$initView$1(DialogC89209LCx dialogC89209LCx) {
        super(0);
        this.this$0 = dialogC89209LCx;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.this$0.getContext(), "sslocal://webcast_lynxview?type=popup&gravity=bottom&rate_height=450&load_taro=0&horizontal_width=375&url=https%3A%2F%2Flf-webcast-sourcecdn-tos.bytegecko.com%2Fobj%2Fbyte-gurd-source%2Fwebcast%2Fmono%2Flynx%2Fwebcast_native_lynx_douyin%2Fpages%2Faudiencelist%2Frule%2Ftemplate.js%3Fsource%3Daudience%26source_type%3D3%26types%3D%257B%2522types%2522%253A%255B3%255D%257D");
        }
        return Unit.INSTANCE;
    }
}
