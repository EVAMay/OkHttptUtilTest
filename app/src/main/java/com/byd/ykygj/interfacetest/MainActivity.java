package com.byd.ykygj.interfacetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_location,btn_lockStatus,btn_use,btn_close;
    private TextView tv_main;
    private String baseUrl="http://220.178.58.114:4055/webservice/";
    private String token="f7974f4a-df32-4281-be8e-f258ff4f957a";
    private String billCode="4300-1706109291";
    private int status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn_use.setOnClickListener(this);
        btn_location.setOnClickListener(this);
        btn_lockStatus.setOnClickListener(this);
        btn_close.setOnClickListener(this);

    }

    private void initView() {
        tv_main= (TextView) findViewById(R.id.tv_main);
        btn_location= (Button) findViewById(R.id.btn_location);
        btn_lockStatus= (Button) findViewById(R.id.btn_lockStatus);
        btn_use= (Button) findViewById(R.id.btn_use);
        btn_close= (Button) findViewById(R.id.btn_close);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_location:
                location();
                break;
            case R.id.btn_lockStatus:
                getLockStatus();
                break;
            case R.id.btn_use:
                status=0;
                operation();
                break;
            case R.id.btn_close:
                status=1;
                operation();
                break;
        }
    }
    private void location(){
        OkHttpUtils.post()
                .url(baseUrl+"location?licencePlate=%E5%B7%9DAJ5261")
                .addParams("token",token)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        tv_main.setText(response.toString());
                        Log.d("debug",response.toString());
                    }
                });
    }
    private void getLockStatus(){
        OkHttpUtils.post()
                .url(baseUrl+"getvalve?")
                .addParams("billCode","4300-1706109291")
                .addParams("token",token)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        tv_main.setText(response.toString());
                        Log.d("debug",response.toString());
                    }
                });
    }
    private void operation(){
        //http://220.178.58.114:4055/webservice/setvalve?billCode=4300-1706109291&token=f7974f4a-df32-4281-be8e-f258ff4f957a&userName=test&valveId=6&status=1
        OkHttpUtils.post()
                .url(" http://220.178.58.114:4055/webservice/setvalve?billCode=4300-1706109291&token=f7974f4a-df32-4281-be8e-f258ff4f957a&userName=test&valveId=3&status="+status)
//                .url(baseUrl+"setvalve?")
//                .addParams("billCode",billCode)
//                .addParams("token",token)
//                .addParams("userName","test")
//                .addParams("valveId","3")
//                .addParams("status", String.valueOf(status))
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        tv_main.setText(response.toString());
                        Log.d("debug",response.toString());
                    }
                });
    }
}
