package com.example.kimmilyonerolmakister;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class Yarisma extends AppCompatActivity {
    private ImageView top;//zamanı gösteren noktalar
   int siradaki=0;
   String soru,cevapA,cevapB,cevapC,cevapD,dogru;
    int r,secim;
   ArrayList<String> dizi=new ArrayList<>();
   Random random;
   SoruCevap s;
    TextView soruKutusu;
    Button a,b,c,d,exit,seyirciJokeri,telefonJokeri,cekil,yuzdeElliJoker;
    ImageView jokerEkrani;
     String paraMiktari[]={"0","500","1.000","2.000","3.000","5.000","7.500","15.000","30.000","60.000","125.000","250.000","1.000.000"};
    TextView sure;
    android.support.v7.widget.GridLayout gosterge2;
    ImageView rrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yarisma);
        //noktaPasif();//yeni deneme
        gosterge2=findViewById(R.id.gosterge);
        zamanGostergesi();
         soruKutusu = (TextView) findViewById(R.id.textView);
         a = (Button) findViewById(R.id.button3);
         b = (Button) findViewById(R.id.button4);
         c = (Button) findViewById(R.id.button5);
         d = (Button) findViewById(R.id.button6);
         yuzdeElliJoker=(Button)findViewById(R.id.button9);
         cekil=(Button)findViewById(R.id.button11);
         telefonJokeri=(Button)findViewById(R.id.button8);
         jokerEkrani=(ImageView)findViewById(R.id.imageView3);
         seyirciJokeri=(Button)findViewById(R.id.button10);
         exit=(Button)findViewById(R.id.button7);
         TextView t12=(TextView)findViewById(R.id.textView2);
         TextView t11=(TextView)findViewById(R.id.textView3);
        TextView t10=(TextView)findViewById(R.id.textView4);
        TextView t9=(TextView)findViewById(R.id.textView5);
        TextView t8=(TextView)findViewById(R.id.textView6);
        TextView t7=(TextView)findViewById(R.id.textView7);
        TextView t6=(TextView)findViewById(R.id.textView8);
        TextView t5=(TextView)findViewById(R.id.textView9);
        TextView t4=(TextView)findViewById(R.id.textView10);
        TextView t3=(TextView)findViewById(R.id.textView11);
        TextView t2=(TextView)findViewById(R.id.textView12);
        TextView t1=(TextView)findViewById(R.id.textView13);
          sure=(TextView)findViewById(R.id.textView16);
        final TextView para[]={t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12};
        random = new Random();
         s = new SoruCevap();
         s.dizi();//yeni eklendi
           devam();
           paraSeviyesi(para);
           a.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (siradaki < 12)
                   {
                   if (cevapA.equals(dogru)) {

                       siradaki++;
                       if(siradaki<12) paraSeviyesi(para);
                       onaylama(a, true);
                   } else {
                       a.setBackgroundResource(R.drawable.turucubuton);
                       if (cevapB.equals(dogru)) {
                           onaylama(b, false);
                       } else if (cevapC.equals(dogru)) {
                           onaylama(c, false);
                       } else if (cevapD.equals(dogru)) {
                           onaylama(d, false);
                       }

                   }
               }
               }
           });
           b.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (siradaki < 12)
                   {
                   if (cevapB.equals(dogru)) {
                       siradaki++;
                       if(siradaki<12) paraSeviyesi(para);
                       onaylama(b, true);
                   } else {
                       b.setBackgroundResource(R.drawable.turucubuton);
                       if (cevapA.equals(dogru)) {
                           onaylama(a, false);
                       } else if (cevapC.equals(dogru)) {
                           onaylama(c, false);
                       } else if (cevapD.equals(dogru)) {
                           onaylama(d, false);
                       }

                   }
               }
               }
           });
           c.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (siradaki < 12)
                   {
                   if (cevapC.equals(dogru)) {
                       siradaki++;
                       if(siradaki<12) paraSeviyesi(para);
                       onaylama(c, true);
                   } else {
                       c.setBackgroundResource(R.drawable.turucubuton);
                       if (cevapB.equals(dogru)) {
                           onaylama(b, false);
                       } else if (cevapA.equals(dogru)) {
                           onaylama(a, false);
                       } else if (cevapD.equals(dogru)) {
                           onaylama(d, false);
                       }

                   }
               }

               }
           });
           d.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (siradaki < 12)
                   {
                       if (cevapD.equals(dogru)) {
                           siradaki++;
                           if(siradaki<12)paraSeviyesi(para);
                           onaylama(d, true);
                       } else {
                           d.setBackgroundResource(R.drawable.turucubuton);
                           if (cevapB.equals(dogru)) {
                               onaylama(b, false);
                           } else if (cevapC.equals(dogru)) {
                               onaylama(c, false);
                           } else if (cevapA.equals(dogru)) {
                               onaylama(a, false);
                           }

                       }
               }

               }
           });
           exit.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   finish();
                   System.exit(0);
                   Intent intent=new Intent(Yarisma.this,MainActivity.class);
                   startActivity(intent);

               }
           });
           seyirciJokeri.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   seyirciJokeri.setBackgroundResource(R.drawable.seyircijokeripasif);
                   seyirciJokeri.setEnabled(false);
                   jokerEkrani.setVisibility(View.VISIBLE);
                   if(cevapA.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.seyircia);
                   }
                   else if(cevapB.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.seyircib);
                   }
                    else if (cevapC.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.seyircic);
                   }
                    else if(cevapD.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.seyircid);
                   }
               }
           });
           telefonJokeri.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   telefonJokeri.setBackgroundResource(R.drawable.telefonjokerpasif);
                   telefonJokeri.setEnabled(false);
                   jokerEkrani.setVisibility(View.VISIBLE);
                   if(cevapA.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.telefona);
                   }
                   else if(cevapB.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.telefonb);
                   }
                   else if (cevapC.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.telefonc);
                   }
                   else if(cevapD.equals(dogru)){
                       jokerEkrani.setImageResource(R.drawable.telefond);
                   }
               }
           });
           cekil.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                 //dialog ekranı gelecek
                   dialogSonuc(false);

               }
           });

           yuzdeElliJoker.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   yuzdeElliJoker.setBackgroundResource(R.drawable.yariyariyajokerpasif);
                   yuzdeElliJoker.setEnabled(false);
                   ArrayList<Button> eleme=new ArrayList<>();
                   eleme.add(0,a);
                   eleme.add(1,b);
                   eleme.add(2,c);
                   eleme.add(3,d);

                       if (cevapA.equals(dogru)) {
                         eleme.remove(0);
                       } else if (cevapB.equals(dogru) ) {
                          eleme.remove(1);
                       } else if (cevapC.equals(dogru) ) {
                          eleme.remove(2);
                       } else if (cevapD.equals(dogru) ) {
                         eleme.remove(3);
                       }
                   Random s=new Random();
                       int rnd=s.nextInt(eleme.size());
                    Button w= eleme.get(rnd);
                         w.setText(" ");
                         eleme.remove(rnd);
                      w.setEnabled(false);
                   w= eleme.get(s.nextInt(eleme.size()));
                   w.setText(" ");
                   w.setEnabled(false);


               }
           });



    }
    int periyot=0;
    public void onaylama(final Button cevap, final Boolean yanit){
        dtm.cancel();//Yeni bir soruya geçildiği için diğer timerı sıfırlamamızı sağlar
        Count2.cancel();//Yeni bir soruya geçildiği için diğer timerı sıfırlamamızı sağlar
        final CountDownTimer Count = new CountDownTimer(2000, 150) {
            @Override
            public void onTick(long millisUntilFinished) {

                if(periyot==0){
                    periyot=1;
                    cevap.setBackgroundResource(R.drawable.yesilbuton);
                }
                    else{
                        periyot=0;
                        cevap.setBackgroundResource(R.drawable.turucubuton);
                }
            }
            @Override
            public void onFinish() {
                if(yanit==true) {
                    cevap.setBackgroundResource(R.drawable.button);
                   if(siradaki<12) devam();
                   else dialogSonuc(true);
                }
                else{
                    dialogSonuc(true);
                }
            }
        };
        Count.start();
    }
    public void dialogSonuc(Boolean tus){
        Count2.cancel();//dialog ekranı açıldığında timer bitirilmesi gerekli
        final  Dialog dialog=new Dialog(Yarisma.this);
        dialog.setContentView(R.layout.sonuc_dialog);
        dialog.setCancelable(false);
        TextView nakit;
        nakit=(TextView)dialog.findViewById(R.id.textView15);
        if (tus==true) {
            if (siradaki < 2) nakit.setText("0 TL");
            else if (siradaki >= 2 && siradaki <= 6) nakit.setText("1.000 TL");
            else if (siradaki >= 7 && siradaki <= 11) nakit.setText("15.000 TL");
            else nakit.setText("1.000.000 TL");
        }else nakit.setText(paraMiktari[siradaki] + " TL");
        dialog.show();
        Button geri;
        geri=(Button)dialog.findViewById(R.id.button13);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                finish();
                Intent intent=new Intent(Yarisma.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
    public void paraSeviyesi(TextView p[]){
        if(siradaki!=0){
            p[siradaki-1].setBackgroundResource(Color.alpha(0));
        }
        p[siradaki].setBackgroundResource(R.drawable.turucubuton);
    }
    public void devam() {
        pasifTop();
        kronometre();//yeni eklendi
            //--yüzde elli jokeri kullandıktan sonra gerekli
            a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        //--
        jokerEkrani.setVisibility(View.INVISIBLE);//seyirci jokeri ekran
        soru = s.Soru(siradaki);
        soruKutusu.setText(soru);
        dogru = s.dCevap(siradaki);
        dizi.add(s.yCevap(siradaki, 0));
        dizi.add(s.yCevap(siradaki, 1));
        dizi.add(s.yCevap(siradaki, 2));
        dizi.add(s.dCevap(siradaki));
        r = random.nextInt(dizi.size());
        cevapA = dizi.get(r);
        a.setText("A: " + cevapA);
        dizi.remove(r);
        //////////////////
        r = random.nextInt(dizi.size());
        cevapB = dizi.get(r);
        b.setText("B: " + cevapB);
        dizi.remove(r);
        /////////////////
        r = random.nextInt(dizi.size());
        cevapC = dizi.get(r);
        c.setText("C: " + cevapC);
        dizi.remove(r);
        //////////////////////
        r = random.nextInt(dizi.size());
        cevapD = dizi.get(r);
        d.setText("D: " + cevapD);
        dizi.remove(r);
    }
    int tsayac;
     CountDownTimer Count2;
    String str;
    public void kronometre(){

        if(siradaki<7) {
            tsayac = 45;
            Count2 = new CountDownTimer(45000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    tsayac--;
                    str = String.valueOf(tsayac);
                    sure.setText(str);
                }

                @Override
                public void onFinish() {
                    dialogSonuc(true);

                }
            };
            Count2.start();
        }
        else sure.setVisibility(View.INVISIBLE);
    }

   /* public void noktaPasif(){
       gosterge2=findViewById(R.id.gosterge);
        rrr=(ImageView)findViewById(R.id.imageView4);
        for (int i=0;i<3;i++) {
            int k=R.drawable.nokta;
            rrr.setImageResource(k);
            //gosterge2.addView(new ImageCreate(this));
            //gosterge2.addView(rrr);
               gosterge2.addView(new ImageView(getBaseContext()));
        }

    }*/
   ImageView[] noktalar=new ImageView[30];

    public void zamanGostergesi(){
        for (int i=0;i<30;i++){
            top=new ImageView(Yarisma.this);
            top.setBackgroundResource(R.drawable.nokta);
            noktalar[i]=top;

            gosterge2.addView(top);
        }

    }
CountDownTimer dtm;
    int sira;
    public void pasifTop(){
         sira=29;
        dtm = new CountDownTimer(45000, 1500) {
            @Override
            public void onTick(long millisUntilFinished) {
                noktalar[29-sira].setImageResource(R.drawable.nokta2);
                sira--;
            }

            @Override
            public void onFinish() {

            }
        };
        dtm.start();




    }
}
