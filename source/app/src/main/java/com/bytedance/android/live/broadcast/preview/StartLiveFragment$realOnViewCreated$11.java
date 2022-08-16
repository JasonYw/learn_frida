package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.preview.externalframework.placeholder.SimpleWidgetPlaceHolder;
import com.bytedance.android.livesdkapi.room.handler.AbstractC9669d;
import com.bytedance.android.livesdkapi.room.handler.toolbar.NewToolbarButtonConstants;
import com.bytedance.android.livesdkapi.room.handler.toolbar.ToolbarComponentCheckInterface;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.AbstractC9672e;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.AbstractC9673f;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.IExternalButton;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.constraint.AbstractC9670f;
import com.bytedance.android.livesdkapi.room.p781a.AbstractC9661d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C77583GiH;
import p003X.C86843KJx;
import p003X.C86872KLa;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$realOnViewCreated$11 extends Lambda implements Function1<AbstractC9661d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17182);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$realOnViewCreated$11(KJV kjv) {
        super(1);
        this.this$0 = kjv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC9661d abstractC9661d) {
        AbstractC9669d abstractC9669d;
        AbstractC9661d abstractC9661d2 = abstractC9661d;
        if (!PatchProxy.proxy(new Object[]{abstractC9661d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC9661d2);
            KJV kjv = this.this$0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], kjv, KJV.LIZ, false, 134);
            if (proxy.isSupported) {
                abstractC9669d = (AbstractC9669d) proxy.result;
            } else {
                if (!kjv.LJIILJJIL) {
                    kjv.LJIILJJIL = true;
                    WidgetManager widgetManager = kjv.LIZIZ;
                    if (widgetManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    widgetManager.load(2131183134, kjv.LJIL());
                }
                WidgetManager widgetManager2 = kjv.LIZIZ;
                if (widgetManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                widgetManager2.load(2131171148, kjv.LJJ());
                Disposable subscribe = kjv.LIZJ().m15893LJ().LIZIZ().subscribe(new C86843KJx(kjv), C77583GiH.LIZIZ);
                Intrinsics.checkNotNullExpressionValue(subscribe, "");
                kjv.LIZ(subscribe);
                kjv.LJIL.LIZ(kjv.LJJIZ());
                final SimpleWidgetPlaceHolder LJJ = kjv.LJJ();
                final C86872KLa c86872KLa = kjv.LJIL;
                abstractC9669d = new AbstractC9669d(LJJ, c86872KLa) { // from class: X.39Z
                    public static ChangeQuickRedirect LIZ;
                    public final SimpleWidgetPlaceHolder LIZIZ;
                    public final C86872KLa LIZJ;

                    static {
                        Covode.recordClassIndex(17256);
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final String LIZIZ() {
                        return null;
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZ(AbstractC9673f abstractC9673f, AbstractC9670f abstractC9670f) {
                        if (PatchProxy.proxy(new Object[]{abstractC9673f, abstractC9670f}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(abstractC9673f, abstractC9670f);
                        if (Intrinsics.areEqual(abstractC9670f, C4302630q.LIZ)) {
                            SimpleWidgetPlaceHolder simpleWidgetPlaceHolder = this.LIZIZ;
                            if (PatchProxy.proxy(new Object[]{abstractC9673f}, simpleWidgetPlaceHolder, SimpleWidgetPlaceHolder.LIZ, false, 4).isSupported) {
                                return;
                            }
                            C106862S5w.LIZ(abstractC9673f);
                            if (simpleWidgetPlaceHolder.LIZJ == null) {
                                simpleWidgetPlaceHolder.LIZJ = abstractC9673f;
                                if (!simpleWidgetPlaceHolder.isViewValid) {
                                    return;
                                }
                                abstractC9673f.mo15245LJ();
                                return;
                            }
                            C4324639c.LIZ("cant attach twice");
                            return;
                        }
                        C4324639c.LIZ("should not call in preview page");
                    }

                    private final void LIZJ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
                            return;
                        }
                        C4324639c.LIZ("should not call in preview page");
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
                            return;
                        }
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZIZ(IExternalButton iExternalButton) {
                        if (PatchProxy.proxy(new Object[]{iExternalButton}, this, LIZ, false, 7).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(iExternalButton);
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final AbstractC9672e LIZ(AbstractC4302930t abstractC4302930t) {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC4302930t}, this, LIZ, false, 1);
                        if (proxy2.isSupported) {
                            return (AbstractC9672e) proxy2.result;
                        }
                        C106862S5w.LIZ(abstractC4302930t);
                        if (Intrinsics.areEqual(abstractC4302930t, C4324939f.LIZ)) {
                            return this.LIZJ;
                        }
                        C4324639c.LIZ("should not call in preview page");
                        return this.LIZJ;
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZJ(IExternalButton iExternalButton) {
                        if (PatchProxy.proxy(new Object[]{iExternalButton}, this, LIZ, false, 10).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(iExternalButton);
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final <M> void LIZ(QI1<M> qi1) {
                        if (PatchProxy.proxy(new Object[]{qi1}, this, LIZ, false, 12).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(qi1);
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZIZ(AbstractC9673f abstractC9673f) {
                        if (PatchProxy.proxy(new Object[]{abstractC9673f}, this, LIZ, false, 5).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(abstractC9673f);
                        this.LIZIZ.LIZIZ(abstractC9673f);
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZ(IExternalButton iExternalButton) {
                        if (PatchProxy.proxy(new Object[]{iExternalButton}, this, LIZ, false, 6).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(iExternalButton);
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZ(AbstractC9673f abstractC9673f) {
                        if (PatchProxy.proxy(new Object[]{abstractC9673f}, this, LIZ, false, 4).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(abstractC9673f);
                        this.LIZIZ.LIZ(abstractC9673f);
                    }

                    {
                        C106862S5w.LIZ(LJJ, c86872KLa);
                        this.LIZIZ = LJJ;
                        this.LIZJ = c86872KLa;
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZIZ(IExternalButton iExternalButton, AbstractC9670f abstractC9670f) {
                        if (PatchProxy.proxy(new Object[]{iExternalButton, abstractC9670f}, this, LIZ, false, 11).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(iExternalButton, abstractC9670f);
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZ(NewToolbarButtonConstants newToolbarButtonConstants, ToolbarComponentCheckInterface toolbarComponentCheckInterface) {
                        if (PatchProxy.proxy(new Object[]{newToolbarButtonConstants, toolbarComponentCheckInterface}, this, LIZ, false, 9).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(newToolbarButtonConstants, toolbarComponentCheckInterface);
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZIZ(AbstractC9673f abstractC9673f, AbstractC9670f abstractC9670f) {
                        if (PatchProxy.proxy(new Object[]{abstractC9673f, abstractC9670f}, this, LIZ, false, 3).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(abstractC9673f, abstractC9670f);
                        LIZJ();
                    }

                    @Override // com.bytedance.android.livesdkapi.room.handler.AbstractC9669d
                    public final void LIZ(IExternalButton iExternalButton, AbstractC9670f abstractC9670f) {
                        if (PatchProxy.proxy(new Object[]{iExternalButton, abstractC9670f}, this, LIZ, false, 8).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(iExternalButton, abstractC9670f);
                        LIZJ();
                    }
                };
            }
            abstractC9661d2.LIZ(abstractC9669d);
        }
        return Unit.INSTANCE;
    }
}
