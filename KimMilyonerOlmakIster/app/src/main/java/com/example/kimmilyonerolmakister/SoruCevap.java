package com.example.kimmilyonerolmakister;

import java.util.ArrayList;
import java.util.Random;

public class SoruCevap {
    ArrayList<Integer> t=new ArrayList<Integer>();
    public void dizi(){
        karisik y=new karisik();
        t=y.karistir();
    }
    int gonder,gonder2,gonder3;
    public  String Soru(int s1) {
        String soru[] = {
                "Yunan mitolojisinde Eros ok atarak insanların birbirlerine hangisini hissetmesini sağlar ?"
                , "Kumaşın kenarına tığ ile işlenen, eski evlerde sıkça görülen, giysi ve örtülerde kullanılan örgüye ne ad verilie ?"
                , "Bir insanın hastalığı ne olusa olsun, iyi gelmesi için klişe olarak hangisi pişirilir ?"
                , "Dedesiyle dağda yaşayan, arkadaşı peter ile mutlu günler geçiren, daha sonra yayınlanan kitapta Peter ile evlenen çizgi film karakteri kimdir ?"
                , "Eski bir Türk masalına adını veren gülen ayva ile ağlayan meyve hangisidir?"
                , "Geçtiğimiz günlerde vizyona giren Peter Jackson'ın yönettiği 'The Hobbit' serisinin son filminin adı nedir?"
                , "Kurtuluş savaşında cephede Mustafa Kemal'in yanında onbaşı rütbesiyle görev alan, 'Mor Salkımlı Ev' romanının yazarı kimdir?"
                , "Güneşte veya hafif alevde kurutulmuş ete ne denir ?"
                , "Medeni Kanunumuza göre vasiyetname hazırlayabilmek için kaç yaşını doldurmak gerekmektedir?"
                , "Düdük futbol maçlarında kullanılmadan önce hakemler hangisini kullanırlardı?"
                , "Çilek, Muz, Portakal gibi meyvelerle yapılan, pastaların üstüne konarak damakta güzel bir tad bırakan şeffaf tatlı hangisidir?"
                , "Tavla karşılaşmaları genellikle kaçta biter?"
                , "İnsanlarla yaşamaya karar verip kendi kendilerini evcilleştiren hayvan hangisidir?"
                , "Konusu nedeniyle bir ülkenin yapımcı firmayı tehdit etmesiyle büyük tartışma yaratan 'The İnterview' filmi, kime yapılan suikast planını konu almaktadır?"
                , "Bir şeyin en fazla olabilecek miktarı hangi sözle ifade edilir?"
                , "İnsanlar hangisini anlatırken klişe olarak 'Biliyorsan anlatmayayım' derler?"
                ,"Bir işin uygun ve kolay olduğunu belirtmek için ne kullanılır?"
                ,"Atasözüne göre 'gönülden de ırak olan' kimdir?"
                ,"Hangisi, bazı futbol takımlarının, taraftarları için kullandıkları bir ifadedir?"
                ,"'Horozu çok olan köyde' şeklinde başlayan atasözünün devamı nasıldır?"
                ,"Sosyal medyada , kısa sürede ve kolayca takipçi kazanmak istiyenlerin uyguladığı klişe taktik hangisidir?"
                ,"'Gıpgıcır' ne anlama gelir?"
                ,"Trafikte hangi araçların arkasına 'Dolu' yada 'Boş' yazar?"
                ,"Çubuklara geçirilmiş küçük bayraklarla işaretlenmiş bir parkurda, belli kurallara göre ve zikzaklar çizerek yapılan kayak yarışı hangisidir?"
                ,"Gövde sarı veya kirli sarı; yelesi kuyruğu ve bacağının alt kısmındaki kılları koyu renkte olan atlar için kullanılan ifade hangisidir?"
                ,"'Uyuyamadım' anlamındaki söz hangisidir?"
                ,"'3 korner 1 penaltı', 'gol atan kaleye' ve 'atan alır' kuralları varsa, oynadığınız futbol maçı muhtemelen hangisine dahildir?"
                ,"Hangi meyvenin 'Vaşington' adıyla satılan bir çeşidi vardır?"
                ,"Sıvıları taşımaya yarayan dar ağızlı, şişkin karınlı, genellikle hasır veya plastik sepet içinde korunan büyük şişeye ne ad verilir?"
                ,"Klasik bir çengel bulmacada, bir kutucukta en fazla kaç farklı soru sorulur?"
                ,"Bilim insanları hangisine çıplak gözle direkt bakmamamızı tavsiye ederler?"
                ,"Biri tanıtılırken hangisi söylenirse ̋bu kişi benim gelecekte evleneceğim kiş̋ denmiş olur?"
                ,"̋Bundan sonra herhangi bir sıkıntıyla karşılaşma ihtimali yok̋ anlamındaki atasözü hangisidir?"
                ,"Kapuska, mücver ve karnıyarık yapmak için, pazardan ana malzeme olarak sırasıyla hangi üçünü almak gerekir?"
                ,"̋İki dirhem bir çekirdek̋ ifadesi kimler kullanılır?"
                ,"Genellikle güneşten korunmak için bir yerin üzerine gerilen, bez veya naylondan yapılmış örtüye ne ad verilir?"
                ,"̋Bezekçi̋ hangisinin adıdır?"
                ,"Patates cipsi paketleri, içinde cipslerin taze kalması için genellikle hangi gazla doldurulur?"
                ,"Halk arasında özellikle hangi yağmurun bereket getirdiğine inanılır? "
                ,"Hangisi, internetten video izlerken en sık görülen ̋görüntü modlarından̋ biri değildir?"
                ,"Karşınızdaki hangi ifadeyi kullanırsa el yazınız çarpık ve düzensiz olduğunu düşünüyor demektir?"
                ,"Çekirdeği çıkartılıp içerisine kırmızı biber parçaları koyulan yiyecek hangisidir?"
                ,"Futbolcuların önde götürdükleri maçın son dakikalarında maçı gol yemeden bitirmek amaçlı oynadıkları oyun nasıl ifade edilir?"
                ,"̋Nabi̋,̋Nefi̋ ve ̋Nedim̋ hangi sanat dalında verdikleri eserlerle tanınan kişilerdir?"
                ,"Değişen koşullara uymak için toplumsal, kültürel ve yönetimsel ortamlarda yeni yöntemlerin kullanılmaya başlanılmasını ifade eden kelime hangisidir?"

        };

         gonder=t.get(s1);

        return soru[gonder];
    }
    public String dCevap(int s2) {
        String dogruCevap[] = {"Aşk", "Dantel", "Çorba", "Heidi", "Nar", "Beş Ordunun Şavaşı", "Halide Edip Adıvar", "Kadit", "15", "Beyaz Mendil",
                "Jöle", "5", "Kedi", "Kim Jong-un", "Taş çatlasa", "Fıkra","Dişime göre","Gözden ırak olan","12.adam","Sabah geç olur"
                ,"Takibe takip","Yepyeni","Akaryakıt tankeri","Salon","Kula","Uyku tutmadı","Mahalle maçı","Portakal","Damacana","2"
                ,"Güneşe","Müstakbel eşim","Karada ölüm yok","Lahana,kabak,ıspanak","Güzel ve özenli giyinenler","Tente","Nakkaş"
                ,"Azot","Nisan yağmuru","640p","Kargacık burgacık","Yeşil zeytin","Zamana oynamak","Şiir","İnovasyon"
        };
        gonder2=t.get(s2);
        return dogruCevap[gonder2];
    }
    public String yCevap(int s3,int s4){
        String digerCevap[][]={
                {"Şefkat","Güven","Sabır"},
                {"Fisto","Kanaviçe","Kurdele"},
                {"Mantı","Melemen","Muhallebi"},
                {"Alice","Pollyanna","Candy"},
                {"Elma","Dut","Üzüm"},
                {"Beklenmedik Yolculuk","Smaug'un Çorak Toprakları","Kralın Dönüşü"},
                {"Yakup Kadri Karaosmanoğlu","Reşat Nuri Güntekin","Nezihe Meriç"},
                {"Dumur","Fodul","Tirit"},
                {"18","21","25"},
                {"Şapka","Gong","Çan"},
                {"Tart","Milföy","Kup"},
                {"3","7","10"},
                {"Köpek","Geyik","Fil"},
                {"Papa Francis","Vladimir Putin","Fidel Castro"},
                {"Yer yarılsa","İğne düşse","Top patlasa"},
                {"Askerlik anısı","Masal","Dedikodu"},
                {"Burnuma göre","Kaşıma göre","Bıyığıma göre"},
                {"Arabası tamircide olan","Evi uzakta olan","İş yeri yakında olan"},
                {"Yardımcı eleman","Canlı destek","Yedek kuvvet"},
                {"Sabah erken olur","Akşam geç olur","Akşam erken olur"},
                {"Atara atar gidere gider","Omuza omuz","Göze göz dişe diş"},
                {"Tozpembe","Sapsarı","Çok eski"},
                {"Öğrenci servisi","Harfiyat kamyonu","Yolcu otobüsü"},
                {"Skeleton","Pentatlon","Maraton"},
                {"Doru","Yağız","Seki"},
                {"Uyku atmadı","Uyku kalmadı","Uyku yatmadı"},
                {"FIFA Dünya Kupası","UEFA Şampiyonlar Ligi","Bundesliga"},
                {"Nar","Elma","Ananas"},
                {"Bidon","Varil","Fıçı"},
                {"1","3","4"},
                {"Motorsiklet sürücülerine","Mağaza indirim yazılarına","Trafik ışıklarına"},
                {"Müstakil evim","Müteşebbis ortağım","Mükellef sofram"},
                {"Okyanusta ölüm yok","Magmada ölüm yok","Stratosferde ölüm yok"},
                {"Domates,biber,salatalık","Marul,pırasa,ıspanak","Patates,soğan,pancar"},
                {"Az ve seyrek yiyenler","Boylu ve kilolu olanlar","Güçlü ve kaslı olanlar"},
                {"Marley","Lambri","Laminant"},
                {"Hattat","Sarraf","Hallaç"},
                {"Oksijen","Hidrojen","Helyum"},
                {"Şubat yağmuru","Haziran yağmuru","Ağustos yağmuru"},
                {"360p","480p","720p"},
                {"Küçücük","fıçıcık","Derecik tepecik","Ufacık tefecik"},
                {"Hurma","Limon","Domates"},
                {"Hakeme oynamak","Kaleye oynamak","Taraftara oynamak"},
                {"Resim","Minyatür","Müzik"},
                {"Revizyon","Otomasyon","Aplikasyon"}
        };
       gonder3=t.get(s3);
     return digerCevap[gonder3][s4];
    }

}

