package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class SeekBarPreference extends Preference {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJIIZILJ;
    public SeekBar LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public TextView LJIJJLI;

    static {
        Covode.recordClassIndex(1631);
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
            static {
                Covode.recordClassIndex(1635);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;

        static {
            Covode.recordClassIndex(1634);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
            this.LIZJ = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt(this.LIZJ);
        }
    }

    public final void LIZIZ(int i) {
        TextView textView = this.LJIJJLI;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public final void LIZ(SeekBar seekBar) {
        int progress = this.LIZIZ + seekBar.getProgress();
        if (progress != this.LIZ) {
            if (LIZ(Integer.valueOf(progress))) {
                int i = this.LIZIZ;
                if (progress >= i) {
                    i = progress;
                }
                int i2 = this.LIZJ;
                if (i > i2) {
                    i = i2;
                }
                if (i != this.LIZ) {
                    this.LIZ = i;
                    LIZIZ(this.LIZ);
                    LIZ(i);
                    return;
                }
                return;
            }
            seekBar.setProgress(this.LIZ - this.LIZIZ);
            LIZIZ(this.LIZ);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130774339);
    }

    @Override // androidx.preference.Preference
    public final Object LIZ(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, 2130774339, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        new SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            static {
                Covode.recordClassIndex(1632);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.LJIIZILJ = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.LJIIZILJ = false;
                if (seekBar.getProgress() + SeekBarPreference.this.LIZIZ != SeekBarPreference.this.LIZ) {
                    SeekBarPreference.this.LIZ(seekBar);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i3, boolean z) {
                if (z && (SeekBarPreference.this.LJIJJ || !SeekBarPreference.this.LJIIZILJ)) {
                    SeekBarPreference.this.LIZ(seekBar);
                    return;
                }
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                seekBarPreference.LIZIZ(i3 + seekBarPreference.LIZIZ);
            }
        };
        new View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            static {
                Covode.recordClassIndex(1633);
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if ((!SeekBarPreference.this.LJIJI && (i3 == 21 || i3 == 22)) || i3 == 23 || i3 == 66 || SeekBarPreference.this.LJIJ == null) {
                    return false;
                }
                return SeekBarPreference.this.LJIJ.onKeyDown(i3, keyEvent);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842994, 16843062, 2130772170, 2130773772, 2130774338, 2130774411, 2130774992}, i, 0);
        this.LIZIZ = obtainStyledAttributes.getInt(3, 0);
        int i3 = obtainStyledAttributes.getInt(1, 100);
        int i4 = this.LIZIZ;
        i3 = i3 < i4 ? i4 : i3;
        if (i3 != this.LIZJ) {
            this.LIZJ = i3;
            LIZIZ();
        }
        int i5 = obtainStyledAttributes.getInt(4, 0);
        if (i5 != this.LIZLLL) {
            this.LIZLLL = Math.min(this.LIZJ - this.LIZIZ, Math.abs(i5));
            LIZIZ();
        }
        this.LJIJI = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        this.LJIJJ = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }
}
