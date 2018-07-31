package com.example.administrator.gitglide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(MainActivity.this)
                        .load("http://img1.dzwww.com:8080/tupian_pl/20150813/16/7858995348613407436.jpg")
                        .apply(RequestOptions.placeholderOf(R.mipmap.ic_launcher))//图片加载出来前，显示的图片
                        .apply(RequestOptions.circleCropTransform())//请求选项通过 RequestOptions 类和 apply() 方法来应用到程序中。
                        .transition(withCrossFade())//过渡选项
                        .into(imageView);
                 
            }
        });

    }
}
