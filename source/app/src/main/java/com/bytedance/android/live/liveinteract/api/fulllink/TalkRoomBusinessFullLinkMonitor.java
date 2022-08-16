package com.bytedance.android.live.liveinteract.api.fulllink;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.permission.model.BaseCheckException;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.TalkRoomEmojiListResponse;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.C6092ad;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6119b;
import com.bytedance.android.livesdk.chatroom.model.C6192s;
import com.bytedance.android.livesdk.chatroom.model.LinkFinishResult;
import com.bytedance.android.livesdk.chatroom.model.interact.C6152aj;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;
import com.bytedance.android.livesdk.chatroom.model.interact.UpdateLinkTypeApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.UpdateLinkTypeReplyResponse;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.LinkMicBigEventMessage;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdkapi.depend.model.live.linker.LinkerUpdateLinkTypeApplyContent;
import com.bytedance.android.livesdkapi.depend.model.live.linker.LinkerUpdateLinkTypeReplyContent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC413402Xu;
import p003X.AbstractC78986HBs;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C409882Kg;
import p003X.C79030HDk;
import p003X.C79111HGn;
import p003X.HED;
import p003X.HMP;

/* loaded from: classes3.dex */
public final class TalkRoomBusinessFullLinkMonitor {
    public static ChangeQuickRedirect LIZ;
    public static final TalkRoomBusinessFullLinkMonitor LIZIZ = new TalkRoomBusinessFullLinkMonitor();

    public final void LIZ(String str, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("open_source", str);
        jSONObject.put("target_scene", i);
        jSONObject.put("target_ui_layout", i2);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.OpenChatRoomActionMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{(byte) 0, str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", 0);
        jSONObject.put(MiPushCommandMessage.KEY_REASON, str);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.AnchorPreCheckActionMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(long j, C5176i<C6092ad> c5176i) {
        List<C6092ad.C6093a> list;
        if (PatchProxy.proxy(new Object[]{new Long(j), c5176i}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C6092ad c6092ad = c5176i.LIZJ;
        if (c6092ad != null && (list = c6092ad.LIZ) != null) {
            for (C6092ad.C6093a c6093a : list) {
                jSONObject2.put(String.valueOf(c6093a.LIZ), c6093a.LIZIZ);
            }
        }
        jSONObject.put("play_mode_list", jSONObject2);
        LinkMonitorData linkMonitorData = LinkMonitorData.InteractListApiMonitorData;
        long LIZLLL = LIZLLL(j);
        String str = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        LIZ(linkMonitorData, LIZLLL, str, jSONObject);
    }

    public final void LIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZ(LinkMonitorData.InteractListApiMonitorData, LIZLLL(j), th, new JSONObject());
    }

    public final void LIZ(BaseCheckException baseCheckException) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{baseCheckException}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseCheckException);
        JSONObject jSONObject = new JSONObject();
        int i = C79030HDk.LIZ[baseCheckException.operateType.ordinal()];
        if (i == 1) {
            str = "apply";
        } else if (i == 2) {
            str = "reply";
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "pre_apply";
        }
        jSONObject.put("operate_type", str);
        int i2 = C79030HDk.LIZIZ[baseCheckException.checkType.ordinal()];
        if (i2 == 1) {
            str2 = "login_check";
        } else if (i2 == 2) {
            str2 = "android_permission_check";
        } else if (i2 == 3) {
            str2 = "video_short_plugin_check";
        } else if (i2 == 4) {
            str2 = "interact_plugin_check";
        } else if (i2 != 5) {
            str2 = "unknown: " + baseCheckException.checkType;
        } else {
            str2 = "server_permission_check";
        }
        jSONObject.put("check_type", str2);
        Pair<Integer, String> LIZ2 = C79111HGn.LIZJ.LIZ(baseCheckException.getCause(), jSONObject);
        C79111HGn.LIZJ.LIZ(LinkMonitorData.LinkPermissionCheckMonitorData, jSONObject, LIZ2.getFirst().intValue(), LIZ2.getSecond());
    }

    public final void LIZ(long j, String str, C5176i<C6068x> c5176i, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, c5176i, new Long(j2)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("to_user_id", j);
        jSONObject.put("sec_to_user_id", str);
        LinkMonitorData linkMonitorData = LinkMonitorData.InviteApiMonitorData;
        long LIZLLL = LIZLLL(j2);
        String str2 = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        LIZ(linkMonitorData, LIZLLL, str2, jSONObject);
    }

    public final void LIZ(long j, String str, Throwable th, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, th, new Long(j2)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("to_user_id", j);
        jSONObject.put("sec_to_user_id", str);
        LIZ(LinkMonitorData.InviteApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", c8854es.getMessageId());
        jSONObject.put("from_user_id", c8854es.LJJI);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveInviteMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(String str, int i, int i2, C5176i<C6160b> c5176i, long j) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), c5176i, new Long(j)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sec_to_user_id", str);
        if (i == ReplyType.Agree.ordinal()) {
            str2 = "agree";
        } else if (i == ReplyType.Reject.ordinal()) {
            str2 = "reject";
        } else {
            str2 = "unknown: " + i;
        }
        jSONObject.put("target_reply_type", str2);
        if (i2 == 1) {
            str3 = "video";
        } else if (i2 == 2) {
            str3 = "audio";
        } else if (i2 != 3) {
            str3 = "unknown: " + i2;
        } else {
            str3 = "digit_avatar";
        }
        jSONObject.put("target_link_type", str3);
        LinkMonitorData linkMonitorData = LinkMonitorData.ReplyApiMonitorData;
        long LIZLLL = LIZLLL(j);
        String str4 = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        LIZ(linkMonitorData, LIZLLL, str4, jSONObject);
    }

    public final void LIZ(String str, int i, int i2, Throwable th, long j) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), th, new Long(j)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sec_to_user_id", str);
        if (i == ReplyType.Agree.ordinal()) {
            str2 = "agree";
        } else if (i == ReplyType.Reject.ordinal()) {
            str2 = "reject";
        } else {
            str2 = "unknown: " + i;
        }
        jSONObject.put("reply_type", str2);
        if (i2 == 1) {
            str3 = "video";
        } else if (i2 == 2) {
            str3 = "audio";
        } else if (i2 != 3) {
            str3 = "unknown: " + i2;
        } else {
            str3 = "digit_avatar";
        }
        jSONObject.put("target_link_type", str3);
        LIZ(LinkMonitorData.ReplyApiMonitorData, LIZLLL(j), th, jSONObject);
    }

    public final void LIZIZ(C8854es c8854es) {
        String str;
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", c8854es.getMessageId());
        int i = c8854es.LJIILJJIL;
        if (i == ReplyType.Agree.ordinal()) {
            str = "agree";
        } else if (i == ReplyType.Reject.ordinal()) {
            str = "reject";
        } else {
            str = "unknown: " + c8854es.LJIILJJIL;
        }
        jSONObject.put("reply_type", str);
        jSONObject.put("reply_prompts", c8854es.LJIILL);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveReplyMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(int i, LinkApplyType linkApplyType, int i2, C5176i<C6119b> c5176i, long j) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), linkApplyType, Integer.valueOf(i2), c5176i, new Long(j)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkApplyType, c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("position", i);
        switch (C79030HDk.LIZJ[linkApplyType.ordinal()]) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "song";
                break;
            case 3:
                str = "match";
                break;
            case 4:
                str = "city";
                break;
            case 5:
                str = "city_song";
                break;
            case 6:
                str = "strong_reach";
                break;
            case 7:
                str = "prepare_apply";
                break;
            default:
                str = "unknown: " + linkApplyType.value;
                break;
        }
        jSONObject.put("apply_type", str);
        if (i2 == 1) {
            str2 = "video";
        } else if (i2 == 2) {
            str2 = "audio";
        } else if (i2 != 3) {
            str2 = "unknown: " + i2;
        } else {
            str2 = "digit_avatar";
        }
        jSONObject.put("target_link_type", str2);
        LinkMonitorData linkMonitorData = LinkMonitorData.ApplyApiMonitorData;
        long LIZLLL = LIZLLL(j);
        String str3 = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        LIZ(linkMonitorData, LIZLLL, str3, jSONObject);
    }

    public final void LIZ(int i, LinkApplyType linkApplyType, int i2, Throwable th, long j) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), linkApplyType, Integer.valueOf(i2), th, new Long(j)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkApplyType);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apply_position", i);
        switch (C79030HDk.LIZLLL[linkApplyType.ordinal()]) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "song";
                break;
            case 3:
                str = "match";
                break;
            case 4:
                str = "city";
                break;
            case 5:
                str = "city_song";
                break;
            case 6:
                str = "strong_reach";
                break;
            case 7:
                str = "prepare_apply";
                break;
            default:
                str = "unknown: " + linkApplyType.value;
                break;
        }
        jSONObject.put("apply_type", str);
        if (i2 == 1) {
            str2 = "video";
        } else if (i2 == 2) {
            str2 = "audio";
        } else if (i2 != 3) {
            str2 = "unknown: " + i2;
        } else {
            str2 = "digit_avatar";
        }
        jSONObject.put("target_link_type", str2);
        LIZ(LinkMonitorData.ApplyApiMonitorData, LIZLLL(j), th, jSONObject);
    }

    public final void LIZ(long j, String str, long j2, C5176i<LinkInitResult> c5176i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), c5176i}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_user_id", j);
        jSONObject.put("target_sec_user_id", str);
        LinkMonitorData linkMonitorData = LinkMonitorData.PermitApiMonitorData;
        long LIZLLL = LIZLLL(j2);
        String str2 = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        LIZ(linkMonitorData, LIZLLL, str2, jSONObject);
    }

    public final void LIZ(long j, String str, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), th}, this, LIZ, false, 17).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_user_id", j);
        jSONObject.put("target_sec_user_id", str);
        LIZ(LinkMonitorData.PermitApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZ(C5176i<C6094ae> c5176i, long j) {
        if (PatchProxy.proxy(new Object[]{c5176i, new Long(j)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        JSONObject jSONObject = new JSONObject();
        LinkMonitorData linkMonitorData = LinkMonitorData.JoinChannelApiMonitorData;
        long LIZLLL = LIZLLL(j);
        String str = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        LIZ(linkMonitorData, LIZLLL, str, jSONObject);
    }

    public final void LIZ(Throwable th, long j) {
        if (PatchProxy.proxy(new Object[]{th, new Long(j)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        LIZ(LinkMonitorData.JoinChannelApiMonitorData, LIZLLL(j), th, new JSONObject());
    }

    public final void LIZ(long j, String str, long j2, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), str2}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", j);
        jSONObject.put("sec_user_id", str);
        LIZ(LinkMonitorData.KickOutApiMonitorData, LIZLLL(j2), str2, jSONObject);
    }

    public final void LIZIZ(long j, String str, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), th}, this, LIZ, false, 22).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", j);
        jSONObject.put("sec_user_id", str);
        LIZ(LinkMonitorData.KickOutApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZ(String str) {
        LinkPlayerInfo LIZ2;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        long LIZIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter = ((IInteractService) service).getLinkUserInfoCenter();
        if (linkUserInfoCenter != null && (LIZ2 = linkUserInfoCenter.LIZ(LIZIZ2, "")) != null) {
            i = LIZ2.m15703LJ();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("link_type", i);
        jSONObject.put("disconnect_reason", str);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.GuestDisconnectActionMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(long j, String str, AbstractC100834PnQ<LinkFinishResult> abstractC100834PnQ) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, abstractC100834PnQ}, this, LIZ, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC100834PnQ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("req_from", str);
        LIZ(LinkMonitorData.FinishApiMonitorData, LIZLLL(j), abstractC100834PnQ.logId, jSONObject);
    }

    public final void LIZ(long j, String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, th}, this, LIZ, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("req_from", str);
        LIZ(LinkMonitorData.FinishApiMonitorData, LIZLLL(j), th, jSONObject);
    }

    public final void LIZ(long j, int i, long j2, C5176i<UpdateLinkTypeApplyResponse> c5176i) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), c5176i}, this, LIZ, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("to_user_id", j);
        if (i == 1) {
            str = "video";
        } else if (i == 2) {
            str = "audio";
        } else if (i != 3) {
            str = "unknown: " + i;
        } else {
            str = "avatar";
        }
        jSONObject.put("target_link_type", str);
        LinkMonitorData linkMonitorData = LinkMonitorData.UpdateLinkTypeApplyApiMonitorData;
        long LIZLLL = LIZLLL(j2);
        String str2 = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        LIZ(linkMonitorData, LIZLLL, str2, jSONObject);
    }

    public final void LIZ(long j, int i, long j2, Throwable th) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), th}, this, LIZ, false, 31).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("to_user_id", j);
        if (i == 1) {
            str = "video";
        } else if (i == 2) {
            str = "audio";
        } else if (i != 3) {
            str = "unknown: " + i;
        } else {
            str = "avatar";
        }
        jSONObject.put("target_link_type", str);
        LIZ(LinkMonitorData.UpdateLinkTypeApplyApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZ(C8874fl c8874fl) {
        String str;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", c8874fl.getMessageId());
        LinkerUpdateLinkTypeApplyContent linkerUpdateLinkTypeApplyContent = c8874fl.LJIJJ;
        if (linkerUpdateLinkTypeApplyContent != null) {
            jSONObject.put("from_user_id", linkerUpdateLinkTypeApplyContent.fromUserId);
            int i = linkerUpdateLinkTypeApplyContent.linkType;
            if (i == 1) {
                str = "video";
            } else if (i == 2) {
                str = "audio";
            } else if (i != 3) {
                str = "unknown: " + linkerUpdateLinkTypeApplyContent.linkType;
            } else {
                str = "avatar";
            }
            jSONObject.put("link_type", str);
        }
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveUpdateLinkTypeApplyMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZIZ(C8874fl c8874fl) {
        String str;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", c8874fl.getMessageId());
        LinkerUpdateLinkTypeReplyContent linkerUpdateLinkTypeReplyContent = c8874fl.LJIJJLI;
        if (linkerUpdateLinkTypeReplyContent != null) {
            int i = linkerUpdateLinkTypeReplyContent.replyType;
            if (i == ReplyType.Agree.ordinal()) {
                str = "agree";
            } else if (i == ReplyType.Reject.ordinal()) {
                str = "reject";
            } else {
                str = "unknown: " + linkerUpdateLinkTypeReplyContent.replyType;
            }
            jSONObject.put("reply_type", str);
            jSONObject.put("prompt", linkerUpdateLinkTypeReplyContent.prompts);
        }
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveUpdateLinkTypeReplyMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(HMP hmp, long j, String str) {
        String str2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        if (PatchProxy.proxy(new Object[]{hmp, new Long(j), str}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(hmp, str);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 == null || (LJIILJJIL = LIZ2.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) {
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            if (!((IInteractService) service).isAudienceLinkEngineOn()) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        switch (hmp.LJIIIIZZ) {
            case 100101:
                str2 = "background";
                break;
            case 100102:
                str2 = C109391T5d.LJI;
                break;
            default:
                str2 = "unknown: " + hmp.LJIIIIZZ;
                break;
        }
        jSONObject.put("signal_type", str2);
        LIZ(LinkMonitorData.SendSignalingApiMonitorData, LIZLLL(j), str, jSONObject);
    }

    public final void LIZ(HMP hmp, long j, Throwable th) {
        String str;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        if (PatchProxy.proxy(new Object[]{hmp, new Long(j), th}, this, LIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(hmp);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 == null || (LJIILJJIL = LIZ2.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) {
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            if (!((IInteractService) service).isAudienceLinkEngineOn()) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        switch (hmp.LJIIIIZZ) {
            case 100101:
                str = "background";
                break;
            case 100102:
                str = C109391T5d.LJI;
                break;
            default:
                str = "unknown: " + hmp.LJIIIIZZ;
                break;
        }
        jSONObject.put("signal_type", str);
        LIZ(LinkMonitorData.SendSignalingApiMonitorData, LIZLLL(j), th, jSONObject);
    }

    public final void LIZ(long j, int i, long j2, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), str}, this, LIZ, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("emoji_id", j);
        jSONObject.put("emoji_type", LIZ(i));
        LIZ(LinkMonitorData.SendEmojiApiMonitorData, LIZLLL(j2), str, jSONObject);
    }

    public final void LIZ(long j, long j2, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str}, this, LIZ, false, 44).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_position", j);
        LIZ(LinkMonitorData.UpdatePositionApiMonitorData, LIZLLL(j2), str, jSONObject);
    }

    public final void LIZ(long j, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), th}, this, LIZ, false, 45).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_position", j);
        LIZ(LinkMonitorData.UpdatePositionApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 54).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_page", str);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.FastMatchActionMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(int i, int i2, long j, String str) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), new Long(j), str}, this, LIZ, false, 55).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            str2 = "normal";
        } else if (i != 1) {
            str2 = "unknown(" + i + LoggerUtil.S_RIGHT_TAG;
        } else {
            str2 = "shake";
        }
        jSONObject.put("match_type", str2);
        if (i2 == 0) {
            str3 = "fast_match";
        } else if (i2 != 1) {
            str3 = "unknown(" + i2 + LoggerUtil.S_RIGHT_TAG;
        } else {
            str3 = "city_match";
        }
        jSONObject.put("match_scene", str3);
        LIZ(LinkMonitorData.FastMatchApiMonitorData, LIZLLL(j), str, jSONObject);
    }

    public final void LIZ(int i, int i2, long j, Throwable th) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), new Long(j), th}, this, LIZ, false, 56).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            str = "normal";
        } else if (i != 1) {
            str = "unknown(" + i + LoggerUtil.S_RIGHT_TAG;
        } else {
            str = "shake";
        }
        jSONObject.put("match_type", str);
        if (i2 == 0) {
            str2 = "fast_match";
        } else if (i2 != 1) {
            str2 = "unknown(" + i2 + LoggerUtil.S_RIGHT_TAG;
        } else {
            str2 = "city_match";
        }
        jSONObject.put("match_scene", str2);
        LIZ(LinkMonitorData.FastMatchApiMonitorData, LIZLLL(j), th, jSONObject);
    }

    public final void LIZ(String str, C6192s c6192s) {
        if (PatchProxy.proxy(new Object[]{str, c6192s}, this, LIZ, false, 57).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, c6192s);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jump_type", str);
        jSONObject.put("match_room_id", c6192s.LIZJ);
        jSONObject.put("match_room_scene", c6192s.LJII);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.FastMatchJumpMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(long j, boolean z, long j2, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2), str}, this, LIZ, false, 58).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_user_id", j);
        jSONObject.put("invite_type", z ? "enlarge" : "reduce");
        LIZ(LinkMonitorData.EnlargeInviteApiMonitorData, LIZLLL(j2), str, jSONObject);
    }

    public final void LIZ(long j, boolean z, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2), th}, this, LIZ, false, 59).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_user_id", j);
        jSONObject.put("invite_type", z ? "enlarge" : "reduce");
        LIZ(LinkMonitorData.EnlargeInviteApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZ(long j, boolean z, long j2, C5176i<Object> c5176i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2), c5176i}, this, LIZ, false, 61).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_user_id", j);
        jSONObject.put("reply_type", z ? "accept" : "reject");
        LinkMonitorData linkMonitorData = LinkMonitorData.EnlargeReplyApiMonitorData;
        long LIZLLL = LIZLLL(j2);
        String str = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        LIZ(linkMonitorData, LIZLLL, str, jSONObject);
    }

    public final void LIZIZ(long j, boolean z, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2), th}, this, LIZ, false, 62).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_user_id", j);
        jSONObject.put("reply_type", z ? "accept" : "reject");
        LIZ(LinkMonitorData.EnlargeReplyApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZ(long j, HED hed) {
        if (PatchProxy.proxy(new Object[]{new Long(j), hed}, this, LIZ, false, 63).isSupported) {
            return;
        }
        C106862S5w.LIZ(hed);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", j);
        jSONObject.put("reply_type", hed.LIZJ == 2 ? "reject" : "accept");
        jSONObject.put("reply_prompts", hed.LIZLLL);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveEnlargeReplyMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(LinkMicBigEventMessage linkMicBigEventMessage) {
        if (PatchProxy.proxy(new Object[]{linkMicBigEventMessage}, this, LIZ, false, 68).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicBigEventMessage);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", linkMicBigEventMessage.getMessageId());
        int i = linkMicBigEventMessage.LIZIZ;
        Object obj = "null";
        if (i == 1) {
            jSONObject.put("big_event_type", "init");
            LinkMicBigEventMessage.C8694a c8694a = linkMicBigEventMessage.LIZJ;
            if (c8694a != null) {
                obj = Integer.valueOf(c8694a.LIZ);
            }
            jSONObject.put("init_target_mode", obj);
            C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveBigEventMsgMonitorData, jSONObject, 0, null, 12, null);
        } else if (i == 2) {
            jSONObject.put("big_event_type", "finish");
            C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveBigEventMsgMonitorData, jSONObject, 0, null, 12, null);
        } else if (i != 3) {
        } else {
            jSONObject.put("big_event_type", "switch");
            LinkMicBigEventMessage.C8699f c8699f = linkMicBigEventMessage.LIZLLL;
            if (c8699f != null) {
                obj = Integer.valueOf(c8699f.LIZ);
            }
            jSONObject.put("switch_target_mode", obj);
            C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveBigEventMsgMonitorData, jSONObject, 0, null, 12, null);
        }
    }

    public final void LIZ(C8874fl c8874fl, long j, long j2, WrdsStatusType wrdsStatusType) {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        if (PatchProxy.proxy(new Object[]{c8874fl, new Long(j), new Long(j2), wrdsStatusType}, this, LIZ, false, 70).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl, wrdsStatusType);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 == null || (LJIILJJIL = LIZ2.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) {
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            if (!((IInteractService) service).isAudienceLinkEngineOn()) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", LIZLLL(j2));
        jSONObject.put("msg_id", c8874fl.getMessageId());
        jSONObject.put("wrds_version", j);
        jSONObject.put("msg_type", c8874fl.LIZIZ);
        jSONObject.put("from_source", "for_linker_msg");
        C79111HGn.LIZJ.LIZ(LinkMonitorData.WRDSForMsgMonitorData, jSONObject, wrdsStatusType.code, wrdsStatusType.msg);
    }

    public final void LIZ(String str, long j, long j2, WrdsStatusType wrdsStatusType) {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        if (PatchProxy.proxy(new Object[]{str, new Long(j), new Long(j2), wrdsStatusType}, this, LIZ, false, 71).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, wrdsStatusType);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 == null || (LJIILJJIL = LIZ2.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) {
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            if (!((IInteractService) service).isAudienceLinkEngineOn()) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", LIZLLL(j2));
        jSONObject.put("wrds_version", j);
        jSONObject.put("from_source", C0002O.m25086C("for_", str));
        C79111HGn.LIZJ.LIZ(LinkMonitorData.WRDSForApiMonitorData, jSONObject, wrdsStatusType.code, wrdsStatusType.msg);
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 72).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", j);
        jSONObject.put("banner_type", "anchor_finish");
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.BannerMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZ(LinkMonitorData linkMonitorData, long j, String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{linkMonitorData, new Long(j), str, jSONObject}, this, LIZ, false, 76).isSupported) {
            return;
        }
        C79111HGn.LIZ(C79111HGn.LIZJ, linkMonitorData, (LiveTracingMonitor.EventModule) null, j, str, jSONObject, 2, (Object) null);
    }

    public final void LIZ(LinkMonitorData linkMonitorData, long j, Throwable th, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{linkMonitorData, new Long(j), th, jSONObject}, this, LIZ, false, 77).isSupported) {
            return;
        }
        C79111HGn.LIZ(C79111HGn.LIZJ, linkMonitorData, (LiveTracingMonitor.EventModule) null, j, th, jSONObject, 2, (Object) null);
    }

    static {
        Covode.recordClassIndex(25169);
    }

    /* loaded from: classes3.dex */
    public enum WrdsStatusType {
        Success(0, "check wrds success"),
        BackLog(1, "message backlog"),
        Timeout(2, "waiting timeout"),
        Exception(3, "something exception");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int code;
        public final String msg;

        public static WrdsStatusType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (WrdsStatusType) (proxy.isSupported ? proxy.result : Enum.valueOf(WrdsStatusType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static WrdsStatusType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (WrdsStatusType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(25170);
        }

        WrdsStatusType(int i, String str) {
            this.code = i;
            this.msg = str;
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.LinkPermissionCheckMonitorData, new JSONObject(), 0, null, 12, null);
    }

    private final String LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 51);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (i != 1) {
            if (i != 2) {
                return "unknown: " + i;
            }
            return "emoji_type_interact";
        }
        return "emoji_type_self";
    }

    private final String LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 52);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return "unknown: " + i;
                }
                return "emoji_category_quick_thanks_gift";
            }
            return "emoji_category_avatar";
        }
        return "emoji_category_emoji";
    }

    public final void LIZJ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 74).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", j);
        jSONObject.put("banner_type", "guest_sys_kick_out");
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.BannerMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final long LIZLLL(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 75);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (j <= 0 || j >= System.currentTimeMillis()) {
            return 0L;
        }
        return System.currentTimeMillis() - j;
    }

    private final String LIZJ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 53);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (i == LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal()) {
            return "normal";
        }
        if (i == LinkmicPositionItem.LinkmicPositionStatus.LOCKED.ordinal()) {
            return "locked";
        }
        if (i == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
            return "bid_paid";
        }
        return "unknown(" + i + LoggerUtil.S_RIGHT_TAG;
    }

    public final void LIZIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 73).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", j);
        jSONObject.put("banner_type", "guest_kick_out");
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.BannerMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZLLL(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("to_scene", c8854es.LIZ());
        jSONObject.put("to_ui_layout", c8854es.LJJJJJL);
        jSONObject.put("rtc_ext_info", c8854es.LJJIIZI);
        jSONObject.put("multi_rtc_info", c8854es.LJJIJ);
        jSONObject.put("live_core_ext_info", c8854es.LJJIJIIJIL);
        jSONObject.put("multi_live_core_info", c8854es.LJJIJIIJI);
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveSwitchSceneMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg_id", c8854es.getMessageId());
        C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceivePermitMsgMonitorData, jSONObject, 0, null, 12, null);
    }

    public final void LIZLLL(long j, int i, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), th}, this, LIZ, false, 47).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_position", j);
        jSONObject.put("position_status", LIZJ(i));
        LIZ(LinkMonitorData.LockPositionApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZIZ(long j, int i, long j2, C5176i<UpdateLinkTypeReplyResponse> c5176i) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), c5176i}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("to_user_id", j);
        if (i == ReplyType.Agree.ordinal()) {
            str = "agree";
        } else if (i == ReplyType.Reject.ordinal()) {
            str = "reject";
        } else {
            str = "unknown: " + i;
        }
        jSONObject.put("reply_type", str);
        LinkMonitorData linkMonitorData = LinkMonitorData.UpdateLinkTypeReplyApiMonitorData;
        long LIZLLL = LIZLLL(j2);
        String str2 = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        LIZ(linkMonitorData, LIZLLL, str2, jSONObject);
    }

    public final void LIZJ(long j, int i, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), th}, this, LIZ, false, 42).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("emoji_id", j);
        jSONObject.put("emoji_type", LIZ(i));
        LIZ(LinkMonitorData.SendEmojiApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZIZ(long j, int i, long j2, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), str}, this, LIZ, false, 46).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_position", j);
        jSONObject.put("position_status", LIZJ(i));
        LIZ(LinkMonitorData.LockPositionApiMonitorData, LIZLLL(j2), str, jSONObject);
    }

    public final void LIZJ(long j, String str, long j2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), th}, this, LIZ, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_position", j);
        jSONObject.put("target_position_name", str);
        LIZ(LinkMonitorData.SetPositionAttributeApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZIZ(long j, int i, long j2, Throwable th) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(j2), th}, this, LIZ, false, 34).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("to_user_id", j);
        if (i == ReplyType.Agree.ordinal()) {
            str = "agree";
        } else if (i == ReplyType.Reject.ordinal()) {
            str = "reject";
        } else {
            str = "unknown: " + i;
        }
        jSONObject.put("reply_type", str);
        LIZ(LinkMonitorData.UpdateLinkTypeReplyApiMonitorData, LIZLLL(j2), th, jSONObject);
    }

    public final void LIZIZ(long j, String str, long j2, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), str2}, this, LIZ, false, 48).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_position", j);
        jSONObject.put("target_position_name", str);
        LIZ(LinkMonitorData.SetPositionAttributeApiMonitorData, LIZLLL(j2), str2, jSONObject);
    }

    public final void LIZ(int i, int i2, int i3, long j, C5176i<TalkRoomEmojiListResponse> c5176i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), c5176i}, this, LIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_scene", i);
        jSONObject.put("emoji_type", LIZ(i2));
        jSONObject.put("category", LIZIZ(i3));
        LinkMonitorData linkMonitorData = LinkMonitorData.ListEmojisApiMonitorData;
        long LIZLLL = LIZLLL(j);
        String str = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        LIZ(linkMonitorData, LIZLLL, str, jSONObject);
    }

    public final void LIZ(int i, int i2, int i3, long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), th}, this, LIZ, false, 39).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_scene", i);
        jSONObject.put("emoji_type", LIZ(i2));
        jSONObject.put("category", LIZIZ(i3));
        LIZ(LinkMonitorData.ListEmojisApiMonitorData, LIZLLL(j), th, jSONObject);
    }

    public final void LIZ(int i, int i2, int i3, String str, long j, C5176i<C6152aj> c5176i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, new Long(j), c5176i}, this, LIZ, false, 26).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        int currentUiLayout = ((IInteractService) service).getCurrentUiLayout();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from_scene", i);
        jSONObject.put("to_scene", i2);
        jSONObject.put("from_ui_layout", currentUiLayout);
        jSONObject.put("to_ui_layout", i3);
        LinkMonitorData linkMonitorData = LinkMonitorData.SwitchSceneApiMonitorData;
        long LIZLLL = LIZLLL(j);
        String str2 = c5176i.f26526LJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        LIZ(linkMonitorData, LIZLLL, str2, jSONObject);
    }

    public final void LIZ(int i, int i2, int i3, String str, long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, new Long(j), th}, this, LIZ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        int currentUiLayout = ((IInteractService) service).getCurrentUiLayout();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from_scene", i);
        jSONObject.put("to_scene", i2);
        jSONObject.put("from_ui_layout", currentUiLayout);
        jSONObject.put("to_ui_layout", i3);
        LIZ(LinkMonitorData.SwitchSceneApiMonitorData, LIZLLL(j), th, jSONObject);
    }
}
