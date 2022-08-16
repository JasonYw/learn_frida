package com.bytedance.android.live.network.impl;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.LiveSdkInitHelper;
import com.bytedance.android.livehostapi.foundation.IHostNetwork;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.model.C9646n;
import com.bytedance.android.livesdkapi.p778g.AbstractC9581a;
import com.bytedance.android.livesdkapi.p784ws.AbstractC9725a;
import com.bytedance.android.livesdkapi.p784ws.AbstractC9726c;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p003X.AbstractC88117Knn;
import p003X.AbstractC88664Kwc;
import p003X.C102311QQv;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.C88306Kqq;
import p003X.C88355Krd;
import p003X.C88660KwY;
import p003X.C88661KwZ;
import p003X.C88662Kwa;
import p003X.C88663Kwb;
import p003X.C88665Kwd;
import p003X.C88666Kwe;
import p003X.C88676Kwo;

/* loaded from: classes5.dex */
public class NetWorkService implements INetworkService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Runnable ensureProtoDecodersInjectedRunnable;
    public AbstractC88664Kwc mCommonParamsInterceptor;
    public IHostNetwork mIHostNetwork;
    public final Map<Class, AbstractC10531b> protoDecoderMap = new ConcurrentHashMap();

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(32638);
        } else {
            Covode.recordClassIndex(32638);
        }
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public InputStream doPost(String str, String str2, Map<String, String> map, Map<String, Object> map2) {
        return null;
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public String getHostDomain() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.mIHostNetwork.getHostDomain();
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public Map<String, String> getCommonParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        Map<String, String> commonParams = this.mIHostNetwork.getCommonParams();
        AbstractC88664Kwc abstractC88664Kwc = this.mCommonParamsInterceptor;
        if (abstractC88664Kwc != null) {
            abstractC88664Kwc.LIZ(commonParams);
        }
        return commonParams;
    }

    @Override // com.bytedance.android.live.network.api.INetworkService
    public void setEnsureProtoDecodersInjected(Runnable runnable) {
        this.ensureProtoDecodersInjectedRunnable = runnable;
    }

    @Override // com.bytedance.android.live.network.api.INetworkService
    public void injectProtoDecoders(Map<Class, AbstractC10531b> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        this.protoDecoderMap.putAll(map);
    }

    @Override // com.bytedance.android.live.network.api.INetworkService
    public void putCommonParams(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C88665Kwd.LIZ().LIZ(map);
    }

    public NetWorkService(IHostNetwork iHostNetwork) {
        if (ServiceManager.getService(INetworkService.class) == null) {
            ServiceManager.registerService(IHostNetwork.class, this);
            ServiceManager.registerService(INetworkService.class, this);
            C88306Kqq.LIZJ = new C102311QQv();
            this.mIHostNetwork = iHostNetwork;
            this.mCommonParamsInterceptor = C88665Kwd.LIZ();
        }
    }

    private <T> AbstractC10531b<T> tryLoadModelXProtobufConstructor(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (AbstractC10531b) proxy.result;
        }
        if (C3LJ.class.isAssignableFrom(cls)) {
            try {
                C88661KwZ c88661KwZ = new C88661KwZ(cls.getConstructor(C10532g.class));
                this.protoDecoderMap.put(cls, c88661KwZ);
                return c88661KwZ;
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.network.api.INetworkService
    public <T> AbstractC10531b<T> getProtoDecoder(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (AbstractC10531b) proxy.result;
        }
        if (LiveSdkInitHelper.isEnableLauncherOpt()) {
            C88355Krd.LIZ().LIZIZ();
            Runnable runnable = this.ensureProtoDecodersInjectedRunnable;
            if (LiveConfigSettingKeys.LIVE_PROTO_DECODERS_INJECT_WITH_SERVICE_INIT.getValue().booleanValue() && runnable != null) {
                runnable.run();
                this.ensureProtoDecodersInjectedRunnable = null;
            }
        }
        AbstractC10531b<T> abstractC10531b = this.protoDecoderMap.get(cls);
        if (abstractC10531b != null) {
            return abstractC10531b;
        }
        AbstractC10531b<T> tryLoadModelXProtobufConstructor = tryLoadModelXProtobufConstructor(cls);
        if (tryLoadModelXProtobufConstructor == null) {
            return null;
        }
        return tryLoadModelXProtobufConstructor;
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> get(String str, List<NameValuePair> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        AbstractC88664Kwc abstractC88664Kwc = this.mCommonParamsInterceptor;
        if (abstractC88664Kwc != null) {
            C88663Kwb LIZ = abstractC88664Kwc.LIZ(new C88663Kwb(str, list));
            return this.mIHostNetwork.get(LIZ.LIZ, LIZ.LIZIZ);
        }
        return this.mIHostNetwork.get(str, list);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> get(String str, List<NameValuePair> list, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list, bool}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        return this.mIHostNetwork.get(str, list, bool);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> post(String str, List<NameValuePair> list, String str2, byte[] bArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list, str2, bArr}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        AbstractC88664Kwc abstractC88664Kwc = this.mCommonParamsInterceptor;
        if (abstractC88664Kwc != null) {
            C88663Kwb LIZ = abstractC88664Kwc.LIZ(new C88663Kwb(str, list));
            return this.mIHostNetwork.post(LIZ.LIZ, LIZ.LIZIZ, str2, bArr);
        }
        return this.mIHostNetwork.post(str, list, str2, bArr);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC9725a registerWsChannel(Context context, String str, Map<String, String> map, AbstractC9726c abstractC9726c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, map, abstractC9726c}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (AbstractC9725a) proxy.result;
        }
        return this.mIHostNetwork.registerWsChannel(context, str, map, abstractC9726c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.network.api.INetworkService
    public void loadNinePatchDrawable(ImageModel imageModel, View view, boolean z, Runnable runnable) {
        String str;
        if (PatchProxy.proxy(new Object[]{imageModel, view, Byte.valueOf(z ? (byte) 1 : (byte) 0), runnable}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{imageModel, view, Byte.valueOf((byte) z), runnable}, C88666Kwe.LIZIZ, C88666Kwe.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(imageModel, view);
            if (!Lists.isEmpty(imageModel.getUrls())) {
                List<String> urls = imageModel.getUrls();
                if (urls != null) {
                    str = urls.get(0);
                } else {
                    str = null;
                }
                Observable.just(0).subscribeOn(Schedulers.m138io()).map(new C88660KwY(str)).observeOn(AndroidSchedulers.mainThread()).subscribe(new C88676Kwo(z, view, runnable), C88662Kwa.LIZIZ);
            }
        }
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> downloadFile(boolean z, int i, String str, List<NameValuePair> list, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, list, obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        AbstractC88664Kwc abstractC88664Kwc = this.mCommonParamsInterceptor;
        if (abstractC88664Kwc != null) {
            C88663Kwb LIZ = abstractC88664Kwc.LIZ(new C88663Kwb(str, list));
            return this.mIHostNetwork.downloadFile(z, i, LIZ.LIZ, LIZ.LIZIZ, obj);
        }
        return this.mIHostNetwork.downloadFile(z, i, str, list, obj);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> downloadFileStreaming(boolean z, int i, String str, List<NameValuePair> list, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, list, obj}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        AbstractC88664Kwc abstractC88664Kwc = this.mCommonParamsInterceptor;
        if (abstractC88664Kwc != null) {
            C88663Kwb LIZ = abstractC88664Kwc.LIZ(new C88663Kwb(str, list));
            return this.mIHostNetwork.downloadFileStreaming(z, i, LIZ.LIZ, LIZ.LIZIZ, obj);
        }
        return this.mIHostNetwork.downloadFileStreaming(z, i, str, list, obj);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> post(String str, List<NameValuePair> list, String str2, byte[] bArr, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list, str2, bArr, bool}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        return this.mIHostNetwork.post(str, list, str2, bArr, bool);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC9725a registerWsChannel(Context context, String str, Map<String, String> map, AbstractC9726c abstractC9726c, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, map, abstractC9726c, Integer.valueOf(i)}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (AbstractC9725a) proxy.result;
        }
        return this.mIHostNetwork.registerWsChannel(context, str, map, abstractC9726c, i);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> uploadLargeFile(int i, String str, List<NameValuePair> list, File file, AbstractC9581a abstractC9581a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, list, file, abstractC9581a}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        AbstractC88664Kwc abstractC88664Kwc = this.mCommonParamsInterceptor;
        if (abstractC88664Kwc != null) {
            C88663Kwb LIZ = abstractC88664Kwc.LIZ(new C88663Kwb(str, list));
            return this.mIHostNetwork.uploadLargeFile(i, LIZ.LIZ, LIZ.LIZIZ, file, abstractC9581a);
        }
        return this.mIHostNetwork.uploadLargeFile(i, str, list, file, abstractC9581a);
    }

    @Override // com.bytedance.android.livehostapi.foundation.IHostNetwork
    public AbstractC88117Knn<C9646n> uploadFile(int i, String str, List<NameValuePair> list, String str2, byte[] bArr, long j, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, list, str2, bArr, new Long(j), str3}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (AbstractC88117Knn) proxy.result;
        }
        AbstractC88664Kwc abstractC88664Kwc = this.mCommonParamsInterceptor;
        if (abstractC88664Kwc != null) {
            C88663Kwb LIZ = abstractC88664Kwc.LIZ(new C88663Kwb(str, list));
            return this.mIHostNetwork.uploadFile(i, LIZ.LIZ, LIZ.LIZIZ, str2, bArr, j, str3);
        }
        return this.mIHostNetwork.uploadFile(i, str, list, str2, bArr, j, str3);
    }
}
