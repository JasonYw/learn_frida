package com.bytedance.android.live.liveinteract.voicechat;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public class VoiceChatSceneBaseWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;

    static {
        Covode.recordClassIndex(30845);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final WidgetManager LIZ(WidgetManager widgetManager, int i, Widget widget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{widgetManager, Integer.valueOf(i), widget}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (WidgetManager) proxy.result;
        }
        C106862S5w.LIZ(widgetManager, widget);
        if (widget.contentView == null) {
            widgetManager.load(i, widget, false);
            return widgetManager;
        }
        ViewGroup viewGroup = (ViewGroup) widgetManager.contentView.findViewById(i);
        widget.setWidgetCallback(widgetManager.widgetCallback);
        widget.context = widgetManager.context;
        widget.dataCenter = widgetManager.dataCenter;
        widget.containerView = viewGroup;
        Map<Widget, ViewGroup> map = widgetManager.widgetViewGroupHashMap;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put(widget, viewGroup);
        if (widgetManager.widgetConfigHandler != null) {
            WidgetManager.IWidgetConfigHandler iWidgetConfigHandler = widgetManager.widgetConfigHandler;
            Intrinsics.checkNotNull(iWidgetConfigHandler);
            iWidgetConfigHandler.onLoad(widget);
        }
        widgetManager.continueLoad(widget, viewGroup, widget.contentView);
        return widgetManager;
    }
}
