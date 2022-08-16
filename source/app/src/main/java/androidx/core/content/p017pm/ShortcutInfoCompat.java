package androidx.core.content.p017pm;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p003X.GQD;
import p003X.GQE;

/* renamed from: androidx.core.content.pm.ShortcutInfoCompat */
/* loaded from: classes2.dex */
public class ShortcutInfoCompat {
    public ComponentName mActivity;
    public Set<String> mCategories;
    public Context mContext;
    public CharSequence mDisabledMessage;
    public IconCompat mIcon;
    public String mId;
    public Intent[] mIntents;
    public boolean mIsAlwaysBadged;
    public boolean mIsLongLived;
    public CharSequence mLabel;
    public CharSequence mLongLabel;
    public GQE[] mPersons;
    public int mRank;

    static {
        Covode.recordClassIndex(950);
    }

    public ComponentName getActivity() {
        return this.mActivity;
    }

    public Set<String> getCategories() {
        return this.mCategories;
    }

    public CharSequence getDisabledMessage() {
        return this.mDisabledMessage;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public CharSequence getLongLabel() {
        return this.mLongLabel;
    }

    public int getRank() {
        return this.mRank;
    }

    public CharSequence getShortLabel() {
        return this.mLabel;
    }

    /* renamed from: androidx.core.content.pm.ShortcutInfoCompat$Builder */
    /* loaded from: classes2.dex */
    public static class Builder {
        public final ShortcutInfoCompat mInfo = new ShortcutInfoCompat();

        static {
            Covode.recordClassIndex(951);
        }

        public Builder setAlwaysBadged() {
            this.mInfo.mIsAlwaysBadged = true;
            return this;
        }

        public Builder setLongLived() {
            this.mInfo.mIsLongLived = true;
            return this;
        }

        public ShortcutInfoCompat build() {
            if (!TextUtils.isEmpty(this.mInfo.mLabel)) {
                if (this.mInfo.mIntents != null && this.mInfo.mIntents.length != 0) {
                    return this.mInfo;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public Builder setActivity(ComponentName componentName) {
            this.mInfo.mActivity = componentName;
            return this;
        }

        public Builder setCategories(Set<String> set) {
            this.mInfo.mCategories = set;
            return this;
        }

        public Builder setDisabledMessage(CharSequence charSequence) {
            this.mInfo.mDisabledMessage = charSequence;
            return this;
        }

        public Builder setIcon(IconCompat iconCompat) {
            this.mInfo.mIcon = iconCompat;
            return this;
        }

        public Builder setIntents(Intent[] intentArr) {
            this.mInfo.mIntents = intentArr;
            return this;
        }

        public Builder setLongLabel(CharSequence charSequence) {
            this.mInfo.mLongLabel = charSequence;
            return this;
        }

        public Builder setPersons(GQE[] gqeArr) {
            this.mInfo.mPersons = gqeArr;
            return this;
        }

        public Builder setRank(int i) {
            this.mInfo.mRank = i;
            return this;
        }

        public Builder setShortLabel(CharSequence charSequence) {
            this.mInfo.mLabel = charSequence;
            return this;
        }

        public Builder setIntent(Intent intent) {
            setIntents(new Intent[]{intent});
            return this;
        }

        public Builder setLongLived(boolean z) {
            this.mInfo.mIsLongLived = z;
            return this;
        }

        public Builder setPerson(GQE gqe) {
            setPersons(new GQE[]{gqe});
            return this;
        }

        public Builder(ShortcutInfoCompat shortcutInfoCompat) {
            this.mInfo.mContext = shortcutInfoCompat.mContext;
            this.mInfo.mId = shortcutInfoCompat.mId;
            this.mInfo.mIntents = (Intent[]) Arrays.copyOf(shortcutInfoCompat.mIntents, shortcutInfoCompat.mIntents.length);
            this.mInfo.mActivity = shortcutInfoCompat.mActivity;
            this.mInfo.mLabel = shortcutInfoCompat.mLabel;
            this.mInfo.mLongLabel = shortcutInfoCompat.mLongLabel;
            this.mInfo.mDisabledMessage = shortcutInfoCompat.mDisabledMessage;
            this.mInfo.mIcon = shortcutInfoCompat.mIcon;
            this.mInfo.mIsAlwaysBadged = shortcutInfoCompat.mIsAlwaysBadged;
            this.mInfo.mIsLongLived = shortcutInfoCompat.mIsLongLived;
            this.mInfo.mRank = shortcutInfoCompat.mRank;
            if (shortcutInfoCompat.mPersons != null) {
                this.mInfo.mPersons = (GQE[]) Arrays.copyOf(shortcutInfoCompat.mPersons, shortcutInfoCompat.mPersons.length);
            }
            if (shortcutInfoCompat.mCategories != null) {
                this.mInfo.mCategories = new HashSet(shortcutInfoCompat.mCategories);
            }
        }

        public Builder(Context context, String str) {
            ShortcutInfoCompat shortcutInfoCompat = this.mInfo;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = str;
        }

        public Builder(Context context, ShortcutInfo shortcutInfo) {
            ShortcutInfoCompat shortcutInfoCompat = this.mInfo;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = shortcutInfo.getId();
            Intent[] intents = shortcutInfo.getIntents();
            this.mInfo.mIntents = (Intent[]) Arrays.copyOf(intents, intents.length);
            this.mInfo.mActivity = shortcutInfo.getActivity();
            this.mInfo.mLabel = shortcutInfo.getShortLabel();
            this.mInfo.mLongLabel = shortcutInfo.getLongLabel();
            this.mInfo.mDisabledMessage = shortcutInfo.getDisabledMessage();
            this.mInfo.mCategories = shortcutInfo.getCategories();
            this.mInfo.mPersons = ShortcutInfoCompat.getPersonsFromExtra(shortcutInfo.getExtras());
            this.mInfo.mRank = shortcutInfo.getRank();
        }
    }

    public Intent getIntent() {
        Intent[] intentArr = this.mIntents;
        return intentArr[intentArr.length - 1];
    }

    public Intent[] getIntents() {
        Intent[] intentArr = this.mIntents;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    private PersistableBundle buildLegacyExtrasBundle() {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        GQE[] gqeArr = this.mPersons;
        if (gqeArr != null && gqeArr.length > 0) {
            persistableBundle.putInt("extraPersonCount", gqeArr.length);
            int i = 0;
            while (i < this.mPersons.length) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                String sb2 = sb.toString();
                GQE gqe = this.mPersons[i];
                PersistableBundle persistableBundle2 = new PersistableBundle();
                if (gqe.LIZ != null) {
                    str = gqe.LIZ.toString();
                } else {
                    str = null;
                }
                persistableBundle2.putString("name", str);
                persistableBundle2.putString("uri", gqe.LIZJ);
                persistableBundle2.putString("key", gqe.LIZLLL);
                persistableBundle2.putBoolean("isBot", gqe.f6354LJ);
                persistableBundle2.putBoolean("isImportant", gqe.LJFF);
                persistableBundle.putPersistableBundle(sb2, persistableBundle2);
                i = i2;
            }
        }
        persistableBundle.putBoolean("extraLongLived", this.mIsLongLived);
        return persistableBundle;
    }

    public ShortcutInfo toShortcutInfo() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon(this.mContext));
        }
        if (!TextUtils.isEmpty(this.mLongLabel)) {
            intents.setLongLabel(this.mLongLabel);
        }
        if (!TextUtils.isEmpty(this.mDisabledMessage)) {
            intents.setDisabledMessage(this.mDisabledMessage);
        }
        ComponentName componentName = this.mActivity;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.mCategories;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.mRank);
        if (Build.VERSION.SDK_INT >= 29) {
            GQE[] gqeArr = this.mPersons;
            if (gqeArr != null && gqeArr.length > 0) {
                Person[] personArr = new Person[gqeArr.length];
                for (int i = 0; i < personArr.length; i++) {
                    personArr[i] = this.mPersons[i].LIZIZ();
                }
                intents.setPersons(personArr);
            }
            intents.setLongLived(this.mIsLongLived);
        } else {
            intents.setExtras(buildLegacyExtrasBundle());
        }
        return intents.build();
    }

    public static boolean getLongLivedFromExtra(PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey("extraLongLived")) {
            return persistableBundle.getBoolean("extraLongLived");
        }
        return false;
    }

    public static GQE[] getPersonsFromExtra(PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey("extraPersonCount")) {
            int i = persistableBundle.getInt("extraPersonCount");
            GQE[] gqeArr = new GQE[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle(sb.toString());
                GQD gqd = new GQD();
                gqd.LIZ((CharSequence) persistableBundle2.getString("name"));
                gqd.LIZ(persistableBundle2.getString("uri"));
                gqd.LIZIZ(persistableBundle2.getString("key"));
                gqd.LIZ(persistableBundle2.getBoolean("isBot"));
                gqd.LIZIZ(persistableBundle2.getBoolean("isImportant"));
                gqeArr[i2] = gqd.LIZ();
                i2 = i3;
            }
            return gqeArr;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r2 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.Intent addToIntent(android.content.Intent r4) {
        /*
            r3 = this;
            android.content.Intent[] r1 = r3.mIntents
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1 = r1[r0]
            java.lang.String r0 = "android.intent.extra.shortcut.INTENT"
            android.content.Intent r2 = r4.putExtra(r0, r1)
            java.lang.CharSequence r0 = r3.mLabel
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "android.intent.extra.shortcut.NAME"
            r2.putExtra(r0, r1)
            androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
            if (r0 == 0) goto L42
            r2 = 0
            boolean r0 = r3.mIsAlwaysBadged
            if (r0 == 0) goto L3b
            android.content.Context r0 = r3.mContext
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            android.content.ComponentName r0 = r3.mActivity
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r2 = r1.getActivityIcon(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
        L2f:
            if (r2 != 0) goto L3b
        L31:
            android.content.Context r0 = r3.mContext
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            android.graphics.drawable.Drawable r2 = r0.loadIcon(r1)
        L3b:
            androidx.core.graphics.drawable.IconCompat r1 = r3.mIcon
            android.content.Context r0 = r3.mContext
            r1.addToShortcutIntent(r4, r2, r0)
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p017pm.ShortcutInfoCompat.addToIntent(android.content.Intent):android.content.Intent");
    }
}
