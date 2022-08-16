package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class DropDownPreference extends ListPreference {
    public final Context LJIIZILJ;
    public final ArrayAdapter LJIJ;
    public Spinner LJIJI;

    static {
        Covode.recordClassIndex(1605);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void LIZ() {
        this.LJIJI.performClick();
    }

    @Override // androidx.preference.Preference
    public final void LIZIZ() {
        super.LIZIZ();
        ArrayAdapter arrayAdapter = this.LJIJ;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    private void LJII() {
        this.LJIJ.clear();
        if (((ListPreference) this).LIZIZ != null) {
            for (CharSequence charSequence : ((ListPreference) this).LIZIZ) {
                this.LJIJ.add(charSequence.toString());
            }
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130772999);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, 2130772999, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        new AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            static {
                Covode.recordClassIndex(1606);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i3, long j) {
                if (i3 >= 0) {
                    String charSequence = ((ListPreference) DropDownPreference.this).LIZJ[i3].toString();
                    if (!charSequence.equals(((ListPreference) DropDownPreference.this).LIZLLL) && DropDownPreference.this.LIZ((Object) charSequence)) {
                        DropDownPreference.this.LIZ(charSequence);
                    }
                }
            }
        };
        this.LJIIZILJ = context;
        this.LJIJ = new ArrayAdapter(this.LJIIZILJ, 17367049);
        LJII();
    }
}
