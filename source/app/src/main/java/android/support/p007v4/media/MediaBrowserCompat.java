package android.support.p007v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.support.p007v4.p008os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC143714eKq;
import p003X.AbstractC144078eQi;
import p003X.C144118eRM;
import p003X.C144120eRO;
import p003X.C144125eRT;
import p003X.C144127eRV;
import p003X.C144128eRW;
import p003X.C144129eRX;
import p003X.C144131eRZ;
import p003X.C144135eRd;
import p003X.C144136eRe;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
/* loaded from: classes19.dex */
public final class MediaBrowserCompat {
    public static final boolean LIZ = Log.isLoggable("MediaBrowserCompat", 3);
    public final AbstractC143714eKq LIZIZ;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    /* loaded from: classes19.dex */
    public interface AbstractC0121i {
        static {
            Covode.recordClassIndex(150);
        }

        void LIZ(Messenger messenger);

        void LIZ(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void LIZ(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    public final void LIZ() {
        this.LIZIZ.LIZLLL();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    /* loaded from: classes19.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            static {
                Covode.recordClassIndex(133);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }
        };
        public final int LIZ;
        public final MediaDescriptionCompat LIZIZ;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(132);
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.LIZ + ", mDescription=" + this.LIZIZ + '}';
        }

        public MediaItem(Parcel parcel) {
            this.LIZ = parcel.readInt();
            this.LIZIZ = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public static List<MediaItem> LIZ(List<?> list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.LIZ(mediaItem2.getDescription()), mediaItem2.getFlags());
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LIZ);
            this.LIZIZ.writeToParcel(parcel, i);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.LIZ)) {
                    this.LIZ = i;
                    this.LIZIZ = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }
    }

    static {
        Covode.recordClassIndex(129);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    /* loaded from: classes19.dex */
    public static abstract class AbstractC0123l {
        public final IBinder LIZ = new Binder();
        public WeakReference<C0122k> LIZIZ;

        static {
            Covode.recordClassIndex(153);
        }

        public AbstractC0123l() {
            if (Build.VERSION.SDK_INT >= 26) {
                new C144127eRV(new C144128eRW(this));
                return;
            }
            int i = Build.VERSION.SDK_INT;
            new C144129eRX(new C144125eRT(this));
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    /* loaded from: classes19.dex */
    public static class C0122k {
        public final List<AbstractC0123l> LIZ = new ArrayList();
        public final List<Bundle> LIZIZ = new ArrayList();

        static {
            Covode.recordClassIndex(152);
        }

        public final AbstractC0123l LIZ(Bundle bundle) {
            for (int i = 0; i < this.LIZIZ.size(); i++) {
                if (C144118eRM.LIZ(this.LIZIZ.get(i), bundle)) {
                    return this.LIZ.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    /* loaded from: classes19.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {
        public final AbstractC144078eQi LIZLLL;

        static {
            Covode.recordClassIndex(130);
        }

        @Override // android.support.p007v4.p008os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
            if (this.LIZLLL == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    /* loaded from: classes19.dex */
    public static class ItemReceiver extends ResultReceiver {
        static {
            Covode.recordClassIndex(131);
        }

        @Override // android.support.p007v4.p008os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
                bundle.getParcelable("media_item");
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    /* loaded from: classes19.dex */
    public static class SearchResultReceiver extends ResultReceiver {
        static {
            Covode.recordClassIndex(134);
        }

        @Override // android.support.p007v4.p008os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
            Parcelable[] parcelableArray;
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("search_results") && (parcelableArray = bundle.getParcelableArray("search_results")) != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add(parcelable);
                }
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C144131eRZ c144131eRZ, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.LIZIZ = new C144136eRe(context, componentName, c144131eRZ, null);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.LIZIZ = new C144135eRd(context, componentName, c144131eRZ, null);
        } else {
            int i = Build.VERSION.SDK_INT;
            this.LIZIZ = new C144120eRO(context, componentName, c144131eRZ, null);
        }
    }
}
