package de.funpiloten.gcloesungen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends Activity {

    private String Loesung = "Panzersperre Insheim\n" +
            "    NACHDEM WIR DIE ERSTEN VIER CACHES GEFUNDEN HATTEN WAREN WIR\n" +
            "    FEUER UND FLAMME ES KAMEN NEUN WEITERE HINZU DA WIR SELBST\n" +
            "    NOCH NULL VERSTECKT HABEN HABEN WIR NUN DAMIT ANGEFANGEN\n" +
            "\n" +
            "    SO KAMEN WIR AUF DIE IDEE MIT DEM RAETSEL NEUN FREUNDE HABEN\n" +
            "    ES GEGEN GELESEN UND DREI HABEN ES HERAUSGEFUNDEN DIE ANDEREN\n" +
            "    HATTEN NULL AHNUNG\n" +
            "\n" +
            "    WIR HOFFEN DASS WENIGSTENS FUENF WEITERE DEN CACHE FINDEN\n" +
            "    WERDEN\n" +
            "\n" +
            "    BEIM VERSTECKEN KAMEN WIR AN NULL^ WEINEN UND AUCH NULL\n" +
            "    PFERDEN VORBEI DA FUER SAHEN WIR ACHT KUEHE IMMER HIN\n" +
            "\n" +
            "    BEI BAUM NUMMER NULL-ACHT HABEN WIR UEBERLEGT DEN CACHE ZU\n" +
            "    VERSTECKEN SIND DANN ABER DECH WEITER GELAUFEN\n" +
            "\n" +
            "    DAS LOGBUCH HAT ACHT SEITEN UND WIR HABEN SIEBEN MINUS SECHS\n" +
            "    STIFTE DA ZU GELEGT\n" +
            "\n" +
            "    Station1:\n" +
            "    49°09.305\n" +
            "    8°08.876\n" +
            "    Suche Telefonnummer: 0800/0837111 Z = 111\n" +
            "    49°09.305-111-14\n" +
            "    8°08.876-111-133\n" +
            "    Final:\n" +
            "    49°09.180\n" +
            "    8°08.632";
    private String s2 =
                    "14,1,3,8,4,5,13 23,9,18 4,9,5 5,18,19,20,5,14 22,9,5,18 3,1,3,8,5,19 7,5,6,21,14,4,5,14 8,1,20,20,5,14 23,1,18,5,14 23,9,18 " +
                    "6,5,21,5,18 21,14,4 6,12,1,13,13,5 5,19 11,1,13,5,14 14,5,21,14 23,5,9,20,5,18,5 8,9,14,26,21, 4,1 23,9,18 19,5,12,2,19,20 " +
                    "14,15,3,8 14,21,12,12 22,5,18,19,20,5,3,11,20 8,1,2,5,14 8,1,2,5,14 23,9,18 14,21,14 4,1,13,9,20 1,14,7,5,6,1,14,7,5,14," +

                    "19,15 11,1,13,5,14 23,9,18 1,21,6 4,9,5 9,4,5 5 13,9,20 4,5,13 18,1,5,20,19,5,12, 14,5,21,14 6,18,5,21,14,4,5 8,1,2,5,14 " +
                    "5,19 7,5,7,5,14,7,5,12,5,19,5,14 21,14,4 4,18,5,9 8,1,2,5,14 5,19 8,5,18,1,21,19,7,5,6,21,14,4,5,14, 4,9,5 1,14,4,5,18,5,14 " +
                    "8,1,20,20,5,14 14,21,12,12 1,8,14,21,14,7," +

                    "23,9,18 8,15,6,6,5,14 4,1,19,19 23,5,14,9,7,19,20,5,14,19 6,21,5,14,6 23,5,9,20,5,18,5 4,5,14 3,1,3,8,5 6,9,14,4,5,14 " +
                    "23,5,18,4,5,14," +

                    "2,5,9,13 22,5,18,19,20,5,3,11,5,14 11,1,13,5,14 23,9,18 1,14 14,21,12,12 30,23,5,9,14,5,14 21,14,4 1,21,3,8 14,21,12,12 " +
                    "16,6,5,18,4,5,14 22,15,18,2,5,9 4,1,6,21,5,18 19,1,8,5,14 23,9,18 1,3,8,20 11,21,5,8,5 9,13,13,5,18,8,9,14," +

                    "2,5,9 2,1,21,13 14,21,13,13,5,18 14,21,12,12-1,3,8,20 8,1,2,5,14 23,9,18 21,5,2,5,18,12,5,7,20 4,5,14 3,1,3,8,5 26,21 " +
                    "22,5,18,19,20,5,3,11,5,14 19,9,14,4 4,1,14,14 1,2,5,18 4,5,3,8 23,5,9,20,5,18,7,5,12,1,21,6,5,14," +

                    "4,1,19 12,15,7,2,21,3,8 8,1,20 1,3,8,20 19,5,9,20,5,14 21,14,4 23,9,18 8,1,2,5,14 19,9,5,2,5,14 13,9,14,21,19 19,5,3,8,19 " +
                    "19,20,9,6,20,5 4,1,26,21,7,5,12,5,7,20";
    /*
    Panzersperre Insheim
    NACHDEM WIR DIE ERSTEN VIER CACHES GEFUNDEN HATTEN WAREN WIR
    FEUER UND FLAMME ES KAMEN NEUN WEITERE HINZU DA WIR SELBST
    NOCH NULL VERSTECKT HABEN HABEN WIR NUN DAMIT ANGEFANGEN

    SO KAMEN WIR AUF DIE IDEE MIT DEM RAETSEL NEUN FREUNDE HABEN
    ES GEGEN GELESEN UND DREI HABEN ES HERAUSGEFUNDEN DIE ANDEREN
    HATTEN NULL AHNUNG

    WIR HOFFEN DASS WENIGSTENS FUENF WEITERE DEN CACHE FINDEN
    WERDEN

    BEIM VERSTECKEN KAMEN WIR AN NULL^ WEINEN UND AUCH NULL
    PFERDEN VORBEI DA FUER SAHEN WIR ACHT KUEHE IMMER HIN

    BEI BAUM NUMMER NULL-ACHT HABEN WIR UEBERLEGT DEN CACHE ZU
    VERSTECKEN SIND DANN ABER DECH WEITER GELAUFEN

    DAS LOGBUCH HAT ACHT SEITEN UND WIR HABEN SIEBEN MINUS SECHS
    STIFTE DA ZU GELEGT

    Station1:
    49°09.305
    8°08.876
    Suche Telefonnummer: 0800/0837111 Z = 111
    49°09.305-111-14
    8°08.876-111-133
    Final:
    49°09.180
    8°08.632

     */
    private String S1 = "14,1,3,8,4,5,13,23,9,18,4,9,5,5,18,19,20,5,14,22,9,5,18,3,1,3,8,5,19,7,5,6,21,14,4,5,14,8,1," +
             "20,20,5,14,23,1,18,5,14,23,9,18,6,5,21,5,18,21,14,4,6,12,1,13,13,5,5,19,11,1,13,5,14,14,5,21,14,23,5,9,20,5,18,5,8,9,14,26,21" +
             ",4,1,23,9,18,19,5,12,2,19,20,14,15,3,8,14,21,12,12,22,5,18,19,20,5,3,11,20,8,1,2,5,14,8,1,2,5,14,23,9,18,14,21,14,4,1,13,9,20," +
             "1,14,7,5,6,1,14,7,5,14,19,15,11,1,13,5,14,23,9,18,1,21,6,4,9,5,9,4,5,5,13,9,20,4,5,13,18,1,5,20,19,5,12,14,5,21,14,6,18,5,21,14," +
             "4,5,8,1,2,5,14,5,19,7,5,7,5,14,7,5,12,5,19,5,14,21,14,4,4,18,5,9,8,1,2,5,14,5,19,8,5,18,1,21,19,7,5,6,21,14,4,5,14,4,9,5,1,14,4," +
             "5,18,5,14,8,1,20,20,5,14,14,21,12,12,1,8,14,21,14,7,23,9,18,8,15,6,6,5,14,4,1,19,19,23,5,14,9,7,19,20,5,14,19,6,21,5,14,6,23,5,9," +
             "20,5,18,5,4,5,14,3,1,3,8,5,6,9,14,4,5,14,23,5,18,4,5,14,2,5,9,13,22,5,18,19,20,5,3,11,5,14,11,1,13,5,14,23,9,18,1,14,14,21,12,12," +
             "29,23,5,9,14,5,14,21,14,4,1,21,3,8,14,21,12,12,16,6,5,18,4,5,14,22,15,18,2,5,9,4,1,6,21,5,18,19,1,8,5,14,23,9,18,1,3,8,20,11,21,5," +
             "8,5,9,13,13,5,18,8,9,14,2,5,9,2,1,21,13,14,21,13,13,5,18,14,21,12,12,1,3,8,20,8,1,2,5,14,23,9,18,21,5,2,5,18,12,5,7,20,4,5,14,3,1," +
             "3,8,5,26,21,22,5,18,19,20,5,3,11,5,14,19,9,14,4,4,1,14,14,1,2,5,18,4,5,3,8,23,5,9,20,5,18,7,5,12,1,21,6,5,14,4,1,19,12,15,7,2,21," +
             "3,8,8,1,20,1,3,8,20,19,5,9,20,5,14,21,14,4,23,9,18,8,1,2,5,14,19,9,5,2,5,14,13,9,14,21,19,19,5,3,8,19,19,20,9,6,20,5,4,1,26,21,7,5,12,5,7,20";


    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tvTitel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Pattern p  = Pattern.compile(",");
        String[] array = p.split(S1);
        String text = "";
        for(String x : array) {
            text += ((char) (0x40 + Integer.parseInt(x)));

        }
        Log.e("Ergebnis:", text);
        tv.setText(Loesung);
    }
}



