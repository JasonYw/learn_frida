package com.aweme.account.weiboauth;

import android.app.Activity;
import android.content.Intent;
import com.aweme.account.thirdauthapi.bean.ThirdPartyAuthInfo;
import com.aweme.account.thirdauthapi.p178a.AbstractC2424b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.abmock.ABManager;
import com.bytedance.ies.ugc.appcontext.AppContextManager;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC125199ZPd;
import p003X.C106862S5w;
import p003X.C125200ZPe;
import p003X.W29;
import p003X.ZPY;

/* renamed from: com.aweme.account.weiboauth.a */
/* loaded from: classes15.dex */
public final class C2428a implements AbstractC2424b, WbAuthListener {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public AbstractC125199ZPd LIZJ;
    public String LIZLLL = "sina_weibo";

    /* renamed from: LJ */
    public final W29 f25555LJ = new W29(new WeiboAuth$wbAuthListener$2(this));
    public SsoHandler LJFF;

    static {
        Covode.recordClassIndex(9370);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C2428a.class, "wbAuthListener", "getWbAuthListener()Lcom/aweme/account/weiboauth/WeiboAuth;", 0);
        Reflection.mutableProperty1(mutablePropertyReference1Impl);
        LIZIZ = new KProperty[]{mutablePropertyReference1Impl};
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    /* renamed from: LJ */
    public final String mo16020LJ() {
        return "weibo";
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final String LJFF() {
        return "微博";
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final void LJII() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported;
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final void LJIIIIZZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported;
    }

    private AbstractC125199ZPd LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC125199ZPd) proxy.result;
        }
        AbstractC125199ZPd abstractC125199ZPd = this.LIZJ;
        if (abstractC125199ZPd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC125199ZPd;
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.LIZLLL;
    }

    @Override // com.sina.weibo.sdk.auth.WbAuthListener
    public final void cancel() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        LIZ().LIZ();
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final String LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (AppContextManager.INSTANCE.isDouyinLite()) {
            return "572";
        }
        return "93";
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final void LIZIZ() {
        Object LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        if (ABManager.getInstance().getBooleanValue(true, "use_web_to_authorize_weibo", 31744, false)) {
            LIZ().LIZ(-100000, "not install weibo client");
            return;
        }
        SsoHandler ssoHandler = this.LJFF;
        if (ssoHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            LIZ2 = proxy.result;
        } else {
            LIZ2 = this.f25555LJ.LIZ(this, LIZIZ[0]);
        }
        ssoHandler.authorize((C2428a) LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r1 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r5 != null) goto L15;
     */
    @Override // com.sina.weibo.sdk.auth.WbAuthListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFailure(com.sina.weibo.sdk.auth.WbConnectErrorMessage r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r5
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.aweme.account.weiboauth.C2428a.LIZ
            r0 = 15
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            r2 = -100000(0xfffffffffffe7960, float:NaN)
            if (r5 == 0) goto L2b
            java.lang.String r0 = r5.getErrorCode()     // Catch: java.lang.NumberFormatException -> L23
            if (r0 == 0) goto L25
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L23
            goto L25
        L23:
            if (r5 == 0) goto L2b
        L25:
            java.lang.String r1 = r5.getErrorMessage()
            if (r1 != 0) goto L2d
        L2b:
            java.lang.String r1 = "weibo failure but error message is null"
        L2d:
            X.ZPd r0 = r4.LIZ()
            r0.LIZ(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.account.weiboauth.C2428a.onFailure(com.sina.weibo.sdk.auth.WbConnectErrorMessage):void");
    }

    @Override // com.sina.weibo.sdk.auth.WbAuthListener
    public final void onSuccess(Oauth2AccessToken oauth2AccessToken) {
        if (PatchProxy.proxy(new Object[]{oauth2AccessToken}, this, LIZ, false, 14).isSupported) {
            return;
        }
        ZPY zpy = new ZPY();
        if (oauth2AccessToken != null) {
            String token = oauth2AccessToken.getToken();
            if (token != null) {
                zpy.LIZ(token);
            }
            zpy.LIZ(oauth2AccessToken.getExpiresTime() / 1000);
            String uid = oauth2AccessToken.getUid();
            if (uid != null) {
                zpy.LIZIZ(uid);
            }
        }
        zpy.LIZLLL("sina_weibo");
        zpy.m22061LJ(LIZLLL());
        ThirdPartyAuthInfo LIZ2 = zpy.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        AbstractC125199ZPd LIZ3 = LIZ();
        if (LIZ3 != null) {
            LIZ3.LIZ(LIZ2);
        }
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final void LIZ(int i, int i2, Intent intent) {
        AbstractC125199ZPd LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 13).isSupported) {
            return;
        }
        if (i == 32973) {
            if (this.LJFF == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                SsoHandler ssoHandler = this.LJFF;
                if (ssoHandler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                ssoHandler.authorizeCallBack(i, i2, intent);
            }
        }
        if (C125200ZPe.LIZ(i) && i2 == 0 && (LIZ2 = LIZ()) != null) {
            LIZ2.LIZ();
        }
    }

    @Override // com.aweme.account.thirdauthapi.p178a.AbstractC2424b
    public final void LIZ(Activity activity, AbstractC125199ZPd abstractC125199ZPd, String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{activity, abstractC125199ZPd, str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, abstractC125199ZPd, str);
        if (!PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(activity);
        }
        if (!PatchProxy.proxy(new Object[]{abstractC125199ZPd}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(abstractC125199ZPd);
            this.LIZJ = abstractC125199ZPd;
        }
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(str);
            this.LIZLLL = str;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            str2 = (String) proxy.result;
        } else if (AppContextManager.INSTANCE.isDouyinLite()) {
            str2 = "2370472689";
        } else {
            str2 = "1462309810";
        }
        WbSdk.install(activity, new AuthInfo(activity, str2, "http://api.snssdk.com/auth/login_success/", "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write"));
        this.LJFF = new SsoHandler(activity);
    }
}
