package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerClient;
import com.bytedance.android.livesdkapi.roomplayer.IRoomEventHub;
import com.bytedance.android.livesdkapi.roomplayer.LivePlayerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80103Hhp;

/* loaded from: classes3.dex */
public final class PkPreviewWindow$startShowPreView$$inlined$let$lambda$1 extends Lambda implements Function1<LifecycleOwner, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FrameLayout.LayoutParams $layoutParams$inlined;
    public final /* synthetic */ Room $room$inlined;
    public final /* synthetic */ PkPreviewWindow this$0;

    static {
        Covode.recordClassIndex(25628);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkPreviewWindow$startShowPreView$$inlined$let$lambda$1(PkPreviewWindow pkPreviewWindow, Room room, FrameLayout.LayoutParams layoutParams) {
        super(1);
        this.this$0 = pkPreviewWindow;
        this.$room$inlined = room;
        this.$layoutParams$inlined = layoutParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
        LivePlayerView livePlayerView;
        ILivePlayerClient client;
        IRoomEventHub eventHub;
        MutableLiveData<Boolean> firstFrame;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(lifecycleOwner2);
            PkPreviewWindow pkPreviewWindow = this.this$0;
            if (!PatchProxy.proxy(new Object[]{lifecycleOwner2}, pkPreviewWindow, PkPreviewWindow.LIZ, false, 4).isSupported && (livePlayerView = pkPreviewWindow.LIZJ) != null && (client = livePlayerView.getClient()) != null && (eventHub = client.getEventHub()) != null && (firstFrame = eventHub.getFirstFrame()) != null) {
                firstFrame.observe(lifecycleOwner2, new C80103Hhp(pkPreviewWindow));
            }
        }
        return Unit.INSTANCE;
    }
}
