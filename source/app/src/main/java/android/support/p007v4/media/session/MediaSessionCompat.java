package android.support.p007v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p007v4.media.MediaDescriptionCompat;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p003X.AbstractBinderC144148eRq;
import p003X.AbstractC144146eRo;
import p003X.AbstractC144165eS7;
import p003X.C116088Vms;
import p003X.C144153eRv;
import p003X.C144162eS4;
import p003X.C144164eS6;
import p003X.C144185eSR;
import p003X.C144186eSS;
import p003X.C144187eST;
import p003X.C144188eSU;
import p003X.C144189eSV;
import p003X.C144191eSX;
import p003X.C76526GFc;
import p003X.HandlerC144190eSW;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* loaded from: classes19.dex */
public class MediaSessionCompat {
    public static int sMaxBitmapSize;
    public final ArrayList<AbstractC0136g> mActiveListeners;
    public final MediaControllerCompat mController;
    public final AbstractC0135a mImpl;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    /* loaded from: classes19.dex */
    public interface AbstractC0135a {
        static {
            Covode.recordClassIndex(204);
        }

        void LIZ(int i);

        void LIZ(C144153eRv c144153eRv);

        void LIZ(AbstractC144165eS7 abstractC144165eS7);

        void LIZ(PendingIntent pendingIntent);

        void LIZ(Bundle bundle);

        void LIZ(MediaMetadataCompat mediaMetadataCompat);

        void LIZ(Callback callback, Handler handler);

        void LIZ(PlaybackStateCompat playbackStateCompat);

        void LIZ(CharSequence charSequence);

        void LIZ(String str, Bundle bundle);

        void LIZ(List<QueueItem> list);

        void LIZ(boolean z);

        boolean LIZ();

        void LIZIZ();

        void LIZIZ(int i);

        void LIZIZ(PendingIntent pendingIntent);

        void LIZIZ(boolean z);

        Token LIZJ();

        void LIZJ(int i);

        PlaybackStateCompat LIZLLL();

        void LIZLLL(int i);

        /* renamed from: LJ */
        Object mo21224LJ();

        /* renamed from: LJ */
        void mo21223LJ(int i);

        String LJFF();

        C144153eRv LJI();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    /* loaded from: classes18.dex */
    public interface AbstractC0136g {
        static {
            Covode.recordClassIndex(217);
        }
    }

    static {
        Covode.recordClassIndex(189);
    }

    public Object getRemoteControlClient() {
        return null;
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* loaded from: classes19.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            static {
                Covode.recordClassIndex(203);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Token[] newArray(int i) {
                return new Token[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Token createFromParcel(Parcel parcel) {
                int i = Build.VERSION.SDK_INT;
                return new Token(parcel.readParcelable(null));
            }
        };
        public AbstractC144146eRo mExtraBinder;
        public final Object mInner;
        public Bundle mSessionToken2Bundle;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AbstractC144146eRo getExtraBinder() {
            return this.mExtraBinder;
        }

        public final Bundle getSessionToken2Bundle() {
            return this.mSessionToken2Bundle;
        }

        public final Object getToken() {
            return this.mInner;
        }

        static {
            Covode.recordClassIndex(202);
        }

        public final int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            AbstractC144146eRo abstractC144146eRo = this.mExtraBinder;
            if (abstractC144146eRo != null) {
                C76526GFc.LIZ(bundle, "android.support.v4.media.session.EXTRA_BINDER", abstractC144146eRo.asBinder());
            }
            Bundle bundle2 = this.mSessionToken2Bundle;
            if (bundle2 != null) {
                bundle.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", bundle2);
            }
            return bundle;
        }

        public final void setExtraBinder(AbstractC144146eRo abstractC144146eRo) {
            this.mExtraBinder = abstractC144146eRo;
        }

        public final void setSessionToken2Bundle(Bundle bundle) {
            this.mSessionToken2Bundle = bundle;
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.mInner;
            if (obj2 == null) {
                if (token.mInner == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            AbstractC144146eRo LIZ = AbstractBinderC144148eRq.LIZ(C76526GFc.LIZ(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
            Token token = (Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new Token(token.mInner, LIZ, bundle2);
        }

        public Token(Object obj, AbstractC144146eRo abstractC144146eRo) {
            this(obj, abstractC144146eRo, null);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = Build.VERSION.SDK_INT;
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }

        public static Token fromToken(Object obj, AbstractC144146eRo abstractC144146eRo) {
            if (obj != null) {
                int i = Build.VERSION.SDK_INT;
                if (obj instanceof MediaSession.Token) {
                    return new Token(obj, abstractC144146eRo);
                }
                throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        public Token(Object obj, AbstractC144146eRo abstractC144146eRo, Bundle bundle) {
            this.mInner = obj;
            this.mExtraBinder = abstractC144146eRo;
            this.mSessionToken2Bundle = bundle;
        }
    }

    public MediaControllerCompat getController() {
        return this.mController;
    }

    public String getCallingPackage() {
        return this.mImpl.LJFF();
    }

    public final C144153eRv getCurrentControllerInfo() {
        return this.mImpl.LJI();
    }

    public Object getMediaSession() {
        return this.mImpl.mo21224LJ();
    }

    public Token getSessionToken() {
        return this.mImpl.LIZJ();
    }

    public boolean isActive() {
        return this.mImpl.LIZ();
    }

    public void release() {
        this.mImpl.LIZIZ();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* loaded from: classes19.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            static {
                Covode.recordClassIndex(199);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };
        public final MediaDescriptionCompat LIZ;
        public final long LIZIZ;
        public Object LIZJ;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(198);
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.LIZ + ", Id=" + this.LIZIZ + " }";
        }

        public QueueItem(Parcel parcel) {
            this.LIZ = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.LIZIZ = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.LIZ.writeToParcel(parcel, i);
            parcel.writeLong(this.LIZIZ);
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat != null) {
                if (j != -1) {
                    this.LIZ = mediaDescriptionCompat;
                    this.LIZIZ = j;
                    this.LIZJ = obj;
                    return;
                }
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            throw new IllegalArgumentException("Description cannot be null.");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* loaded from: classes19.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            static {
                Covode.recordClassIndex(201);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        };
        public ResultReceiver LIZ;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(200);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.LIZ = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.LIZ.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback */
    /* loaded from: classes19.dex */
    public static abstract class Callback {
        public HandlerC144190eSW mCallbackHandler;
        public final Object mCallbackObj;
        public boolean mMediaPlayPauseKeyPending;
        public WeakReference<AbstractC0135a> mSessionImpl;

        static {
            Covode.recordClassIndex(193);
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public Callback() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.mCallbackObj = new C144186eSS(new C144189eSV(this));
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.mCallbackObj = new C144187eST(new C144191eSX(this));
            } else {
                int i = Build.VERSION.SDK_INT;
                this.mCallbackObj = new C144188eSU(new C144185eSR(this));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMediaPlayPauseKeySingleTapIfPending(p003X.C144153eRv r11) {
            /*
                r10 = this;
                boolean r0 = r10.mMediaPlayPauseKeyPending
                if (r0 != 0) goto L5
                return
            L5:
                r7 = 0
                r10.mMediaPlayPauseKeyPending = r7
                X.eSW r1 = r10.mCallbackHandler
                r0 = 1
                r1.removeMessages(r0)
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$a> r0 = r10.mSessionImpl
                java.lang.Object r6 = r0.get()
                android.support.v4.media.session.MediaSessionCompat$a r6 = (android.support.p007v4.media.session.MediaSessionCompat.AbstractC0135a) r6
                if (r6 != 0) goto L19
                return
            L19:
                android.support.v4.media.session.PlaybackStateCompat r0 = r6.LIZLLL()
                r8 = 0
                if (r0 != 0) goto L4b
                r4 = 0
            L23:
                r3 = 0
            L24:
                r1 = 516(0x204, double:2.55E-321)
                long r1 = r1 & r4
                int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r0 == 0) goto L49
                r2 = 1
            L2c:
                r0 = 514(0x202, double:2.54E-321)
                long r4 = r4 & r0
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 == 0) goto L34
                r7 = 1
            L34:
                r6.LIZ(r11)
                if (r3 == 0) goto L43
                if (r7 == 0) goto L3e
                r10.onPause()
            L3e:
                r0 = 0
                r6.LIZ(r0)
                return
            L43:
                if (r2 == 0) goto L3e
                r10.onPlay()
                goto L3e
            L49:
                r2 = 0
                goto L2c
            L4b:
                long r4 = r0.getActions()
                int r1 = r0.getState()
                r0 = 3
                if (r1 != r0) goto L23
                r3 = 1
                goto L24
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.session.MediaSessionCompat.Callback.handleMediaPlayPauseKeySingleTapIfPending(X.eRv):void");
        }

        public boolean onMediaButtonEvent(Intent intent) {
            AbstractC0135a abstractC0135a;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (abstractC0135a = this.mSessionImpl.get()) == null || this.mCallbackHandler == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C144153eRv LJI = abstractC0135a.LJI();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                handleMediaPlayPauseKeySingleTapIfPending(LJI);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                handleMediaPlayPauseKeySingleTapIfPending(LJI);
            } else if (this.mMediaPlayPauseKeyPending) {
                this.mCallbackHandler.removeMessages(1);
                this.mMediaPlayPauseKeyPending = false;
                PlaybackStateCompat LIZLLL = abstractC0135a.LIZLLL();
                if (LIZLLL != null && (LIZLLL.getActions() & 32) != 0) {
                    onSkipToNext();
                    return true;
                }
            } else {
                this.mMediaPlayPauseKeyPending = true;
                HandlerC144190eSW handlerC144190eSW = this.mCallbackHandler;
                handlerC144190eSW.sendMessageDelayed(handlerC144190eSW.obtainMessage(1, LJI), ViewConfiguration.getDoubleTapTimeout());
                return true;
            }
            return true;
        }

        public void setSessionImpl(AbstractC0135a abstractC0135a, Handler handler) {
            this.mSessionImpl = new WeakReference<>(abstractC0135a);
            HandlerC144190eSW handlerC144190eSW = this.mCallbackHandler;
            if (handlerC144190eSW != null) {
                handlerC144190eSW.removeCallbacksAndMessages(null);
            }
            this.mCallbackHandler = new HandlerC144190eSW(this, handler.getLooper());
        }
    }

    public void setCallback(Callback callback) {
        setCallback(callback, null);
    }

    public void setCaptioningEnabled(boolean z) {
        this.mImpl.LIZIZ(z);
    }

    public void setExtras(Bundle bundle) {
        this.mImpl.LIZ(bundle);
    }

    public void setFlags(int i) {
        this.mImpl.LIZ(i);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mImpl.LIZIZ(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mImpl.LIZ(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.mImpl.LIZ(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i) {
        this.mImpl.LIZIZ(i);
    }

    public void setQueue(List<QueueItem> list) {
        this.mImpl.LIZ(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mImpl.LIZ(charSequence);
    }

    public void setRatingType(int i) {
        this.mImpl.LIZJ(i);
    }

    public void setRepeatMode(int i) {
        this.mImpl.LIZLLL(i);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mImpl.LIZ(pendingIntent);
    }

    public void setShuffleMode(int i) {
        this.mImpl.mo21223LJ(i);
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public void addOnActiveChangeListener(AbstractC0136g abstractC0136g) {
        if (abstractC0136g != null) {
            this.mActiveListeners.add(abstractC0136g);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void removeOnActiveChangeListener(AbstractC0136g abstractC0136g) {
        if (abstractC0136g != null) {
            this.mActiveListeners.remove(abstractC0136g);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void setPlaybackToRemote(AbstractC144165eS7 abstractC144165eS7) {
        if (abstractC144165eS7 != null) {
            this.mImpl.LIZ(abstractC144165eS7);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void setActive(boolean z) {
        this.mImpl.LIZ(z);
        Iterator<AbstractC0136g> it = this.mActiveListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        if (context != null && obj != null) {
            int i = Build.VERSION.SDK_INT;
            return new MediaSessionCompat(context, new C144164eS6(obj));
        }
        return null;
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.LIZ(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void setCallback(Callback callback, Handler handler) {
        AbstractC0135a abstractC0135a;
        if (callback == null) {
            abstractC0135a = this.mImpl;
            handler = null;
            callback = null;
        } else {
            abstractC0135a = this.mImpl;
            if (handler == null) {
                handler = new Handler();
            }
        }
        abstractC0135a.LIZ(callback, handler);
    }

    public MediaSessionCompat(Context context, AbstractC0135a abstractC0135a) {
        this.mActiveListeners = new ArrayList<>();
        this.mImpl = abstractC0135a;
        int i = Build.VERSION.SDK_INT;
        if (!C116088Vms.LIZIZ(abstractC0135a.mo21224LJ())) {
            setCallback(new Callback(this) { // from class: android.support.v4.media.session.MediaSessionCompat.3
                static {
                    Covode.recordClassIndex(192);
                }
            });
        }
        this.mController = new MediaControllerCompat(context, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r1 > r7) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p007v4.media.session.PlaybackStateCompat getStateWithUpdatedPosition(android.support.p007v4.media.session.PlaybackStateCompat r12, android.support.p007v4.media.MediaMetadataCompat r13) {
        /*
            if (r12 == 0) goto L67
            long r3 = r12.getPosition()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            int r1 = r12.getState()
            r0 = 3
            if (r1 == r0) goto L21
            int r1 = r12.getState()
            r0 = 4
            if (r1 == r0) goto L21
            int r1 = r12.getState()
            r0 = 5
            if (r1 != r0) goto L67
        L21:
            long r7 = r12.getLastPositionUpdateTime()
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L67
            long r10 = android.os.SystemClock.elapsedRealtime()
            float r3 = r12.getPlaybackSpeed()
            long r1 = r10 - r7
            float r0 = (float) r1
            float r3 = r3 * r0
            long r1 = (long) r3
            long r3 = r12.getPosition()
            long r1 = r1 + r3
            if (r13 == 0) goto L68
            java.lang.String r3 = "android.media.metadata.DURATION"
            boolean r0 = r13.containsKey(r3)
            if (r0 == 0) goto L68
            long r7 = r13.getLong(r3)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L68
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L68
        L53:
            android.support.v4.media.session.PlaybackStateCompat$Builder r5 = new android.support.v4.media.session.PlaybackStateCompat$Builder
            r5.<init>(r12)
            int r6 = r12.getState()
            float r9 = r12.getPlaybackSpeed()
            r5.setState(r6, r7, r9, r10)
            android.support.v4.media.session.PlaybackStateCompat r12 = r5.build()
        L67:
            return r12
        L68:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6f
            r7 = 0
            goto L53
        L6f:
            r7 = r1
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.session.MediaSessionCompat.getStateWithUpdatedPosition(android.support.v4.media.session.PlaybackStateCompat, android.support.v4.media.MediaMetadataCompat):android.support.v4.media.session.PlaybackStateCompat");
    }

    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.mActiveListeners = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if ((componentName != null || (componentName = MediaButtonReceiver.getMediaButtonReceiverComponent(context)) != null) && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    this.mImpl = new C144162eS4(context, str, bundle);
                    setCallback(new Callback(this) { // from class: android.support.v4.media.session.MediaSessionCompat.1
                        static {
                            Covode.recordClassIndex(190);
                        }
                    });
                    this.mImpl.LIZIZ(pendingIntent);
                } else {
                    int i = Build.VERSION.SDK_INT;
                    this.mImpl = new C144164eS6(context, str, bundle);
                    setCallback(new Callback(this) { // from class: android.support.v4.media.session.MediaSessionCompat.2
                        static {
                            Covode.recordClassIndex(191);
                        }
                    });
                    this.mImpl.LIZIZ(pendingIntent);
                }
                this.mController = new MediaControllerCompat(context, this);
                if (sMaxBitmapSize == 0) {
                    sMaxBitmapSize = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
