package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import p003X.C80464Hne;

/* renamed from: com.bytedance.android.live.liveinteract.digitavatar.a */
/* loaded from: classes3.dex */
public final class C4381a {
    public static ChangeQuickRedirect LIZ;
    public static final C80464Hne LIZLLL = new C80464Hne((byte) 0);
    public final int LIZIZ;
    public final int LIZJ;

    static {
        Covode.recordClassIndex(26613);
    }

    public final String toString() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder("AvatarAction(desc=");
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "未知动作";
                            } else {
                                str = "放下麦克风";
                            }
                        } else {
                            str = "高潮唱歌";
                        }
                    } else {
                        str = "正常唱歌";
                    }
                } else {
                    str = "拿起麦克风";
                }
            } else {
                str = "打招呼";
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", action=");
        sb.append(this.LIZIZ);
        sb.append(", playCount=");
        sb.append(this.LIZJ);
        sb.append(LoggerUtil.S_RIGHT_TAG);
        return sb.toString();
    }

    public C4381a(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
