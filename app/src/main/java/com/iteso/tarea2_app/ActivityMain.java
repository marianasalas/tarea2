package com.iteso.tarea2_app;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {
ImageButton like;
Button addToCart, M, S, L, XL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        like = findViewById(R.id.activity_main_like);
        addToCart = findViewById(R.id.activity_main_cart);
        M = findViewById(R.id.size_M);
        S = findViewById(R.id.size_S);
        L = findViewById(R.id.size_L);
        XL = findViewById(R.id.size_XL);

    }

    public void like(View view){
        Toast.makeText(getApplicationContext(), R.string.like, Toast.LENGTH_SHORT).show();
    }


    public void onButtonClicked (View v) {
        boolean pressed = ((Button) v).isPressed();

        switch (v.getId()) {
            case R.id.activity_main_cart:
                if  (addToCart.getText().equals(R.string.Cart)){
                    addToCart.setText(R.string.Added);
                    Snackbar.make(v, R.string.Added,Snackbar.LENGTH_INDEFINITE).
                            setAction("UNDO", new View.OnClickListener(){
                            public  void onClick(View view1){
                                addToCart.setText(R.string.Cart);
                            }
                            }

                    ).show();

                }
                    else if(addToCart.getText().equals(R.string.Added)) {
                    Toast.makeText(ActivityMain.this, R.string.Item, Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.size_M:
                M.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                M.setTextColor(getResources().getColor(R.color.white));
                break;

            case R.id.size_S:
                S.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                S.setTextColor(getResources().getColor(R.color.white));
                break;

            case R.id.size_L:
                L.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                L.setTextColor(getResources().getColor(R.color.white));
                break;

            case R.id.size_XL:
                XL.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                XL.setTextColor(getResources().getColor(R.color.white));
                break;
        }
    }


}