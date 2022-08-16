package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC132295bM5;
import p003X.AbstractC76732GNa;
import p003X.C116971W2r;
import p003X.C132290bM0;
import p003X.C132291bM1;
import p003X.C132292bM2;
import p003X.C132293bM3;
import p003X.C132294bM4;

/* loaded from: classes16.dex */
public class NotificationCompat {
    public static final int FLAG_HIGH_PRIORITY = 128;

    static {
        Covode.recordClassIndex(895);
    }

    /* loaded from: classes16.dex */
    public static class Builder {
        public ArrayList<C0239a> mActions;
        public boolean mAllowSystemGeneratedContextualActions;
        public int mBadgeIcon;
        public RemoteViews mBigContentView;
        public C132293bM3 mBubbleMetadata;
        public String mCategory;
        public String mChannelId;
        public boolean mChronometerCountDown;
        public int mColor;
        public boolean mColorized;
        public boolean mColorizedSet;
        public CharSequence mContentInfo;
        public PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public RemoteViews mContentView;
        public Context mContext;
        public Bundle mExtras;
        public PendingIntent mFullScreenIntent;
        public int mGroupAlertBehavior;
        public String mGroupKey;
        public boolean mGroupSummary;
        public RemoteViews mHeadsUpContentView;
        public ArrayList<C0239a> mInvisibleActions;
        public Bitmap mLargeIcon;
        public boolean mLocalOnly;
        public Notification mNotification;
        public int mNumber;
        public ArrayList<String> mPeople;
        public int mPriority;
        public int mProgress;
        public boolean mProgressIndeterminate;
        public int mProgressMax;
        public Notification mPublicVersion;
        public CharSequence[] mRemoteInputHistory;
        public String mShortcutId;
        public boolean mShowWhen;
        public boolean mSilent;
        public String mSortKey;
        public Style mStyle;
        public CharSequence mSubText;
        public RemoteViews mTickerView;
        public long mTimeout;
        public boolean mUseChronometer;
        public int mVisibility;

        static {
            Covode.recordClassIndex(896);
        }

        public Builder extend(AbstractC132295bM5 abstractC132295bM5) {
            return this;
        }

        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        public C132293bM3 getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        public int getColor() {
            return this.mColor;
        }

        public RemoteViews getContentView() {
            return this.mContentView;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        public int getPriority() {
            return this.mPriority;
        }

        public Notification getNotification() {
            return build();
        }

        public Notification build() {
            return new C132290bM0(this).LIZIZ();
        }

        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        public Builder setBadgeIconType(int i) {
            this.mBadgeIcon = i;
            return this;
        }

        public Builder setBubbleMetadata(C132293bM3 c132293bM3) {
            this.mBubbleMetadata = c132293bM3;
            return this;
        }

        public Builder setCategory(String str) {
            this.mCategory = str;
            return this;
        }

        public Builder setChannelId(String str) {
            this.mChannelId = str;
            return this;
        }

        public Builder setColor(int i) {
            this.mColor = i;
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        public Builder setCustomContentView(RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setGroup(String str) {
            this.mGroupKey = str;
            return this;
        }

        public Builder setGroupAlertBehavior(int i) {
            this.mGroupAlertBehavior = i;
            return this;
        }

        public Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        public Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        public Builder setNumber(int i) {
            this.mNumber = i;
            return this;
        }

        public Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        public Builder setPublicVersion(Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        public Builder setShortcutId(String str) {
            this.mShortcutId = str;
            return this;
        }

        public Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        public Builder setSortKey(String str) {
            this.mSortKey = str;
            return this;
        }

        public Builder setTimeoutAfter(long j) {
            this.mTimeout = j;
            return this;
        }

        public Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        public Builder setVisibility(int i) {
            this.mVisibility = i;
            return this;
        }

        public Builder(Context context) {
            this(context, null);
        }

        public Builder addAction(C0239a c0239a) {
            this.mActions.add(c0239a);
            return this;
        }

        public Builder addInvisibleAction(C0239a c0239a) {
            this.mInvisibleActions.add(c0239a);
            return this;
        }

        public Builder addPerson(String str) {
            this.mPeople.add(str);
            return this;
        }

        public Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        public Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setContent(RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        public Builder setContentInfo(CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = reduceLargeIconSize(bitmap);
            return this;
        }

        public Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        public Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        public Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        public Builder setSubText(CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setVibrate(long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        public Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }

        public Builder setChronometerCountDown(boolean z) {
            this.mChronometerCountDown = z;
            this.mExtras.putBoolean("android.chronometerCountDown", z);
            return this;
        }

        public Builder setDefaults(int i) {
            Notification notification = this.mNotification;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public Builder setStyle(Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                Style style2 = this.mStyle;
                if (style2 != null) {
                    style2.setBuilder(this);
                }
            }
            return this;
        }

        public Builder setTicker(CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        public static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                    return this;
                }
            }
            return this;
        }

        public Builder setSound(Uri uri) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = -1;
            int i = Build.VERSION.SDK_INT;
            this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        private Bitmap reduceLargeIconSize(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.mContext.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131427891);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131427890);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return C116971W2r.LIZ(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z);
            return this;
        }

        public Builder setSmallIcon(int i, int i2) {
            Notification notification = this.mNotification;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                Notification notification = this.mNotification;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.mNotification;
            notification2.flags = (~i) & notification2.flags;
        }

        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        public Builder(Context context, String str) {
            this.mActions = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mNotification = new Notification();
            this.mContext = context;
            this.mChannelId = str;
            this.mNotification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        public Builder setSound(Uri uri, int i) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = i;
            int i2 = Build.VERSION.SDK_INT;
            this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        public Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mActions.add(new C0239a(i, charSequence, pendingIntent));
            return this;
        }

        public Builder addInvisibleAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            addInvisibleAction(new C0239a(i, charSequence, pendingIntent));
            return this;
        }

        public Builder setLights(int i, int i2, int i3) {
            int i4;
            Notification notification = this.mNotification;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (notification.ledOnMS != 0 && this.mNotification.ledOffMS != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            Notification notification2 = this.mNotification;
            notification2.flags = i4 | (notification2.flags & (-2));
            return this;
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Style {
        public CharSequence mBigContentTitle;
        public Builder mBuilder;
        public CharSequence mSummaryText;
        public boolean mSummaryTextSet;

        static {
            Covode.recordClassIndex(897);
        }

        public static float constrain(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        public void addCompatExtras(Bundle bundle) {
        }

        public void apply(AbstractC76732GNa abstractC76732GNa) {
        }

        public RemoteViews makeBigContentView(AbstractC76732GNa abstractC76732GNa) {
            return null;
        }

        public RemoteViews makeContentView(AbstractC76732GNa abstractC76732GNa) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(AbstractC76732GNa abstractC76732GNa) {
            return null;
        }

        public void restoreFromCompatExtras(Bundle bundle) {
        }

        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2131428704);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2131428705);
            float constrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - constrain) * dimensionPixelSize) + (constrain * dimensionPixelSize2));
        }

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                Builder builder2 = this.mBuilder;
                if (builder2 != null) {
                    builder2.setStyle(this);
                }
            }
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(2131171295, 8);
            remoteViews.setViewVisibility(2131191934, 8);
            remoteViews.setViewVisibility(2131171162, 8);
        }

        public Bitmap createColoredBitmap(int i, int i2) {
            return createColoredBitmap(i, i2, 0);
        }

        public Bitmap createColoredBitmap(IconCompat iconCompat, int i) {
            return createColoredBitmap(iconCompat, i, 0);
        }

        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            remoteViews.removeAllViews(2131184340);
            remoteViews.addView(2131184340, remoteViews2.clone());
            remoteViews.setViewVisibility(2131184340, 0);
            int i = Build.VERSION.SDK_INT;
            remoteViews.setViewPadding(2131184341, 0, calculateTopPadding(), 0, 0);
        }

        private Bitmap createColoredBitmap(int i, int i2, int i3) {
            return createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, i), i2, i3);
        }

        private Bitmap createColoredBitmap(IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable loadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            if (i2 == 0) {
                i3 = loadDrawable.getIntrinsicWidth();
                i2 = loadDrawable.getIntrinsicHeight();
            } else {
                i3 = i2;
            }
            Bitmap LIZ = C116971W2r.LIZ(i3, i2, Bitmap.Config.ARGB_8888);
            loadDrawable.setBounds(0, 0, i3, i2);
            if (i != 0) {
                loadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            loadDrawable.draw(new Canvas(LIZ));
            return LIZ;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 479
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        private Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap createColoredBitmap = createColoredBitmap(2130849779, i4, i2);
            Canvas canvas = new Canvas(createColoredBitmap);
            Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i5 = (i2 - i3) / 2;
            int i6 = i3 + i5;
            mutate.setBounds(i5, i5, i6, i6);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return createColoredBitmap;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$a */
    /* loaded from: classes16.dex */
    public static class C0239a {
        public final Bundle LIZ;
        public final C132292bM2[] LIZIZ;
        public final C132292bM2[] LIZJ;
        public boolean LIZLLL;

        /* renamed from: LJ */
        public boolean f20244LJ;
        public final int LJFF;
        public final boolean LJI;
        public int LJII;
        public CharSequence LJIIIIZZ;
        public PendingIntent LJIIIZ;
        public IconCompat LJIIJ;

        static {
            Covode.recordClassIndex(898);
        }

        public final IconCompat LIZ() {
            int i;
            if (this.LJIIJ == null && (i = this.LJII) != 0) {
                this.LJIIJ = IconCompat.createWithResource(null, "", i);
            }
            return this.LJIIJ;
        }

        public C0239a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent);
        }

        public C0239a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C132292bM2[]) null, (C132292bM2[]) null, true, 0, true, false);
        }

        public C0239a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C132292bM2[] c132292bM2Arr, C132292bM2[] c132292bM2Arr2, boolean z, int i2, boolean z2, boolean z3) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, bundle, c132292bM2Arr, c132292bM2Arr2, z, i2, z2, z3);
        }

        public C0239a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C132292bM2[] c132292bM2Arr, C132292bM2[] c132292bM2Arr2, boolean z, int i, boolean z2, boolean z3) {
            this.f20244LJ = true;
            this.LJIIJ = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.LJII = iconCompat.getResId();
            }
            this.LJIIIIZZ = Builder.limitCharSequenceLength(charSequence);
            this.LJIIIZ = pendingIntent;
            this.LIZ = bundle == null ? new Bundle() : bundle;
            this.LIZIZ = c132292bM2Arr;
            this.LIZJ = c132292bM2Arr2;
            this.LIZLLL = z;
            this.LJFF = i;
            this.f20244LJ = z2;
            this.LJI = z3;
        }
    }

    public static String getCategory(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        return notification.category;
    }

    public static Bundle getExtras(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        return notification.extras;
    }

    public static int getActionCount(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (notification.actions == null) {
            return 0;
        }
        return notification.actions.length;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    public static int getBadgeIconType(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    public static String getChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static String getGroup(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    public static boolean getLocalOnly(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if ((notification.flags & 256) == 0) {
            return false;
        }
        return true;
    }

    public static String getShortcutId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static String getSortKey(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        return notification.getSortKey();
    }

    public static long getTimeoutAfter(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0L;
    }

    public static boolean isGroupSummary(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if ((notification.flags & 512) == 0) {
            return false;
        }
        return true;
    }

    public static List<C0239a> getInvisibleActions(Notification notification) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < bundle2.size(); i++) {
                Bundle bundle3 = bundle2.getBundle(Integer.toString(i));
                Bundle bundle4 = bundle3.getBundle("extras");
                if (bundle4 != null) {
                    z = bundle4.getBoolean("android.support.allowGeneratedReplies", false);
                } else {
                    z = false;
                }
                arrayList.add(new C0239a(bundle3.getInt("icon"), bundle3.getCharSequence("title"), (PendingIntent) bundle3.getParcelable("actionIntent"), bundle3.getBundle("extras"), C132291bM1.LIZ(C132291bM1.LIZ(bundle3, "remoteInputs")), C132291bM1.LIZ(C132291bM1.LIZ(bundle3, "dataOnlyRemoteInputs")), z, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false));
            }
        }
        return arrayList;
    }

    public static C0239a getActionCompatFromAction(Notification.Action action) {
        C132292bM2[] c132292bM2Arr;
        int i;
        boolean z;
        int i2;
        boolean z2;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        if (remoteInputs == null) {
            c132292bM2Arr = null;
        } else {
            c132292bM2Arr = new C132292bM2[remoteInputs.length];
            for (int i3 = 0; i3 < remoteInputs.length; i3++) {
                RemoteInput remoteInput = remoteInputs[i3];
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    i = remoteInput.getEditChoicesBeforeSending();
                } else {
                    i = 0;
                }
                c132292bM2Arr[i3] = new C132292bM2(resultKey, label, choices, allowFreeFormInput, i, remoteInput.getExtras(), null);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (!action.getExtras().getBoolean("android.support.allowGeneratedReplies") && !action.getAllowGeneratedReplies()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = action.getExtras().getBoolean("android.support.allowGeneratedReplies");
        }
        boolean z3 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        if (Build.VERSION.SDK_INT >= 28) {
            i2 = action.getSemanticAction();
        } else {
            i2 = action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = action.isContextual();
        } else {
            z2 = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (action.getIcon() == null && action.icon != 0) {
                return new C0239a(action.icon, action.title, action.actionIntent, action.getExtras(), c132292bM2Arr, (C132292bM2[]) null, z, i2, z3, z2);
            }
            if (action.getIcon() != null) {
                iconCompat = IconCompat.createFromIconOrNullIfZeroResId(action.getIcon());
            }
            return new C0239a(iconCompat, action.title, action.actionIntent, action.getExtras(), c132292bM2Arr, (C132292bM2[]) null, z, i2, z3, z2);
        }
        return new C0239a(action.icon, action.title, action.actionIntent, action.getExtras(), c132292bM2Arr, (C132292bM2[]) null, z, i2, z3, z2);
    }

    public static C132293bM3 getBubbleMetadata(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        if (Build.VERSION.SDK_INT < 29 || (bubbleMetadata = notification.getBubbleMetadata()) == null) {
            return null;
        }
        C132294bM4 c132294bM4 = new C132294bM4();
        c132294bM4.LIZ(1, bubbleMetadata.getAutoExpandBubble());
        c132294bM4.LJFF = bubbleMetadata.getDeleteIntent();
        IconCompat createFromIcon = IconCompat.createFromIcon(bubbleMetadata.getIcon());
        if (createFromIcon != null) {
            if (createFromIcon.getType() != 1) {
                c132294bM4.LIZIZ = createFromIcon;
                PendingIntent intent = bubbleMetadata.getIntent();
                if (intent != null) {
                    c132294bM4.LIZ = intent;
                    c132294bM4.LIZ(2, bubbleMetadata.isNotificationSuppressed());
                    if (bubbleMetadata.getDesiredHeight() != 0) {
                        c132294bM4.LIZJ = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                        c132294bM4.LIZLLL = 0;
                    }
                    if (bubbleMetadata.getDesiredHeightResId() != 0) {
                        c132294bM4.LIZLLL = bubbleMetadata.getDesiredHeightResId();
                        c132294bM4.LIZJ = 0;
                    }
                    if (c132294bM4.LIZ != null) {
                        if (c132294bM4.LIZIZ != null) {
                            return new C132293bM3(c132294bM4.LIZ, c132294bM4.LJFF, c132294bM4.LIZIZ, c132294bM4.LIZJ, c132294bM4.LIZLLL, c132294bM4.f17189LJ, (byte) 0);
                        }
                        throw new IllegalStateException("Must supply an icon for the bubble");
                    }
                    throw new IllegalStateException("Must supply pending intent to bubble");
                }
                throw new IllegalArgumentException("Bubble requires non-null pending intent");
            }
            throw new IllegalArgumentException("When using bitmap based icons, Bubbles require TYPE_ADAPTIVE_BITMAP, please use IconCompat#createWithAdaptiveBitmap instead");
        }
        throw new IllegalArgumentException("Bubbles require non-null icon");
    }

    public static C0239a getAction(Notification notification, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return getActionCompatFromAction(notification.actions[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                notificationArr[i] = parcelableArray[i];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }
}
