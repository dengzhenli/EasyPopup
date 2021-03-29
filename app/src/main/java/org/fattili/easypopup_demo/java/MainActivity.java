package org.fattili.easypopup_demo.java;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import org.fattili.easypopup.view.dialog.AlertDialogPop;
import org.fattili.easypopup_demo.R;

/**
 * 2021/3/29
 *
 * @author dengzhenli
 */
public class MainActivity extends AppCompatActivity implements LifecycleOwner {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void topPop(View view) {
        new TopTestPop(this).register(this).show();
    }

    private void dialogPop(View view) {

        new AlertDialogPop.Builder(this)
                .setTitle("标题")
                .setMessage("是否启动自毁程序")
                .setMeasureButton(true, null, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                })
                .setCancelButton(true, null, null)
                .register(this)
                .show();
    }

    private void cardPop(View view) {
        new CardTestPop(this).register(this).show();
    }

    private void normalPop(View view) {
        new TestPop(this).register(this).show();
    }
}
