package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewGroupFansWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.platform.IHostAction;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.event.C5991b;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import p003X.AbstractC4569445g;
import p003X.AbstractC78440Gw6;
import p003X.C2XE;
import p003X.C3DD;
import p003X.C87010KQi;
import p003X.LK0;

/* loaded from: classes12.dex */
public final class PreviewGroupFansWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C9078n LIZIZ;
    public String LIZJ;
    public DialogFragment LIZLLL;

    /* renamed from: LJ */
    public Disposable f25987LJ;
    public final LK0 LJFF = C3DD.LIZ;
    public final AbstractC78440Gw6 LJI = new AbstractC78440Gw6() { // from class: X.3DA
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(18522);
        }

        @Override // p003X.AbstractC78440Gw6
        public final void LIZ(Object obj) {
            String str;
            if (!PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported && (str = PreviewGroupFansWidget.this.LIZJ) != null) {
                ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(PreviewGroupFansWidget.this.getContext(), str);
            }
        }
    };

    static {
        Covode.recordClassIndex(18518);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewGroupFansWidget";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.f25987LJ = C87010KQi.LIZ().LIZ(C5991b.class).subscribe(new Consumer<C5991b>() { // from class: X.3D9
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18520);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5991b c5991b) {
                C5991b c5991b2 = c5991b;
                if (!PatchProxy.proxy(new Object[]{c5991b2}, this, LIZ, false, 1).isSupported) {
                    PreviewGroupFansWidget.this.LIZ(c5991b2.LIZIZ, c5991b2.LIZJ, c5991b2.LIZLLL, c5991b2.f26841LJ);
                }
            }
        }, C2XE.LIZIZ);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        DialogFragment dialogFragment;
        C9078n c9078n;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        Disposable disposable = this.f25987LJ;
        if (disposable != null) {
            disposable.dispose();
        }
        C9078n c9078n2 = this.LIZIZ;
        if (c9078n2 != null && c9078n2.getFragmentManager() != null && (c9078n = this.LIZIZ) != null) {
            c9078n.dismiss();
        }
        DialogFragment dialogFragment2 = this.LIZLLL;
        if (dialogFragment2 != null && dialogFragment2.getFragmentManager() != null && (dialogFragment = this.LIZLLL) != null) {
            dialogFragment.dismiss();
        }
    }

    public final void LIZ(String str, String str2, String str3, WeakReference<Context> weakReference) {
        FragmentManager supportFragmentManager;
        DialogFragment dialogFragment;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, weakReference}, this, LIZ, false, 3).isSupported) {
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            context = this.context;
        }
        ALogger.m15800e(LIZ(), "PreviewGroupFansWidget startGroupManagerFragment conversationId : " + str + ", enterFrom: " + str2 + " , context: " + this.context);
        if (context != null && (context instanceof FragmentActivity)) {
            try {
                this.LIZJ = str3;
                this.LIZLLL = ((IHostAction) ServiceManager.getService(IHostAction.class)).startGroupManagerFragment(str, str2, this.LJFF, this.LJI);
                if (!(context instanceof FragmentActivity)) {
                    context = null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (!supportFragmentManager.isStateSaved()) && (dialogFragment = this.LIZLLL) != null) {
                    dialogFragment.show(supportFragmentManager, getClass().getCanonicalName());
                }
            } catch (IllegalStateException e) {
                ALogger.m15800e(LIZ(), "PreviewGroupFansWidget startGroupManager fail " + e.getMessage());
            }
        }
    }
}
