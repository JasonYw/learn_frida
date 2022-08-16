package com.android.ttcjpaysdk.ocr.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.AbstractC472484mA;
import p003X.C108442Smq;
import p003X.C116971W2r;

/* loaded from: classes22.dex */
public class DefaultScanBoxView extends AbstractC472484mA {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;
    public Rect LIZLLL;

    /* renamed from: LJ */
    public float f25507LJ;
    public float LJFF;
    public Paint LJI;
    public TextPaint LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public Drawable LJIJJ;
    public Bitmap LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public int LJJIII;
    public boolean LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public int LJJIJIL;
    public boolean LJJIJL;
    public int LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public Drawable LJJJI;
    public Bitmap LJJJIL;
    public float LJJJJ;
    public float LJJJJI;
    public Bitmap LJJJJIZL;
    public Bitmap LJJJJJ;
    public Bitmap LJJJJJL;
    public Bitmap LJJJJL;
    public float LJJJJLI;
    public StaticLayout LJJJJLL;
    public int LJJJJZ;
    public boolean LJJJJZI;
    public boolean LJJJLIIL;
    public boolean LJJJLL;

    static {
        Covode.recordClassIndex(7913);
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        int width = getWidth();
        int i = this.LJIIL;
        int i2 = (width - i) / 2;
        int i3 = this.LJIILL;
        this.LIZLLL = new Rect(i2, i3, i + i2, this.LJIILIIL + i3);
        if (this.LJJIIJ) {
            float f = this.LIZLLL.left + this.LJJJJLI + 0.5f;
            this.LJFF = f;
            this.LJJJJI = f;
            return;
        }
        float f2 = this.LIZLLL.top + this.LJJJJLI + 0.5f;
        this.f25507LJ = f2;
        this.LJJJJ = f2;
    }

    @Override // p003X.AbstractC472484mA
    public final void LIZ(boolean z) {
        this.LJJJLIIL = z;
    }

    @Override // p003X.AbstractC472484mA
    public final void LIZIZ(boolean z) {
        this.LJJJLL = z;
    }

    public void setRectHeight(int i) {
        this.LJIILIIL = i;
    }

    public void setRectWidth(int i) {
        this.LJIIL = i;
    }

    public void setTopOffset(int i) {
        this.LJIILL = i;
    }

    private void LIZ(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 8).isSupported && this.LJIL > 0) {
            this.LJI.setStyle(Paint.Style.STROKE);
            this.LJI.setColor(this.LJJI);
            this.LJI.setStrokeWidth(this.LJIL);
            RectF rectF = new RectF(this.LIZLLL);
            int i = this.LJJ;
            canvas.drawRoundRect(rectF, i, i, this.LJI);
        }
    }

    public DefaultScanBoxView(Context context) {
        super(context);
        this.LJJJLIIL = true;
        this.LJI = new Paint();
        this.LJI.setAntiAlias(true);
        this.LJIIIIZZ = CastProtectorUtils.parseColor("#80000000");
        this.LJIIIZ = -1;
        this.LJIIJ = C108442Smq.LIZ(context, 20.0f);
        this.LJIIJJI = C108442Smq.LIZ(context, 2.0f);
        this.LJIILLIIL = C108442Smq.LIZ(context, 1.0f);
        this.LJIIZILJ = -1;
        this.LJIILL = C108442Smq.LIZ(context, 90.0f);
        this.LJIIL = C108442Smq.LIZ(context, 200.0f);
        this.LJIILJJIL = C108442Smq.LIZ(context, 140.0f);
        this.LJIJ = 0;
        this.LJIJI = false;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = C108442Smq.LIZ(context, 1.0f);
        this.LJJ = C108442Smq.LIZ(context, 4.0f);
        this.LJJI = CastProtectorUtils.parseColor("#CDFFFFFF");
        this.LJJIFFI = 1000;
        this.LJJII = false;
        this.LJJIII = 0;
        this.LJJIIJ = false;
        this.LIZIZ = C108442Smq.LIZ(context, 2.7f);
        this.LJJIIZI = null;
        this.LJJIJ = C108442Smq.LIZ(context, 14.0f);
        this.LJJIJIIJI = -1;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = C108442Smq.LIZ(context, 30.0f);
        this.LJJIJL = false;
        this.LJJIJLIJ = CastProtectorUtils.parseColor("#22000000");
        this.LJJIL = false;
        this.LJJIZ = false;
        this.LJJJ = false;
        this.LJII = new TextPaint();
        this.LJII.setAntiAlias(true);
        this.LJJJJZ = C108442Smq.LIZ(context, 4.0f);
        this.LJJJJZI = false;
    }

    public void setIsBarcode(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJJIIJ = z;
        if (this.LJJJI == null && !this.LJJJ) {
            if (this.LJIJJ != null || this.LJIJI) {
                if (this.LJJIIJ) {
                    this.LJIJJLI = this.LJJJJJ;
                } else {
                    this.LJIJJLI = this.LJJJJIZL;
                }
            }
        } else if (this.LJJIIJ) {
            this.LJJJIL = this.LJJJJL;
        } else {
            this.LJJJIL = this.LJJJJJL;
        }
        if (this.LJJIIJ) {
            this.LJJIIZI = this.LJJIIZ;
            this.LJIILIIL = this.LJIILJJIL;
            this.LIZJ = (int) (((this.LJJIFFI * 1.0f) * this.LIZIZ) / this.LJIIL);
        } else {
            this.LJJIIZI = this.LJJIIJZLJL;
            this.LJIILIIL = this.LJIIL;
            this.LIZJ = (int) (((this.LJJIFFI * 1.0f) * this.LIZIZ) / this.LJIILIIL);
        }
        if (!TextUtils.isEmpty(this.LJJIIZI)) {
            if (this.LJJIJL) {
                this.LJJJJLL = new StaticLayout(this.LJJIIZI, this.LJII, C108442Smq.LIZ(getContext()).x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            } else {
                this.LJJJJLL = new StaticLayout(this.LJJIIZI, this.LJII, this.LJIIL - (this.LJJJJZ * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            }
        }
        if (this.LJJII) {
            int i = C108442Smq.LIZ(getContext()).y;
            int i2 = this.LJJIII;
            if (i2 == 0) {
                this.LJIILL = (i - this.LJIILIIL) / 2;
            } else {
                this.LJIILL = ((i - this.LJIILIIL) / 2) + (i2 / 2);
            }
        }
        LIZ();
        postInvalidate();
    }

    private void LIZIZ(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 9).isSupported && this.LJJJJLI > 0.0f) {
            this.LJI.setStyle(Paint.Style.STROKE);
            this.LJI.setColor(this.LJIIIZ);
            this.LJI.setStrokeWidth(this.LJIIJJI);
            this.LJI.setStrokeJoin(Paint.Join.ROUND);
            Path path = new Path();
            path.moveTo(this.LIZLLL.left + this.LJIIJ + this.LJJJJLI, this.LIZLLL.top + this.LJJJJLI);
            path.lineTo(this.LIZLLL.left + this.LJJJJLI, this.LIZLLL.top + this.LJJJJLI);
            path.lineTo(this.LIZLLL.left + this.LJJJJLI, this.LIZLLL.top + this.LJIIJ + this.LJJJJLI);
            this.LJI.setPathEffect(new CornerPathEffect(10.0f));
            canvas.drawPath(path, this.LJI);
            path.moveTo((this.LIZLLL.right - this.LJIIJ) - this.LJJJJLI, this.LIZLLL.top + this.LJJJJLI);
            path.lineTo(this.LIZLLL.right - this.LJJJJLI, this.LIZLLL.top + this.LJJJJLI);
            path.lineTo(this.LIZLLL.right - this.LJJJJLI, this.LIZLLL.top + this.LJIIJ + this.LJJJJLI);
            canvas.drawPath(path, this.LJI);
            path.moveTo(this.LIZLLL.left + this.LJJJJLI, (this.LIZLLL.bottom - this.LJIIJ) - this.LJJJJLI);
            path.lineTo(this.LIZLLL.left + this.LJJJJLI, this.LIZLLL.bottom - this.LJJJJLI);
            path.lineTo(this.LIZLLL.left + this.LJIIJ + this.LJJJJLI, this.LIZLLL.bottom - this.LJJJJLI);
            canvas.drawPath(path, this.LJI);
            path.moveTo((this.LIZLLL.right - this.LJIIJ) - this.LJJJJLI, this.LIZLLL.bottom - this.LJJJJLI);
            path.lineTo(this.LIZLLL.right - this.LJJJJLI, this.LIZLLL.bottom - this.LJJJJLI);
            path.lineTo(this.LIZLLL.right - this.LJJJJLI, (this.LIZLLL.bottom - this.LJIIJ) - this.LJJJJLI);
            canvas.drawPath(path, this.LJI);
            this.LJI.setPathEffect(new PathEffect());
        }
    }

    private void LIZJ(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 11).isSupported && !TextUtils.isEmpty(this.LJJIIZI) && this.LJJJJLL != null) {
            if (this.LJJIJIIJIL) {
                if (this.LJJIL) {
                    this.LJI.setColor(this.LJJIJLIJ);
                    this.LJI.setStyle(Paint.Style.FILL);
                    if (this.LJJIJL) {
                        Rect rect = new Rect();
                        TextPaint textPaint = this.LJII;
                        String str = this.LJJIIZI;
                        textPaint.getTextBounds(str, 0, str.length(), rect);
                        float width = ((canvas.getWidth() - rect.width()) / 2) - this.LJJJJZ;
                        RectF rectF = new RectF(width, (this.LIZLLL.bottom + this.LJJIJIL) - this.LJJJJZ, rect.width() + width + (this.LJJJJZ * 2), this.LIZLLL.bottom + this.LJJIJIL + this.LJJJJLL.getHeight() + this.LJJJJZ);
                        int i = this.LJJJJZ;
                        canvas.drawRoundRect(rectF, i, i, this.LJI);
                    } else {
                        RectF rectF2 = new RectF(this.LIZLLL.left, (this.LIZLLL.bottom + this.LJJIJIL) - this.LJJJJZ, this.LIZLLL.right, this.LIZLLL.bottom + this.LJJIJIL + this.LJJJJLL.getHeight() + this.LJJJJZ);
                        int i2 = this.LJJJJZ;
                        canvas.drawRoundRect(rectF2, i2, i2, this.LJI);
                    }
                }
                canvas.save();
                if (this.LJJIJL) {
                    canvas.translate(0.0f, this.LIZLLL.bottom + this.LJJIJIL);
                    return;
                }
                this.LJII.setStyle(Paint.Style.FILL);
                this.LJII.setTextAlign(Paint.Align.CENTER);
                canvas.drawText(this.LJJIIZI, this.LIZLLL.centerX(), this.LIZLLL.bottom + this.LJJIJIL, this.LJII);
                return;
            }
            if (this.LJJIL) {
                this.LJI.setColor(this.LJJIJLIJ);
                this.LJI.setStyle(Paint.Style.FILL);
                if (this.LJJIJL) {
                    Rect rect2 = new Rect();
                    TextPaint textPaint2 = this.LJII;
                    String str2 = this.LJJIIZI;
                    textPaint2.getTextBounds(str2, 0, str2.length(), rect2);
                    float width2 = ((canvas.getWidth() - rect2.width()) / 2) - this.LJJJJZ;
                    RectF rectF3 = new RectF(width2, ((this.LIZLLL.top - this.LJJIJIL) - this.LJJJJLL.getHeight()) - this.LJJJJZ, rect2.width() + width2 + (this.LJJJJZ * 2), (this.LIZLLL.top - this.LJJIJIL) + this.LJJJJZ);
                    int i3 = this.LJJJJZ;
                    canvas.drawRoundRect(rectF3, i3, i3, this.LJI);
                } else {
                    RectF rectF4 = new RectF(this.LIZLLL.left, ((this.LIZLLL.top - this.LJJIJIL) - this.LJJJJLL.getHeight()) - this.LJJJJZ, this.LIZLLL.right, (this.LIZLLL.top - this.LJJIJIL) + this.LJJJJZ);
                    int i4 = this.LJJJJZ;
                    canvas.drawRoundRect(rectF4, i4, i4, this.LJI);
                }
            }
            canvas.save();
            if (this.LJJIJL) {
                canvas.translate(0.0f, (this.LIZLLL.top - this.LJJIJIL) - this.LJJJJLL.getHeight());
            } else {
                canvas.translate(this.LIZLLL.left + this.LJJJJZ, (this.LIZLLL.top - this.LJJIJIL) - this.LJJJJLL.getHeight());
            }
            this.LJJJJLL.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 4).isSupported || this.LIZLLL == null) {
            return;
        }
        try {
            if (this.LJJJLL) {
                if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 6).isSupported) {
                    int width = canvas.getWidth();
                    int height = canvas.getHeight();
                    if (this.LJIIIIZZ != 0) {
                        this.LJI.setStyle(Paint.Style.FILL);
                        this.LJI.setColor(this.LJIIIIZZ);
                        canvas.drawRect(0.0f, 0.0f, width, height, this.LJI);
                        this.LJI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                }
                if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 7).isSupported && this.LJIIIIZZ != 0) {
                    this.LJI.setStyle(Paint.Style.FILL);
                    this.LJI.setColor(0);
                    canvas.drawRoundRect(new RectF(this.LIZLLL), this.LJJ, this.LJJ, this.LJI);
                    this.LJI.setXfermode(null);
                }
                LIZ(canvas);
                LIZIZ(canvas);
                if (this.LJJJLIIL && !PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 10).isSupported) {
                    if (this.LJJIIJ) {
                        if (this.LJJJIL != null) {
                            RectF rectF = new RectF(this.LIZLLL.left + this.LJJJJLI + 0.5f, this.LIZLLL.top + this.LJJJJLI + this.LJIJ, this.LJJJJI, (this.LIZLLL.bottom - this.LJJJJLI) - this.LJIJ);
                            Rect rect = new Rect((int) (this.LJJJIL.getWidth() - rectF.width()), 0, this.LJJJIL.getWidth(), this.LJJJIL.getHeight());
                            if (rect.left < 0) {
                                rect.left = 0;
                                rectF.left = rectF.right - rect.width();
                            }
                            canvas.drawBitmap(this.LJJJIL, rect, rectF, this.LJI);
                        } else if (this.LJIJJLI != null) {
                            canvas.drawBitmap(this.LJIJJLI, (Rect) null, new RectF(this.LJFF, this.LIZLLL.top + this.LJJJJLI + this.LJIJ, this.LJFF + this.LJIJJLI.getWidth(), (this.LIZLLL.bottom - this.LJJJJLI) - this.LJIJ), this.LJI);
                        } else {
                            this.LJI.setStyle(Paint.Style.FILL);
                            this.LJI.setColor(this.LJIIZILJ);
                            canvas.drawRect(this.LJFF, this.LJIJ + this.LIZLLL.top + this.LJJJJLI, this.LJIILLIIL + this.LJFF, (this.LIZLLL.bottom - this.LJJJJLI) - this.LJIJ, this.LJI);
                        }
                    } else if (this.LJJJIL != null) {
                        RectF rectF2 = new RectF(this.LIZLLL.left + this.LJJJJLI + this.LJIJ, this.LIZLLL.top + this.LJJJJLI + 0.5f, (this.LIZLLL.right - this.LJJJJLI) - this.LJIJ, this.LJJJJ);
                        Rect rect2 = new Rect(0, (int) (this.LJJJIL.getHeight() - rectF2.height()), this.LJJJIL.getWidth(), this.LJJJIL.getHeight());
                        if (rect2.top < 0) {
                            rect2.top = 0;
                            rectF2.top = rectF2.bottom - rect2.height();
                        }
                        canvas.drawBitmap(this.LJJJIL, rect2, rectF2, this.LJI);
                    } else if (this.LJIJJLI != null) {
                        canvas.drawBitmap(this.LJIJJLI, (Rect) null, new RectF(this.LIZLLL.left + this.LJJJJLI + this.LJIJ, this.f25507LJ, (this.LIZLLL.right - this.LJJJJLI) - this.LJIJ, this.f25507LJ + this.LJIJJLI.getHeight()), this.LJI);
                    } else {
                        this.LJI.setStyle(Paint.Style.FILL);
                        this.LJI.setColor(this.LJIIZILJ);
                        canvas.drawRect(this.LJIJ + this.LIZLLL.left + this.LJJJJLI, this.f25507LJ, (this.LIZLLL.right - this.LJJJJLI) - this.LJIJ, this.LJIILLIIL + this.f25507LJ, this.LJI);
                    }
                }
                LIZJ(canvas);
                if (this.LJJJLIIL && !PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
                    if (this.LJJIIJ) {
                        if (this.LJJJIL == null) {
                            this.LJFF += this.LIZIZ;
                            int i = this.LJIILLIIL;
                            if (this.LJIJJLI != null) {
                                i = this.LJIJJLI.getWidth();
                            }
                            if (this.LJJIZ) {
                                if (this.LJFF + i > this.LIZLLL.right - this.LJJJJLI || this.LJFF < this.LIZLLL.left + this.LJJJJLI) {
                                    this.LIZIZ = -this.LIZIZ;
                                }
                            } else if (this.LJFF + i > this.LIZLLL.right - this.LJJJJLI) {
                                this.LJFF = this.LIZLLL.left + this.LJJJJLI + 0.5f;
                            }
                        } else {
                            this.LJJJJI += this.LIZIZ;
                            if (this.LJJJJI > this.LIZLLL.right - this.LJJJJLI) {
                                this.LJJJJI = this.LIZLLL.left + this.LJJJJLI + 0.5f;
                            }
                        }
                    } else if (this.LJJJIL == null) {
                        this.f25507LJ += this.LIZIZ;
                        int i2 = this.LJIILLIIL;
                        if (this.LJIJJLI != null) {
                            i2 = this.LJIJJLI.getHeight();
                        }
                        if (this.LJJIZ) {
                            if (this.f25507LJ + i2 > this.LIZLLL.bottom - this.LJJJJLI || this.f25507LJ < this.LIZLLL.top + this.LJJJJLI) {
                                this.LIZIZ = -this.LIZIZ;
                            }
                        } else if (this.f25507LJ + i2 > this.LIZLLL.bottom - this.LJJJJLI) {
                            this.f25507LJ = this.LIZLLL.top + this.LJJJJLI + 0.5f;
                        }
                    } else {
                        this.LJJJJ += this.LIZIZ;
                        if (this.LJJJJ > this.LIZLLL.bottom - this.LJJJJLI) {
                            this.LJJJJ = this.LIZLLL.top + this.LJJJJLI + 0.5f;
                        }
                    }
                    postInvalidateDelayed(this.LIZJ, this.LIZLLL.left, this.LIZLLL.top, this.LIZLLL.right, this.LIZLLL.bottom);
                    return;
                }
                return;
            }
            if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 5).isSupported) {
                int width2 = canvas.getWidth();
                int height2 = canvas.getHeight();
                if (this.LJIIIIZZ != 0) {
                    this.LJI.setStyle(Paint.Style.FILL);
                    this.LJI.setColor(this.LJIIIIZZ);
                    float f = width2;
                    canvas.drawRect(0.0f, 0.0f, f, this.LIZLLL.top, this.LJI);
                    canvas.drawRect(0.0f, this.LIZLLL.top, this.LIZLLL.left, this.LIZLLL.bottom + 1, this.LJI);
                    canvas.drawRect(this.LIZLLL.right + 1, this.LIZLLL.top, f, this.LIZLLL.bottom + 1, this.LJI);
                    canvas.drawRect(0.0f, this.LIZLLL.bottom + 1, f, height2, this.LJI);
                }
            }
            LIZ(canvas);
            LIZIZ(canvas);
            LIZJ(canvas);
        } catch (Exception unused) {
        }
    }

    public DefaultScanBoxView(Context context, AttributeSet attributeSet) {
        this(context);
        MethodCollector.m14708i(489);
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772658, 2130772659, 2130772660, 2130772661, 2130772662, 2130772663, 2130772664, 2130772665, 2130772666, 2130772667, 2130772668, 2130772669, 2130772670, 2130772671, 2130772672, 2130772673, 2130772674, 2130772675, 2130772676, 2130772677, 2130772678, 2130772679, 2130772680, 2130772681, 2130772682, 2130772683, 2130772684, 2130772686, 2130772687, 2130772688, 2130772689, 2130772690});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(index), obtainStyledAttributes}, this, LIZ, false, 2).isSupported) {
                    if (index == 31) {
                        this.LJIILL = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIILL);
                    } else if (index == 8) {
                        this.LJIIJJI = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIIJJI);
                    } else if (index == 7) {
                        this.LJIIJ = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIIJ);
                    } else if (index == 25) {
                        this.LJIILLIIL = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIILLIIL);
                    } else if (index == 22) {
                        this.LJIIL = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIIL);
                    } else if (index == 20) {
                        this.LJIIIIZZ = obtainStyledAttributes.getColor(index, this.LJIIIIZZ);
                    } else if (index == 6) {
                        this.LJIIIZ = obtainStyledAttributes.getColor(index, this.LJIIIZ);
                    } else if (index == 23) {
                        this.LJIIZILJ = obtainStyledAttributes.getColor(index, this.LJIIZILJ);
                    } else if (index == 24) {
                        this.LJIJ = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIJ);
                    } else if (index == 16) {
                        this.LJIJI = obtainStyledAttributes.getBoolean(index, this.LJIJI);
                    } else if (index == 10) {
                        this.LJIJJ = obtainStyledAttributes.getDrawable(index);
                    } else if (index == 5) {
                        this.LJIL = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIL);
                    } else if (index == 4) {
                        this.LJJ = obtainStyledAttributes.getDimensionPixelSize(index, this.LJJ);
                    } else if (index == 3) {
                        this.LJJI = obtainStyledAttributes.getColor(index, this.LJJI);
                    } else if (index == 0) {
                        this.LJJIFFI = obtainStyledAttributes.getInteger(index, this.LJJIFFI);
                    } else if (index == 12) {
                        this.LJJII = obtainStyledAttributes.getBoolean(index, this.LJJII);
                    } else if (index == 30) {
                        this.LJJIII = obtainStyledAttributes.getDimensionPixelSize(index, this.LJJIII);
                    } else if (index == 2) {
                        this.LJIILJJIL = obtainStyledAttributes.getDimensionPixelSize(index, this.LJIILJJIL);
                    } else if (index == 11) {
                        this.LJJIIJ = obtainStyledAttributes.getBoolean(index, this.LJJIIJ);
                    } else if (index == 1) {
                        this.LJJIIZ = obtainStyledAttributes.getString(index);
                    } else if (index == 21) {
                        this.LJJIIJZLJL = obtainStyledAttributes.getString(index);
                    } else if (index == 29) {
                        this.LJJIJ = obtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJ);
                    } else if (index == 27) {
                        this.LJJIJIIJI = obtainStyledAttributes.getColor(index, this.LJJIJIIJI);
                    } else if (index == 19) {
                        this.LJJIJIIJIL = obtainStyledAttributes.getBoolean(index, this.LJJIJIIJIL);
                    } else if (index == 28) {
                        this.LJJIJIL = obtainStyledAttributes.getDimensionPixelSize(index, this.LJJIJIL);
                    } else if (index == 18) {
                        this.LJJIJL = obtainStyledAttributes.getBoolean(index, this.LJJIJL);
                    } else if (index == 17) {
                        this.LJJIL = obtainStyledAttributes.getBoolean(index, this.LJJIL);
                    } else if (index == 26) {
                        this.LJJIJLIJ = obtainStyledAttributes.getColor(index, this.LJJIJLIJ);
                    } else if (index == 14) {
                        this.LJJIZ = obtainStyledAttributes.getBoolean(index, this.LJJIZ);
                    } else if (index == 15) {
                        this.LJJJ = obtainStyledAttributes.getBoolean(index, this.LJJJ);
                    } else if (index == 9) {
                        this.LJJJI = obtainStyledAttributes.getDrawable(index);
                    } else if (index == 13) {
                        this.LJJJJZI = obtainStyledAttributes.getBoolean(index, this.LJJJJZI);
                    }
                }
            }
            obtainStyledAttributes.recycle();
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                Drawable drawable = this.LJJJI;
                if (drawable != null) {
                    if (drawable instanceof BitmapDrawable) {
                        this.LJJJJJL = ((BitmapDrawable) drawable).getBitmap();
                    } else if (drawable instanceof LayerDrawable) {
                        Bitmap LIZ2 = C116971W2r.LIZ(786, 699, Bitmap.Config.ARGB_8888);
                        this.LJJJI.setBounds(0, 0, 786, 699);
                        this.LJJJI.draw(new Canvas(LIZ2));
                        this.LJJJJJL = LIZ2;
                    }
                }
                if (this.LJJJJJL == null) {
                    this.LJJJJJL = BitmapFactory.decodeResource(getResources(), 2130840458);
                    this.LJJJJJL = C108442Smq.LIZ(this.LJJJJJL, this.LJIIZILJ);
                }
                this.LJJJJL = C108442Smq.LIZIZ(this.LJJJJJL, 90);
                this.LJJJJL = C108442Smq.LIZIZ(this.LJJJJL, 90);
                this.LJJJJL = C108442Smq.LIZIZ(this.LJJJJL, 90);
                Drawable drawable2 = this.LJIJJ;
                if (drawable2 != null) {
                    this.LJJJJIZL = ((BitmapDrawable) drawable2).getBitmap();
                }
                if (this.LJJJJIZL == null) {
                    this.LJJJJIZL = BitmapFactory.decodeResource(getResources(), 2130840458);
                    this.LJJJJIZL = C108442Smq.LIZ(this.LJJJJIZL, this.LJIIZILJ);
                }
                this.LJJJJJ = C108442Smq.LIZIZ(this.LJJJJIZL, 90);
                this.LJIILL += this.LJJIII;
                this.LJJJJLI = (this.LJIIJJI * 1.0f) / 2.0f;
                this.LJII.setTextSize(this.LJJIJ);
                this.LJII.setColor(this.LJJIJIIJI);
                setIsBarcode(this.LJJIIJ);
            }
        }
        MethodCollector.m14707o(489);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
