package example.com.property_animation;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rotateyAnimRun(final View view)
    {
//        ObjectAnimator anim = ObjectAnimator//
//                .ofFloat(view, "rotationY", 0.0F, 360.0F)//rotationX为以X轴为中心旋转，rotationY为Y轴为中心旋转
//                .ofFloat(view, "scaleY", 0.0F, 0.0F)//以Y轴为中心缩放
//                .ofFloat(view, "alpha", 0.1F, 1.0F)//渐变、从0.0~1.0

//                .ofFloat(view, "zhy", 1.0F,  0.0F)//
//                .setDuration(1000);//

//        anim.start();
//
//        anim.addUpdateListener(new AnimatorUpdateListener()
//        {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation)
//            {
//                float cVal = (Float) animation.getAnimatedValue();
//                view.setAlpha(cVal);
//                view.setScaleX(cVal);
//                view.setScaleY(cVal);
//            }
//        });


        propertyValuesHolder(view);
    }

    /***
     *
     * 缩放和渐变，从来回
     * @param view
     */
    public void propertyValuesHolder(View view)
    {
        PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat("alpha", 1f,
                0f, 1f);
        PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat("scaleX", 1f,
                0, 1f);
        PropertyValuesHolder pvhZ = PropertyValuesHolder.ofFloat("scaleY", 1f,
                0, 1f);
        ObjectAnimator.ofPropertyValuesHolder(view, pvhX, pvhY,pvhZ).setDuration(1000).start();
    }
}
