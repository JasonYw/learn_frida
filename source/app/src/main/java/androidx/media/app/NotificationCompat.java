package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC76732GNa;

/* loaded from: classes16.dex */
public final class NotificationCompat {
    static {
        Covode.recordClassIndex(1491);
    }

    /* loaded from: classes16.dex */
    public static class MediaStyle extends NotificationCompat.Style {
        public int[] mActionsToShowInCompact;
        public PendingIntent mCancelButtonIntent;
        public boolean mShowCancelButton;
        public MediaSessionCompat.Token mToken;

        static {
            Covode.recordClassIndex(1492);
        }

        public int getBigContentViewLayoutResource(int i) {
            return i <= 3 ? 2131695517 : 2131695515;
        }

        public int getContentViewLayoutResource() {
            return 2131695522;
        }

        public MediaStyle() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews generateBigContentView() {
            /*
                r6 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r6.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$a> r0 = r0.mActions
                int r1 = r0.size()
                r0 = 5
                int r5 = java.lang.Math.min(r1, r0)
                int r0 = r6.getBigContentViewLayoutResource(r5)
                r4 = 0
                android.widget.RemoteViews r3 = r6.applyStandardTemplate(r4, r0, r4)
                r2 = 2131182782(0x7f0744be, float:1.798027E38)
                r3.removeAllViews(r2)
                if (r5 <= 0) goto L35
                r1 = 0
            L1f:
                androidx.core.app.NotificationCompat$Builder r0 = r6.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$a> r0 = r0.mActions
                java.lang.Object r0 = r0.get(r1)
                androidx.core.app.NotificationCompat$a r0 = (androidx.core.app.NotificationCompat.C0239a) r0
                android.widget.RemoteViews r0 = r6.generateMediaActionButton(r0)
                r3.addView(r2, r0)
                int r1 = r1 + 1
                if (r1 >= r5) goto L35
                goto L1f
            L35:
                boolean r0 = r6.mShowCancelButton
                r2 = 2131168974(0x7f070ece, float:1.7952265E38)
                if (r0 == 0) goto L59
                r3.setViewVisibility(r2, r4)
                androidx.core.app.NotificationCompat$Builder r0 = r6.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r1 = r0.getResources()
                r0 = 2131296289(0x7f090021, float:1.821049E38)
                int r1 = r1.getInteger(r0)
                java.lang.String r0 = "setAlpha"
                r3.setInt(r2, r0, r1)
                android.app.PendingIntent r0 = r6.mCancelButtonIntent
                r3.setOnClickPendingIntent(r2, r0)
                return r3
            L59:
                r0 = 8
                r3.setViewVisibility(r2, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.app.NotificationCompat.MediaStyle.generateBigContentView():android.widget.RemoteViews");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews generateContentView() {
            /*
                r9 = this;
                int r0 = r9.getContentViewLayoutResource()
                r3 = 1
                r5 = 0
                android.widget.RemoteViews r4 = r9.applyStandardTemplate(r5, r0, r3)
                androidx.core.app.NotificationCompat$Builder r0 = r9.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$a> r0 = r0.mActions
                int r6 = r0.size()
                int[] r0 = r9.mActionsToShowInCompact
                if (r0 != 0) goto L3c
                r8 = 0
            L17:
                r2 = 2131182782(0x7f0744be, float:1.798027E38)
                r4.removeAllViews(r2)
                if (r8 <= 0) goto L5f
                r7 = 0
            L20:
                if (r7 >= r6) goto L43
                androidx.core.app.NotificationCompat$Builder r0 = r9.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$a> r1 = r0.mActions
                int[] r0 = r9.mActionsToShowInCompact
                r0 = r0[r7]
                java.lang.Object r0 = r1.get(r0)
                androidx.core.app.NotificationCompat$a r0 = (androidx.core.app.NotificationCompat.C0239a) r0
                android.widget.RemoteViews r0 = r9.generateMediaActionButton(r0)
                r4.addView(r2, r0)
                int r7 = r7 + 1
                if (r7 >= r8) goto L5f
                goto L20
            L3c:
                int r1 = r0.length
                r0 = 3
                int r8 = java.lang.Math.min(r1, r0)
                goto L17
            L43:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r0 = 2
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                r1[r5] = r0
                int r6 = r6 - r3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                r1[r3] = r0
                java.lang.String r0 = "setShowActionsInCompactView: action %d out of bounds (max %d)"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r2.<init>(r0)
                throw r2
            L5f:
                boolean r3 = r9.mShowCancelButton
                r1 = 8
                r0 = 2131174002(0x7f072272, float:1.7962463E38)
                r2 = 2131168974(0x7f070ece, float:1.7952265E38)
                if (r3 == 0) goto L8b
                r4.setViewVisibility(r0, r1)
                r4.setViewVisibility(r2, r5)
                android.app.PendingIntent r0 = r9.mCancelButtonIntent
                r4.setOnClickPendingIntent(r2, r0)
                androidx.core.app.NotificationCompat$Builder r0 = r9.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r1 = r0.getResources()
                r0 = 2131296289(0x7f090021, float:1.821049E38)
                int r1 = r1.getInteger(r0)
                java.lang.String r0 = "setAlpha"
                r4.setInt(r2, r0, r1)
                return r4
            L8b:
                r4.setViewVisibility(r0, r5)
                r4.setViewVisibility(r2, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.app.NotificationCompat.MediaStyle.generateContentView():android.widget.RemoteViews");
        }

        public MediaStyle setCancelButtonIntent(PendingIntent pendingIntent) {
            this.mCancelButtonIntent = pendingIntent;
            return this;
        }

        public MediaStyle setMediaSession(MediaSessionCompat.Token token) {
            this.mToken = token;
            return this;
        }

        public MediaStyle setShowActionsInCompactView(int... iArr) {
            this.mActionsToShowInCompact = iArr;
            return this;
        }

        public MediaStyle(NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(AbstractC76732GNa abstractC76732GNa) {
            int i = Build.VERSION.SDK_INT;
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeContentView(AbstractC76732GNa abstractC76732GNa) {
            int i = Build.VERSION.SDK_INT;
            return null;
        }

        public MediaStyle setShowCancelButton(boolean z) {
            int i = Build.VERSION.SDK_INT;
            return this;
        }

        public static MediaSessionCompat.Token getMediaSession(Notification notification) {
            Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras != null) {
                int i = Build.VERSION.SDK_INT;
                Parcelable parcelable = extras.getParcelable("android.mediaSession");
                if (parcelable != null) {
                    return MediaSessionCompat.Token.fromToken(parcelable);
                }
                return null;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(AbstractC76732GNa abstractC76732GNa) {
            int i = Build.VERSION.SDK_INT;
            Notification.Builder LIZ = abstractC76732GNa.LIZ();
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            fillInMediaStyle(mediaStyle);
            LIZ.setStyle(mediaStyle);
        }

        public Notification.MediaStyle fillInMediaStyle(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.mActionsToShowInCompact;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.mToken;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        private RemoteViews generateMediaActionButton(NotificationCompat.C0239a c0239a) {
            boolean z;
            if (c0239a.LJIIIZ == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), 2131695511);
            remoteViews.setImageViewResource(2131165208, c0239a.LJII);
            if (!z) {
                remoteViews.setOnClickPendingIntent(2131165208, c0239a.LJIIIZ);
            }
            int i = Build.VERSION.SDK_INT;
            remoteViews.setContentDescription(2131165208, c0239a.LJIIIIZZ);
            return remoteViews;
        }
    }
}
