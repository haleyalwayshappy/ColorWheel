package com.hong.colorwheel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Switch;
import android.widget.Toast;

import com.lukedeighton.wheelview.WheelView;
import com.lukedeighton.wheelview.adapter.WheelAdapter;

public class MainActivity extends AppCompatActivity {
    private WheelView wheelView; // 휠뷰 선언!
    private String[] colors = {  // 컬러값 지정! (원하는 갯수만큼 색상값 넣기!!)
            "#F53E26", "#FA953E", "#FCC74A", "#E5D63B","#4941A9","#B967F3"
    };
 int size = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wheelView = findViewById(R.id.color_wheel);
        wheelView.setWheelItemCount(size);

        ShapeDrawable[] shapeDrawables = new ShapeDrawable[size];
        for (int i = 0; i < size; i++) {
            shapeDrawables[i] = new ShapeDrawable(new OvalShape());
            shapeDrawables[i].getPaint().setColor(Color.parseColor(colors[i]));
        }
        wheelView.setAdapter(new WheelAdapter() {

            @Override
            public Drawable getDrawable(int position) {
                Drawable drawable = shapeDrawables[position];
                return drawable;
            }

            @Override
            public int getCount() {
                return size;
            }
        });
        wheelView.setOnWheelItemClickListener(new WheelView.OnWheelItemClickListener() {
            @Override
            public void onWheelItemClick(WheelView parent, int position, boolean isSelected) {
                Log.d("aabb", String.valueOf(position));

                /**[수정] 터치 되었을 때 다음 페이지로 넘어가기 */

                switch (position) {
                    case 0:
                        Toast.makeText(com.hong.colorwheel.MainActivity.this, "1 페이지로 이동", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), com.hong.colorwheel.SubActivity.class);
                        startActivity(intent);// 0번값 터치시 넘어가는 코드 달기
                        break;
                    case 1:
                        Toast.makeText(com.hong.colorwheel.MainActivity.this, "2페이지로 이동", Toast.LENGTH_SHORT).show();
                        // 1번값 터치시 넘어가는 코드 달기
                        break;
                    case 2:
                        Toast.makeText(com.hong.colorwheel.MainActivity.this, "3 페이지로 이동", Toast.LENGTH_SHORT).show();
                        // 2번값 터치시 넘어가는 코드 달기
                        break;
                    case 3:
                        Toast.makeText(com.hong.colorwheel.MainActivity.this, "4 페이지로 이동", Toast.LENGTH_SHORT).show();
                        // 3번값 터치시 넘어가는 코드 달기
                        break;
                }

            }
        });
    }
};

/** 컬러 서클 말고 이미지를 넣어야 할때 !
 * drawable-xxxhdpi에 넣고 싶은 이미지(.jpg/png)들을 넣는다.
 * 아래 코드들을 선언해준다.
 * 클래스에 컬러 코드 대신 이미지 선언 해준뒤 이미지 리스트를 넣는다!
 * ex)   private int[] images = {
 *             R.drawable.moodimg1, R.drawable.moodimg2, ... }
 *             경로 설정 잘해주기
 *Drawable[] drawables = new Drawable[size];
 *         for (int i = 0; i < size; i++) {
 *             drawables[i] = getDrawable(images[i]);
 *         }
 *
 *         wheelView.setAdapter(new WheelAdapter() {
 *
 *             @Override
 *             public Drawable getDrawable(int position) {
 *
 *                 Drawable drawable = drawables[position];
 *
 *                 return drawable;
 *             }
 *
 *             @Override
 *             public int getCount() {
 *
 *                 return size;
 *
 *             }
 *         });
 * */
