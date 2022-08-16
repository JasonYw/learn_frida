package com.bytedance.android.live.misc;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.SafetyGuard;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.interactivity.api.ChatHighlightRequest;
import com.bytedance.android.livesdk.interactivity.api.ChatHighlightResponseData;
import com.bytedance.android.livesdk.interactivity.api.IBarrageService;
import com.bytedance.android.livesdk.interactivity.api.ICommentService;
import com.bytedance.android.livesdk.interactivity.api.IDiggService;
import com.bytedance.android.livesdk.interactivity.api.IEnterAnimService;
import com.bytedance.android.livesdk.interactivity.api.IEpisodeInteractiveService;
import com.bytedance.android.livesdk.interactivity.api.IHiBoardService;
import com.bytedance.android.livesdk.interactivity.api.IHighlightService;
import com.bytedance.android.livesdk.interactivity.api.IIMService;
import com.bytedance.android.livesdk.interactivity.api.IInteractivityService;
import com.bytedance.android.livesdk.interactivity.api.INotifyService;
import com.bytedance.android.livesdk.interactivity.api.IPinService;
import com.bytedance.android.livesdk.interactivity.api.IPublicScreenPluginService;
import com.bytedance.android.livesdk.interactivity.api.IPublicScreenService;
import com.bytedance.android.livesdk.interactivity.api.IQuickCommentService;
import com.bytedance.android.livesdk.interactivity.api.IRoomChannelService;
import com.bytedance.android.livesdk.interactivity.api.IRoomIntroService;
import com.bytedance.android.livesdk.interactivity.api.IRoomNoticeService;
import com.bytedance.android.livesdk.interactivity.api.ITextAudioService;
import com.bytedance.android.livesdk.interactivity.like.p649a.C7818a;
import com.bytedance.android.livesdk.interactivity.like.p649a.C7819b;
import com.bytedance.android.livesdk.interactivity.p663qa.api.AnswerHighlightRequest;
import com.bytedance.android.livesdk.interactivity.p663qa.api.AnswerHighlightResponseData;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C134891c2A;
import p003X.C134917c2a;
import p003X.C134921c2e;
import p003X.C134922c2f;
import p003X.C454053xX;
import p003X.C64719BgH;

/* loaded from: classes12.dex */
public class LiveService$$interactivityimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32495);
    }

    public static void postRegister() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 5).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (!PatchProxy.proxy(new Object[]{hashMap}, new C454053xX(), C454053xX.LIZ, false, 1).isSupported) {
            hashMap.put(C7819b.class, new AbstractC10531b<C7819b>() { // from class: X.3xW
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(51258);
                }

                /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.livesdk.interactivity.like.a.b, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.livesdk.interactivity.like.a.b, java.lang.Object] */
                @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
                /* renamed from: decode */
                public final /* synthetic */ C7819b mo25795decode(C10532g c10532g) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, LIZ, false, 2);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c10532g}, null, LIZ, true, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    C7819b c7819b = new C7819b();
                    long LIZ2 = c10532g.LIZ();
                    while (true) {
                        int LIZIZ = c10532g.LIZIZ();
                        if (LIZIZ != -1) {
                            if (LIZIZ != 1) {
                                if (LIZIZ != 2) {
                                    QV1.LJII(c10532g);
                                } else {
                                    c7819b.LIZIZ = QV1.LIZ(c10532g);
                                }
                            } else {
                                c7819b.LIZ = QV1.LIZ(c10532g);
                            }
                        } else {
                            c10532g.LIZ(LIZ2);
                            return c7819b;
                        }
                    }
                }
            });
            hashMap.put(AnswerHighlightRequest.class, new C134917c2a());
            hashMap.put(C7818a.class, new AbstractC10531b<C7818a>() { // from class: X.3Kh
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(51257);
                }

                /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.livesdk.interactivity.like.a.a] */
                /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.livesdk.interactivity.like.a.a] */
                @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
                /* renamed from: decode */
                public final /* synthetic */ C7818a mo25795decode(C10532g c10532g) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, LIZ, false, 2);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c10532g}, null, LIZ, true, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    C7818a c7818a = new C7818a();
                    c7818a.LIZ = new ArrayList();
                    long LIZ2 = c10532g.LIZ();
                    while (true) {
                        int LIZIZ = c10532g.LIZIZ();
                        if (LIZIZ != -1) {
                            if (LIZIZ != 1) {
                                QV1.LJII(c10532g);
                            } else {
                                c7818a.LIZ.add(_ImageModel_ProtoDecoder.decodeStatic(c10532g));
                            }
                        } else {
                            c10532g.LIZ(LIZ2);
                            return c7818a;
                        }
                    }
                }
            });
            hashMap.put(AnswerHighlightResponseData.class, new C134921c2e());
            hashMap.put(ChatHighlightRequest.class, new C134891c2A());
            hashMap.put(ChatHighlightResponseData.class, new C134922c2f());
        }
        ((INetworkService) ServiceManager.getService(INetworkService.class)).injectProtoDecoders(hashMap);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4).isSupported) {
            return;
        }
        safeRegister(IInteractivityService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.InteractivityService"));
        safeRegister(IBarrageService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.BarrageService"));
        safeRegister(ICommentService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.CommentService"));
        safeRegister(IEnterAnimService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.EnterAnimService"));
        safeRegister(IHiBoardService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.HiBoardService"));
        safeRegister(IDiggService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.DiggService"));
        safeRegister(INotifyService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.NotifyService"));
        safeRegister(IPinService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.PinService"));
        safeRegister(IPublicScreenService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.PublicScreenService"));
        safeRegister(IPublicScreenPluginService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.PublicScreenPluginService"));
        safeRegister(IQuickCommentService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.QuickCommentService"));
        safeRegister(IRoomChannelService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.RoomChannelService"));
        safeRegister(IRoomIntroService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.RoomIntroService"));
        safeRegister(IRoomNoticeService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.RoomNoticeService"));
        safeRegister(ITextAudioService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.TextAudioService"));
        safeRegister(IIMService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.IMService"));
        safeRegister(IEpisodeInteractiveService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.api.EpisodeInteractiveService"));
        safeRegister(IHighlightService.class, (IService) safeNewEmptyInstance("com.bytedance.android.livesdk.interactivity.highlight.api.HighlightService"));
    }

    public static <T> T safeNewEmptyInstance(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        try {
            return (T) C64719BgH.LIZ(C116971W2r.LIZ(str));
        } catch (Exception e) {
            handleComponentInitException(C0002O.m25086C("safeNewEmptyInstance ", str), e);
            return null;
        }
    }

    public static <T extends IService> void safeRegister(Class<T> cls, T t) {
        if (!PatchProxy.proxy(new Object[]{cls, t}, null, changeQuickRedirect, true, 3).isSupported && t != null) {
            ServiceManager.registerService(cls, t);
        }
    }

    public static void handleComponentInitException(String str, Exception exc) {
        Throwable th;
        if (PatchProxy.proxy(new Object[]{str, exc}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        if (exc instanceof InvocationTargetException) {
            th = ((InvocationTargetException) exc).getTargetException();
        } else {
            th = exc;
        }
        ALogger.m15799e("TTLiveSDKContext", str, th);
        SafetyGuard.LIZ(exc, C0002O.m25086C("[interactivity-impl]-", str));
    }
}
