package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public interface GameInviteState {

    /* loaded from: classes5.dex */
    public enum InviteStateType {
        INIT,
        INVITE_SEND,
        INVITE_CANCEL,
        INVITE_ERROR,
        INVITE_ACCEPT,
        INVITE_REJECT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19096);
        }

        public static InviteStateType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (InviteStateType) (proxy.isSupported ? proxy.result : Enum.valueOf(InviteStateType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static InviteStateType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (InviteStateType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(19095);
    }

    InviteStateType LIZ();
}
