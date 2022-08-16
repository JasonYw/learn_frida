package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.widget.AnchorFansGroupManagerWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.platform.IHostAction;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.event.C5991b;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ExtendedToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.dynamic.C6514m;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.reddot.C9225a;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC78440Gw6;
import p003X.C3807716h;
import p003X.C413202Xa;
import p003X.C415302c8;
import p003X.C87010KQi;
import p003X.LK0;

/* loaded from: classes12.dex */
public final class AnchorFansGroupManagerWidget extends LiveRecyclableWidget implements AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public Room LIZIZ;
    public C9078n LIZJ;
    public DialogFragment LIZLLL;

    /* renamed from: LJ */
    public String f25964LJ;
    public final LK0 LJFF = new LK0() { // from class: X.3DB
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(18289);
        }

        @Override // p003X.LK0
        public final void LIZ(Object obj) {
            C9078n c9078n;
            if (!PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported && (c9078n = AnchorFansGroupManagerWidget.this.LIZJ) != null) {
                c9078n.dismiss();
            }
        }
    };
    public final AbstractC78440Gw6 LJI = new AbstractC78440Gw6() { // from class: X.3D8
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(18290);
        }

        @Override // p003X.AbstractC78440Gw6
        public final void LIZ(Object obj) {
            String str;
            if (!PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported && (str = AnchorFansGroupManagerWidget.this.f25964LJ) != null) {
                ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(AnchorFansGroupManagerWidget.this.getContext(), str);
            }
        }
    };
    public IMessageManager LJII;
    public Disposable LJIIIIZZ;

    static {
        Covode.recordClassIndex(18287);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        IMessageManager iMessageManager = this.LJII;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(MessageType.FANS_GROUP_GUIDE_MESSAGE.LIZ(), this);
        }
        Disposable disposable = this.LJIIIIZZ;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LJIIIIZZ = null;
    }

    public final Map<String, String> LIZ(int i) {
        String str;
        String str2;
        String str3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        Pair[] pairArr = new Pair[3];
        Room room = this.LIZIZ;
        if (room == null || (str = String.valueOf(room.getId())) == null) {
            str = "0";
        }
        pairArr[0] = TuplesKt.m137to("room_id", str);
        Room room2 = this.LIZIZ;
        if (room2 == null || (str2 = String.valueOf(room2.getOwnerUserId())) == null) {
            str2 = "0";
        }
        pairArr[1] = TuplesKt.m137to("anchor_id", str2);
        if (i == 4) {
            str3 = "look";
        } else {
            str3 = "open";
        }
        pairArr[2] = TuplesKt.m137to("message_name", str3);
        return MapsKt__MapsKt.mutableMapOf(pairArr);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        DataCenter dataCenter = this.dataCenter;
        Room room = null;
        if (dataCenter != null) {
            iMessageManager = (IMessageManager) dataCenter.get("data_message_manager", (String) null);
        } else {
            iMessageManager = null;
        }
        this.LJII = iMessageManager;
        IMessageManager iMessageManager2 = this.LJII;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.FANS_GROUP_GUIDE_MESSAGE.LIZ(), this);
        }
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            room = (Room) dataCenter2.get("data_room", (String) null);
        }
        this.LIZIZ = room;
        C415302c8 LIZIZ = C413202Xa.LIZIZ();
        ExtendedToolbarButton extended = ToolbarButton.FNA_GROUP.extended();
        Intrinsics.checkNotNullExpressionValue(extended, "");
        LIZIZ.LIZ(extended, new AbstractC6524y.AbstractView$OnClickListenerC6525b() { // from class: X.2wC
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18288);
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C2TD c2td) {
                boolean z = PatchProxy.proxy(new Object[]{c2td}, this, LIZ, false, 6).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(View view, DataCenter dataCenter3) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter3}, this, LIZ, false, 2).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 4).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(boolean z) {
                boolean z2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final C9225a LIZIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
                if (proxy.isSupported) {
                    return (C9225a) proxy.result;
                }
                return null;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(View view, DataCenter dataCenter3) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter3}, this, LIZ, false, 3).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 9).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final boolean aK_() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                return false;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Room room2;
                String str;
                String str2;
                DisplayMetrics displayMetrics;
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(view);
                C4574547f.LIZ().LIZ("anchor_fan_group_button_click", new HashMap(), Room.class, C8668v.class);
                final AnchorFansGroupManagerWidget anchorFansGroupManagerWidget = AnchorFansGroupManagerWidget.this;
                if (!PatchProxy.proxy(new Object[0], anchorFansGroupManagerWidget, AnchorFansGroupManagerWidget.LIZ, false, 4).isSupported && (room2 = anchorFansGroupManagerWidget.LIZIZ) != null) {
                    SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_FANS_GROUP_CHAT_LIST;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Uri parse = Uri.parse(settingKey.getValue());
                    Intrinsics.checkNotNullExpressionValue(parse, "");
                    Uri.Builder appendQueryParameter = Uri.parse(parse.getQueryParameter(PushConstants.WEB_URL)).buildUpon().appendQueryParameter("room_id", String.valueOf(room2.getId())).appendQueryParameter("anchor_id", String.valueOf(room2.getOwnerUserId())).appendQueryParameter("user_id", String.valueOf(room2.getOwnerUserId()));
                    User owner = room2.getOwner();
                    if (owner != null) {
                        str = owner.getSecUid();
                    } else {
                        str = null;
                    }
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("sec_user_id", String.valueOf(str));
                    User owner2 = room2.getOwner();
                    if (owner2 != null) {
                        str2 = owner2.getSecUid();
                    } else {
                        str2 = null;
                    }
                    String builder = appendQueryParameter2.appendQueryParameter("sec_anchor_id", String.valueOf(str2)).appendQueryParameter("enter_from", "management_panel").toString();
                    Intrinsics.checkNotNullExpressionValue(builder, "");
                    String queryParameter = parse.getQueryParameter("fallback_url");
                    Context context = anchorFansGroupManagerWidget.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    int i = (int) (displayMetrics.widthPixels / resources.getDisplayMetrics().density);
                    int LIZ2 = S5C.LIZ(parse, C109391T5d.LJFF, (int) ((displayMetrics.heightPixels / displayMetrics.density) * 0.78d));
                    C9078n c9078n = anchorFansGroupManagerWidget.LIZJ;
                    if (c9078n != null && c9078n.LJIILIIL()) {
                        c9078n.dismissAllowingStateLoss();
                    }
                    AbstractC100934Pp2 buildLynxDialog = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).buildLynxDialog(builder, queryParameter, null);
                    buildLynxDialog.LIZJ(i);
                    buildLynxDialog.LIZLLL(LIZ2);
                    buildLynxDialog.mo22950LJ(false);
                    buildLynxDialog.LIZIZ(false);
                    buildLynxDialog.LJI(80);
                    anchorFansGroupManagerWidget.LIZJ = buildLynxDialog.LIZ();
                    C420712kr.LIZ().LIZIZ();
                    C100742Plw.LIZ(C439993ar.LIZIZ(anchorFansGroupManagerWidget.context), anchorFansGroupManagerWidget.LIZJ);
                    C9078n c9078n2 = anchorFansGroupManagerWidget.LIZJ;
                    if (c9078n2 != null) {
                        c9078n2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.2wD
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(18294);
                            }

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                C420712kr.LIZ().LIZJ();
                                AnchorFansGroupManagerWidget.this.LIZJ = null;
                            }
                        });
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.browser.webview.fragment.BaseWebDialogFragment");
                }
            }
        });
        this.LJIIIIZZ = C87010KQi.LIZ().LIZ(C5991b.class).subscribe(new Consumer<C5991b>() { // from class: X.3D7
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18291);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5991b c5991b) {
                Object createFailure;
                Throwable m30311exceptionOrNullimpl;
                FragmentManager supportFragmentManager;
                DialogFragment dialogFragment;
                C5991b c5991b2 = c5991b;
                if (!PatchProxy.proxy(new Object[]{c5991b2}, this, LIZ, false, 1).isSupported) {
                    try {
                        AnchorFansGroupManagerWidget anchorFansGroupManagerWidget = AnchorFansGroupManagerWidget.this;
                        String str = c5991b2.LIZIZ;
                        String str2 = c5991b2.LIZJ;
                        String str3 = c5991b2.LIZLLL;
                        WeakReference<Context> weakReference = c5991b2.f26841LJ;
                        if (!PatchProxy.proxy(new Object[]{str, str2, str3, weakReference}, anchorFansGroupManagerWidget, AnchorFansGroupManagerWidget.LIZ, false, 3).isSupported) {
                            Context context = weakReference.get();
                            if (context == null) {
                                context = anchorFansGroupManagerWidget.context;
                            }
                            ALogger.m15800e("AnchorFansGroupManagerWidget", "startGroupManagerFragment conversationId : " + str + ", enterFrom: " + str2 + " , context: " + anchorFansGroupManagerWidget.context);
                            if (context != null && (context instanceof FragmentActivity)) {
                                anchorFansGroupManagerWidget.f25964LJ = str3;
                                anchorFansGroupManagerWidget.LIZLLL = ((IHostAction) ServiceManager.getService(IHostAction.class)).startGroupManagerFragment(str, str2, anchorFansGroupManagerWidget.LJFF, anchorFansGroupManagerWidget.LJI);
                                if (!(context instanceof FragmentActivity)) {
                                    context = null;
                                }
                                FragmentActivity fragmentActivity = (FragmentActivity) context;
                                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (true ^ supportFragmentManager.isStateSaved()) && (dialogFragment = anchorFansGroupManagerWidget.LIZLLL) != null) {
                                    dialogFragment.show(supportFragmentManager, anchorFansGroupManagerWidget.getClass().getCanonicalName());
                                }
                            }
                        }
                        createFailure = Unit.INSTANCE;
                        Result.m30308constructorimpl(createFailure);
                    } catch (Throwable th) {
                        createFailure = ResultKt.createFailure(th);
                        Result.m30308constructorimpl(createFailure);
                    }
                    if (Result.m30311exceptionOrNullimpl(createFailure) != null) {
                        ALogger.m15797i("AnchorFansGroupManagerWidget", "fail" + m30311exceptionOrNullimpl.getMessage());
                    }
                }
            }
        }, C3807716h.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r0.length() == 0) goto L41;
     */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r7) {
        /*
            r6 = this;
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r3 = 0
            r1[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.widget.AnchorFansGroupManagerWidget.LIZ
            r4 = 5
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r3, r4)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L12
            return
        L12:
            if (r7 == 0) goto L21
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.message.model.FansGroupGuideMessage
            if (r0 == 0) goto L21
            com.bytedance.android.livesdk.message.model.FansGroupGuideMessage r7 = (com.bytedance.android.livesdk.message.model.FansGroupGuideMessage) r7
            int r1 = r7.guideType
            r0 = 4
            if (r1 == r0) goto L22
            if (r1 == r4) goto L22
        L21:
            return
        L22:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.AnchorFansGroupManagerWidget.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L21
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.AnchorFansGroupManagerWidget.LIZ
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r3, r0)
            boolean r0 = r1.isSupported
            java.lang.String r3 = ""
            if (r0 == 0) goto L7b
            java.lang.Object r4 = r1.result
            java.lang.String r4 = (java.lang.String) r4
        L46:
            X.byK r2 = p003X.C134846c1R.LIZ()
            com.bytedance.android.livesdkapi.message.p r1 = r7.richText
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r0 = 0
            com.bytedance.android.livesdk.interactivity.service.textrender.b.c r3 = r2.LIZ(r1, r0)
            java.util.List<com.bytedance.android.livesdk.interactivity.service.textrender.b.b> r0 = r3.LIZIZ
            java.util.Iterator r2 = r0.iterator()
        L5a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdkapi.message.s r0 = (com.bytedance.android.livesdkapi.message.C9608s) r0
            com.bytedance.android.livesdkapi.message.TextPieceImage r1 = r0.LJIIJJI
            if (r1 == 0) goto L5a
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = p003X.LK5.LIZ(r0)
            r1.LJII = r0
            r0 = 1093664768(0x41300000, float:11.0)
            int r0 = p003X.LK5.LIZ(r0)
            r1.LJIIIIZZ = r0
            goto L5a
        L7b:
            java.lang.String r0 = r7.schemeUrl
            if (r0 == 0) goto L8a
            java.lang.String r0 = r7.schemeUrl
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L9a
        L8a:
            int r0 = r7.guideType
            if (r0 != r4) goto L9a
            com.bytedance.android.live.core.setting.SettingKey<java.lang.String> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FANS_GROUP_CHAT_LIST
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            goto L46
        L9a:
            java.lang.String r4 = r7.schemeUrl
            goto L46
        L9d:
            X.byK r1 = p003X.C134846c1R.LIZ()
            X.3D6 r0 = new X.3D6
            r0.<init>()
            X.3DC r1 = r1.LIZ(r3, r0)
            int r0 = r1.LIZIZ
            if (r0 != 0) goto L21
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r6.dataCenter
            if (r3 == 0) goto L21
            com.bytedance.android.livesdk.chatroom.event.AnchorFansGroupPopEvent r2 = new com.bytedance.android.livesdk.chatroom.event.AnchorFansGroupPopEvent
            android.text.Spannable r1 = r1.LIZ
            int r0 = r7.guideType
            java.util.Map r0 = r6.LIZ(r0)
            r2.<init>(r1, r4, r0)
            java.lang.String r0 = "cmd_anchor_fans_group_tip"
            r3.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.AnchorFansGroupManagerWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
