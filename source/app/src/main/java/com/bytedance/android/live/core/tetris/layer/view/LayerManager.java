package com.bytedance.android.live.core.tetris.layer.view;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a;
import com.bytedance.android.live.core.tetris.layer.core.C4095b;
import com.bytedance.android.live.core.tetris.layer.core.C4096c;
import com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate;
import com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.LayerDescriptorList;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.android.live.core.tetris.layer.core.event.LayerEventDispatcher;
import com.bytedance.android.live.core.tetris.layer.core.layout.C4109b;
import com.bytedance.android.live.core.tetris.layer.core.layout.C4111d;
import com.bytedance.android.live.core.tetris.layer.initialization.LayerIndex;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC411512Qn;
import p003X.AbstractC411552Qr;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2NY;
import p003X.C2R0;
import p003X.C2R1;
import p003X.C410092Lb;
import p003X.C411592Qv;
import p003X.C411632Qz;

/* loaded from: classes12.dex */
public final class LayerManager implements LifecycleOwner, AbstractC411512Qn, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final FrameLayout LIZIZ;
    public final LifecycleOwner LIZJ;
    public C2R1 LJII;
    public C2R0 LJIIIIZZ;
    public C4118a LJIIJ;
    public boolean LJIIJJI;
    public Context LJIIL;

    /* renamed from: LJ */
    public static final C411592Qv f26194LJ = new C411592Qv((byte) 0);
    public static SettingKey<Boolean> LIZLLL = new SettingKey<>("layer_global_element", "Global Element 代码重构", Boolean.TRUE, Boolean.TRUE);
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(LayerManager$globalElementCenter$2.INSTANCE);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(new LayerManager$layoutManager$2(this));
    public List<AbstractC4093a> LJIIIZ = new ArrayList();
    public LifecycleRegistry LJIILIIL = new LifecycleRegistry(this);

    private final C4111d LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C4111d) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final C4109b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C4109b) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final void LIZ(LayerDescriptorList layerDescriptorList) {
        if (PatchProxy.proxy(new Object[]{layerDescriptorList}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(this, layerDescriptorList, false, 2, null);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 19).isSupported) {
            return;
        }
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event != Lifecycle.Event.ON_DESTROY) {
        } else {
            onDestroy();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle mo29786getLifecycle() {
        return this.LJIILIIL;
    }

    public final void LIZ(LayerDescriptorList layerDescriptorList, boolean z) {
        if (PatchProxy.proxy(new Object[]{layerDescriptorList, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(layerDescriptorList);
        C4118a c4118a = this.LJIIJ;
        if (c4118a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LayerEventDispatcher LIZLLL2 = c4118a.LIZLLL();
        C411632Qz c411632Qz = C411632Qz.LIZIZ;
        C4118a c4118a2 = this.LJIIJ;
        if (c4118a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C2NY<AbstractC4092b> c2ny = c4118a2.LJFF;
        C4118a c4118a3 = this.LJIIJ;
        if (c4118a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC4092b LIZJ = c4118a3.LIZJ();
        Context context = this.LJIIL;
        C4118a c4118a4 = this.LJIIJ;
        if (c4118a4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c411632Qz.LIZ(c2ny, layerDescriptorList, LIZJ, context, c4118a4.LIZ(), this.LJIIIZ, z);
        if (!LIZLLL.getValue().booleanValue()) {
            List<AbstractC4093a> list = this.LJIIIZ;
            ArrayList<C4096c> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C4096c) {
                    arrayList.add(obj);
                }
            }
            for (C4096c c4096c : arrayList) {
                C4111d LIZIZ = LIZIZ();
                C4118a c4118a5 = this.LJIIJ;
                if (c4118a5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LIZIZ.LIZIZ(c4096c, c4118a5.LIZJ());
            }
        }
        for (AbstractC4093a abstractC4093a : this.LJIIIZ) {
            LIZ(abstractC4093a.getLayerDelegate());
            if (abstractC4093a instanceof C4095b) {
                C2R1 c2r1 = this.LJII;
                if (c2r1 != null) {
                    C4095b c4095b = (C4095b) abstractC4093a;
                    C4118a c4118a6 = this.LJIIJ;
                    if (c4118a6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    c2r1.LIZ(c4095b, c4118a6.LIZJ());
                }
            } else if (abstractC4093a instanceof C4096c) {
                C4096c c4096c2 = (C4096c) abstractC4093a;
                c4096c2.setLayoutListener$infrastructure_cnDouyinRelease(LIZ());
                c4096c2.setGlobalElementCenter$infrastructure_cnDouyinRelease(LIZ());
                C2R0 c2r0 = this.LJIIIIZZ;
                if (c2r0 != null) {
                    C4118a c4118a7 = this.LJIIJ;
                    if (c4118a7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    c2r0.LIZ(c4096c2, c4118a7.LIZJ());
                }
            }
        }
        if (!LIZLLL.getValue().booleanValue()) {
            List<AbstractC4093a> list2 = this.LJIIIZ;
            ArrayList<C4096c> arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof C4096c) {
                    arrayList2.add(obj2);
                }
            }
            for (C4096c c4096c3 : arrayList2) {
                LIZIZ().LIZ(c4096c3);
            }
        }
        mo29786getLifecycle().addObserver(LIZLLL2);
    }

    public final void LIZ(C4100c c4100c) {
        Object obj;
        C2R0 c2r0;
        if (PatchProxy.proxy(new Object[]{c4100c}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4100c);
        Iterator<T> it = this.LJIIIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AbstractC4093a) obj).LIZ(c4100c) != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC4093a abstractC4093a = (AbstractC4093a) obj;
        if (abstractC4093a != null) {
            if (abstractC4093a instanceof C4095b) {
                C2R1 c2r1 = this.LJII;
                if (c2r1 == null) {
                    return;
                }
                C4095b c4095b = (C4095b) abstractC4093a;
                if (!PatchProxy.proxy(new Object[]{c4095b, c4100c}, c2r1, C2R1.LIZ, false, 4).isSupported) {
                    C106862S5w.LIZ(c4095b, c4100c);
                    if (!PatchProxy.proxy(new Object[]{c4100c}, c4095b, C4095b.LIZ, false, 6).isSupported) {
                        C106862S5w.LIZ(c4100c);
                        c4095b.LIZIZ.LIZIZ(c4100c);
                    }
                }
            } else if (!(abstractC4093a instanceof C4096c) || (c2r0 = this.LJIIIIZZ) == null) {
            } else {
                C4096c c4096c = (C4096c) abstractC4093a;
                if (!PatchProxy.proxy(new Object[]{c4096c, c4100c}, c2r0, C2R0.LIZ, false, 5).isSupported) {
                    C106862S5w.LIZ(c4096c, c4100c);
                    if (!PatchProxy.proxy(new Object[]{c4100c}, c4096c, C4096c.LIZ, false, 7).isSupported) {
                        C106862S5w.LIZ(c4100c);
                        Element<?> LIZ2 = c4096c.LIZ(c4100c);
                        if (LIZ2 != null) {
                            AbstractC411552Qr abstractC411552Qr = c4096c.LIZJ;
                            if (abstractC411552Qr != null) {
                                abstractC411552Qr.LIZ(LIZ2, c4096c);
                            }
                            c4096c.LIZIZ.LIZIZ(c4100c);
                            c4096c.removeView(LIZ2.LIZJ);
                        }
                    }
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(23737);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIILIIL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJIILIIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJIILIIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported || this.LJIILIIL.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        this.LJIILIIL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported || this.LJIILIIL.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        this.LJIILIIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Integer num;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported || this.LJIILIIL.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ.clear();
        if (this.LJIIJJI) {
            C4118a c4118a = this.LJIIJ;
            if (c4118a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            AbstractC4092b LIZJ = c4118a.LIZJ();
            if (!PatchProxy.proxy(new Object[0], LIZJ, AbstractC4092b.LIZ, false, 3).isSupported && (num = LIZJ.LIZIZ) != null) {
                int intValue = num.intValue();
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, C410092Lb.LIZJ, C410092Lb.LIZ, false, 3).isSupported && C410092Lb.LIZIZ.containsKey(Integer.valueOf(intValue))) {
                    C410092Lb.LIZIZ.remove(Integer.valueOf(intValue));
                }
            }
        }
        this.LJIILIIL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public final Element<?> LIZIZ(C4100c c4100c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (Element) proxy.result;
        }
        C106862S5w.LIZ(c4100c);
        for (AbstractC4093a abstractC4093a : this.LJIIIZ) {
            Element<?> LIZ2 = abstractC4093a.LIZ(c4100c);
            if (LIZ2 != null) {
                return LIZ2;
            }
        }
        return null;
    }

    private final void LIZ(LayerDelegate<? extends AbstractC4093a, ? extends AbstractC4092b> layerDelegate) {
        if (PatchProxy.proxy(new Object[]{layerDelegate}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C4118a c4118a = this.LJIIJ;
        if (c4118a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        layerDelegate.LIZ(c4118a.LJII);
        if (layerDelegate instanceof AbstractC4106a) {
            C4118a c4118a2 = this.LJIIJ;
            if (c4118a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c4118a2.LIZLLL().LIZ((AbstractC4106a) layerDelegate);
        }
        if (layerDelegate instanceof ViewLayerDelegate) {
            ViewLayerDelegate viewLayerDelegate = (ViewLayerDelegate) layerDelegate;
            viewLayerDelegate.LIZ(LIZIZ());
            viewLayerDelegate.LIZ(this);
        }
        mo29786getLifecycle().addObserver(layerDelegate);
    }

    public final <T extends LayerDelegate<? extends AbstractC4093a, ? extends AbstractC4092b>> T LIZ(LayerIndex layerIndex) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layerIndex}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(layerIndex);
        Iterator<T> it = this.LJIIIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AbstractC4093a) obj).getLayerIndex() == layerIndex) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC4093a abstractC4093a = (AbstractC4093a) obj;
        if (abstractC4093a == null) {
            return null;
        }
        return (T) abstractC4093a.getLayerDelegate();
    }

    public final LayerManager LIZ(C4118a c4118a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4118a}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (LayerManager) proxy.result;
        }
        C106862S5w.LIZ(c4118a);
        if (this.LJIIJJI) {
            return this;
        }
        this.LJIIJ = c4118a;
        this.LJII = new C2R1(c4118a.LIZIZ(), c4118a.LIZJ(), c4118a);
        this.LJIIIIZZ = new C2R0(LIZIZ(), c4118a.LIZIZ(), this.LIZIZ, c4118a.LIZJ(), c4118a);
        boolean z = PatchProxy.proxy(new Object[0], c4118a.LIZJ(), AbstractC4092b.LIZ, false, 2).isSupported;
        this.LJIIJJI = true;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r2 != null) goto L16;
     */
    @Override // p003X.AbstractC411512Qn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(p003X.AbstractC411282Pq<? extends com.bytedance.android.live.core.tetris.layer.AbstractC4092b> r17) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.tetris.layer.view.LayerManager.LIZ(X.2Pq):void");
    }

    public LayerManager(FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        C106862S5w.LIZ(frameLayout, lifecycleOwner);
        this.LIZIZ = frameLayout;
        this.LIZJ = lifecycleOwner;
        this.LIZIZ.setClipChildren(false);
        this.LIZIZ.setClipToPadding(false);
        Context context = this.LIZIZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LJIIL = context;
        this.LIZJ.mo29786getLifecycle().addObserver(this);
    }

    public static /* synthetic */ void LIZ(LayerManager layerManager, LayerDescriptorList layerDescriptorList, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{layerManager, layerDescriptorList, (byte) 0, 2, null}, null, LIZ, true, 5).isSupported) {
            return;
        }
        layerManager.LIZ(layerDescriptorList, true);
    }
}
