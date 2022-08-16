package android.support.p007v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p003X.AbstractBinderC144148eRq;
import p003X.AbstractC144140eRi;
import p003X.BinderC144145eRn;
import p003X.C144141eRj;
import p003X.C144142eRk;
import p003X.C144144eRm;
import p003X.C144160eS2;
import p003X.C76526GFc;
import p003X.HandlerC144077eQh;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
/* loaded from: classes19.dex */
public final class MediaControllerCompat {
    public final MediaSessionCompat.Token LIZ;
    public final AbstractC144140eRi LIZIZ;

    static {
        Covode.recordClassIndex(176);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    /* loaded from: classes19.dex */
    public static class MediaControllerImplApi21 implements AbstractC144140eRi {
        public final Object LIZ;
        public final Object LIZIZ = new Object();
        public final List<AbstractC0128a> LIZJ = new ArrayList();
        public HashMap<AbstractC0128a, BinderC0127a> LIZLLL = new HashMap<>();

        /* renamed from: LJ */
        public final MediaSessionCompat.Token f20192LJ;

        static {
            Covode.recordClassIndex(177);
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        /* loaded from: classes19.dex */
        public static class BinderC0127a extends BinderC144145eRn {
            static {
                Covode.recordClassIndex(179);
            }

            @Override // p003X.BinderC144145eRn, android.support.p007v4.media.session.AbstractC0140a
            public final void LIZ() {
                throw new AssertionError();
            }

            public BinderC0127a(AbstractC0128a abstractC0128a) {
                super(abstractC0128a);
            }

            @Override // p003X.BinderC144145eRn, android.support.p007v4.media.session.AbstractC0140a
            public final void LIZ(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // p003X.BinderC144145eRn, android.support.p007v4.media.session.AbstractC0140a
            public final void LIZ(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // p003X.BinderC144145eRn, android.support.p007v4.media.session.AbstractC0140a
            public final void LIZ(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // p003X.BinderC144145eRn, android.support.p007v4.media.session.AbstractC0140a
            public final void LIZ(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // p003X.BinderC144145eRn, android.support.p007v4.media.session.AbstractC0140a
            public final void LIZ(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        /* loaded from: classes19.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> LIZ;

            static {
                Covode.recordClassIndex(178);
            }

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.LIZ = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.LIZ.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.LIZIZ) {
                        mediaControllerImplApi21.f20192LJ.setExtraBinder(AbstractBinderC144148eRq.LIZ(C76526GFc.LIZ(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f20192LJ.setSessionToken2Bundle(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        if (mediaControllerImplApi21.f20192LJ.getExtraBinder() != null) {
                            for (AbstractC0128a abstractC0128a : mediaControllerImplApi21.LIZJ) {
                                BinderC0127a binderC0127a = new BinderC0127a(abstractC0128a);
                                mediaControllerImplApi21.LIZLLL.put(abstractC0128a, binderC0127a);
                                abstractC0128a.LIZIZ = binderC0127a;
                                try {
                                    mediaControllerImplApi21.f20192LJ.getExtraBinder().LIZ(binderC0127a);
                                    abstractC0128a.LIZ(13, null, null);
                                } catch (RemoteException unused) {
                                }
                            }
                            mediaControllerImplApi21.LIZJ.clear();
                        }
                    }
                }
            }
        }

        @Override // p003X.AbstractC144140eRi
        public final boolean LIZ(KeyEvent keyEvent) {
            return ((MediaController) this.LIZ).dispatchMediaButtonEvent(keyEvent);
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f20192LJ = token;
            this.LIZ = new MediaController(context, (MediaSession.Token) this.f20192LJ.getToken());
            if (this.LIZ != null) {
                if (this.f20192LJ.getExtraBinder() == null) {
                    ((MediaController) this.LIZ).sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
                    return;
                }
                return;
            }
            throw new RemoteException();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    /* loaded from: classes19.dex */
    public static abstract class AbstractC0128a implements IBinder.DeathRecipient {
        public HandlerC144077eQh LIZ;
        public AbstractC0140a LIZIZ;

        static {
            Covode.recordClassIndex(180);
        }

        public AbstractC0128a() {
            int i = Build.VERSION.SDK_INT;
            new C144160eS2(new C144144eRm(this));
        }

        public final void LIZ(int i, Object obj, Bundle bundle) {
            HandlerC144077eQh handlerC144077eQh = this.LIZ;
            if (handlerC144077eQh != null) {
                Message obtainMessage = handlerC144077eQh.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    public final boolean LIZ(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.LIZIZ.LIZ(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        new HashSet();
        if (token != null) {
            this.LIZ = token;
            if (Build.VERSION.SDK_INT >= 24) {
                this.LIZIZ = new C144142eRk(context, token);
                return;
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.LIZIZ = new C144141eRj(context, token);
                return;
            } else {
                int i = Build.VERSION.SDK_INT;
                this.LIZIZ = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        AbstractC144140eRi abstractC144140eRi;
        new HashSet();
        this.LIZ = mediaSessionCompat.getSessionToken();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                abstractC144140eRi = new C144142eRk(context, this.LIZ);
            } else if (Build.VERSION.SDK_INT >= 23) {
                abstractC144140eRi = new C144141eRj(context, this.LIZ);
            } else {
                int i = Build.VERSION.SDK_INT;
                abstractC144140eRi = new MediaControllerImplApi21(context, this.LIZ);
            }
        } catch (RemoteException unused) {
            abstractC144140eRi = null;
        }
        this.LIZIZ = abstractC144140eRi;
    }
}
