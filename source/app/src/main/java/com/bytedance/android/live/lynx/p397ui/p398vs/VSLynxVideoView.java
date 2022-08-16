package com.bytedance.android.live.lynx.p397ui.p398vs;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.live.episode.Episode;
import com.bytedance.android.livesdkapi.depend.model.live.episode.EpisodePaidInfo;
import com.bytedance.android.livesdkapi.depend.model.live.episode.EpisodeVideo;
import com.bytedance.android.livesdkapi.depend.model.live.episode.EpisodeVideoModelContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.p1543ui.LynxUI;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC95272Nfu;
import p003X.C106862S5w;
import p003X.C142460e0c;
import p003X.C4557940v;
import p003X.C4AO;
import p003X.C95452Nio;
import p003X.KM9;
import p003X.T47;

/* renamed from: com.bytedance.android.live.lynx.ui.vs.VSLynxVideoView */
/* loaded from: classes15.dex */
public final class VSLynxVideoView extends LynxUI<C5164a> {
    public static final T47 Companion = new T47((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32400);
    }

    @LynxUIMethod
    public final void play() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        ((C5164a) this.mView).LIZIZ();
    }

    @LynxUIMethod
    public final void pause() {
        AbstractC95272Nfu abstractC95272Nfu;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C5164a c5164a = (C5164a) this.mView;
        if (!PatchProxy.proxy(new Object[0], c5164a, C5164a.LIZ, false, 16).isSupported && (abstractC95272Nfu = c5164a.LJIIJJI) != null) {
            abstractC95272Nfu.LIZJ();
        }
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void destroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        super.destroy();
        C5164a c5164a = (C5164a) this.mView;
        if (c5164a != null && !PatchProxy.proxy(new Object[0], c5164a, C5164a.LIZ, false, 18).isSupported) {
            c5164a.LJI();
            AbstractC95272Nfu abstractC95272Nfu = c5164a.LJIIJJI;
            if (abstractC95272Nfu != null) {
                Context context = c5164a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                abstractC95272Nfu.LIZIZ(context, c5164a.LJIILJJIL);
            }
            AbstractC95272Nfu abstractC95272Nfu2 = c5164a.LJIIJJI;
            if (abstractC95272Nfu2 != null) {
                Context context2 = c5164a.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                abstractC95272Nfu2.LIZIZ(context2, c5164a.LJIILL);
            }
        }
    }

    @LynxUIMethod
    public final void finishedPay() {
        EpisodePaidInfo episodePaidInfo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        C5164a c5164a = (C5164a) this.mView;
        if (!PatchProxy.proxy(new Object[0], c5164a, C5164a.LIZ, false, 33).isSupported) {
            AbstractC95272Nfu abstractC95272Nfu = c5164a.LJIIJJI;
            if (abstractC95272Nfu != null) {
                abstractC95272Nfu.LIZIZ(true);
            }
            Episode episode = c5164a.LJFF;
            if (episode != null && (episodePaidInfo = episode.paidInfo) != null) {
                episodePaidInfo.viewRight = 1;
            }
            c5164a.LIZ();
            AbstractC95272Nfu abstractC95272Nfu2 = c5164a.LJIIJJI;
            if (abstractC95272Nfu2 == null || !abstractC95272Nfu2.LIZIZ()) {
                c5164a.LIZIZ();
            }
        }
    }

    @LynxUIMethod
    public final void enterRoom() {
        Episode episode;
        String str;
        EpisodeVideo episodeVideo;
        EpisodeVideoModelContainer episodeVideoModelContainer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C5164a c5164a = (C5164a) this.mView;
        if (!PatchProxy.proxy(new Object[0], c5164a, C5164a.LIZ, false, 14).isSupported && c5164a.LJIIJJI != null && (episode = c5164a.LJFF) != null && episode.idStr != null) {
            Episode episode2 = c5164a.LJFF;
            Intrinsics.checkNotNull(episode2);
            String str2 = episode2.idStr;
            Bundle bundle = new Bundle();
            Intrinsics.checkNotNullExpressionValue(str2, "");
            bundle.putLong("live.intent.extra.ITEM_ID", Long.parseLong(str2));
            bundle.putInt("live.intent.extra.ITEM_TYPE", C4AO.LJIJJLI);
            String str3 = C4AO.LIZJ;
            Episode episode3 = c5164a.LJFF;
            C142460e0c c142460e0c = null;
            if (episode3 != null && (episodeVideo = episode3.video) != null && (episodeVideoModelContainer = episodeVideo.playInfo) != null) {
                str = episodeVideoModelContainer.json;
            } else {
                str = null;
            }
            bundle.putString(str3, str);
            if (c5164a.LJIIIIZZ) {
                bundle.putBoolean(C4AO.LJIIJ, true);
                AbstractC95272Nfu abstractC95272Nfu = c5164a.LJIIJJI;
                if (abstractC95272Nfu != null) {
                    c142460e0c = abstractC95272Nfu.LIZ();
                }
                C4557940v.LIZ(c142460e0c);
                AbstractC95272Nfu abstractC95272Nfu2 = c5164a.LJIIJJI;
                if (abstractC95272Nfu2 != null) {
                    abstractC95272Nfu2.mo23168LJ(false);
                }
            } else {
                bundle.putBoolean(C4AO.LJIIJ, false);
                AbstractC95272Nfu abstractC95272Nfu3 = c5164a.LJIIJJI;
                if (abstractC95272Nfu3 != null) {
                    abstractC95272Nfu3.mo23168LJ(true);
                }
            }
            bundle.putLong("live.intent.extra.EXTRA_USER_ACTION_ENTER_ROOM_START_TIME", System.currentTimeMillis());
            bundle.putString("live.intent.extra.EXTRA_USER_ACTION_ENTER_ROOM_TYPE", "type_inner");
            Bundle bundle2 = new Bundle();
            c5164a.LIZ(c5164a.LJIIIZ, bundle2);
            bundle.putBundle(C4AO.LJIIIIZZ, bundle2);
            bundle.putAll(bundle2);
            C95452Nio.m23163LJ().LJJIFFI().startLive(c5164a.getContext(), Long.parseLong(str2), bundle);
            c5164a.f26516LJ = true;
        }
    }

    public VSLynxVideoView(LynxContext lynxContext) {
        super(lynxContext);
    }

    @LynxProp(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        ((C5164a) this.mView).setAutoPlay(z);
    }

    @LynxProp(name = "repeat")
    public final void setLoop(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        ((C5164a) this.mView).setRepeat(z);
    }

    @LynxProp(name = "muted")
    public final void setMuted(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        ((C5164a) this.mView).setMuted(z);
    }

    @LynxProp(name = "objectfit")
    public final void setObjectFit(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ((C5164a) this.mView).setObjectFit(str);
    }

    @LynxProp(name = "poster")
    public final void setPoster(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ((C5164a) this.mView).setPoster(str);
    }

    @LynxProp(name = "startposition")
    public final void setStartPosition(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        ((C5164a) this.mView).setStartPosition(i);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public final C5164a mo29230createView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C5164a) proxy.result;
        }
        Intrinsics.checkNotNull(context);
        C5164a c5164a = new C5164a(context, null, 0, 6);
        c5164a.setEventChangeListener(new VSLynxVideoView$createView$$inlined$apply$lambda$1(this));
        return c5164a;
    }

    @LynxUIMethod
    public final void mute(ReadableMap readableMap) {
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap);
        ((C5164a) this.mView).setMuted(readableMap.getBoolean("muted", true));
    }

    @LynxProp(name = "episode")
    public final void setEpisode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        try {
            Episode episode = (Episode) KM9.LIZ().fromJson(str, (Class<Object>) Episode.class);
            if (episode != null) {
                ((C5164a) this.mView).setEpisode(episode);
            }
        } catch (Exception unused) {
        }
    }

    @LynxProp(name = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        if (!PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 8).isSupported && readableMap != null) {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            Intrinsics.checkNotNullExpressionValue(hashMap, "");
            ((C5164a) this.mView).setLogExtra(hashMap);
        }
    }

    @LynxUIMethod
    public final void seek(ReadableMap readableMap) {
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap);
        C5164a c5164a = (C5164a) this.mView;
        long j = readableMap.getLong("position", 0L);
        boolean z = readableMap.getBoolean("shouldPlay", true);
        if (!PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c5164a, C5164a.LIZ, false, 17).isSupported) {
            c5164a.LJI = z;
            c5164a.LIZLLL = j;
            AbstractC95272Nfu abstractC95272Nfu = c5164a.LJIIJJI;
            if (abstractC95272Nfu != null) {
                abstractC95272Nfu.LIZ(c5164a.LIZLLL);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), rect}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), rect}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
