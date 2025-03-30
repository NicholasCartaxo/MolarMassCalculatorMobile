package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button button;
    EditText inputa;

    double end;
    static String input;
    static String text;

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = findViewById(R.id.result);
        Button button = findViewById(R.id.button);
        EditText inputa = findViewById(R.id.input_a);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        adView = findViewById(R.id.home_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = inputa.getText().toString();
                text = input;
                end = translate(input);
                String str = "A massa do " + text + " é " + end + " g/mol";

                if(end == -1){
                    result.setText("Equação inválida, tente novamente");
                }else {

                    result.setText(str);
                }

            }
        });




    }



    public static double translate(String input) {

        input = input.replace(" ", "");

        input = input.replace("He","4.0026*");
        input = input.replace("Li","+6.941*");
        input = input.replace("Be","+9.0122*");
        input = input.replace("Ne","+20.1797*");
        input = input.replace("Na","+22.9897*");
        input = input.replace("Mg","+24.305*");
        input = input.replace("Al","+26.9815*");
        input = input.replace("Si","+28.0855*");
        input = input.replace("Cl","+35.453*");
        input = input.replace("Ar","+39.948*");
        input = input.replace("Ca","+40.078*");
        input = input.replace("Sc","+44.9559*");
        input = input.replace("Ti","+47.867*");
        input = input.replace("Cr","+51.9961*");
        input = input.replace("Mn","+54.938*");
        input = input.replace("Fe","+55.845*");
        input = input.replace("Ni","+58.6934*");
        input = input.replace("Co","+58.9332*");
        input = input.replace("Cu","+63.546*");
        input = input.replace("Zn","+65.39*");
        input = input.replace("Ga","+69.723*");
        input = input.replace("Ge","+72.64*");
        input = input.replace("As","+74.9216*");
        input = input.replace("Se","+78.96*");
        input = input.replace("Br","+79.904*");
        input = input.replace("Kr","+83.8*");
        input = input.replace("Rb","+85.4678*");
        input = input.replace("Sr","+87.62*");
        input = input.replace("Zr","+91.224*");
        input = input.replace("Nb","+92.9064*");
        input = input.replace("Mo","+95.94*");
        input = input.replace("Tc","+98*");
        input = input.replace("Ru","+101.07*");
        input = input.replace("Rh","+102.9055*");
        input = input.replace("Pd","+106.42*");
        input = input.replace("Ag","+107.8682*");
        input = input.replace("Cd","+112.411*");
        input = input.replace("In","+114.818*");
        input = input.replace("Sn","+118.71*");
        input = input.replace("Sb","+121.76*");
        input = input.replace("Te","+127.6*");
        input = input.replace("Xe","+131.293*");
        input = input.replace("Cs","+132.9055*");
        input = input.replace("Ba","+137.327*");
        input = input.replace("La","+138.9055*");
        input = input.replace("Ce","+140.116*");
        input = input.replace("Pr","+140.9077*");
        input = input.replace("Nd","+144.24*");
        input = input.replace("Pm","+145*");
        input = input.replace("Sm","+150.36*");
        input = input.replace("Eu","+151.964*");
        input = input.replace("Gd","+157.25*");
        input = input.replace("Tb","+158.9253*");
        input = input.replace("Dy","+162.5*");
        input = input.replace("Ho","+164.9303*");
        input = input.replace("Er","+167.259*");
        input = input.replace("Tm","+168.9342*");
        input = input.replace("Yb","+173.04*");
        input = input.replace("Lu","+174.967*");
        input = input.replace("Hf","+178.49*");
        input = input.replace("Ta","+180.9479*");
        input = input.replace("Re","+186.207*");
        input = input.replace("Os","+190.23*");
        input = input.replace("Ir","+192.217*");
        input = input.replace("Pt","+195.078*");
        input = input.replace("Au","+196.9665*");
        input = input.replace("Hg","+200.59*");
        input = input.replace("Tl","+204.3833*");
        input = input.replace("Pb","+207.2*");
        input = input.replace("Bi","+208.9804*");
        input = input.replace("Po","+209*");
        input = input.replace("At","+210*");
        input = input.replace("Rn","+222*");
        input = input.replace("Fr","+223*");
        input = input.replace("Ra","+226*");
        input = input.replace("Ac","+227*");
        input = input.replace("Pa","+231.0359*");
        input = input.replace("Th","+232.0381*");
        input = input.replace("Np","+237*");
        input = input.replace("Am","+243*");
        input = input.replace("Pu","+244*");
        input = input.replace("Cm","+247*");
        input = input.replace("Bk","+247*");
        input = input.replace("Cf","+251*");
        input = input.replace("Es","+252*");
        input = input.replace("Fm","+257*");
        input = input.replace("Md","+258*");
        input = input.replace("No","+259*");
        input = input.replace("Rf","+261*");
        input = input.replace("Lr","+262*");
        input = input.replace("Db","+262*");
        input = input.replace("Bh","+264*");
        input = input.replace("Sg","+266*");
        input = input.replace("Mt","+268*");
        input = input.replace("Rg","+272*");
        input = input.replace("Hs","+277*");
        input = input.replace("H","+1.0079*");
        input = input.replace("B","+10.811*");
        input = input.replace("C","+12.0107*");
        input = input.replace("N","+14.0067*");
        input = input.replace("O","+15.9994*");
        input = input.replace("F","+18.9984*");
        input = input.replace("P","+30.9738*");
        input = input.replace("S","+32.065*");
        input = input.replace("K","+39.0983*");
        input = input.replace("V","+50.9415*");
        input = input.replace("Y","+88.9059*");
        input = input.replace("I","+126.9045*");
        input = input.replace("W","+183.84*");
        input = input.replace("U","+238.0289*");

        input = input.replace("*+","+");
        input = input.replace("(","+(");
        input = input.replace(")",")*");

        input = input + "ß";
        input = input.replace("*ß", "");
        input = input.replace("ß", "");

        String input_f = input;

        Pattern pattern = Pattern.compile("[^0-9()*+.]");
        Matcher match = pattern.matcher(input_f);
        boolean val = match.find();
        if (val == true) {
            return -1;
        }
        else {
            double end = eval(input);
            return end;
        }




    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation


                return x;
            }
        }.parse();
    }


}