package com.euromech.a02_calculadora;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResultados;
    private TextView textViewOperacion;
    private TextView textViewAnterior;
    private View boton0;
    private View boton1;
    private View boton2;
    private View boton3;
    private View boton4;
    private View boton5;
    private View boton6;
    private View boton7;
    private View boton8;
    private View boton9;
    private View botonPunto;
    private View botonMas;
    private View botonMenos;
    private View botonMultiplicar;
    private View botonDividir;
    private View botonIgual;
    private View botonDelete;
    private View botonCE;

    private String operacion;
    private float operando1;
    private float operando2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ASI SE CREAN LOS ELEMENTOS PARA LUEGO ACCEDER A ELLOS
        textViewResultados = (TextView) findViewById(R.id.textViewResultados);
        textViewOperacion = (TextView) findViewById(R.id.textViewOperacion);
        textViewAnterior = (TextView) findViewById(R.id.textViewAnterior);
        boton0 = findViewById(R.id.button0);
        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        boton3 = findViewById(R.id.button3);
        boton4 = findViewById(R.id.button4);
        boton5 = findViewById(R.id.button5);
        boton6 = findViewById(R.id.button6);
        boton7 = findViewById(R.id.button7);
        boton8 = findViewById(R.id.button8);
        boton9 = findViewById(R.id.button9);
        botonPunto = findViewById(R.id.buttonPunto);
        botonMas = findViewById(R.id.buttonMas);
        botonMenos = findViewById(R.id.buttonMenos);
        botonMultiplicar = findViewById(R.id.buttonMultiplicar);
        botonDividir = findViewById(R.id.buttonDividir);
        botonIgual = findViewById(R.id.buttonIgual);
        botonDividir = findViewById(R.id.buttonDividir);
        botonIgual = findViewById(R.id.buttonIgual);
        botonDelete = findViewById(R.id.buttonC);
        botonCE = findViewById(R.id.buttonCE);

        textViewResultados.setText("");
        textViewResultados.setText("");

        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "0");
            }
        });
        /*
        LO DE ARRIBA SE PODRIA HABER ECHO CREANDO UNA FUNCION EXTERNA Y LLAMANDOLA COMO SIGUE:
        boton0.setOnClickListener(new ponResultado(textViewResultados));

        public class ponResultado implements View.OnClickListener {
            private TextView textViewResultados;
            public ponRasultado (TextView textViewResultados) {
                this.textViewResultados = textViewResultados;
            }
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "0");
            }
        };
         */

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "1");
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "2");
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "3");
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "4");
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "5");
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "6");
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "7");
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "8");
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + "9");
            }
        });

        botonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText(textViewResultados.getText() + ".");
            }
        });

        botonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultados.setText("");
                textViewAnterior.setText("");
                operando1 = operando2 = 0f;
            }
        });

        botonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textViewResultados.getText().length()!=0){
                    textViewResultados.setText(textViewResultados.getText().subSequence(0, textViewResultados.getText().length()-1));
                }
                else {
                    operando1 = operando2 = 0f;
                }
            }
        });

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "Sumar";
                textViewOperacion.setText("Oper: Sumar");
                if (operando1 != 0f) {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando2 = Float.valueOf(valor);
                    Float resultado = operando1 + operando2;
                    textViewResultados.setText(String.valueOf(resultado));
                }
                else {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando1 = Float.valueOf(valor);
                    textViewAnterior.setText(textViewResultados.getText());
                    textViewResultados.setText("");
                }
            }
        });

        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "Restar";
                textViewOperacion.setText("Oper: Restar");
                if (operando1 != 0f) {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando2 = Float.valueOf(valor);
                    Float resultado = operando1 - operando2;
                    textViewResultados.setText(String.valueOf(resultado));
                }
                else {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando1 = Float.valueOf(valor);
                    textViewAnterior.setText(textViewResultados.getText());
                    textViewResultados.setText("");
                }
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "Multiplicar";
                textViewOperacion.setText("Oper: Multiplicar");
                if (operando1 != 0f) {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando2 = Float.valueOf(valor);
                    Float resultado = operando1 * operando2;
                    textViewResultados.setText(String.valueOf(resultado));
                }
                else {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando1 = Float.valueOf(valor);
                    textViewAnterior.setText(textViewResultados.getText());
                    textViewResultados.setText("");
                }
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "Dividir";
                textViewOperacion.setText("Oper: Dividir");
                if (operando1 != 0f) {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando2 = Float.valueOf(valor);
                    Float resultado = operando1 / operando2;
                    textViewResultados.setText(String.valueOf(resultado));
                }
                else {
                    String valor = String.valueOf(textViewResultados.getText());
                    operando1 = Float.valueOf(valor);
                    textViewAnterior.setText(textViewResultados.getText());
                    textViewResultados.setText("");
                }
            }
        });

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewAnterior.setText(textViewResultados.getText());
                switch (operacion) {
                    case "Sumar":
                        if (operando1 != 0f) {
                            String valor = String.valueOf(textViewResultados.getText());
                            operando2 = Float.valueOf(valor);
                            Float resultado = operando1 + operando2;
                            textViewResultados.setText(String.valueOf(resultado));
                        }
                        break;
                    case "Restar":
                        if (operando1 != 0f) {
                            String valor = String.valueOf(textViewResultados.getText());
                            operando2 = Float.valueOf(valor);
                            Float resultado = operando1 - operando2;
                            textViewResultados.setText(String.valueOf(resultado));
                        }
                        break;
                    case "Multiplicar":
                        if (operando1 != 0f) {
                            String valor = String.valueOf(textViewResultados.getText());
                            operando2 = Float.valueOf(valor);
                            Float resultado = operando1 * operando2;
                            textViewResultados.setText(String.valueOf(resultado));
                        }
                        break;
                    case "Dividir":
                        if (operando1 != 0f) {
                            String valor = String.valueOf(textViewResultados.getText());
                            operando2 = Float.valueOf(valor);
                            Float resultado = operando1 / operando2;
                            textViewResultados.setText(String.valueOf(resultado));
                        }
                        break;
                    default:
                        break;
                }
                operacion = "";
            }
        });

    }
}
