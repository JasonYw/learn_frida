package cn.ever.cloud.network.auth;

import cn.ever.cloud.network.auth.DependToken;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.ErrorCode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class SessionTokenProvider implements DependToken, AbstractC0730a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final CoroutineScope scope;
    public DependToken.SessionToken sessionToken;
    public final DependToken tokenGetterDelegate;
    public final UserId userId;
    public final SharedFlow<UserInconsistentEvent> userInconsistentEvent;
    public final MutableSharedFlow<UserInconsistentEvent> userInconsistentFlow;

    static {
        Covode.recordClassIndex(3177);
    }

    @Override // cn.ever.cloud.network.auth.AbstractC0730a
    public final UserId getUserId() {
        return this.userId;
    }

    @Override // cn.ever.cloud.network.auth.AbstractC0730a
    public final Flow<UserInconsistentEvent> onUserInconsistentEvent() {
        return this.userInconsistentEvent;
    }

    @Override // cn.ever.cloud.network.auth.AbstractC0730a
    public final synchronized void onTokenExceeded() {
        MethodCollector.m14708i(218);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            MethodCollector.m14707o(218);
            return;
        }
        getNewToken();
        MethodCollector.m14707o(218);
    }

    @Override // cn.ever.cloud.network.auth.AbstractC0730a
    public final Map<String, String> getTokenMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        DependToken.SessionToken sessionToken = this.sessionToken;
        if (sessionToken == null) {
            sessionToken = getNewToken();
        }
        hashMap.put("x-everphoto-token", sessionToken.getNewSessionToken());
        hashMap.put("x-ep-thirdparty-uid", this.userId.getThirdPartyUid());
        String thirdPartySecUid = this.userId.getThirdPartySecUid();
        if (thirdPartySecUid != null) {
            hashMap.put("x-ep-thirdparty-sec-uid", thirdPartySecUid);
        }
        hashMap.put("x-ep-uid", String.valueOf(this.userId.getEpUid()));
        return hashMap;
    }

    @Override // cn.ever.cloud.network.auth.DependToken
    public final synchronized DependToken.SessionToken getNewToken() {
        MethodCollector.m14708i(217);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            DependToken.SessionToken sessionToken = (DependToken.SessionToken) proxy.result;
            MethodCollector.m14707o(217);
            return sessionToken;
        }
        LogHelper.INSTANCE.m20553i("SessionTokenProvider", "getNewToken");
        DependToken.SessionToken newToken = this.tokenGetterDelegate.getNewToken();
        if (!(!Intrinsics.areEqual(newToken.getUserId().getThirdPartyUid(), this.userId.getThirdPartyUid()))) {
            if (newToken.getUserId().getEpUid() == this.userId.getEpUid()) {
                if (!StringsKt__StringsJVMKt.isBlank(newToken.getNewSessionToken())) {
                    this.sessionToken = newToken;
                    MethodCollector.m14707o(217);
                    return newToken;
                }
                ClientError clientError = ClientError.Companion.toClientError(ErrorCode.CLIENT_AUTH_EMPTY_TOKEN);
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SessionTokenProvider$getNewToken$3(this, newToken, clientError, null), 3, null);
                MethodCollector.m14707o(217);
                throw clientError;
            }
            ClientError clientError2 = ClientError.Companion.toClientError(ErrorCode.CLIENT_AUTH_EP_UID_MISMATCH);
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SessionTokenProvider$getNewToken$2(this, newToken, clientError2, null), 3, null);
            MethodCollector.m14707o(217);
            throw clientError2;
        }
        ClientError clientError3 = ClientError.Companion.toClientError(ErrorCode.CLIENT_AUTH_UID_MISMATCH);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SessionTokenProvider$getNewToken$1(this, newToken, clientError3, null), 3, null);
        MethodCollector.m14707o(217);
        throw clientError3;
    }

    public SessionTokenProvider(UserId userId, DependToken dependToken, CoroutineScope coroutineScope, String str) {
        DependToken.SessionToken sessionToken;
        C106862S5w.LIZ(userId, dependToken, coroutineScope);
        this.userId = userId;
        this.tokenGetterDelegate = dependToken;
        this.scope = coroutineScope;
        if (str != null) {
            sessionToken = new DependToken.SessionToken(this.userId, str);
        } else {
            sessionToken = null;
        }
        this.sessionToken = sessionToken;
        this.userInconsistentFlow = SharedFlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
        this.userInconsistentEvent = FlowKt.asSharedFlow(this.userInconsistentFlow);
    }

    public /* synthetic */ SessionTokenProvider(UserId userId, DependToken dependToken, CoroutineScope coroutineScope, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, dependToken, coroutineScope, (i & 8) != 0 ? null : str);
    }
}
