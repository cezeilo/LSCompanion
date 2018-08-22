package apps.chima.lostsagacompanion;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

public class Hero {

    private int id;
    private String name;
    private String combatStyle;
    private String category;
    private ImageView icon;
    private ImageView fullImage1;
    private ImageView fullImage2;
    private Bitmap bitmap;

    public Hero(int id, String name, String combatStyle, String category, Context c) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.combatStyle = combatStyle;
        icon = new ImageView(c);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCombatStyle() {
        return combatStyle;
    }

    public String getCategory() {
        return category;
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setIconBitmap(Bitmap bp) {
        bitmap = Bitmap.createScaledBitmap(bp, 200, 300, false);
    }

    public Bitmap getIconBitmap(){ return bitmap;}

    public ImageView getFullImage1() {
        return fullImage1;
    }

    public void setFullImage1(ImageView fullImage1) {
        this.fullImage1 = fullImage1;
    }

    public ImageView getFullImage2() {
        return fullImage2;
    }

    public void setFullImage2(ImageView fullImage2) {
        this.fullImage2 = fullImage2;
    }



}
