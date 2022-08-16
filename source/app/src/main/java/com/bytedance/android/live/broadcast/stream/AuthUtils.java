package com.bytedance.android.live.broadcast.stream;

import android.util.Base64;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C436843Py;
import p003X.C64812Bhm;
import p003X.C86291JzR;
import p003X.QKF;

/* loaded from: classes2.dex */
public final class AuthUtils {
    public static ChangeQuickRedirect LIZ;
    public static final AuthUtils LIZIZ = new AuthUtils();

    /* loaded from: classes2.dex */
    public static final class AuthFactor {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String aid;
        public final String roomId;
        public final String timestamp;
        public final String uid;

        static {
            Covode.recordClassIndex(17892);
        }

        public static /* synthetic */ AuthFactor copy$default(AuthFactor authFactor, String str, String str2, String str3, String str4, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{authFactor, str, str2, str3, str4, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (AuthFactor) proxy.result;
            }
            if ((i & 1) != 0) {
                str = authFactor.uid;
            }
            if ((i & 2) != 0) {
                str2 = authFactor.roomId;
            }
            if ((i & 4) != 0) {
                str3 = authFactor.aid;
            }
            if ((i & 8) != 0) {
                str4 = authFactor.timestamp;
            }
            return authFactor.copy(str, str2, str3, str4);
        }

        private Object[] getObjects() {
            return new Object[]{this.uid, this.roomId, this.aid, this.timestamp};
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.roomId;
        }

        public final String component3() {
            return this.aid;
        }

        public final String component4() {
            return this.timestamp;
        }

        public final AuthFactor copy(String str, String str2, String str3, String str4) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (AuthFactor) proxy.result;
            }
            C106862S5w.LIZ(str, str2, str3, str4);
            return new AuthFactor(str, str2, str3, str4);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof AuthFactor) {
                return C106862S5w.LIZ(((AuthFactor) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AuthUtils$AuthFactor:%s,%s,%s,%s", getObjects());
        }

        public final String getAid() {
            return this.aid;
        }

        public final String getRoomId() {
            return this.roomId;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public final String getUid() {
            return this.uid;
        }

        public AuthFactor(String str, String str2, String str3, String str4) {
            C106862S5w.LIZ(str, str2, str3, str4);
            this.uid = str;
            this.roomId = str2;
            this.aid = str3;
            this.timestamp = str4;
        }
    }

    static {
        Covode.recordClassIndex(17891);
    }

    public final String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        IService service = ServiceManager.getService(IUserService.class);
        Intrinsics.checkNotNull(service);
        String LIZ2 = C436843Py.LIZ(new AuthFactor(String.valueOf(((IUserService) service).user().LIZIZ()), str, String.valueOf(((IHostContext) ServiceManager.getService(IHostContext.class)).appId()), String.valueOf(QKF.LIZ() / 1000)));
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return C0002O.m25086C("bytedmediasdkandroid:", LIZ(str, LIZ2));
    }

    private final String LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        byte[] bArr = {8, 9, 7, 5, 7, 5, 6, 7, 8, 9, 10, 11, 12, C86291JzR.LIZJ, 14, 15};
        try {
            String md5Hex = DigestUtils.md5Hex(str);
            Intrinsics.checkNotNullExpressionValue(md5Hex, "");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Intrinsics.checkNotNullExpressionValue(cipher, "");
            cipher.init(1, new SecretKeySpec(C64812Bhm.LIZ(md5Hex), "AES"), new IvParameterSpec(bArr));
            Charset charset = Charsets.UTF_8;
            if (str2 != null) {
                byte[] bytes = str2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                byte[] doFinal = cipher.doFinal(bytes);
                Intrinsics.checkNotNullExpressionValue(doFinal, "");
                String encodeToString = Base64.encodeToString(doFinal, 2);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "");
                return encodeToString;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            ALogger.m15798e("AuthString", e);
            return "";
        }
    }
}
