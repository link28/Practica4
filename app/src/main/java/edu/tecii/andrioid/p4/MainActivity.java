package edu.tecii.andrioid.p4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText dinero;
    private TextView b100,b50,b20,m5,m2,m1,c50,c20,c10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dinero=(EditText)findViewById(R.id.dinero);
        b100=(TextView)findViewById(R.id.b100);
        b50=(TextView)findViewById(R.id.b50);
        b20=(TextView)findViewById(R.id.b20);
        m5=(TextView)findViewById(R.id.m5);
        m2=(TextView)findViewById(R.id.m2);
        m1=(TextView)findViewById(R.id.m1);
        c50=(TextView)findViewById(R.id.c50);
        c20=(TextView)findViewById(R.id.c20);
        c10=(TextView)findViewById(R.id.c10);
    }

    public void convertir (View view){

        int parteent, partedec;
        int B100,B50,B20,M5,M2,M1,C50,C20,C10;
        String cantidad=dinero.getText().toString();
        double d=Double.parseDouble(cantidad);
        parteent = (int)(d);

        B100=parteent/100;
        parteent=parteent%100;

        B50=parteent/50;
        parteent=parteent%50;

        B20=parteent/20;
        parteent=parteent%20;

        M5=parteent/5;
        parteent=parteent%5;

        M2=parteent/2;
        parteent=parteent%2;

        M1=parteent;

        partedec = (int)(d * 1000+0.5);
        C50 = partedec/500;
        partedec = partedec%500;
        C20=partedec/200;
        partedec=partedec % 200;
        C10=partedec/100;

        String res="",res1="",res2="",res3="",res4="",res5="",res6="",res7="",res8="";

        res="Total de billetes de 100 es:" + B100 + "\n";
        res1="Total de billetes de 50 es:" + B50 + "\n";
        res2="Total de billetes de 20 es:" + B20 + "\n";
        res3="Total de monedas de 5  es:" + M5 + "\n";
        res4="Total de Monedas de 2  es:" + M2 + "\n";
        res5="Total de monedas de 1  es:" + M1 + "\n";
        res6="Total de centavos de 50  es:" + C50 + "\n";
        res7="Total de centavos de 20  es:" + C20 + "\n";
        res8="Total de monedas de 10  es:" + C10 + "\n";

        b100.setText(res);
        b50.setText(res1);
        b20.setText(res2);
        m5.setText(res3);
        m2.setText(res4);
        m1.setText(res5);
        c50.setText(res6);
        c20.setText(res7);
        c10.setText(res8);



    }
}
