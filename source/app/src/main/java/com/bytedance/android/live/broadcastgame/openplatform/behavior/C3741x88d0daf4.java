package com.bytedance.android.live.broadcastgame.openplatform.behavior;

import android.view.View;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88132Ko2;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.behavior.ToolbarOpenPlatformBehavior$showBubbleBindClickOpenSelf$$inlined$let$lambda$1 */
/* loaded from: classes3.dex */
public final class C3741x88d0daf4 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C6532d $command$inlined;
    public final /* synthetic */ View $it;
    public final /* synthetic */ C88132Ko2 this$0;

    static {
        Covode.recordClassIndex(21281);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3741x88d0daf4(View view, C88132Ko2 c88132Ko2, C6532d c6532d) {
        super(0);
        this.$it = view;
        this.this$0 = c88132Ko2;
        this.$command$inlined = c6532d;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Map<String, String> map = this.$command$inlined.LJIIIZ;
            String str2 = null;
            if (map != null) {
                str = map.get(PushMessageHelper.MESSAGE_TYPE);
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "grouppk")) {
                AbstractC4286c teamFightService = ((IInteractService) ServiceManager.getService(IInteractService.class)).teamFightService();
                if (teamFightService != null) {
                    teamFightService.LIZ("bubble");
                }
            } else {
                Map<String, String> map2 = this.$command$inlined.LJIIIZ;
                if (map2 != null) {
                    str2 = map2.get(PushMessageHelper.MESSAGE_TYPE);
                }
                if (Intrinsics.areEqual(str2, "room_grouppk")) {
                    ((IInteractService) ServiceManager.getService(IInteractService.class)).clickLinkRoomFightIcon("bubble");
                } else {
                    this.$it.performClick();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
