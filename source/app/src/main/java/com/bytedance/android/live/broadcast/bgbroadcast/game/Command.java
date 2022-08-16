package com.bytedance.android.live.broadcast.bgbroadcast.game;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C88799Kyn;

/* loaded from: classes5.dex */
public enum Command {
    CMD_SNAPPED_TIMER_ENDED,
    CMD_HIDE_MSG_WINDOW,
    CMD_ORIENTATION_CHANGED,
    CMD_NEW_COMMON_MSG,
    CMD_NEW_REMIND_MSG,
    CMD_READ_REMIND_MSG,
    CMD_LINK_MIC_MSG,
    CMD_CLICK_FLOAT_BALL,
    CMD_CLICK_MSG_BTN_CHECKED,
    CMD_CLICK_MSG_BTN_UNCHECKED,
    CMD_CLICK_GAME_PROMOTE_BTN,
    CMD_CLICK_GAME_PLAY_TOGETHER_BTN,
    CMD_CTRL_MENU_COLLAPSE,
    CMD_DRAG_MOVE_START,
    CMD_DRAG_ONGOING,
    CMD_DRAG_MOVE_END,
    CMD_TRANSITION_TO_INIT,
    CMD_TRANSITION_TO_HIDDEN,
    CMD_TRANSITION_TO_DESTROY,
    CMD_TRANSITION_TO_FLOATING,
    CMD_TRANSITION_TO_SNAPPED;
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public C88799Kyn currentState;
    public Object param;

    static {
        Covode.recordClassIndex(14703);
    }

    public static Command valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (Command) (proxy.isSupported ? proxy.result : Enum.valueOf(Command.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Command[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (Command[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
