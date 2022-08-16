package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class MessageBoardInfo implements C3LJ {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("gift_id")
    public long giftId;
    public int giftMoney;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public long f26417id;
    @SerializedName("msg_disappear_time")
    public long msgDisappearTime;
    @SerializedName("process_status")
    public int processStatus;
    @SerializedName("sender")
    public User sender;

    static {
        Covode.recordClassIndex(29406);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getGiftId() {
        return this.giftId;
    }

    public final int getGiftMoney() {
        return this.giftMoney;
    }

    public final long getId() {
        return this.f26417id;
    }

    public final long getMsgDisappearTime() {
        return this.msgDisappearTime;
    }

    public final int getProcessStatus() {
        return this.processStatus;
    }

    public final User getSender() {
        return this.sender;
    }

    public final String getMsgBoardContent() {
        String str = this.content;
        if (str == null) {
            return "";
        }
        return str;
    }

    public MessageBoardInfo() {
        this.content = "";
        this.processStatus = MsgBoardItemProcessStatus.NOT_PROCESSED.value;
    }

    public final String getSenderNickName() {
        String nickName;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        User user = this.sender;
        if (user == null || (nickName = user.getNickName()) == null) {
            return "";
        }
        return nickName;
    }

    /* loaded from: classes3.dex */
    public enum MsgBoardItemProcessStatus {
        NOT_PROCESSED(0),
        PROCESSED(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        public static MsgBoardItemProcessStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (MsgBoardItemProcessStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(MsgBoardItemProcessStatus.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MsgBoardItemProcessStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (MsgBoardItemProcessStatus[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(29407);
        }

        MsgBoardItemProcessStatus(int i) {
            this.value = i;
        }
    }

    public final long getSenderId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        User user = this.sender;
        if (user != null) {
            return user.getId();
        }
        return 0L;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setGiftId(long j) {
        this.giftId = j;
    }

    public final void setGiftMoney(int i) {
        this.giftMoney = i;
    }

    public final void setId(long j) {
        this.f26417id = j;
    }

    public final void setMsgDisappearTime(long j) {
        this.msgDisappearTime = j;
    }

    public final void setProcessStatus(int i) {
        this.processStatus = i;
    }

    public final void setSender(User user) {
        this.sender = user;
    }

    public final void setMsgBoardContent(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.content = str;
    }

    public MessageBoardInfo(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 3) {
                    if (LIZIZ != 4) {
                        if (LIZIZ != 5) {
                            if (LIZIZ != 6) {
                                if (LIZIZ != 7) {
                                    QV1.LJII(c10532g);
                                } else {
                                    this.msgDisappearTime = QV1.LIZJ(c10532g);
                                }
                            } else {
                                this.giftId = QV1.LIZJ(c10532g);
                            }
                        } else {
                            this.processStatus = QV1.LIZIZ(c10532g);
                        }
                    } else {
                        this.content = QV1.LJFF(c10532g);
                    }
                } else {
                    this.sender = _User_ProtoDecoder.decodeStatic(c10532g);
                }
            } else {
                this.f26417id = QV1.LIZJ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.content == null) {
            this.content = "";
        }
        if (this.processStatus == 0) {
            this.processStatus = MsgBoardItemProcessStatus.NOT_PROCESSED.value;
        }
    }
}
