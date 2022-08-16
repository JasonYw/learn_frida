package android.support.wearable.watchface.decompositionface;

import android.content.Context;
import android.graphics.Rect;
import android.support.wearable.watchface.decomposition.ComplicationComponent;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p003X.AbstractC144554eYO;
import p003X.C144553eYN;
import p003X.C144555eYP;
import p003X.C144556eYQ;
import p003X.C499305oK;

/* loaded from: classes19.dex */
public class DecompositionConfigView extends ImageView {
    public ArrayList<ComplicationComponent> LIZJ;
    public AbstractC144554eYO LIZLLL;

    /* renamed from: LJ */
    public final C144556eYQ f20215LJ = new C144556eYQ(getContext());
    public final C144555eYP LIZ = new C144555eYP();
    public final GestureDetector.SimpleOnGestureListener LJFF = new GestureDetector.SimpleOnGestureListener() { // from class: android.support.wearable.watchface.decompositionface.DecompositionConfigView.1
        static {
            Covode.recordClassIndex(388);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (DecompositionConfigView.this.LIZJ != null && DecompositionConfigView.this.LIZLLL != null) {
                C144555eYP c144555eYP = DecompositionConfigView.this.LIZ;
                c144555eYP.LIZ.set(0, 0, DecompositionConfigView.this.getWidth(), DecompositionConfigView.this.getHeight());
                Iterator<ComplicationComponent> it = DecompositionConfigView.this.LIZJ.iterator();
                while (it.hasNext()) {
                    ComplicationComponent next = it.next();
                    DecompositionConfigView.this.LIZ.LIZ(next.LJFF(), DecompositionConfigView.this.LIZIZ);
                    if (DecompositionConfigView.this.LIZIZ.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        next.LJII();
                        next.LJIIIIZZ();
                        return true;
                    }
                }
            }
            return false;
        }
    };
    public final GestureDetector LJI = new GestureDetector(getContext(), this.LJFF);
    public final Rect LIZIZ = new Rect();

    static {
        Covode.recordClassIndex(387);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C499305oK.LIZ(this);
    }

    public int[] getWatchFaceComplicationIds() {
        int[] iArr = new int[this.LIZJ.size()];
        for (int i = 0; i < this.LIZJ.size(); i++) {
            iArr[i] = this.LIZJ.get(i).LJII();
        }
        return iArr;
    }

    public void setOnComplicationTapListener(AbstractC144554eYO abstractC144554eYO) {
        this.LIZLLL = abstractC144554eYO;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.LJI.onTouchEvent(motionEvent);
    }

    public void setDisplayTime(long j) {
        this.f20215LJ.LJFF = j;
        invalidate();
    }

    public DecompositionConfigView(Context context) {
        super(context);
    }

    public void setDecomposition(WatchFaceDecomposition watchFaceDecomposition) {
        C144556eYQ c144556eYQ = this.f20215LJ;
        c144556eYQ.LIZ = watchFaceDecomposition;
        c144556eYQ.LIZIZ = true;
        c144556eYQ.LIZJ = new ArrayList<>();
        c144556eYQ.LIZJ.addAll(watchFaceDecomposition.LIZ);
        c144556eYQ.LIZJ.addAll(watchFaceDecomposition.LIZIZ);
        c144556eYQ.LIZJ.addAll(watchFaceDecomposition.LIZLLL);
        Collections.sort(c144556eYQ.LIZJ, new C144553eYN());
        c144556eYQ.LIZ();
        this.f20215LJ.LJIIIZ = getResources().getConfiguration().isScreenRound();
        setImageDrawable(this.f20215LJ);
        this.LIZJ = new ArrayList<>(watchFaceDecomposition.LIZLLL);
        Collections.sort(this.LIZJ, new Comparator<ComplicationComponent>() { // from class: android.support.wearable.watchface.decompositionface.DecompositionConfigView.2
            static {
                Covode.recordClassIndex(389);
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(ComplicationComponent complicationComponent, ComplicationComponent complicationComponent2) {
                return complicationComponent2.mo21215LJ() - complicationComponent.mo21215LJ();
            }
        });
    }

    public DecompositionConfigView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
