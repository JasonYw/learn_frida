package android.support.wearable.complications.rendering;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.rendering.ComplicationStyle;
import android.support.wearable.watchface.WatchFaceService;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.stateless.C33872b;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p003X.AbstractC144576eYk;
import p003X.C116971W2r;
import p003X.C144561eYV;
import p003X.G4F;

/* loaded from: classes19.dex */
public class ComplicationDrawable extends Drawable implements Parcelable {
    public static final Parcelable.Creator<ComplicationDrawable> CREATOR = new Parcelable.Creator<ComplicationDrawable>() { // from class: android.support.wearable.complications.rendering.ComplicationDrawable.1
        static {
            Covode.recordClassIndex(C33872b.f42719g);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComplicationDrawable[] newArray(int i) {
            return new ComplicationDrawable[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComplicationDrawable createFromParcel(Parcel parcel) {
            return new ComplicationDrawable(parcel);
        }
    };
    public final ComplicationStyle.Builder mActiveStyleBuilder;
    public boolean mAlreadyStyled;
    public final ComplicationStyle.Builder mAmbientStyleBuilder;
    public boolean mBurnInProtection;
    public C144561eYV mComplicationRenderer;
    public Context mContext;
    public long mCurrentTimeMillis;
    public long mHighlightDuration;
    public boolean mInAmbientMode;
    public boolean mIsHighlighted;
    public boolean mIsInflatedFromXml;
    public boolean mIsStyleUpToDate;
    public boolean mLowBitAmbient;
    public final Handler mMainThreadHandler;
    public CharSequence mNoDataText;
    public boolean mRangedValueProgressHidden;
    public final AbstractC144576eYk mRendererInvalidateListener;
    public final Runnable mUnhighlightRunnable;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C144561eYV getComplicationRenderer() {
        return this.mComplicationRenderer;
    }

    public long getHighlightDuration() {
        return this.mHighlightDuration;
    }

    public CharSequence getNoDataText() {
        return this.mNoDataText;
    }

    public boolean isHighlighted() {
        return this.mIsHighlighted;
    }

    public boolean isRangedValueProgressHidden() {
        return this.mRangedValueProgressHidden;
    }

    public ComplicationStyle getActiveStyle() {
        return this.mActiveStyleBuilder.LIZ();
    }

    public ComplicationStyle getAmbientStyle() {
        return this.mAmbientStyleBuilder.LIZ();
    }

    static {
        Covode.recordClassIndex(274);
    }

    private void assertInitialized() {
        if (this.mContext != null) {
            return;
        }
        throw new IllegalStateException("ComplicationDrawable does not have a context. Use setContext(Context) to set it first.");
    }

    private void updateStyleIfRequired() {
        if (!this.mIsStyleUpToDate) {
            this.mComplicationRenderer.LIZ(this.mActiveStyleBuilder.LIZ(), this.mAmbientStyleBuilder.LIZ());
            this.mIsStyleUpToDate = true;
        }
    }

    public ComplicationDrawable() {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new Runnable() { // from class: android.support.wearable.complications.rendering.ComplicationDrawable.2
            static {
                Covode.recordClassIndex(276);
            }

            @Override // java.lang.Runnable
            public final void run() {
                ComplicationDrawable.this.setIsHighlighted(false);
                ComplicationDrawable.this.invalidateSelf();
            }
        };
        this.mRendererInvalidateListener = new AbstractC144576eYk() { // from class: android.support.wearable.complications.rendering.ComplicationDrawable.3
            static {
                Covode.recordClassIndex(277);
            }

            @Override // p003X.AbstractC144576eYk
            public final void LIZ() {
                ComplicationDrawable.this.invalidateSelf();
            }
        };
        this.mActiveStyleBuilder = new ComplicationStyle.Builder();
        this.mAmbientStyleBuilder = new ComplicationStyle.Builder();
    }

    public void setBurnInProtection(boolean z) {
        this.mBurnInProtection = z;
    }

    public void setCurrentTimeMillis(long j) {
        this.mCurrentTimeMillis = j;
    }

    public void setInAmbientMode(boolean z) {
        this.mInAmbientMode = z;
    }

    public void setIsHighlighted(boolean z) {
        this.mIsHighlighted = z;
    }

    public void setLowBitAmbient(boolean z) {
        this.mLowBitAmbient = z;
    }

    public ComplicationDrawable(Context context) {
        this();
        setContext(context);
    }

    private ComplicationStyle.Builder getComplicationStyleBuilder(boolean z) {
        if (z) {
            return this.mAmbientStyleBuilder;
        }
        return this.mActiveStyleBuilder;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        C144561eYV c144561eYV = this.mComplicationRenderer;
        if (c144561eYV != null) {
            c144561eYV.LIZ(rect);
        }
    }

    public void setBackgroundColorActive(int i) {
        getComplicationStyleBuilder(false).LIZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundColorAmbient(int i) {
        getComplicationStyleBuilder(true).LIZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableActive(Drawable drawable) {
        getComplicationStyleBuilder(false).LIZ(drawable);
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableAmbient(Drawable drawable) {
        getComplicationStyleBuilder(true).LIZ(drawable);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorActive(int i) {
        getComplicationStyleBuilder(false).LJI(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorAmbient(int i) {
        getComplicationStyleBuilder(true).LJI(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapActive(int i) {
        getComplicationStyleBuilder(false).LJIIIZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapAmbient(int i) {
        getComplicationStyleBuilder(true).LJIIIZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthActive(int i) {
        getComplicationStyleBuilder(false).LJIIIIZZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthAmbient(int i) {
        getComplicationStyleBuilder(true).LJIIIIZZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusActive(int i) {
        getComplicationStyleBuilder(false).LJIIJ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusAmbient(int i) {
        getComplicationStyleBuilder(true).LJIIJ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleActive(int i) {
        getComplicationStyleBuilder(false).LJII(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleAmbient(int i) {
        getComplicationStyleBuilder(true).LJII(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthActive(int i) {
        getComplicationStyleBuilder(false).LJIIJJI(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthAmbient(int i) {
        getComplicationStyleBuilder(true).LJIIJJI(i);
        this.mIsStyleUpToDate = false;
    }

    public void setComplicationData(ComplicationData complicationData) {
        assertInitialized();
        this.mComplicationRenderer.LIZ(complicationData);
    }

    public void setHighlightColorActive(int i) {
        getComplicationStyleBuilder(false).LJIILL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightColorAmbient(int i) {
        getComplicationStyleBuilder(true).LJIILL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setIconColorActive(int i) {
        getComplicationStyleBuilder(false).LIZLLL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setIconColorAmbient(int i) {
        getComplicationStyleBuilder(true).LIZLLL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterActive(ColorFilter colorFilter) {
        getComplicationStyleBuilder(false).LIZ(colorFilter);
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterAmbient(ColorFilter colorFilter) {
        getComplicationStyleBuilder(true).LIZ(colorFilter);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValuePrimaryColorActive(int i) {
        getComplicationStyleBuilder(false).LJIILIIL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValuePrimaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).LJIILIIL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueProgressHidden(boolean z) {
        this.mRangedValueProgressHidden = z;
        C144561eYV c144561eYV = this.mComplicationRenderer;
        if (c144561eYV != null) {
            c144561eYV.LIZ(z);
        }
    }

    public void setRangedValueRingWidthActive(int i) {
        getComplicationStyleBuilder(false).LJIIL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueRingWidthAmbient(int i) {
        getComplicationStyleBuilder(true).LJIIL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorActive(int i) {
        getComplicationStyleBuilder(false).LJIILJJIL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).LJIILJJIL(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorActive(int i) {
        getComplicationStyleBuilder(false).LIZIZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorAmbient(int i) {
        getComplicationStyleBuilder(true).LIZIZ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeActive(int i) {
        getComplicationStyleBuilder(false).m21219LJ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeAmbient(int i) {
        getComplicationStyleBuilder(true).m21219LJ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).LIZ(typeface);
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).LIZ(typeface);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorActive(int i) {
        getComplicationStyleBuilder(false).LIZJ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorAmbient(int i) {
        getComplicationStyleBuilder(true).LIZJ(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeActive(int i) {
        getComplicationStyleBuilder(false).LJFF(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeAmbient(int i) {
        getComplicationStyleBuilder(true).LJFF(i);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).LIZIZ(typeface);
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).LIZIZ(typeface);
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightDuration(long j) {
        if (j >= 0) {
            this.mHighlightDuration = j;
            return;
        }
        throw new IllegalArgumentException("Highlight duration should be non-negative.");
    }

    public void setNoDataText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mNoDataText = "";
        } else {
            this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        }
        C144561eYV c144561eYV = this.mComplicationRenderer;
        if (c144561eYV != null) {
            c144561eYV.LIZ(this.mNoDataText);
        }
    }

    public ComplicationDrawable(Parcel parcel) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new Runnable() { // from class: android.support.wearable.complications.rendering.ComplicationDrawable.2
            static {
                Covode.recordClassIndex(276);
            }

            @Override // java.lang.Runnable
            public final void run() {
                ComplicationDrawable.this.setIsHighlighted(false);
                ComplicationDrawable.this.invalidateSelf();
            }
        };
        this.mRendererInvalidateListener = new AbstractC144576eYk() { // from class: android.support.wearable.complications.rendering.ComplicationDrawable.3
            static {
                Covode.recordClassIndex(277);
            }

            @Override // p003X.AbstractC144576eYk
            public final void LIZ() {
                ComplicationDrawable.this.invalidateSelf();
            }
        };
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.mActiveStyleBuilder = (ComplicationStyle.Builder) readBundle.getParcelable("active_style_builder");
        this.mAmbientStyleBuilder = (ComplicationStyle.Builder) readBundle.getParcelable("ambient_style_builder");
        this.mNoDataText = readBundle.getCharSequence("no_data_text");
        this.mHighlightDuration = readBundle.getLong("highlight_duration");
        this.mRangedValueProgressHidden = readBundle.getBoolean("ranged_value_progress_hidden");
        setBounds((Rect) readBundle.getParcelable("bounds"));
        this.mAlreadyStyled = true;
    }

    public ComplicationDrawable(ComplicationDrawable complicationDrawable) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new Runnable() { // from class: android.support.wearable.complications.rendering.ComplicationDrawable.2
            static {
                Covode.recordClassIndex(276);
            }

            @Override // java.lang.Runnable
            public final void run() {
                ComplicationDrawable.this.setIsHighlighted(false);
                ComplicationDrawable.this.invalidateSelf();
            }
        };
        this.mRendererInvalidateListener = new AbstractC144576eYk() { // from class: android.support.wearable.complications.rendering.ComplicationDrawable.3
            static {
                Covode.recordClassIndex(277);
            }

            @Override // p003X.AbstractC144576eYk
            public final void LIZ() {
                ComplicationDrawable.this.invalidateSelf();
            }
        };
        this.mActiveStyleBuilder = new ComplicationStyle.Builder(complicationDrawable.mActiveStyleBuilder);
        this.mAmbientStyleBuilder = new ComplicationStyle.Builder(complicationDrawable.mAmbientStyleBuilder);
        CharSequence charSequence = complicationDrawable.mNoDataText;
        this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        this.mHighlightDuration = complicationDrawable.mHighlightDuration;
        this.mRangedValueProgressHidden = complicationDrawable.mRangedValueProgressHidden;
        setBounds(complicationDrawable.getBounds());
        this.mAlreadyStyled = true;
    }

    public void setContext(Context context) {
        if (context != null) {
            if (Objects.equals(context, this.mContext)) {
                return;
            }
            this.mContext = context;
            if (!this.mIsInflatedFromXml && !this.mAlreadyStyled) {
                setStyleToDefaultValues(this.mActiveStyleBuilder, context.getResources());
                setStyleToDefaultValues(this.mAmbientStyleBuilder, context.getResources());
            }
            if (!this.mAlreadyStyled) {
                this.mHighlightDuration = context.getResources().getInteger(2131296291);
            }
            this.mComplicationRenderer = new C144561eYV(this.mContext, this.mActiveStyleBuilder.LIZ(), this.mAmbientStyleBuilder.LIZ());
            C144561eYV c144561eYV = this.mComplicationRenderer;
            c144561eYV.LJJIII = this.mRendererInvalidateListener;
            CharSequence charSequence = this.mNoDataText;
            if (charSequence == null) {
                setNoDataText(context.getString(2131563804));
            } else {
                c144561eYV.LIZ(charSequence);
            }
            this.mComplicationRenderer.LIZ(this.mRangedValueProgressHidden);
            this.mComplicationRenderer.LIZ(getBounds());
            this.mIsStyleUpToDate = true;
            return;
        }
        throw new IllegalArgumentException("Argument \"context\" should not be null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0171, code lost:
        if (r4.LJI == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02b0, code lost:
        if (r4.LIZIZ.LJIIIIZZ() != 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02b2, code lost:
        r4.LJIIJJI.setColorFilter(null);
        r4.LJIIJJI.LIZJ = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02bc, code lost:
        r4.LJIIJJI.setBounds(r4.LJIIZILJ);
        r4.LJIIJJI.draw(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02ca, code lost:
        r4.LJIIJJI.setColorFilter(r2.LJII.LJIIIZ);
        r4.LJIIJJI.LIZJ = r4.LIZ(r2.LJII, r4.LJIIZILJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a8, code lost:
        if (r4.LJII != null) goto L52;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.complications.rendering.ComplicationDrawable.draw(android.graphics.Canvas):void");
    }

    public void draw(Canvas canvas, long j) {
        assertInitialized();
        setCurrentTimeMillis(j);
        draw(canvas);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("active_style_builder", this.mActiveStyleBuilder);
        bundle.putParcelable("ambient_style_builder", this.mAmbientStyleBuilder);
        bundle.putCharSequence("no_data_text", this.mNoDataText);
        bundle.putLong("highlight_duration", this.mHighlightDuration);
        bundle.putBoolean("ranged_value_progress_hidden", this.mRangedValueProgressHidden);
        bundle.putParcelable("bounds", getBounds());
        parcel.writeBundle(bundle);
    }

    private void inflateAttributes(Resources resources, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{2130772257, 2130772258, 2130772462, 2130772464, 2130772465, 2130772466, 2130772467, 2130772468, 2130773233, 2130773258, 2130774067, 2130774068, 2130774069, 2130774070, 2130774709, 2130774723, 2130774727, 2130774754, 2130774762, 2130774768});
        setRangedValueProgressHidden(obtainAttributes.getBoolean(11, false));
        obtainAttributes.recycle();
    }

    public boolean onTap(int i, int i2) {
        ComplicationData complicationData;
        C144561eYV c144561eYV = this.mComplicationRenderer;
        if (c144561eYV != null && (complicationData = c144561eYV.LIZIZ) != null && ((complicationData.LJIIJ() != null || complicationData.LIZIZ == 9) && getBounds().contains(i, i2))) {
            if (complicationData.LIZIZ == 9) {
                Context context = this.mContext;
                if (!(context instanceof WatchFaceService)) {
                    return false;
                }
                ComponentName componentName = new ComponentName(context, context.getClass());
                Intent intent = new Intent(context, G4F.class);
                intent.setAction("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY");
                intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
                C116971W2r.LIZ(context, intent.addFlags(268435456));
            } else {
                try {
                    complicationData.LJIIJ().send();
                } catch (PendingIntent.CanceledException unused) {
                }
            }
            if (getHighlightDuration() > 0) {
                setIsHighlighted(true);
                invalidateSelf();
                this.mMainThreadHandler.removeCallbacks(this.mUnhighlightRunnable);
                this.mMainThreadHandler.postDelayed(this.mUnhighlightRunnable, getHighlightDuration());
            }
            return true;
        }
        return false;
    }

    public static void setStyleToDefaultValues(ComplicationStyle.Builder builder, Resources resources) {
        builder.LIZ(resources.getColor(2131625243, null));
        builder.LIZIZ(resources.getColor(2131625249, null));
        builder.LIZJ(resources.getColor(2131625250, null));
        builder.LIZ(Typeface.create(resources.getString(2131563805), 0));
        builder.LIZIZ(Typeface.create(resources.getString(2131563806), 0));
        builder.m21219LJ(resources.getDimensionPixelSize(2131427898));
        builder.LJFF(resources.getDimensionPixelSize(2131427899));
        builder.LIZLLL(resources.getColor(2131625246, null));
        builder.LJI(resources.getColor(2131625244, null));
        builder.LJIIJJI(resources.getDimensionPixelSize(2131427896));
        builder.LJIIJ(resources.getDimensionPixelSize(2131427895));
        builder.LJII(resources.getInteger(2131296290));
        builder.LJIIIIZZ(resources.getDimensionPixelSize(2131427894));
        builder.LJIIIZ(resources.getDimensionPixelSize(2131427893));
        builder.LJIIL(resources.getDimensionPixelSize(2131427897));
        builder.LJIILIIL(resources.getColor(2131625247, null));
        builder.LJIILJJIL(resources.getColor(2131625248, null));
        builder.LJIILL(resources.getColor(2131625245, null));
    }

    public boolean onTap(int i, int i2, long j) {
        return onTap(i, i2);
    }

    private void inflateStyle(boolean z, Resources resources, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{2130772257, 2130772258, 2130772462, 2130772464, 2130772465, 2130772466, 2130772467, 2130772468, 2130773233, 2130773258, 2130774067, 2130774068, 2130774069, 2130774070, 2130774709, 2130774723, 2130774727, 2130774754, 2130774762, 2130774768});
        ComplicationStyle.Builder complicationStyleBuilder = getComplicationStyleBuilder(z);
        if (obtainAttributes.hasValue(0)) {
            complicationStyleBuilder.LIZ(obtainAttributes.getColor(0, resources.getColor(2131625243, null)));
        }
        if (obtainAttributes.hasValue(1)) {
            complicationStyleBuilder.LIZ(obtainAttributes.getDrawable(1));
        }
        if (obtainAttributes.hasValue(14)) {
            complicationStyleBuilder.LIZIZ(obtainAttributes.getColor(14, resources.getColor(2131625249, null)));
        }
        if (obtainAttributes.hasValue(17)) {
            complicationStyleBuilder.LIZJ(obtainAttributes.getColor(17, resources.getColor(2131625250, null)));
        }
        if (obtainAttributes.hasValue(16)) {
            complicationStyleBuilder.LIZ(Typeface.create(obtainAttributes.getString(16), 0));
        }
        if (obtainAttributes.hasValue(19)) {
            complicationStyleBuilder.LIZIZ(Typeface.create(obtainAttributes.getString(19), 0));
        }
        if (obtainAttributes.hasValue(15)) {
            complicationStyleBuilder.m21219LJ(obtainAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(2131427898)));
        }
        if (obtainAttributes.hasValue(18)) {
            complicationStyleBuilder.LJFF(obtainAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(2131427899)));
        }
        if (obtainAttributes.hasValue(9)) {
            complicationStyleBuilder.LIZLLL(obtainAttributes.getColor(9, resources.getColor(2131625246, null)));
        }
        if (obtainAttributes.hasValue(2)) {
            complicationStyleBuilder.LJI(obtainAttributes.getColor(2, resources.getColor(2131625244, null)));
        }
        if (obtainAttributes.hasValue(5)) {
            complicationStyleBuilder.LJIIJ(obtainAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(2131427895)));
        }
        if (obtainAttributes.hasValue(6)) {
            complicationStyleBuilder.LJII(obtainAttributes.getInt(6, resources.getInteger(2131296290)));
        }
        if (obtainAttributes.hasValue(4)) {
            complicationStyleBuilder.LJIIIIZZ(obtainAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(2131427894)));
        }
        if (obtainAttributes.hasValue(3)) {
            complicationStyleBuilder.LJIIIZ(obtainAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(2131427893)));
        }
        if (obtainAttributes.hasValue(7)) {
            complicationStyleBuilder.LJIIJJI(obtainAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(2131427896)));
        }
        if (obtainAttributes.hasValue(12)) {
            complicationStyleBuilder.LJIIL(obtainAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(2131427897)));
        }
        if (obtainAttributes.hasValue(10)) {
            complicationStyleBuilder.LJIILIIL(obtainAttributes.getColor(10, resources.getColor(2131625247, null)));
        }
        if (obtainAttributes.hasValue(13)) {
            complicationStyleBuilder.LJIILJJIL(obtainAttributes.getColor(13, resources.getColor(2131625248, null)));
        }
        if (obtainAttributes.hasValue(8)) {
            complicationStyleBuilder.LJIILL(obtainAttributes.getColor(8, resources.getColor(2131625245, null)));
        }
        obtainAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        this.mIsInflatedFromXml = true;
        int depth = xmlPullParser.getDepth();
        inflateAttributes(resources, xmlPullParser);
        setStyleToDefaultValues(this.mActiveStyleBuilder, resources);
        setStyleToDefaultValues(this.mAmbientStyleBuilder, resources);
        inflateStyle(false, resources, xmlPullParser);
        inflateStyle(true, resources, xmlPullParser);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            } else if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
            } else if (next == 2 && TextUtils.equals(xmlPullParser.getName(), "ambient")) {
                inflateStyle(true, resources, xmlPullParser);
            }
        }
        this.mIsStyleUpToDate = false;
    }
}
