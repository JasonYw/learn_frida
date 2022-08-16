package android.support.wearable.view;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import androidx.collection.LruCache;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC139232dAK;
import p003X.AbstractC139234dAM;
import p003X.TM6;
import p003X.TM7;
import p003X.TM8;
import p003X.TMB;

/* loaded from: classes10.dex */
public final class BackgroundController implements AbstractC139234dAM, AbstractC139232dAK {
    public TMB LIZ;
    public final TM7 LIZIZ;
    public Direction LIZJ;
    public final Point LIZLLL;

    /* renamed from: LJ */
    public final Point f20204LJ;
    public final LruCache<Integer, Drawable> LJFF;
    public final LruCache<Integer, Drawable> LJI;
    public final TM6 LJII;
    public final TM6 LJIIIIZZ;
    public final Point LJIIIZ;
    public final Point LJIIJ;
    public final Point LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;

    static {
        Covode.recordClassIndex(313);
    }

    public static int LIZIZ(int i, int i2) {
        return (i & 65535) | (i2 << 16);
    }

    @Override // p003X.AbstractC139234dAM
    public final void LIZ() {
        LIZIZ();
    }

    /* loaded from: classes10.dex */
    public enum Direction {
        LEFT(-1, 0),
        UP(0, -1),
        RIGHT(1, 0),
        DOWN(0, 1),
        NONE(0, 0);
        

        /* renamed from: x */
        public final int f20206x;

        /* renamed from: y */
        public final int f20207y;

        public final boolean LIZ() {
            if (this.f20207y != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(314);
        }

        Direction(int i, int i2) {
            this.f20206x = i;
            this.f20207y = i2;
        }
    }

    private void LIZIZ() {
        this.LIZJ = Direction.NONE;
        this.LJI.evictAll();
        this.LJFF.evictAll();
        this.LJIIIIZZ.LIZ((Drawable) null);
        this.LJII.LIZ((Drawable) null);
    }

    @Override // p003X.AbstractC139232dAK
    public final void LIZ(int i) {
        if (i == 0) {
            this.LIZJ = Direction.NONE;
        }
    }

    @Override // p003X.AbstractC139234dAM
    public final void LIZ(TMB tmb) {
        LIZIZ();
        this.f20204LJ.set(0, 0);
        this.LIZLLL.set(0, 0);
        this.LIZ = tmb;
    }

    @Override // p003X.AbstractC139232dAK
    public final void LIZ(int i, int i2) {
        this.f20204LJ.set(i2, i);
    }

    @Override // p003X.AbstractC139232dAK
    public final void LIZ(int i, int i2, float f, float f2) {
        float f3;
        Direction direction;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        float abs;
        float f4 = 0.0f;
        if (this.LIZJ != Direction.NONE && this.LIZLLL.equals(this.f20204LJ) && this.LJIIIZ.equals(i2, i)) {
            if (this.LIZJ.LIZ()) {
                f4 = TM8.LIZ(i - this.LIZLLL.y, -1, 0) + f;
                f3 = 0.0f;
            } else {
                f3 = TM8.LIZ(i2 - this.LIZLLL.x, -1, 0) + f2;
            }
        } else {
            this.LJIIIZ.set(i2, i);
            this.LIZLLL.set(this.f20204LJ.x, this.f20204LJ.y);
            float LIZ = TM8.LIZ(i - this.LIZLLL.y, -1, 0) + f;
            int i5 = (LIZ > 0.0f ? 1 : (LIZ == 0.0f ? 0 : -1));
            if (i5 == 0) {
                f3 = TM8.LIZ(i2 - this.LIZLLL.x, -1, 0) + f2;
                int i6 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i6 != 0) {
                    if (i6 > 0) {
                        direction = Direction.RIGHT;
                    } else {
                        direction = Direction.LEFT;
                    }
                } else {
                    direction = Direction.NONE;
                }
            } else {
                f3 = 0.0f;
                if (i5 > 0) {
                    direction = Direction.DOWN;
                } else {
                    direction = Direction.UP;
                }
            }
            this.LIZJ = direction;
            Point point = this.LIZLLL;
            Point point2 = this.LJIIIZ;
            Direction direction2 = this.LIZJ;
            TMB tmb = this.LIZ;
            if (tmb != null && tmb.LIZ() > 0) {
                Drawable drawable = this.LJI.get(Integer.valueOf(LIZIZ(point.x, point.y)));
                this.LJIIJJI.set(point.x, point.y);
                if (drawable == TMB.LIZ) {
                    drawable = this.LJFF.get(Integer.valueOf(point.y));
                    TMB tmb2 = this.LIZ;
                    int i7 = point.y;
                    this.LJIJ = tmb2.LIZIZ() + 2;
                    this.LJIILLIIL = point.x + 1;
                } else {
                    this.LJIJ = 3;
                    this.LJIILLIIL = 1.0f;
                }
                this.LJIJI = 3;
                this.LJIIZILJ = 1.0f;
                this.LJII.LIZ(drawable);
                this.LJII.LIZ(this.LJIJ, this.LJIJI);
                this.LJII.LIZ(this.LJIILLIIL + f3, this.LJIIZILJ + LIZ);
                TM7 tm7 = this.LIZIZ;
                TM6 tm6 = this.LJII;
                if (tm7.LIZIZ != tm6) {
                    if (tm7.LIZIZ != null) {
                        tm7.LIZIZ.setCallback(null);
                    }
                    tm7.LIZIZ = tm6;
                    tm7.LIZIZ(tm6);
                    tm7.invalidateSelf();
                }
                if (point.x + f3 >= 0.0f && point.y + LIZ >= 0.0f) {
                    TMB tmb3 = this.LIZ;
                    int i8 = point.y;
                    if (point2.x + f3 <= tmb3.LIZIZ() - 1 && point2.y + LIZ <= this.LIZ.LIZ() - 1) {
                        z = false;
                        if (this.LIZJ == Direction.NONE && !z) {
                            int i9 = point2.y;
                            if (direction2 == Direction.DOWN) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            int i10 = i9 + i3;
                            int i11 = point2.x;
                            if (direction2 == Direction.RIGHT) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            int i12 = i11 + i4;
                            if (i10 != this.LIZLLL.y) {
                                int i13 = point.x;
                                i12 = 0;
                            }
                            Drawable drawable2 = this.LJI.get(Integer.valueOf(LIZIZ(i12, i10)));
                            this.LJIIJ.set(i12, i10);
                            if (drawable2 == TMB.LIZ) {
                                drawable2 = this.LJFF.get(Integer.valueOf(i10));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (drawable == drawable2) {
                                this.LJIJJ = false;
                                this.LJIIIIZZ.LIZ((Drawable) null);
                                this.LIZIZ.LIZ((Drawable) null);
                                this.LIZIZ.LIZ(0.0f);
                            } else {
                                if (z2) {
                                    this.LJIILJJIL = this.LIZ.LIZIZ() + 2;
                                    if (direction2.f20206x != 0) {
                                        this.LJIIL = point.x + 1;
                                    } else {
                                        this.LJIIL = i12 + 1;
                                    }
                                } else {
                                    this.LJIILJJIL = 3;
                                    this.LJIIL = 1 - direction2.f20206x;
                                }
                                this.LJIILL = 3;
                                this.LJIILIIL = 1 - direction2.f20207y;
                                this.LJIJJ = true;
                                this.LJIIIIZZ.LIZ(drawable2);
                                this.LJIIIIZZ.LIZ(this.LJIILJJIL, this.LJIILL);
                                this.LJIIIIZZ.LIZ(this.LJIIL + f3, this.LJIILIIL + LIZ);
                                this.LIZIZ.LIZ(this.LJIIIIZZ);
                            }
                        } else {
                            this.LJIJJ = false;
                            this.LJIIIIZZ.LIZ((Drawable) null);
                            this.LIZIZ.LIZ(0.0f);
                        }
                    }
                }
                z = true;
                if (this.LIZJ == Direction.NONE) {
                }
                this.LJIJJ = false;
                this.LJIIIIZZ.LIZ((Drawable) null);
                this.LIZIZ.LIZ(0.0f);
            } else {
                this.LJIJJ = false;
                this.LJII.LIZ((Drawable) null);
                this.LJIIIIZZ.LIZ((Drawable) null);
            }
            f4 = LIZ;
        }
        this.LJII.LIZ(this.LJIILLIIL + f3, this.LJIIZILJ + f4);
        if (this.LJIJJ) {
            if (this.LIZJ.LIZ()) {
                abs = Math.abs(f4);
            } else {
                abs = Math.abs(f3);
            }
            this.LIZIZ.LIZ(abs);
            this.LJIIIIZZ.LIZ(this.LJIIL + f3, this.LJIILIIL + f4);
        }
    }
}
